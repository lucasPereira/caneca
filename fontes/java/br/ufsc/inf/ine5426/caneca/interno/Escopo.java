package br.ufsc.inf.ine5426.caneca.interno;

public interface Escopo {
	public boolean definirVariavel(Variavel variavel);
	
	public boolean definirBloco(Bloco bloco);
	
	public boolean definirInstrucao(Instrucao instrucao);
	
	public boolean definirExpressao(Expressao expressao);
	
	public Escopo fornecerEscopoPai();
}
