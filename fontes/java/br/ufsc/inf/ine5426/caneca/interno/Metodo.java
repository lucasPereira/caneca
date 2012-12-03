package br.ufsc.inf.ine5426.caneca.interno;

import java.util.HashMap;
import java.util.Map;

public final class Metodo extends EscopoAbstrato {
	public static final Metodo NAO_ENCONTRADO = new Metodo("metodoNaoEncontrado", null);
	private Map<String, Variavel> argumentos;
	
	public Metodo(String nome, Tipo tipo) {
		super(nome, tipo);
		argumentos = new HashMap<String, Variavel>();
	}
	
	@Override
	public boolean definirVariavel(Variavel variavel) {
		return definirMembro(argumentos, variavel, "argumento");
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
		return resolverMembro(argumentos, Variavel.NAO_ENCONTRADA, nomeDaVariavel, "argumento");
	}
}

