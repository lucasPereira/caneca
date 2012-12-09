package br.ufsc.inf.ine5426.caneca.interno;

public final class Atributo implements Simbolo {
	private Escopo escopoPai;
	private Tipo tipo;
	private String nome;
	private int linha;
	private int coluna;
	
	public Atributo(Escopo escopoPai, Tipo tipo, String nome, int linha, int coluna) {
		this.escopoPai = escopoPai;
		this.tipo = tipo;
		this.nome = nome;
		this.linha = linha;
		this.coluna = coluna;
	}
	
	public boolean mesmoTipo(Atributo outro) {
		return tipo.mesmoQue(outro.tipo);
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

