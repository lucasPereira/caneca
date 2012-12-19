package br.ufsc.inf.ine5426.caneca.maquina;

import java.util.Stack;

public final class CodigoResolverSimbolo extends CodigoAbstrato {
	private String nome;
	
	public CodigoResolverSimbolo(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void executar(Stack<Valor> pilhaDeDados, Stack<Codigo> pilhaDeExecucao, Stack<Contexto> pilhaDeContextos) {
		pilhaDeDados.push(pilhaDeContextos.peek().resolverSimbolo(nome));
	}
	
	@Override
	public String comoTexto() {
		return String.format("resolverSimbolo %s", nome);
	}
}
