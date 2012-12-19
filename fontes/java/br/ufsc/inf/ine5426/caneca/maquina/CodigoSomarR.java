package br.ufsc.inf.ine5426.caneca.maquina;

import java.util.Stack;

public final class CodigoSomarR extends CodigoAbstrato {
	public CodigoSomarR() {
		
	}
	
	@Override
	public void executar(Stack<Valor> pilhaDeDados, Stack<Codigo> pilhaDeExecucao, Stack<Contexto> pilhaDeContextos) {
		double operandoB = pilhaDeDados.pop().fornecerComoReal();
		double operandoA = pilhaDeDados.pop().fornecerComoReal();
		pilhaDeDados.push(new ValorReal(operandoA + operandoB));
	}
	
	@Override
	public String comoTexto() {
		return String.format("somarR");
	}
}
