package br.ufsc.inf.ine5426.caneca.interno;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class Classe extends EscopoAbstrato {
	public static Classe NAO_ENCONTRADA = new Classe("classeNaoEncontrada");
	private Map<String, Atributo> atributos;
	private Map<String, Metodo> metodos;
	private List<Metodo> construtores;
	private Metodo destrutor;
	
	public Classe(String nome) {
		super(nome);
		atributos = new HashMap<String, Atributo>();
		metodos = new HashMap<String, Metodo>();
		construtores = new LinkedList<Metodo>();
	}
	
	public boolean definirConstrutor(Metodo construtor) {
		if (fornecerNome().equals(construtor.fornecerNome())) {
			construtores.add(construtor);
			return true;
		}
		return false;
	}
	
	public boolean definirDestrutor(Metodo destrutor) {
		if (this.destrutor == null) {
			this.destrutor = destrutor;
			return true;
		}
		return false;
	}
	
	public boolean instanciar(List<Tipo> tiposDosParametros) {
		Iterator<Metodo> iteradorDeConstrutores = construtores.iterator();
		while (iteradorDeConstrutores.hasNext()) {
			if (iteradorDeConstrutores.next().chamar(tiposDosParametros)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean destruir() {
		if (destrutor != null) {
			return true;
		}
		return false;
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

