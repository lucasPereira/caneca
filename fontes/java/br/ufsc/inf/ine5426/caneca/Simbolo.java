package br.ufsc.inf.ine5426.caneca;

public abstract class Simbolo {
	private String nome;
	private String tipo;
	
	public Simbolo(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public final String fornecerNome() {
		return this.nome;
	}
	
	public final String fornecerTipo() {
		return this.tipo;
	}
	
	public final boolean mesmoSimbolo(Simbolo outro) {
		return (this.nome.equals(outro.nome) && this.tipo.equals(outro.nome));
	}
	
	public final boolean mesmoNome(Simbolo outro) {
		return (this.nome.equals(outro.nome));
	}
	
	@Override
	public boolean equals(Object outro) {
		if (outro instanceof Simbolo) {
			Simbolo outroSimbolo = (Simbolo) outro;
			return this.nome.equals(outroSimbolo.nome);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
}

