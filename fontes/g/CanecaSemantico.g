tree grammar CanecaSemantico;

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
	import br.ufsc.inf.ine5426.caneca.interno.Construtor;
	import br.ufsc.inf.ine5426.caneca.interno.Destrutor;
	import br.ufsc.inf.ine5426.caneca.interno.Escopo;
	import br.ufsc.inf.ine5426.caneca.interno.Expressao;
	import br.ufsc.inf.ine5426.caneca.interno.Instrucao;
	import br.ufsc.inf.ine5426.caneca.interno.InstrucaoCapture;
	import br.ufsc.inf.ine5426.caneca.interno.InstrucaoEnquanto;
	import br.ufsc.inf.ine5426.caneca.interno.InstrucaoLance;
	import br.ufsc.inf.ine5426.caneca.interno.InstrucaoPara;
	import br.ufsc.inf.ine5426.caneca.interno.InstrucaoRepita;
	import br.ufsc.inf.ine5426.caneca.interno.InstrucaoSe;
	import br.ufsc.inf.ine5426.caneca.interno.InstrucaoTente;
	import br.ufsc.inf.ine5426.caneca.interno.Metodo;
	import br.ufsc.inf.ine5426.caneca.interno.TabelaDeSimbolos;
	import br.ufsc.inf.ine5426.caneca.interno.Tipo;
	import br.ufsc.inf.ine5426.caneca.interno.Variavel;
}

