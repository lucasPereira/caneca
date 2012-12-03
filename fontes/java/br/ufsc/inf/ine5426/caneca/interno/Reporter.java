package br.ufsc.inf.ine5426.caneca.interno;

import java.util.ArrayList;
import java.util.List;

public class Reporter {
	public static Reporter INSTANCIA;
	private List<String> mensagensDeErros;
	private List<Escopo> membrosDeErros;
	private List<String> mensagensDeSucessos;
	private List<Escopo> membrosDeSucessos;
	
	public static Reporter fornecerInstancia() {
		return (INSTANCIA == null) ? (INSTANCIA = new Reporter()) : INSTANCIA;
	}
	
	private Reporter() {
		mensagensDeErros = new ArrayList<String>();
		membrosDeErros = new ArrayList<Escopo>();
		mensagensDeSucessos = new ArrayList<String>();
		membrosDeSucessos = new ArrayList<Escopo>();
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
}

