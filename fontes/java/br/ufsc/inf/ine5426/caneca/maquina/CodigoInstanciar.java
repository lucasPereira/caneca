package br.ufsc.inf.ine5426.caneca.maquina;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Stack;

public final class CodigoInstanciar extends CodigoAbstrato {
	String nomeDaClasse;
	
	public CodigoInstanciar(String nomeDaClasse) {
		this.nomeDaClasse = nomeDaClasse;
	}
	
	@Override
	public void executar(Stack<Valor> pilhaDeDados, Stack<Codigo> pilhaDeExecucao, Stack<Contexto> pilhaDeContextos) {
		Contexto contextoDaClasse = pilhaDeContextos.peek().resolverContexto(nomeDaClasse);
		Contexto contextoDoObjeto = new Contexto(contextoDaClasse);
		for (Map.Entry<String, Valor> simbolo : contextoDaClasse.fornecerSimbolos().entrySet()) {
			contextoDoObjeto.definirSimbolo(simbolo.getKey(), simbolo.getValue());
		}
		Referencia referencia = new ValorReferencia(contextoDoObjeto);
		pilhaDeDados.push(referencia);
		pilhaDeDados.push(referencia);
	}
	
	@Override
	public String comoTexto() {
		return String.format("instanciar %s", nomeDaClasse);
	}
}
