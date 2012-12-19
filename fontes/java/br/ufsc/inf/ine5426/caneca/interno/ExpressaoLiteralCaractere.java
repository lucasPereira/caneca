package br.ufsc.inf.ine5426.caneca.interno;

import br.ufsc.inf.ine5426.caneca.maquina.Codigo;
import br.ufsc.inf.ine5426.caneca.maquina.CodigoEmpilhar;
import br.ufsc.inf.ine5426.caneca.maquina.ValorCaractere;

import java.util.List;

public final class ExpressaoLiteralCaractere extends ExpressaoPrimaria {
	private char valor;
	
	public ExpressaoLiteralCaractere(Escopo escopoPai, String valorTextual) {
		super(escopoPai, valorTextual);
		valor = valorTextual.charAt(1);
	}
	
	@Override
	public void gerarCodigo(List<Codigo> codigo) {
		codigo.add(new CodigoEmpilhar(new ValorCaractere(valor)).encapsular());
	}

	@Override
	public Tipo fornecerTipo() {
		return Tipo.CARACTERE;
	}
}
