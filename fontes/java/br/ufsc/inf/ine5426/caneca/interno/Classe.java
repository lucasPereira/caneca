package br.ufsc.inf.ine5426.caneca.interno;

import java.util.HashMap;
import java.util.Map;

public final class Classe extends EscopoAbstrato {
	public static Classe NAO_ENCONTRADA = new Classe("classeNaoEncontrada");
	private Map<String, Atributo> atributos;
	private Map<String, Metodo> metodos;
	
	public Classe(String nome) {
		super(nome);
		atributos = new HashMap<String, Atributo>();
		metodos = new HashMap<String, Metodo>();
	}
	
	@Override
	public boolean definirAtributo(Atributo atributo) {
		return definirMembro(atributos, atributo, "atributo");
	}
	
	@Override
	public boolean definirMetodo(Metodo metodo) {
		return definirMembro(metodos, metodo, "metodo");
	}
	
	@Override
	public Classe resolverClasse(String nomeDaClasse) {
		return fornecerEscopoPai().resolverClasse(nomeDaClasse);
	}
	
	@Override
	public Atributo resolverAtributo(String nomeDoAtributo) {
		return resolverMembro(atributos, Atributo.NAO_ENCONTRADO, nomeDoAtributo, "atributo");
	}
	
	@Override
	public Metodo resolverMetodo(String nomeDoMetodo) {
		return resolverMembro(metodos, Metodo.NAO_ENCONTRADO, nomeDoMetodo, "metodo");
	}
}

