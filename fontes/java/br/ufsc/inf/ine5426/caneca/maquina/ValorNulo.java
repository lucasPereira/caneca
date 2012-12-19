package br.ufsc.inf.ine5426.caneca.maquina;

public final class ValorNulo extends ValorAbstrato {
	public static ValorNulo PADRAO = new ValorNulo();
	
	public ValorNulo() {
		
	}
	
	@Override
	public String comoTexto() {
		return "nulo";
	}
}
