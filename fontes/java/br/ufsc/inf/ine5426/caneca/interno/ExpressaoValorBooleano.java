package br.ufsc.inf.ine5426.caneca.interno;

import br.ufsc.inf.ine5426.caneca.maquina.Codigo;
import br.ufsc.inf.ine5426.caneca.maquina.CodigoEmpilhar;
import br.ufsc.inf.ine5426.caneca.maquina.ValorBooleano;

import java.util.List;

public final class ExpressaoValorBooleano extends ExpressaoPrimaria {
	private boolean valor;
	
	public ExpressaoValorBooleano(Escopo escopoPai, String valorTextual) {
		super(escopoPai, valorTextual);
		if (valorTextual.equals("verdadeiro")) {
			valor = true;
		} else if (valorTextual.equals("falso")) {
			valor = false;
		}
	}
	
	@Override
	public void gerarCodigo(List<Codigo> codigo) {
		codigo.add(new CodigoEmpilhar(new ValorBooleano(valor)).encapsular());
	}
	
	@Override
	public Tipo fornecerTipo() {
		return Tipo.BOOLEANO;
	}
}
