package br.ufsc.inf.ine5426.caneca.interno;

public final class Variavel extends EscopoAbstrato {
	public static final Variavel NAO_ENCONTRADA = new Variavel("variavelNaoEncontrada", null, 0);
	private int indice;
	
	public Variavel(String nome, Tipo tipo, int indice) {
		super(nome, tipo);
		this.indice = indice;
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
	
	public boolean eReferenciaAvancada(int indiceDoReferenciador) {
		return (indice > indiceDoReferenciador);
	}
}

