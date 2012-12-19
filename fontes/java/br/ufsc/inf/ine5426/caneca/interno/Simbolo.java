package br.ufsc.inf.ine5426.caneca.interno;

import br.ufsc.inf.ine5426.caneca.maquina.Codigo;

import java.util.List;

public interface Simbolo extends Localizavel {
	public void gerarCodigo(List<Codigo> codigo);
	
	public Escopo fornecerEscopoPai();
	
	public String comoTexto();
	
	public String fornecerNome();
}
