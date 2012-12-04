package br.ufsc.inf.ine5426.caneca.interno;

public class ExpressaoComparativaAritmetica implements Expressao {
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
		if (!tipoA.contido(Tipo.INTEIRO) && !tipoA.contido(Tipo.REAL)) {
			Reporter.fornecerInstancia().reportarErroDeTipo(tipoA, "expressaoComparativaAritmetica");
		} else if (!tipoB.contido(Tipo.INTEIRO) && !tipoB.contido(Tipo.REAL)) {
			Reporter.fornecerInstancia().reportarErroDeTipo(tipoB, "expressaoComparativaAritmetica");
		} else {
			Reporter.fornecerInstancia().reportarSucessoDeTipo(Tipo.BOOLEANO, "expressaoComparativaAritmetica");
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

