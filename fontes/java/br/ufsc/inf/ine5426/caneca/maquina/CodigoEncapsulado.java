package br.ufsc.inf.ine5426.caneca.maquina;

import java.util.Stack;

public final class CodigoEncapsulado extends CodigoAbstrato {
	private Codigo codigo;
	
	public CodigoEncapsulado(Codigo codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public void executar(Stack<Valor> pilhaDeDados, Stack<Codigo> pilhaDeExecucao, Stack<Contexto> pilhaDeContextos) {
		pilhaDeContextos.peek().adicionarCodigo(codigo);
	}
	
	@Override
	public String comoTexto() {
		return String.format("encapsular %s", codigo.comoTexto());
	}
}
