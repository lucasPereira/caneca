package br.ufsc.inf.ine5426.caneca.maquina;

import java.util.Stack;

public final class CodigoSomarI extends CodigoAbstrato {
	public CodigoSomarI() {
		
	}
	
	@Override
	public void executar(Stack<Valor> pilhaDeDados, Stack<Codigo> pilhaDeExecucao, Stack<Contexto> pilhaDeContextos) {
		int operandoB = pilhaDeDados.pop().fornecerComoInteiro();
		int operandoA = pilhaDeDados.pop().fornecerComoInteiro();
		pilhaDeDados.push(new ValorInteiro(operandoA + operandoB));
	}
	
	@Override
	public String comoTexto() {
		return String.format("somarI");
	}
}
