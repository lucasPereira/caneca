package br.ufsc.inf.ine5426.caneca.interno;

public final class Destrutor extends Procedimento<Destrutor> {
	public Destrutor(Escopo escopoPai, String nome, int linha, int coluna) {
		super(escopoPai, nome, linha, coluna);
	}
	
	@Override
	public String comoTexto() {
		return String.format("d:%s", fornecerNome());
	}
}

