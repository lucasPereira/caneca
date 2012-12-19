package br.ufsc.inf.ine5426.caneca.interno;

import br.ufsc.inf.ine5426.caneca.maquina.Codigo;
import br.ufsc.inf.ine5426.caneca.maquina.CodigoEmpilhar;
import br.ufsc.inf.ine5426.caneca.maquina.ValorInteiro;

import java.util.List;

public final class ExpressaoConstanteInteira extends ExpressaoPrimaria {
	private int valor;
	
	public ExpressaoConstanteInteira(Escopo escopoPai, String valorTextual) {
		super(escopoPai, valorTextual);
		valor = Integer.parseInt(valorTextual);
	}
	
	@Override
	public void gerarCodigo(List<Codigo> codigo) {
		codigo.add(new CodigoEmpilhar(new ValorInteiro(valor)).encapsular());
	}
	
	@Override
	public Tipo fornecerTipo() {
		return Tipo.INTEIRO;
	}
}
