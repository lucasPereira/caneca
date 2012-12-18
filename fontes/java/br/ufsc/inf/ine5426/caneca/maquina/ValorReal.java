package br.ufsc.inf.ine5426.caneca.maquina;

public final class ValorReal extends ValorAbstrato {
	private double valor;
	
	public ValorReal(int valor) {
		this.valor = valor;
	}
	
	@Override
	public int fornecerComoReal() {
		return valor;
	}
}
