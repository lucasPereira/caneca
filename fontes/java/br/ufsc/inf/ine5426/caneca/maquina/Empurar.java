package br.ufsc.inf.ine5426.caneca.maquina;

public class Empurar implements Codigo {
	private Valor valor;
	
	public Empurar(Valor valor) {
		this.valor = valor;
	}
	
	@Override
	public void executar(Stack<Comando> pilhaDeExecucao, Stack<Valor> pilhaDeDados, Contexto contexto) {
		pilhaDeDados.push(valor);
	}
	
	@Override
	public String comoTexto() {
		return String.format("empurar %s", valor.comoTexto());
	}
}
