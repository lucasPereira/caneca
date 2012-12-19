package br.ufsc.inf.ine5426.caneca.interno;

import br.ufsc.inf.ine5426.caneca.maquina.Codigo;
import br.ufsc.inf.ine5426.caneca.maquina.CodigoEmpilhar;
import br.ufsc.inf.ine5426.caneca.maquina.ValorReal;

import java.util.List;

public final class ExpressaoConstanteReal extends ExpressaoPrimaria {
	private double valor;
	
	public ExpressaoConstanteReal(Escopo escopoPai, String valorTextual) {
		super(escopoPai, valorTextual);
		valor = Double.parseDouble(valorTextual);
	}
	
	@Override
	public void gerarCodigo(List<Codigo> codigo) {
		codigo.add(new CodigoEmpilhar(new ValorReal(valor)).encapsular());
	}
	
	@Override
	public Tipo fornecerTipo() {
		return Tipo.REAL;
	}
}
