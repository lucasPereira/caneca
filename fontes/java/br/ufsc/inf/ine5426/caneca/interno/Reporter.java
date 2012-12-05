package br.ufsc.inf.ine5426.caneca.interno;

public final class Reporter {
	private static Reporter INSTANCIA;
	private int errosDeDefinicao;
	
	public static Reporter instancia() {
		return (INSTANCIA == null) ? (INSTANCIA = new Reporter()) : INSTANCIA;
	}
	
	private Reporter() {
		errosDeDefinicao = 0;
	}
	
	public void reportarDefinicaoDeClasse(Classe classe) {
		mostrarMensagem("Definição de classe.",
				classe.fornecerNome(), classe.fornecerLinha(), classe.fornecerColuna());
	}
	
	public void reportarDefinicaoDeAtributo(Atributo atributo) {
		mostrarMensagem("Definição de atributo.",
				atributo.fornecerNome(), atributo.fornecerLinha(), atributo.fornecerColuna());
	}
	
	public void reportarDefinicaoDeMetodo(Metodo metodo) {
		mostrarMensagem("Definição de metodo.",
				metodo.fornecerNome(), metodo.fornecerLinha(), metodo.fornecerColuna());
	}
	
	public void reportarDefinicaoDeConstrutor(Construtor construtor) {
		mostrarMensagem("Definição de construtor.",
				construtor.fornecerNome(), construtor.fornecerLinha(), construtor.fornecerColuna());
	}
	
	public void reportarDefinicaoDeDestrutor(Destrutor destrutor) {
		mostrarMensagem("Definição de destrutor.",
				destrutor.fornecerNome(), destrutor.fornecerLinha(), destrutor.fornecerColuna());
	}
	
	public void reportarDefinicaoDeVariavel(Variavel variavel) {
		mostrarMensagem("Definição de variavel.",
				variavel.fornecerNome(), variavel.fornecerLinha(), variavel.fornecerColuna());
	}
	
	public void reportarErroDeDefinicaoRepetidaDeClasse(Classe classe) {
		errosDeDefinicao++;
		mostrarMensagemDeErro("Definição repetida de classe.",
				classe.fornecerNome(), classe.fornecerLinha(), classe.fornecerColuna());
	}
	
	public void reportarErroDeDefinicaoRepetidaDeAtributo(Atributo atributo) {
		errosDeDefinicao++;
		mostrarMensagemDeErro("Definição repetida de atributo.",
				atributo.fornecerNome(), atributo.fornecerLinha(), atributo.fornecerColuna());
	}
	
	public void reportarErroDeDefinicaoRepetidaDeMetodo(Metodo metodo) {
		errosDeDefinicao++;
		mostrarMensagemDeErro("Definição repetida de método.",
				metodo.fornecerNome(), metodo.fornecerLinha(), metodo.fornecerColuna());
	}
	
	public void reportarErroDeDefinicaoRepetidaDeConstrutor(Construtor construtor) {
		errosDeDefinicao++;
		mostrarMensagemDeErro("Definição repetida de construtor.",
				construtor.fornecerNome(), construtor.fornecerLinha(), construtor.fornecerColuna());
	}
	
	public void reportarErroDeDefinicaoRepetidaDeVariavel(Variavel variavel) {
		errosDeDefinicao++;
		mostrarMensagemDeErro("Definição repetida de variável.",
				variavel.fornecerNome(), variavel.fornecerLinha(), variavel.fornecerColuna());
	}
	
	public void reportarErroDeDefinicaoDeNomeErradoDeConstrutor(Construtor construtor) {
		errosDeDefinicao++;
		mostrarMensagemDeErro("Definição de nome errado do construtor. O nome deve ser o mesmo da classe.",
				construtor.fornecerNome(), construtor.fornecerLinha(), construtor.fornecerColuna());
	}
	
	public void reportarErroDeDefinicaoDeNomeErradoDeDestrutor(Destrutor destrutor) {
		errosDeDefinicao++;
		mostrarMensagemDeErro("Definição de nome errado do destrutor. O nome deve ser o mesmo da classe.",
				destrutor.fornecerNome(), destrutor.fornecerLinha(), destrutor.fornecerColuna());
	}
	
	public void reportarErroLexicoSintatico() {
		mostrarMensagemDeErro("Existem erros léxicos e/ou sintáticos. Corrija os erros antes de continuar a análise semântica.");
	}
	
	private void mostrarMensagemDeErro(String mensagem) {
		System.out.println(String.format("[Erro] %s", mensagem));
	}
	
	private void mostrarMensagemDeErro(String mensagem, String nome, int linha, int coluna) {
		System.out.println(String.format("[Erro] [%s] [%s, %s] %s", nome, linha, coluna, mensagem));
	}
	
	private void mostrarMensagem(String mensagem, String nome, int linha, int coluna) {
		System.out.println(String.format("[Sucesso] [%s] [%s, %s] %s", nome, linha, coluna, mensagem));
	}
}

