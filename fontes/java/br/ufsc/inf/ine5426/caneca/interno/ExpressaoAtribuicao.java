package br.ufsc.inf.ine5426.caneca.interno;

public final class ExpressaoAtribuicao extends ExpressaoBinaria {
	Tipo tipo;
	
	public ExpressaoAtribuicao(Escopo escopoPai) {
		super(escopoPai);
	}
	
	@Override
	public Tipo fornecerTipo() {
		if (tipo == null) {
			tipo = fornecerOperandoEsquerdo().fornecerTipo();
		}
		return tipo;
	}
	
	@Override
	public String comoTexto() {
		return "=";
	}
}
