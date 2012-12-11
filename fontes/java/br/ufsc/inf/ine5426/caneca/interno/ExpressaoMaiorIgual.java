package br.ufsc.inf.ine5426.caneca.interno;

public final class ExpressaoMaiorIgual extends ExpressaoComparativaAritmetica {
	public ExpressaoMaiorIgual(Escopo escopoPai) {
		super(escopoPai);
	}
	
	@Override
	public String comoTexto() {
		return ">=";
	}
}
