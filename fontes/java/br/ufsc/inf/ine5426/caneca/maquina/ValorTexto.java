package br.ufsc.inf.ine5426.caneca.maquina;

public final class ValorTexto extends ValorAbstrato {
	public static ValorTexto PADRAO = new ValorTexto("");
	private String valor;
	
	public ValorTexto(String valor) {
		this.valor = valor;
	}
	
	@Override
	public String fornecerComoTexto() {
		return valor;
	}

	@Override
	public String comoTexto() {
		return valor;
	}
}
