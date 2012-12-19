package br.ufsc.inf.ine5426.caneca.interno;

import br.ufsc.inf.ine5426.caneca.maquina.Codigo;
import br.ufsc.inf.ine5426.caneca.maquina.CodigoExtrairContexto;
import br.ufsc.inf.ine5426.caneca.maquina.CodigoFecharContexto;

import java.util.LinkedList;
import java.util.List;

public final class ExpressaoComando extends EscopoAbstrato implements Expressao {
	private LinkedList<Expressao> chamadas;
	
	public ExpressaoComando(Escopo escopoPai) {
		super(escopoPai);
		chamadas = new LinkedList<Expressao>();
	}
	
	@Override
	public void gerarCodigo(List<Codigo> codigo) {
		chamadas.removeFirst().gerarCodigo(codigo);
		for (Expressao chamada : chamadas) {
			codigo.add(new CodigoExtrairContexto().encapsular());
			chamada.gerarCodigo(codigo);
			codigo.add(new CodigoFecharContexto().encapsular());
		}
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
