package br.ufsc.inf.ine5426.caneca.interno;

public final class ExpressaoConstanteReal extends ExpressaoPrimaria {
	private double valor;
	
	public ExpressaoConstanteReal(Escopo escopoPai, String valorTextual) {
		super(escopoPai, valorTextual);
		valor = Double.parseDouble(valorTextual);
	}
	
	@Override
	public Tipo fornecerTipo() {
		return Tipo.REAL;
	}
}
