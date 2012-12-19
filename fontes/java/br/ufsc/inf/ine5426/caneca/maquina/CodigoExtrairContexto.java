package br.ufsc.inf.ine5426.caneca.maquina;

import java.util.Stack;

public final class CodigoExtrairContexto extends CodigoAbstrato {
	public CodigoExtrairContexto() {
		
	}
	
	@Override
	public void executar(Stack<Valor> pilhaDeDados, Stack<Codigo> pilhaDeExecucao, Stack<Contexto> pilhaDeContextos) {
		pilhaDeContextos.push(pilhaDeDados.pop().fornecerComoReferencia().fornecerContextoPai());
	}
	
	@Override
	public String comoTexto() {
		return String.format("extrairContexto");
	}
}
