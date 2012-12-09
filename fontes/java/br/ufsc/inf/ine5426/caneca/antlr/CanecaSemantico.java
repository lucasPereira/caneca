// $ANTLR 3.4 fontes/g/CanecaSemantico.g 2012-12-09 01:34:58

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



    // $ANTLR start "topdown"
    // fontes/g/CanecaSemantico.g:56:1: topdown : ( classe | atributo | construtor | destrutor | metodo | declaracao | bloco | se | para | repita | enquanto | tente | capture | lance );
    public final void topdown() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:57:2: ( classe | atributo | construtor | destrutor | metodo | declaracao | bloco | se | para | repita | enquanto | tente | capture | lance )
            int alt1=14;
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
            case METODO_:
                {
                alt1=5;
                }
                break;
            case DECLARACAO_:
                {
                alt1=6;
                }
                break;
            case INSTRUCOES_:
                {
                alt1=7;
                }
                break;
            case SE_:
                {
                alt1=8;
                }
                break;
            case PARA_:
                {
                alt1=9;
                }
                break;
            case REPITA_:
                {
                alt1=10;
                }
                break;
            case ENQUANTO_:
                {
                alt1=11;
                }
                break;
            case TENTE_:
                {
                alt1=12;
                }
                break;
            case CAPTURE_:
                {
                alt1=13;
                }
                break;
            case LANCE_:
                {
                alt1=14;
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
                    // fontes/g/CanecaSemantico.g:57:4: classe
                    {
                    pushFollow(FOLLOW_classe_in_topdown60);
                    classe();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:58:4: atributo
                    {
                    pushFollow(FOLLOW_atributo_in_topdown65);
                    atributo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemantico.g:59:4: construtor
                    {
                    pushFollow(FOLLOW_construtor_in_topdown70);
                    construtor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSemantico.g:60:4: destrutor
                    {
                    pushFollow(FOLLOW_destrutor_in_topdown75);
                    destrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSemantico.g:61:4: metodo
                    {
                    pushFollow(FOLLOW_metodo_in_topdown80);
                    metodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // fontes/g/CanecaSemantico.g:62:4: declaracao
                    {
                    pushFollow(FOLLOW_declaracao_in_topdown85);
                    declaracao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // fontes/g/CanecaSemantico.g:63:4: bloco
                    {
                    pushFollow(FOLLOW_bloco_in_topdown90);
                    bloco();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // fontes/g/CanecaSemantico.g:64:4: se
                    {
                    pushFollow(FOLLOW_se_in_topdown95);
                    se();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // fontes/g/CanecaSemantico.g:65:4: para
                    {
                    pushFollow(FOLLOW_para_in_topdown100);
                    para();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // fontes/g/CanecaSemantico.g:66:4: repita
                    {
                    pushFollow(FOLLOW_repita_in_topdown105);
                    repita();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // fontes/g/CanecaSemantico.g:67:4: enquanto
                    {
                    pushFollow(FOLLOW_enquanto_in_topdown110);
                    enquanto();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // fontes/g/CanecaSemantico.g:68:4: tente
                    {
                    pushFollow(FOLLOW_tente_in_topdown115);
                    tente();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // fontes/g/CanecaSemantico.g:69:4: capture
                    {
                    pushFollow(FOLLOW_capture_in_topdown120);
                    capture();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // fontes/g/CanecaSemantico.g:70:4: lance
                    {
                    pushFollow(FOLLOW_lance_in_topdown125);
                    lance();

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
    // fontes/g/CanecaSemantico.g:73:1: bottomup : ( terminaClasse | terminarConstrutor | terminarDestrutor | terminarMetodo | terminarBloco | terminarSe | terminarPara | terminarRepita | terminarEnquanto | terminarTente | terminarCapture | terminarLance );
    public final void bottomup() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:74:2: ( terminaClasse | terminarConstrutor | terminarDestrutor | terminarMetodo | terminarBloco | terminarSe | terminarPara | terminarRepita | terminarEnquanto | terminarTente | terminarCapture | terminarLance )
            int alt2=12;
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
            case METODO_:
                {
                alt2=4;
                }
                break;
            case INSTRUCOES_:
                {
                alt2=5;
                }
                break;
            case SE_:
                {
                alt2=6;
                }
                break;
            case PARA_:
                {
                alt2=7;
                }
                break;
            case REPITA_:
                {
                alt2=8;
                }
                break;
            case ENQUANTO_:
                {
                alt2=9;
                }
                break;
            case TENTE_:
                {
                alt2=10;
                }
                break;
            case CAPTURE_:
                {
                alt2=11;
                }
                break;
            case LANCE_:
                {
                alt2=12;
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
                    // fontes/g/CanecaSemantico.g:74:4: terminaClasse
                    {
                    pushFollow(FOLLOW_terminaClasse_in_bottomup136);
                    terminaClasse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:75:4: terminarConstrutor
                    {
                    pushFollow(FOLLOW_terminarConstrutor_in_bottomup141);
                    terminarConstrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemantico.g:76:4: terminarDestrutor
                    {
                    pushFollow(FOLLOW_terminarDestrutor_in_bottomup146);
                    terminarDestrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSemantico.g:77:4: terminarMetodo
                    {
                    pushFollow(FOLLOW_terminarMetodo_in_bottomup151);
                    terminarMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSemantico.g:78:4: terminarBloco
                    {
                    pushFollow(FOLLOW_terminarBloco_in_bottomup156);
                    terminarBloco();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // fontes/g/CanecaSemantico.g:79:4: terminarSe
                    {
                    pushFollow(FOLLOW_terminarSe_in_bottomup161);
                    terminarSe();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // fontes/g/CanecaSemantico.g:80:4: terminarPara
                    {
                    pushFollow(FOLLOW_terminarPara_in_bottomup166);
                    terminarPara();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // fontes/g/CanecaSemantico.g:81:4: terminarRepita
                    {
                    pushFollow(FOLLOW_terminarRepita_in_bottomup171);
                    terminarRepita();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // fontes/g/CanecaSemantico.g:82:4: terminarEnquanto
                    {
                    pushFollow(FOLLOW_terminarEnquanto_in_bottomup176);
                    terminarEnquanto();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // fontes/g/CanecaSemantico.g:83:4: terminarTente
                    {
                    pushFollow(FOLLOW_terminarTente_in_bottomup181);
                    terminarTente();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // fontes/g/CanecaSemantico.g:84:4: terminarCapture
                    {
                    pushFollow(FOLLOW_terminarCapture_in_bottomup186);
                    terminarCapture();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // fontes/g/CanecaSemantico.g:85:4: terminarLance
                    {
                    pushFollow(FOLLOW_terminarLance_in_bottomup191);
                    terminarLance();

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
    // fontes/g/CanecaSemantico.g:88:1: programa : ^( PROGRAMA_ ( unicadeDeCompilacao )+ ) ;
    public final void programa() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:89:2: ( ^( PROGRAMA_ ( unicadeDeCompilacao )+ ) )
            // fontes/g/CanecaSemantico.g:89:4: ^( PROGRAMA_ ( unicadeDeCompilacao )+ )
            {
            match(input,PROGRAMA_,FOLLOW_PROGRAMA__in_programa203); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // fontes/g/CanecaSemantico.g:89:16: ( unicadeDeCompilacao )+
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
            	    // fontes/g/CanecaSemantico.g:89:17: unicadeDeCompilacao
            	    {
            	    pushFollow(FOLLOW_unicadeDeCompilacao_in_programa206);
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
    // fontes/g/CanecaSemantico.g:92:1: unicadeDeCompilacao : ( ^( UNIDADE_ cabecalho classe ) | ^( UNIDADE_ cabecalho interfaces ) );
    public final void unicadeDeCompilacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:93:2: ( ^( UNIDADE_ cabecalho classe ) | ^( UNIDADE_ cabecalho interfaces ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:93:4: ^( UNIDADE_ cabecalho classe )
                    {
                    match(input,UNIDADE_,FOLLOW_UNIDADE__in_unicadeDeCompilacao221); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_cabecalho_in_unicadeDeCompilacao223);
                    cabecalho();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_classe_in_unicadeDeCompilacao225);
                    classe();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:94:4: ^( UNIDADE_ cabecalho interfaces )
                    {
                    match(input,UNIDADE_,FOLLOW_UNIDADE__in_unicadeDeCompilacao232); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_cabecalho_in_unicadeDeCompilacao234);
                    cabecalho();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_interfaces_in_unicadeDeCompilacao236);
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
    // fontes/g/CanecaSemantico.g:97:1: cabecalho : ^( CABECALHO_ pacote importacoes ) ;
    public final void cabecalho() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:98:2: ( ^( CABECALHO_ pacote importacoes ) )
            // fontes/g/CanecaSemantico.g:98:4: ^( CABECALHO_ pacote importacoes )
            {
            match(input,CABECALHO_,FOLLOW_CABECALHO__in_cabecalho249); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_pacote_in_cabecalho251);
            pacote();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_importacoes_in_cabecalho253);
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
    // fontes/g/CanecaSemantico.g:101:1: pacote : ^( PACOTE_ IDENTIFICADOR_DE_PACOTE ) ;
    public final void pacote() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:102:2: ( ^( PACOTE_ IDENTIFICADOR_DE_PACOTE ) )
            // fontes/g/CanecaSemantico.g:102:4: ^( PACOTE_ IDENTIFICADOR_DE_PACOTE )
            {
            match(input,PACOTE_,FOLLOW_PACOTE__in_pacote266); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,IDENTIFICADOR_DE_PACOTE,FOLLOW_IDENTIFICADOR_DE_PACOTE_in_pacote268); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:105:1: importacoes : ^( IMPORTACOES_ ( importacao )* ) ;
    public final void importacoes() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:106:2: ( ^( IMPORTACOES_ ( importacao )* ) )
            // fontes/g/CanecaSemantico.g:106:4: ^( IMPORTACOES_ ( importacao )* )
            {
            match(input,IMPORTACOES_,FOLLOW_IMPORTACOES__in_importacoes281); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:106:19: ( importacao )*
                loop5:
                do {
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==IMPORTACAO_) ) {
                        alt5=1;
                    }


                    switch (alt5) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:106:20: importacao
                	    {
                	    pushFollow(FOLLOW_importacao_in_importacoes284);
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
    // fontes/g/CanecaSemantico.g:109:1: importacao : ( ^( IMPORTACAO_ IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( IDENTIFICADOR )? ) | ^( IMPORTACAO_ IDENTIFICADOR_DE_PACOTE ) );
    public final void importacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:110:2: ( ^( IMPORTACAO_ IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( IDENTIFICADOR )? ) | ^( IMPORTACAO_ IDENTIFICADOR_DE_PACOTE ) )
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
                    // fontes/g/CanecaSemantico.g:110:4: ^( IMPORTACAO_ IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( IDENTIFICADOR )? )
                    {
                    match(input,IMPORTACAO_,FOLLOW_IMPORTACAO__in_importacao299); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_importacao301); if (state.failed) return ;

                    match(input,IDENTIFICADOR_DE_PACOTE,FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao303); if (state.failed) return ;

                    // fontes/g/CanecaSemantico.g:110:56: ( IDENTIFICADOR )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==IDENTIFICADOR) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // fontes/g/CanecaSemantico.g:110:57: IDENTIFICADOR
                            {
                            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_importacao306); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:111:4: ^( IMPORTACAO_ IDENTIFICADOR_DE_PACOTE )
                    {
                    match(input,IMPORTACAO_,FOLLOW_IMPORTACAO__in_importacao315); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,IDENTIFICADOR_DE_PACOTE,FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao317); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:114:1: classe : ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . ) ;
    public final void classe() throws RecognitionException {
        CommonTree IDENTIFICADOR1=null;

        try {
            // fontes/g/CanecaSemantico.g:115:2: ( ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . ) )
            // fontes/g/CanecaSemantico.g:115:4: ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . )
            {
            match(input,CLASSE_,FOLLOW_CLASSE__in_classe330); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoFeminino_in_classe332);
            modificadorDeAcessoFeminino();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR1=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_classe334); if (state.failed) return ;

            pushFollow(FOLLOW_listaDeTiposGenericos_in_classe336);
            listaDeTiposGenericos();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_listaDeInterfaces_in_classe338);
            listaDeInterfaces();

            state._fsp--;
            if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("classe");
            			Classe classe = new Classe(escopoAtual, (IDENTIFICADOR1!=null?IDENTIFICADOR1.getText():null), IDENTIFICADOR1.getLine(), IDENTIFICADOR1.getCharPositionInLine());
            			escopoAtual.definirClasse(classe);
            			escopoAtual = classe;
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
    // fontes/g/CanecaSemantico.g:124:1: terminaClasse : ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . ) ;
    public final void terminaClasse() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:125:2: ( ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . ) )
            // fontes/g/CanecaSemantico.g:125:4: ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . )
            {
            match(input,CLASSE_,FOLLOW_CLASSE__in_terminaClasse357); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoFeminino_in_terminaClasse359);
            modificadorDeAcessoFeminino();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_terminaClasse361); if (state.failed) return ;

            pushFollow(FOLLOW_listaDeTiposGenericos_in_terminaClasse363);
            listaDeTiposGenericos();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_listaDeInterfaces_in_terminaClasse365);
            listaDeInterfaces();

            state._fsp--;
            if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminarClasse");
            			escopoAtual = escopoAtual.fornecerEscopoPai();
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
    // fontes/g/CanecaSemantico.g:132:1: interfaces : ^( INTERFACE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface ) ;
    public final void interfaces() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:133:2: ( ^( INTERFACE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface ) )
            // fontes/g/CanecaSemantico.g:133:4: ^( INTERFACE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface )
            {
            match(input,INTERFACE_,FOLLOW_INTERFACE__in_interfaces384); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoFeminino_in_interfaces386);
            modificadorDeAcessoFeminino();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_interfaces388); if (state.failed) return ;

            pushFollow(FOLLOW_listaDeTiposGenericos_in_interfaces390);
            listaDeTiposGenericos();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_listaDeInterfaces_in_interfaces392);
            listaDeInterfaces();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_corpoDaInterface_in_interfaces394);
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
    // fontes/g/CanecaSemantico.g:136:1: corpoDaClasse : ^( CORPO_ atributos construtores destrutor metodos ) ;
    public final void corpoDaClasse() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:137:2: ( ^( CORPO_ atributos construtores destrutor metodos ) )
            // fontes/g/CanecaSemantico.g:137:4: ^( CORPO_ atributos construtores destrutor metodos )
            {
            match(input,CORPO_,FOLLOW_CORPO__in_corpoDaClasse407); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_atributos_in_corpoDaClasse409);
            atributos();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_construtores_in_corpoDaClasse411);
            construtores();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_destrutor_in_corpoDaClasse413);
            destrutor();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_metodos_in_corpoDaClasse415);
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
    // fontes/g/CanecaSemantico.g:140:1: corpoDaInterface : ^( CORPO_ atributos assinaturasDeMetodos ) ;
    public final void corpoDaInterface() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:141:2: ( ^( CORPO_ atributos assinaturasDeMetodos ) )
            // fontes/g/CanecaSemantico.g:141:4: ^( CORPO_ atributos assinaturasDeMetodos )
            {
            match(input,CORPO_,FOLLOW_CORPO__in_corpoDaInterface428); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_atributos_in_corpoDaInterface430);
            atributos();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_assinaturasDeMetodos_in_corpoDaInterface432);
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
    // fontes/g/CanecaSemantico.g:144:1: atributos : ^( ATRIBUTOS_ ( atributo )* ) ;
    public final void atributos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:145:2: ( ^( ATRIBUTOS_ ( atributo )* ) )
            // fontes/g/CanecaSemantico.g:145:4: ^( ATRIBUTOS_ ( atributo )* )
            {
            match(input,ATRIBUTOS_,FOLLOW_ATRIBUTOS__in_atributos445); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:145:17: ( atributo )*
                loop8:
                do {
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==ATRIBUTO_) ) {
                        alt8=1;
                    }


                    switch (alt8) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:145:18: atributo
                	    {
                	    pushFollow(FOLLOW_atributo_in_atributos448);
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
    // fontes/g/CanecaSemantico.g:148:1: construtores : ^( CONSTRUTORES_ ( construtor )+ ) ;
    public final void construtores() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:149:2: ( ^( CONSTRUTORES_ ( construtor )+ ) )
            // fontes/g/CanecaSemantico.g:149:4: ^( CONSTRUTORES_ ( construtor )+ )
            {
            match(input,CONSTRUTORES_,FOLLOW_CONSTRUTORES__in_construtores463); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // fontes/g/CanecaSemantico.g:149:20: ( construtor )+
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
            	    // fontes/g/CanecaSemantico.g:149:21: construtor
            	    {
            	    pushFollow(FOLLOW_construtor_in_construtores466);
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
    // fontes/g/CanecaSemantico.g:152:1: metodos : ^( METODOS_ ( metodo )* ) ;
    public final void metodos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:153:2: ( ^( METODOS_ ( metodo )* ) )
            // fontes/g/CanecaSemantico.g:153:4: ^( METODOS_ ( metodo )* )
            {
            match(input,METODOS_,FOLLOW_METODOS__in_metodos481); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:153:15: ( metodo )*
                loop10:
                do {
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==METODO_) ) {
                        alt10=1;
                    }


                    switch (alt10) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:153:16: metodo
                	    {
                	    pushFollow(FOLLOW_metodo_in_metodos484);
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
    // fontes/g/CanecaSemantico.g:156:1: assinaturasDeMetodos : ^( ASSINATURAS_DE_METODOS_ ( ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) )* ) ;
    public final void assinaturasDeMetodos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:157:2: ( ^( ASSINATURAS_DE_METODOS_ ( ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) )* ) )
            // fontes/g/CanecaSemantico.g:157:4: ^( ASSINATURAS_DE_METODOS_ ( ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) )* )
            {
            match(input,ASSINATURAS_DE_METODOS_,FOLLOW_ASSINATURAS_DE_METODOS__in_assinaturasDeMetodos499); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:157:30: ( ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) )*
                loop12:
                do {
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==ASSINATURA_) ) {
                        alt12=1;
                    }


                    switch (alt12) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:157:31: ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . )
                	    {
                	    match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_assinaturasDeMetodos503); if (state.failed) return ;

                	    match(input, Token.DOWN, null); if (state.failed) return ;
                	    pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_assinaturasDeMetodos505);
                	    modificadorDeAcessoMasculino();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    // fontes/g/CanecaSemantico.g:157:74: ( ESTATICO )?
                	    int alt11=2;
                	    int LA11_0 = input.LA(1);

                	    if ( (LA11_0==ESTATICO) ) {
                	        alt11=1;
                	    }
                	    switch (alt11) {
                	        case 1 :
                	            // fontes/g/CanecaSemantico.g:157:75: ESTATICO
                	            {
                	            match(input,ESTATICO,FOLLOW_ESTATICO_in_assinaturasDeMetodos508); if (state.failed) return ;

                	            }
                	            break;

                	    }


                	    pushFollow(FOLLOW_tipo_in_assinaturasDeMetodos512);
                	    tipo();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_assinaturasDeMetodos514); if (state.failed) return ;

                	    matchAny(input); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:160:1: atributo : ^( ATRIBUTO_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR ( . )? ) ;
    public final void atributo() throws RecognitionException {
        CommonTree IDENTIFICADOR3=null;
        Tipo tipo2 =null;


        try {
            // fontes/g/CanecaSemantico.g:161:2: ( ^( ATRIBUTO_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR ( . )? ) )
            // fontes/g/CanecaSemantico.g:161:4: ^( ATRIBUTO_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR ( . )? )
            {
            match(input,ATRIBUTO_,FOLLOW_ATRIBUTO__in_atributo532); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_atributo534);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:161:45: ( ESTATICO )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ESTATICO) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:161:46: ESTATICO
                    {
                    match(input,ESTATICO,FOLLOW_ESTATICO_in_atributo537); if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_atributo541);
            tipo2=tipo();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR3=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_atributo543); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:161:76: ( . )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0 >= ATRIBUIDOR && LA14_0 <= UNIDADE_)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:161:77: .
                    {
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("atributo");
            			Atributo atributo = new Atributo(escopoAtual, tipo2, (IDENTIFICADOR3!=null?IDENTIFICADOR3.getText():null), IDENTIFICADOR3.getLine(), IDENTIFICADOR3.getCharPositionInLine());
            			escopoAtual.definirAtributo(atributo);
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
    // fontes/g/CanecaSemantico.g:169:1: construtor : ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) ;
    public final void construtor() throws RecognitionException {
        CommonTree IDENTIFICADOR4=null;

        try {
            // fontes/g/CanecaSemantico.g:170:2: ( ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemantico.g:170:4: ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . )
            {
            match(input,CONSTRUTOR_,FOLLOW_CONSTRUTOR__in_construtor565); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_construtor569); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_construtor571);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR4=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_construtor573); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("construtor");
            			Construtor construtor = new Construtor(escopoAtual, (IDENTIFICADOR4!=null?IDENTIFICADOR4.getText():null), IDENTIFICADOR4.getLine(), IDENTIFICADOR4.getCharPositionInLine());
            			escopoAtual.definirConstrutor(construtor);
            			escopoAtual = construtor;
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
    // fontes/g/CanecaSemantico.g:179:1: terminarConstrutor : ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) ;
    public final void terminarConstrutor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:180:2: ( ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemantico.g:180:4: ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . )
            {
            match(input,CONSTRUTOR_,FOLLOW_CONSTRUTOR__in_terminarConstrutor595); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_terminarConstrutor599); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_terminarConstrutor601);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_terminarConstrutor603); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminarConstrutor");
            			escopoAtual = escopoAtual.fornecerEscopoPai();
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
    // fontes/g/CanecaSemantico.g:187:1: destrutor : ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) ;
    public final void destrutor() throws RecognitionException {
        CommonTree IDENTIFICADOR5=null;

        try {
            // fontes/g/CanecaSemantico.g:188:2: ( ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemantico.g:188:4: ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . )
            {
            match(input,DESTRUTOR_,FOLLOW_DESTRUTOR__in_destrutor625); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_destrutor628); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_destrutor630);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR5=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_destrutor632); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("destrutor");
            			Destrutor destrutor = new Destrutor(escopoAtual, (IDENTIFICADOR5!=null?IDENTIFICADOR5.getText():null), IDENTIFICADOR5.getLine(), IDENTIFICADOR5.getCharPositionInLine());
            			escopoAtual.definirDestrutor(destrutor);
            			escopoAtual = destrutor;
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
    // fontes/g/CanecaSemantico.g:197:1: terminarDestrutor : ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) ;
    public final void terminarDestrutor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:198:2: ( ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemantico.g:198:4: ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . )
            {
            match(input,DESTRUTOR_,FOLLOW_DESTRUTOR__in_terminarDestrutor654); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_terminarDestrutor657); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_terminarDestrutor659);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_terminarDestrutor661); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminarDestrutor");
            			escopoAtual = escopoAtual.fornecerEscopoPai();
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
    // fontes/g/CanecaSemantico.g:205:1: metodo : ^( METODO_ ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) . ) ;
    public final void metodo() throws RecognitionException {
        CommonTree IDENTIFICADOR7=null;
        Tipo tipo6 =null;


        try {
            // fontes/g/CanecaSemantico.g:206:2: ( ^( METODO_ ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemantico.g:206:4: ^( METODO_ ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) . )
            {
            match(input,METODO_,FOLLOW_METODO__in_metodo683); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_metodo686); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_metodo688);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:206:57: ( ESTATICO )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ESTATICO) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:206:58: ESTATICO
                    {
                    match(input,ESTATICO,FOLLOW_ESTATICO_in_metodo691); if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_metodo695);
            tipo6=tipo();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR7=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_metodo697); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("metodo");
            			Metodo metodo = new Metodo(escopoAtual, tipo6, (IDENTIFICADOR7!=null?IDENTIFICADOR7.getText():null), IDENTIFICADOR7.getLine(), IDENTIFICADOR7.getCharPositionInLine());
            			escopoAtual.definirMetodo(metodo);
            			escopoAtual = metodo;
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
    // $ANTLR end "metodo"



    // $ANTLR start "terminarMetodo"
    // fontes/g/CanecaSemantico.g:215:1: terminarMetodo : ^( METODO_ ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) . ) ;
    public final void terminarMetodo() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:216:2: ( ^( METODO_ ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemantico.g:216:4: ^( METODO_ ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) . )
            {
            match(input,METODO_,FOLLOW_METODO__in_terminarMetodo719); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_terminarMetodo722); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_terminarMetodo724);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:216:57: ( ESTATICO )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ESTATICO) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:216:58: ESTATICO
                    {
                    match(input,ESTATICO,FOLLOW_ESTATICO_in_terminarMetodo727); if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_terminarMetodo731);
            tipo();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_terminarMetodo733); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminarMetodo");
            			escopoAtual = escopoAtual.fornecerEscopoPai();
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
    // $ANTLR end "terminarMetodo"



    // $ANTLR start "modificadorDeAcessoMasculino"
    // fontes/g/CanecaSemantico.g:223:1: modificadorDeAcessoMasculino : ( PUBLICO | PRIVADO | PROTEGIDO );
    public final void modificadorDeAcessoMasculino() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:224:2: ( PUBLICO | PRIVADO | PROTEGIDO )
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
    // fontes/g/CanecaSemantico.g:229:1: modificadorDeAcessoFeminino : ( PUBLICA | PRIVADA | PROTEGIDA );
    public final void modificadorDeAcessoFeminino() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:230:2: ( PUBLICA | PRIVADA | PROTEGIDA )
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
    // fontes/g/CanecaSemantico.g:235:1: listaDeParametros : ^( PARAMETROS_ ( expressao )* ) ;
    public final void listaDeParametros() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:236:2: ( ^( PARAMETROS_ ( expressao )* ) )
            // fontes/g/CanecaSemantico.g:236:4: ^( PARAMETROS_ ( expressao )* )
            {
            match(input,PARAMETROS_,FOLLOW_PARAMETROS__in_listaDeParametros797); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:236:18: ( expressao )*
                loop17:
                do {
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==ATRIBUIDOR||LA17_0==DIFERENTE||(LA17_0 >= DIVISAO && LA17_0 <= E)||LA17_0==IGUAL||(LA17_0 >= MAIOR && LA17_0 <= MENOR_IGUAL)||(LA17_0 >= MULTIPLICACAO && LA17_0 <= NEGACAO)||LA17_0==OU||LA17_0==RESTO_DA_DIVISAO||(LA17_0 >= SOMA && LA17_0 <= SUBTRACAO)||LA17_0==PRIMARIA_||LA17_0==SUBTRACAO_UNARIA_) ) {
                        alt17=1;
                    }


                    switch (alt17) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:236:19: expressao
                	    {
                	    pushFollow(FOLLOW_expressao_in_listaDeParametros800);
                	    expressao();

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
    // $ANTLR end "listaDeParametros"



    // $ANTLR start "listaDeArgumentosVazia"
    // fontes/g/CanecaSemantico.g:239:1: listaDeArgumentosVazia : ARGUMENTOS_ ;
    public final void listaDeArgumentosVazia() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:240:2: ( ARGUMENTOS_ )
            // fontes/g/CanecaSemantico.g:240:4: ARGUMENTOS_
            {
            match(input,ARGUMENTOS_,FOLLOW_ARGUMENTOS__in_listaDeArgumentosVazia814); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:243:1: listaDeArgumentos : ^( ARGUMENTOS_ ( . )* ) ;
    public final void listaDeArgumentos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:244:2: ( ^( ARGUMENTOS_ ( . )* ) )
            // fontes/g/CanecaSemantico.g:244:4: ^( ARGUMENTOS_ ( . )* )
            {
            match(input,ARGUMENTOS_,FOLLOW_ARGUMENTOS__in_listaDeArgumentos826); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:244:18: ( . )*
                loop18:
                do {
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0 >= ATRIBUIDOR && LA18_0 <= UNIDADE_)) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==UP) ) {
                        alt18=2;
                    }


                    switch (alt18) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:244:19: .
                	    {
                	    matchAny(input); if (state.failed) return ;

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
    // $ANTLR end "listaDeArgumentos"



    // $ANTLR start "listaDeInterfaces"
    // fontes/g/CanecaSemantico.g:247:1: listaDeInterfaces : ^( INTERFACES_ ( tipo )* ) ;
    public final void listaDeInterfaces() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:248:2: ( ^( INTERFACES_ ( tipo )* ) )
            // fontes/g/CanecaSemantico.g:248:4: ^( INTERFACES_ ( tipo )* )
            {
            match(input,INTERFACES_,FOLLOW_INTERFACES__in_listaDeInterfaces844); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:248:18: ( tipo )*
                loop19:
                do {
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==TIPO_) ) {
                        alt19=1;
                    }


                    switch (alt19) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:248:19: tipo
                	    {
                	    pushFollow(FOLLOW_tipo_in_listaDeInterfaces847);
                	    tipo();

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
    // $ANTLR end "listaDeInterfaces"



    // $ANTLR start "listaDeTiposGenericos"
    // fontes/g/CanecaSemantico.g:251:1: listaDeTiposGenericos : ^( TIPOS_GENERICOS_ ( tipoGenerico )* ) ;
    public final void listaDeTiposGenericos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:252:2: ( ^( TIPOS_GENERICOS_ ( tipoGenerico )* ) )
            // fontes/g/CanecaSemantico.g:252:4: ^( TIPOS_GENERICOS_ ( tipoGenerico )* )
            {
            match(input,TIPOS_GENERICOS_,FOLLOW_TIPOS_GENERICOS__in_listaDeTiposGenericos862); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:252:23: ( tipoGenerico )*
                loop20:
                do {
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==TIPO_GENERICO_) ) {
                        alt20=1;
                    }


                    switch (alt20) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:252:24: tipoGenerico
                	    {
                	    pushFollow(FOLLOW_tipoGenerico_in_listaDeTiposGenericos865);
                	    tipoGenerico();

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
    // $ANTLR end "listaDeTiposGenericos"



    // $ANTLR start "listaDeTipos"
    // fontes/g/CanecaSemantico.g:255:1: listaDeTipos : ^( TIPOS_ ( tipo )* ) ;
    public final void listaDeTipos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:256:2: ( ^( TIPOS_ ( tipo )* ) )
            // fontes/g/CanecaSemantico.g:256:4: ^( TIPOS_ ( tipo )* )
            {
            match(input,TIPOS_,FOLLOW_TIPOS__in_listaDeTipos880); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:256:13: ( tipo )*
                loop21:
                do {
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==TIPO_) ) {
                        alt21=1;
                    }


                    switch (alt21) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:256:14: tipo
                	    {
                	    pushFollow(FOLLOW_tipo_in_listaDeTipos883);
                	    tipo();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop21;
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
    // fontes/g/CanecaSemantico.g:259:1: listaDeCapturas : ^( CAPTURAS_ ( capture )+ ) ;
    public final void listaDeCapturas() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:260:2: ( ^( CAPTURAS_ ( capture )+ ) )
            // fontes/g/CanecaSemantico.g:260:4: ^( CAPTURAS_ ( capture )+ )
            {
            match(input,CAPTURAS_,FOLLOW_CAPTURAS__in_listaDeCapturas898); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // fontes/g/CanecaSemantico.g:260:16: ( capture )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==CAPTURE_) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // fontes/g/CanecaSemantico.g:260:17: capture
            	    {
            	    pushFollow(FOLLOW_capture_in_listaDeCapturas901);
            	    capture();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
    // fontes/g/CanecaSemantico.g:263:1: tipoGenerico : ^( TIPO_GENERICO_ IDENTIFICADOR listaDeInterfaces ) ;
    public final void tipoGenerico() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:264:2: ( ^( TIPO_GENERICO_ IDENTIFICADOR listaDeInterfaces ) )
            // fontes/g/CanecaSemantico.g:264:4: ^( TIPO_GENERICO_ IDENTIFICADOR listaDeInterfaces )
            {
            match(input,TIPO_GENERICO_,FOLLOW_TIPO_GENERICO__in_tipoGenerico916); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_tipoGenerico918); if (state.failed) return ;

            pushFollow(FOLLOW_listaDeInterfaces_in_tipoGenerico920);
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
    // fontes/g/CanecaSemantico.g:267:1: tipo returns [Tipo tipo] : ^( TIPO_ IDENTIFICADOR listaDeTipos ) ;
    public final Tipo tipo() throws RecognitionException {
        Tipo tipo = null;


        CommonTree IDENTIFICADOR8=null;

        try {
            // fontes/g/CanecaSemantico.g:268:2: ( ^( TIPO_ IDENTIFICADOR listaDeTipos ) )
            // fontes/g/CanecaSemantico.g:268:4: ^( TIPO_ IDENTIFICADOR listaDeTipos )
            {
            match(input,TIPO_,FOLLOW_TIPO__in_tipo937); if (state.failed) return tipo;

            match(input, Token.DOWN, null); if (state.failed) return tipo;
            IDENTIFICADOR8=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_tipo939); if (state.failed) return tipo;

            pushFollow(FOLLOW_listaDeTipos_in_tipo941);
            listaDeTipos();

            state._fsp--;
            if (state.failed) return tipo;

            match(input, Token.UP, null); if (state.failed) return tipo;


            if ( state.backtracking==1 ) {
            			tipo = new Tipo((IDENTIFICADOR8!=null?IDENTIFICADOR8.getText():null));
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
    // fontes/g/CanecaSemantico.g:274:1: declaracao : ^( DECLARACAO_ tipo IDENTIFICADOR ) ;
    public final void declaracao() throws RecognitionException {
        CommonTree IDENTIFICADOR10=null;
        Tipo tipo9 =null;


        try {
            // fontes/g/CanecaSemantico.g:275:2: ( ^( DECLARACAO_ tipo IDENTIFICADOR ) )
            // fontes/g/CanecaSemantico.g:275:4: ^( DECLARACAO_ tipo IDENTIFICADOR )
            {
            match(input,DECLARACAO_,FOLLOW_DECLARACAO__in_declaracao958); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tipo_in_declaracao960);
            tipo9=tipo();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR10=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_declaracao962); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("variavel");
            			Variavel variavel = new Variavel(escopoAtual, tipo9, (IDENTIFICADOR10!=null?IDENTIFICADOR10.getText():null), IDENTIFICADOR10.getLine(), IDENTIFICADOR10.getCharPositionInLine());
            			escopoAtual.definirVariavel(variavel);
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
    // $ANTLR end "declaracao"



    // $ANTLR start "atribuicao"
    // fontes/g/CanecaSemantico.g:283:1: atribuicao : ^( ATRIBUICAO_ expressaoOuLogico ) ;
    public final void atribuicao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:284:2: ( ^( ATRIBUICAO_ expressaoOuLogico ) )
            // fontes/g/CanecaSemantico.g:284:4: ^( ATRIBUICAO_ expressaoOuLogico )
            {
            match(input,ATRIBUICAO_,FOLLOW_ATRIBUICAO__in_atribuicao979); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expressaoOuLogico_in_atribuicao981);
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
    // fontes/g/CanecaSemantico.g:287:1: declaracaoComAtribuicaoOpcional : ^( DECLARACAO_COM_ATRIBUICAO_OPICIONAL_ . ( atribuicao )? ) ;
    public final void declaracaoComAtribuicaoOpcional() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:288:2: ( ^( DECLARACAO_COM_ATRIBUICAO_OPICIONAL_ . ( atribuicao )? ) )
            // fontes/g/CanecaSemantico.g:288:4: ^( DECLARACAO_COM_ATRIBUICAO_OPICIONAL_ . ( atribuicao )? )
            {
            match(input,DECLARACAO_COM_ATRIBUICAO_OPICIONAL_,FOLLOW_DECLARACAO_COM_ATRIBUICAO_OPICIONAL__in_declaracaoComAtribuicaoOpcional994); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:288:45: ( atribuicao )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ATRIBUICAO_) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:288:46: atribuicao
                    {
                    pushFollow(FOLLOW_atribuicao_in_declaracaoComAtribuicaoOpcional999);
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
    // fontes/g/CanecaSemantico.g:291:1: expressao : ( ^( ATRIBUIDOR expressaoOuLogico expressaoOuLogico ) | expressaoOuLogico );
    public final void expressao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:292:2: ( ^( ATRIBUIDOR expressaoOuLogico expressaoOuLogico ) | expressaoOuLogico )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ATRIBUIDOR) ) {
                alt24=1;
            }
            else if ( (LA24_0==DIFERENTE||(LA24_0 >= DIVISAO && LA24_0 <= E)||LA24_0==IGUAL||(LA24_0 >= MAIOR && LA24_0 <= MENOR_IGUAL)||(LA24_0 >= MULTIPLICACAO && LA24_0 <= NEGACAO)||LA24_0==OU||LA24_0==RESTO_DA_DIVISAO||(LA24_0 >= SOMA && LA24_0 <= SUBTRACAO)||LA24_0==PRIMARIA_||LA24_0==SUBTRACAO_UNARIA_) ) {
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
                    // fontes/g/CanecaSemantico.g:292:4: ^( ATRIBUIDOR expressaoOuLogico expressaoOuLogico )
                    {
                    match(input,ATRIBUIDOR,FOLLOW_ATRIBUIDOR_in_expressao1014); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expressaoOuLogico_in_expressao1016);
                    expressaoOuLogico();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expressaoOuLogico_in_expressao1018);
                    expressaoOuLogico();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:293:4: expressaoOuLogico
                    {
                    pushFollow(FOLLOW_expressaoOuLogico_in_expressao1024);
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
    // fontes/g/CanecaSemantico.g:296:1: expressaoOuLogico : ( ^( OU expressaoELogico expressaoELogico ) | expressaoELogico );
    public final void expressaoOuLogico() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:297:2: ( ^( OU expressaoELogico expressaoELogico ) | expressaoELogico )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==OU) ) {
                alt25=1;
            }
            else if ( (LA25_0==DIFERENTE||(LA25_0 >= DIVISAO && LA25_0 <= E)||LA25_0==IGUAL||(LA25_0 >= MAIOR && LA25_0 <= MENOR_IGUAL)||(LA25_0 >= MULTIPLICACAO && LA25_0 <= NEGACAO)||LA25_0==RESTO_DA_DIVISAO||(LA25_0 >= SOMA && LA25_0 <= SUBTRACAO)||LA25_0==PRIMARIA_||LA25_0==SUBTRACAO_UNARIA_) ) {
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
                    // fontes/g/CanecaSemantico.g:297:4: ^( OU expressaoELogico expressaoELogico )
                    {
                    match(input,OU,FOLLOW_OU_in_expressaoOuLogico1036); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expressaoELogico_in_expressaoOuLogico1038);
                    expressaoELogico();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expressaoELogico_in_expressaoOuLogico1040);
                    expressaoELogico();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:298:4: expressaoELogico
                    {
                    pushFollow(FOLLOW_expressaoELogico_in_expressaoOuLogico1046);
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
    // fontes/g/CanecaSemantico.g:301:1: expressaoELogico : ( ^( E expressaoComparacaoLogica expressaoComparacaoLogica ) | expressaoComparacaoLogica );
    public final void expressaoELogico() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:302:2: ( ^( E expressaoComparacaoLogica expressaoComparacaoLogica ) | expressaoComparacaoLogica )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==E) ) {
                alt26=1;
            }
            else if ( (LA26_0==DIFERENTE||LA26_0==DIVISAO||LA26_0==IGUAL||(LA26_0 >= MAIOR && LA26_0 <= MENOR_IGUAL)||(LA26_0 >= MULTIPLICACAO && LA26_0 <= NEGACAO)||LA26_0==RESTO_DA_DIVISAO||(LA26_0 >= SOMA && LA26_0 <= SUBTRACAO)||LA26_0==PRIMARIA_||LA26_0==SUBTRACAO_UNARIA_) ) {
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
                    // fontes/g/CanecaSemantico.g:302:4: ^( E expressaoComparacaoLogica expressaoComparacaoLogica )
                    {
                    match(input,E,FOLLOW_E_in_expressaoELogico1058); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expressaoComparacaoLogica_in_expressaoELogico1060);
                    expressaoComparacaoLogica();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expressaoComparacaoLogica_in_expressaoELogico1062);
                    expressaoComparacaoLogica();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:303:4: expressaoComparacaoLogica
                    {
                    pushFollow(FOLLOW_expressaoComparacaoLogica_in_expressaoELogico1068);
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
    // fontes/g/CanecaSemantico.g:306:1: expressaoComparacaoLogica : ( ^( ( IGUAL | DIFERENTE | MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) expressaoAditiva expressaoAditiva ) | expressaoAditiva );
    public final void expressaoComparacaoLogica() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:307:2: ( ^( ( IGUAL | DIFERENTE | MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) expressaoAditiva expressaoAditiva ) | expressaoAditiva )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==DIFERENTE||LA27_0==IGUAL||(LA27_0 >= MAIOR && LA27_0 <= MENOR_IGUAL)) ) {
                alt27=1;
            }
            else if ( (LA27_0==DIVISAO||(LA27_0 >= MULTIPLICACAO && LA27_0 <= NEGACAO)||LA27_0==RESTO_DA_DIVISAO||(LA27_0 >= SOMA && LA27_0 <= SUBTRACAO)||LA27_0==PRIMARIA_||LA27_0==SUBTRACAO_UNARIA_) ) {
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
                    // fontes/g/CanecaSemantico.g:307:4: ^( ( IGUAL | DIFERENTE | MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) expressaoAditiva expressaoAditiva )
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
                    pushFollow(FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica1104);
                    expressaoAditiva();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica1106);
                    expressaoAditiva();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:308:4: expressaoAditiva
                    {
                    pushFollow(FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica1112);
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
    // fontes/g/CanecaSemantico.g:311:1: expressaoAditiva : ( ^( ( SOMA | SUBTRACAO ) expressaoMultiplicativa expressaoMultiplicativa ) | expressaoMultiplicativa );
    public final void expressaoAditiva() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:312:2: ( ^( ( SOMA | SUBTRACAO ) expressaoMultiplicativa expressaoMultiplicativa ) | expressaoMultiplicativa )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0 >= SOMA && LA28_0 <= SUBTRACAO)) ) {
                alt28=1;
            }
            else if ( (LA28_0==DIVISAO||(LA28_0 >= MULTIPLICACAO && LA28_0 <= NEGACAO)||LA28_0==RESTO_DA_DIVISAO||LA28_0==PRIMARIA_||LA28_0==SUBTRACAO_UNARIA_) ) {
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
                    // fontes/g/CanecaSemantico.g:312:4: ^( ( SOMA | SUBTRACAO ) expressaoMultiplicativa expressaoMultiplicativa )
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
                    pushFollow(FOLLOW_expressaoMultiplicativa_in_expressaoAditiva1132);
                    expressaoMultiplicativa();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expressaoMultiplicativa_in_expressaoAditiva1134);
                    expressaoMultiplicativa();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:313:4: expressaoMultiplicativa
                    {
                    pushFollow(FOLLOW_expressaoMultiplicativa_in_expressaoAditiva1140);
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
    // fontes/g/CanecaSemantico.g:316:1: expressaoMultiplicativa : ( ^( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) expressaoUnaria expressaoUnaria ) | expressaoUnaria );
    public final void expressaoMultiplicativa() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:317:2: ( ^( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) expressaoUnaria expressaoUnaria ) | expressaoUnaria )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==DIVISAO||LA29_0==MULTIPLICACAO||LA29_0==RESTO_DA_DIVISAO) ) {
                alt29=1;
            }
            else if ( (LA29_0==NEGACAO||LA29_0==PRIMARIA_||LA29_0==SUBTRACAO_UNARIA_) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:317:4: ^( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) expressaoUnaria expressaoUnaria )
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
                    pushFollow(FOLLOW_expressaoUnaria_in_expressaoMultiplicativa1164);
                    expressaoUnaria();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expressaoUnaria_in_expressaoMultiplicativa1166);
                    expressaoUnaria();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:318:4: expressaoUnaria
                    {
                    pushFollow(FOLLOW_expressaoUnaria_in_expressaoMultiplicativa1172);
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
    // fontes/g/CanecaSemantico.g:321:1: expressaoUnaria : ( ^( PRIMARIA_ expressaoPrimaria ) | ^( SUBTRACAO_UNARIA_ expressaoPrimaria ) | ^( NEGACAO expressaoPrimaria ) );
    public final void expressaoUnaria() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:322:2: ( ^( PRIMARIA_ expressaoPrimaria ) | ^( SUBTRACAO_UNARIA_ expressaoPrimaria ) | ^( NEGACAO expressaoPrimaria ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case PRIMARIA_:
                {
                alt30=1;
                }
                break;
            case SUBTRACAO_UNARIA_:
                {
                alt30=2;
                }
                break;
            case NEGACAO:
                {
                alt30=3;
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
                    // fontes/g/CanecaSemantico.g:322:4: ^( PRIMARIA_ expressaoPrimaria )
                    {
                    match(input,PRIMARIA_,FOLLOW_PRIMARIA__in_expressaoUnaria1184); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expressaoPrimaria_in_expressaoUnaria1186);
                    expressaoPrimaria();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:323:4: ^( SUBTRACAO_UNARIA_ expressaoPrimaria )
                    {
                    match(input,SUBTRACAO_UNARIA_,FOLLOW_SUBTRACAO_UNARIA__in_expressaoUnaria1193); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expressaoPrimaria_in_expressaoUnaria1195);
                    expressaoPrimaria();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemantico.g:324:4: ^( NEGACAO expressaoPrimaria )
                    {
                    match(input,NEGACAO,FOLLOW_NEGACAO_in_expressaoUnaria1202); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expressaoPrimaria_in_expressaoUnaria1204);
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
    // fontes/g/CanecaSemantico.g:327:1: expressaoPrimaria : ( expressao | VALOR_BOOLEANO | VALOR_NULO | CONSTANTE_INTEIRA | CONSTANTE_REAL | LITERAL_CARACTERE | LITERAL_TEXTO | comando );
    public final void expressaoPrimaria() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:328:2: ( expressao | VALOR_BOOLEANO | VALOR_NULO | CONSTANTE_INTEIRA | CONSTANTE_REAL | LITERAL_CARACTERE | LITERAL_TEXTO | comando )
            int alt31=8;
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
                alt31=1;
                }
                break;
            case VALOR_BOOLEANO:
                {
                alt31=2;
                }
                break;
            case VALOR_NULO:
                {
                alt31=3;
                }
                break;
            case CONSTANTE_INTEIRA:
                {
                alt31=4;
                }
                break;
            case CONSTANTE_REAL:
                {
                alt31=5;
                }
                break;
            case LITERAL_CARACTERE:
                {
                alt31=6;
                }
                break;
            case LITERAL_TEXTO:
                {
                alt31=7;
                }
                break;
            case COMANDO_:
                {
                alt31=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:328:4: expressao
                    {
                    pushFollow(FOLLOW_expressao_in_expressaoPrimaria1216);
                    expressao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:329:4: VALOR_BOOLEANO
                    {
                    match(input,VALOR_BOOLEANO,FOLLOW_VALOR_BOOLEANO_in_expressaoPrimaria1221); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemantico.g:330:4: VALOR_NULO
                    {
                    match(input,VALOR_NULO,FOLLOW_VALOR_NULO_in_expressaoPrimaria1226); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSemantico.g:331:4: CONSTANTE_INTEIRA
                    {
                    match(input,CONSTANTE_INTEIRA,FOLLOW_CONSTANTE_INTEIRA_in_expressaoPrimaria1231); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSemantico.g:332:4: CONSTANTE_REAL
                    {
                    match(input,CONSTANTE_REAL,FOLLOW_CONSTANTE_REAL_in_expressaoPrimaria1236); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // fontes/g/CanecaSemantico.g:333:4: LITERAL_CARACTERE
                    {
                    match(input,LITERAL_CARACTERE,FOLLOW_LITERAL_CARACTERE_in_expressaoPrimaria1241); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // fontes/g/CanecaSemantico.g:334:4: LITERAL_TEXTO
                    {
                    match(input,LITERAL_TEXTO,FOLLOW_LITERAL_TEXTO_in_expressaoPrimaria1246); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // fontes/g/CanecaSemantico.g:335:4: comando
                    {
                    pushFollow(FOLLOW_comando_in_expressaoPrimaria1251);
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
    // fontes/g/CanecaSemantico.g:338:1: comando : ^( COMANDO_ referencia ( chamada )* ) ;
    public final void comando() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:339:2: ( ^( COMANDO_ referencia ( chamada )* ) )
            // fontes/g/CanecaSemantico.g:339:4: ^( COMANDO_ referencia ( chamada )* )
            {
            match(input,COMANDO_,FOLLOW_COMANDO__in_comando1263); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_referencia_in_comando1265);
            referencia();

            state._fsp--;
            if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:339:26: ( chamada )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0 >= CHAMADA_DE_CLASSE && LA32_0 <= CHAMADA_DE_OBJETO)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // fontes/g/CanecaSemantico.g:339:27: chamada
            	    {
            	    pushFollow(FOLLOW_chamada_in_comando1268);
            	    chamada();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // fontes/g/CanecaSemantico.g:342:1: referencia : ( ^( REFERENCIA_ ESSE ) | ^( REFERENCIA_ ESSA ) | ^( REFERENCIA_ instanciacao ) | ^( REFERENCIA_ IDENTIFICADOR ( listaDeParametros )? ) );
    public final void referencia() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:343:2: ( ^( REFERENCIA_ ESSE ) | ^( REFERENCIA_ ESSA ) | ^( REFERENCIA_ instanciacao ) | ^( REFERENCIA_ IDENTIFICADOR ( listaDeParametros )? ) )
            int alt34=4;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==REFERENCIA_) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case ESSE:
                        {
                        alt34=1;
                        }
                        break;
                    case ESSA:
                        {
                        alt34=2;
                        }
                        break;
                    case IDENTIFICADOR:
                        {
                        alt34=4;
                        }
                        break;
                    case INSTANCIACAO_:
                        {
                        alt34=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 2, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:343:4: ^( REFERENCIA_ ESSE )
                    {
                    match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_referencia1283); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,ESSE,FOLLOW_ESSE_in_referencia1285); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:344:4: ^( REFERENCIA_ ESSA )
                    {
                    match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_referencia1292); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,ESSA,FOLLOW_ESSA_in_referencia1294); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemantico.g:345:4: ^( REFERENCIA_ instanciacao )
                    {
                    match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_referencia1301); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_instanciacao_in_referencia1303);
                    instanciacao();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSemantico.g:346:4: ^( REFERENCIA_ IDENTIFICADOR ( listaDeParametros )? )
                    {
                    match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_referencia1310); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_referencia1312); if (state.failed) return ;

                    // fontes/g/CanecaSemantico.g:346:32: ( listaDeParametros )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==PARAMETROS_) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // fontes/g/CanecaSemantico.g:346:33: listaDeParametros
                            {
                            pushFollow(FOLLOW_listaDeParametros_in_referencia1315);
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
    // fontes/g/CanecaSemantico.g:349:1: chamada : ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( listaDeParametros )? ) ;
    public final void chamada() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:350:2: ( ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( listaDeParametros )? ) )
            // fontes/g/CanecaSemantico.g:350:4: ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( listaDeParametros )? )
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
            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_chamada1338); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:350:60: ( listaDeParametros )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==PARAMETROS_) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:350:61: listaDeParametros
                    {
                    pushFollow(FOLLOW_listaDeParametros_in_chamada1341);
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
    // fontes/g/CanecaSemantico.g:353:1: instanciacao : ^( INSTANCIACAO_ tipo listaDeParametros ) ;
    public final void instanciacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:354:2: ( ^( INSTANCIACAO_ tipo listaDeParametros ) )
            // fontes/g/CanecaSemantico.g:354:4: ^( INSTANCIACAO_ tipo listaDeParametros )
            {
            match(input,INSTANCIACAO_,FOLLOW_INSTANCIACAO__in_instanciacao1356); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tipo_in_instanciacao1358);
            tipo();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_listaDeParametros_in_instanciacao1360);
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
    // fontes/g/CanecaSemantico.g:357:1: destruicao : ^( DESTRUICAO_ expressao ) ;
    public final void destruicao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:358:2: ( ^( DESTRUICAO_ expressao ) )
            // fontes/g/CanecaSemantico.g:358:4: ^( DESTRUICAO_ expressao )
            {
            match(input,DESTRUICAO_,FOLLOW_DESTRUICAO__in_destruicao1373); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expressao_in_destruicao1375);
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
    // fontes/g/CanecaSemantico.g:361:1: retorno : ^( RETORNO_ expressao ) ;
    public final void retorno() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:362:2: ( ^( RETORNO_ expressao ) )
            // fontes/g/CanecaSemantico.g:362:4: ^( RETORNO_ expressao )
            {
            match(input,RETORNO_,FOLLOW_RETORNO__in_retorno1389); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expressao_in_retorno1391);
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
    // fontes/g/CanecaSemantico.g:365:1: se : ^( SE_ . . ( . )? ) ;
    public final void se() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:366:2: ( ^( SE_ . . ( . )? ) )
            // fontes/g/CanecaSemantico.g:366:4: ^( SE_ . . ( . )? )
            {
            match(input,SE_,FOLLOW_SE__in_se1404); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:366:14: ( . )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0 >= ATRIBUIDOR && LA36_0 <= UNIDADE_)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:366:14: .
                    {
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("se");
            			InstrucaoSe instrucao = new InstrucaoSe(escopoAtual);
            			escopoAtual.definirInstrucao(instrucao);
            			escopoAtual = instrucao;
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
    // $ANTLR end "se"



    // $ANTLR start "terminarSe"
    // fontes/g/CanecaSemantico.g:375:1: terminarSe : ^( SE_ . . ( . )? ) ;
    public final void terminarSe() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:376:2: ( ^( SE_ . . ( . )? ) )
            // fontes/g/CanecaSemantico.g:376:4: ^( SE_ . . ( . )? )
            {
            match(input,SE_,FOLLOW_SE__in_terminarSe1428); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:376:14: ( . )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0 >= ATRIBUIDOR && LA37_0 <= UNIDADE_)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:376:14: .
                    {
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminarSe");
            			escopoAtual = escopoAtual.fornecerEscopoPai();
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
    // $ANTLR end "terminarSe"



    // $ANTLR start "para"
    // fontes/g/CanecaSemantico.g:383:1: para : ^( PARA_ . . . . ) ;
    public final void para() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:384:2: ( ^( PARA_ . . . . ) )
            // fontes/g/CanecaSemantico.g:384:4: ^( PARA_ . . . . )
            {
            match(input,PARA_,FOLLOW_PARA__in_para1452); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("para");
            			InstrucaoPara instrucao = new InstrucaoPara(escopoAtual);
            			escopoAtual.definirInstrucao(instrucao);
            			escopoAtual = instrucao;
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
    // $ANTLR end "para"



    // $ANTLR start "terminarPara"
    // fontes/g/CanecaSemantico.g:393:1: terminarPara : ^( PARA_ . . . . ) ;
    public final void terminarPara() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:394:2: ( ^( PARA_ . . . . ) )
            // fontes/g/CanecaSemantico.g:394:4: ^( PARA_ . . . . )
            {
            match(input,PARA_,FOLLOW_PARA__in_terminarPara1477); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminarPara");
            			escopoAtual = escopoAtual.fornecerEscopoPai();
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
    // $ANTLR end "terminarPara"



    // $ANTLR start "repita"
    // fontes/g/CanecaSemantico.g:401:1: repita : ^( REPITA_ . . . ) ;
    public final void repita() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:402:2: ( ^( REPITA_ . . . ) )
            // fontes/g/CanecaSemantico.g:402:4: ^( REPITA_ . . . )
            {
            match(input,REPITA_,FOLLOW_REPITA__in_repita1502); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("repita");
            			InstrucaoRepita instrucao = new InstrucaoRepita(escopoAtual);
            			escopoAtual.definirInstrucao(instrucao);
            			escopoAtual = instrucao;
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
    // $ANTLR end "repita"



    // $ANTLR start "terminarRepita"
    // fontes/g/CanecaSemantico.g:411:1: terminarRepita : ^( REPITA_ . . . ) ;
    public final void terminarRepita() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:412:2: ( ^( REPITA_ . . . ) )
            // fontes/g/CanecaSemantico.g:412:4: ^( REPITA_ . . . )
            {
            match(input,REPITA_,FOLLOW_REPITA__in_terminarRepita1525); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminarRepita");
            			escopoAtual = escopoAtual.fornecerEscopoPai();
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
    // $ANTLR end "terminarRepita"



    // $ANTLR start "enquanto"
    // fontes/g/CanecaSemantico.g:419:1: enquanto : ^( ENQUANTO_ . . ) ;
    public final void enquanto() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:420:2: ( ^( ENQUANTO_ . . ) )
            // fontes/g/CanecaSemantico.g:420:4: ^( ENQUANTO_ . . )
            {
            match(input,ENQUANTO_,FOLLOW_ENQUANTO__in_enquanto1548); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("enquanto");
            			InstrucaoEnquanto instrucao = new InstrucaoEnquanto(escopoAtual);
            			escopoAtual.definirInstrucao(instrucao);
            			escopoAtual = instrucao;
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
    // $ANTLR end "enquanto"



    // $ANTLR start "terminarEnquanto"
    // fontes/g/CanecaSemantico.g:429:1: terminarEnquanto : ^( ENQUANTO_ . . ) ;
    public final void terminarEnquanto() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:430:2: ( ^( ENQUANTO_ . . ) )
            // fontes/g/CanecaSemantico.g:430:4: ^( ENQUANTO_ . . )
            {
            match(input,ENQUANTO_,FOLLOW_ENQUANTO__in_terminarEnquanto1569); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminarEnquanto");
            			escopoAtual = escopoAtual.fornecerEscopoPai();
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
    // $ANTLR end "terminarEnquanto"



    // $ANTLR start "tente"
    // fontes/g/CanecaSemantico.g:437:1: tente : ^( TENTE_ . . ) ;
    public final void tente() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:438:2: ( ^( TENTE_ . . ) )
            // fontes/g/CanecaSemantico.g:438:4: ^( TENTE_ . . )
            {
            match(input,TENTE_,FOLLOW_TENTE__in_tente1590); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("tente");
            			InstrucaoTente instrucao = new InstrucaoTente(escopoAtual);
            			escopoAtual.definirInstrucao(instrucao);
            			escopoAtual = instrucao;
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
    // $ANTLR end "tente"



    // $ANTLR start "terminarTente"
    // fontes/g/CanecaSemantico.g:447:1: terminarTente : ^( TENTE_ . . ) ;
    public final void terminarTente() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:448:2: ( ^( TENTE_ . . ) )
            // fontes/g/CanecaSemantico.g:448:4: ^( TENTE_ . . )
            {
            match(input,TENTE_,FOLLOW_TENTE__in_terminarTente1611); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminarTente");
            			escopoAtual = escopoAtual.fornecerEscopoPai();
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
    // $ANTLR end "terminarTente"



    // $ANTLR start "capture"
    // fontes/g/CanecaSemantico.g:455:1: capture : ^( CAPTURE_ . . ) ;
    public final void capture() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:456:2: ( ^( CAPTURE_ . . ) )
            // fontes/g/CanecaSemantico.g:456:4: ^( CAPTURE_ . . )
            {
            match(input,CAPTURE_,FOLLOW_CAPTURE__in_capture1632); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("capture");
            			InstrucaoCapture instrucao = new InstrucaoCapture(escopoAtual);
            			escopoAtual.definirInstrucao(instrucao);
            			escopoAtual = instrucao;
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
    // $ANTLR end "capture"



    // $ANTLR start "terminarCapture"
    // fontes/g/CanecaSemantico.g:465:1: terminarCapture : ^( CAPTURE_ . . ) ;
    public final void terminarCapture() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:466:2: ( ^( CAPTURE_ . . ) )
            // fontes/g/CanecaSemantico.g:466:4: ^( CAPTURE_ . . )
            {
            match(input,CAPTURE_,FOLLOW_CAPTURE__in_terminarCapture1653); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminarCapture");
            			escopoAtual = escopoAtual.fornecerEscopoPai();
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
    // $ANTLR end "terminarCapture"



    // $ANTLR start "lance"
    // fontes/g/CanecaSemantico.g:473:1: lance : ^( LANCE_ . ) ;
    public final void lance() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:474:2: ( ^( LANCE_ . ) )
            // fontes/g/CanecaSemantico.g:474:4: ^( LANCE_ . )
            {
            match(input,LANCE_,FOLLOW_LANCE__in_lance1674); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("lance");
            			InstrucaoLance instrucao = new InstrucaoLance(escopoAtual);
            			escopoAtual.definirInstrucao(instrucao);
            			escopoAtual = instrucao;
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
    // $ANTLR end "lance"



    // $ANTLR start "terminarLance"
    // fontes/g/CanecaSemantico.g:483:1: terminarLance : ^( LANCE_ . ) ;
    public final void terminarLance() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:484:2: ( ^( LANCE_ . ) )
            // fontes/g/CanecaSemantico.g:484:4: ^( LANCE_ . )
            {
            match(input,LANCE_,FOLLOW_LANCE__in_terminarLance1693); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminarLance");
            			escopoAtual = escopoAtual.fornecerEscopoPai();
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
    // $ANTLR end "terminarLance"



    // $ANTLR start "bloco"
    // fontes/g/CanecaSemantico.g:491:1: bloco : ^( INSTRUCOES_ ( . )* ) ;
    public final void bloco() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:492:2: ( ^( INSTRUCOES_ ( . )* ) )
            // fontes/g/CanecaSemantico.g:492:4: ^( INSTRUCOES_ ( . )* )
            {
            match(input,INSTRUCOES_,FOLLOW_INSTRUCOES__in_bloco1712); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:492:18: ( . )*
                loop38:
                do {
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( ((LA38_0 >= ATRIBUIDOR && LA38_0 <= UNIDADE_)) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==UP) ) {
                        alt38=2;
                    }


                    switch (alt38) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:492:19: .
                	    {
                	    matchAny(input); if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop38;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            if ( state.backtracking==1 ) {
            			mostrar("bloco");
            			Bloco bloco = new Bloco(escopoAtual);
            			escopoAtual.definirBloco(bloco);
            			escopoAtual = bloco;
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
    // $ANTLR end "bloco"



    // $ANTLR start "terminarBloco"
    // fontes/g/CanecaSemantico.g:501:1: terminarBloco : ^( INSTRUCOES_ ( . )* ) ;
    public final void terminarBloco() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:502:2: ( ^( INSTRUCOES_ ( . )* ) )
            // fontes/g/CanecaSemantico.g:502:4: ^( INSTRUCOES_ ( . )* )
            {
            match(input,INSTRUCOES_,FOLLOW_INSTRUCOES__in_terminarBloco1734); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:502:18: ( . )*
                loop39:
                do {
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0 >= ATRIBUIDOR && LA39_0 <= UNIDADE_)) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==UP) ) {
                        alt39=2;
                    }


                    switch (alt39) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:502:19: .
                	    {
                	    matchAny(input); if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop39;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            if ( state.backtracking==1 ) {
            			mostrar("terminarBloco");
            			escopoAtual = escopoAtual.fornecerEscopoPai();
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
    // $ANTLR end "terminarBloco"

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
            return "92:1: unicadeDeCompilacao : ( ^( UNIDADE_ cabecalho classe ) | ^( UNIDADE_ cabecalho interfaces ) );";
        }
    }
 

    public static final BitSet FOLLOW_classe_in_topdown60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atributo_in_topdown65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_construtor_in_topdown70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destrutor_in_topdown75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_metodo_in_topdown80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracao_in_topdown85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloco_in_topdown90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_se_in_topdown95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_para_in_topdown100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repita_in_topdown105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enquanto_in_topdown110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tente_in_topdown115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_capture_in_topdown120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lance_in_topdown125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminaClasse_in_bottomup136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarConstrutor_in_bottomup141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarDestrutor_in_bottomup146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarMetodo_in_bottomup151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarBloco_in_bottomup156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarSe_in_bottomup161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarPara_in_bottomup166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarRepita_in_bottomup171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarEnquanto_in_bottomup176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarTente_in_bottomup181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarCapture_in_bottomup186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarLance_in_bottomup191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROGRAMA__in_programa203 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_unicadeDeCompilacao_in_programa206 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_UNIDADE__in_unicadeDeCompilacao221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_cabecalho_in_unicadeDeCompilacao223 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_classe_in_unicadeDeCompilacao225 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNIDADE__in_unicadeDeCompilacao232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_cabecalho_in_unicadeDeCompilacao234 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_interfaces_in_unicadeDeCompilacao236 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CABECALHO__in_cabecalho249 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pacote_in_cabecalho251 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_importacoes_in_cabecalho253 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PACOTE__in_pacote266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_DE_PACOTE_in_pacote268 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORTACOES__in_importacoes281 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_importacao_in_importacoes284 = new BitSet(new long[]{0x0000000000000008L,0x0000010000000000L});
    public static final BitSet FOLLOW_IMPORTACAO__in_importacao299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_importacao301 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao303 = new BitSet(new long[]{0x0000000400000008L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_importacao306 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORTACAO__in_importacao315 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao317 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASSE__in_classe330 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoFeminino_in_classe332 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_classe334 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_listaDeTiposGenericos_in_classe336 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_classe338 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_CLASSE__in_terminaClasse357 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoFeminino_in_terminaClasse359 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_terminaClasse361 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_listaDeTiposGenericos_in_terminaClasse363 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_terminaClasse365 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_INTERFACE__in_interfaces384 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoFeminino_in_interfaces386 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_interfaces388 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_listaDeTiposGenericos_in_interfaces390 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_interfaces392 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_corpoDaInterface_in_interfaces394 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CORPO__in_corpoDaClasse407 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atributos_in_corpoDaClasse409 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_construtores_in_corpoDaClasse411 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_destrutor_in_corpoDaClasse413 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_metodos_in_corpoDaClasse415 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CORPO__in_corpoDaInterface428 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atributos_in_corpoDaInterface430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_assinaturasDeMetodos_in_corpoDaInterface432 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATRIBUTOS__in_atributos445 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atributo_in_atributos448 = new BitSet(new long[]{0x0000000000000008L,0x0000000000400000L});
    public static final BitSet FOLLOW_CONSTRUTORES__in_construtores463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_construtor_in_construtores466 = new BitSet(new long[]{0x0000000000000008L,0x0000000080000000L});
    public static final BitSet FOLLOW_METODOS__in_metodos481 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_metodo_in_metodos484 = new BitSet(new long[]{0x0000000000000008L,0x0001000000000000L});
    public static final BitSet FOLLOW_ASSINATURAS_DE_METODOS__in_assinaturasDeMetodos499 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_assinaturasDeMetodos503 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_assinaturasDeMetodos505 = new BitSet(new long[]{0x0000000100000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_ESTATICO_in_assinaturasDeMetodos508 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_tipo_in_assinaturasDeMetodos512 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_assinaturasDeMetodos514 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_ATRIBUTO__in_atributo532 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_atributo534 = new BitSet(new long[]{0x0000000100000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_ESTATICO_in_atributo537 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_tipo_in_atributo541 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_atributo543 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_CONSTRUTOR__in_construtor565 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_construtor569 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_construtor571 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_construtor573 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_CONSTRUTOR__in_terminarConstrutor595 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_terminarConstrutor599 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_terminarConstrutor601 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_terminarConstrutor603 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_DESTRUTOR__in_destrutor625 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_destrutor628 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_destrutor630 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_destrutor632 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_DESTRUTOR__in_terminarDestrutor654 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_terminarDestrutor657 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_terminarDestrutor659 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_terminarDestrutor661 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_METODO__in_metodo683 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_metodo686 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_metodo688 = new BitSet(new long[]{0x0000000100000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_ESTATICO_in_metodo691 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_tipo_in_metodo695 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_metodo697 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_METODO__in_terminarMetodo719 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_terminarMetodo722 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_terminarMetodo724 = new BitSet(new long[]{0x0000000100000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_ESTATICO_in_terminarMetodo727 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_tipo_in_terminarMetodo731 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_terminarMetodo733 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_PARAMETROS__in_listaDeParametros797 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressao_in_listaDeParametros800 = new BitSet(new long[]{0x004DE0100D000018L,0x0810000000000308L});
    public static final BitSet FOLLOW_ARGUMENTOS__in_listaDeArgumentosVazia814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGUMENTOS__in_listaDeArgumentos826 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTERFACES__in_listaDeInterfaces844 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_listaDeInterfaces847 = new BitSet(new long[]{0x0000000000000008L,0x8000000000000000L});
    public static final BitSet FOLLOW_TIPOS_GENERICOS__in_listaDeTiposGenericos862 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipoGenerico_in_listaDeTiposGenericos865 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_TIPOS__in_listaDeTipos880 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_listaDeTipos883 = new BitSet(new long[]{0x0000000000000008L,0x8000000000000000L});
    public static final BitSet FOLLOW_CAPTURAS__in_listaDeCapturas898 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_capture_in_listaDeCapturas901 = new BitSet(new long[]{0x0000000000000008L,0x0000000002000000L});
    public static final BitSet FOLLOW_TIPO_GENERICO__in_tipoGenerico916 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_tipoGenerico918 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_tipoGenerico920 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIPO__in_tipo937 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_tipo939 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_listaDeTipos_in_tipo941 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARACAO__in_declaracao958 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_declaracao960 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_declaracao962 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATRIBUICAO__in_atribuicao979 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoOuLogico_in_atribuicao981 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARACAO_COM_ATRIBUICAO_OPICIONAL__in_declaracaoComAtribuicaoOpcional994 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atribuicao_in_declaracaoComAtribuicaoOpcional999 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATRIBUIDOR_in_expressao1014 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoOuLogico_in_expressao1016 = new BitSet(new long[]{0x004DE0100D000000L,0x0810000000000308L});
    public static final BitSet FOLLOW_expressaoOuLogico_in_expressao1018 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expressaoOuLogico_in_expressao1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OU_in_expressaoOuLogico1036 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoELogico_in_expressaoOuLogico1038 = new BitSet(new long[]{0x000DE0100D000000L,0x0810000000000308L});
    public static final BitSet FOLLOW_expressaoELogico_in_expressaoOuLogico1040 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expressaoELogico_in_expressaoOuLogico1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_E_in_expressaoELogico1058 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoComparacaoLogica_in_expressaoELogico1060 = new BitSet(new long[]{0x000DE01005000000L,0x0810000000000308L});
    public static final BitSet FOLLOW_expressaoComparacaoLogica_in_expressaoELogico1062 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expressaoComparacaoLogica_in_expressaoELogico1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expressaoComparacaoLogica1080 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica1104 = new BitSet(new long[]{0x000C000004000000L,0x0810000000000308L});
    public static final BitSet FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica1106 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expressaoAditiva1124 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoMultiplicativa_in_expressaoAditiva1132 = new BitSet(new long[]{0x000C000004000000L,0x0810000000000008L});
    public static final BitSet FOLLOW_expressaoMultiplicativa_in_expressaoAditiva1134 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expressaoMultiplicativa_in_expressaoAditiva1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expressaoMultiplicativa1152 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoUnaria_in_expressaoMultiplicativa1164 = new BitSet(new long[]{0x0008000000000000L,0x0810000000000000L});
    public static final BitSet FOLLOW_expressaoUnaria_in_expressaoMultiplicativa1166 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expressaoUnaria_in_expressaoMultiplicativa1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARIA__in_expressaoUnaria1184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoPrimaria_in_expressaoUnaria1186 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBTRACAO_UNARIA__in_expressaoUnaria1193 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoPrimaria_in_expressaoUnaria1195 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGACAO_in_expressaoUnaria1202 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoPrimaria_in_expressaoUnaria1204 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expressao_in_expressaoPrimaria1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALOR_BOOLEANO_in_expressaoPrimaria1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALOR_NULO_in_expressaoPrimaria1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTE_INTEIRA_in_expressaoPrimaria1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTE_REAL_in_expressaoPrimaria1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_CARACTERE_in_expressaoPrimaria1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_TEXTO_in_expressaoPrimaria1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comando_in_expressaoPrimaria1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMANDO__in_comando1263 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_referencia_in_comando1265 = new BitSet(new long[]{0x0000000000000C08L});
    public static final BitSet FOLLOW_chamada_in_comando1268 = new BitSet(new long[]{0x0000000000000C08L});
    public static final BitSet FOLLOW_REFERENCIA__in_referencia1283 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ESSE_in_referencia1285 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REFERENCIA__in_referencia1292 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ESSA_in_referencia1294 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REFERENCIA__in_referencia1301 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instanciacao_in_referencia1303 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REFERENCIA__in_referencia1310 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_referencia1312 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L});
    public static final BitSet FOLLOW_listaDeParametros_in_referencia1315 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_chamada1330 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_chamada1338 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L});
    public static final BitSet FOLLOW_listaDeParametros_in_chamada1341 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCIACAO__in_instanciacao1356 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_instanciacao1358 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_listaDeParametros_in_instanciacao1360 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DESTRUICAO__in_destruicao1373 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressao_in_destruicao1375 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETORNO__in_retorno1389 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressao_in_retorno1391 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SE__in_se1404 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SE__in_terminarSe1428 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PARA__in_para1452 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PARA__in_terminarPara1477 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_REPITA__in_repita1502 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_REPITA__in_terminarRepita1525 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ENQUANTO__in_enquanto1548 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ENQUANTO__in_terminarEnquanto1569 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TENTE__in_tente1590 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TENTE__in_terminarTente1611 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CAPTURE__in_capture1632 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CAPTURE__in_terminarCapture1653 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LANCE__in_lance1674 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LANCE__in_terminarLance1693 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INSTRUCOES__in_bloco1712 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INSTRUCOES__in_terminarBloco1734 = new BitSet(new long[]{0x0000000000000004L});

}