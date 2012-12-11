package br.ufsc.inf.ine5426.caneca.interno;

public final class ExpressaoMultiplicacao extends ExpressaoAritmetica {
	public ExpressaoMultiplicacao(Escopo escopoPai) {
		super(escopoPai);
	}

	@Override
	public String comoTexto() {
		return "*";
	}
}
