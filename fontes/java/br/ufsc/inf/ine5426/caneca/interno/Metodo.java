package br.ufsc.inf.ine5426.caneca.interno;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class Metodo extends EscopoAbstrato {
	public static final Metodo NAO_ENCONTRADO = new Metodo("metodoNaoEncontrado", null);
	private Map<String, Variavel> argumentos;
	
	public Metodo(String nome, Tipo tipo) {
		super(nome, tipo);
		argumentos = new HashMap<String, Variavel>();
	}
	
	public boolean chamar(List<Tipo> parametros) {
		if (parametros.size() == argumentos.size()) {
			Iterator<Entry<String, Variavel>> iteradorDeArgumentos = argumentos.entrySet().iterator();
			Iterator<Tipo> iteradorDeParametros = parametros.iterator();
			while (iteradorDeArgumentos.hasNext()) {
				if (!iteradorDeParametros.next().contido(iteradorDeArgumentos.next().getValue().fornecerTipo())) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	public int contarArgumentos() {
		return argumentos.size();
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

