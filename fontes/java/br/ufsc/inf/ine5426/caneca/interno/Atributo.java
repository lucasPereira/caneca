package br.ufsc.inf.ine5426.caneca.interno;

public final class Atributo extends EscopoAbstrato {
	public static final Atributo NAO_ENCONTRADO = new Atributo("atributoNaoEncontrado", Classe.NAO_ENCONTRADA.fornecerNome());
	
	public Atributo(String nome, String nomeDoTipo) {
		super(nome, nomeDoTipo);
	}
	
	@Override
	public Classe resolverClasse(String nomeDaClasse) {
		return fornecerEscopoPai().resolverClasse(nomeDaClasse);
	}
	
	@Override
	public Atributo resolverAtributo(String nomeDoAtributo) {
		return fornecerTipo().resolverAtributo(nomeDoAtributo);
	}
	
	@Override
	public Metodo resolverMetodo(String nomeDoMetodo) {
		return fornecerTipo().resolverMetodo(nomeDoMetodo);
	}
}

