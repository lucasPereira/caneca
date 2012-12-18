package br.ufsc.inf.ine5426.caneca.maquina;

public interface Valor {
	public String fornecerComoTexto();
	
	public char fornecerComoCaractere();
	
	public boolean fornecerComoBooleano();
	
	public int fornecerComoInteiro();
	
	public double fornecerComoReal();
	
	public String fornecerComoIdentificador();
}
