package br.ufsc.inf.ine5426.caneca.maquina;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public final class Contexto {
	private Contexto contextoPai;
	private Integer pontoDeEntrada;
	private Map<String, Valor> simbolos;
	private Map<String, Contexto> contextos;
	
	public Contexto(Contexto contextoPai, Integer pontoDeEntrada) {
		this.contextoPai = contextoPai;
		this.pontoDeEntrada = pontoDeEntrada;
		simbolos = new HashMap<String, Valor>();
		contextos = new HashMap<String, Contexto>();
	}
	
	public Contexto() {
		this(null, 0);
	}
	
	public Integer fornecerPontoDeEntrada() {
		return pontoDeEntrada;
	}
	
	public void definirSimbolo(String nome, Valor valor) {
		simbolos.put(nome, valor);
		valor.fixarNome(nome);
		valor.fixarContexto(this);
	}
	
	public void atualizarSimbolo(String nome, Valor valor) {
		if (simbolos.containsKey(nome)) {
			simbolos.put(nome, valor);
			valor.fixarNome(nome);
			valor.fixarContexto(this);
		} else if (contextoPai != null) {
			contextoPai.atualizarSimbolo(nome, valor);
		}
	}
	
	public Valor resolverSimbolo(String nome) {
		Valor valor = simbolos.get(nome);
		if (valor == null && contextoPai != null) {
			valor = contextoPai.resolverSimbolo(nome);
		}
		return valor;
	}
	
	public void definirContexto(String nome, Contexto contexto) {
		contextos.put(nome, contexto);
	}
	
	public Contexto resolverContexto(String nome) {
		Contexto contexto = contextos.get(nome);
		if (contexto == null && contextoPai != null) {
			contexto = contextoPai.resolverContexto(nome);
		}
		return contexto;
	}
	
	public Map<String, Valor> fornecerSimbolos() {
		return simbolos;
	}
}
