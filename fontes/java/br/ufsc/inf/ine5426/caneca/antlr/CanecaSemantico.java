// $ANTLR 3.4 fontes/g/CanecaSemantico.g 2012-12-05 07:22:03

	package br.ufsc.inf.ine5426.caneca.antlr;
	
	import br.ufsc.inf.ine5426.caneca.interno.Atributo;
	import br.ufsc.inf.ine5426.caneca.interno.Classe;
	import br.ufsc.inf.ine5426.caneca.interno.Construtor;
	import br.ufsc.inf.ine5426.caneca.interno.Destrutor;
	import br.ufsc.inf.ine5426.caneca.interno.EscopoLocal;
	import br.ufsc.inf.ine5426.caneca.interno.TabelaDeSimbolos;
	import br.ufsc.inf.ine5426.caneca.interno.Tipo;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CanecaSemantico extends TreeFilter {
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


    public CanecaSemantico(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public CanecaSemantico(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return CanecaSemantico.tokenNames; }
    public String getGrammarFileName() { return "fontes/g/CanecaSemantico.g"; }


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



    // $ANTLR start "topdown"
    // fontes/g/CanecaSemantico.g:44:1: topdown : ( classe | atributo | construtor | destrutor );
    public final void topdown() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:45:2: ( classe | atributo | construtor | destrutor )
            int alt1=4;
            switch ( input.LA(1) ) {
            case CLASSE_:
                {
                alt1=1;
                }
                break;
            case ATRIBUTO_:
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
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:45:4: classe
                    {
                    pushFollow(FOLLOW_classe_in_topdown60);
                    classe();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:46:4: atributo
                    {
                    pushFollow(FOLLOW_atributo_in_topdown65);
                    atributo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemantico.g:47:4: construtor
                    {
                    pushFollow(FOLLOW_construtor_in_topdown70);
                    construtor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSemantico.g:48:4: destrutor
                    {
                    pushFollow(FOLLOW_destrutor_in_topdown75);
                    destrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "topdown"



    // $ANTLR start "bottomup"
    // fontes/g/CanecaSemantico.g:51:1: bottomup : ( terminaClasse | terminarConstrutor | terminarDestrutor );
    public final void bottomup() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:52:2: ( terminaClasse | terminarConstrutor | terminarDestrutor )
            int alt2=3;
            switch ( input.LA(1) ) {
            case CLASSE_:
                {
                alt2=1;
                }
                break;
            case CONSTRUTOR_:
                {
                alt2=2;
                }
                break;
            case DESTRUTOR_:
                {
                alt2=3;
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
                    // fontes/g/CanecaSemantico.g:52:4: terminaClasse
                    {
                    pushFollow(FOLLOW_terminaClasse_in_bottomup86);
                    terminaClasse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:53:4: terminarConstrutor
                    {
                    pushFollow(FOLLOW_terminarConstrutor_in_bottomup91);
                    terminarConstrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemantico.g:54:4: terminarDestrutor
                    {
                    pushFollow(FOLLOW_terminarDestrutor_in_bottomup96);
                    terminarDestrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bottomup"



    // $ANTLR start "programa"
    // fontes/g/CanecaSemantico.g:57:1: programa : ^( PROGRAMA_ ( unicadeDeCompilacao )+ ) ;
    public final void programa() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:58:2: ( ^( PROGRAMA_ ( unicadeDeCompilacao )+ ) )
            // fontes/g/CanecaSemantico.g:58:4: ^( PROGRAMA_ ( unicadeDeCompilacao )+ )
            {
            match(input,PROGRAMA_,FOLLOW_PROGRAMA__in_programa108); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // fontes/g/CanecaSemantico.g:58:16: ( unicadeDeCompilacao )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==UNIDADE_) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // fontes/g/CanecaSemantico.g:58:17: unicadeDeCompilacao
            	    {
            	    pushFollow(FOLLOW_unicadeDeCompilacao_in_programa111);
            	    unicadeDeCompilacao();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "programa"



    // $ANTLR start "unicadeDeCompilacao"
    // fontes/g/CanecaSemantico.g:61:1: unicadeDeCompilacao : ( ^( UNIDADE_ cabecalho classe ) | ^( UNIDADE_ cabecalho interfaces ) );
    public final void unicadeDeCompilacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:62:2: ( ^( UNIDADE_ cabecalho classe ) | ^( UNIDADE_ cabecalho interfaces ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:62:4: ^( UNIDADE_ cabecalho classe )
                    {
                    match(input,UNIDADE_,FOLLOW_UNIDADE__in_unicadeDeCompilacao126); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_cabecalho_in_unicadeDeCompilacao128);
                    cabecalho();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_classe_in_unicadeDeCompilacao130);
                    classe();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:63:4: ^( UNIDADE_ cabecalho interfaces )
                    {
                    match(input,UNIDADE_,FOLLOW_UNIDADE__in_unicadeDeCompilacao137); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_cabecalho_in_unicadeDeCompilacao139);
                    cabecalho();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_interfaces_in_unicadeDeCompilacao141);
                    interfaces();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }
        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "unicadeDeCompilacao"



    // $ANTLR start "cabecalho"
    // fontes/g/CanecaSemantico.g:66:1: cabecalho : ^( CABECALHO_ pacote importacoes ) ;
    public final void cabecalho() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:67:2: ( ^( CABECALHO_ pacote importacoes ) )
            // fontes/g/CanecaSemantico.g:67:4: ^( CABECALHO_ pacote importacoes )
            {
            match(input,CABECALHO_,FOLLOW_CABECALHO__in_cabecalho154); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_pacote_in_cabecalho156);
            pacote();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_importacoes_in_cabecalho158);
            importacoes();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "cabecalho"



    // $ANTLR start "pacote"
    // fontes/g/CanecaSemantico.g:70:1: pacote : ^( PACOTE_ IDENTIFICADOR_DE_PACOTE ) ;
    public final void pacote() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:71:2: ( ^( PACOTE_ IDENTIFICADOR_DE_PACOTE ) )
            // fontes/g/CanecaSemantico.g:71:4: ^( PACOTE_ IDENTIFICADOR_DE_PACOTE )
            {
            match(input,PACOTE_,FOLLOW_PACOTE__in_pacote171); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,IDENTIFICADOR_DE_PACOTE,FOLLOW_IDENTIFICADOR_DE_PACOTE_in_pacote173); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "pacote"



    // $ANTLR start "importacoes"
    // fontes/g/CanecaSemantico.g:74:1: importacoes : ^( IMPORTACOES_ ( importacao )* ) ;
    public final void importacoes() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:75:2: ( ^( IMPORTACOES_ ( importacao )* ) )
            // fontes/g/CanecaSemantico.g:75:4: ^( IMPORTACOES_ ( importacao )* )
            {
            match(input,IMPORTACOES_,FOLLOW_IMPORTACOES__in_importacoes186); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:75:19: ( importacao )*
                loop5:
                do {
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==IMPORTACAO_) ) {
                        alt5=1;
                    }


                    switch (alt5) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:75:20: importacao
                	    {
                	    pushFollow(FOLLOW_importacao_in_importacoes189);
                	    importacao();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop5;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "importacoes"



    // $ANTLR start "importacao"
    // fontes/g/CanecaSemantico.g:78:1: importacao : ( ^( IMPORTACAO_ IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( IDENTIFICADOR )? ) | ^( IMPORTACAO_ IDENTIFICADOR_DE_PACOTE ) );
    public final void importacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:79:2: ( ^( IMPORTACAO_ IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( IDENTIFICADOR )? ) | ^( IMPORTACAO_ IDENTIFICADOR_DE_PACOTE ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IMPORTACAO_) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==DOWN) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==IDENTIFICADOR) ) {
                        alt7=1;
                    }
                    else if ( (LA7_2==IDENTIFICADOR_DE_PACOTE) ) {
                        alt7=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:79:4: ^( IMPORTACAO_ IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( IDENTIFICADOR )? )
                    {
                    match(input,IMPORTACAO_,FOLLOW_IMPORTACAO__in_importacao204); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_importacao206); if (state.failed) return ;

                    match(input,IDENTIFICADOR_DE_PACOTE,FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao208); if (state.failed) return ;

                    // fontes/g/CanecaSemantico.g:79:56: ( IDENTIFICADOR )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==IDENTIFICADOR) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // fontes/g/CanecaSemantico.g:79:57: IDENTIFICADOR
                            {
                            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_importacao211); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:80:4: ^( IMPORTACAO_ IDENTIFICADOR_DE_PACOTE )
                    {
                    match(input,IMPORTACAO_,FOLLOW_IMPORTACAO__in_importacao220); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,IDENTIFICADOR_DE_PACOTE,FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao222); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }
        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "importacao"



    // $ANTLR start "classe"
    // fontes/g/CanecaSemantico.g:83:1: classe : ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . ) ;
    public final void classe() throws RecognitionException {
        CommonTree IDENTIFICADOR1=null;

        try {
            // fontes/g/CanecaSemantico.g:84:2: ( ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . ) )
            // fontes/g/CanecaSemantico.g:84:4: ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . )
            {
            match(input,CLASSE_,FOLLOW_CLASSE__in_classe235); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoFeminino_in_classe237);
            modificadorDeAcessoFeminino();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR1=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_classe239); if (state.failed) return ;

            pushFollow(FOLLOW_listaDeTiposGenericos_in_classe241);
            listaDeTiposGenericos();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_listaDeInterfaces_in_classe243);
            listaDeInterfaces();

            state._fsp--;
            if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("classe");
            			Classe classe = new Classe((IDENTIFICADOR1!=null?IDENTIFICADOR1.getText():null), IDENTIFICADOR1.getLine(), IDENTIFICADOR1.getCharPositionInLine());
            			classeAtual = classe;
            			tabelaDeSimbolos.definirClasse(classe);
            		}

            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "classe"



    // $ANTLR start "terminaClasse"
    // fontes/g/CanecaSemantico.g:93:1: terminaClasse : ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . ) ;
    public final void terminaClasse() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:94:2: ( ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . ) )
            // fontes/g/CanecaSemantico.g:94:4: ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . )
            {
            match(input,CLASSE_,FOLLOW_CLASSE__in_terminaClasse262); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoFeminino_in_terminaClasse264);
            modificadorDeAcessoFeminino();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_terminaClasse266); if (state.failed) return ;

            pushFollow(FOLLOW_listaDeTiposGenericos_in_terminaClasse268);
            listaDeTiposGenericos();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_listaDeInterfaces_in_terminaClasse270);
            listaDeInterfaces();

            state._fsp--;
            if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminarClasse");
            			classeAtual = null;
            		}

            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "terminaClasse"



    // $ANTLR start "interfaces"
    // fontes/g/CanecaSemantico.g:101:1: interfaces : ^( INTERFACE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface ) ;
    public final void interfaces() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:102:2: ( ^( INTERFACE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface ) )
            // fontes/g/CanecaSemantico.g:102:4: ^( INTERFACE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface )
            {
            match(input,INTERFACE_,FOLLOW_INTERFACE__in_interfaces289); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoFeminino_in_interfaces291);
            modificadorDeAcessoFeminino();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_interfaces293); if (state.failed) return ;

            pushFollow(FOLLOW_listaDeTiposGenericos_in_interfaces295);
            listaDeTiposGenericos();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_listaDeInterfaces_in_interfaces297);
            listaDeInterfaces();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_corpoDaInterface_in_interfaces299);
            corpoDaInterface();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "interfaces"



    // $ANTLR start "corpoDaClasse"
    // fontes/g/CanecaSemantico.g:105:1: corpoDaClasse : ^( CORPO_ atributos construtores destrutor metodos ) ;
    public final void corpoDaClasse() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:106:2: ( ^( CORPO_ atributos construtores destrutor metodos ) )
            // fontes/g/CanecaSemantico.g:106:4: ^( CORPO_ atributos construtores destrutor metodos )
            {
            match(input,CORPO_,FOLLOW_CORPO__in_corpoDaClasse312); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_atributos_in_corpoDaClasse314);
            atributos();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_construtores_in_corpoDaClasse316);
            construtores();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_destrutor_in_corpoDaClasse318);
            destrutor();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_metodos_in_corpoDaClasse320);
            metodos();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "corpoDaClasse"



    // $ANTLR start "corpoDaInterface"
    // fontes/g/CanecaSemantico.g:109:1: corpoDaInterface : ^( CORPO_ atributos assinaturasDeMetodos ) ;
    public final void corpoDaInterface() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:110:2: ( ^( CORPO_ atributos assinaturasDeMetodos ) )
            // fontes/g/CanecaSemantico.g:110:4: ^( CORPO_ atributos assinaturasDeMetodos )
            {
            match(input,CORPO_,FOLLOW_CORPO__in_corpoDaInterface333); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_atributos_in_corpoDaInterface335);
            atributos();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_assinaturasDeMetodos_in_corpoDaInterface337);
            assinaturasDeMetodos();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "corpoDaInterface"



    // $ANTLR start "atributos"
    // fontes/g/CanecaSemantico.g:113:1: atributos : ^( ATRIBUTOS_ ( atributo )* ) ;
    public final void atributos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:114:2: ( ^( ATRIBUTOS_ ( atributo )* ) )
            // fontes/g/CanecaSemantico.g:114:4: ^( ATRIBUTOS_ ( atributo )* )
            {
            match(input,ATRIBUTOS_,FOLLOW_ATRIBUTOS__in_atributos350); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:114:17: ( atributo )*
                loop8:
                do {
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==ATRIBUTO_) ) {
                        alt8=1;
                    }


                    switch (alt8) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:114:18: atributo
                	    {
                	    pushFollow(FOLLOW_atributo_in_atributos353);
                	    atributo();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop8;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "atributos"



    // $ANTLR start "construtores"
    // fontes/g/CanecaSemantico.g:117:1: construtores : ^( CONSTRUTORES_ ( construtor )+ ) ;
    public final void construtores() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:118:2: ( ^( CONSTRUTORES_ ( construtor )+ ) )
            // fontes/g/CanecaSemantico.g:118:4: ^( CONSTRUTORES_ ( construtor )+ )
            {
            match(input,CONSTRUTORES_,FOLLOW_CONSTRUTORES__in_construtores368); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // fontes/g/CanecaSemantico.g:118:20: ( construtor )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==CONSTRUTOR_) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // fontes/g/CanecaSemantico.g:118:21: construtor
            	    {
            	    pushFollow(FOLLOW_construtor_in_construtores371);
            	    construtor();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "construtores"



    // $ANTLR start "metodos"
    // fontes/g/CanecaSemantico.g:121:1: metodos : ^( METODOS_ ( metodo )* ) ;
    public final void metodos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:122:2: ( ^( METODOS_ ( metodo )* ) )
            // fontes/g/CanecaSemantico.g:122:4: ^( METODOS_ ( metodo )* )
            {
            match(input,METODOS_,FOLLOW_METODOS__in_metodos386); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:122:15: ( metodo )*
                loop10:
                do {
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==METODO_) ) {
                        alt10=1;
                    }


                    switch (alt10) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:122:16: metodo
                	    {
                	    pushFollow(FOLLOW_metodo_in_metodos389);
                	    metodo();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop10;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "metodos"



    // $ANTLR start "assinaturasDeMetodos"
    // fontes/g/CanecaSemantico.g:125:1: assinaturasDeMetodos : ^( ASSINATURAS_DE_METODOS_ ( ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR listaDeArgumentos ) )* ) ;
    public final void assinaturasDeMetodos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:126:2: ( ^( ASSINATURAS_DE_METODOS_ ( ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR listaDeArgumentos ) )* ) )
            // fontes/g/CanecaSemantico.g:126:4: ^( ASSINATURAS_DE_METODOS_ ( ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR listaDeArgumentos ) )* )
            {
            match(input,ASSINATURAS_DE_METODOS_,FOLLOW_ASSINATURAS_DE_METODOS__in_assinaturasDeMetodos404); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:126:30: ( ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR listaDeArgumentos ) )*
                loop12:
                do {
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==ASSINATURA_) ) {
                        alt12=1;
                    }


                    switch (alt12) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:126:31: ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR listaDeArgumentos )
                	    {
                	    match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_assinaturasDeMetodos408); if (state.failed) return ;

                	    match(input, Token.DOWN, null); if (state.failed) return ;
                	    pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_assinaturasDeMetodos410);
                	    modificadorDeAcessoMasculino();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    // fontes/g/CanecaSemantico.g:126:74: ( ESTATICO )?
                	    int alt11=2;
                	    int LA11_0 = input.LA(1);

                	    if ( (LA11_0==ESTATICO) ) {
                	        alt11=1;
                	    }
                	    switch (alt11) {
                	        case 1 :
                	            // fontes/g/CanecaSemantico.g:126:75: ESTATICO
                	            {
                	            match(input,ESTATICO,FOLLOW_ESTATICO_in_assinaturasDeMetodos413); if (state.failed) return ;

                	            }
                	            break;

                	    }


                	    pushFollow(FOLLOW_tipo_in_assinaturasDeMetodos417);
                	    tipo();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_assinaturasDeMetodos419); if (state.failed) return ;

                	    pushFollow(FOLLOW_listaDeArgumentos_in_assinaturasDeMetodos421);
                	    listaDeArgumentos();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    match(input, Token.UP, null); if (state.failed) return ;


                	    }
                	    break;

                	default :
                	    break loop12;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "assinaturasDeMetodos"



    // $ANTLR start "atributo"
    // fontes/g/CanecaSemantico.g:129:1: atributo : ^( ATRIBUTO_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR ( . )? ) ;
    public final void atributo() throws RecognitionException {
        CommonTree IDENTIFICADOR3=null;
        Tipo tipo2 =null;


        try {
            // fontes/g/CanecaSemantico.g:130:2: ( ^( ATRIBUTO_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR ( . )? ) )
            // fontes/g/CanecaSemantico.g:130:4: ^( ATRIBUTO_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR ( . )? )
            {
            match(input,ATRIBUTO_,FOLLOW_ATRIBUTO__in_atributo437); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_atributo439);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:130:45: ( ESTATICO )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ESTATICO) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:130:46: ESTATICO
                    {
                    match(input,ESTATICO,FOLLOW_ESTATICO_in_atributo442); if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_atributo446);
            tipo2=tipo();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR3=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_atributo448); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:130:76: ( . )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0 >= ATRIBUIDOR && LA14_0 <= UNIDADE_)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:130:77: .
                    {
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("atributo");
            			Atributo atributo = new Atributo(classeAtual, tipo2, (IDENTIFICADOR3!=null?IDENTIFICADOR3.getText():null), IDENTIFICADOR3.getLine(), IDENTIFICADOR3.getCharPositionInLine());
            			classeAtual.definirAtributo(atributo);
            		}

            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "atributo"



    // $ANTLR start "construtor"
    // fontes/g/CanecaSemantico.g:138:1: construtor : ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos ) . ) ;
    public final void construtor() throws RecognitionException {
        CommonTree IDENTIFICADOR4=null;

        try {
            // fontes/g/CanecaSemantico.g:139:2: ( ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos ) . ) )
            // fontes/g/CanecaSemantico.g:139:4: ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos ) . )
            {
            match(input,CONSTRUTOR_,FOLLOW_CONSTRUTOR__in_construtor470); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_construtor474); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_construtor476);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR4=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_construtor478); if (state.failed) return ;

            pushFollow(FOLLOW_listaDeArgumentos_in_construtor480);
            listaDeArgumentos();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("construtor");
            			Construtor construtor = new Construtor(classeAtual, (IDENTIFICADOR4!=null?IDENTIFICADOR4.getText():null), IDENTIFICADOR4.getLine(), IDENTIFICADOR4.getCharPositionInLine());
            			escopoLocalAtual = construtor;
            			classeAtual.definirConstrutor(construtor);
            		}

            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "construtor"



    // $ANTLR start "terminarConstrutor"
    // fontes/g/CanecaSemantico.g:148:1: terminarConstrutor : ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos ) . ) ;
    public final void terminarConstrutor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:149:2: ( ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos ) . ) )
            // fontes/g/CanecaSemantico.g:149:4: ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos ) . )
            {
            match(input,CONSTRUTOR_,FOLLOW_CONSTRUTOR__in_terminarConstrutor500); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_terminarConstrutor504); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_terminarConstrutor506);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_terminarConstrutor508); if (state.failed) return ;

            pushFollow(FOLLOW_listaDeArgumentos_in_terminarConstrutor510);
            listaDeArgumentos();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminarConstrutor");
            			escopoLocalAtual = escopoLocalAtual.fornecerEscopoPai();
            		}

            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "terminarConstrutor"



    // $ANTLR start "destrutor"
    // fontes/g/CanecaSemantico.g:156:1: destrutor : ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentosVazia ) . ) ;
    public final void destrutor() throws RecognitionException {
        CommonTree IDENTIFICADOR5=null;

        try {
            // fontes/g/CanecaSemantico.g:157:2: ( ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentosVazia ) . ) )
            // fontes/g/CanecaSemantico.g:157:4: ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentosVazia ) . )
            {
            match(input,DESTRUTOR_,FOLLOW_DESTRUTOR__in_destrutor530); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_destrutor533); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_destrutor535);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR5=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_destrutor537); if (state.failed) return ;

            pushFollow(FOLLOW_listaDeArgumentosVazia_in_destrutor539);
            listaDeArgumentosVazia();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("destrutor");
            			Destrutor destrutor = new Destrutor(classeAtual, (IDENTIFICADOR5!=null?IDENTIFICADOR5.getText():null), IDENTIFICADOR5.getLine(), IDENTIFICADOR5.getCharPositionInLine());
            			escopoLocalAtual = destrutor;
            			classeAtual.definirDestrutor(destrutor);
            		}

            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "destrutor"



    // $ANTLR start "terminarDestrutor"
    // fontes/g/CanecaSemantico.g:166:1: terminarDestrutor : ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentosVazia ) . ) ;
    public final void terminarDestrutor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:167:2: ( ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentosVazia ) . ) )
            // fontes/g/CanecaSemantico.g:167:4: ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentosVazia ) . )
            {
            match(input,DESTRUTOR_,FOLLOW_DESTRUTOR__in_terminarDestrutor559); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_terminarDestrutor562); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_terminarDestrutor564);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_terminarDestrutor566); if (state.failed) return ;

            pushFollow(FOLLOW_listaDeArgumentosVazia_in_terminarDestrutor568);
            listaDeArgumentosVazia();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminarDestrutor");
            			escopoLocalAtual = escopoLocalAtual.fornecerEscopoPai();
            		}

            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "terminarDestrutor"



    // $ANTLR start "metodo"
    // fontes/g/CanecaSemantico.g:174:1: metodo : ^( METODO_ ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR listaDeArgumentos ) . ) ;
    public final void metodo() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:175:2: ( ^( METODO_ ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR listaDeArgumentos ) . ) )
            // fontes/g/CanecaSemantico.g:175:4: ^( METODO_ ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR listaDeArgumentos ) . )
            {
            match(input,METODO_,FOLLOW_METODO__in_metodo588); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_metodo591); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_metodo593);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:175:57: ( ESTATICO )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ESTATICO) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:175:58: ESTATICO
                    {
                    match(input,ESTATICO,FOLLOW_ESTATICO_in_metodo596); if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_metodo600);
            tipo();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_metodo602); if (state.failed) return ;

            pushFollow(FOLLOW_listaDeArgumentos_in_metodo604);
            listaDeArgumentos();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "metodo"



    // $ANTLR start "modificadorDeAcessoMasculino"
    // fontes/g/CanecaSemantico.g:178:1: modificadorDeAcessoMasculino : ( PUBLICO | PRIVADO | PROTEGIDO );
    public final void modificadorDeAcessoMasculino() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:179:2: ( PUBLICO | PRIVADO | PROTEGIDO )
            // fontes/g/CanecaSemantico.g:
            {
            if ( input.LA(1)==PRIVADO||input.LA(1)==PROTEGIDO||input.LA(1)==PUBLICO ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "modificadorDeAcessoMasculino"



    // $ANTLR start "modificadorDeAcessoFeminino"
    // fontes/g/CanecaSemantico.g:184:1: modificadorDeAcessoFeminino : ( PUBLICA | PRIVADA | PROTEGIDA );
    public final void modificadorDeAcessoFeminino() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:185:2: ( PUBLICA | PRIVADA | PROTEGIDA )
            // fontes/g/CanecaSemantico.g:
            {
            if ( input.LA(1)==PRIVADA||input.LA(1)==PROTEGIDA||input.LA(1)==PUBLICA ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "modificadorDeAcessoFeminino"



    // $ANTLR start "listaDeParametros"
    // fontes/g/CanecaSemantico.g:190:1: listaDeParametros : ^( PARAMETROS_ ( expressao )* ) ;
    public final void listaDeParametros() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:191:2: ( ^( PARAMETROS_ ( expressao )* ) )
            // fontes/g/CanecaSemantico.g:191:4: ^( PARAMETROS_ ( expressao )* )
            {
            match(input,PARAMETROS_,FOLLOW_PARAMETROS__in_listaDeParametros662); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:191:18: ( expressao )*
                loop16:
                do {
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==ATRIBUIDOR||LA16_0==DIFERENTE||(LA16_0 >= DIVISAO && LA16_0 <= E)||LA16_0==IGUAL||(LA16_0 >= MAIOR && LA16_0 <= MENOR_IGUAL)||(LA16_0 >= MULTIPLICACAO && LA16_0 <= NEGACAO)||LA16_0==OU||LA16_0==RESTO_DA_DIVISAO||(LA16_0 >= SOMA && LA16_0 <= SUBTRACAO)||LA16_0==PRIMARIA_||LA16_0==SUBTRACAO_UNARIA_) ) {
                        alt16=1;
                    }


                    switch (alt16) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:191:19: expressao
                	    {
                	    pushFollow(FOLLOW_expressao_in_listaDeParametros665);
                	    expressao();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop16;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listaDeParametros"



    // $ANTLR start "listaDeArgumentosVazia"
    // fontes/g/CanecaSemantico.g:194:1: listaDeArgumentosVazia : ARGUMENTOS_ ;
    public final void listaDeArgumentosVazia() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:195:2: ( ARGUMENTOS_ )
            // fontes/g/CanecaSemantico.g:195:4: ARGUMENTOS_
            {
            match(input,ARGUMENTOS_,FOLLOW_ARGUMENTOS__in_listaDeArgumentosVazia679); if (state.failed) return ;

            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listaDeArgumentosVazia"



    // $ANTLR start "listaDeArgumentos"
    // fontes/g/CanecaSemantico.g:198:1: listaDeArgumentos : ^( ARGUMENTOS_ ( declaracao )* ) ;
    public final void listaDeArgumentos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:199:2: ( ^( ARGUMENTOS_ ( declaracao )* ) )
            // fontes/g/CanecaSemantico.g:199:4: ^( ARGUMENTOS_ ( declaracao )* )
            {
            match(input,ARGUMENTOS_,FOLLOW_ARGUMENTOS__in_listaDeArgumentos691); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:199:18: ( declaracao )*
                loop17:
                do {
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==DECLARACAO_) ) {
                        alt17=1;
                    }


                    switch (alt17) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:199:19: declaracao
                	    {
                	    pushFollow(FOLLOW_declaracao_in_listaDeArgumentos694);
                	    declaracao();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop17;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listaDeArgumentos"



    // $ANTLR start "listaDeInterfaces"
    // fontes/g/CanecaSemantico.g:202:1: listaDeInterfaces : ^( INTERFACES_ ( tipo )* ) ;
    public final void listaDeInterfaces() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:203:2: ( ^( INTERFACES_ ( tipo )* ) )
            // fontes/g/CanecaSemantico.g:203:4: ^( INTERFACES_ ( tipo )* )
            {
            match(input,INTERFACES_,FOLLOW_INTERFACES__in_listaDeInterfaces709); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:203:18: ( tipo )*
                loop18:
                do {
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==TIPO_) ) {
                        alt18=1;
                    }


                    switch (alt18) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:203:19: tipo
                	    {
                	    pushFollow(FOLLOW_tipo_in_listaDeInterfaces712);
                	    tipo();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop18;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listaDeInterfaces"



    // $ANTLR start "listaDeTiposGenericos"
    // fontes/g/CanecaSemantico.g:206:1: listaDeTiposGenericos : ^( TIPOS_GENERICOS_ ( tipoGenerico )* ) ;
    public final void listaDeTiposGenericos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:207:2: ( ^( TIPOS_GENERICOS_ ( tipoGenerico )* ) )
            // fontes/g/CanecaSemantico.g:207:4: ^( TIPOS_GENERICOS_ ( tipoGenerico )* )
            {
            match(input,TIPOS_GENERICOS_,FOLLOW_TIPOS_GENERICOS__in_listaDeTiposGenericos727); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:207:23: ( tipoGenerico )*
                loop19:
                do {
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==TIPO_GENERICO_) ) {
                        alt19=1;
                    }


                    switch (alt19) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:207:24: tipoGenerico
                	    {
                	    pushFollow(FOLLOW_tipoGenerico_in_listaDeTiposGenericos730);
                	    tipoGenerico();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop19;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listaDeTiposGenericos"



    // $ANTLR start "listaDeTipos"
    // fontes/g/CanecaSemantico.g:210:1: listaDeTipos : ^( TIPOS_ ( tipo )* ) ;
    public final void listaDeTipos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:211:2: ( ^( TIPOS_ ( tipo )* ) )
            // fontes/g/CanecaSemantico.g:211:4: ^( TIPOS_ ( tipo )* )
            {
            match(input,TIPOS_,FOLLOW_TIPOS__in_listaDeTipos745); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:211:13: ( tipo )*
                loop20:
                do {
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==TIPO_) ) {
                        alt20=1;
                    }


                    switch (alt20) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:211:14: tipo
                	    {
                	    pushFollow(FOLLOW_tipo_in_listaDeTipos748);
                	    tipo();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop20;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listaDeTipos"



    // $ANTLR start "listaDeCapturas"
    // fontes/g/CanecaSemantico.g:214:1: listaDeCapturas : ^( CAPTURAS_ ( capture )+ ) ;
    public final void listaDeCapturas() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:215:2: ( ^( CAPTURAS_ ( capture )+ ) )
            // fontes/g/CanecaSemantico.g:215:4: ^( CAPTURAS_ ( capture )+ )
            {
            match(input,CAPTURAS_,FOLLOW_CAPTURAS__in_listaDeCapturas763); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // fontes/g/CanecaSemantico.g:215:16: ( capture )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==CAPTURE_) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // fontes/g/CanecaSemantico.g:215:17: capture
            	    {
            	    pushFollow(FOLLOW_capture_in_listaDeCapturas766);
            	    capture();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listaDeCapturas"



    // $ANTLR start "tipoGenerico"
    // fontes/g/CanecaSemantico.g:218:1: tipoGenerico : ^( TIPO_GENERICO_ IDENTIFICADOR listaDeInterfaces ) ;
    public final void tipoGenerico() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:219:2: ( ^( TIPO_GENERICO_ IDENTIFICADOR listaDeInterfaces ) )
            // fontes/g/CanecaSemantico.g:219:4: ^( TIPO_GENERICO_ IDENTIFICADOR listaDeInterfaces )
            {
            match(input,TIPO_GENERICO_,FOLLOW_TIPO_GENERICO__in_tipoGenerico781); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_tipoGenerico783); if (state.failed) return ;

            pushFollow(FOLLOW_listaDeInterfaces_in_tipoGenerico785);
            listaDeInterfaces();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "tipoGenerico"



    // $ANTLR start "tipo"
    // fontes/g/CanecaSemantico.g:222:1: tipo returns [Tipo tipo] : ^( TIPO_ IDENTIFICADOR listaDeTipos ) ;
    public final Tipo tipo() throws RecognitionException {
        Tipo tipo = null;


        CommonTree IDENTIFICADOR6=null;

        try {
            // fontes/g/CanecaSemantico.g:223:2: ( ^( TIPO_ IDENTIFICADOR listaDeTipos ) )
            // fontes/g/CanecaSemantico.g:223:4: ^( TIPO_ IDENTIFICADOR listaDeTipos )
            {
            match(input,TIPO_,FOLLOW_TIPO__in_tipo802); if (state.failed) return tipo;

            match(input, Token.DOWN, null); if (state.failed) return tipo;
            IDENTIFICADOR6=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_tipo804); if (state.failed) return tipo;

            pushFollow(FOLLOW_listaDeTipos_in_tipo806);
            listaDeTipos();

            state._fsp--;
            if (state.failed) return tipo;

            match(input, Token.UP, null); if (state.failed) return tipo;


            if ( state.backtracking==1 ) {
            			tipo = new Tipo((IDENTIFICADOR6!=null?IDENTIFICADOR6.getText():null));
            		}

            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return tipo;
    }
    // $ANTLR end "tipo"



    // $ANTLR start "declaracao"
    // fontes/g/CanecaSemantico.g:229:1: declaracao : ^( DECLARACAO_ tipo IDENTIFICADOR ) ;
    public final void declaracao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:230:2: ( ^( DECLARACAO_ tipo IDENTIFICADOR ) )
            // fontes/g/CanecaSemantico.g:230:4: ^( DECLARACAO_ tipo IDENTIFICADOR )
            {
            match(input,DECLARACAO_,FOLLOW_DECLARACAO__in_declaracao823); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tipo_in_declaracao825);
            tipo();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_declaracao827); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declaracao"



    // $ANTLR start "atribuicao"
    // fontes/g/CanecaSemantico.g:233:1: atribuicao : ^( ATRIBUICAO_ expressaoOuLogico ) ;
    public final void atribuicao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:234:2: ( ^( ATRIBUICAO_ expressaoOuLogico ) )
            // fontes/g/CanecaSemantico.g:234:4: ^( ATRIBUICAO_ expressaoOuLogico )
            {
            match(input,ATRIBUICAO_,FOLLOW_ATRIBUICAO__in_atribuicao840); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expressaoOuLogico_in_atribuicao842);
            expressaoOuLogico();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "atribuicao"



    // $ANTLR start "declaracaoComAtribuicaoOpcional"
    // fontes/g/CanecaSemantico.g:237:1: declaracaoComAtribuicaoOpcional : ^( DECLARACAO_COM_ATRIBUICAO_OPICIONAL_ declaracao ( atribuicao )? ) ;
    public final void declaracaoComAtribuicaoOpcional() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:238:2: ( ^( DECLARACAO_COM_ATRIBUICAO_OPICIONAL_ declaracao ( atribuicao )? ) )
            // fontes/g/CanecaSemantico.g:238:4: ^( DECLARACAO_COM_ATRIBUICAO_OPICIONAL_ declaracao ( atribuicao )? )
            {
            match(input,DECLARACAO_COM_ATRIBUICAO_OPICIONAL_,FOLLOW_DECLARACAO_COM_ATRIBUICAO_OPICIONAL__in_declaracaoComAtribuicaoOpcional855); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_declaracao_in_declaracaoComAtribuicaoOpcional857);
            declaracao();

            state._fsp--;
            if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:238:54: ( atribuicao )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ATRIBUICAO_) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:238:55: atribuicao
                    {
                    pushFollow(FOLLOW_atribuicao_in_declaracaoComAtribuicaoOpcional860);
                    atribuicao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declaracaoComAtribuicaoOpcional"



    // $ANTLR start "expressao"
    // fontes/g/CanecaSemantico.g:241:1: expressao : ( ^( ATRIBUIDOR expressaoOuLogico expressaoOuLogico ) | expressaoOuLogico );
    public final void expressao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:242:2: ( ^( ATRIBUIDOR expressaoOuLogico expressaoOuLogico ) | expressaoOuLogico )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ATRIBUIDOR) ) {
                alt23=1;
            }
            else if ( (LA23_0==DIFERENTE||(LA23_0 >= DIVISAO && LA23_0 <= E)||LA23_0==IGUAL||(LA23_0 >= MAIOR && LA23_0 <= MENOR_IGUAL)||(LA23_0 >= MULTIPLICACAO && LA23_0 <= NEGACAO)||LA23_0==OU||LA23_0==RESTO_DA_DIVISAO||(LA23_0 >= SOMA && LA23_0 <= SUBTRACAO)||LA23_0==PRIMARIA_||LA23_0==SUBTRACAO_UNARIA_) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:242:4: ^( ATRIBUIDOR expressaoOuLogico expressaoOuLogico )
                    {
                    match(input,ATRIBUIDOR,FOLLOW_ATRIBUIDOR_in_expressao875); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expressaoOuLogico_in_expressao877);
                    expressaoOuLogico();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expressaoOuLogico_in_expressao879);
                    expressaoOuLogico();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:243:4: expressaoOuLogico
                    {
                    pushFollow(FOLLOW_expressaoOuLogico_in_expressao885);
                    expressaoOuLogico();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expressao"



    // $ANTLR start "expressaoOuLogico"
    // fontes/g/CanecaSemantico.g:246:1: expressaoOuLogico : ( ^( OU expressaoELogico expressaoELogico ) | expressaoELogico );
    public final void expressaoOuLogico() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:247:2: ( ^( OU expressaoELogico expressaoELogico ) | expressaoELogico )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==OU) ) {
                alt24=1;
            }
            else if ( (LA24_0==DIFERENTE||(LA24_0 >= DIVISAO && LA24_0 <= E)||LA24_0==IGUAL||(LA24_0 >= MAIOR && LA24_0 <= MENOR_IGUAL)||(LA24_0 >= MULTIPLICACAO && LA24_0 <= NEGACAO)||LA24_0==RESTO_DA_DIVISAO||(LA24_0 >= SOMA && LA24_0 <= SUBTRACAO)||LA24_0==PRIMARIA_||LA24_0==SUBTRACAO_UNARIA_) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:247:4: ^( OU expressaoELogico expressaoELogico )
                    {
                    match(input,OU,FOLLOW_OU_in_expressaoOuLogico897); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expressaoELogico_in_expressaoOuLogico899);
                    expressaoELogico();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expressaoELogico_in_expressaoOuLogico901);
                    expressaoELogico();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:248:4: expressaoELogico
                    {
                    pushFollow(FOLLOW_expressaoELogico_in_expressaoOuLogico907);
                    expressaoELogico();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expressaoOuLogico"



    // $ANTLR start "expressaoELogico"
    // fontes/g/CanecaSemantico.g:251:1: expressaoELogico : ( ^( E expressaoComparacaoLogica expressaoComparacaoLogica ) | expressaoComparacaoLogica );
    public final void expressaoELogico() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:252:2: ( ^( E expressaoComparacaoLogica expressaoComparacaoLogica ) | expressaoComparacaoLogica )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==E) ) {
                alt25=1;
            }
            else if ( (LA25_0==DIFERENTE||LA25_0==DIVISAO||LA25_0==IGUAL||(LA25_0 >= MAIOR && LA25_0 <= MENOR_IGUAL)||(LA25_0 >= MULTIPLICACAO && LA25_0 <= NEGACAO)||LA25_0==RESTO_DA_DIVISAO||(LA25_0 >= SOMA && LA25_0 <= SUBTRACAO)||LA25_0==PRIMARIA_||LA25_0==SUBTRACAO_UNARIA_) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:252:4: ^( E expressaoComparacaoLogica expressaoComparacaoLogica )
                    {
                    match(input,E,FOLLOW_E_in_expressaoELogico919); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expressaoComparacaoLogica_in_expressaoELogico921);
                    expressaoComparacaoLogica();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expressaoComparacaoLogica_in_expressaoELogico923);
                    expressaoComparacaoLogica();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:253:4: expressaoComparacaoLogica
                    {
                    pushFollow(FOLLOW_expressaoComparacaoLogica_in_expressaoELogico929);
                    expressaoComparacaoLogica();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expressaoELogico"



    // $ANTLR start "expressaoComparacaoLogica"
    // fontes/g/CanecaSemantico.g:256:1: expressaoComparacaoLogica : ( ^( ( IGUAL | DIFERENTE | MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) expressaoAditiva expressaoAditiva ) | expressaoAditiva );
    public final void expressaoComparacaoLogica() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:257:2: ( ^( ( IGUAL | DIFERENTE | MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) expressaoAditiva expressaoAditiva ) | expressaoAditiva )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==DIFERENTE||LA26_0==IGUAL||(LA26_0 >= MAIOR && LA26_0 <= MENOR_IGUAL)) ) {
                alt26=1;
            }
            else if ( (LA26_0==DIVISAO||(LA26_0 >= MULTIPLICACAO && LA26_0 <= NEGACAO)||LA26_0==RESTO_DA_DIVISAO||(LA26_0 >= SOMA && LA26_0 <= SUBTRACAO)||LA26_0==PRIMARIA_||LA26_0==SUBTRACAO_UNARIA_) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:257:4: ^( ( IGUAL | DIFERENTE | MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) expressaoAditiva expressaoAditiva )
                    {
                    if ( input.LA(1)==DIFERENTE||input.LA(1)==IGUAL||(input.LA(1) >= MAIOR && input.LA(1) <= MENOR_IGUAL) ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica965);
                    expressaoAditiva();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica967);
                    expressaoAditiva();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:258:4: expressaoAditiva
                    {
                    pushFollow(FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica973);
                    expressaoAditiva();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expressaoComparacaoLogica"



    // $ANTLR start "expressaoAditiva"
    // fontes/g/CanecaSemantico.g:261:1: expressaoAditiva : ( ^( ( SOMA | SUBTRACAO ) expressaoMultiplicativa expressaoMultiplicativa ) | expressaoMultiplicativa );
    public final void expressaoAditiva() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:262:2: ( ^( ( SOMA | SUBTRACAO ) expressaoMultiplicativa expressaoMultiplicativa ) | expressaoMultiplicativa )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0 >= SOMA && LA27_0 <= SUBTRACAO)) ) {
                alt27=1;
            }
            else if ( (LA27_0==DIVISAO||(LA27_0 >= MULTIPLICACAO && LA27_0 <= NEGACAO)||LA27_0==RESTO_DA_DIVISAO||LA27_0==PRIMARIA_||LA27_0==SUBTRACAO_UNARIA_) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:262:4: ^( ( SOMA | SUBTRACAO ) expressaoMultiplicativa expressaoMultiplicativa )
                    {
                    if ( (input.LA(1) >= SOMA && input.LA(1) <= SUBTRACAO) ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expressaoMultiplicativa_in_expressaoAditiva993);
                    expressaoMultiplicativa();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expressaoMultiplicativa_in_expressaoAditiva995);
                    expressaoMultiplicativa();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:263:4: expressaoMultiplicativa
                    {
                    pushFollow(FOLLOW_expressaoMultiplicativa_in_expressaoAditiva1001);
                    expressaoMultiplicativa();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expressaoAditiva"



    // $ANTLR start "expressaoMultiplicativa"
    // fontes/g/CanecaSemantico.g:266:1: expressaoMultiplicativa : ( ^( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) expressaoUnaria expressaoUnaria ) | expressaoUnaria );
    public final void expressaoMultiplicativa() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:267:2: ( ^( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) expressaoUnaria expressaoUnaria ) | expressaoUnaria )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==DIVISAO||LA28_0==MULTIPLICACAO||LA28_0==RESTO_DA_DIVISAO) ) {
                alt28=1;
            }
            else if ( (LA28_0==NEGACAO||LA28_0==PRIMARIA_||LA28_0==SUBTRACAO_UNARIA_) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:267:4: ^( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) expressaoUnaria expressaoUnaria )
                    {
                    if ( input.LA(1)==DIVISAO||input.LA(1)==MULTIPLICACAO||input.LA(1)==RESTO_DA_DIVISAO ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expressaoUnaria_in_expressaoMultiplicativa1025);
                    expressaoUnaria();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expressaoUnaria_in_expressaoMultiplicativa1027);
                    expressaoUnaria();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:268:4: expressaoUnaria
                    {
                    pushFollow(FOLLOW_expressaoUnaria_in_expressaoMultiplicativa1033);
                    expressaoUnaria();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expressaoMultiplicativa"



    // $ANTLR start "expressaoUnaria"
    // fontes/g/CanecaSemantico.g:271:1: expressaoUnaria : ( ^( PRIMARIA_ expressaoPrimaria ) | ^( SUBTRACAO_UNARIA_ expressaoPrimaria ) | ^( NEGACAO expressaoPrimaria ) );
    public final void expressaoUnaria() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:272:2: ( ^( PRIMARIA_ expressaoPrimaria ) | ^( SUBTRACAO_UNARIA_ expressaoPrimaria ) | ^( NEGACAO expressaoPrimaria ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case PRIMARIA_:
                {
                alt29=1;
                }
                break;
            case SUBTRACAO_UNARIA_:
                {
                alt29=2;
                }
                break;
            case NEGACAO:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:272:4: ^( PRIMARIA_ expressaoPrimaria )
                    {
                    match(input,PRIMARIA_,FOLLOW_PRIMARIA__in_expressaoUnaria1045); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expressaoPrimaria_in_expressaoUnaria1047);
                    expressaoPrimaria();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:273:4: ^( SUBTRACAO_UNARIA_ expressaoPrimaria )
                    {
                    match(input,SUBTRACAO_UNARIA_,FOLLOW_SUBTRACAO_UNARIA__in_expressaoUnaria1054); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expressaoPrimaria_in_expressaoUnaria1056);
                    expressaoPrimaria();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemantico.g:274:4: ^( NEGACAO expressaoPrimaria )
                    {
                    match(input,NEGACAO,FOLLOW_NEGACAO_in_expressaoUnaria1063); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expressaoPrimaria_in_expressaoUnaria1065);
                    expressaoPrimaria();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }
        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expressaoUnaria"



    // $ANTLR start "expressaoPrimaria"
    // fontes/g/CanecaSemantico.g:277:1: expressaoPrimaria : ( expressao | VALOR_BOOLEANO | VALOR_NULO | CONSTANTE_INTEIRA | CONSTANTE_REAL | LITERAL_CARACTERE | LITERAL_TEXTO | comando );
    public final void expressaoPrimaria() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:278:2: ( expressao | VALOR_BOOLEANO | VALOR_NULO | CONSTANTE_INTEIRA | CONSTANTE_REAL | LITERAL_CARACTERE | LITERAL_TEXTO | comando )
            int alt30=8;
            switch ( input.LA(1) ) {
            case ATRIBUIDOR:
            case DIFERENTE:
            case DIVISAO:
            case E:
            case IGUAL:
            case MAIOR:
            case MAIOR_IGUAL:
            case MENOR:
            case MENOR_IGUAL:
            case MULTIPLICACAO:
            case NEGACAO:
            case OU:
            case RESTO_DA_DIVISAO:
            case SOMA:
            case SUBTRACAO:
            case PRIMARIA_:
            case SUBTRACAO_UNARIA_:
                {
                alt30=1;
                }
                break;
            case VALOR_BOOLEANO:
                {
                alt30=2;
                }
                break;
            case VALOR_NULO:
                {
                alt30=3;
                }
                break;
            case CONSTANTE_INTEIRA:
                {
                alt30=4;
                }
                break;
            case CONSTANTE_REAL:
                {
                alt30=5;
                }
                break;
            case LITERAL_CARACTERE:
                {
                alt30=6;
                }
                break;
            case LITERAL_TEXTO:
                {
                alt30=7;
                }
                break;
            case COMANDO_:
                {
                alt30=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:278:4: expressao
                    {
                    pushFollow(FOLLOW_expressao_in_expressaoPrimaria1077);
                    expressao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:279:4: VALOR_BOOLEANO
                    {
                    match(input,VALOR_BOOLEANO,FOLLOW_VALOR_BOOLEANO_in_expressaoPrimaria1082); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemantico.g:280:4: VALOR_NULO
                    {
                    match(input,VALOR_NULO,FOLLOW_VALOR_NULO_in_expressaoPrimaria1087); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSemantico.g:281:4: CONSTANTE_INTEIRA
                    {
                    match(input,CONSTANTE_INTEIRA,FOLLOW_CONSTANTE_INTEIRA_in_expressaoPrimaria1092); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSemantico.g:282:4: CONSTANTE_REAL
                    {
                    match(input,CONSTANTE_REAL,FOLLOW_CONSTANTE_REAL_in_expressaoPrimaria1097); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // fontes/g/CanecaSemantico.g:283:4: LITERAL_CARACTERE
                    {
                    match(input,LITERAL_CARACTERE,FOLLOW_LITERAL_CARACTERE_in_expressaoPrimaria1102); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // fontes/g/CanecaSemantico.g:284:4: LITERAL_TEXTO
                    {
                    match(input,LITERAL_TEXTO,FOLLOW_LITERAL_TEXTO_in_expressaoPrimaria1107); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // fontes/g/CanecaSemantico.g:285:4: comando
                    {
                    pushFollow(FOLLOW_comando_in_expressaoPrimaria1112);
                    comando();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expressaoPrimaria"



    // $ANTLR start "comando"
    // fontes/g/CanecaSemantico.g:288:1: comando : ^( COMANDO_ referencia ( chamada )* ) ;
    public final void comando() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:289:2: ( ^( COMANDO_ referencia ( chamada )* ) )
            // fontes/g/CanecaSemantico.g:289:4: ^( COMANDO_ referencia ( chamada )* )
            {
            match(input,COMANDO_,FOLLOW_COMANDO__in_comando1124); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_referencia_in_comando1126);
            referencia();

            state._fsp--;
            if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:289:26: ( chamada )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0 >= CHAMADA_DE_CLASSE && LA31_0 <= CHAMADA_DE_OBJETO)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // fontes/g/CanecaSemantico.g:289:27: chamada
            	    {
            	    pushFollow(FOLLOW_chamada_in_comando1129);
            	    chamada();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "comando"



    // $ANTLR start "referencia"
    // fontes/g/CanecaSemantico.g:292:1: referencia : ( ^( REFERENCIA_ ESSE ) | ^( REFERENCIA_ ESSA ) | ^( REFERENCIA_ instanciacao ) | ^( REFERENCIA_ IDENTIFICADOR ( listaDeParametros )? ) );
    public final void referencia() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:293:2: ( ^( REFERENCIA_ ESSE ) | ^( REFERENCIA_ ESSA ) | ^( REFERENCIA_ instanciacao ) | ^( REFERENCIA_ IDENTIFICADOR ( listaDeParametros )? ) )
            int alt33=4;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==REFERENCIA_) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case ESSE:
                        {
                        alt33=1;
                        }
                        break;
                    case ESSA:
                        {
                        alt33=2;
                        }
                        break;
                    case IDENTIFICADOR:
                        {
                        alt33=4;
                        }
                        break;
                    case INSTANCIACAO_:
                        {
                        alt33=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 2, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:293:4: ^( REFERENCIA_ ESSE )
                    {
                    match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_referencia1144); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,ESSE,FOLLOW_ESSE_in_referencia1146); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:294:4: ^( REFERENCIA_ ESSA )
                    {
                    match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_referencia1153); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,ESSA,FOLLOW_ESSA_in_referencia1155); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemantico.g:295:4: ^( REFERENCIA_ instanciacao )
                    {
                    match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_referencia1162); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_instanciacao_in_referencia1164);
                    instanciacao();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSemantico.g:296:4: ^( REFERENCIA_ IDENTIFICADOR ( listaDeParametros )? )
                    {
                    match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_referencia1171); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_referencia1173); if (state.failed) return ;

                    // fontes/g/CanecaSemantico.g:296:32: ( listaDeParametros )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==PARAMETROS_) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // fontes/g/CanecaSemantico.g:296:33: listaDeParametros
                            {
                            pushFollow(FOLLOW_listaDeParametros_in_referencia1176);
                            listaDeParametros();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }
        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "referencia"



    // $ANTLR start "chamada"
    // fontes/g/CanecaSemantico.g:299:1: chamada : ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( listaDeParametros )? ) ;
    public final void chamada() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:300:2: ( ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( listaDeParametros )? ) )
            // fontes/g/CanecaSemantico.g:300:4: ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( listaDeParametros )? )
            {
            if ( (input.LA(1) >= CHAMADA_DE_CLASSE && input.LA(1) <= CHAMADA_DE_OBJETO) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_chamada1199); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:300:60: ( listaDeParametros )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==PARAMETROS_) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:300:61: listaDeParametros
                    {
                    pushFollow(FOLLOW_listaDeParametros_in_chamada1202);
                    listaDeParametros();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "chamada"



    // $ANTLR start "instanciacao"
    // fontes/g/CanecaSemantico.g:303:1: instanciacao : ^( INSTANCIACAO_ tipo listaDeParametros ) ;
    public final void instanciacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:304:2: ( ^( INSTANCIACAO_ tipo listaDeParametros ) )
            // fontes/g/CanecaSemantico.g:304:4: ^( INSTANCIACAO_ tipo listaDeParametros )
            {
            match(input,INSTANCIACAO_,FOLLOW_INSTANCIACAO__in_instanciacao1217); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tipo_in_instanciacao1219);
            tipo();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_listaDeParametros_in_instanciacao1221);
            listaDeParametros();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "instanciacao"



    // $ANTLR start "destruicao"
    // fontes/g/CanecaSemantico.g:307:1: destruicao : ^( DESTRUICAO_ expressao ) ;
    public final void destruicao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:308:2: ( ^( DESTRUICAO_ expressao ) )
            // fontes/g/CanecaSemantico.g:308:4: ^( DESTRUICAO_ expressao )
            {
            match(input,DESTRUICAO_,FOLLOW_DESTRUICAO__in_destruicao1234); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expressao_in_destruicao1236);
            expressao();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "destruicao"



    // $ANTLR start "retorno"
    // fontes/g/CanecaSemantico.g:311:1: retorno : ^( RETORNO_ expressao ) ;
    public final void retorno() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:312:2: ( ^( RETORNO_ expressao ) )
            // fontes/g/CanecaSemantico.g:312:4: ^( RETORNO_ expressao )
            {
            match(input,RETORNO_,FOLLOW_RETORNO__in_retorno1250); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expressao_in_retorno1252);
            expressao();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "retorno"



    // $ANTLR start "se"
    // fontes/g/CanecaSemantico.g:315:1: se : ^( SE_ expressao blocoDeInstrucoes ( blocoDeInstrucoes )? ) ;
    public final void se() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:316:2: ( ^( SE_ expressao blocoDeInstrucoes ( blocoDeInstrucoes )? ) )
            // fontes/g/CanecaSemantico.g:316:4: ^( SE_ expressao blocoDeInstrucoes ( blocoDeInstrucoes )? )
            {
            match(input,SE_,FOLLOW_SE__in_se1265); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expressao_in_se1267);
            expressao();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_blocoDeInstrucoes_in_se1269);
            blocoDeInstrucoes();

            state._fsp--;
            if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:316:38: ( blocoDeInstrucoes )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==INSTRUCOES_) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:316:38: blocoDeInstrucoes
                    {
                    pushFollow(FOLLOW_blocoDeInstrucoes_in_se1271);
                    blocoDeInstrucoes();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "se"



    // $ANTLR start "para"
    // fontes/g/CanecaSemantico.g:319:1: para : ^( PARA_ expressao expressao expressao ) ;
    public final void para() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:320:2: ( ^( PARA_ expressao expressao expressao ) )
            // fontes/g/CanecaSemantico.g:320:4: ^( PARA_ expressao expressao expressao )
            {
            match(input,PARA_,FOLLOW_PARA__in_para1285); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expressao_in_para1287);
            expressao();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_expressao_in_para1289);
            expressao();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_expressao_in_para1291);
            expressao();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "para"



    // $ANTLR start "repita"
    // fontes/g/CanecaSemantico.g:323:1: repita : ^( REPITA_ declaracao expressao blocoDeInstrucoes ) ;
    public final void repita() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:324:2: ( ^( REPITA_ declaracao expressao blocoDeInstrucoes ) )
            // fontes/g/CanecaSemantico.g:324:4: ^( REPITA_ declaracao expressao blocoDeInstrucoes )
            {
            match(input,REPITA_,FOLLOW_REPITA__in_repita1304); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_declaracao_in_repita1306);
            declaracao();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_expressao_in_repita1308);
            expressao();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_blocoDeInstrucoes_in_repita1310);
            blocoDeInstrucoes();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "repita"



    // $ANTLR start "enquanto"
    // fontes/g/CanecaSemantico.g:327:1: enquanto : ^( ENQUANTO_ expressao blocoDeInstrucoes ) ;
    public final void enquanto() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:328:2: ( ^( ENQUANTO_ expressao blocoDeInstrucoes ) )
            // fontes/g/CanecaSemantico.g:328:4: ^( ENQUANTO_ expressao blocoDeInstrucoes )
            {
            match(input,ENQUANTO_,FOLLOW_ENQUANTO__in_enquanto1323); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expressao_in_enquanto1325);
            expressao();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_blocoDeInstrucoes_in_enquanto1327);
            blocoDeInstrucoes();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "enquanto"



    // $ANTLR start "tente"
    // fontes/g/CanecaSemantico.g:331:1: tente : ^( TENTE_ blocoDeInstrucoes listaDeCapturas ) ;
    public final void tente() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:332:2: ( ^( TENTE_ blocoDeInstrucoes listaDeCapturas ) )
            // fontes/g/CanecaSemantico.g:332:4: ^( TENTE_ blocoDeInstrucoes listaDeCapturas )
            {
            match(input,TENTE_,FOLLOW_TENTE__in_tente1340); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_blocoDeInstrucoes_in_tente1342);
            blocoDeInstrucoes();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_listaDeCapturas_in_tente1344);
            listaDeCapturas();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "tente"



    // $ANTLR start "capture"
    // fontes/g/CanecaSemantico.g:335:1: capture : ^( CAPTURE_ declaracao blocoDeInstrucoes ) ;
    public final void capture() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:336:2: ( ^( CAPTURE_ declaracao blocoDeInstrucoes ) )
            // fontes/g/CanecaSemantico.g:336:4: ^( CAPTURE_ declaracao blocoDeInstrucoes )
            {
            match(input,CAPTURE_,FOLLOW_CAPTURE__in_capture1357); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_declaracao_in_capture1359);
            declaracao();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_blocoDeInstrucoes_in_capture1361);
            blocoDeInstrucoes();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "capture"



    // $ANTLR start "lance"
    // fontes/g/CanecaSemantico.g:339:1: lance : ^( LANCE_ expressao ) ;
    public final void lance() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:340:2: ( ^( LANCE_ expressao ) )
            // fontes/g/CanecaSemantico.g:340:4: ^( LANCE_ expressao )
            {
            match(input,LANCE_,FOLLOW_LANCE__in_lance1374); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expressao_in_lance1376);
            expressao();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "lance"



    // $ANTLR start "blocoDeInstrucoes"
    // fontes/g/CanecaSemantico.g:343:1: blocoDeInstrucoes : ^( INSTRUCOES_ ( . )* ) ;
    public final void blocoDeInstrucoes() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:344:2: ( ^( INSTRUCOES_ ( . )* ) )
            // fontes/g/CanecaSemantico.g:344:4: ^( INSTRUCOES_ ( . )* )
            {
            match(input,INSTRUCOES_,FOLLOW_INSTRUCOES__in_blocoDeInstrucoes1389); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:344:18: ( . )*
                loop36:
                do {
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( ((LA36_0 >= ATRIBUIDOR && LA36_0 <= UNIDADE_)) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==UP) ) {
                        alt36=2;
                    }


                    switch (alt36) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:344:19: .
                	    {
                	    matchAny(input); if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop36;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "blocoDeInstrucoes"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\27\uffff";
    static final String DFA4_eofS =
        "\27\uffff";
    static final String DFA4_minS =
        "\1\u0081\1\2\1\127\1\2\1\161\1\2\1\43\1\3\1\151\1\2\1\3\1\2\1\3"+
        "\1\42\1\134\1\43\1\3\2\uffff\4\3";
    static final String DFA4_maxS =
        "\1\u0081\1\2\1\127\1\2\1\161\1\2\1\43\1\3\1\151\1\2\1\150\1\2\1"+
        "\3\1\43\1\155\1\43\1\3\2\uffff\1\42\1\150\1\3\1\150";
    static final String DFA4_acceptS =
        "\21\uffff\1\1\1\2\4\uffff";
    static final String DFA4_specialS =
        "\27\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\14\144\uffff\1\13",
            "\1\15",
            "\1\16",
            "\1\17\1\20",
            "\1\21\20\uffff\1\22",
            "\1\23",
            "\1\24",
            "",
            "",
            "\1\26\36\uffff\1\25",
            "\1\14\144\uffff\1\13",
            "\1\26",
            "\1\14\144\uffff\1\13"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "61:1: unicadeDeCompilacao : ( ^( UNIDADE_ cabecalho classe ) | ^( UNIDADE_ cabecalho interfaces ) );";
        }
    }
 

    public static final BitSet FOLLOW_classe_in_topdown60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atributo_in_topdown65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_construtor_in_topdown70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destrutor_in_topdown75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminaClasse_in_bottomup86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarConstrutor_in_bottomup91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarDestrutor_in_bottomup96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROGRAMA__in_programa108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_unicadeDeCompilacao_in_programa111 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_UNIDADE__in_unicadeDeCompilacao126 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_cabecalho_in_unicadeDeCompilacao128 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_classe_in_unicadeDeCompilacao130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNIDADE__in_unicadeDeCompilacao137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_cabecalho_in_unicadeDeCompilacao139 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_interfaces_in_unicadeDeCompilacao141 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CABECALHO__in_cabecalho154 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pacote_in_cabecalho156 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_importacoes_in_cabecalho158 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PACOTE__in_pacote171 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_DE_PACOTE_in_pacote173 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORTACOES__in_importacoes186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_importacao_in_importacoes189 = new BitSet(new long[]{0x0000000000000008L,0x0000010000000000L});
    public static final BitSet FOLLOW_IMPORTACAO__in_importacao204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_importacao206 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao208 = new BitSet(new long[]{0x0000000400000008L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_importacao211 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORTACAO__in_importacao220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao222 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASSE__in_classe235 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoFeminino_in_classe237 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_classe239 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_listaDeTiposGenericos_in_classe241 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_classe243 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_CLASSE__in_terminaClasse262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoFeminino_in_terminaClasse264 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_terminaClasse266 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_listaDeTiposGenericos_in_terminaClasse268 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_terminaClasse270 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_INTERFACE__in_interfaces289 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoFeminino_in_interfaces291 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_interfaces293 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_listaDeTiposGenericos_in_interfaces295 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_interfaces297 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_corpoDaInterface_in_interfaces299 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CORPO__in_corpoDaClasse312 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atributos_in_corpoDaClasse314 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_construtores_in_corpoDaClasse316 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_destrutor_in_corpoDaClasse318 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_metodos_in_corpoDaClasse320 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CORPO__in_corpoDaInterface333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atributos_in_corpoDaInterface335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_assinaturasDeMetodos_in_corpoDaInterface337 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATRIBUTOS__in_atributos350 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atributo_in_atributos353 = new BitSet(new long[]{0x0000000000000008L,0x0000000000400000L});
    public static final BitSet FOLLOW_CONSTRUTORES__in_construtores368 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_construtor_in_construtores371 = new BitSet(new long[]{0x0000000000000008L,0x0000000080000000L});
    public static final BitSet FOLLOW_METODOS__in_metodos386 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_metodo_in_metodos389 = new BitSet(new long[]{0x0000000000000008L,0x0001000000000000L});
    public static final BitSet FOLLOW_ASSINATURAS_DE_METODOS__in_assinaturasDeMetodos404 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_assinaturasDeMetodos408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_assinaturasDeMetodos410 = new BitSet(new long[]{0x0000000100000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_ESTATICO_in_assinaturasDeMetodos413 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_tipo_in_assinaturasDeMetodos417 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_assinaturasDeMetodos419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_listaDeArgumentos_in_assinaturasDeMetodos421 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATRIBUTO__in_atributo437 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_atributo439 = new BitSet(new long[]{0x0000000100000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_ESTATICO_in_atributo442 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_tipo_in_atributo446 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_atributo448 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_CONSTRUTOR__in_construtor470 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_construtor474 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_construtor476 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_construtor478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_listaDeArgumentos_in_construtor480 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUTOR__in_terminarConstrutor500 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_terminarConstrutor504 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_terminarConstrutor506 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_terminarConstrutor508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_listaDeArgumentos_in_terminarConstrutor510 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DESTRUTOR__in_destrutor530 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_destrutor533 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_destrutor535 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_destrutor537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_listaDeArgumentosVazia_in_destrutor539 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DESTRUTOR__in_terminarDestrutor559 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_terminarDestrutor562 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_terminarDestrutor564 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_terminarDestrutor566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_listaDeArgumentosVazia_in_terminarDestrutor568 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METODO__in_metodo588 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_metodo591 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_metodo593 = new BitSet(new long[]{0x0000000100000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_ESTATICO_in_metodo596 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_tipo_in_metodo600 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_metodo602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_listaDeArgumentos_in_metodo604 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMETROS__in_listaDeParametros662 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressao_in_listaDeParametros665 = new BitSet(new long[]{0x004DE0100D000018L,0x0810000000000308L});
    public static final BitSet FOLLOW_ARGUMENTOS__in_listaDeArgumentosVazia679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGUMENTOS__in_listaDeArgumentos691 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaracao_in_listaDeArgumentos694 = new BitSet(new long[]{0x0000000000000008L,0x0000000200000000L});
    public static final BitSet FOLLOW_INTERFACES__in_listaDeInterfaces709 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_listaDeInterfaces712 = new BitSet(new long[]{0x0000000000000008L,0x8000000000000000L});
    public static final BitSet FOLLOW_TIPOS_GENERICOS__in_listaDeTiposGenericos727 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipoGenerico_in_listaDeTiposGenericos730 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_TIPOS__in_listaDeTipos745 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_listaDeTipos748 = new BitSet(new long[]{0x0000000000000008L,0x8000000000000000L});
    public static final BitSet FOLLOW_CAPTURAS__in_listaDeCapturas763 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_capture_in_listaDeCapturas766 = new BitSet(new long[]{0x0000000000000008L,0x0000000002000000L});
    public static final BitSet FOLLOW_TIPO_GENERICO__in_tipoGenerico781 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_tipoGenerico783 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_tipoGenerico785 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIPO__in_tipo802 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_tipo804 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_listaDeTipos_in_tipo806 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARACAO__in_declaracao823 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_declaracao825 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_declaracao827 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATRIBUICAO__in_atribuicao840 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoOuLogico_in_atribuicao842 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARACAO_COM_ATRIBUICAO_OPICIONAL__in_declaracaoComAtribuicaoOpcional855 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaracao_in_declaracaoComAtribuicaoOpcional857 = new BitSet(new long[]{0x0000000000000008L,0x0000000000100000L});
    public static final BitSet FOLLOW_atribuicao_in_declaracaoComAtribuicaoOpcional860 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATRIBUIDOR_in_expressao875 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoOuLogico_in_expressao877 = new BitSet(new long[]{0x004DE0100D000000L,0x0810000000000308L});
    public static final BitSet FOLLOW_expressaoOuLogico_in_expressao879 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expressaoOuLogico_in_expressao885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OU_in_expressaoOuLogico897 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoELogico_in_expressaoOuLogico899 = new BitSet(new long[]{0x000DE0100D000000L,0x0810000000000308L});
    public static final BitSet FOLLOW_expressaoELogico_in_expressaoOuLogico901 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expressaoELogico_in_expressaoOuLogico907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_E_in_expressaoELogico919 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoComparacaoLogica_in_expressaoELogico921 = new BitSet(new long[]{0x000DE01005000000L,0x0810000000000308L});
    public static final BitSet FOLLOW_expressaoComparacaoLogica_in_expressaoELogico923 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expressaoComparacaoLogica_in_expressaoELogico929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expressaoComparacaoLogica941 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica965 = new BitSet(new long[]{0x000C000004000000L,0x0810000000000308L});
    public static final BitSet FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica967 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expressaoAditiva985 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoMultiplicativa_in_expressaoAditiva993 = new BitSet(new long[]{0x000C000004000000L,0x0810000000000008L});
    public static final BitSet FOLLOW_expressaoMultiplicativa_in_expressaoAditiva995 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expressaoMultiplicativa_in_expressaoAditiva1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expressaoMultiplicativa1013 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoUnaria_in_expressaoMultiplicativa1025 = new BitSet(new long[]{0x0008000000000000L,0x0810000000000000L});
    public static final BitSet FOLLOW_expressaoUnaria_in_expressaoMultiplicativa1027 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expressaoUnaria_in_expressaoMultiplicativa1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARIA__in_expressaoUnaria1045 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoPrimaria_in_expressaoUnaria1047 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBTRACAO_UNARIA__in_expressaoUnaria1054 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoPrimaria_in_expressaoUnaria1056 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGACAO_in_expressaoUnaria1063 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoPrimaria_in_expressaoUnaria1065 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expressao_in_expressaoPrimaria1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALOR_BOOLEANO_in_expressaoPrimaria1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALOR_NULO_in_expressaoPrimaria1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTE_INTEIRA_in_expressaoPrimaria1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTE_REAL_in_expressaoPrimaria1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_CARACTERE_in_expressaoPrimaria1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_TEXTO_in_expressaoPrimaria1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comando_in_expressaoPrimaria1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMANDO__in_comando1124 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_referencia_in_comando1126 = new BitSet(new long[]{0x0000000000000C08L});
    public static final BitSet FOLLOW_chamada_in_comando1129 = new BitSet(new long[]{0x0000000000000C08L});
    public static final BitSet FOLLOW_REFERENCIA__in_referencia1144 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ESSE_in_referencia1146 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REFERENCIA__in_referencia1153 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ESSA_in_referencia1155 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REFERENCIA__in_referencia1162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instanciacao_in_referencia1164 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REFERENCIA__in_referencia1171 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_referencia1173 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L});
    public static final BitSet FOLLOW_listaDeParametros_in_referencia1176 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_chamada1191 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_chamada1199 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L});
    public static final BitSet FOLLOW_listaDeParametros_in_chamada1202 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCIACAO__in_instanciacao1217 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_instanciacao1219 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_listaDeParametros_in_instanciacao1221 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DESTRUICAO__in_destruicao1234 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressao_in_destruicao1236 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETORNO__in_retorno1250 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressao_in_retorno1252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SE__in_se1265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressao_in_se1267 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_se1269 = new BitSet(new long[]{0x0000000000000008L,0x0000080000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_se1271 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARA__in_para1285 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressao_in_para1287 = new BitSet(new long[]{0x004DE0100D000010L,0x0810000000000308L});
    public static final BitSet FOLLOW_expressao_in_para1289 = new BitSet(new long[]{0x004DE0100D000010L,0x0810000000000308L});
    public static final BitSet FOLLOW_expressao_in_para1291 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REPITA__in_repita1304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaracao_in_repita1306 = new BitSet(new long[]{0x004DE0100D000010L,0x0810000000000308L});
    public static final BitSet FOLLOW_expressao_in_repita1308 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_repita1310 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENQUANTO__in_enquanto1323 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressao_in_enquanto1325 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_enquanto1327 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TENTE__in_tente1340 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_tente1342 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_listaDeCapturas_in_tente1344 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAPTURE__in_capture1357 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaracao_in_capture1359 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_capture1361 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LANCE__in_lance1374 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressao_in_lance1376 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTRUCOES__in_blocoDeInstrucoes1389 = new BitSet(new long[]{0x0000000000000004L});

}