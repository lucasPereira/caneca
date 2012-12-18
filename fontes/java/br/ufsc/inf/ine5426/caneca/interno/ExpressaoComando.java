package br.ufsc.inf.ine5426.caneca.interno;

import java.util.LinkedList;

public final class ExpressaoComando extends EscopoAbstrato implements Expressao {
	private LinkedList<Expressao> chamadas;
	
	public ExpressaoComando(Escopo escopoPai) {
		super(escopoPai);
		chamadas = new LinkedList<Expressao>();
	}
	
	@Override
	public boolean definirExpressao(Expressao expressao) {
		chamadas.add(expressao);
		Reporter.instancia().reportarDefinicaoDeExpressao(expressao);
		return true;
	}
	
	@Override
	public Tipo fornecerTipo() {
		return chamadas.getLast().fornecerTipo();
	}
	
	@Override
	public String comoTexto() {
		return "comando";
	}
}
