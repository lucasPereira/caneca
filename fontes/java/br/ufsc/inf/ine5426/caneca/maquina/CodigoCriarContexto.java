package br.ufsc.inf.ine5426.caneca.maquina;

import java.util.Stack;

public final class CodigoCriarContexto extends CodigoAbstrato {
	public CodigoCriarContexto() {
		
	}
	
	@Override
	public void executar(Stack<Valor> pilhaDeDados, Stack<Codigo> pilhaDeExecucao, Stack<Contexto> pilhaDeContextos) {
		pilhaDeContextos.push(new Contexto(pilhaDeContextos.peek()));
	}
	
	@Override
	public String comoTexto() {
		return String.format("criarContexto");
	}
}
