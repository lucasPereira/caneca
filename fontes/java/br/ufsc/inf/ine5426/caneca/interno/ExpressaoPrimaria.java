package br.ufsc.inf.ine5426.caneca.interno;

public class ExpressaoPrimaria implements Expressao {
	private Tipo tipo;
	private Expressao expressaoPai;
	
	public void abrir(Expressao expressaoPai) {
		this.expressaoPai = expressaoPai;
	}
	
	public void adicionarTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	public Expressao fechar() {
		Reporter.fornecerInstancia().reportarSucessoDeTipo(tipo, "expressaoPrimaria");
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

