package br.ufsc.inf.ine5426.caneca.interno;

public final class ExpressaoValorNulo extends ExpressaoPrimaria {
	public ExpressaoValorNulo(Escopo escopoPai, String valorTextual) {
		super(escopoPai, valorTextual);
	}
	
	@Override
	public Tipo fornecerTipo() {
		return Tipo.OBJETO;
	}
}
