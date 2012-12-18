package br.ufsc.inf.ine5426.caneca.maquina;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MaquinaCaneca {
	private Stack<Valor> pilha;
	private Stack<Codigo> pilhaDeExecucao;
	private Map<String, Classe> classes;

	public MaquinaCaneca() {
		pilha = new Stack<Valor>();
		pilhaDeExecucao = new Stack<Codigo>();
		classes = new HashMap<String, Classe>();
	}
}
