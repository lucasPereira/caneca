package br.ufsc.inf.ine5426.caneca.interno;

public final class ExpressaoConstanteInteira extends ExpressaoPrimaria {
	private int valor;
	
	public ExpressaoConstanteInteira(Escopo escopoPai, String valorTextual) {
		super(escopoPai, valorTextual);
		valor = Integer.parseInt(valorTextual);
	}
	
	@Override
	public Tipo fornecerTipo() {
		return Tipo.INTEIRO;
	}
}
