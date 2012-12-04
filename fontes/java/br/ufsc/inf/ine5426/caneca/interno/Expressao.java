package br.ufsc.inf.ine5426.caneca.interno;

public interface Expressao {
	public void abrir(Expressao expressaoPai);
	
	public void adicionarTipo(Tipo tipo);
	
	public Expressao fechar();
	
	public Tipo fornecerTipo();
}
