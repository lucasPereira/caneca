package br.ufsc.inf.ine5426.caneca.interno;

public final class ExpressaoMenor extends ExpressaoComparativaAritmetica {
	public ExpressaoMenor(Escopo escopoPai) {
		super(escopoPai);
	}
	
	@Override
	public String comoTexto() {
		return "<";
	}
}
