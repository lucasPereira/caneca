package br.ufsc.inf.ine5426.caneca.maquina;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Contexto {
	private Map<String, Valor> simbolos;
	private Map<String, Contexto> procedimentos;
	private List<Codigo> codigos;
	
	public Contexto(Contexto escopoPai) {
		simbolos = new HashMap<String, Valor>();
		procedimentos = new HashMap<String, List<Codigo>>();
	}
	
	public void definirSimbolo(String nome, Valor valor) {
		simbolos.put(nome, valor);
	}
	
	public void atualizarSimbolo(String nome, Valor valor) {
		if (simbolos.containsKey(nome)) {
			simbolos.put(nome, valor);
		} else if (escopoPai != null) {
			escopoPai.atualizarSimbolo(nome, valor);
		}
	}
	
	public Valor resolverSimbolo(String nome) {
		Valor valor = simbolos.get(nome);
		if (valor == null && escopoPai != null) {
			valor = escopoPai.resolverSimbolo(nome);
		}
		return valor;
	}
	
	public void definirProcedimento(String nome) {
		procedimentos.put(nome, new LinkedList<Codigo>());
	}
	
	public void adicionarCodigo(Codigo codigo) {
		codigos.add(codigo);
	}
	
	public List<Codigo> resolverProcedimento(String nome) {
		List<Codigo> procedimento = procedimentos.get(nome);
		if (procedimento == null && escopoPai != null) {
			procedimento = escopoPai.resolverProcedimento(nome);
		}
		return procedimento;
	}
}
