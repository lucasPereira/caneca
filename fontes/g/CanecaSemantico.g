tree grammar CanecaSemantico;

options {
	ASTLabelType = CommonTree;
	tokenVocab = CanecaArvore;
	filter = true;
}

@header {
	package br.ufsc.inf.ine5426.caneca.antlr;
	
	import br.ufsc.inf.ine5426.caneca.interno.Atributo;
	import br.ufsc.inf.ine5426.caneca.interno.Classe;
	import br.ufsc.inf.ine5426.caneca.interno.Construtor;
	import br.ufsc.inf.ine5426.caneca.interno.Destrutor;
	import br.ufsc.inf.ine5426.caneca.interno.EscopoLocal;
	import br.ufsc.inf.ine5426.caneca.interno.TabelaDeSimbolos;
	import br.ufsc.inf.ine5426.caneca.interno.Tipo;
}

@members {
	private TabelaDeSimbolos tabelaDeSimbolos;
	private Classe classeAtual;
	private EscopoLocal escopoLocalAtual;
	private boolean debug = false;
	
	public void fixarTabelaDeSimbolos(TabelaDeSimbolos tabelaDeSimbolos) {
		this.tabelaDeSimbolos = tabelaDeSimbolos;
	}
	
	public void mostrar(String mensagem) {
		if (debug) {
			System.out.println(">> " + mensagem);
		}
	}
}

@rulecatch {
	catch (RecognitionException erro) {
		throw erro;
	}
}

topdown
	: classe
	| atributo
	| construtor
	| destrutor
	;

bottomup
	: terminaClasse
	| terminarConstrutor
	| terminarDestrutor
	;

programa
	: ^(PROGRAMA_ (unicadeDeCompilacao)+)
	;

unicadeDeCompilacao
	: ^(UNIDADE_ cabecalho classe)
	| ^(UNIDADE_ cabecalho interfaces)
	;

cabecalho
	: ^(CABECALHO_ pacote importacoes)
	;

pacote
	: ^(PACOTE_ IDENTIFICADOR_DE_PACOTE)
	;

importacoes
	: ^(IMPORTACOES_ (importacao)*)
	;

importacao
	: ^(IMPORTACAO_ IDENTIFICADOR IDENTIFICADOR_DE_PACOTE (IDENTIFICADOR)?)
	| ^(IMPORTACAO_ IDENTIFICADOR_DE_PACOTE)
	;

