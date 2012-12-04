package br.ufsc.inf.ine5426.caneca.interno;

import java.util.ArrayList;
import java.util.List;

public class Reporter {
	public static Reporter INSTANCIA;
	private List<String> mensagensDeErros;
	private List<Escopo> membrosDeErros;
	private List<String> mensagensDeSucessos;
	private List<Escopo> membrosDeSucessos;
	private List<String> mensagensDeErrosDeExpressao;
	private List<Tipo> tiposDeErrosDeExpressao;
	private List<String> mensagensDeSucessosDeExpressao;
	private List<Tipo> tiposDeSucessosDeExpressao;
	
	public static Reporter fornecerInstancia() {
		return (INSTANCIA == null) ? (INSTANCIA = new Reporter()) : INSTANCIA;
	}
	
	private Reporter() {
		mensagensDeErros = new ArrayList<String>();
		membrosDeErros = new ArrayList<Escopo>();
		mensagensDeSucessos = new ArrayList<String>();
		membrosDeSucessos = new ArrayList<Escopo>();
		mensagensDeErrosDeExpressao = new ArrayList<String>();
		tiposDeErrosDeExpressao = new ArrayList<Tipo>();
		mensagensDeSucessosDeExpressao = new ArrayList<String>();
		tiposDeSucessosDeExpressao = new ArrayList<Tipo>();
	}
	
	public <T extends Escopo> void reportarErro(String mensagem, T membro) {
		mensagensDeErros.add(mensagem);
		membrosDeErros.add(membro);
		System.out.println(mensagem);
	}
	
	public <T extends Escopo> void reportarSucesso(String mensagem, T membro) {
		mensagensDeSucessos.add(mensagem);
		membrosDeSucessos.add(membro);
		System.out.println(mensagem);
	}
	
	public void reportarAberturaDeEscopo(Escopo escopo) {
		if (!(escopo instanceof Variavel || escopo instanceof Atributo)) {
			System.out.println(String.format("[%s] Escopo aberto.", escopo.fornecerNome()));
		}
	}
	
	public void reportarFechamentoDeEscopo(Escopo escopo) {
		if (!(escopo instanceof Variavel || escopo instanceof Atributo)) {
			System.out.println(String.format("[%s] Escopo fechado.", escopo.fornecerNome()));
		}
	}
	
	public void reportarErroDeTipo(Tipo tipo, String expressao) {
		mensagensDeErrosDeExpressao.add(expressao);
		tiposDeErrosDeExpressao.add(tipo);
		System.out.println(String.format("[%s] [%s, %s] [%s] tipo inválido.", tipo.fornecerNome(), tipo.fornecerLinha(), tipo.fornecerColuna(), expressao));
	}
	
	public void reportarSucessoDeTipo(Tipo tipo, String expressao) {
		mensagensDeSucessosDeExpressao.add(expressao);
		tiposDeSucessosDeExpressao.add(tipo);
		System.out.println(String.format("[%s] [%s, %s] [%s] tipo válido.", tipo.fornecerNome(), tipo.fornecerLinha(), tipo.fornecerColuna(), expressao));
	}
	
	public boolean possuiErroDeDeifinicaoResolucao() {
		return (membrosDeErros.size() > 0);
	}
	
	public boolean possuiErroDeExpressao() {
		return (tiposDeErrosDeExpressao.size() > 0);
	}
}

