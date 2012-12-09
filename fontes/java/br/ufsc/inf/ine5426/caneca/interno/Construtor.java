package br.ufsc.inf.ine5426.caneca.interno;

public final class Construtor extends Procedimento<Construtor> {
	public Construtor(Escopo escopoPai, String nome, int linha, int coluna) {
		super(escopoPai, nome, linha, coluna);
	}
	
	@Override
	public String comoTexto() {
		return String.format("c:%s", fornecerNome());
	}
}
