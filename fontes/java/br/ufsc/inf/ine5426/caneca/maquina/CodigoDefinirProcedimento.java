package br.ufsc.inf.ine5426.caneca.maquina;

public class CodigoDefinirContexto implements Codigo {
	String nome;
	
	public CodigoDefinirContexto(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void executar(Stack<Valor> pilhaDeDados, Stack<Comando> pilhaDeExecucao, Stack<Contexto> pilhaDeContextos) {
		Contexto contextoFilho = pilhaDeContextos.pop();
		pilhaDeContextos.peek().definirContexto(nome, contextoFilho);
	}
	
	@Override
	public String comoTexto() {
		return String.format("definirContexto %s", nome);
	}
}
