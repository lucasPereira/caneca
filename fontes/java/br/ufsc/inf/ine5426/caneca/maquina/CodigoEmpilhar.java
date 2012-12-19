package br.ufsc.inf.ine5426.caneca.maquina;

import java.util.Stack;

public final class CodigoEmpilhar extends CodigoAbstrato {
	private Valor valor;
	
	public CodigoEmpilhar(Valor valor) {
		this.valor = valor;
	}
	
	@Override
	public void executar(Stack<Valor> pilhaDeDados, Stack<Codigo> pilhaDeExecucao, Stack<Contexto> pilhaDeContextos) {
		pilhaDeDados.push(valor);
	}
	
	@Override
	public String comoTexto() {
		return String.format("empilhar %s", valor.comoTexto());
	}
}