classe
	: ^(CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces .)
		{
			mostrar("classe");
			Classe classe = new Classe($IDENTIFICADOR.text, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
			classeAtual = classe;
			tabelaDeSimbolos.definirClasse(classe);
		}
	;

terminaClasse
	: ^(CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces .)
		{
			mostrar("terminarClasse");
			classeAtual = null;
		}
	;

interfaces
	: ^(INTERFACE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface)
	;

corpoDaClasse
	: ^(CORPO_ atributos construtores destrutor metodos)
	;

corpoDaInterface
	: ^(CORPO_ atributos assinaturasDeMetodos)
	;

atributos
	: ^(ATRIBUTOS_ (atributo)*)
	;

construtores
	: ^(CONSTRUTORES_ (construtor)+)
	;

metodos
	: ^(METODOS_ (metodo)*)
	;

assinaturasDeMetodos
	: ^(ASSINATURAS_DE_METODOS_ (^(ASSINATURA_ modificadorDeAcessoMasculino (ESTATICO)? tipo IDENTIFICADOR listaDeArgumentos))*)
	;

atributo
	: ^(ATRIBUTO_ modificadorDeAcessoMasculino (ESTATICO)? tipo IDENTIFICADOR (.)?)
		{
			mostrar("atributo");
			Atributo atributo = new Atributo(classeAtual, $tipo.tipo, $IDENTIFICADOR.text, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
			classeAtual.definirAtributo(atributo);
		}
	;

construtor
	: ^(CONSTRUTOR_  ^(ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos) .)
		{
			mostrar("construtor");
			Construtor construtor = new Construtor(classeAtual, $IDENTIFICADOR.text, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
			escopoLocalAtual = construtor;
			classeAtual.definirConstrutor(construtor);
		}
	;

terminarConstrutor
	: ^(CONSTRUTOR_  ^(ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos) .)
		{
			mostrar("terminarConstrutor");
			escopoLocalAtual = escopoLocalAtual.fornecerEscopoPai();
		}
	;

destrutor
	: ^(DESTRUTOR_ ^(ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentosVazia) .)
		{
			mostrar("destrutor");
			Destrutor destrutor = new Destrutor(classeAtual, $IDENTIFICADOR.text, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
			escopoLocalAtual = destrutor;
			classeAtual.definirDestrutor(destrutor);
		}
	;

terminarDestrutor
	: ^(DESTRUTOR_ ^(ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentosVazia) .)
		{
			mostrar("terminarDestrutor");
			escopoLocalAtual = escopoLocalAtual.fornecerEscopoPai();
		}
	;

metodo
	: ^(METODO_ ^(ASSINATURA_ modificadorDeAcessoMasculino (ESTATICO)? tipo IDENTIFICADOR listaDeArgumentos) .)
	;

modificadorDeAcessoMasculino
	: PUBLICO
	| PRIVADO
	| PROTEGIDO
	;

modificadorDeAcessoFeminino
	: PUBLICA
	| PRIVADA
	| PROTEGIDA
	;

listaDeParametros
	: ^(PARAMETROS_ (expressao)*)
	;

listaDeArgumentosVazia
	: ARGUMENTOS_
	;

listaDeArgumentos
	: ^(ARGUMENTOS_ (declaracao)*)
	;

listaDeInterfaces
	: ^(INTERFACES_ (tipo)*)
	;

listaDeTiposGenericos
	: ^(TIPOS_GENERICOS_ (tipoGenerico)*)
	;

listaDeTipos
	: ^(TIPOS_ (tipo)*)
	;

listaDeCapturas
	: ^(CAPTURAS_ (capture)+)
	;

tipoGenerico
	: ^(TIPO_GENERICO_ IDENTIFICADOR listaDeInterfaces)
	;

tipo returns [Tipo tipo]
	: ^(TIPO_ IDENTIFICADOR listaDeTipos)
		{
			$tipo = new Tipo($IDENTIFICADOR.text);
		}
	;

declaracao
	: ^(DECLARACAO_ tipo IDENTIFICADOR)
	;

atribuicao
	: ^(ATRIBUICAO_ expressaoOuLogico)
	;

declaracaoComAtribuicaoOpcional
	: ^(DECLARACAO_COM_ATRIBUICAO_OPICIONAL_ declaracao (atribuicao)?)
	;

expressao
	: ^(ATRIBUIDOR expressaoOuLogico expressaoOuLogico)
	| expressaoOuLogico
	;

expressaoOuLogico
	: ^(OU expressaoELogico expressaoELogico)
	| expressaoELogico
	;

expressaoELogico
	: ^(E expressaoComparacaoLogica expressaoComparacaoLogica)
	| expressaoComparacaoLogica
	;

expressaoComparacaoLogica
	: ^((IGUAL | DIFERENTE | MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL) expressaoAditiva expressaoAditiva)
	| expressaoAditiva
	;

expressaoAditiva
	: ^((SOMA | SUBTRACAO) expressaoMultiplicativa expressaoMultiplicativa)
	| expressaoMultiplicativa
	;

expressaoMultiplicativa
	: ^((MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO) expressaoUnaria expressaoUnaria)
	| expressaoUnaria
	;

expressaoUnaria
	: ^(PRIMARIA_ expressaoPrimaria)
	| ^(SUBTRACAO_UNARIA_ expressaoPrimaria)
	| ^(NEGACAO expressaoPrimaria)
	;

expressaoPrimaria
	: expressao
	| VALOR_BOOLEANO
	| VALOR_NULO
	| CONSTANTE_INTEIRA
	| CONSTANTE_REAL
	| LITERAL_CARACTERE
	| LITERAL_TEXTO
	| comando
	;

comando
	: ^(COMANDO_ referencia (chamada)*)
	;

referencia
	: ^(REFERENCIA_ ESSE)
	| ^(REFERENCIA_ ESSA)
	| ^(REFERENCIA_ instanciacao)
	| ^(REFERENCIA_ IDENTIFICADOR (listaDeParametros)?)
	;

chamada
	: ^((CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO) IDENTIFICADOR (listaDeParametros)?)
	;

instanciacao
	: ^(INSTANCIACAO_ tipo listaDeParametros)
	;

destruicao
	: ^(DESTRUICAO_ expressao)
	;

retorno 
	: ^(RETORNO_ expressao)
	;

se
	: ^(SE_ expressao blocoDeInstrucoes blocoDeInstrucoes?)
	;

para
	: ^(PARA_ expressao expressao expressao)
	;

repita
	: ^(REPITA_ declaracao expressao blocoDeInstrucoes)
	;

enquanto
	: ^(ENQUANTO_ expressao blocoDeInstrucoes)
	;

tente
	: ^(TENTE_ blocoDeInstrucoes listaDeCapturas)
	;

capture
	: ^(CAPTURE_ declaracao blocoDeInstrucoes)
	;

lance
	: ^(LANCE_ expressao)
	;

blocoDeInstrucoes
	: ^(INSTRUCOES_ (.)*)
	;