@members {
	private TabelaDeSimbolos tabelaDeSimbolos;
	private Escopo escopoAtual;
	private boolean debug = false;
	
	public void fixarTabelaDeSimbolos(TabelaDeSimbolos tabelaDeSimbolos) {
		this.tabelaDeSimbolos = tabelaDeSimbolos;
		this.escopoAtual = tabelaDeSimbolos;
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
	| metodo
	| declaracao
	| bloco
	| se
	| para
	| repita
	| enquanto
	| tente
	| capture
	| lance
	;

bottomup
	: terminaClasse
	| terminarConstrutor
	| terminarDestrutor
	| terminarMetodo
	| terminarBloco
	| terminarSe
	| terminarPara
	| terminarRepita
	| terminarEnquanto
	| terminarTente
	| terminarCapture
	| terminarLance
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
			Classe classe = new Classe(escopoAtual, $IDENTIFICADOR.text, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
			escopoAtual.definirClasse(classe);
			escopoAtual = classe;
		}
	;

terminaClasse
	: ^(CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces .)
		{
			mostrar("terminarClasse");
			escopoAtual = escopoAtual.fornecerEscopoPai();
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
	: ^(ASSINATURAS_DE_METODOS_ (^(ASSINATURA_ modificadorDeAcessoMasculino (ESTATICO)? tipo IDENTIFICADOR .))*)
	;

atributo
	: ^(ATRIBUTO_ modificadorDeAcessoMasculino (ESTATICO)? tipo IDENTIFICADOR (.)?)
		{
			mostrar("atributo");
			Atributo atributo = new Atributo(escopoAtual, $tipo.tipo, $IDENTIFICADOR.text, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
			escopoAtual.definirAtributo(atributo);
		}
	;

construtor
	: ^(CONSTRUTOR_  ^(ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR .) .)
		{
			mostrar("construtor");
			Construtor construtor = new Construtor(escopoAtual, $IDENTIFICADOR.text, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
			escopoAtual.definirConstrutor(construtor);
			escopoAtual = construtor;
		}
	;

terminarConstrutor
	: ^(CONSTRUTOR_  ^(ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR .) .)
		{
			mostrar("terminarConstrutor");
			escopoAtual = escopoAtual.fornecerEscopoPai();
		}
	;

destrutor
	: ^(DESTRUTOR_ ^(ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR .) .)
		{
			mostrar("destrutor");
			Destrutor destrutor = new Destrutor(escopoAtual, $IDENTIFICADOR.text, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
			escopoAtual.definirDestrutor(destrutor);
			escopoAtual = destrutor;
		}
	;

terminarDestrutor
	: ^(DESTRUTOR_ ^(ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR .) .)
		{
			mostrar("terminarDestrutor");
			escopoAtual = escopoAtual.fornecerEscopoPai();
		}
	;

metodo
	: ^(METODO_ ^(ASSINATURA_ modificadorDeAcessoMasculino (ESTATICO)? tipo IDENTIFICADOR .) .)
		{
			mostrar("metodo");
			Metodo metodo = new Metodo(escopoAtual, $tipo.tipo, $IDENTIFICADOR.text, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
			escopoAtual.definirMetodo(metodo);
			escopoAtual = metodo;
		}
	;

terminarMetodo
	: ^(METODO_ ^(ASSINATURA_ modificadorDeAcessoMasculino (ESTATICO)? tipo IDENTIFICADOR .) .)
		{
			mostrar("terminarMetodo");
			escopoAtual = escopoAtual.fornecerEscopoPai();
		}
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
	: ^(ARGUMENTOS_ (.)*)
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
		{
			mostrar("variavel");
			Variavel variavel = new Variavel(escopoAtual, $tipo.tipo, $IDENTIFICADOR.text, $IDENTIFICADOR.getLine(), $IDENTIFICADOR.getCharPositionInLine());
			escopoAtual.definirVariavel(variavel);
		}
	;

atribuicao
	: ^(ATRIBUICAO_ expressaoOuLogico)
	;

declaracaoComAtribuicaoOpcional
	: ^(DECLARACAO_COM_ATRIBUICAO_OPICIONAL_ . (atribuicao)?)
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
	: ^(SE_ . . .?)
		{
			mostrar("se");
			InstrucaoSe instrucao = new InstrucaoSe(escopoAtual);
			escopoAtual.definirInstrucao(instrucao);
			escopoAtual = instrucao;
		}
	;

terminarSe
	: ^(SE_ . . .?)
		{
			mostrar("terminarSe");
			escopoAtual = escopoAtual.fornecerEscopoPai();
		}
	;

para
	: ^(PARA_ . . . .)
		{
			mostrar("para");
			InstrucaoPara instrucao = new InstrucaoPara(escopoAtual);
			escopoAtual.definirInstrucao(instrucao);
			escopoAtual = instrucao;
		}
	;

terminarPara
	: ^(PARA_ . . . .)
		{
			mostrar("terminarPara");
			escopoAtual = escopoAtual.fornecerEscopoPai();
		}
	;

repita
	: ^(REPITA_ . . .)
		{
			mostrar("repita");
			InstrucaoRepita instrucao = new InstrucaoRepita(escopoAtual);
			escopoAtual.definirInstrucao(instrucao);
			escopoAtual = instrucao;
		}
	;

terminarRepita
	: ^(REPITA_ . . .)
		{
			mostrar("terminarRepita");
			escopoAtual = escopoAtual.fornecerEscopoPai();
		}
	;

enquanto
	: ^(ENQUANTO_ . .)
		{
			mostrar("enquanto");
			InstrucaoEnquanto instrucao = new InstrucaoEnquanto(escopoAtual);
			escopoAtual.definirInstrucao(instrucao);
			escopoAtual = instrucao;
		}
	;

terminarEnquanto
	: ^(ENQUANTO_ . .)
		{
			mostrar("terminarEnquanto");
			escopoAtual = escopoAtual.fornecerEscopoPai();
		}
	;

tente
	: ^(TENTE_ . .)
		{
			mostrar("tente");
			InstrucaoTente instrucao = new InstrucaoTente(escopoAtual);
			escopoAtual.definirInstrucao(instrucao);
			escopoAtual = instrucao;
		}
	;

terminarTente
	: ^(TENTE_ . .)
		{
			mostrar("terminarTente");
			escopoAtual = escopoAtual.fornecerEscopoPai();
		}
	;

capture
	: ^(CAPTURE_ . .)
		{
			mostrar("capture");
			InstrucaoCapture instrucao = new InstrucaoCapture(escopoAtual);
			escopoAtual.definirInstrucao(instrucao);
			escopoAtual = instrucao;
		}
	;

terminarCapture
	: ^(CAPTURE_ . .)
		{
			mostrar("terminarCapture");
			escopoAtual = escopoAtual.fornecerEscopoPai();
		}
	;

lance
	: ^(LANCE_ .)
		{
			mostrar("lance");
			InstrucaoLance instrucao = new InstrucaoLance(escopoAtual);
			escopoAtual.definirInstrucao(instrucao);
			escopoAtual = instrucao;
		}
	;

terminarLance
	: ^(LANCE_ .)
		{
			mostrar("terminarLance");
			escopoAtual = escopoAtual.fornecerEscopoPai();
		}
	;

bloco
	: ^(INSTRUCOES_ (.)*)
		{
			mostrar("bloco");
			Bloco bloco = new Bloco(escopoAtual);
			escopoAtual.definirBloco(bloco);
			escopoAtual = bloco;
		}
	;

terminarBloco
	: ^(INSTRUCOES_ (.)*)
		{
			mostrar("terminarBloco");
			escopoAtual = escopoAtual.fornecerEscopoPai();
		}
	;
