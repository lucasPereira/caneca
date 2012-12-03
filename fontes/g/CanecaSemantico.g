tree grammar CanecaSemanticoDefinicao;

options {
	ASTLabelType = CommonTree;
	tokenVocab = CanecaArvore;
	filter = true;
}

@header {
	package br.ufsc.inf.ine5426.caneca.antlr;
	
	import br.ufsc.inf.ine5426.caneca.Escopo;
	import br.ufsc.inf.ine5426.caneca.Escopos;
	import br.ufsc.inf.ine5426.caneca.Simbolo;
	import br.ufsc.inf.ine5426.caneca.Simbolos;
	import br.ufsc.inf.ine5426.caneca.Tipo;
}

@members {
	private Escopo tabelaDeSimbolos = new Escopo(Escopos.GLOBAL);
	private Escopo escopoAtual = tabelaDeSimbolos;
	private Simbolo ultimaReferencia = Simbolo.NAO_ENCONTRADO;
	
	public Escopo fonecerTabelaDeSimbolos() {
		return tabelaDeSimbolos;
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
	| referencia
	| chamada
	;

iniciarClasse
	: ^(CLASSE_ . IDENTIFICADOR . . .)
		{
			Escopo novoEscopo = new Escopo(Escopos.CLASSE);
			Simbolo classe = new Simbolo($IDENTIFICADOR.text, new Tipo($IDENTIFICADOR.text), novoEscopo, Simbolos.CLASSE);
			Simbolo esse = new Simbolo("esse", new Tipo($IDENTIFICADOR.text), Simbolos.ESSE);
			Simbolo essa = new Simbolo("essa", new Tipo($IDENTIFICADOR.text), Simbolos.ESSE);
			escopoAtual.definir(classe);
			escopoAtual = novoEscopo.abrir(escopoAtual);
			escopoAtual.definir(esse);
			escopoAtual.definir(essa);
		}
	;

terminarClasse
	: CLASSE_
		{
			escopoAtual = escopoAtual.fechar();
		}
	;

iniciarMetodo
	: ^(METODO_ ^(ASSINATURA_ . (ESTATICO)? tipo IDENTIFICADOR .) .)
		{
			Escopo novoEscopo = new Escopo(Escopos.METODO);
			Simbolo metodo = new Simbolo($IDENTIFICADOR.text, $tipo.umTipo, novoEscopo, Simbolos.METODO);
			escopoAtual.definir(metodo);
			escopoAtual = novoEscopo.abrir(escopoAtual);
		}
	;

iniciarConstrutor
	: ^(CONSTRUTOR_ ^(ASSINATURA_ . IDENTIFICADOR .) .)
		{
			Escopo novoEscopo = new Escopo(Escopos.CONSTRUTOR);
			escopoAtual = novoEscopo.abrir(escopoAtual);
		}
	;

iniciarDestrutor
	: ^(DESTRUTOR_ ^(ASSINATURA_ . IDENTIFICADOR .) .)
		{
			Escopo novoEscopo = new Escopo(Escopos.DESTRUTOR);
			escopoAtual = novoEscopo.abrir(escopoAtual);
		}
	;

iniciarBloco
	: ^(INSTRUCOES_ (.)*)
		{
			Escopo novoEscopo = new Escopo(Escopos.LOCAL);
			escopoAtual = novoEscopo.abrir(escopoAtual);
		}
	;

terminarMetodo
	: METODO_
		{
			escopoAtual = escopoAtual.fechar();
		}
	;

terminarConstrutor
	: CONSTRUTOR_
		{
			escopoAtual = escopoAtual.fechar();
		}
	;

terminarDestrutor
	: DESTRUTOR_
		{
			escopoAtual = escopoAtual.fechar();
		}
	;

terminarBloco
	: INSTRUCOES_
		{
			escopoAtual = escopoAtual.fechar();
		}
	;

declaracao
	: ^(DECLARACAO_ tipo IDENTIFICADOR)
		{
			Simbolo variavel = new Simbolo($IDENTIFICADOR.text, $tipo.umTipo, Simbolos.VARIAVEL);
			escopoAtual.definir(variavel);
		}
	;

declaracaoDeAtributo
	: ^(ATRIBUTO_ . (ESTATICO)? tipo IDENTIFICADOR (.)?)
		{
			Simbolo variavel = new Simbolo($IDENTIFICADOR.text, $tipo.umTipo, Simbolos.ATRIBUTO);
			escopoAtual.definir(variavel);
		}
	;

referencia
	: ^(REFERENCIA_ (identificador = (IDENTIFICADOR | ESSE | ESSA)) (.)?)
		{
			ultimaReferencia = escopoAtual.resolver($identificador.text);
		}
	;

chamada
	: ^((CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO) IDENTIFICADOR (.)?)
		{
			ultimaReferencia = escopoAtual.resolverMembro(ultimaReferencia, $IDENTIFICADOR.text);
		}
	;

tipo returns [Tipo umTipo]
	: ^(TIPO_ IDENTIFICADOR
		{
			umTipo = new Tipo($IDENTIFICADOR.text);
		}
	 listaDeTipos[umTipo])
	;

listaDeTipos[Tipo tipoPai]
	: ^(TIPOS_ (tipo
		{
			tipoPai.adicionarTipoAninhado($tipo.umTipo);
		}
	 )*)
	;

