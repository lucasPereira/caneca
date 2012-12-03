package br.ufsc.inf.ine5426.caneca.interno;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Tipo {
	private String nome;
	private int linha;
	private int coluna;
	private List<Tipo> tiposAninhados;
	
	public Tipo(String nome) {
		this(nome, 0, 0);
	}
	
	public Tipo(String nome, int linha, int coluna) {
		this.nome = nome;
		this.linha = linha;
		this.coluna = coluna;
		tiposAninhados = new LinkedList<Tipo>();
	}
	
	public void adicionarTipoAninhado(Tipo tipo) {
		tiposAninhados.add(tipo);
	}
	
	public String fornecerNome() {
		return nome;
	}
	public int fornecerLinha() {
		return linha;
	}
	
	public int fornecerColuna() {
		return coluna;
	}
	
	@Override
	public boolean equals(Object outro) {
		if (outro instanceof Tipo) {
			Tipo outroTipo = (Tipo) outro;
			if (tiposAninhados.size() == outroTipo.tiposAninhados.size()) {
				Iterator<Tipo> iterador = tiposAninhados.iterator();
				Iterator<Tipo> iteradorDoOutro = outroTipo.tiposAninhados.iterator();
				while (iterador.hasNext()) {
					if (!iterador.next().equals(iteradorDoOutro.next())) {
						return false;
					}
				}
				return nome.equals(outroTipo.nome);
			}
			return false;
		}
		return false;
	}
}

