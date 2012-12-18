package br.ufsc.inf.ine5426.caneca.interno;

public final class ExpressaoIgual extends ExpressaoComparativaIdentidade {
	public ExpressaoIgual(Escopo escopoPai) {
		super(escopoPai);
	}
	
	@Override
	public String comoTexto() {
		return "==";
	}
}
