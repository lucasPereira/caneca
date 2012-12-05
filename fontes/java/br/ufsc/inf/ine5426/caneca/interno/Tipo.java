package br.ufsc.inf.ine5426.caneca.interno;

public final class Tipo {
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

