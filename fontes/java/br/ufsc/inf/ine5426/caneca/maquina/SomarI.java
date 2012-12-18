package br.ufsc.inf.ine5426.caneca.maquina;

public class SomarI implements Codigo {
	public SomarI() {
		
	}
	
	@Override
	public void executar(Stack<Valor> pilha) {
		int operandoA = pilha.pop().fornecerComoInteiro();
		int operandoB = pilha.pop().fornecerComoInteiro();
		pilha.push(new ValorInteiro(operandoA + operandoB));
	}
}
