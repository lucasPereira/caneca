package br.ufsc.inf.ine5426.caneca.interno;

public final class Metodo extends Procedimento<Metodo> {
	private Tipo tipo;
	
	public Metodo(Classe classe, Tipo tipo, String nome, int linha, int coluna) {
		super(classe, nome, linha, coluna);
		this.tipo = tipo;
	}
}

