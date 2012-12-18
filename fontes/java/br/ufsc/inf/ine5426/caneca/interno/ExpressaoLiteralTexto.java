package br.ufsc.inf.ine5426.caneca.interno;

public final class ExpressaoLiteralTexto extends ExpressaoPrimaria {
	private String valor;
	
	public ExpressaoLiteralTexto(Escopo escopoPai, String valorTextual) {
		super(escopoPai, valorTextual);
		valor = valorTextual.substring(1, valorTextual.length() - 1);
	}
	
	@Override
	public Tipo fornecerTipo() {
		return Tipo.TEXTO;
	}
}
