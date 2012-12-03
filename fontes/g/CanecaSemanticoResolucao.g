tree grammar CanecaSemanticoResolucao;

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
	private Escopo escopoAtual;
	private Escopo referencia;
	private Queue<Escopo> filaDeEscopos;
	
	public void fixarFilaDeEscopos(Queue<Escopo> filaDeEscopos) {
		this.filaDeEscopos = filaDeEscopos;
		this.escopoAtual = filaDeEscopos.poll();
	}
	
	public <T extends Escopo> void reportarResolucao(String nomeDoMembro, T membro, String tipoDoSimbolo, int linha, int coluna) {
		String mensagem = null;
		if (membro == Classe.NAO_ENCONTRADA ||
					membro == Atributo.NAO_ENCONTRADO ||
					membro == Metodo.NAO_ENCONTRADO ||
					membro == Variavel.NAO_ENCONTRADA) {
			mensagem = "[\%s] [\%s, \%s] [\%s] \%s não resolvido.";
		} else {
			mensagem = "[\%s] [\%s, \%s] [\%s] \%s resolvido.";
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
	| instanciacao
	;

bottomup
	: terminarClasse
	| terminarMetodo
	| terminarConstrutor
	| terminarDestrutor
	| terminarBloco
	| referencia
	| chamada
	;

iniciarClasse
	: ^(CLASSE_ . IDENTIFICADOR . . .)
		{
			escopoAtual = filaDeEscopos.poll();
		}
	;

terminarClasse
	: CLASSE_
		{
			escopoAtual = filaDeEscopos.poll();
		}
	;

iniciarMetodo
	: ^(METODO_ ^(ASSINATURA_ . (ESTATICO)? tipo IDENTIFICADOR .) .)
		{
			Classe classe = escopoAtual.resolverClasse($tipo.umTipo);
			reportarResolucao($tipo.umTipo, classe, "classe", $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
			escopoAtual = filaDeEscopos.poll();
		}
	;

terminarMetodo
	: METODO_
		{
			escopoAtual = filaDeEscopos.poll();
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
				escopoAtual = filaDeEscopos.poll();
			}
		}
	;

terminarBloco
	: INSTRUCOES_
		{
			if ($INSTRUCOES_.hasAncestor(METODO_)) {
				escopoAtual = filaDeEscopos.poll();
			}
		}
	;

declaracao
	: ^(DECLARACAO_ tipo IDENTIFICADOR)
		{
			Classe classe = escopoAtual.resolverClasse($tipo.umTipo);
			reportarResolucao($tipo.umTipo, classe, "classe", $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
		}
	;

declaracaoDeAtributo
	: ^(ATRIBUTO_ . (ESTATICO)? tipo IDENTIFICADOR (.)?)
		{
			Classe classe = escopoAtual.resolverClasse($tipo.umTipo);
			reportarResolucao($tipo.umTipo, classe, "classe", $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
		}
	;

instanciacao
	: ^(INSTANCIACAO_ tipo .)
		{
			Classe classe = escopoAtual.resolverClasse($tipo.umTipo);
			reportarResolucao($tipo.umTipo, classe, "classe", $INSTANCIACAO_.getLine(), $INSTANCIACAO_.getCharPositionInLine());
		}
	;

referencia
	: ^(REFERENCIA_ identificador = (IDENTIFICADOR | ESSE | ESSA))
		{
			Variavel referenciaDeVariavel = escopoAtual.resolverVariavel($identificador.text, $identificador.getTokenStartIndex());
			referencia = referenciaDeVariavel;
			if (referenciaDeVariavel == Variavel.NAO_ENCONTRADA) {
				Atributo referenciaDeAtributo = escopoAtual.resolverAtributo($identificador.text);
				referencia = referenciaDeAtributo;
				if (referenciaDeAtributo == Atributo.NAO_ENCONTRADO) {
					Classe referenciaDeClasse = escopoAtual.resolverClasse($identificador.text);
					referencia = referenciaDeClasse;
					if (referenciaDeClasse == Classe.NAO_ENCONTRADA) {
						reportarResolucao($identificador.text, referenciaDeVariavel, "variavel", $identificador.getLine(), $identificador.getCharPositionInLine());
						reportarResolucao($identificador.text, referenciaDeAtributo, "atributo", $identificador.getLine(), $identificador.getCharPositionInLine());
						reportarResolucao($identificador.text, referenciaDeClasse, "classe", $identificador.getLine(), $identificador.getCharPositionInLine());
						referencia = null;
					} else {
						reportarResolucao($identificador.text, referenciaDeClasse, "classe", $identificador.getLine(), $identificador.getCharPositionInLine());
					}
				} else {
					reportarResolucao($identificador.text, referenciaDeAtributo, "atributo", $identificador.getLine(), $identificador.getCharPositionInLine());
				}
			} else {
				reportarResolucao($identificador.text, referenciaDeVariavel, "variavel", $identificador.getLine(), $identificador.getCharPositionInLine());				
			}
		}
	| ^(REFERENCIA_ IDENTIFICADOR .)
		{
			Metodo referenciaDeMetodo = escopoAtual.resolverMetodo($IDENTIFICADOR.text);
			reportarResolucao($IDENTIFICADOR.text, referenciaDeMetodo, "metodo", $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
			referencia = referenciaDeMetodo;
			if (referenciaDeMetodo != Metodo.NAO_ENCONTRADO) {
				referencia = new Variavel("retorne", referencia.fornecerTipo().fornecerNome(), 0);
				referencia.abrir(escopoAtual);
				referencia.fechar();
			} else {
				referencia = null;
			}
		}
	;

chamada
	: ^((CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO) IDENTIFICADOR)
		{
			if (referencia != null) {
				Atributo referenciaDeAtributo = referencia.resolverAtributo($IDENTIFICADOR.text);
				reportarResolucao($IDENTIFICADOR.text, referenciaDeAtributo, "atributo", $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
				referencia = referenciaDeAtributo;
				if (referenciaDeAtributo == Atributo.NAO_ENCONTRADO) {
					referencia = null;
				}
			}
		}
	| ^((CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO) IDENTIFICADOR .)
		{
			if (referencia != null) {
				Metodo referenciaDeMetodo = referencia.resolverMetodo($IDENTIFICADOR.text);
				reportarResolucao($IDENTIFICADOR.text, referenciaDeMetodo, "metodo", $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
				referencia = referenciaDeMetodo;
				if (referenciaDeMetodo != Metodo.NAO_ENCONTRADO) {
					referencia = new Variavel("retorne", referencia.fornecerTipo().fornecerNome(), 0);
					referencia.abrir(escopoAtual);
					referencia.fechar();
				} else {
					referencia = null;
				}
			}
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

