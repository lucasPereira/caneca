package br.ufsc.inf.ine5426.caneca.maquina;

public final class ValorCaractere extends ValorAbstrato {
	public static ValorCaractere PADRAO = new ValorCaractere('\0');
	private char valor;
	
	public ValorCaractere(char valor) {
		this.valor = valor;
	}
	
	@Override
	public char fornecerComoCaractere() {
		return valor;
	}

	@Override
	public String comoTexto() {
		return valor + "";
	}
}
