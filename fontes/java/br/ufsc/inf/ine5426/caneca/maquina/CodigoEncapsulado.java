package br.ufsc.inf.ine5426.caneca.maquina;

public class CodigoEncapsulado implements Codigo {
	private Codigo codigo;
	
	public CodigoEncapsulado(codigo codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public void executar(Stack<Valor> pilhaDeDados, Stack<Comando> pilhaDeExecucao, Stack<Contexto> pilhaDeContextos) {
		pilhaDeContextos.peek().adicionarCodigo(codigo);
	}
	
	@Override
	public String comoTexto() {
		return String.format("encapsular %s", codigo.comoTexto());
	}
}
