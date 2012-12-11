package br.ufsc.inf.ine5426.caneca.interno;

public final class ExpressaoDiferente extends ExpressaoComparativaIdentidade {
	public ExpressaoDiferente(Escopo escopoPai) {
		super(escopoPai);
	}
	
	@Override
	public String comoTexto() {
		return "!=";
	}
}
