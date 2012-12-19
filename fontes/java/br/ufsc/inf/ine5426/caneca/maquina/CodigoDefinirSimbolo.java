package br.ufsc.inf.ine5426.caneca.maquina;

import java.util.Stack;

public final class CodigoDefinirSimbolo extends CodigoAbstrato {
	String nome;
	
	public CodigoDefinirSimbolo(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void executar(Stack<Valor> pilhaDeDados, Stack<Codigo> pilhaDeExecucao, Stack<Contexto> pilhaDeContextos) {
		pilhaDeContextos.peek().definirSimbolo(nome, pilhaDeDados.pop());
	}
	
	@Override
	public String comoTexto() {
		return String.format("definirSimbolo %s", nome);
	}
}
