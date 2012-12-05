// $ANTLR 3.4 fontes/g/CanecaSemanticoDefinicao.g 2012-12-05 02:33:03

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


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CanecaSemanticoDefinicao extends TreeFilter {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATRIBUIDOR", "ATRIBUTO", "CAPTURE", "CARACTERE", "CARACTERE_DE_ESCAPE", "CARACTERE_NAO_IMPRIMIVEL", "CHAMADA_DE_CLASSE", "CHAMADA_DE_OBJETO", "CLASSE", "COLCHETE_DIREITO", "COLCHETE_ESQUERDO", "COMENTARIO_EM_BLOCO", "COMENTARIO_EM_LINHA", "COMO", "CONSTANTE_INTEIRA", "CONSTANTE_REAL", "CONSTRUTOR", "DECLARE", "DESTRUA", "DESTRUTOR", "DIFERENTE", "DIGITO", "DIVISAO", "E", "ENQUANTO", "ESPACO_EM_BRANCO", "ESSA", "ESSE", "ESTATICO", "FIM", "IDENTIFICADOR", "IDENTIFICADOR_DE_PACOTE", "IGUAL", "IMPLEMENTA", "IMPORTE", "INICIO", "INTERFACE", "LANCE", "LETRA", "LITERAL_CARACTERE", "LITERAL_TEXTO", "MAIOR", "MAIOR_IGUAL", "MENOR", "MENOR_IGUAL", "METODO", "MULTIPLICACAO", "NEGACAO", "NOVA", "NOVO", "OU", "PACOTE", "PARA", "PARENTESE_DIREITO", "PARENTESE_ESQUERDO", "PRIVADA", "PRIVADO", "PROTEGIDA", "PROTEGIDO", "PUBLICA", "PUBLICO", "QUEBRA_DE_LINHA", "REPITA", "RESTO_DA_DIVISAO", "RETORNE", "SE", "SENAO", "SEPARADOR", "SOMA", "SUBTRACAO", "TABULACAO", "TENTE", "TERMINADOR", "USADO_EM_TEXTO", "VALOR_BOOLEANO", "VALOR_NULO", "ARGUMENTOS_", "ASSINATURAS_DE_METODOS_", "ASSINATURA_", "ASSINATURA_DE_METODO_", "ATRIBUICAO_", "ATRIBUTOS_", "ATRIBUTO_", "CABECALHO_", "CAPTURAS_", "CAPTURE_", "CHAMADA_DE_CLASSE_", "CHAMADA_DE_OBJETO_", "CLASSE_", "COMANDO_", "CONSTRUTORES_", "CONSTRUTOR_", "CORPO_", "DECLARACAO_", "DECLARACAO_COM_ATRIBUICAO_OPICIONAL_", "DESTRUICAO_", "DESTRUTORES_", "DESTRUTOR_", "ENQUANTO_", "EXPRESSAO_", "IMPORTACAO_", "IMPORTACOES_", "INSTANCIACAO_", "INSTRUCOES_", "INTERFACES_", "INTERFACE_", "LANCE_", "METODOS_", "METODO_", "PACOTE_", "PARAMETROS_", "PARA_", "PRIMARIA_", "PROGRAMA_", "REFERENCIA_", "REPITA_", "RETORNO_", "SELECAO_", "SE_", "SUBTRACAO_UNARIA_", "TENTE_", "TIPOS_", "TIPOS_GENERICOS_", "TIPO_", "TIPO_GENERICO_", "UNIDADE_"
    };

    public static final int EOF=-1;
    public static final int ATRIBUIDOR=4;
    public static final int ATRIBUTO=5;
    public static final int CAPTURE=6;
    public static final int CARACTERE=7;
    public static final int CARACTERE_DE_ESCAPE=8;
    public static final int CARACTERE_NAO_IMPRIMIVEL=9;
    public static final int CHAMADA_DE_CLASSE=10;
    public static final int CHAMADA_DE_OBJETO=11;
    public static final int CLASSE=12;
    public static final int COLCHETE_DIREITO=13;
    public static final int COLCHETE_ESQUERDO=14;
    public static final int COMENTARIO_EM_BLOCO=15;
    public static final int COMENTARIO_EM_LINHA=16;
    public static final int COMO=17;
    public static final int CONSTANTE_INTEIRA=18;
    public static final int CONSTANTE_REAL=19;
    public static final int CONSTRUTOR=20;
    public static final int DECLARE=21;
    public static final int DESTRUA=22;
    public static final int DESTRUTOR=23;
    public static final int DIFERENTE=24;
    public static final int DIGITO=25;
    public static final int DIVISAO=26;
    public static final int E=27;
    public static final int ENQUANTO=28;
    public static final int ESPACO_EM_BRANCO=29;
    public static final int ESSA=30;
    public static final int ESSE=31;
    public static final int ESTATICO=32;
    public static final int FIM=33;
    public static final int IDENTIFICADOR=34;
    public static final int IDENTIFICADOR_DE_PACOTE=35;
    public static final int IGUAL=36;
    public static final int IMPLEMENTA=37;
    public static final int IMPORTE=38;
    public static final int INICIO=39;
    public static final int INTERFACE=40;
    public static final int LANCE=41;
    public static final int LETRA=42;
    public static final int LITERAL_CARACTERE=43;
    public static final int LITERAL_TEXTO=44;
    public static final int MAIOR=45;
    public static final int MAIOR_IGUAL=46;
    public static final int MENOR=47;
    public static final int MENOR_IGUAL=48;
    public static final int METODO=49;
    public static final int MULTIPLICACAO=50;
    public static final int NEGACAO=51;
    public static final int NOVA=52;
    public static final int NOVO=53;
    public static final int OU=54;
    public static final int PACOTE=55;
    public static final int PARA=56;
    public static final int PARENTESE_DIREITO=57;
    public static final int PARENTESE_ESQUERDO=58;
    public static final int PRIVADA=59;
    public static final int PRIVADO=60;
    public static final int PROTEGIDA=61;
    public static final int PROTEGIDO=62;
    public static final int PUBLICA=63;
    public static final int PUBLICO=64;
    public static final int QUEBRA_DE_LINHA=65;
    public static final int REPITA=66;
    public static final int RESTO_DA_DIVISAO=67;
    public static final int RETORNE=68;
    public static final int SE=69;
    public static final int SENAO=70;
    public static final int SEPARADOR=71;
    public static final int SOMA=72;
    public static final int SUBTRACAO=73;
    public static final int TABULACAO=74;
    public static final int TENTE=75;
    public static final int TERMINADOR=76;
    public static final int USADO_EM_TEXTO=77;
    public static final int VALOR_BOOLEANO=78;
    public static final int VALOR_NULO=79;
    public static final int ARGUMENTOS_=80;
    public static final int ASSINATURAS_DE_METODOS_=81;
    public static final int ASSINATURA_=82;
    public static final int ASSINATURA_DE_METODO_=83;
    public static final int ATRIBUICAO_=84;
    public static final int ATRIBUTOS_=85;
    public static final int ATRIBUTO_=86;
    public static final int CABECALHO_=87;
    public static final int CAPTURAS_=88;
    public static final int CAPTURE_=89;
    public static final int CHAMADA_DE_CLASSE_=90;
    public static final int CHAMADA_DE_OBJETO_=91;
    public static final int CLASSE_=92;
    public static final int COMANDO_=93;
    public static final int CONSTRUTORES_=94;
    public static final int CONSTRUTOR_=95;
    public static final int CORPO_=96;
    public static final int DECLARACAO_=97;
    public static final int DECLARACAO_COM_ATRIBUICAO_OPICIONAL_=98;
    public static final int DESTRUICAO_=99;
    public static final int DESTRUTORES_=100;
    public static final int DESTRUTOR_=101;
    public static final int ENQUANTO_=102;
    public static final int EXPRESSAO_=103;
    public static final int IMPORTACAO_=104;
    public static final int IMPORTACOES_=105;
    public static final int INSTANCIACAO_=106;
    public static final int INSTRUCOES_=107;
    public static final int INTERFACES_=108;
    public static final int INTERFACE_=109;
    public static final int LANCE_=110;
    public static final int METODOS_=111;
    public static final int METODO_=112;
    public static final int PACOTE_=113;
    public static final int PARAMETROS_=114;
    public static final int PARA_=115;
    public static final int PRIMARIA_=116;
    public static final int PROGRAMA_=117;
    public static final int REFERENCIA_=118;
    public static final int REPITA_=119;
    public static final int RETORNO_=120;
    public static final int SELECAO_=121;
    public static final int SE_=122;
    public static final int SUBTRACAO_UNARIA_=123;
    public static final int TENTE_=124;
    public static final int TIPOS_=125;
    public static final int TIPOS_GENERICOS_=126;
    public static final int TIPO_=127;
    public static final int TIPO_GENERICO_=128;
    public static final int UNIDADE_=129;

    // delegates
    public TreeFilter[] getDelegates() {
        return new TreeFilter[] {};
    }

    // delegators


    public CanecaSemanticoDefinicao(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public CanecaSemanticoDefinicao(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return CanecaSemanticoDefinicao.tokenNames; }
    public String getGrammarFileName() { return "fontes/g/CanecaSemanticoDefinicao.g"; }


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
    		Reporter reporter = Reporter.fornecerInstancia();
    		if (!definido) {
    			reporter.reportarErro(String.format("[%s] [%s, %s] [%s] %s não foi definido.", escopoAtual.fornecerNome(), linha, coluna, tipoDoSimbolo, nomeDoMembro), membro);
    		} else {
    			reporter.reportarSucesso(String.format("[%s] [%s, %s] [%s] %s definido.", escopoAtual.fornecerNome(), linha, coluna, tipoDoSimbolo, nomeDoMembro), membro);
    		}
    	}



    // $ANTLR start "topdown"
    // fontes/g/CanecaSemanticoDefinicao.g:49:1: topdown : ( iniciarClasse | iniciarMetodo | iniciarConstrutor | iniciarDestrutor | iniciarBloco | declaracao | declaracaoDeAtributo );
    public final void topdown() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoDefinicao.g:50:2: ( iniciarClasse | iniciarMetodo | iniciarConstrutor | iniciarDestrutor | iniciarBloco | declaracao | declaracaoDeAtributo )
            int alt1=7;
            switch ( input.LA(1) ) {
            case CLASSE_:
                {
                alt1=1;
                }
                break;
            case METODO_:
                {
                alt1=2;
                }
                break;
            case CONSTRUTOR_:
                {
                alt1=3;
                }
                break;
            case DESTRUTOR_:
                {
                alt1=4;
                }
                break;
            case INSTRUCOES_:
                {
                alt1=5;
                }
                break;
            case DECLARACAO_:
                {
                alt1=6;
                }
                break;
            case ATRIBUTO_:
                {
                alt1=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // fontes/g/CanecaSemanticoDefinicao.g:50:4: iniciarClasse
                    {
                    pushFollow(FOLLOW_iniciarClasse_in_topdown55);
                    iniciarClasse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemanticoDefinicao.g:51:4: iniciarMetodo
                    {
                    pushFollow(FOLLOW_iniciarMetodo_in_topdown60);
                    iniciarMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemanticoDefinicao.g:52:4: iniciarConstrutor
                    {
                    pushFollow(FOLLOW_iniciarConstrutor_in_topdown65);
                    iniciarConstrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSemanticoDefinicao.g:53:4: iniciarDestrutor
                    {
                    pushFollow(FOLLOW_iniciarDestrutor_in_topdown70);
                    iniciarDestrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSemanticoDefinicao.g:54:4: iniciarBloco
                    {
                    pushFollow(FOLLOW_iniciarBloco_in_topdown75);
                    iniciarBloco();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // fontes/g/CanecaSemanticoDefinicao.g:55:4: declaracao
                    {
                    pushFollow(FOLLOW_declaracao_in_topdown80);
                    declaracao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // fontes/g/CanecaSemanticoDefinicao.g:56:4: declaracaoDeAtributo
                    {
                    pushFollow(FOLLOW_declaracaoDeAtributo_in_topdown85);
                    declaracaoDeAtributo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "topdown"



    // $ANTLR start "bottomup"
    // fontes/g/CanecaSemanticoDefinicao.g:59:1: bottomup : ( terminarClasse | terminarMetodo | terminarConstrutor | terminarDestrutor | terminarBloco );
    public final void bottomup() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoDefinicao.g:60:2: ( terminarClasse | terminarMetodo | terminarConstrutor | terminarDestrutor | terminarBloco )
            int alt2=5;
            switch ( input.LA(1) ) {
            case CLASSE_:
                {
                alt2=1;
                }
                break;
            case METODO_:
                {
                alt2=2;
                }
                break;
            case CONSTRUTOR_:
                {
                alt2=3;
                }
                break;
            case DESTRUTOR_:
                {
                alt2=4;
                }
                break;
            case INSTRUCOES_:
                {
                alt2=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // fontes/g/CanecaSemanticoDefinicao.g:60:4: terminarClasse
                    {
                    pushFollow(FOLLOW_terminarClasse_in_bottomup96);
                    terminarClasse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemanticoDefinicao.g:61:4: terminarMetodo
                    {
                    pushFollow(FOLLOW_terminarMetodo_in_bottomup101);
                    terminarMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemanticoDefinicao.g:62:4: terminarConstrutor
                    {
                    pushFollow(FOLLOW_terminarConstrutor_in_bottomup106);
                    terminarConstrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSemanticoDefinicao.g:63:4: terminarDestrutor
                    {
                    pushFollow(FOLLOW_terminarDestrutor_in_bottomup111);
                    terminarDestrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSemanticoDefinicao.g:64:4: terminarBloco
                    {
                    pushFollow(FOLLOW_terminarBloco_in_bottomup116);
                    terminarBloco();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bottomup"



    // $ANTLR start "iniciarClasse"
    // fontes/g/CanecaSemanticoDefinicao.g:67:1: iniciarClasse : ^( CLASSE_ . IDENTIFICADOR . . . ) ;
    public final void iniciarClasse() throws RecognitionException {
        CommonTree IDENTIFICADOR1=null;

        try {
            // fontes/g/CanecaSemanticoDefinicao.g:68:2: ( ^( CLASSE_ . IDENTIFICADOR . . . ) )
            // fontes/g/CanecaSemanticoDefinicao.g:68:4: ^( CLASSE_ . IDENTIFICADOR . . . )
            {
            match(input,CLASSE_,FOLLOW_CLASSE__in_iniciarClasse128); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            IDENTIFICADOR1=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_iniciarClasse132); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			Classe classe = new Classe((IDENTIFICADOR1!=null?IDENTIFICADOR1.getText():null));
            			boolean classeDefinida = escopoAtual.definirClasse(classe);
            			reportarDefinicao(classeDefinida, (IDENTIFICADOR1!=null?IDENTIFICADOR1.getText():null), classe, "classe", IDENTIFICADOR1.getLine(), IDENTIFICADOR1.getCharPositionInLine());
            			classe.abrir(escopoAtual);
            			escopoAtual = classe;
            			filaDeEscopos.add(escopoAtual);
            			Atributo esse = new Atributo("esse", new Tipo((IDENTIFICADOR1!=null?IDENTIFICADOR1.getText():null)));
            			Atributo essa = new Atributo("essa", new Tipo((IDENTIFICADOR1!=null?IDENTIFICADOR1.getText():null)));
            			boolean esseDefinido = classe.definirAtributo(esse);
            			boolean essaDefinida = classe.definirAtributo(essa);
            			reportarDefinicao(esseDefinido, "esse", esse, "atributo", IDENTIFICADOR1.getLine(), IDENTIFICADOR1.getCharPositionInLine());
            			reportarDefinicao(essaDefinida, "esse", essa, "atributo", IDENTIFICADOR1.getLine(), IDENTIFICADOR1.getCharPositionInLine());
            			esse.abrir(escopoAtual);
            			esse.fechar();
            			essa.abrir(escopoAtual);
            			esse.fechar();
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "iniciarClasse"



    // $ANTLR start "terminarClasse"
    // fontes/g/CanecaSemanticoDefinicao.g:89:1: terminarClasse : CLASSE_ ;
    public final void terminarClasse() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoDefinicao.g:90:2: ( CLASSE_ )
            // fontes/g/CanecaSemanticoDefinicao.g:90:4: CLASSE_
            {
            match(input,CLASSE_,FOLLOW_CLASSE__in_terminarClasse154); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            			escopoAtual = escopoAtual.fechar();
            			filaDeEscopos.add(escopoAtual);
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "terminarClasse"



    // $ANTLR start "iniciarMetodo"
    // fontes/g/CanecaSemanticoDefinicao.g:97:1: iniciarMetodo : ^( METODO_ ^( ASSINATURA_ . ( ESTATICO )? tipo IDENTIFICADOR . ) . ) ;
    public final void iniciarMetodo() throws RecognitionException {
        CommonTree IDENTIFICADOR2=null;
        Tipo tipo3 =null;


        try {
            // fontes/g/CanecaSemanticoDefinicao.g:98:2: ( ^( METODO_ ^( ASSINATURA_ . ( ESTATICO )? tipo IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemanticoDefinicao.g:98:4: ^( METODO_ ^( ASSINATURA_ . ( ESTATICO )? tipo IDENTIFICADOR . ) . )
            {
            match(input,METODO_,FOLLOW_METODO__in_iniciarMetodo170); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_iniciarMetodo173); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            // fontes/g/CanecaSemanticoDefinicao.g:98:30: ( ESTATICO )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ESTATICO) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // fontes/g/CanecaSemanticoDefinicao.g:98:31: ESTATICO
                    {
                    match(input,ESTATICO,FOLLOW_ESTATICO_in_iniciarMetodo178); if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_iniciarMetodo182);
            tipo3=tipo();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR2=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_iniciarMetodo184); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			Metodo metodo = new Metodo((IDENTIFICADOR2!=null?IDENTIFICADOR2.getText():null), tipo3);
            			boolean definido = escopoAtual.definirMetodo(metodo);
            			reportarDefinicao(definido, (IDENTIFICADOR2!=null?IDENTIFICADOR2.getText():null), metodo, "metodo", IDENTIFICADOR2.getLine(), IDENTIFICADOR2.getCharPositionInLine());
            			metodo.abrir(escopoAtual);
            			escopoAtual = metodo;
            			filaDeEscopos.add(escopoAtual);
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "iniciarMetodo"



    // $ANTLR start "terminarMetodo"
    // fontes/g/CanecaSemanticoDefinicao.g:109:1: terminarMetodo : METODO_ ;
    public final void terminarMetodo() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoDefinicao.g:110:2: ( METODO_ )
            // fontes/g/CanecaSemanticoDefinicao.g:110:4: METODO_
            {
            match(input,METODO_,FOLLOW_METODO__in_terminarMetodo205); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            			escopoAtual = escopoAtual.fechar();
            			filaDeEscopos.add(escopoAtual);
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "terminarMetodo"



    // $ANTLR start "iniciarConstrutor"
    // fontes/g/CanecaSemanticoDefinicao.g:117:1: iniciarConstrutor : ^( CONSTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . ) ;
    public final void iniciarConstrutor() throws RecognitionException {
        CommonTree IDENTIFICADOR4=null;

        try {
            // fontes/g/CanecaSemanticoDefinicao.g:118:2: ( ^( CONSTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemanticoDefinicao.g:118:4: ^( CONSTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . )
            {
            match(input,CONSTRUTOR_,FOLLOW_CONSTRUTOR__in_iniciarConstrutor221); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_iniciarConstrutor224); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            IDENTIFICADOR4=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_iniciarConstrutor228); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			Metodo construtor = new Metodo((IDENTIFICADOR4!=null?IDENTIFICADOR4.getText():null), null);
            			boolean definido = ((Classe) escopoAtual).definirConstrutor(construtor);
            			reportarDefinicao(definido, (IDENTIFICADOR4!=null?IDENTIFICADOR4.getText():null), construtor, "construtor", IDENTIFICADOR4.getLine(), IDENTIFICADOR4.getCharPositionInLine());
            			construtor.abrir(escopoAtual);
            			escopoAtual = construtor;
            			filaDeEscopos.add(escopoAtual);
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "iniciarConstrutor"



    // $ANTLR start "terminarConstrutor"
    // fontes/g/CanecaSemanticoDefinicao.g:129:1: terminarConstrutor : CONSTRUTOR_ ;
    public final void terminarConstrutor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoDefinicao.g:130:2: ( CONSTRUTOR_ )
            // fontes/g/CanecaSemanticoDefinicao.g:130:4: CONSTRUTOR_
            {
            match(input,CONSTRUTOR_,FOLLOW_CONSTRUTOR__in_terminarConstrutor249); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            			escopoAtual = escopoAtual.fechar();
            			filaDeEscopos.add(escopoAtual);
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "terminarConstrutor"



    // $ANTLR start "iniciarDestrutor"
    // fontes/g/CanecaSemanticoDefinicao.g:137:1: iniciarDestrutor : ^( DESTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . ) ;
    public final void iniciarDestrutor() throws RecognitionException {
        CommonTree IDENTIFICADOR5=null;

        try {
            // fontes/g/CanecaSemanticoDefinicao.g:138:2: ( ^( DESTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemanticoDefinicao.g:138:4: ^( DESTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . )
            {
            match(input,DESTRUTOR_,FOLLOW_DESTRUTOR__in_iniciarDestrutor265); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_iniciarDestrutor268); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            IDENTIFICADOR5=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_iniciarDestrutor272); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			Metodo destrutor = new Metodo((IDENTIFICADOR5!=null?IDENTIFICADOR5.getText():null), null);
            			boolean definido = ((Classe) escopoAtual).definirDestrutor(destrutor);
            			reportarDefinicao(definido, (IDENTIFICADOR5!=null?IDENTIFICADOR5.getText():null), destrutor, "destrutor", IDENTIFICADOR5.getLine(), IDENTIFICADOR5.getCharPositionInLine());
            			destrutor.abrir(escopoAtual);
            			escopoAtual = destrutor;
            			filaDeEscopos.add(escopoAtual);
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "iniciarDestrutor"



    // $ANTLR start "terminarDestrutor"
    // fontes/g/CanecaSemanticoDefinicao.g:149:1: terminarDestrutor : DESTRUTOR_ ;
    public final void terminarDestrutor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoDefinicao.g:150:2: ( DESTRUTOR_ )
            // fontes/g/CanecaSemanticoDefinicao.g:150:4: DESTRUTOR_
            {
            match(input,DESTRUTOR_,FOLLOW_DESTRUTOR__in_terminarDestrutor293); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            			escopoAtual = escopoAtual.fechar();
            			filaDeEscopos.add(escopoAtual);
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "terminarDestrutor"



    // $ANTLR start "iniciarBloco"
    // fontes/g/CanecaSemanticoDefinicao.g:157:1: iniciarBloco : ^( INSTRUCOES_ ( . )* ) ;
    public final void iniciarBloco() throws RecognitionException {
        CommonTree INSTRUCOES_6=null;

        try {
            // fontes/g/CanecaSemanticoDefinicao.g:158:2: ( ^( INSTRUCOES_ ( . )* ) )
            // fontes/g/CanecaSemanticoDefinicao.g:158:4: ^( INSTRUCOES_ ( . )* )
            {
            INSTRUCOES_6=(CommonTree)match(input,INSTRUCOES_,FOLLOW_INSTRUCOES__in_iniciarBloco309); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemanticoDefinicao.g:158:18: ( . )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0 >= ATRIBUIDOR && LA4_0 <= UNIDADE_)) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==UP) ) {
                        alt4=2;
                    }


                    switch (alt4) {
                	case 1 :
                	    // fontes/g/CanecaSemanticoDefinicao.g:158:19: .
                	    {
                	    matchAny(input); if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop4;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            if ( state.backtracking==1 ) {
            			if (INSTRUCOES_6.hasAncestor(METODO_)) {
            				Bloco bloco = new Bloco();
            				bloco.abrir(escopoAtual);
            				escopoAtual = bloco;
            				filaDeEscopos.add(escopoAtual);
            			}
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "iniciarBloco"



    // $ANTLR start "terminarBloco"
    // fontes/g/CanecaSemanticoDefinicao.g:169:1: terminarBloco : INSTRUCOES_ ;
    public final void terminarBloco() throws RecognitionException {
        CommonTree INSTRUCOES_7=null;

        try {
            // fontes/g/CanecaSemanticoDefinicao.g:170:2: ( INSTRUCOES_ )
            // fontes/g/CanecaSemanticoDefinicao.g:170:4: INSTRUCOES_
            {
            INSTRUCOES_7=(CommonTree)match(input,INSTRUCOES_,FOLLOW_INSTRUCOES__in_terminarBloco330); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            			if (INSTRUCOES_7.hasAncestor(METODO_)) {
            				escopoAtual = escopoAtual.fechar();
            				filaDeEscopos.add(escopoAtual);
            			}
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "terminarBloco"



    // $ANTLR start "declaracao"
    // fontes/g/CanecaSemanticoDefinicao.g:179:1: declaracao : ^( DECLARACAO_ tipo IDENTIFICADOR ) ;
    public final void declaracao() throws RecognitionException {
        CommonTree IDENTIFICADOR8=null;
        Tipo tipo9 =null;


        try {
            // fontes/g/CanecaSemanticoDefinicao.g:180:2: ( ^( DECLARACAO_ tipo IDENTIFICADOR ) )
            // fontes/g/CanecaSemanticoDefinicao.g:180:4: ^( DECLARACAO_ tipo IDENTIFICADOR )
            {
            match(input,DECLARACAO_,FOLLOW_DECLARACAO__in_declaracao346); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tipo_in_declaracao348);
            tipo9=tipo();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR8=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_declaracao350); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			Variavel variavel = new Variavel((IDENTIFICADOR8!=null?IDENTIFICADOR8.getText():null), tipo9, IDENTIFICADOR8.getTokenStartIndex());
            			boolean definido = escopoAtual.definirVariavel(variavel);
            			reportarDefinicao(definido, (IDENTIFICADOR8!=null?IDENTIFICADOR8.getText():null), variavel, "variavel", IDENTIFICADOR8.getLine(), IDENTIFICADOR8.getCharPositionInLine());
            			variavel.abrir(escopoAtual);
            			variavel.fechar();
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declaracao"



    // $ANTLR start "declaracaoDeAtributo"
    // fontes/g/CanecaSemanticoDefinicao.g:190:1: declaracaoDeAtributo : ^( ATRIBUTO_ . ( ESTATICO )? tipo IDENTIFICADOR ( . )? ) ;
    public final void declaracaoDeAtributo() throws RecognitionException {
        CommonTree IDENTIFICADOR10=null;
        Tipo tipo11 =null;


        try {
            // fontes/g/CanecaSemanticoDefinicao.g:191:2: ( ^( ATRIBUTO_ . ( ESTATICO )? tipo IDENTIFICADOR ( . )? ) )
            // fontes/g/CanecaSemanticoDefinicao.g:191:4: ^( ATRIBUTO_ . ( ESTATICO )? tipo IDENTIFICADOR ( . )? )
            {
            match(input,ATRIBUTO_,FOLLOW_ATRIBUTO__in_declaracaoDeAtributo367); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            // fontes/g/CanecaSemanticoDefinicao.g:191:18: ( ESTATICO )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ESTATICO) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // fontes/g/CanecaSemanticoDefinicao.g:191:19: ESTATICO
                    {
                    match(input,ESTATICO,FOLLOW_ESTATICO_in_declaracaoDeAtributo372); if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_declaracaoDeAtributo376);
            tipo11=tipo();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR10=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_declaracaoDeAtributo378); if (state.failed) return ;

            // fontes/g/CanecaSemanticoDefinicao.g:191:49: ( . )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0 >= ATRIBUIDOR && LA6_0 <= UNIDADE_)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // fontes/g/CanecaSemanticoDefinicao.g:191:50: .
                    {
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			Atributo atributo = new Atributo((IDENTIFICADOR10!=null?IDENTIFICADOR10.getText():null), tipo11);
            			boolean definido = escopoAtual.definirAtributo(atributo);
            			reportarDefinicao(definido, (IDENTIFICADOR10!=null?IDENTIFICADOR10.getText():null), atributo, "atributo", IDENTIFICADOR10.getLine(), IDENTIFICADOR10.getCharPositionInLine());
            			atributo.abrir(escopoAtual);
            			atributo.fechar();
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declaracaoDeAtributo"



    // $ANTLR start "tipo"
    // fontes/g/CanecaSemanticoDefinicao.g:201:1: tipo returns [Tipo umTipo] : ^( TIPO_ IDENTIFICADOR listaDeTipos[umTipo] ) ;
    public final Tipo tipo() throws RecognitionException {
        Tipo umTipo = null;


        CommonTree IDENTIFICADOR12=null;

        try {
            // fontes/g/CanecaSemanticoDefinicao.g:202:2: ( ^( TIPO_ IDENTIFICADOR listaDeTipos[umTipo] ) )
            // fontes/g/CanecaSemanticoDefinicao.g:202:4: ^( TIPO_ IDENTIFICADOR listaDeTipos[umTipo] )
            {
            match(input,TIPO_,FOLLOW_TIPO__in_tipo404); if (state.failed) return umTipo;

            match(input, Token.DOWN, null); if (state.failed) return umTipo;
            IDENTIFICADOR12=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_tipo406); if (state.failed) return umTipo;

            if ( state.backtracking==1 ) {
            			umTipo = new Tipo((IDENTIFICADOR12!=null?IDENTIFICADOR12.getText():null), IDENTIFICADOR12.getLine(), IDENTIFICADOR12.getCharPositionInLine());
            		}

            pushFollow(FOLLOW_listaDeTipos_in_tipo414);
            listaDeTipos(umTipo);

            state._fsp--;
            if (state.failed) return umTipo;

            match(input, Token.UP, null); if (state.failed) return umTipo;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return umTipo;
    }
    // $ANTLR end "tipo"



    // $ANTLR start "listaDeTipos"
    // fontes/g/CanecaSemanticoDefinicao.g:209:1: listaDeTipos[Tipo tipoPai] : ^( TIPOS_ ( tipo )* ) ;
    public final void listaDeTipos(Tipo tipoPai) throws RecognitionException {
        Tipo tipo13 =null;


        try {
            // fontes/g/CanecaSemanticoDefinicao.g:210:2: ( ^( TIPOS_ ( tipo )* ) )
            // fontes/g/CanecaSemanticoDefinicao.g:210:4: ^( TIPOS_ ( tipo )* )
            {
            match(input,TIPOS_,FOLLOW_TIPOS__in_listaDeTipos429); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemanticoDefinicao.g:210:13: ( tipo )*
                loop7:
                do {
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==TIPO_) ) {
                        alt7=1;
                    }


                    switch (alt7) {
                	case 1 :
                	    // fontes/g/CanecaSemanticoDefinicao.g:210:14: tipo
                	    {
                	    pushFollow(FOLLOW_tipo_in_listaDeTipos432);
                	    tipo13=tipo();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    if ( state.backtracking==1 ) {
                	    			tipoPai.adicionarTipoAninhado(tipo13);
                	    		}

                	    }
                	    break;

                	default :
                	    break loop7;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listaDeTipos"

    // Delegated rules


 

    public static final BitSet FOLLOW_iniciarClasse_in_topdown55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iniciarMetodo_in_topdown60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iniciarConstrutor_in_topdown65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iniciarDestrutor_in_topdown70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iniciarBloco_in_topdown75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracao_in_topdown80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracaoDeAtributo_in_topdown85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarClasse_in_bottomup96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarMetodo_in_bottomup101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarConstrutor_in_bottomup106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarDestrutor_in_bottomup111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarBloco_in_bottomup116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASSE__in_iniciarClasse128 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_iniciarClasse132 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_CLASSE__in_terminarClasse154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METODO__in_iniciarMetodo170 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_iniciarMetodo173 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ESTATICO_in_iniciarMetodo178 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_tipo_in_iniciarMetodo182 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_iniciarMetodo184 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_METODO__in_terminarMetodo205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUTOR__in_iniciarConstrutor221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_iniciarConstrutor224 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_iniciarConstrutor228 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_CONSTRUTOR__in_terminarConstrutor249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTRUTOR__in_iniciarDestrutor265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_iniciarDestrutor268 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_iniciarDestrutor272 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_DESTRUTOR__in_terminarDestrutor293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCOES__in_iniciarBloco309 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INSTRUCOES__in_terminarBloco330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARACAO__in_declaracao346 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_declaracao348 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_declaracao350 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATRIBUTO__in_declaracaoDeAtributo367 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ESTATICO_in_declaracaoDeAtributo372 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_tipo_in_declaracaoDeAtributo376 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_declaracaoDeAtributo378 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_TIPO__in_tipo404 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_tipo406 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_listaDeTipos_in_tipo414 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIPOS__in_listaDeTipos429 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_listaDeTipos432 = new BitSet(new long[]{0x0000000000000008L,0x8000000000000000L});

}