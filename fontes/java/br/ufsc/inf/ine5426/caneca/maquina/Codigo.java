package br.ufsc.inf.ine5426.caneca.maquina;

import java.util.Stack;

public interface Codigo {
	public void executar(Stack<Valor> pilhaDeDados, Stack<Codigo> pilhaDeExecucao, Stack<Contexto> pilhaDeContextos);
	
	public CodigoEncapsulado encapsular();
	
	public String comoTexto();
}
