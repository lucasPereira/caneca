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
	import br.ufsc.inf.ine5426.caneca.interno.Tipo;
	import br.ufsc.inf.ine5426.caneca.interno.Variavel;
	
	import java.util.Queue;
}

@members {
	private Escopo escopoAtual;
	private Escopo referencia;
	private Queue<Escopo> filaDeEscopos;
	private Queue<Escopo> filaDeReferencias;
	
	public void fixarFilaDeEscopos(Queue<Escopo> filaDeEscopos) {
		this.filaDeEscopos = filaDeEscopos;
		this.escopoAtual = filaDeEscopos.poll();
	}
	
	public void fixarFilaDeReferencias(Queue<Escopo> filaDeReferencias) {
		this.filaDeReferencias = filaDeReferencias;
	}
	
	public <T extends Escopo> void reportarResolucao(String nomeDoMembro, T membro, String tipoDoSimbolo, int linha, int coluna) {
		Reporter reporter = Reporter.fornecerInstancia();
		if (membro == Classe.NAO_ENCONTRADA ||
					membro == Atributo.NAO_ENCONTRADO ||
					membro == Metodo.NAO_ENCONTRADO ||
					membro == Variavel.NAO_ENCONTRADA) {
			reporter.reportarErro(String.format("[\%s] [\%s, \%s] [\%s] \%s não resolvido.", escopoAtual.fornecerNome(), linha, coluna, tipoDoSimbolo, nomeDoMembro), membro);
		} else {
			reporter.reportarSucesso(String.format("[\%s] [\%s, \%s] [\%s] \%s resolvido.", escopoAtual.fornecerNome(), linha, coluna, tipoDoSimbolo, nomeDoMembro), membro);
		}
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
	| comando
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
			Classe classe = escopoAtual.resolverClasse($tipo.umTipo.fornecerNome());
			reportarResolucao($tipo.umTipo.fornecerNome(), classe, "classe", $tipo.umTipo.fornecerLinha(), $tipo.umTipo.fornecerColuna());
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
			escopoAtual = filaDeEscopos.poll();
		}
	;

terminarConstrutor
	: CONSTRUTOR_
		{
			escopoAtual = filaDeEscopos.poll();
		}
	;

iniciarDestrutor
	: ^(DESTRUTOR_ ^(ASSINATURA_ . IDENTIFICADOR .) .)
		{
			escopoAtual = filaDeEscopos.poll();
		}
	;

terminarDestrutor
	: DESTRUTOR_
		{
			escopoAtual = filaDeEscopos.poll();
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
			Classe classe = escopoAtual.resolverClasse($tipo.umTipo.fornecerNome());
			reportarResolucao($tipo.umTipo.fornecerNome(), classe, "classe", $tipo.umTipo.fornecerLinha(), $tipo.umTipo.fornecerColuna());
		}
	;

declaracaoDeAtributo
	: ^(ATRIBUTO_ . (ESTATICO)? tipo IDENTIFICADOR (.)?)
		{
			Classe classe = escopoAtual.resolverClasse($tipo.umTipo.fornecerNome());
			reportarResolucao($tipo.umTipo.fornecerNome(), classe, "classe", $tipo.umTipo.fornecerLinha(), $tipo.umTipo.fornecerColuna());
		}
	;

comando
	@after {
		filaDeReferencias.add(referencia);
	}
	: ^(COMANDO_ referencia (chamada)*)
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
			//filaDeReferencias.add(referencia);
		}
	| ^(REFERENCIA_ IDENTIFICADOR .)
		{
			Metodo referenciaDeMetodo = escopoAtual.resolverMetodo($IDENTIFICADOR.text);
			reportarResolucao($IDENTIFICADOR.text, referenciaDeMetodo, "metodo", $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
			referencia = referenciaDeMetodo;
			if (referenciaDeMetodo != Metodo.NAO_ENCONTRADO) {
				referencia = new Variavel("retorno", referencia.fornecerTipo(), 0);
				referencia.abrir(escopoAtual);
				referencia.fechar();
			} else {
				referencia = null;
			}
			//filaDeReferencias.add(referencia);
		}
	| ^(REFERENCIA_ ^(INSTANCIACAO_ tipo .))
		{
			Classe referenciaDeClasse = escopoAtual.resolverClasse($tipo.umTipo.fornecerNome());
			reportarResolucao($tipo.umTipo.fornecerNome(), referenciaDeClasse, "classe", $tipo.umTipo.fornecerLinha(), $tipo.umTipo.fornecerColuna());
			referencia = referenciaDeClasse;
			if (referenciaDeClasse != Classe.NAO_ENCONTRADA) {
				referencia = new Variavel("instancia", $tipo.umTipo, 0);
				referencia.abrir(escopoAtual);
				referencia.fechar();
			} else {
				referencia = null;
			}
			//filaDeReferencias.add(referencia);
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
				//filaDeReferencias.add(referencia);
			}
		}
	| ^((CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO) IDENTIFICADOR .)
		{
			if (referencia != null) {
				Metodo referenciaDeMetodo = referencia.resolverMetodo($IDENTIFICADOR.text);
				reportarResolucao($IDENTIFICADOR.text, referenciaDeMetodo, "metodo", $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
				referencia = referenciaDeMetodo;
				if (referenciaDeMetodo != Metodo.NAO_ENCONTRADO) {
					referencia = new Variavel("retorne", referencia.fornecerTipo(), 0);
					referencia.abrir(escopoAtual);
					referencia.fechar();
				} else {
					referencia = null;
				}
				//filaDeReferencias.add(referencia);
			}
		}
	;

tipo returns [Tipo umTipo]
	: ^(TIPO_ IDENTIFICADOR
		{
			umTipo = new Tipo($IDENTIFICADOR.text, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
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

