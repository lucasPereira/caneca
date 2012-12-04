package br.ufsc.inf.ine5426.caneca.interno;

public class ExpressaoOuLogico implements Expressao {
	private Tipo tipoA;
	private Tipo tipoB;
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
		if (!tipoA.contido(Tipo.BOOLEANO)) {
			Reporter.fornecerInstancia().reportarErroDeTipo(tipoA, "expressaoOuogico");
		} else if (!tipoB.contido(Tipo.BOOLEANO)) {
			Reporter.fornecerInstancia().reportarErroDeTipo(tipoB, "expressaoOuLogico");
		} else {
			Reporter.fornecerInstancia().reportarSucessoDeTipo(Tipo.BOOLEANO, "expressaoOuLogico");
		}
		if (expressaoPai != null) {
			expressaoPai.adicionarTipo(Tipo.BOOLEANO);
			return expressaoPai;
		}
		return this;
	}
	
	public Tipo fornecerTipo() {
		return Tipo.BOOLEANO;
	}
}

