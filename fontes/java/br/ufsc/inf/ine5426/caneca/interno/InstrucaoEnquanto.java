package br.ufsc.inf.ine5426.caneca.interno;

public final class InstrucaoEnquanto extends EscopoAbstrato implements Instrucao {
	private Expressao condicao;
	private Bloco bloco;
	
	public InstrucaoEnquanto(Escopo escopoPai) {
		super(escopoPai);
	}
	
	@Override
	public boolean definirBloco(Bloco bloco) {
		this.bloco = bloco;
		Reporter.instancia().reportarDefinicaoDeBloco(bloco);
		return true;
	}
	
	@Override
	public boolean definirExpressao(Expressao expressao) {
		condicao = expressao;
		Reporter.instancia().reportarDefinicaoDeExpressao(expressao);
		return true;
	}
	
	@Override
	public String comoTexto() {
		return "enquanto";
	}
}
