package br.ufsc.inf.ine5426.caneca.maquina;

import java.util.Stack;

public final class CodigoDefinirContexto extends CodigoAbstrato {
	String nome;
	
	public CodigoDefinirContexto(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void executar(Stack<Valor> pilhaDeDados, Stack<Codigo> pilhaDeExecucao, Stack<Contexto> pilhaDeContextos) {
		Contexto contextoFilho = pilhaDeContextos.pop();
		pilhaDeContextos.peek().definirContexto(nome, contextoFilho);
		pilhaDeContextos.push(contextoFilho);
	}
	
	@Override
	public String comoTexto() {
		return String.format("definirContexto %s", nome);
	}
}
