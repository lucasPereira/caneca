package br.ufsc.inf.ine5426.caneca.interno;

public abstract class EscopoAbstrato implements Escopo {
	private Escopo escopoPai;
	
	public EscopoAbstrato(Escopo escopoPai) {
		this.escopoPai = escopoPai;
	}
	
	@Override
	public boolean definirVariavel(Variavel variavel) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public boolean definirBloco(Bloco bloco) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public boolean definirInstrucao(Instrucao instrucao) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public boolean definirExpressao(Expressao expressao) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public final Escopo fornecerEscopoPai() {
		return escopoPai;
	}
}
