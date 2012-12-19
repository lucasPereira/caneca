package br.ufsc.inf.ine5426.caneca.maquina;

import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public final class CodigoImprimir extends CodigoAbstrato {
	public CodigoImprimir() {
		
	}
	
	@Override
	public void executar(Stack<Valor> pilhaDeDados, Stack<Codigo> pilhaDeExecucao, Stack<Contexto> pilhaDeContextos) {
		System.out.println("[saida] " + pilhaDeDados.pop().comoTexto());
	}
	
	@Override
	public String comoTexto() {
		return String.format("imprimir");
	}
}
