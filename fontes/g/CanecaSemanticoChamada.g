tree grammar CanecaSemanticoChamada;

options {
	ASTLabelType = CommonTree;
	tokenVocab = CanecaArvore;
	filter = true;
}

@header {
	package br.ufsc.inf.ine5426.caneca.antlr;
	import br.ufsc.inf.ine5426.caneca.interno.Bloco;
	import br.ufsc.inf.ine5426.caneca.interno.Classe;
	import br.ufsc.inf.ine5426.caneca.interno.Escopo;
	import br.ufsc.inf.ine5426.caneca.interno.Expressao;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoAditiva;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoAtribuicao;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoComparativa;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoComparativaAritmetica;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoELogico;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoMultiplicativa;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoNegacao;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoOuLogico;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoPrimaria;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoSubtracao;
	import br.ufsc.inf.ine5426.caneca.interno.Metodo;
	import br.ufsc.inf.ine5426.caneca.interno.Reporter;
	import br.ufsc.inf.ine5426.caneca.interno.TabelaDeSimbolos;
	import br.ufsc.inf.ine5426.caneca.interno.Tipo;
	import br.ufsc.inf.ine5426.caneca.interno.Variavel;
	
	import java.util.ArrayDeque;
	import java.util.Queue;
	import java.util.Stack;
}

@members {
	private Escopo escopoAtual;
	private Escopo referencia;
	private Queue<Escopo> filaDeEscopos;
	private Queue<Escopo> filaDeReferencias;
	private Queue<Tipo> filaDeExpressoes;
	private Expressao ultimaExpressao;

	public void fixarFilaDeEscopos(Queue<Escopo> filaDeEscopos) {
		this.filaDeEscopos = filaDeEscopos;
		this.escopoAtual = filaDeEscopos.poll();
	}
	
	public void fixarFilaDeReferencias(Queue<Escopo> filaDeReferencias) {
		this.filaDeReferencias = filaDeReferencias;
	}
	
	public void fixarFilaDeExpressoes(Queue<Tipo> filaDeExpressoes) {
		this.filaDeExpressoes = filaDeExpressoes;
	}
	
	public  void reportarErro(Tipo tipo) {
		Reporter.fornecerInstancia().reportarErro(String.format("[\%s] [\%s, \%s] tipo inválido.", tipo.fornecerNome(), tipo.fornecerLinha(), tipo.fornecerColuna()), escopoAtual);
	}
}

topdown 
	: iniciarClasse
	| iniciarMetodo
	| iniciarConstrutor
	| iniciarDestrutor
	| iniciarBloco
	| iniciarExpressao
	| iniciarExpressaoOuLogico
	| iniciarExpressaoELogico
	| iniciarExpressaoComparativaAritmetica
	| iniciarExpressaoComparativa
	| iniciarExpressaoAditiva
	| iniciarExpressaoMultiplicativa
	| expressaoUnaria
	;

bottomup
	: terminarClasse
	| terminarMetodo
	| terminarConstrutor
	| terminarDestrutor
	| terminarBloco
	| terminarExpressao
	| terminarExpressaoOuLogico
	| terminarExpressaoELogico
	| terminarExpressaoComparativaAritmetica
	| terminarExpressaoComparativa
	| terminarExpressaoAditiva
	| terminarExpressaoMultiplicativa
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

iniciarExpressao
	: ^(ATRIBUIDOR . .)
		{
			System.out.println("IEXP");
			ExpressaoAtribuicao expressao = new ExpressaoAtribuicao();
			expressao.abrir(ultimaExpressao);
			ultimaExpressao = expressao;
		}
	| ^(DECLARACAO_COM_ATRIBUICAO_OPICIONAL_ ^(DECLARACAO_ tipo IDENTIFICADOR) ^(ATRIBUICAO_ .))
		{
			System.out.println("IDEXP");
			ExpressaoAtribuicao expressao = new ExpressaoAtribuicao();
			expressao.abrir(ultimaExpressao);
			expressao.adicionarTipo($tipo.umTipo);
			ultimaExpressao = expressao;
		}
	;

terminarExpressao
	@after {
		filaDeExpressoes.add(ultimaExpressao.fornecerTipo());
	}
	: ^(ATRIBUIDOR . .)
		{
			//System.out.println("TEXP");
			ultimaExpressao = ultimaExpressao.fechar();
		}
	| ^(DECLARACAO_COM_ATRIBUICAO_OPICIONAL_ ^(DECLARACAO_ tipo IDENTIFICADOR) ^(ATRIBUICAO_ .))
		{
			//System.out.println("TDEXP");
			ultimaExpressao = ultimaExpressao.fechar();
		}
	;

iniciarExpressaoOuLogico
	: ^(OU . .)
		{
			//System.out.println("IE||");
			ExpressaoOuLogico expressao = new ExpressaoOuLogico();
			expressao.abrir(ultimaExpressao);
			ultimaExpressao = expressao;
		}
	;

terminarExpressaoOuLogico
	: ^(OU . .)
		{
			//System.out.println("TE||");
			ultimaExpressao = ultimaExpressao.fechar();
		}
	;

