package br.ufsc.inf.ine5426.caneca.maquina;

public final class CodigoAtribuir implements Codigo {
	public CodigoResolverSimbolo() {
		
	}
	
	@Override
	public void executar(MaquinaCaneca maquina) {
		Referencia referencia = maquina.pilhaDeDados.pop().fornecerComoReferencia();
		Valor valor = maquina.pilhaDeDados.pop();
		maquina.pilhaDeContextos.peek().atualizarSimbolo(referencia.fornecerNome(), valor);
		maquina.pilhaDeDados.push(valor);
	}
	
	@Override
	public String comoTexto() {
		return String.format("atribuir");
	}
}
