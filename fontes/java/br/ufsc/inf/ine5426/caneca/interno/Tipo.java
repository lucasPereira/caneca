package br.ufsc.inf.ine5426.caneca.interno;

public final class Tipo {
	public static final Tipo INTEIRO = new Tipo("Inteiro");
	public static final Tipo REAL = new Tipo("Real");
	public static final Tipo BOOLEANO = new Tipo("Booleano");
	public static final Tipo CARACTERE = new Tipo("Caractere");
	public static final Tipo TEXTO = new Tipo("Texto");
	public static final Tipo NADA = new Tipo("Nada");
	private String nomeDaClasse;
	
	public Tipo(String nomeDaClasse) {
		this.nomeDaClasse = nomeDaClasse;
	}
	
	public boolean mesmoQue(Tipo outroTipo) {
		return nomeDaClasse.equals(outroTipo.nomeDaClasse);
	}
	
	public boolean mesmoQueIndireto(Tipo outroTipo) {
		return mesmoQue(outroTipo);
	}
}