iniciarExpressaoELogico
	: ^(E . .)
		{
			//System.out.println("IE&&");
			ExpressaoELogico expressao = new ExpressaoELogico();
			expressao.abrir(ultimaExpressao);
			ultimaExpressao = expressao;
		}
	;

terminarExpressaoELogico
	: ^(E . .)
		{
			//System.out.println("TE&&");
			ultimaExpressao = ultimaExpressao.fechar();
		}
	;

iniciarExpressaoComparativaAritmetica
	: ^((MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL) . .)
		{
			//System.out.println("IECA");
			ExpressaoComparativaAritmetica expressao = new ExpressaoComparativaAritmetica();
			expressao.abrir(ultimaExpressao);
			ultimaExpressao = expressao;
		}
	;

terminarExpressaoComparativaAritmetica
	: ^((MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL) . .)
		{
			//System.out.println("TECA");
			ultimaExpressao = ultimaExpressao.fechar();
		}
	;

iniciarExpressaoComparativa
	: ^((IGUAL | DIFERENTE) . .)
		{
			//System.out.println("IEC");
			ExpressaoComparativa expressao = new ExpressaoComparativa();
			expressao.abrir(ultimaExpressao);
			ultimaExpressao = expressao;
		}
	;

terminarExpressaoComparativa
	: ^((IGUAL | DIFERENTE) . .)
		{
			//System.out.println("TEC");
			ultimaExpressao = ultimaExpressao.fechar();
		}
	;

iniciarExpressaoAditiva
	: ^((SOMA | SUBTRACAO) . .)
		{
			//System.out.println("IEA");
			ExpressaoAditiva expressao = new ExpressaoAditiva();
			expressao.abrir(ultimaExpressao);
			ultimaExpressao = expressao;
		}
	;

terminarExpressaoAditiva
	: ^((SOMA | SUBTRACAO) . .)
		{
			//System.out.println("TEA");
			ultimaExpressao = ultimaExpressao.fechar();
		}
	;

iniciarExpressaoMultiplicativa
	: ^((MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO) . .)
		{
			//System.out.println("IEM");
			ExpressaoMultiplicativa expressao = new ExpressaoMultiplicativa();
			expressao.abrir(ultimaExpressao);
			ultimaExpressao = expressao;
		}
	;

terminarExpressaoMultiplicativa
	: ^((MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO) . .)
		{
			//System.out.println("TEM");
			ultimaExpressao = ultimaExpressao.fechar();
		}
	;

expressaoUnaria returns [Tipo meuTipo]
	: ^(PRIMARIA_ expressaoPrimaria)
		{
			//System.out.println("EP");
			ExpressaoPrimaria expressao = new ExpressaoPrimaria();
			expressao.abrir(ultimaExpressao);
			expressao.adicionarTipo($expressaoPrimaria.meuTipo);
			ultimaExpressao = expressao.fechar();
		}
	| ^(SUBTRACAO_UNARIA_ expressaoPrimaria)
		{
			//System.out.println("EPS");
			ExpressaoSubtracao expressao = new ExpressaoSubtracao();
			expressao.abrir(ultimaExpressao);
			expressao.adicionarTipo($expressaoPrimaria.meuTipo);
			ultimaExpressao = expressao.fechar();
		}
	| ^(NEGACAO expressaoPrimaria)
		{
			//System.out.println("EPN");
			ExpressaoNegacao expressao = new ExpressaoNegacao();
			expressao.abrir(ultimaExpressao);
			expressao.adicionarTipo($expressaoPrimaria.meuTipo);
			ultimaExpressao = expressao.fechar();
		}
	;

expressaoPrimaria returns [Tipo meuTipo]
	//TODO: expressão
	: VALOR_BOOLEANO { $meuTipo = new Tipo("Booleano", $VALOR_BOOLEANO.getLine(), $VALOR_BOOLEANO.getCharPositionInLine()); }
	| VALOR_NULO { $meuTipo = new Tipo("Nulo", $VALOR_NULO.getLine(), $VALOR_NULO.getCharPositionInLine()); }
	| CONSTANTE_INTEIRA { $meuTipo = new Tipo("Inteiro", $CONSTANTE_INTEIRA.getLine(), $CONSTANTE_INTEIRA.getCharPositionInLine()); }
	| CONSTANTE_REAL { $meuTipo = new Tipo("Real", $CONSTANTE_REAL.getLine(), $CONSTANTE_REAL.getCharPositionInLine()); }
	| LITERAL_CARACTERE { $meuTipo = new Tipo("Caractere", $LITERAL_CARACTERE.getLine(), $LITERAL_CARACTERE.getCharPositionInLine()); }
	| LITERAL_TEXTO { $meuTipo = new Tipo("Texto", $LITERAL_TEXTO.getLine(), $LITERAL_TEXTO.getCharPositionInLine()); }
	| comando { $meuTipo = $comando.meuTipo; }
	;

comando returns [Tipo meuTipo]
	: ^(COMANDO_ . .?)
		{
			referencia = filaDeReferencias.poll();
			if (referencia != null) {
				$meuTipo = referencia.fornecerTipo();
			} else {
				$meuTipo = new Tipo("Nulo");
				System.out.println("MERDA");
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

