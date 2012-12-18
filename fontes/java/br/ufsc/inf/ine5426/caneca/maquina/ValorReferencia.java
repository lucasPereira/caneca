package br.ufsc.inf.ine5426.caneca.maquina;

public final class ValorReferencia extends ValorAbstrato {
	private String nome;
	private Contexto contexto;
	
	public ValorReferencia(String nome, Contexto contexto) {
		this.nome = nome;
		this.contexto = contexto;
	}
	
	@Override
	public Contexto fornecerComoContexto() {
		return contexto;
	}
}
