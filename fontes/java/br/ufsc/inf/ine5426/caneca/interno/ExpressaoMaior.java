package br.ufsc.inf.ine5426.caneca.interno;

public final class ExpressaoMaior extends ExpressaoComparativaAritmetica {
	public ExpressaoMaior(Escopo escopoPai) {
		super(escopoPai);
	}
	
	@Override
	public String comoTexto() {
		return ">";
	}
}
