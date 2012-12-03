package br.ufsc.inf.ine5426.caneca.interno;

public final class Variavel extends EscopoAbstrato {
	public static final Variavel NAO_ENCONTRADA = new Variavel("variavelNaoEncontrada", Classe.NAO_ENCONTRADA.fornecerNome(), 0);
	private int indice;
	
	public Variavel(String nome, String nomeDoTipo, int indice) {
		super(nome, nomeDoTipo);
		this.indice = indice;
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
	
	public boolean eReferenciaAvancada(int indiceDoReferenciador) {
		return (indice > indiceDoReferenciador);
	}
}

