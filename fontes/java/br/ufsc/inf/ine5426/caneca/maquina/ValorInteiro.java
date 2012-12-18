package br.ufsc.inf.ine5426.caneca.maquina;

public final class ValorInteiro extends ValorAbstrato {
	private int valor;
	
	public ValorInteiro(int valor) {
		this.valor = valor;
	}
	
	@Override
	public int fornecerComoInteiro() {
		return valor;
	}
}
