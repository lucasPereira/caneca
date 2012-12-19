package br.ufsc.inf.ine5426.caneca.maquina;

import br.ufsc.inf.ine5426.caneca.interno.ExpressaoInstanciacao;
import br.ufsc.inf.ine5426.caneca.interno.TabelaDeSimbolos;
import br.ufsc.inf.ine5426.caneca.interno.Tipo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Stack;

public class MaquinaCaneca {
	private Stack<Valor> pilhaDeDados;
	private Stack<Codigo> pilhaDeExecucao;
	private Stack<Contexto> pilhaDeContextos;
	
	public MaquinaCaneca() {
		pilhaDeDados = new Stack<Valor>();
		pilhaDeExecucao = new Stack<Codigo>();
		pilhaDeContextos = new Stack<Contexto>();
	}
	
	public void gerarCodigo(TabelaDeSimbolos tabelaDeSimbolos, String nomeDaClassePrincipal) {
		List<Codigo> codigoCarregado = new LinkedList<Codigo>();
		tabelaDeSimbolos.gerarCodigo(codigoCarregado);
		codigoCarregado.add(new CodigoInstanciar(nomeDaClassePrincipal));
		codigoCarregado.add(new CodigoExtrairContexto());
		codigoCarregado.add(new CodigoChamar("construtor"));
		codigoCarregado.add(new CodigoFecharContexto());
		for (Codigo codigo : codigoCarregado) {
			System.out.println(codigo.comoTexto());
		}
		ListIterator<Codigo> iterador = codigoCarregado.listIterator(codigoCarregado.size());
		while (iterador.hasPrevious()) {
			pilhaDeExecucao.push(iterador.previous());
		}
	}
	
	public void executar() {
		System.out.println();
		pilhaDeContextos.push(new Contexto());
		while (!pilhaDeExecucao.empty()) {
			Codigo codigo = pilhaDeExecucao.pop();
			System.out.println(codigo.comoTexto());
			codigo.executar(pilhaDeDados, pilhaDeExecucao, pilhaDeContextos);
		}
	}
}
