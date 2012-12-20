package br.ufsc.inf.ine5426.caneca.maquina;

import br.ufsc.inf.ine5426.caneca.interno.ExpressaoInstanciacao;
import br.ufsc.inf.ine5426.caneca.interno.TabelaDeSimbolos;
import br.ufsc.inf.ine5426.caneca.interno.Tipo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Stack;

public class MaquinaCaneca {
	protected Contexto areaDeDados = new Contexto();
	protected ArrayList<Codigo> areaDeCodigo;
	protected Stack<Valor> pilhaDeDados;
	protected Stack<Contexto> pilhaDeContextos;
	protected Stack<Integer> pilhaDeExecucao;
	protected Integer contadorDePrograma;
	
	public MaquinaCaneca() {
		areaDeDados = new Contexto();
		areaDeCodigo = new ArrayList<Codigo>();
		pilhaDeDados = new Stack<Valor>();
		pilhaDeExecucao = new Stack<Integer>();
		pilhaDeContextos = new Stack<Contexto>();
		contadorDePrograma = 0;
	}
	
	public void gerarCodigo(TabelaDeSimbolos tabelaDeSimbolos, String nomeDaClassePrincipal) {
		tabelaDeSimbolos.gerarCodigo(areaDeCodigo, areaDeDados);
		for (Codigo codigo : areaDeCodigo) {
			System.out.println(codigo.comoTexto());
		}
	}
	
	public void executar() {
		pilhaDeContextos.push(areaDeDados);
		pilhaDeExecucao.push(0);
	}
}
