package br.ufsc.inf.ine5426.caneca;

import br.ufsc.inf.ine5426.caneca.Simbolo;
import java.util.Map;
import java.util.HashMap;

public final class Escopo {
	private Escopo escopoPai;
	private Map<String, Simbolo> simbolos;
	
	public Escopo() {
		this(null);
	}
	
	public Escopo(Escopo escopoPai) {
		this.simbolos = new HashMap<String, Simbolo>();
		this.entrar(escopoPai);
	}
	
	public void entrar(Escopo escopoPai) {
		this.escopoPai = escopoPai;
	}
	
	public void declarar(Simbolo simbolo) {
		this.simbolos.put(simbolo.fornecerNome(), simbolo);
	}
	
	public Simbolo resolver(String nomeDoSimbolo) {
		Simbolo simboloEncontrado = simbolos.get(nomeDoSimbolo);
		if (simboloEncontrado == null && this.escopoPai != null) {
			return this.escopoPai.resolver(nomeDoSimbolo);
		}
		return simboloEncontrado;
	}
	
	public Escopo sair() {
		return this.escopoPai;
	}
}

