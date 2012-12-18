package br.ufsc.inf.ine5426.caneca.maquina;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MaquinaCaneca {
	private Stack<Valor> pilhaDeDados;
	private Stack<Codigo> pilhaDeExecucao;
	private Stack<Contexto> pilhaDeContextos;
	
	public MaquinaCaneca() {
		pilhaDeDados = new Stack<Valor>();
		pilhaDeExecucao = new Stack<Codigo>();
		pilhaDeContextos = new Stack<Contexto>();
		pilhaDeContextos.push(new Contexto());
	}
}
