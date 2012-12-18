package br.ufsc.inf.ine5426.caneca.maquina;

public class Empurar implements Codigo {
	private Valor valor;
	
	public Empurar(Valor valor) {
		this.valor = valor;
	}
	
	@Override
	public void executar(Stack<Valor> pilha) {
		pilha.push(valor);
	}
}
