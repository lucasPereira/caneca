package br.ufsc.inf.ine5426.caneca.maquina;

public final class ValorContexto extends ValorAbstrato {
	private String nome;
	private Contexto contexto;
	
	public ValorContexto(String nome, Contexto contexto) {
		this.nome = nome;
		this.contexto = contexto;
	}
	
	@Override
	public Contexto fornecerComoContexto() {
		return contexto;
	}
}
