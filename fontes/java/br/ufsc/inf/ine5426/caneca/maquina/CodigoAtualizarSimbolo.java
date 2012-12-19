package br.ufsc.inf.ine5426.caneca.maquina;

import java.util.Stack;

public final class CodigoAtualizarSimbolo extends CodigoAbstrato {
	public CodigoAtualizarSimbolo() {
		
	}
	
	@Override
	public void executar(Stack<Valor> pilhaDeDados, Stack<Codigo> pilhaDeExecucao, Stack<Contexto> pilhaDeContextos) {
		Valor valor = pilhaDeDados.pop();
		Referencia referencia = pilhaDeDados.pop().fornecerComoReferencia();
		referencia.fornecerContextoPai().atualizarSimbolo(referencia.fornecerNome(), valor);
		pilhaDeDados.push(valor);
	}
	
	@Override
	public String comoTexto() {
		return String.format("atualizarSimbolo");
	}
}
