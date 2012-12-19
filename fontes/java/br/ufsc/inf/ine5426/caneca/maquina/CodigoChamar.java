package br.ufsc.inf.ine5426.caneca.maquina;

import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public final class CodigoChamar extends CodigoAbstrato {
	String nome;
	
	public CodigoChamar(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void executar(Stack<Valor> pilhaDeDados, Stack<Codigo> pilhaDeExecucao, Stack<Contexto> pilhaDeContextos) {
		Contexto contexto = pilhaDeContextos.peek().resolverContexto(nome);
		List<Codigo> codigos = contexto.fornecerCodigos();
		ListIterator<Codigo> iterador = codigos.listIterator(codigos.size());
		while (iterador.hasPrevious()) {
			pilhaDeExecucao.push(iterador.previous());
		}
	}
	
	@Override
	public String comoTexto() {
		return String.format("chamar %s", nome);
	}
}
