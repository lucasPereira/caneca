package br.ufsc.inf.ine5426.caneca.interno;

import br.ufsc.inf.ine5426.caneca.maquina.Codigo;
import br.ufsc.inf.ine5426.caneca.maquina.CodigoEmpilhar;
import br.ufsc.inf.ine5426.caneca.maquina.ValorNulo;

import java.util.List;

public final class ExpressaoValorNulo extends ExpressaoPrimaria {
	public ExpressaoValorNulo(Escopo escopoPai, String valorTextual) {
		super(escopoPai, valorTextual);
	}
	
	@Override
	public void gerarCodigo(List<Codigo> codigo) {
		codigo.add(new CodigoEmpilhar(new ValorNulo()).encapsular());
	}

	@Override
	public Tipo fornecerTipo() {
		return Tipo.OBJETO;
	}
}
