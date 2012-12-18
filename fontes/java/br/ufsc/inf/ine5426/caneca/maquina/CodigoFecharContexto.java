package br.ufsc.inf.ine5426.caneca.maquina;

public class CodigoFecharContexto implements Codigo {
	public CodigoFecharContexto() {
		
	}
	
	@Override
	public void executar(Stack<Valor> pilhaDeDados, Stack<Comando> pilhaDeExecucao, Stack<Contexto> pilhaDeContextos) {
		pilhaDeContextos.pop();
	}
	
	@Override
	public String comoTexto() {
		return String.format("fecharContexto");
	}
}
