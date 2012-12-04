package br.ufsc.inf.ine5426.caneca.interno;

public class ExpressaoAditiva implements Expressao {
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
		if (!tipoA.contido(Tipo.INTEIRO) && !tipoA.contido(Tipo.REAL)) {
			Reporter.fornecerInstancia().reportarErroDeTipo(tipoA, "expressaoAditiva");
			tipo = tipoB;
		} else if (!tipoB.contido(Tipo.INTEIRO) && !tipoB.contido(Tipo.REAL)) {
			Reporter.fornecerInstancia().reportarErroDeTipo(tipoB, "expressaoAditiva");
			tipo = Tipo.REAL;
		} else {
			if (tipoB.contido(Tipo.REAL)) {
				tipo = tipoB;
			}
			Reporter.fornecerInstancia().reportarSucessoDeTipo(tipo, "expressaoAditiva");
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

