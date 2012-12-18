package br.ufsc.inf.ine5426.caneca.maquina;

public class SomarR implements Codigo {
	public SomarR() {
		
	}
	
	@Override
	public void executar(Stack<Valor> pilha) {
		double operandoA = pilha.pop().fornecerComoReal();
		double operandoB = pilha.pop().fornecerComoReal();
		pilha.push(new Valor(operandoA + operandoB));
	}
}
