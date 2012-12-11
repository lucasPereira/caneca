package br.ufsc.inf.ine5426.caneca.interno;

public final class ExpressaoSubtracao extends ExpressaoAritmetica {
	public ExpressaoSubtracao(Escopo escopoPai) {
		super(escopoPai);
	}
	
	@Override
	public String comoTexto() {
		return "-";
	}
}
