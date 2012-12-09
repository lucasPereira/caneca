package br.ufsc.inf.ine5426.caneca.interno;

public interface Simbolo extends Localizavel {
	public Escopo fornecerEscopoPai();
	
	public String comoTexto();
	
	public String fornecerNome();
}
