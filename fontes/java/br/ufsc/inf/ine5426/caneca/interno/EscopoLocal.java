package br.ufsc.inf.ine5426.caneca.interno;

public interface EscopoLocal {
	public boolean definirVariavel(Variavel variavel);
	
	public EscopoLocal fornecerEscopoPai();
}

