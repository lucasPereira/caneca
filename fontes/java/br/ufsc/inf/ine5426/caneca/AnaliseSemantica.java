package br.ufsc.inf.ine5426.caneca;

import br.ufsc.inf.ine5426.caneca.antlr.CanecaArvore;
import br.ufsc.inf.ine5426.caneca.antlr.CanecaLexico;
import br.ufsc.inf.ine5426.caneca.antlr.CanecaSemanticoExpressoes;
import br.ufsc.inf.ine5426.caneca.antlr.CanecaSemanticoDefinicao;
import br.ufsc.inf.ine5426.caneca.antlr.CanecaSemanticoResolucao;
import br.ufsc.inf.ine5426.caneca.antlr.CanecaSintatico;

import br.ufsc.inf.ine5426.caneca.interno.Classe;
import br.ufsc.inf.ine5426.caneca.interno.Escopo;
import br.ufsc.inf.ine5426.caneca.interno.Reporter;
import br.ufsc.inf.ine5426.caneca.interno.TabelaDeSimbolos;
import br.ufsc.inf.ine5426.caneca.interno.Tipo;

import java.io.IOException;

import java.util.LinkedList;
import java.util.Queue;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.RecognitionException;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class AnaliseSemantica {
	private String nomeDoArquivoComCodigo;
	
	public AnaliseSemantica(String nomeDoArquivoComCodigo) {
		this.nomeDoArquivoComCodigo = nomeDoArquivoComCodigo;
	}
	
	public void analisar() throws IOException {
		CommonTree arvoreSintaticaReescrita = null;
		CommonTreeNodeStream fluxoDeNodos = null;
		try {
			CharStream fluxoDeCaracteres = new ANTLRFileStream(nomeDoArquivoComCodigo);
			CanecaLexico analisadorLexico = new CanecaLexico(fluxoDeCaracteres);
			analisadorLexico.esconderErros();
			
			TokenStream fluxoDeSimbolos = new CommonTokenStream(analisadorLexico);
			CanecaSintatico analisadorSintatico = new CanecaSintatico(fluxoDeSimbolos);
			analisadorSintatico.esconderErros();
			RuleReturnScope programa = analisadorSintatico.programa();
			CommonTree arvoreSintatica = (CommonTree) programa.getTree();
		
			fluxoDeNodos = new CommonTreeNodeStream(arvoreSintatica);
			CanecaArvore analisadorArvore = new CanecaArvore(fluxoDeNodos);
			fluxoDeNodos.setTokenStream(fluxoDeSimbolos);
			RuleReturnScope programaReescrito = analisadorArvore.programa();
			arvoreSintaticaReescrita = (CommonTree) programaReescrito.getTree();
		} catch (RecognitionException excecao) {
			System.out.println("Existem erros léxicos e/ou sintáticos. Corrija os erros para prosseguir.");
		}
		
		System.out.println("--------------");
		System.out.println("Definição");
		System.out.println("--------------");
		
		Queue<Escopo> filaDeEscopos = new LinkedList<Escopo>();
		TabelaDeSimbolos tabelaDeSimbolos = new TabelaDeSimbolos();
		tabelaDeSimbolos.abrir(null);
		tabelaDeSimbolos.definirClasse(new Classe("Texto"));
		tabelaDeSimbolos.definirClasse(new Classe("Nada"));
		tabelaDeSimbolos.definirClasse(new Classe("Caractere"));
		tabelaDeSimbolos.definirClasse(new Classe("Inteiro"));
		tabelaDeSimbolos.definirClasse(new Classe("Real"));
		tabelaDeSimbolos.definirClasse(new Classe("Booleano"));
		filaDeEscopos.add(tabelaDeSimbolos);
		
		CanecaSemanticoDefinicao analisadorSemanticoDefinicao = new CanecaSemanticoDefinicao(fluxoDeNodos);
		analisadorSemanticoDefinicao.fixarTabelaDeSimbolos(tabelaDeSimbolos);
		analisadorSemanticoDefinicao.fixarFilaDeEscopos(filaDeEscopos);
		analisadorSemanticoDefinicao.downup(arvoreSintaticaReescrita);
		tabelaDeSimbolos.fechar();
		fluxoDeNodos.reset();
		
		System.out.println("--------------");
		System.out.println("Resolução");
		System.out.println("--------------");
		
		Queue<Escopo> filaDeEscoposExpressao = new LinkedList<Escopo>(filaDeEscopos);
		Queue<Escopo> filaDeReferencias = new LinkedList<Escopo>();
		
		CanecaSemanticoResolucao analisadorSemanticoResolucao = new CanecaSemanticoResolucao(fluxoDeNodos);
		analisadorSemanticoResolucao.fixarFilaDeEscopos(filaDeEscopos);
		analisadorSemanticoResolucao.fixarFilaDeReferencias(filaDeReferencias);
		analisadorSemanticoResolucao.downup(arvoreSintaticaReescrita);
		
		System.out.println("--------------");
		System.out.println("Expressões");
		System.out.println("--------------");
		
		Queue<Tipo> filaDeExpressoes = new LinkedList<Tipo>();
		
		if (Reporter.fornecerInstancia().possuiErroDeDeifinicaoResolucao()) {
			System.out.println("Existem erros semânticos de definição e/ou resolução. Corrija os erros para prosseguir.");
		} else {
			CanecaSemanticoExpressoes analisadorSemanticoExpressao = new CanecaSemanticoExpressoes(fluxoDeNodos);
			analisadorSemanticoExpressao.fixarFilaDeEscopos(filaDeEscoposExpressao);
			analisadorSemanticoExpressao.fixarFilaDeReferencias(filaDeReferencias);
			analisadorSemanticoExpressao.fixarFilaDeExpressoes(filaDeExpressoes);
			analisadorSemanticoExpressao.downup(arvoreSintaticaReescrita);
			
			System.out.println("--------------");
			System.out.println("Chamadas");
			System.out.println("--------------");
			
			Queue<Escopo> filaDeEscoposChamada = new LinkedList<Escopo>(filaDeEscoposExpressao);
			Queue<Escopo> filaDeReferenciasChamada = new LinkedList<Escopo>(filaDeReferencias);
			
			if (Reporter.fornecerInstancia().possuiErroDeExpressao()) {
				System.out.println("Existem erros semânticos de expressão. Corrija os erros para prosseguir.");
			} else {
				System.out.println("Análise semântica realizada com sucesso.");
				/*
				CanecaSemanticoChamada analisadorSemanticoChamada = new CanecaSemanticoChamada(fluxoDeNodos);
				analisadorSemanticoChamada.fixarFilaDeEscopos(filaDeEscoposChamada);
				analisadorSemanticoChamada.fixarFilaDeReferencias(filaDeReferenciasChamada);
				analisadorSemanticoChamada.fixarFilaDeExpressoes(filaDeExpressoes);
				analisadorSemanticoChamada.downup(arvoreSintaticaReescrita);
				*/
			}
		}
	}
}

