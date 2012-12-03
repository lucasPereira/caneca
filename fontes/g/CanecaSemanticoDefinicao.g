tree grammar CanecaSemanticoDefinicao;

options {
	ASTLabelType = CommonTree;
	tokenVocab = CanecaArvore;
	filter = true;
}

@header {
	package br.ufsc.inf.ine5426.caneca.antlr;
	
	import br.ufsc.inf.ine5426.caneca.interno.Atributo;
	import br.ufsc.inf.ine5426.caneca.interno.Bloco;
	import br.ufsc.inf.ine5426.caneca.interno.Classe;
	import br.ufsc.inf.ine5426.caneca.interno.Escopo;
	import br.ufsc.inf.ine5426.caneca.interno.Metodo;
	import br.ufsc.inf.ine5426.caneca.interno.Reporter;
	import br.ufsc.inf.ine5426.caneca.interno.TabelaDeSimbolos;
	import br.ufsc.inf.ine5426.caneca.interno.Variavel;
	
	import java.util.Queue;
}

@members {
	private TabelaDeSimbolos tabelaDeSimbolos;
	private Escopo escopoAtual;
	private Queue<Escopo> filaDeEscopos;
	
	public void fixarTabelaDeSimbolos(TabelaDeSimbolos tabelaDeSimbolos) {
		this.tabelaDeSimbolos = tabelaDeSimbolos;
		this.escopoAtual = tabelaDeSimbolos;
	}
	
	public void fixarFilaDeEscopos(Queue<Escopo> filaDeEscopos) {
		this.filaDeEscopos = filaDeEscopos;
	}
	
	public <T extends Escopo> void reportarDefinicao(Boolean definido, String nomeDoMembro, T membro, String tipoDoSimbolo, int linha, int coluna) {
		String mensagem = null;
		if (!definido) {
			mensagem = "[\%s] [\%s, \%s] [\%s] \%s já definido.";
		} else {
			mensagem = "[\%s] [\%s, \%s] [\%s] \%s definido.";
		}
		Reporter.fornecerInstancia().reportarSucesso(String.format(mensagem, escopoAtual.fornecerNome(), linha, coluna, tipoDoSimbolo, nomeDoMembro), membro);
	}
}

topdown 
	: iniciarClasse
	| iniciarMetodo
	| iniciarConstrutor
	| iniciarDestrutor
	| iniciarBloco
	| declaracao
	| declaracaoDeAtributo
	;

bottomup
	: terminarClasse
	| terminarMetodo
	| terminarConstrutor
	| terminarDestrutor
	| terminarBloco
	;

iniciarClasse
	: ^(CLASSE_ . IDENTIFICADOR . . .)
		{
			Classe classe = new Classe($IDENTIFICADOR.text);
			boolean classeDefinida = escopoAtual.definirClasse(classe);
			reportarDefinicao(classeDefinida, $IDENTIFICADOR.text, classe, "classe", $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
			classe.abrir(escopoAtual);
			escopoAtual = classe;
			filaDeEscopos.add(escopoAtual);
			Atributo esse = new Atributo("esse", $IDENTIFICADOR.text);
			Atributo essa = new Atributo("essa", $IDENTIFICADOR.text);
			boolean esseDefinido = classe.definirAtributo(esse);
			boolean essaDefinida = classe.definirAtributo(essa);
			reportarDefinicao(esseDefinido, "esse", esse, "atributo", $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
			reportarDefinicao(essaDefinida, "esse", essa, "atributo", $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
			esse.abrir(escopoAtual);
			esse.fechar();
			essa.abrir(escopoAtual);
			esse.fechar();
		}
	;

terminarClasse
	: CLASSE_
		{
			escopoAtual = escopoAtual.fechar();
			filaDeEscopos.add(escopoAtual);
		}
	;

iniciarMetodo
	: ^(METODO_ ^(ASSINATURA_ . (ESTATICO)? tipo IDENTIFICADOR .) .)
		{
			Metodo metodo = new Metodo($IDENTIFICADOR.text, $tipo.umTipo);
			boolean definido = escopoAtual.definirMetodo(metodo);
			reportarDefinicao(definido, $IDENTIFICADOR.text, metodo, "metodo", $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
			metodo.abrir(escopoAtual);
			escopoAtual = metodo;
			filaDeEscopos.add(escopoAtual);
		}
	;

terminarMetodo
	: METODO_
		{
			escopoAtual = escopoAtual.fechar();
			filaDeEscopos.add(escopoAtual);
		}
	;

iniciarConstrutor
	: ^(CONSTRUTOR_ ^(ASSINATURA_ . IDENTIFICADOR .) .)
		{
		}
	;

terminarConstrutor
	: CONSTRUTOR_
		{
		}
	;

iniciarDestrutor
	: ^(DESTRUTOR_ ^(ASSINATURA_ . IDENTIFICADOR .) .)
		{
		}
	;

terminarDestrutor
	: DESTRUTOR_
		{
		}
	;

iniciarBloco
	: ^(INSTRUCOES_ (.)*)
		{
			if ($INSTRUCOES_.hasAncestor(METODO_)) {
				Bloco bloco = new Bloco();
				bloco.abrir(escopoAtual);
				escopoAtual = bloco;
				filaDeEscopos.add(escopoAtual);
			}
		}
	;

terminarBloco
	: INSTRUCOES_
		{
			if ($INSTRUCOES_.hasAncestor(METODO_)) {
				escopoAtual = escopoAtual.fechar();
				filaDeEscopos.add(escopoAtual);
			}
		}
	;

declaracao
	: ^(DECLARACAO_ tipo IDENTIFICADOR)
		{
			Variavel variavel = new Variavel($IDENTIFICADOR.text, $tipo.umTipo, $IDENTIFICADOR.getTokenStartIndex());
			boolean definido = escopoAtual.definirVariavel(variavel);
			reportarDefinicao(definido, $IDENTIFICADOR.text, variavel, "variavel", $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
			variavel.abrir(escopoAtual);
			variavel.fechar();
		}
	;

declaracaoDeAtributo
	: ^(ATRIBUTO_ . (ESTATICO)? tipo IDENTIFICADOR (.)?)
		{
			Atributo atributo = new Atributo($IDENTIFICADOR.text, $tipo.umTipo);
			boolean definido = escopoAtual.definirAtributo(atributo);
			reportarDefinicao(definido, $IDENTIFICADOR.text, atributo, "atributo", $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
			atributo.abrir(escopoAtual);
			atributo.fechar();
		}
	;

tipo returns [String umTipo]
	: ^(TIPO_ IDENTIFICADOR
		{
			umTipo = $IDENTIFICADOR.text;
		}
	 listaDeTipos[umTipo])
	;

listaDeTipos[String tipoPai]
	: ^(TIPOS_ (tipo
		{
		}
	 )*)
	;

