package br.ufsc.inf.ine5426.caneca.interno;

public final class ExpressaoSoma extends ExpressaoAritmetica {
	public ExpressaoSoma(Escopo escopoPai) {
		super(escopoPai);
	}
	
	@Override
	public String comoTexto() {
		return "+";
	}
}
