package br.ufsc.inf.ine5426.caneca.interno;

public final class Atributo extends EscopoAbstrato {
	public static final Atributo NAO_ENCONTRADO = new Atributo("atributoNaoEncontrado", null);
	
	public Atributo(String nome, Tipo tipo) {
		super(nome, tipo);
	}
	
	@Override
	public Classe resolverClasse(String nomeDaClasse) {
		return fornecerEscopoPai().resolverClasse(nomeDaClasse);
	}
	
	@Override
	public Atributo resolverAtributo(String nomeDoAtributo) {
		return fornecerClasseDoTipo().resolverAtributo(nomeDoAtributo);
	}
	
	@Override
	public Metodo resolverMetodo(String nomeDoMetodo) {
		return fornecerClasseDoTipo().resolverMetodo(nomeDoMetodo);
	}
}

