package br.ufsc.inf.ine5426.caneca.maquina;

import java.util.Stack;

public final class CodigoFecharContexto extends CodigoAbstrato {
	public CodigoFecharContexto() {
		
	}
	
	@Override
	public void executar(Stack<Valor> pilhaDeDados, Stack<Codigo> pilhaDeExecucao, Stack<Contexto> pilhaDeContextos) {
		pilhaDeContextos.pop();
	}
	
	@Override
	public String comoTexto() {
		return String.format("fecharContexto");
	}
}
