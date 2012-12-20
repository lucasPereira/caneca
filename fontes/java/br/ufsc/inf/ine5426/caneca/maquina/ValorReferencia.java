package br.ufsc.inf.ine5426.caneca.maquina;

public final class ValorReferencia extends ValorAbstrato {
	private String nome;
	private Contexto contexto;
	
	public ValorReferencia(String nome, Contexto contexto) {
		this.nome = nome;
		this.contexto = contexto;
		fixarNome(nome);
		fixarContexto(contexto);
	}
	
	public ValorReferencia(Contexto contexto) {
		this(null, contexto);
	}
	
	@Override
	public String fornecerComoTexto() {
		return contexto.resolverSimbolo(nome).fornecerComoTexto();
	}
	
	@Override
	public char fornecerComoCaractere() {
		return contexto.resolverSimbolo(nome).fornecerComoCaractere();
	}
	
	@Override
	public boolean fornecerComoBooleano() {
		return contexto.resolverSimbolo(nome).fornecerComoBooleano();
	}
	
	@Override
	public int fornecerComoInteiro() {
		return contexto.resolverSimbolo(nome).fornecerComoInteiro();
	}
	
	@Override
	public double fornecerComoReal() {
		return contexto.resolverSimbolo(nome).fornecerComoReal();
	}
	
	@Override
	public String comoTexto() {
		return String.format("referencia:%s", nome);
	}
}
