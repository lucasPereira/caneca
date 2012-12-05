package br.ufsc.inf.ine5426.caneca.interno;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class Procedimento<T> implements EscopoLocal, Simbolo {
	private Map<String, Variavel> argumentos;
	private Classe classe;
	private String nome;
	private int linha;
	private int coluna;
	
	public Procedimento(Classe classe, String nome, int linha, int coluna) {
		this.classe = classe;
		this.nome = nome;
		this.linha = linha;
		this.coluna = coluna;
		argumentos = new HashMap<String, Variavel>();
	}
	
	public final boolean mesmaAssinatura(Procedimento<T> outro) {
		if (argumentos.size() == outro.argumentos.size()) {
			Iterator<Variavel> iterador = argumentos.values().iterator();
			Iterator<Variavel> iteradorDoOutro = outro.argumentos.values().iterator();
			boolean mesmaAssinatura = true;
			while (iterador.hasNext() && mesmaAssinatura) {
				if (!iterador.next().mesmoTipo(iteradorDoOutro.next())) {
					mesmaAssinatura = false;
				}
			}
			return mesmaAssinatura;
		}
		return false;
	}
	
	@Override
	public final boolean definirVariavel(Variavel variavel) {
		if (argumentos.containsKey(variavel.fornecerNome())) {
			Reporter.instancia().reportarErroDeDefinicaoRepetidaDeVariavel(variavel);
			return false;
		}
		argumentos.put(variavel.fornecerNome(), variavel);
		return true;
	}
	
	@Override
	public final EscopoLocal fornecerEscopoPai() {
		return null;
	}
	
	@Override
	public final String fornecerNome() {
		return nome;
	}
	
	@Override
	public final int fornecerLinha() {
		return linha;
	}
	
	@Override
	public final int fornecerColuna() {
		return coluna;
	}
}

