package br.ufsc.inf.ine5426.caneca.interno;

public class ExcecaoCaneca extends RuntimeException {
	private String mensagem;
	
	public ExcecaoCaneca() {
		
	}
	
	public ExcecaoCaneca(String mensagem) {
		super(mensagem);
		this.mensagem = mensagem;
	}
	
	public String fornecerMensagem() {
		return mensagem;
	}
}

