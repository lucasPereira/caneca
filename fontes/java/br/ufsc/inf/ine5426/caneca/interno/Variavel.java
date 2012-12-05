package br.ufsc.inf.ine5426.caneca.interno;

public final class Variavel implements Simbolo {
	private EscopoLocal dono;
	private Tipo tipo;
	private String nome;
	private int linha;
	private int coluna;
	
	public Variavel(EscopoLocal dono, Tipo tipo, String nome, int linha, int coluna) {
		this.dono = dono;
		this.tipo = tipo;
		this.nome = nome;
		this.linha = linha;
		this.coluna = coluna;
	}
	
	public boolean mesmoTipo(Variavel outra) {
		return tipo.mesmoQue(outra.tipo);
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

