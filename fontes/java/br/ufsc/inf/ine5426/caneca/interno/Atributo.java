package br.ufsc.inf.ine5426.caneca.interno;

import br.ufsc.inf.ine5426.caneca.maquina.Codigo;
import br.ufsc.inf.ine5426.caneca.maquina.CodigoDefinirSimbolo;
import br.ufsc.inf.ine5426.caneca.maquina.CodigoEmpilhar;

import java.util.List;

public final class Atributo extends SimboloAbstrato {
	public Atributo(Escopo escopoPai, Tipo tipo, String nome, int linha, int coluna) {
		super(escopoPai, tipo, nome, linha, coluna);
	}
	
	@Override
	public void gerarCodigo(List<Codigo> codigo) {
		codigo.add(new CodigoEmpilhar(fornecerTipo().fornecerValorPadrao()));
		codigo.add(new CodigoDefinirSimbolo(fornecerNome()));
	}
}
