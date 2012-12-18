package br.ufsc.inf.ine5426.caneca.interno;

public final class ExpressaoLiteralCaractere extends ExpressaoPrimaria {
	private char valor;
	
	public ExpressaoLiteralCaractere(Escopo escopoPai, String valorTextual) {
		super(escopoPai, valorTextual);
		valor = valorTextual.charAt(1);
	}
	
	@Override
	public Tipo fornecerTipo() {
		return Tipo.CARACTERE;
	}
}
