package br.ufsc.inf.ine5426.caneca.interno;

public final class InstrucaoSe extends EscopoAbstrato implements Instrucao {
	private Expressao condicao;
	private Bloco blocoSe;
	private Bloco blocoSenao;
	
	public InstrucaoSe(Escopo escopoPai) {
		super(escopoPai);
	}
	
	@Override
	public boolean definirBloco(Bloco bloco) {
		if (blocoSe == null) {
			blocoSe = bloco;
		} else if (blocoSenao == null) {
			blocoSenao = bloco;
		}
		Reporter.instancia().reportarDefinicaoDeBloco(bloco);
		return true;
	}
	
	@Override
	public boolean definirExpressao(Expressao expressao) {
		condicao = expressao;
		Reporter.instancia().reportarDefinicaoDeExpressao(expressao);
		return true;
	}
}
