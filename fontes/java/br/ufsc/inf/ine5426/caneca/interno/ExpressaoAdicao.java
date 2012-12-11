package br.ufsc.inf.ine5426.caneca.interno;

public final class ExpressaoAdicao extends ExpressaoAritmetica {
	public ExpressaoAdicao(Escopo escopoPai) {
		super(escopoPai);
	}
	
	@Override
	public String comoTexto() {
		return "+";
	}
}
