package br.ufsc.inf.ine5426.caneca.interno;

public final class InstrucaoRetorne extends EscopoAbstrato implements Instrucao {
	private Expressao excecao;
	
	public InstrucaoRetorne(Escopo escopoPai) {
		super(escopoPai);
	}
	
	@Override
	public boolean definirExpressao(Expressao expressao) {
		excecao = expressao;
		Reporter.instancia().reportarDefinicaoDeExpressao(expressao);
		return true;
	}
	
	@Override
	public String comoTexto() {
		return "retorne";
	}
}
