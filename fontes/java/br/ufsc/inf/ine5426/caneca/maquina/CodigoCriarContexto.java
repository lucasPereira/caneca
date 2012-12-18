package br.ufsc.inf.ine5426.caneca.maquina;

public class CodigoCriarContexto implements Codigo {
	public CodigoCriarContexto() {
		
	}
	
	@Override
	public void executar(Stack<Valor> pilhaDeDados, Stack<Comando> pilhaDeExecucao, Stack<Contexto> pilhaDeContextos) {
		pilhaDeContextos.push(new Contexto(pilhaDeContextos.peek()));
	}
	
	@Override
	public String comoTexto() {
		return String.format("criarContexto");
	}
}
