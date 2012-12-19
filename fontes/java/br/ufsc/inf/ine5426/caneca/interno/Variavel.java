package br.ufsc.inf.ine5426.caneca.interno;

import br.ufsc.inf.ine5426.caneca.maquina.Codigo;
import br.ufsc.inf.ine5426.caneca.maquina.CodigoDefinirSimbolo;

import java.util.List;

public final class Variavel extends SimboloAbstrato {
	public Variavel(Escopo escopoPai, Tipo tipo, String nome, int linha, int coluna) {
		super(escopoPai, tipo, nome, linha, coluna);
	}
	
	@Override
	public void gerarCodigo(List<Codigo> codigo) {
		codigo.add(new CodigoDefinirSimbolo(fornecerNome()).encapsular());
	}
}
