package br.ufsc.inf.ine5426.caneca;

import br.ufsc.inf.ine5426.caneca.antlr.CanecaArvore;
import br.ufsc.inf.ine5426.caneca.antlr.CanecaLexico;
import br.ufsc.inf.ine5426.caneca.antlr.CanecaSemanticoDefinicao;
import br.ufsc.inf.ine5426.caneca.antlr.CanecaSemanticoResolucao;
import br.ufsc.inf.ine5426.caneca.antlr.CanecaSintatico;

import br.ufsc.inf.ine5426.caneca.interno.Escopo;
import br.ufsc.inf.ine5426.caneca.interno.TabelaDeSimbolos;

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
	
	public void analisar() throws IOException, RecognitionException {
		Queue<Escopo> filaDeEscopos = new LinkedList<Escopo>();
		TabelaDeSimbolos tabelaDeSimbolos = new TabelaDeSimbolos();
		tabelaDeSimbolos.abrir(null);
		filaDeEscopos.add(tabelaDeSimbolos);
		
		CharStream fluxoDeCaracteres = new ANTLRFileStream(nomeDoArquivoComCodigo);
		CanecaLexico analisadorLexico = new CanecaLexico(fluxoDeCaracteres);
		analisadorLexico.esconderErros();
		
		TokenStream fluxoDeSimbolos = new CommonTokenStream(analisadorLexico);
		CanecaSintatico analisadorSintatico = new CanecaSintatico(fluxoDeSimbolos);
		analisadorSintatico.esconderErros();
		RuleReturnScope programa = analisadorSintatico.programa();
		CommonTree arvoreSintatica = (CommonTree) programa.getTree();
		
		CommonTreeNodeStream fluxoDeNodos = new CommonTreeNodeStream(arvoreSintatica);
		CanecaArvore analisadorArvore = new CanecaArvore(fluxoDeNodos);
		fluxoDeNodos.setTokenStream(fluxoDeSimbolos);
		RuleReturnScope programaReescrito = analisadorArvore.programa();
		CommonTree arvoreSintaticaReescrita = (CommonTree) programaReescrito.getTree();
		
		CanecaSemanticoDefinicao analisadorSemanticoDefinicao = new CanecaSemanticoDefinicao(fluxoDeNodos);
		analisadorSemanticoDefinicao.fixarTabelaDeSimbolos(tabelaDeSimbolos);
		analisadorSemanticoDefinicao.fixarFilaDeEscopos(filaDeEscopos);
		analisadorSemanticoDefinicao.downup(arvoreSintaticaReescrita);
		tabelaDeSimbolos.fechar();
		fluxoDeNodos.reset();
		
		System.out.println("--------------");
		
		CanecaSemanticoResolucao analisadorSemanticoResolucao = new CanecaSemanticoResolucao(fluxoDeNodos);
		analisadorSemanticoResolucao.fixarFilaDeEscopos(filaDeEscopos);
		analisadorSemanticoResolucao.downup(arvoreSintaticaReescrita);
	}
}

