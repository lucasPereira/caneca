package br.ufsc.inf.ine5426.caneca.maquina;

public abstract class ValorAbstrato implements Valor {
	@Override
	public String fornecerComoTexto() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public char fornecerComoCaractere() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public boolean fornecerComoBooleano() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public int fornecerComoInteiro() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public double fornecerComoReal() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String fornecerComoIdentificador() {
		throw new UnsupportedOperationException();
	}
}
