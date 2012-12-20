package br.ufsc.inf.ine5426.caneca.maquina;

public interface Valor {
	public void fixarNome(String nome);
	
	public void fixarContexto(Contexto contexto);
	
	public String fornecerComoTexto();
	
	public char fornecerComoCaractere();
	
	public boolean fornecerComoBooleano();
	
	public int fornecerComoInteiro();
	
	public double fornecerComoReal();
	
	public Referencia fornecerComoReferencia();
	
	public String comoTexto();
}
