package br.ufsc.inf.ine5426.caneca.maquina;

public abstract class ValorAbstrato implements Valor {
	private String nome;
	private Contexto contextoPai;
	
	@Override
	public void fixarNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void fixarContextoPai(Contexto contextoPai) {
		this.contextoPai = contextoPai;
	}
	
	@Override
	public Referencia fornecerComoReferencia() {
		if (contextoPai != null) {
			return new Referencia(nome, contextoPai);
		}
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String fornecerComoTexto() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public char fornecerComoCaractere() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public boolean fornecerComoBooleano() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public int fornecerComoInteiro() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public double fornecerComoReal() {
		throw new UnsupportedOperationException();
	}
}
