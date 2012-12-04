package br.ufsc.inf.ine5426.caneca.interno;

public class ExpressaoSubtracao implements Expressao {
	private Tipo tipo;
	private Tipo tipoResultante;
	private Expressao expressaoPai;
	
	public void abrir(Expressao expressaoPai) {
		this.expressaoPai = expressaoPai;
	}
	
	public void adicionarTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	public Expressao fechar() {
		tipoResultante = tipo;
		if (!tipo.contido(Tipo.INTEIRO) && !tipo.contido(Tipo.REAL)) {
			Reporter.fornecerInstancia().reportarErroDeTipo(tipo, "expressaoSubtracaoUnaria");
			tipoResultante = Tipo.REAL;
		} else {
			Reporter.fornecerInstancia().reportarSucessoDeTipo(tipoResultante, "expressaoSubtracaoUnaria");
		}
		if (expressaoPai != null) {
			expressaoPai.adicionarTipo(tipoResultante);
			return expressaoPai;
		}
		return this;
	}
	
	public Tipo fornecerTipo() {
		return tipoResultante;
	}
}

