package br.ufsc.inf.ine5426.caneca.maquina;

public class SomarR implements Codigo {
	public SomarR() {
		
	}
	
	@Override
	public void executar(Stack<Valor> pilhaDeDados, Stack<Comando> pilhaDeExecucao, Stack<Contexto> pilhaDeContextos) {
		double operandoA = pilhaDeDados.pop().fornecerComoReal();
		double operandoB = pilhaDeDados.pop().fornecerComoReal();
		pilhaDeDados.push(new Valor(operandoA + operandoB));
	}
	
	@Override
	public String comoTexto() {
		return String.format("somarR");
	}
}
