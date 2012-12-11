package br.ufsc.inf.ine5426.caneca.interno;

public final class ExpressaoDivisao extends ExpressaoAritmetica {
	public ExpressaoDivisao(Escopo escopoPai) {
		super(escopoPai);
	}
	
	@Override
	public String comoTexto() {
		return "/";
	}
}
