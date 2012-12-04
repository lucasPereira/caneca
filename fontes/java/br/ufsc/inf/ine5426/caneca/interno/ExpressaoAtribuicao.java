package br.ufsc.inf.ine5426.caneca.interno;

public class ExpressaoAtribuicao implements Expressao {
	private Tipo tipoA;
	private Tipo tipoB;
	private Tipo tipo;
	private Expressao expressaoPai;
	
	public void abrir(Expressao expressaoPai) {
		this.expressaoPai = expressaoPai;
	}
	
	public void adicionarTipo(Tipo tipo) {
		if (tipoA == null) {
			tipoA = tipo;
		} else {
			tipoB = tipo;
		}
	}
	
	public Expressao fechar() {
		tipo = tipoA;
		if (!tipoB.contido(tipoA) && !tipoB.fornecerNome().equals("Nulo")) {
			Reporter.fornecerInstancia().reportarErroDeTipo(tipoB, "expressaoAtribuicao");
		} else {
			Reporter.fornecerInstancia().reportarSucessoDeTipo(tipo, "expressaoAtribuicao");
		}
		if (expressaoPai != null) {
			expressaoPai.adicionarTipo(tipo);
			return expressaoPai;
		}
		return this;
	}
	
	public Tipo fornecerTipo() {
		return tipo;
	}
}

