package br.ufsc.inf.ine5426.caneca.maquina;

public interface Codigo {
	public void executar(Stack<Valor> pilhaDeDados, Stack<Comando> pilhaDeExecucao, Stack<Contexto> pilhaDeContextos);
	
	public String comoTexto();
}
