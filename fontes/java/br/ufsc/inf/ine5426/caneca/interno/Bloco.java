package br.ufsc.inf.ine5426.caneca.interno;

import java.util.HashMap;
import java.util.Map;

public final class Bloco extends EscopoAbstrato {
	private Map<String, Variavel> variaveis;
	
	public Bloco() {
		super("Bloco");
		variaveis = new HashMap<String, Variavel>();
	}
	
	@Override
	public boolean definirVariavel(Variavel variavel) {
		return definirMembro(variaveis, variavel, "variavel");
	}
	
	@Override
	public Classe resolverClasse(String nomeDaClasse) {
		return fornecerEscopoPai().resolverClasse(nomeDaClasse);
	}
	
	@Override
	public Atributo resolverAtributo(String nomeDoAtributo) {
		return fornecerEscopoPai().resolverAtributo(nomeDoAtributo);
	}
	
	@Override
	public Metodo resolverMetodo(String nomeDoMetodo) {
		return fornecerEscopoPai().resolverMetodo(nomeDoMetodo);
	}
	
	@Override
	public Variavel resolverVariavel(String nomeDaVariavel, int indice) {
		Variavel variavel = resolverMembro(variaveis, Variavel.NAO_ENCONTRADA, nomeDaVariavel, "variavel");
		if (variavel == Variavel.NAO_ENCONTRADA || variavel.eReferenciaAvancada(indice)) {
			return fornecerEscopoPai().resolverVariavel(nomeDaVariavel, indice);
		}
		return variavel;
	}
}

