package br.ufsc.inf.ine5426.caneca.interno;

public final class ExpressaoValorBooleano extends ExpressaoPrimaria {
	private boolean valor;
	
	public ExpressaoValorBooleano(Escopo escopoPai, String valorTextual) {
		super(escopoPai, valorTextual);
		if (valorTextual.equals("verdadeiro")) {
			valor = true;
		} else if (valorTextual.equals("falso")) {
			valor = false;
		}
	}
	
	@Override
	public Tipo fornecerTipo() {
		return Tipo.BOOLEANO;
	}
}
