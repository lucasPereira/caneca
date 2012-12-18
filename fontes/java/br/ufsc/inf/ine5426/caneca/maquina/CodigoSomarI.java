package br.ufsc.inf.ine5426.caneca.maquina;

public class SomarI implements Codigo {
	public SomarI() {
		
	}
	
	@Override
	public void executar(Stack<Valor> pilhaDeDados, Stack<Comando> pilhaDeExecucao, Stack<Contexto> pilhaDeContextos) {
		int operandoA = pilhaDeDados.pop().fornecerComoInteiro();
		int operandoB = pilhaDeDados.pop().fornecerComoInteiro();
		pilhaDeDados.push(new ValorInteiro(operandoA + operandoB));
	}
	
	@Override
	public String comoTexto() {
		return String.format("somarI");
	}
}
