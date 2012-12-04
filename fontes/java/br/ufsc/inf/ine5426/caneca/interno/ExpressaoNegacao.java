package br.ufsc.inf.ine5426.caneca.interno;

public class ExpressaoNegacao implements Expressao {
	private Tipo tipo;
	private Expressao expressaoPai;
	
	public void abrir(Expressao expressaoPai) {
		this.expressaoPai = expressaoPai;
	}
	
	public void adicionarTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	public Expressao fechar() {
		if (!tipo.contido(Tipo.BOOLEANO)) {
			Reporter.fornecerInstancia().reportarErroDeTipo(tipo, "expressaoNegacaoUnaria");
		} else {
			Reporter.fornecerInstancia().reportarSucessoDeTipo(Tipo.BOOLEANO, "expressaoNegacaoUnaria");
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

