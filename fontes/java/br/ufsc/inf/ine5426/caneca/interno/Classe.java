package br.ufsc.inf.ine5426.caneca.interno;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class Classe implements Simbolo {
	private Map<String, Atributo> atributos;
	private Map<String, Metodo> metodos;
	private List<Construtor> construtores;
	private Destrutor destrutor;
	private String nome;
	private int linha;
	private int coluna;
	
	public Classe(String nome, int linha, int coluna) {
		this.nome = nome;
		this.linha = linha;
		this.coluna = coluna;
		atributos = new HashMap<String, Atributo>();
		metodos = new HashMap<String, Metodo>();
		construtores = new LinkedList<Construtor>();
	}
	
	public boolean definirAtributo(Atributo atributo) {
		if (atributos.containsKey(atributo.fornecerNome())) {
			Reporter.instancia().reportarErroDeDefinicaoRepetidaDeAtributo(atributo);
			return false;
		}
		atributos.put(atributo.fornecerNome(), atributo);
		Reporter.instancia().reportarDefinicaoDeAtributo(atributo);
		return true;
	}
	
	public boolean definirConstrutor(Construtor construtor) {
		if (!nome.equals(construtor.fornecerNome())) {
			Reporter.instancia().reportarErroDeDefinicaoDeNomeErradoDeConstrutor(construtor);
			return false;
		}
		/*
		Iterator<Construtor> iteradorDeConstrutores = construtores.iterator();
		while (iteradorDeConstrutores.hasNext()) {
			if (iteradorDeConstrutores.next().mesmaAssinatura(construtor)) {
				Reporter.instancia().reportarErroDeDefinicaoRepetidaDeConstrutor(construtor);
				return false;
			}
		}
		*/
		construtores.add(construtor);
		Reporter.instancia().reportarDefinicaoDeConstrutor(construtor);
		return true;
	}
	
	public boolean definirDestrutor(Destrutor destrutor) {
		if (!nome.equals(destrutor.fornecerNome())) {
			Reporter.instancia().reportarErroDeDefinicaoDeNomeErradoDeDestrutor(destrutor);
			return false;
		}
		this.destrutor = destrutor;
		Reporter.instancia().reportarDefinicaoDeDestrutor(destrutor);
		return true;
	}
	
	public boolean definirMetodo(Metodo metodo) {
		if (metodos.containsKey(metodo.fornecerNome())) {
			Reporter.instancia().reportarErroDeDefinicaoRepetidaDeMetodo(metodo);
			return false;
		}
		metodos.put(metodo.fornecerNome(), metodo);
		Reporter.instancia().reportarDefinicaoDeMetodo(metodo);
		return true;
	}
	
	@Override
	public String fornecerNome() {
		return nome;
	}
	
	@Override
	public int fornecerLinha() {
		return linha;
	}
	
	@Override
	public int fornecerColuna() {
		return coluna;
	}
}

