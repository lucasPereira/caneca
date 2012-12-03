package br.ufsc.inf.ine5426.caneca.interno;

public interface Escopo {
	public void abrir(Escopo escopoPai);
	
	public Escopo fechar();
	
	public boolean definirClasse(Classe classe);
	
	public boolean definirAtributo(Atributo atributo);
	
	public boolean definirMetodo(Metodo metodo);
	
	public boolean definirVariavel(Variavel variavel);
	
	public Classe resolverClasse(String nomeDaClasse);
	
	public Atributo resolverAtributo(String nomeDoAtributo);
	
	public Metodo resolverMetodo(String nomeDoMetodo);
	
	public Variavel resolverVariavel(String nomeDaVariavel, int indice);
	
	public String fornecerNome();
	
	public Classe fornecerTipo();

	public Escopo fornecerEscopoPai();
}

