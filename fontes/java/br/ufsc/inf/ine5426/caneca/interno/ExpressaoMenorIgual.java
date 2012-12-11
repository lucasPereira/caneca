package br.ufsc.inf.ine5426.caneca.interno;

public final class ExpressaoMenorIgual extends ExpressaoComparativaAritmetica {
	public ExpressaoMenorIgual(Escopo escopoPai) {
		super(escopoPai);
	}
	
	@Override
	public String comoTexto() {
		return "<=";
	}
}
