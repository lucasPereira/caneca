// $ANTLR 3.4 fontes/g/CanecaSemantico.g 2012-12-19 04:42:27

	package br.ufsc.inf.ine5426.caneca.antlr;

	import br.ufsc.inf.ine5426.caneca.interno.Atributo;
	import br.ufsc.inf.ine5426.caneca.interno.Bloco;
	import br.ufsc.inf.ine5426.caneca.interno.Classe;
	import br.ufsc.inf.ine5426.caneca.interno.Construtor;
	import br.ufsc.inf.ine5426.caneca.interno.Destrutor;
	import br.ufsc.inf.ine5426.caneca.interno.Escopo;
	import br.ufsc.inf.ine5426.caneca.interno.Expressao;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoAtribuicao;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoChamadaDeMetodo;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoComando;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoConstanteInteira;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoConstanteReal;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoDiferente;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoDivisao;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoE;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoIgual;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoInstanciacao;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoLiteralCaractere;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoLiteralTexto;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoMaior;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoMaiorIgual;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoMenor;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoMenorIgual;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoMultiplicacao;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoNegacao;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoNegativacao;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoOu;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoReferencia;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoRestoDaDivisao;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoSoma;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoSubtracao;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoValorBooleano;
	import br.ufsc.inf.ine5426.caneca.interno.ExpressaoValorNulo;
	import br.ufsc.inf.ine5426.caneca.interno.Instrucao;
	import br.ufsc.inf.ine5426.caneca.interno.InstrucaoCapture;
	import br.ufsc.inf.ine5426.caneca.interno.InstrucaoDestrua;
	import br.ufsc.inf.ine5426.caneca.interno.InstrucaoEnquanto;
	import br.ufsc.inf.ine5426.caneca.interno.InstrucaoImprimir;
	import br.ufsc.inf.ine5426.caneca.interno.InstrucaoLance;
	import br.ufsc.inf.ine5426.caneca.interno.InstrucaoPara;
	import br.ufsc.inf.ine5426.caneca.interno.InstrucaoRepita;
	import br.ufsc.inf.ine5426.caneca.interno.InstrucaoRetorne;
	import br.ufsc.inf.ine5426.caneca.interno.InstrucaoSe;
	import br.ufsc.inf.ine5426.caneca.interno.InstrucaoTente;
	import br.ufsc.inf.ine5426.caneca.interno.Metodo;
	import br.ufsc.inf.ine5426.caneca.interno.TabelaDeSimbolos;
	import br.ufsc.inf.ine5426.caneca.interno.Tipo;
	import br.ufsc.inf.ine5426.caneca.interno.Variavel;
	
	import java.util.Stack;


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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATRIBUIDOR", "ATRIBUTO", "CAPTURE", "CARACTERE", "CARACTERE_DE_ESCAPE", "CARACTERE_NAO_IMPRIMIVEL", "CHAMADA_DE_CLASSE", "CHAMADA_DE_OBJETO", "CLASSE", "COLCHETE_DIREITO", "COLCHETE_ESQUERDO", "COMENTARIO_EM_BLOCO", "COMENTARIO_EM_LINHA", "COMO", "CONSTANTE_INTEIRA", "CONSTANTE_REAL", "CONSTRUTOR", "DECLARE", "DESTRUA", "DESTRUTOR", "DIFERENTE", "DIGITO", "DIVISAO", "E", "ENQUANTO", "ESPACO_EM_BRANCO", "ESSA", "ESSE", "ESTATICO", "FIM", "IDENTIFICADOR", "IDENTIFICADOR_DE_PACOTE", "IGUAL", "IMPLEMENTA", "IMPORTE", "IMPRIMIR", "INICIO", "INTERFACE", "LANCE", "LETRA", "LITERAL_CARACTERE", "LITERAL_TEXTO", "MAIOR", "MAIOR_IGUAL", "MENOR", "MENOR_IGUAL", "METODO", "MULTIPLICACAO", "NEGACAO", "NOVA", "NOVO", "OU", "PACOTE", "PARA", "PARENTESE_DIREITO", "PARENTESE_ESQUERDO", "PRIVADA", "PRIVADO", "PROTEGIDA", "PROTEGIDO", "PUBLICA", "PUBLICO", "QUEBRA_DE_LINHA", "REPITA", "RESTO_DA_DIVISAO", "RETORNE", "SE", "SENAO", "SEPARADOR", "SOMA", "SUBTRACAO", "TABULACAO", "TENTE", "TERMINADOR", "USADO_EM_TEXTO", "VALOR_BOOLEANO", "VALOR_NULO", "ARGUMENTOS_", "ASSINATURAS_DE_METODOS_", "ASSINATURA_", "ASSINATURA_DE_METODO_", "ATRIBUICAO_", "ATRIBUTOS_", "ATRIBUTO_", "CABECALHO_", "CAPTURAS_", "CAPTURE_", "CHAMADA_DE_CLASSE_", "CHAMADA_DE_OBJETO_", "CLASSE_", "COMANDO_", "CONSTRUTORES_", "CONSTRUTOR_", "CORPO_", "DECLARACAO_", "DECLARACAO_COM_ATRIBUICAO_OPICIONAL_", "DESTRUICAO_", "DESTRUTORES_", "DESTRUTOR_", "ENQUANTO_", "EXPRESSAO_", "IMPORTACAO_", "IMPORTACOES_", "INSTANCIACAO_", "INSTRUCOES_", "INTERFACES_", "INTERFACE_", "LANCE_", "METODOS_", "METODO_", "NEGATIVACAO_", "PACOTE_", "PARAMETROS_", "PARA_", "PRIMARIA_", "PROGRAMA_", "REFERENCIA_", "REPITA_", "RETORNO_", "SELECAO_", "SE_", "TENTE_", "TIPOS_", "TIPOS_GENERICOS_", "TIPO_", "TIPO_GENERICO_", "UNIDADE_"
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
    public static final int IMPRIMIR=39;
    public static final int INICIO=40;
    public static final int INTERFACE=41;
    public static final int LANCE=42;
    public static final int LETRA=43;
    public static final int LITERAL_CARACTERE=44;
    public static final int LITERAL_TEXTO=45;
    public static final int MAIOR=46;
    public static final int MAIOR_IGUAL=47;
    public static final int MENOR=48;
    public static final int MENOR_IGUAL=49;
    public static final int METODO=50;
    public static final int MULTIPLICACAO=51;
    public static final int NEGACAO=52;
    public static final int NOVA=53;
    public static final int NOVO=54;
    public static final int OU=55;
    public static final int PACOTE=56;
    public static final int PARA=57;
    public static final int PARENTESE_DIREITO=58;
    public static final int PARENTESE_ESQUERDO=59;
    public static final int PRIVADA=60;
    public static final int PRIVADO=61;
    public static final int PROTEGIDA=62;
    public static final int PROTEGIDO=63;
    public static final int PUBLICA=64;
    public static final int PUBLICO=65;
    public static final int QUEBRA_DE_LINHA=66;
    public static final int REPITA=67;
    public static final int RESTO_DA_DIVISAO=68;
    public static final int RETORNE=69;
    public static final int SE=70;
    public static final int SENAO=71;
    public static final int SEPARADOR=72;
    public static final int SOMA=73;
    public static final int SUBTRACAO=74;
    public static final int TABULACAO=75;
    public static final int TENTE=76;
    public static final int TERMINADOR=77;
    public static final int USADO_EM_TEXTO=78;
    public static final int VALOR_BOOLEANO=79;
    public static final int VALOR_NULO=80;
    public static final int ARGUMENTOS_=81;
    public static final int ASSINATURAS_DE_METODOS_=82;
    public static final int ASSINATURA_=83;
    public static final int ASSINATURA_DE_METODO_=84;
    public static final int ATRIBUICAO_=85;
    public static final int ATRIBUTOS_=86;
    public static final int ATRIBUTO_=87;
    public static final int CABECALHO_=88;
    public static final int CAPTURAS_=89;
    public static final int CAPTURE_=90;
    public static final int CHAMADA_DE_CLASSE_=91;
    public static final int CHAMADA_DE_OBJETO_=92;
    public static final int CLASSE_=93;
    public static final int COMANDO_=94;
    public static final int CONSTRUTORES_=95;
    public static final int CONSTRUTOR_=96;
    public static final int CORPO_=97;
    public static final int DECLARACAO_=98;
    public static final int DECLARACAO_COM_ATRIBUICAO_OPICIONAL_=99;
    public static final int DESTRUICAO_=100;
    public static final int DESTRUTORES_=101;
    public static final int DESTRUTOR_=102;
    public static final int ENQUANTO_=103;
    public static final int EXPRESSAO_=104;
    public static final int IMPORTACAO_=105;
    public static final int IMPORTACOES_=106;
    public static final int INSTANCIACAO_=107;
    public static final int INSTRUCOES_=108;
    public static final int INTERFACES_=109;
    public static final int INTERFACE_=110;
    public static final int LANCE_=111;
    public static final int METODOS_=112;
    public static final int METODO_=113;
    public static final int NEGATIVACAO_=114;
    public static final int PACOTE_=115;
    public static final int PARAMETROS_=116;
    public static final int PARA_=117;
    public static final int PRIMARIA_=118;
    public static final int PROGRAMA_=119;
    public static final int REFERENCIA_=120;
    public static final int REPITA_=121;
    public static final int RETORNO_=122;
    public static final int SELECAO_=123;
    public static final int SE_=124;
    public static final int TENTE_=125;
    public static final int TIPOS_=126;
    public static final int TIPOS_GENERICOS_=127;
    public static final int TIPO_=128;
    public static final int TIPO_GENERICO_=129;
    public static final int UNIDADE_=130;

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
    	private Stack<Expressao> escoposDonos;
    	private boolean debug = false;
    	
    	public void fixarTabelaDeSimbolos(TabelaDeSimbolos tabelaDeSimbolos) {
    		this.tabelaDeSimbolos = tabelaDeSimbolos;
    		this.escopoAtual = tabelaDeSimbolos;
    		this.escoposDonos = new Stack<Expressao>();
    	}
    	
    	public void mostrar(String mensagem) {
    		if (debug) {
    			System.out.println("......... " + mensagem);
    		}
    	}



    // $ANTLR start "topdown"
    // fontes/g/CanecaSemantico.g:89:1: topdown : ( classe | atributo | construtor | destrutor | metodo | declaracao | bloco | imprimir | se | para | repita | enquanto | tente | capture | lance | destruicao | retorno | expressaoAtribuicao | expressaoOu | expressaoE | expressaoIgual | expressaoDiferente | expressaoMaior | expressaoMaiorIgual | expressaoMenor | expressaoMenorIgual | expressaoSoma | expressaoSubtracao | expressaoMultiplicacao | expressaoDivisao | expressaoRestoDaDivisao | expressaoNegativacao | expressaoNegacao | expressaoPrimaria | comando | referencia | referenciaDeMetodo | instanciacao | chamada | chamadaDeMetodo );
    public final void topdown() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:90:2: ( classe | atributo | construtor | destrutor | metodo | declaracao | bloco | imprimir | se | para | repita | enquanto | tente | capture | lance | destruicao | retorno | expressaoAtribuicao | expressaoOu | expressaoE | expressaoIgual | expressaoDiferente | expressaoMaior | expressaoMaiorIgual | expressaoMenor | expressaoMenorIgual | expressaoSoma | expressaoSubtracao | expressaoMultiplicacao | expressaoDivisao | expressaoRestoDaDivisao | expressaoNegativacao | expressaoNegacao | expressaoPrimaria | comando | referencia | referenciaDeMetodo | instanciacao | chamada | chamadaDeMetodo )
            int alt1=40;
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
            case IMPRIMIR:
                {
                alt1=8;
                }
                break;
            case SE_:
                {
                alt1=9;
                }
                break;
            case PARA_:
                {
                alt1=10;
                }
                break;
            case REPITA_:
                {
                alt1=11;
                }
                break;
            case ENQUANTO_:
                {
                alt1=12;
                }
                break;
            case TENTE_:
                {
                alt1=13;
                }
                break;
            case CAPTURE_:
                {
                alt1=14;
                }
                break;
            case LANCE_:
                {
                alt1=15;
                }
                break;
            case DESTRUICAO_:
                {
                alt1=16;
                }
                break;
            case RETORNO_:
                {
                alt1=17;
                }
                break;
            case ATRIBUIDOR:
                {
                alt1=18;
                }
                break;
            case OU:
                {
                alt1=19;
                }
                break;
            case E:
                {
                alt1=20;
                }
                break;
            case IGUAL:
                {
                alt1=21;
                }
                break;
            case DIFERENTE:
                {
                alt1=22;
                }
                break;
            case MAIOR:
                {
                alt1=23;
                }
                break;
            case MAIOR_IGUAL:
                {
                alt1=24;
                }
                break;
            case MENOR:
                {
                alt1=25;
                }
                break;
            case MENOR_IGUAL:
                {
                alt1=26;
                }
                break;
            case SOMA:
                {
                alt1=27;
                }
                break;
            case SUBTRACAO:
                {
                alt1=28;
                }
                break;
            case MULTIPLICACAO:
                {
                alt1=29;
                }
                break;
            case DIVISAO:
                {
                alt1=30;
                }
                break;
            case RESTO_DA_DIVISAO:
                {
                alt1=31;
                }
                break;
            case NEGATIVACAO_:
                {
                alt1=32;
                }
                break;
            case NEGACAO:
                {
                alt1=33;
                }
                break;
            case CONSTANTE_INTEIRA:
            case CONSTANTE_REAL:
            case LITERAL_CARACTERE:
            case LITERAL_TEXTO:
            case VALOR_BOOLEANO:
            case VALOR_NULO:
                {
                alt1=34;
                }
                break;
            case COMANDO_:
                {
                alt1=35;
                }
                break;
            case REFERENCIA_:
                {
                int LA1_36 = input.LA(2);

                if ( (LA1_36==DOWN) ) {
                    int LA1_39 = input.LA(3);

                    if ( ((LA1_39 >= ESSA && LA1_39 <= ESSE)) ) {
                        alt1=36;
                    }
                    else if ( (LA1_39==IDENTIFICADOR) ) {
                        int LA1_42 = input.LA(4);

                        if ( (LA1_42==UP) ) {
                            alt1=36;
                        }
                        else if ( ((LA1_42 >= ATRIBUIDOR && LA1_42 <= UNIDADE_)) ) {
                            alt1=37;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 42, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 39, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 36, input);

                    throw nvae;

                }
                }
                break;
            case INSTANCIACAO_:
                {
                alt1=38;
                }
                break;
            case CHAMADA_DE_CLASSE:
            case CHAMADA_DE_OBJETO:
                {
                int LA1_38 = input.LA(2);

                if ( (LA1_38==DOWN) ) {
                    int LA1_40 = input.LA(3);

                    if ( (LA1_40==IDENTIFICADOR) ) {
                        int LA1_43 = input.LA(4);

                        if ( (LA1_43==UP) ) {
                            alt1=39;
                        }
                        else if ( ((LA1_43 >= ATRIBUIDOR && LA1_43 <= UNIDADE_)) ) {
                            alt1=40;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 43, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 40, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 38, input);

                    throw nvae;

                }
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
                    // fontes/g/CanecaSemantico.g:90:4: classe
                    {
                    pushFollow(FOLLOW_classe_in_topdown60);
                    classe();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:91:4: atributo
                    {
                    pushFollow(FOLLOW_atributo_in_topdown65);
                    atributo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemantico.g:92:4: construtor
                    {
                    pushFollow(FOLLOW_construtor_in_topdown70);
                    construtor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSemantico.g:93:4: destrutor
                    {
                    pushFollow(FOLLOW_destrutor_in_topdown75);
                    destrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSemantico.g:94:4: metodo
                    {
                    pushFollow(FOLLOW_metodo_in_topdown80);
                    metodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // fontes/g/CanecaSemantico.g:95:4: declaracao
                    {
                    pushFollow(FOLLOW_declaracao_in_topdown85);
                    declaracao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // fontes/g/CanecaSemantico.g:96:4: bloco
                    {
                    pushFollow(FOLLOW_bloco_in_topdown90);
                    bloco();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // fontes/g/CanecaSemantico.g:97:4: imprimir
                    {
                    pushFollow(FOLLOW_imprimir_in_topdown95);
                    imprimir();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // fontes/g/CanecaSemantico.g:98:4: se
                    {
                    pushFollow(FOLLOW_se_in_topdown100);
                    se();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // fontes/g/CanecaSemantico.g:99:4: para
                    {
                    pushFollow(FOLLOW_para_in_topdown105);
                    para();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // fontes/g/CanecaSemantico.g:100:4: repita
                    {
                    pushFollow(FOLLOW_repita_in_topdown110);
                    repita();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // fontes/g/CanecaSemantico.g:101:4: enquanto
                    {
                    pushFollow(FOLLOW_enquanto_in_topdown115);
                    enquanto();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // fontes/g/CanecaSemantico.g:102:4: tente
                    {
                    pushFollow(FOLLOW_tente_in_topdown120);
                    tente();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // fontes/g/CanecaSemantico.g:103:4: capture
                    {
                    pushFollow(FOLLOW_capture_in_topdown125);
                    capture();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 15 :
                    // fontes/g/CanecaSemantico.g:104:4: lance
                    {
                    pushFollow(FOLLOW_lance_in_topdown130);
                    lance();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 16 :
                    // fontes/g/CanecaSemantico.g:105:4: destruicao
                    {
                    pushFollow(FOLLOW_destruicao_in_topdown135);
                    destruicao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 17 :
                    // fontes/g/CanecaSemantico.g:106:4: retorno
                    {
                    pushFollow(FOLLOW_retorno_in_topdown140);
                    retorno();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 18 :
                    // fontes/g/CanecaSemantico.g:107:4: expressaoAtribuicao
                    {
                    pushFollow(FOLLOW_expressaoAtribuicao_in_topdown145);
                    expressaoAtribuicao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 19 :
                    // fontes/g/CanecaSemantico.g:108:4: expressaoOu
                    {
                    pushFollow(FOLLOW_expressaoOu_in_topdown150);
                    expressaoOu();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 20 :
                    // fontes/g/CanecaSemantico.g:109:4: expressaoE
                    {
                    pushFollow(FOLLOW_expressaoE_in_topdown155);
                    expressaoE();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 21 :
                    // fontes/g/CanecaSemantico.g:110:4: expressaoIgual
                    {
                    pushFollow(FOLLOW_expressaoIgual_in_topdown160);
                    expressaoIgual();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 22 :
                    // fontes/g/CanecaSemantico.g:111:4: expressaoDiferente
                    {
                    pushFollow(FOLLOW_expressaoDiferente_in_topdown165);
                    expressaoDiferente();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 23 :
                    // fontes/g/CanecaSemantico.g:112:4: expressaoMaior
                    {
                    pushFollow(FOLLOW_expressaoMaior_in_topdown170);
                    expressaoMaior();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 24 :
                    // fontes/g/CanecaSemantico.g:113:4: expressaoMaiorIgual
                    {
                    pushFollow(FOLLOW_expressaoMaiorIgual_in_topdown175);
                    expressaoMaiorIgual();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 25 :
                    // fontes/g/CanecaSemantico.g:114:4: expressaoMenor
                    {
                    pushFollow(FOLLOW_expressaoMenor_in_topdown180);
                    expressaoMenor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 26 :
                    // fontes/g/CanecaSemantico.g:115:4: expressaoMenorIgual
                    {
                    pushFollow(FOLLOW_expressaoMenorIgual_in_topdown185);
                    expressaoMenorIgual();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 27 :
                    // fontes/g/CanecaSemantico.g:116:4: expressaoSoma
                    {
                    pushFollow(FOLLOW_expressaoSoma_in_topdown190);
                    expressaoSoma();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 28 :
                    // fontes/g/CanecaSemantico.g:117:4: expressaoSubtracao
                    {
                    pushFollow(FOLLOW_expressaoSubtracao_in_topdown195);
                    expressaoSubtracao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 29 :
                    // fontes/g/CanecaSemantico.g:118:4: expressaoMultiplicacao
                    {
                    pushFollow(FOLLOW_expressaoMultiplicacao_in_topdown200);
                    expressaoMultiplicacao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 30 :
                    // fontes/g/CanecaSemantico.g:119:4: expressaoDivisao
                    {
                    pushFollow(FOLLOW_expressaoDivisao_in_topdown205);
                    expressaoDivisao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 31 :
                    // fontes/g/CanecaSemantico.g:120:4: expressaoRestoDaDivisao
                    {
                    pushFollow(FOLLOW_expressaoRestoDaDivisao_in_topdown210);
                    expressaoRestoDaDivisao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 32 :
                    // fontes/g/CanecaSemantico.g:121:4: expressaoNegativacao
                    {
                    pushFollow(FOLLOW_expressaoNegativacao_in_topdown215);
                    expressaoNegativacao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 33 :
                    // fontes/g/CanecaSemantico.g:122:4: expressaoNegacao
                    {
                    pushFollow(FOLLOW_expressaoNegacao_in_topdown220);
                    expressaoNegacao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 34 :
                    // fontes/g/CanecaSemantico.g:123:4: expressaoPrimaria
                    {
                    pushFollow(FOLLOW_expressaoPrimaria_in_topdown225);
                    expressaoPrimaria();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 35 :
                    // fontes/g/CanecaSemantico.g:124:4: comando
                    {
                    pushFollow(FOLLOW_comando_in_topdown230);
                    comando();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 36 :
                    // fontes/g/CanecaSemantico.g:125:4: referencia
                    {
                    pushFollow(FOLLOW_referencia_in_topdown235);
                    referencia();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 37 :
                    // fontes/g/CanecaSemantico.g:126:4: referenciaDeMetodo
                    {
                    pushFollow(FOLLOW_referenciaDeMetodo_in_topdown240);
                    referenciaDeMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 38 :
                    // fontes/g/CanecaSemantico.g:127:4: instanciacao
                    {
                    pushFollow(FOLLOW_instanciacao_in_topdown245);
                    instanciacao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 39 :
                    // fontes/g/CanecaSemantico.g:128:4: chamada
                    {
                    pushFollow(FOLLOW_chamada_in_topdown250);
                    chamada();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 40 :
                    // fontes/g/CanecaSemantico.g:129:4: chamadaDeMetodo
                    {
                    pushFollow(FOLLOW_chamadaDeMetodo_in_topdown255);
                    chamadaDeMetodo();

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
    // fontes/g/CanecaSemantico.g:132:1: bottomup : ( terminaClasse | terminarConstrutor | terminarDestrutor | terminarMetodo | terminarBloco | terminarSe | terminarPara | terminarRepita | terminarEnquanto | terminarTente | terminarCapture | terminarLance | terminarDestruicao | terminarRetorno | terminarExpressaoAtribuicao | terminarExpressaoOu | terminarExpressaoE | terminarExpressaoIgual | terminarExpressaoDiferente | terminarExpressaoMaior | terminarExpressaoMaiorIgual | terminarExpressaoMenor | terminarExpressaoMenorIgual | terminarExpressaoSoma | terminarExpressaoSubtracao | terminarExpressaoMultiplicacao | terminarExpressaoDivisao | terminarExpressaoRestoDaDivisao | terminarExpressaoNegativacao | terminarExpressaoNegacao | terminarComando | terminarReferenciaDeMetodo | terminarInstanciacao | terminarChamadaDeMetodo );
    public final void bottomup() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:133:2: ( terminaClasse | terminarConstrutor | terminarDestrutor | terminarMetodo | terminarBloco | terminarSe | terminarPara | terminarRepita | terminarEnquanto | terminarTente | terminarCapture | terminarLance | terminarDestruicao | terminarRetorno | terminarExpressaoAtribuicao | terminarExpressaoOu | terminarExpressaoE | terminarExpressaoIgual | terminarExpressaoDiferente | terminarExpressaoMaior | terminarExpressaoMaiorIgual | terminarExpressaoMenor | terminarExpressaoMenorIgual | terminarExpressaoSoma | terminarExpressaoSubtracao | terminarExpressaoMultiplicacao | terminarExpressaoDivisao | terminarExpressaoRestoDaDivisao | terminarExpressaoNegativacao | terminarExpressaoNegacao | terminarComando | terminarReferenciaDeMetodo | terminarInstanciacao | terminarChamadaDeMetodo )
            int alt2=34;
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
            case DESTRUICAO_:
                {
                alt2=13;
                }
                break;
            case RETORNO_:
                {
                alt2=14;
                }
                break;
            case ATRIBUIDOR:
                {
                alt2=15;
                }
                break;
            case OU:
                {
                alt2=16;
                }
                break;
            case E:
                {
                alt2=17;
                }
                break;
            case IGUAL:
                {
                alt2=18;
                }
                break;
            case DIFERENTE:
                {
                alt2=19;
                }
                break;
            case MAIOR:
                {
                alt2=20;
                }
                break;
            case MAIOR_IGUAL:
                {
                alt2=21;
                }
                break;
            case MENOR:
                {
                alt2=22;
                }
                break;
            case MENOR_IGUAL:
                {
                alt2=23;
                }
                break;
            case SOMA:
                {
                alt2=24;
                }
                break;
            case SUBTRACAO:
                {
                alt2=25;
                }
                break;
            case MULTIPLICACAO:
                {
                alt2=26;
                }
                break;
            case DIVISAO:
                {
                alt2=27;
                }
                break;
            case RESTO_DA_DIVISAO:
                {
                alt2=28;
                }
                break;
            case NEGATIVACAO_:
                {
                alt2=29;
                }
                break;
            case NEGACAO:
                {
                alt2=30;
                }
                break;
            case COMANDO_:
                {
                alt2=31;
                }
                break;
            case REFERENCIA_:
                {
                alt2=32;
                }
                break;
            case INSTANCIACAO_:
                {
                alt2=33;
                }
                break;
            case CHAMADA_DE_CLASSE:
            case CHAMADA_DE_OBJETO:
                {
                alt2=34;
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
                    // fontes/g/CanecaSemantico.g:133:4: terminaClasse
                    {
                    pushFollow(FOLLOW_terminaClasse_in_bottomup266);
                    terminaClasse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:134:4: terminarConstrutor
                    {
                    pushFollow(FOLLOW_terminarConstrutor_in_bottomup271);
                    terminarConstrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemantico.g:135:4: terminarDestrutor
                    {
                    pushFollow(FOLLOW_terminarDestrutor_in_bottomup276);
                    terminarDestrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSemantico.g:136:4: terminarMetodo
                    {
                    pushFollow(FOLLOW_terminarMetodo_in_bottomup281);
                    terminarMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSemantico.g:137:4: terminarBloco
                    {
                    pushFollow(FOLLOW_terminarBloco_in_bottomup286);
                    terminarBloco();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // fontes/g/CanecaSemantico.g:138:4: terminarSe
                    {
                    pushFollow(FOLLOW_terminarSe_in_bottomup291);
                    terminarSe();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // fontes/g/CanecaSemantico.g:139:4: terminarPara
                    {
                    pushFollow(FOLLOW_terminarPara_in_bottomup296);
                    terminarPara();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // fontes/g/CanecaSemantico.g:140:4: terminarRepita
                    {
                    pushFollow(FOLLOW_terminarRepita_in_bottomup301);
                    terminarRepita();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // fontes/g/CanecaSemantico.g:141:4: terminarEnquanto
                    {
                    pushFollow(FOLLOW_terminarEnquanto_in_bottomup306);
                    terminarEnquanto();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // fontes/g/CanecaSemantico.g:142:4: terminarTente
                    {
                    pushFollow(FOLLOW_terminarTente_in_bottomup311);
                    terminarTente();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // fontes/g/CanecaSemantico.g:143:4: terminarCapture
                    {
                    pushFollow(FOLLOW_terminarCapture_in_bottomup316);
                    terminarCapture();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // fontes/g/CanecaSemantico.g:144:4: terminarLance
                    {
                    pushFollow(FOLLOW_terminarLance_in_bottomup321);
                    terminarLance();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // fontes/g/CanecaSemantico.g:145:4: terminarDestruicao
                    {
                    pushFollow(FOLLOW_terminarDestruicao_in_bottomup326);
                    terminarDestruicao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // fontes/g/CanecaSemantico.g:146:4: terminarRetorno
                    {
                    pushFollow(FOLLOW_terminarRetorno_in_bottomup331);
                    terminarRetorno();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 15 :
                    // fontes/g/CanecaSemantico.g:147:4: terminarExpressaoAtribuicao
                    {
                    pushFollow(FOLLOW_terminarExpressaoAtribuicao_in_bottomup336);
                    terminarExpressaoAtribuicao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 16 :
                    // fontes/g/CanecaSemantico.g:148:4: terminarExpressaoOu
                    {
                    pushFollow(FOLLOW_terminarExpressaoOu_in_bottomup341);
                    terminarExpressaoOu();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 17 :
                    // fontes/g/CanecaSemantico.g:149:4: terminarExpressaoE
                    {
                    pushFollow(FOLLOW_terminarExpressaoE_in_bottomup346);
                    terminarExpressaoE();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 18 :
                    // fontes/g/CanecaSemantico.g:150:4: terminarExpressaoIgual
                    {
                    pushFollow(FOLLOW_terminarExpressaoIgual_in_bottomup351);
                    terminarExpressaoIgual();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 19 :
                    // fontes/g/CanecaSemantico.g:151:4: terminarExpressaoDiferente
                    {
                    pushFollow(FOLLOW_terminarExpressaoDiferente_in_bottomup356);
                    terminarExpressaoDiferente();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 20 :
                    // fontes/g/CanecaSemantico.g:152:4: terminarExpressaoMaior
                    {
                    pushFollow(FOLLOW_terminarExpressaoMaior_in_bottomup361);
                    terminarExpressaoMaior();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 21 :
                    // fontes/g/CanecaSemantico.g:153:4: terminarExpressaoMaiorIgual
                    {
                    pushFollow(FOLLOW_terminarExpressaoMaiorIgual_in_bottomup366);
                    terminarExpressaoMaiorIgual();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 22 :
                    // fontes/g/CanecaSemantico.g:154:4: terminarExpressaoMenor
                    {
                    pushFollow(FOLLOW_terminarExpressaoMenor_in_bottomup371);
                    terminarExpressaoMenor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 23 :
                    // fontes/g/CanecaSemantico.g:155:4: terminarExpressaoMenorIgual
                    {
                    pushFollow(FOLLOW_terminarExpressaoMenorIgual_in_bottomup376);
                    terminarExpressaoMenorIgual();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 24 :
                    // fontes/g/CanecaSemantico.g:156:4: terminarExpressaoSoma
                    {
                    pushFollow(FOLLOW_terminarExpressaoSoma_in_bottomup381);
                    terminarExpressaoSoma();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 25 :
                    // fontes/g/CanecaSemantico.g:157:4: terminarExpressaoSubtracao
                    {
                    pushFollow(FOLLOW_terminarExpressaoSubtracao_in_bottomup386);
                    terminarExpressaoSubtracao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 26 :
                    // fontes/g/CanecaSemantico.g:158:4: terminarExpressaoMultiplicacao
                    {
                    pushFollow(FOLLOW_terminarExpressaoMultiplicacao_in_bottomup391);
                    terminarExpressaoMultiplicacao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 27 :
                    // fontes/g/CanecaSemantico.g:159:4: terminarExpressaoDivisao
                    {
                    pushFollow(FOLLOW_terminarExpressaoDivisao_in_bottomup396);
                    terminarExpressaoDivisao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 28 :
                    // fontes/g/CanecaSemantico.g:160:4: terminarExpressaoRestoDaDivisao
                    {
                    pushFollow(FOLLOW_terminarExpressaoRestoDaDivisao_in_bottomup401);
                    terminarExpressaoRestoDaDivisao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 29 :
                    // fontes/g/CanecaSemantico.g:161:4: terminarExpressaoNegativacao
                    {
                    pushFollow(FOLLOW_terminarExpressaoNegativacao_in_bottomup406);
                    terminarExpressaoNegativacao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 30 :
                    // fontes/g/CanecaSemantico.g:162:4: terminarExpressaoNegacao
                    {
                    pushFollow(FOLLOW_terminarExpressaoNegacao_in_bottomup411);
                    terminarExpressaoNegacao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 31 :
                    // fontes/g/CanecaSemantico.g:163:4: terminarComando
                    {
                    pushFollow(FOLLOW_terminarComando_in_bottomup416);
                    terminarComando();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 32 :
                    // fontes/g/CanecaSemantico.g:164:4: terminarReferenciaDeMetodo
                    {
                    pushFollow(FOLLOW_terminarReferenciaDeMetodo_in_bottomup421);
                    terminarReferenciaDeMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 33 :
                    // fontes/g/CanecaSemantico.g:165:4: terminarInstanciacao
                    {
                    pushFollow(FOLLOW_terminarInstanciacao_in_bottomup426);
                    terminarInstanciacao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 34 :
                    // fontes/g/CanecaSemantico.g:166:4: terminarChamadaDeMetodo
                    {
                    pushFollow(FOLLOW_terminarChamadaDeMetodo_in_bottomup431);
                    terminarChamadaDeMetodo();

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
    // fontes/g/CanecaSemantico.g:169:1: programa : ^( PROGRAMA_ ( unicadeDeCompilacao )+ ) ;
    public final void programa() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:170:2: ( ^( PROGRAMA_ ( unicadeDeCompilacao )+ ) )
            // fontes/g/CanecaSemantico.g:170:4: ^( PROGRAMA_ ( unicadeDeCompilacao )+ )
            {
            match(input,PROGRAMA_,FOLLOW_PROGRAMA__in_programa443); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // fontes/g/CanecaSemantico.g:170:16: ( unicadeDeCompilacao )+
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
            	    // fontes/g/CanecaSemantico.g:170:17: unicadeDeCompilacao
            	    {
            	    pushFollow(FOLLOW_unicadeDeCompilacao_in_programa446);
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
    // fontes/g/CanecaSemantico.g:173:1: unicadeDeCompilacao : ( ^( UNIDADE_ cabecalho classe ) | ^( UNIDADE_ cabecalho interfaces ) );
    public final void unicadeDeCompilacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:174:2: ( ^( UNIDADE_ cabecalho classe ) | ^( UNIDADE_ cabecalho interfaces ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:174:4: ^( UNIDADE_ cabecalho classe )
                    {
                    match(input,UNIDADE_,FOLLOW_UNIDADE__in_unicadeDeCompilacao461); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_cabecalho_in_unicadeDeCompilacao463);
                    cabecalho();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_classe_in_unicadeDeCompilacao465);
                    classe();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:175:4: ^( UNIDADE_ cabecalho interfaces )
                    {
                    match(input,UNIDADE_,FOLLOW_UNIDADE__in_unicadeDeCompilacao472); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_cabecalho_in_unicadeDeCompilacao474);
                    cabecalho();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_interfaces_in_unicadeDeCompilacao476);
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
    // fontes/g/CanecaSemantico.g:178:1: cabecalho : ^( CABECALHO_ pacote importacoes ) ;
    public final void cabecalho() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:179:2: ( ^( CABECALHO_ pacote importacoes ) )
            // fontes/g/CanecaSemantico.g:179:4: ^( CABECALHO_ pacote importacoes )
            {
            match(input,CABECALHO_,FOLLOW_CABECALHO__in_cabecalho489); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_pacote_in_cabecalho491);
            pacote();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_importacoes_in_cabecalho493);
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
    // fontes/g/CanecaSemantico.g:182:1: pacote : ^( PACOTE_ IDENTIFICADOR_DE_PACOTE ) ;
    public final void pacote() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:183:2: ( ^( PACOTE_ IDENTIFICADOR_DE_PACOTE ) )
            // fontes/g/CanecaSemantico.g:183:4: ^( PACOTE_ IDENTIFICADOR_DE_PACOTE )
            {
            match(input,PACOTE_,FOLLOW_PACOTE__in_pacote506); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,IDENTIFICADOR_DE_PACOTE,FOLLOW_IDENTIFICADOR_DE_PACOTE_in_pacote508); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:186:1: importacoes : ^( IMPORTACOES_ ( importacao )* ) ;
    public final void importacoes() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:187:2: ( ^( IMPORTACOES_ ( importacao )* ) )
            // fontes/g/CanecaSemantico.g:187:4: ^( IMPORTACOES_ ( importacao )* )
            {
            match(input,IMPORTACOES_,FOLLOW_IMPORTACOES__in_importacoes521); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:187:19: ( importacao )*
                loop5:
                do {
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==IMPORTACAO_) ) {
                        alt5=1;
                    }


                    switch (alt5) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:187:20: importacao
                	    {
                	    pushFollow(FOLLOW_importacao_in_importacoes524);
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
    // fontes/g/CanecaSemantico.g:190:1: importacao : ( ^( IMPORTACAO_ IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( IDENTIFICADOR )? ) | ^( IMPORTACAO_ IDENTIFICADOR_DE_PACOTE ) );
    public final void importacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:191:2: ( ^( IMPORTACAO_ IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( IDENTIFICADOR )? ) | ^( IMPORTACAO_ IDENTIFICADOR_DE_PACOTE ) )
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
                    // fontes/g/CanecaSemantico.g:191:4: ^( IMPORTACAO_ IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( IDENTIFICADOR )? )
                    {
                    match(input,IMPORTACAO_,FOLLOW_IMPORTACAO__in_importacao539); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_importacao541); if (state.failed) return ;

                    match(input,IDENTIFICADOR_DE_PACOTE,FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao543); if (state.failed) return ;

                    // fontes/g/CanecaSemantico.g:191:56: ( IDENTIFICADOR )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==IDENTIFICADOR) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // fontes/g/CanecaSemantico.g:191:57: IDENTIFICADOR
                            {
                            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_importacao546); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:192:4: ^( IMPORTACAO_ IDENTIFICADOR_DE_PACOTE )
                    {
                    match(input,IMPORTACAO_,FOLLOW_IMPORTACAO__in_importacao555); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,IDENTIFICADOR_DE_PACOTE,FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao557); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:195:1: classe : ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . ) ;
    public final void classe() throws RecognitionException {
        CommonTree IDENTIFICADOR1=null;

        try {
            // fontes/g/CanecaSemantico.g:196:2: ( ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . ) )
            // fontes/g/CanecaSemantico.g:196:4: ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . )
            {
            match(input,CLASSE_,FOLLOW_CLASSE__in_classe570); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoFeminino_in_classe572);
            modificadorDeAcessoFeminino();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR1=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_classe574); if (state.failed) return ;

            pushFollow(FOLLOW_listaDeTiposGenericos_in_classe576);
            listaDeTiposGenericos();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_listaDeInterfaces_in_classe578);
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
    // fontes/g/CanecaSemantico.g:205:1: terminaClasse : ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . ) ;
    public final void terminaClasse() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:206:2: ( ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . ) )
            // fontes/g/CanecaSemantico.g:206:4: ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . )
            {
            match(input,CLASSE_,FOLLOW_CLASSE__in_terminaClasse597); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoFeminino_in_terminaClasse599);
            modificadorDeAcessoFeminino();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_terminaClasse601); if (state.failed) return ;

            pushFollow(FOLLOW_listaDeTiposGenericos_in_terminaClasse603);
            listaDeTiposGenericos();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_listaDeInterfaces_in_terminaClasse605);
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
    // fontes/g/CanecaSemantico.g:213:1: interfaces : ^( INTERFACE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface ) ;
    public final void interfaces() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:214:2: ( ^( INTERFACE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface ) )
            // fontes/g/CanecaSemantico.g:214:4: ^( INTERFACE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface )
            {
            match(input,INTERFACE_,FOLLOW_INTERFACE__in_interfaces624); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoFeminino_in_interfaces626);
            modificadorDeAcessoFeminino();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_interfaces628); if (state.failed) return ;

            pushFollow(FOLLOW_listaDeTiposGenericos_in_interfaces630);
            listaDeTiposGenericos();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_listaDeInterfaces_in_interfaces632);
            listaDeInterfaces();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_corpoDaInterface_in_interfaces634);
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
    // fontes/g/CanecaSemantico.g:217:1: corpoDaClasse : ^( CORPO_ atributos construtores destrutor metodos ) ;
    public final void corpoDaClasse() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:218:2: ( ^( CORPO_ atributos construtores destrutor metodos ) )
            // fontes/g/CanecaSemantico.g:218:4: ^( CORPO_ atributos construtores destrutor metodos )
            {
            match(input,CORPO_,FOLLOW_CORPO__in_corpoDaClasse647); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_atributos_in_corpoDaClasse649);
            atributos();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_construtores_in_corpoDaClasse651);
            construtores();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_destrutor_in_corpoDaClasse653);
            destrutor();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_metodos_in_corpoDaClasse655);
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
    // fontes/g/CanecaSemantico.g:221:1: corpoDaInterface : ^( CORPO_ atributos assinaturasDeMetodos ) ;
    public final void corpoDaInterface() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:222:2: ( ^( CORPO_ atributos assinaturasDeMetodos ) )
            // fontes/g/CanecaSemantico.g:222:4: ^( CORPO_ atributos assinaturasDeMetodos )
            {
            match(input,CORPO_,FOLLOW_CORPO__in_corpoDaInterface668); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_atributos_in_corpoDaInterface670);
            atributos();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_assinaturasDeMetodos_in_corpoDaInterface672);
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
    // fontes/g/CanecaSemantico.g:225:1: atributos : ^( ATRIBUTOS_ ( atributo )* ) ;
    public final void atributos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:226:2: ( ^( ATRIBUTOS_ ( atributo )* ) )
            // fontes/g/CanecaSemantico.g:226:4: ^( ATRIBUTOS_ ( atributo )* )
            {
            match(input,ATRIBUTOS_,FOLLOW_ATRIBUTOS__in_atributos685); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:226:17: ( atributo )*
                loop8:
                do {
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==ATRIBUTO_) ) {
                        alt8=1;
                    }


                    switch (alt8) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:226:18: atributo
                	    {
                	    pushFollow(FOLLOW_atributo_in_atributos688);
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
    // fontes/g/CanecaSemantico.g:229:1: construtores : ^( CONSTRUTORES_ ( construtor )+ ) ;
    public final void construtores() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:230:2: ( ^( CONSTRUTORES_ ( construtor )+ ) )
            // fontes/g/CanecaSemantico.g:230:4: ^( CONSTRUTORES_ ( construtor )+ )
            {
            match(input,CONSTRUTORES_,FOLLOW_CONSTRUTORES__in_construtores703); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // fontes/g/CanecaSemantico.g:230:20: ( construtor )+
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
            	    // fontes/g/CanecaSemantico.g:230:21: construtor
            	    {
            	    pushFollow(FOLLOW_construtor_in_construtores706);
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
    // fontes/g/CanecaSemantico.g:233:1: metodos : ^( METODOS_ ( metodo )* ) ;
    public final void metodos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:234:2: ( ^( METODOS_ ( metodo )* ) )
            // fontes/g/CanecaSemantico.g:234:4: ^( METODOS_ ( metodo )* )
            {
            match(input,METODOS_,FOLLOW_METODOS__in_metodos721); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:234:15: ( metodo )*
                loop10:
                do {
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==METODO_) ) {
                        alt10=1;
                    }


                    switch (alt10) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:234:16: metodo
                	    {
                	    pushFollow(FOLLOW_metodo_in_metodos724);
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
    // fontes/g/CanecaSemantico.g:237:1: assinaturasDeMetodos : ^( ASSINATURAS_DE_METODOS_ ( ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) )* ) ;
    public final void assinaturasDeMetodos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:238:2: ( ^( ASSINATURAS_DE_METODOS_ ( ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) )* ) )
            // fontes/g/CanecaSemantico.g:238:4: ^( ASSINATURAS_DE_METODOS_ ( ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) )* )
            {
            match(input,ASSINATURAS_DE_METODOS_,FOLLOW_ASSINATURAS_DE_METODOS__in_assinaturasDeMetodos739); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:238:30: ( ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) )*
                loop12:
                do {
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==ASSINATURA_) ) {
                        alt12=1;
                    }


                    switch (alt12) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:238:31: ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . )
                	    {
                	    match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_assinaturasDeMetodos743); if (state.failed) return ;

                	    match(input, Token.DOWN, null); if (state.failed) return ;
                	    pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_assinaturasDeMetodos745);
                	    modificadorDeAcessoMasculino();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    // fontes/g/CanecaSemantico.g:238:74: ( ESTATICO )?
                	    int alt11=2;
                	    int LA11_0 = input.LA(1);

                	    if ( (LA11_0==ESTATICO) ) {
                	        alt11=1;
                	    }
                	    switch (alt11) {
                	        case 1 :
                	            // fontes/g/CanecaSemantico.g:238:75: ESTATICO
                	            {
                	            match(input,ESTATICO,FOLLOW_ESTATICO_in_assinaturasDeMetodos748); if (state.failed) return ;

                	            }
                	            break;

                	    }


                	    pushFollow(FOLLOW_tipo_in_assinaturasDeMetodos752);
                	    tipo();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_assinaturasDeMetodos754); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:241:1: atributo : ^( ATRIBUTO_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR ( . )? ) ;
    public final void atributo() throws RecognitionException {
        CommonTree IDENTIFICADOR3=null;
        Tipo tipo2 =null;


        try {
            // fontes/g/CanecaSemantico.g:242:2: ( ^( ATRIBUTO_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR ( . )? ) )
            // fontes/g/CanecaSemantico.g:242:4: ^( ATRIBUTO_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR ( . )? )
            {
            match(input,ATRIBUTO_,FOLLOW_ATRIBUTO__in_atributo772); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_atributo774);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:242:45: ( ESTATICO )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ESTATICO) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:242:46: ESTATICO
                    {
                    match(input,ESTATICO,FOLLOW_ESTATICO_in_atributo777); if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_atributo781);
            tipo2=tipo();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR3=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_atributo783); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:242:76: ( . )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0 >= ATRIBUIDOR && LA14_0 <= UNIDADE_)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:242:77: .
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
    // fontes/g/CanecaSemantico.g:250:1: construtor : ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) ;
    public final void construtor() throws RecognitionException {
        CommonTree IDENTIFICADOR4=null;

        try {
            // fontes/g/CanecaSemantico.g:251:2: ( ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemantico.g:251:4: ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . )
            {
            match(input,CONSTRUTOR_,FOLLOW_CONSTRUTOR__in_construtor805); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_construtor809); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_construtor811);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR4=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_construtor813); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:260:1: terminarConstrutor : ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) ;
    public final void terminarConstrutor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:261:2: ( ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemantico.g:261:4: ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . )
            {
            match(input,CONSTRUTOR_,FOLLOW_CONSTRUTOR__in_terminarConstrutor835); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_terminarConstrutor839); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_terminarConstrutor841);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_terminarConstrutor843); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:268:1: destrutor : ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) ;
    public final void destrutor() throws RecognitionException {
        CommonTree IDENTIFICADOR5=null;

        try {
            // fontes/g/CanecaSemantico.g:269:2: ( ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemantico.g:269:4: ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . )
            {
            match(input,DESTRUTOR_,FOLLOW_DESTRUTOR__in_destrutor865); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_destrutor868); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_destrutor870);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR5=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_destrutor872); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:278:1: terminarDestrutor : ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) ;
    public final void terminarDestrutor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:279:2: ( ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemantico.g:279:4: ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . )
            {
            match(input,DESTRUTOR_,FOLLOW_DESTRUTOR__in_terminarDestrutor894); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_terminarDestrutor897); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_terminarDestrutor899);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_terminarDestrutor901); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:286:1: metodo : ^( METODO_ ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) . ) ;
    public final void metodo() throws RecognitionException {
        CommonTree IDENTIFICADOR7=null;
        Tipo tipo6 =null;


        try {
            // fontes/g/CanecaSemantico.g:287:2: ( ^( METODO_ ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemantico.g:287:4: ^( METODO_ ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) . )
            {
            match(input,METODO_,FOLLOW_METODO__in_metodo923); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_metodo926); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_metodo928);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:287:57: ( ESTATICO )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ESTATICO) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:287:58: ESTATICO
                    {
                    match(input,ESTATICO,FOLLOW_ESTATICO_in_metodo931); if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_metodo935);
            tipo6=tipo();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR7=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_metodo937); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:296:1: terminarMetodo : ^( METODO_ ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) . ) ;
    public final void terminarMetodo() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:297:2: ( ^( METODO_ ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemantico.g:297:4: ^( METODO_ ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) . )
            {
            match(input,METODO_,FOLLOW_METODO__in_terminarMetodo959); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_terminarMetodo962); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_terminarMetodo964);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:297:57: ( ESTATICO )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ESTATICO) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:297:58: ESTATICO
                    {
                    match(input,ESTATICO,FOLLOW_ESTATICO_in_terminarMetodo967); if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_terminarMetodo971);
            tipo();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_terminarMetodo973); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:304:1: modificadorDeAcessoMasculino : ( PUBLICO | PRIVADO | PROTEGIDO );
    public final void modificadorDeAcessoMasculino() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:305:2: ( PUBLICO | PRIVADO | PROTEGIDO )
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
    // fontes/g/CanecaSemantico.g:310:1: modificadorDeAcessoFeminino : ( PUBLICA | PRIVADA | PROTEGIDA );
    public final void modificadorDeAcessoFeminino() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:311:2: ( PUBLICA | PRIVADA | PROTEGIDA )
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
    // fontes/g/CanecaSemantico.g:316:1: listaDeParametros : ^( PARAMETROS_ ( . )* ) ;
    public final void listaDeParametros() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:317:2: ( ^( PARAMETROS_ ( . )* ) )
            // fontes/g/CanecaSemantico.g:317:4: ^( PARAMETROS_ ( . )* )
            {
            match(input,PARAMETROS_,FOLLOW_PARAMETROS__in_listaDeParametros1037); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:317:18: ( . )*
                loop17:
                do {
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0 >= ATRIBUIDOR && LA17_0 <= UNIDADE_)) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==UP) ) {
                        alt17=2;
                    }


                    switch (alt17) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:317:19: .
                	    {
                	    matchAny(input); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:320:1: listaDeArgumentosVazia : ARGUMENTOS_ ;
    public final void listaDeArgumentosVazia() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:321:2: ( ARGUMENTOS_ )
            // fontes/g/CanecaSemantico.g:321:4: ARGUMENTOS_
            {
            match(input,ARGUMENTOS_,FOLLOW_ARGUMENTOS__in_listaDeArgumentosVazia1054); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:324:1: listaDeArgumentos : ^( ARGUMENTOS_ ( . )* ) ;
    public final void listaDeArgumentos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:325:2: ( ^( ARGUMENTOS_ ( . )* ) )
            // fontes/g/CanecaSemantico.g:325:4: ^( ARGUMENTOS_ ( . )* )
            {
            match(input,ARGUMENTOS_,FOLLOW_ARGUMENTOS__in_listaDeArgumentos1066); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:325:18: ( . )*
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
                	    // fontes/g/CanecaSemantico.g:325:19: .
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
    // fontes/g/CanecaSemantico.g:328:1: listaDeInterfaces : ^( INTERFACES_ ( tipo )* ) ;
    public final void listaDeInterfaces() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:329:2: ( ^( INTERFACES_ ( tipo )* ) )
            // fontes/g/CanecaSemantico.g:329:4: ^( INTERFACES_ ( tipo )* )
            {
            match(input,INTERFACES_,FOLLOW_INTERFACES__in_listaDeInterfaces1084); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:329:18: ( tipo )*
                loop19:
                do {
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==TIPO_) ) {
                        alt19=1;
                    }


                    switch (alt19) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:329:19: tipo
                	    {
                	    pushFollow(FOLLOW_tipo_in_listaDeInterfaces1087);
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
    // fontes/g/CanecaSemantico.g:332:1: listaDeTiposGenericos : ^( TIPOS_GENERICOS_ ( tipoGenerico )* ) ;
    public final void listaDeTiposGenericos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:333:2: ( ^( TIPOS_GENERICOS_ ( tipoGenerico )* ) )
            // fontes/g/CanecaSemantico.g:333:4: ^( TIPOS_GENERICOS_ ( tipoGenerico )* )
            {
            match(input,TIPOS_GENERICOS_,FOLLOW_TIPOS_GENERICOS__in_listaDeTiposGenericos1102); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:333:23: ( tipoGenerico )*
                loop20:
                do {
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==TIPO_GENERICO_) ) {
                        alt20=1;
                    }


                    switch (alt20) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:333:24: tipoGenerico
                	    {
                	    pushFollow(FOLLOW_tipoGenerico_in_listaDeTiposGenericos1105);
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
    // fontes/g/CanecaSemantico.g:336:1: listaDeTipos : ^( TIPOS_ ( tipo )* ) ;
    public final void listaDeTipos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:337:2: ( ^( TIPOS_ ( tipo )* ) )
            // fontes/g/CanecaSemantico.g:337:4: ^( TIPOS_ ( tipo )* )
            {
            match(input,TIPOS_,FOLLOW_TIPOS__in_listaDeTipos1120); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:337:13: ( tipo )*
                loop21:
                do {
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==TIPO_) ) {
                        alt21=1;
                    }


                    switch (alt21) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:337:14: tipo
                	    {
                	    pushFollow(FOLLOW_tipo_in_listaDeTipos1123);
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
    // fontes/g/CanecaSemantico.g:340:1: listaDeCapturas : ^( CAPTURAS_ ( capture )+ ) ;
    public final void listaDeCapturas() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:341:2: ( ^( CAPTURAS_ ( capture )+ ) )
            // fontes/g/CanecaSemantico.g:341:4: ^( CAPTURAS_ ( capture )+ )
            {
            match(input,CAPTURAS_,FOLLOW_CAPTURAS__in_listaDeCapturas1138); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // fontes/g/CanecaSemantico.g:341:16: ( capture )+
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
            	    // fontes/g/CanecaSemantico.g:341:17: capture
            	    {
            	    pushFollow(FOLLOW_capture_in_listaDeCapturas1141);
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
    // fontes/g/CanecaSemantico.g:344:1: tipoGenerico : ^( TIPO_GENERICO_ IDENTIFICADOR listaDeInterfaces ) ;
    public final void tipoGenerico() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:345:2: ( ^( TIPO_GENERICO_ IDENTIFICADOR listaDeInterfaces ) )
            // fontes/g/CanecaSemantico.g:345:4: ^( TIPO_GENERICO_ IDENTIFICADOR listaDeInterfaces )
            {
            match(input,TIPO_GENERICO_,FOLLOW_TIPO_GENERICO__in_tipoGenerico1156); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_tipoGenerico1158); if (state.failed) return ;

            pushFollow(FOLLOW_listaDeInterfaces_in_tipoGenerico1160);
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
    // fontes/g/CanecaSemantico.g:348:1: tipo returns [Tipo tipo] : ^( TIPO_ IDENTIFICADOR listaDeTipos ) ;
    public final Tipo tipo() throws RecognitionException {
        Tipo tipo = null;


        CommonTree IDENTIFICADOR8=null;

        try {
            // fontes/g/CanecaSemantico.g:349:2: ( ^( TIPO_ IDENTIFICADOR listaDeTipos ) )
            // fontes/g/CanecaSemantico.g:349:4: ^( TIPO_ IDENTIFICADOR listaDeTipos )
            {
            match(input,TIPO_,FOLLOW_TIPO__in_tipo1177); if (state.failed) return tipo;

            match(input, Token.DOWN, null); if (state.failed) return tipo;
            IDENTIFICADOR8=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_tipo1179); if (state.failed) return tipo;

            pushFollow(FOLLOW_listaDeTipos_in_tipo1181);
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
    // fontes/g/CanecaSemantico.g:355:1: declaracao : ^( DECLARACAO_ tipo IDENTIFICADOR ) ;
    public final void declaracao() throws RecognitionException {
        CommonTree IDENTIFICADOR10=null;
        Tipo tipo9 =null;


        try {
            // fontes/g/CanecaSemantico.g:356:2: ( ^( DECLARACAO_ tipo IDENTIFICADOR ) )
            // fontes/g/CanecaSemantico.g:356:4: ^( DECLARACAO_ tipo IDENTIFICADOR )
            {
            match(input,DECLARACAO_,FOLLOW_DECLARACAO__in_declaracao1198); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tipo_in_declaracao1200);
            tipo9=tipo();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR10=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_declaracao1202); if (state.failed) return ;

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



    // $ANTLR start "expressaoAtribuicao"
    // fontes/g/CanecaSemantico.g:364:1: expressaoAtribuicao : ^( ATRIBUIDOR . . ) ;
    public final void expressaoAtribuicao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:365:2: ( ^( ATRIBUIDOR . . ) )
            // fontes/g/CanecaSemantico.g:365:4: ^( ATRIBUIDOR . . )
            {
            match(input,ATRIBUIDOR,FOLLOW_ATRIBUIDOR_in_expressaoAtribuicao1219); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("=");
            			ExpressaoAtribuicao expressao = new ExpressaoAtribuicao(escopoAtual);
            			escopoAtual.definirExpressao(expressao);
            			escopoAtual = expressao;
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
    // $ANTLR end "expressaoAtribuicao"



    // $ANTLR start "terminarExpressaoAtribuicao"
    // fontes/g/CanecaSemantico.g:374:1: terminarExpressaoAtribuicao : ^( ATRIBUIDOR . . ) ;
    public final void terminarExpressaoAtribuicao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:375:2: ( ^( ATRIBUIDOR . . ) )
            // fontes/g/CanecaSemantico.g:375:4: ^( ATRIBUIDOR . . )
            {
            match(input,ATRIBUIDOR,FOLLOW_ATRIBUIDOR_in_terminarExpressaoAtribuicao1240); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminar =");
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
    // $ANTLR end "terminarExpressaoAtribuicao"



    // $ANTLR start "expressaoOu"
    // fontes/g/CanecaSemantico.g:382:1: expressaoOu : ^( OU . . ) ;
    public final void expressaoOu() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:383:2: ( ^( OU . . ) )
            // fontes/g/CanecaSemantico.g:383:4: ^( OU . . )
            {
            match(input,OU,FOLLOW_OU_in_expressaoOu1261); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("||");
            			ExpressaoOu expressao = new ExpressaoOu(escopoAtual);
            			escopoAtual.definirExpressao(expressao);
            			escopoAtual = expressao;
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
    // $ANTLR end "expressaoOu"



    // $ANTLR start "terminarExpressaoOu"
    // fontes/g/CanecaSemantico.g:392:1: terminarExpressaoOu : ^( OU . . ) ;
    public final void terminarExpressaoOu() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:393:2: ( ^( OU . . ) )
            // fontes/g/CanecaSemantico.g:393:4: ^( OU . . )
            {
            match(input,OU,FOLLOW_OU_in_terminarExpressaoOu1282); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminar ||");
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
    // $ANTLR end "terminarExpressaoOu"



    // $ANTLR start "expressaoE"
    // fontes/g/CanecaSemantico.g:400:1: expressaoE : ^( E . . ) ;
    public final void expressaoE() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:401:2: ( ^( E . . ) )
            // fontes/g/CanecaSemantico.g:401:4: ^( E . . )
            {
            match(input,E,FOLLOW_E_in_expressaoE1303); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("&&");
            			ExpressaoE expressao = new ExpressaoE(escopoAtual);
            			escopoAtual.definirExpressao(expressao);
            			escopoAtual = expressao;
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
    // $ANTLR end "expressaoE"



    // $ANTLR start "terminarExpressaoE"
    // fontes/g/CanecaSemantico.g:410:1: terminarExpressaoE : ^( E . . ) ;
    public final void terminarExpressaoE() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:411:2: ( ^( E . . ) )
            // fontes/g/CanecaSemantico.g:411:4: ^( E . . )
            {
            match(input,E,FOLLOW_E_in_terminarExpressaoE1324); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminar &&");
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
    // $ANTLR end "terminarExpressaoE"



    // $ANTLR start "expressaoIgual"
    // fontes/g/CanecaSemantico.g:418:1: expressaoIgual : ^( IGUAL . . ) ;
    public final void expressaoIgual() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:419:2: ( ^( IGUAL . . ) )
            // fontes/g/CanecaSemantico.g:419:4: ^( IGUAL . . )
            {
            match(input,IGUAL,FOLLOW_IGUAL_in_expressaoIgual1345); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("==");
            			ExpressaoIgual expressao = new ExpressaoIgual(escopoAtual);
            			escopoAtual.definirExpressao(expressao);
            			escopoAtual = expressao;
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
    // $ANTLR end "expressaoIgual"



    // $ANTLR start "terminarExpressaoIgual"
    // fontes/g/CanecaSemantico.g:428:1: terminarExpressaoIgual : ^( IGUAL . . ) ;
    public final void terminarExpressaoIgual() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:429:2: ( ^( IGUAL . . ) )
            // fontes/g/CanecaSemantico.g:429:4: ^( IGUAL . . )
            {
            match(input,IGUAL,FOLLOW_IGUAL_in_terminarExpressaoIgual1366); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminar ==");
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
    // $ANTLR end "terminarExpressaoIgual"



    // $ANTLR start "expressaoDiferente"
    // fontes/g/CanecaSemantico.g:436:1: expressaoDiferente : ^( DIFERENTE . . ) ;
    public final void expressaoDiferente() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:437:2: ( ^( DIFERENTE . . ) )
            // fontes/g/CanecaSemantico.g:437:4: ^( DIFERENTE . . )
            {
            match(input,DIFERENTE,FOLLOW_DIFERENTE_in_expressaoDiferente1387); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("!=");
            			ExpressaoDiferente expressao = new ExpressaoDiferente(escopoAtual);
            			escopoAtual.definirExpressao(expressao);
            			escopoAtual = expressao;
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
    // $ANTLR end "expressaoDiferente"



    // $ANTLR start "terminarExpressaoDiferente"
    // fontes/g/CanecaSemantico.g:446:1: terminarExpressaoDiferente : ^( DIFERENTE . . ) ;
    public final void terminarExpressaoDiferente() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:447:2: ( ^( DIFERENTE . . ) )
            // fontes/g/CanecaSemantico.g:447:4: ^( DIFERENTE . . )
            {
            match(input,DIFERENTE,FOLLOW_DIFERENTE_in_terminarExpressaoDiferente1408); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminar !=");
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
    // $ANTLR end "terminarExpressaoDiferente"



    // $ANTLR start "expressaoMaior"
    // fontes/g/CanecaSemantico.g:454:1: expressaoMaior : ^( MAIOR . . ) ;
    public final void expressaoMaior() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:455:2: ( ^( MAIOR . . ) )
            // fontes/g/CanecaSemantico.g:455:4: ^( MAIOR . . )
            {
            match(input,MAIOR,FOLLOW_MAIOR_in_expressaoMaior1429); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar(">");
            			ExpressaoMaior expressao = new ExpressaoMaior(escopoAtual);
            			escopoAtual.definirExpressao(expressao);
            			escopoAtual = expressao;
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
    // $ANTLR end "expressaoMaior"



    // $ANTLR start "terminarExpressaoMaior"
    // fontes/g/CanecaSemantico.g:464:1: terminarExpressaoMaior : ^( MAIOR . . ) ;
    public final void terminarExpressaoMaior() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:465:2: ( ^( MAIOR . . ) )
            // fontes/g/CanecaSemantico.g:465:4: ^( MAIOR . . )
            {
            match(input,MAIOR,FOLLOW_MAIOR_in_terminarExpressaoMaior1450); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminar >");
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
    // $ANTLR end "terminarExpressaoMaior"



    // $ANTLR start "expressaoMaiorIgual"
    // fontes/g/CanecaSemantico.g:472:1: expressaoMaiorIgual : ^( MAIOR_IGUAL . . ) ;
    public final void expressaoMaiorIgual() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:473:2: ( ^( MAIOR_IGUAL . . ) )
            // fontes/g/CanecaSemantico.g:473:4: ^( MAIOR_IGUAL . . )
            {
            match(input,MAIOR_IGUAL,FOLLOW_MAIOR_IGUAL_in_expressaoMaiorIgual1471); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar(">=");
            			ExpressaoMaiorIgual expressao = new ExpressaoMaiorIgual(escopoAtual);
            			escopoAtual.definirExpressao(expressao);
            			escopoAtual = expressao;
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
    // $ANTLR end "expressaoMaiorIgual"



    // $ANTLR start "terminarExpressaoMaiorIgual"
    // fontes/g/CanecaSemantico.g:482:1: terminarExpressaoMaiorIgual : ^( MAIOR_IGUAL . . ) ;
    public final void terminarExpressaoMaiorIgual() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:483:2: ( ^( MAIOR_IGUAL . . ) )
            // fontes/g/CanecaSemantico.g:483:4: ^( MAIOR_IGUAL . . )
            {
            match(input,MAIOR_IGUAL,FOLLOW_MAIOR_IGUAL_in_terminarExpressaoMaiorIgual1492); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminar >=");
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
    // $ANTLR end "terminarExpressaoMaiorIgual"



    // $ANTLR start "expressaoMenor"
    // fontes/g/CanecaSemantico.g:490:1: expressaoMenor : ^( MENOR . . ) ;
    public final void expressaoMenor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:491:2: ( ^( MENOR . . ) )
            // fontes/g/CanecaSemantico.g:491:4: ^( MENOR . . )
            {
            match(input,MENOR,FOLLOW_MENOR_in_expressaoMenor1513); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("<");
            			ExpressaoMenor expressao = new ExpressaoMenor(escopoAtual);
            			escopoAtual.definirExpressao(expressao);
            			escopoAtual = expressao;
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
    // $ANTLR end "expressaoMenor"



    // $ANTLR start "terminarExpressaoMenor"
    // fontes/g/CanecaSemantico.g:500:1: terminarExpressaoMenor : ^( MENOR . . ) ;
    public final void terminarExpressaoMenor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:501:2: ( ^( MENOR . . ) )
            // fontes/g/CanecaSemantico.g:501:4: ^( MENOR . . )
            {
            match(input,MENOR,FOLLOW_MENOR_in_terminarExpressaoMenor1534); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminar <");
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
    // $ANTLR end "terminarExpressaoMenor"



    // $ANTLR start "expressaoMenorIgual"
    // fontes/g/CanecaSemantico.g:508:1: expressaoMenorIgual : ^( MENOR_IGUAL . . ) ;
    public final void expressaoMenorIgual() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:509:2: ( ^( MENOR_IGUAL . . ) )
            // fontes/g/CanecaSemantico.g:509:4: ^( MENOR_IGUAL . . )
            {
            match(input,MENOR_IGUAL,FOLLOW_MENOR_IGUAL_in_expressaoMenorIgual1555); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("<=");
            			ExpressaoMenorIgual expressao = new ExpressaoMenorIgual(escopoAtual);
            			escopoAtual.definirExpressao(expressao);
            			escopoAtual = expressao;
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
    // $ANTLR end "expressaoMenorIgual"



    // $ANTLR start "terminarExpressaoMenorIgual"
    // fontes/g/CanecaSemantico.g:518:1: terminarExpressaoMenorIgual : ^( MENOR_IGUAL . . ) ;
    public final void terminarExpressaoMenorIgual() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:519:2: ( ^( MENOR_IGUAL . . ) )
            // fontes/g/CanecaSemantico.g:519:4: ^( MENOR_IGUAL . . )
            {
            match(input,MENOR_IGUAL,FOLLOW_MENOR_IGUAL_in_terminarExpressaoMenorIgual1576); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminar <=");
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
    // $ANTLR end "terminarExpressaoMenorIgual"



    // $ANTLR start "expressaoSoma"
    // fontes/g/CanecaSemantico.g:526:1: expressaoSoma : ^( SOMA . . ) ;
    public final void expressaoSoma() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:527:2: ( ^( SOMA . . ) )
            // fontes/g/CanecaSemantico.g:527:4: ^( SOMA . . )
            {
            match(input,SOMA,FOLLOW_SOMA_in_expressaoSoma1597); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("+");
            			ExpressaoSoma expressao = new ExpressaoSoma(escopoAtual);
            			escopoAtual.definirExpressao(expressao);
            			escopoAtual = expressao;
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
    // $ANTLR end "expressaoSoma"



    // $ANTLR start "terminarExpressaoSoma"
    // fontes/g/CanecaSemantico.g:536:1: terminarExpressaoSoma : ^( SOMA . . ) ;
    public final void terminarExpressaoSoma() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:537:2: ( ^( SOMA . . ) )
            // fontes/g/CanecaSemantico.g:537:4: ^( SOMA . . )
            {
            match(input,SOMA,FOLLOW_SOMA_in_terminarExpressaoSoma1618); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminar +");
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
    // $ANTLR end "terminarExpressaoSoma"



    // $ANTLR start "expressaoSubtracao"
    // fontes/g/CanecaSemantico.g:544:1: expressaoSubtracao : ^( SUBTRACAO . . ) ;
    public final void expressaoSubtracao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:545:2: ( ^( SUBTRACAO . . ) )
            // fontes/g/CanecaSemantico.g:545:4: ^( SUBTRACAO . . )
            {
            match(input,SUBTRACAO,FOLLOW_SUBTRACAO_in_expressaoSubtracao1639); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("-");
            			ExpressaoSubtracao expressao = new ExpressaoSubtracao(escopoAtual);
            			escopoAtual.definirExpressao(expressao);
            			escopoAtual = expressao;
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
    // $ANTLR end "expressaoSubtracao"



    // $ANTLR start "terminarExpressaoSubtracao"
    // fontes/g/CanecaSemantico.g:554:1: terminarExpressaoSubtracao : ^( SUBTRACAO . . ) ;
    public final void terminarExpressaoSubtracao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:555:2: ( ^( SUBTRACAO . . ) )
            // fontes/g/CanecaSemantico.g:555:4: ^( SUBTRACAO . . )
            {
            match(input,SUBTRACAO,FOLLOW_SUBTRACAO_in_terminarExpressaoSubtracao1660); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminar -");
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
    // $ANTLR end "terminarExpressaoSubtracao"



    // $ANTLR start "expressaoMultiplicacao"
    // fontes/g/CanecaSemantico.g:562:1: expressaoMultiplicacao : ^( MULTIPLICACAO . . ) ;
    public final void expressaoMultiplicacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:563:2: ( ^( MULTIPLICACAO . . ) )
            // fontes/g/CanecaSemantico.g:563:4: ^( MULTIPLICACAO . . )
            {
            match(input,MULTIPLICACAO,FOLLOW_MULTIPLICACAO_in_expressaoMultiplicacao1681); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("*");
            			ExpressaoMultiplicacao expressao = new ExpressaoMultiplicacao(escopoAtual);
            			escopoAtual.definirExpressao(expressao);
            			escopoAtual = expressao;
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
    // $ANTLR end "expressaoMultiplicacao"



    // $ANTLR start "terminarExpressaoMultiplicacao"
    // fontes/g/CanecaSemantico.g:572:1: terminarExpressaoMultiplicacao : ^( MULTIPLICACAO . . ) ;
    public final void terminarExpressaoMultiplicacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:573:2: ( ^( MULTIPLICACAO . . ) )
            // fontes/g/CanecaSemantico.g:573:4: ^( MULTIPLICACAO . . )
            {
            match(input,MULTIPLICACAO,FOLLOW_MULTIPLICACAO_in_terminarExpressaoMultiplicacao1702); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminar *");
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
    // $ANTLR end "terminarExpressaoMultiplicacao"



    // $ANTLR start "expressaoDivisao"
    // fontes/g/CanecaSemantico.g:580:1: expressaoDivisao : ^( DIVISAO . . ) ;
    public final void expressaoDivisao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:581:2: ( ^( DIVISAO . . ) )
            // fontes/g/CanecaSemantico.g:581:4: ^( DIVISAO . . )
            {
            match(input,DIVISAO,FOLLOW_DIVISAO_in_expressaoDivisao1723); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("/");
            			ExpressaoDivisao expressao = new ExpressaoDivisao(escopoAtual);
            			escopoAtual.definirExpressao(expressao);
            			escopoAtual = expressao;
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
    // $ANTLR end "expressaoDivisao"



    // $ANTLR start "terminarExpressaoDivisao"
    // fontes/g/CanecaSemantico.g:590:1: terminarExpressaoDivisao : ^( DIVISAO . . ) ;
    public final void terminarExpressaoDivisao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:591:2: ( ^( DIVISAO . . ) )
            // fontes/g/CanecaSemantico.g:591:4: ^( DIVISAO . . )
            {
            match(input,DIVISAO,FOLLOW_DIVISAO_in_terminarExpressaoDivisao1744); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminar /");
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
    // $ANTLR end "terminarExpressaoDivisao"



    // $ANTLR start "expressaoRestoDaDivisao"
    // fontes/g/CanecaSemantico.g:598:1: expressaoRestoDaDivisao : ^( RESTO_DA_DIVISAO . . ) ;
    public final void expressaoRestoDaDivisao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:599:2: ( ^( RESTO_DA_DIVISAO . . ) )
            // fontes/g/CanecaSemantico.g:599:4: ^( RESTO_DA_DIVISAO . . )
            {
            match(input,RESTO_DA_DIVISAO,FOLLOW_RESTO_DA_DIVISAO_in_expressaoRestoDaDivisao1765); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("%");
            			ExpressaoRestoDaDivisao expressao = new ExpressaoRestoDaDivisao(escopoAtual);
            			escopoAtual.definirExpressao(expressao);
            			escopoAtual = expressao;
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
    // $ANTLR end "expressaoRestoDaDivisao"



    // $ANTLR start "terminarExpressaoRestoDaDivisao"
    // fontes/g/CanecaSemantico.g:608:1: terminarExpressaoRestoDaDivisao : ^( RESTO_DA_DIVISAO . . ) ;
    public final void terminarExpressaoRestoDaDivisao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:609:2: ( ^( RESTO_DA_DIVISAO . . ) )
            // fontes/g/CanecaSemantico.g:609:4: ^( RESTO_DA_DIVISAO . . )
            {
            match(input,RESTO_DA_DIVISAO,FOLLOW_RESTO_DA_DIVISAO_in_terminarExpressaoRestoDaDivisao1786); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminar %");
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
    // $ANTLR end "terminarExpressaoRestoDaDivisao"



    // $ANTLR start "expressaoNegativacao"
    // fontes/g/CanecaSemantico.g:616:1: expressaoNegativacao : ^( NEGATIVACAO_ . ) ;
    public final void expressaoNegativacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:617:2: ( ^( NEGATIVACAO_ . ) )
            // fontes/g/CanecaSemantico.g:617:4: ^( NEGATIVACAO_ . )
            {
            match(input,NEGATIVACAO_,FOLLOW_NEGATIVACAO__in_expressaoNegativacao1807); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("-");
            			ExpressaoNegativacao expressao = new ExpressaoNegativacao(escopoAtual);
            			escopoAtual.definirExpressao(expressao);
            			escopoAtual = expressao;
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
    // $ANTLR end "expressaoNegativacao"



    // $ANTLR start "terminarExpressaoNegativacao"
    // fontes/g/CanecaSemantico.g:626:1: terminarExpressaoNegativacao : ^( NEGATIVACAO_ . ) ;
    public final void terminarExpressaoNegativacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:627:2: ( ^( NEGATIVACAO_ . ) )
            // fontes/g/CanecaSemantico.g:627:4: ^( NEGATIVACAO_ . )
            {
            match(input,NEGATIVACAO_,FOLLOW_NEGATIVACAO__in_terminarExpressaoNegativacao1826); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminar -");
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
    // $ANTLR end "terminarExpressaoNegativacao"



    // $ANTLR start "expressaoNegacao"
    // fontes/g/CanecaSemantico.g:634:1: expressaoNegacao : ^( NEGACAO . ) ;
    public final void expressaoNegacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:635:2: ( ^( NEGACAO . ) )
            // fontes/g/CanecaSemantico.g:635:4: ^( NEGACAO . )
            {
            match(input,NEGACAO,FOLLOW_NEGACAO_in_expressaoNegacao1845); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("~");
            			ExpressaoNegacao expressao = new ExpressaoNegacao(escopoAtual);
            			escopoAtual.definirExpressao(expressao);
            			escopoAtual = expressao;
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
    // $ANTLR end "expressaoNegacao"



    // $ANTLR start "terminarExpressaoNegacao"
    // fontes/g/CanecaSemantico.g:644:1: terminarExpressaoNegacao : ^( NEGACAO . ) ;
    public final void terminarExpressaoNegacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:645:2: ( ^( NEGACAO . ) )
            // fontes/g/CanecaSemantico.g:645:4: ^( NEGACAO . )
            {
            match(input,NEGACAO,FOLLOW_NEGACAO_in_terminarExpressaoNegacao1864); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminar ~");
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
    // $ANTLR end "terminarExpressaoNegacao"



    // $ANTLR start "expressaoPrimaria"
    // fontes/g/CanecaSemantico.g:652:1: expressaoPrimaria : ( VALOR_BOOLEANO | VALOR_NULO | CONSTANTE_INTEIRA | CONSTANTE_REAL | LITERAL_CARACTERE | LITERAL_TEXTO );
    public final void expressaoPrimaria() throws RecognitionException {
        CommonTree VALOR_BOOLEANO11=null;
        CommonTree VALOR_NULO12=null;
        CommonTree CONSTANTE_INTEIRA13=null;
        CommonTree CONSTANTE_REAL14=null;
        CommonTree LITERAL_CARACTERE15=null;
        CommonTree LITERAL_TEXTO16=null;

        try {
            // fontes/g/CanecaSemantico.g:653:2: ( VALOR_BOOLEANO | VALOR_NULO | CONSTANTE_INTEIRA | CONSTANTE_REAL | LITERAL_CARACTERE | LITERAL_TEXTO )
            int alt23=6;
            switch ( input.LA(1) ) {
            case VALOR_BOOLEANO:
                {
                alt23=1;
                }
                break;
            case VALOR_NULO:
                {
                alt23=2;
                }
                break;
            case CONSTANTE_INTEIRA:
                {
                alt23=3;
                }
                break;
            case CONSTANTE_REAL:
                {
                alt23=4;
                }
                break;
            case LITERAL_CARACTERE:
                {
                alt23=5;
                }
                break;
            case LITERAL_TEXTO:
                {
                alt23=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:653:4: VALOR_BOOLEANO
                    {
                    VALOR_BOOLEANO11=(CommonTree)match(input,VALOR_BOOLEANO,FOLLOW_VALOR_BOOLEANO_in_expressaoPrimaria1882); if (state.failed) return ;

                    if ( state.backtracking==1 ) {
                    			mostrar((VALOR_BOOLEANO11!=null?VALOR_BOOLEANO11.getText():null));
                    			escopoAtual.definirExpressao(new ExpressaoValorBooleano(escopoAtual, (VALOR_BOOLEANO11!=null?VALOR_BOOLEANO11.getText():null)));
                    		}

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:658:4: VALOR_NULO
                    {
                    VALOR_NULO12=(CommonTree)match(input,VALOR_NULO,FOLLOW_VALOR_NULO_in_expressaoPrimaria1891); if (state.failed) return ;

                    if ( state.backtracking==1 ) {
                    			mostrar((VALOR_NULO12!=null?VALOR_NULO12.getText():null));
                    			escopoAtual.definirExpressao(new ExpressaoValorNulo(escopoAtual, (VALOR_NULO12!=null?VALOR_NULO12.getText():null)));
                    		}

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemantico.g:663:4: CONSTANTE_INTEIRA
                    {
                    CONSTANTE_INTEIRA13=(CommonTree)match(input,CONSTANTE_INTEIRA,FOLLOW_CONSTANTE_INTEIRA_in_expressaoPrimaria1900); if (state.failed) return ;

                    if ( state.backtracking==1 ) {
                    			mostrar((CONSTANTE_INTEIRA13!=null?CONSTANTE_INTEIRA13.getText():null));
                    			escopoAtual.definirExpressao(new ExpressaoConstanteInteira(escopoAtual, (CONSTANTE_INTEIRA13!=null?CONSTANTE_INTEIRA13.getText():null)));
                    		}

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSemantico.g:668:4: CONSTANTE_REAL
                    {
                    CONSTANTE_REAL14=(CommonTree)match(input,CONSTANTE_REAL,FOLLOW_CONSTANTE_REAL_in_expressaoPrimaria1909); if (state.failed) return ;

                    if ( state.backtracking==1 ) {
                    			mostrar((CONSTANTE_REAL14!=null?CONSTANTE_REAL14.getText():null));
                    			escopoAtual.definirExpressao(new ExpressaoConstanteReal(escopoAtual, (CONSTANTE_REAL14!=null?CONSTANTE_REAL14.getText():null)));
                    		}

                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSemantico.g:673:4: LITERAL_CARACTERE
                    {
                    LITERAL_CARACTERE15=(CommonTree)match(input,LITERAL_CARACTERE,FOLLOW_LITERAL_CARACTERE_in_expressaoPrimaria1918); if (state.failed) return ;

                    if ( state.backtracking==1 ) {
                    			mostrar((LITERAL_CARACTERE15!=null?LITERAL_CARACTERE15.getText():null));
                    			escopoAtual.definirExpressao(new ExpressaoLiteralCaractere(escopoAtual, (LITERAL_CARACTERE15!=null?LITERAL_CARACTERE15.getText():null)));
                    		}

                    }
                    break;
                case 6 :
                    // fontes/g/CanecaSemantico.g:678:4: LITERAL_TEXTO
                    {
                    LITERAL_TEXTO16=(CommonTree)match(input,LITERAL_TEXTO,FOLLOW_LITERAL_TEXTO_in_expressaoPrimaria1927); if (state.failed) return ;

                    if ( state.backtracking==1 ) {
                    			mostrar((LITERAL_TEXTO16!=null?LITERAL_TEXTO16.getText():null));
                    			escopoAtual.definirExpressao(new ExpressaoLiteralTexto(escopoAtual, (LITERAL_TEXTO16!=null?LITERAL_TEXTO16.getText():null)));
                    		}

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
    // fontes/g/CanecaSemantico.g:685:1: comando : ^( COMANDO_ . ( . )* ) ;
    public final void comando() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:686:2: ( ^( COMANDO_ . ( . )* ) )
            // fontes/g/CanecaSemantico.g:686:4: ^( COMANDO_ . ( . )* )
            {
            match(input,COMANDO_,FOLLOW_COMANDO__in_comando1943); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:686:17: ( . )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0 >= ATRIBUIDOR && LA24_0 <= UNIDADE_)) ) {
                    alt24=1;
                }
                else if ( (LA24_0==UP) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // fontes/g/CanecaSemantico.g:686:18: .
            	    {
            	    matchAny(input); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("comando");
            			ExpressaoComando expressao = new ExpressaoComando(escopoAtual);
            			escopoAtual.definirExpressao(expressao);
            			escopoAtual = expressao;
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
    // $ANTLR end "comando"



    // $ANTLR start "terminarComando"
    // fontes/g/CanecaSemantico.g:695:1: terminarComando : ^( COMANDO_ . ( . )* ) ;
    public final void terminarComando() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:696:2: ( ^( COMANDO_ . ( . )* ) )
            // fontes/g/CanecaSemantico.g:696:4: ^( COMANDO_ . ( . )* )
            {
            match(input,COMANDO_,FOLLOW_COMANDO__in_terminarComando1967); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:696:17: ( . )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0 >= ATRIBUIDOR && LA25_0 <= UNIDADE_)) ) {
                    alt25=1;
                }
                else if ( (LA25_0==UP) ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
            	    // fontes/g/CanecaSemantico.g:696:18: .
            	    {
            	    matchAny(input); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminarComando");
            			escopoAtual = escopoAtual.fornecerEscopoPai();
            			escoposDonos.pop();
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
    // $ANTLR end "terminarComando"



    // $ANTLR start "referencia"
    // fontes/g/CanecaSemantico.g:704:1: referencia : ( ^( REFERENCIA_ ESSE ) | ^( REFERENCIA_ ESSA ) | ^( REFERENCIA_ IDENTIFICADOR ) );
    public final void referencia() throws RecognitionException {
        CommonTree ESSE17=null;
        CommonTree ESSA18=null;
        CommonTree IDENTIFICADOR19=null;

        try {
            // fontes/g/CanecaSemantico.g:705:2: ( ^( REFERENCIA_ ESSE ) | ^( REFERENCIA_ ESSA ) | ^( REFERENCIA_ IDENTIFICADOR ) )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==REFERENCIA_) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case ESSE:
                        {
                        alt26=1;
                        }
                        break;
                    case ESSA:
                        {
                        alt26=2;
                        }
                        break;
                    case IDENTIFICADOR:
                        {
                        alt26=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 2, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:705:4: ^( REFERENCIA_ ESSE )
                    {
                    match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_referencia1991); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    ESSE17=(CommonTree)match(input,ESSE,FOLLOW_ESSE_in_referencia1993); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==1 ) {
                    			mostrar((ESSE17!=null?ESSE17.getText():null));
                    			ExpressaoReferencia expressao = new ExpressaoReferencia(escopoAtual, escopoAtual, (ESSE17!=null?ESSE17.getText():null));
                    			escopoAtual.definirExpressao(expressao);
                    			escoposDonos.push(expressao);
                    		}

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:712:4: ^( REFERENCIA_ ESSA )
                    {
                    match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_referencia2004); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    ESSA18=(CommonTree)match(input,ESSA,FOLLOW_ESSA_in_referencia2006); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==1 ) {
                    			mostrar((ESSA18!=null?ESSA18.getText():null));
                    			ExpressaoReferencia expressao = new ExpressaoReferencia(escopoAtual, escopoAtual, (ESSA18!=null?ESSA18.getText():null));
                    			escopoAtual.definirExpressao(expressao);
                    			escoposDonos.push(expressao);
                    		}

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemantico.g:719:4: ^( REFERENCIA_ IDENTIFICADOR )
                    {
                    match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_referencia2017); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    IDENTIFICADOR19=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_referencia2019); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==1 ) {
                    			mostrar((IDENTIFICADOR19!=null?IDENTIFICADOR19.getText():null));
                    			ExpressaoReferencia expressao = new ExpressaoReferencia(escopoAtual, escopoAtual, (IDENTIFICADOR19!=null?IDENTIFICADOR19.getText():null));
                    			escopoAtual.definirExpressao(expressao);
                    			escoposDonos.push(expressao);
                    		}

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



    // $ANTLR start "referenciaDeMetodo"
    // fontes/g/CanecaSemantico.g:728:1: referenciaDeMetodo : ^( REFERENCIA_ IDENTIFICADOR ( . )+ ) ;
    public final void referenciaDeMetodo() throws RecognitionException {
        CommonTree IDENTIFICADOR20=null;

        try {
            // fontes/g/CanecaSemantico.g:729:2: ( ^( REFERENCIA_ IDENTIFICADOR ( . )+ ) )
            // fontes/g/CanecaSemantico.g:729:4: ^( REFERENCIA_ IDENTIFICADOR ( . )+ )
            {
            match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_referenciaDeMetodo2036); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            IDENTIFICADOR20=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_referenciaDeMetodo2038); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:729:32: ( . )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0 >= ATRIBUIDOR && LA27_0 <= UNIDADE_)) ) {
                    alt27=1;
                }
                else if ( (LA27_0==UP) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // fontes/g/CanecaSemantico.g:729:32: .
            	    {
            	    matchAny(input); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("referenciaDeMetodo");
            			ExpressaoChamadaDeMetodo expressao = new ExpressaoChamadaDeMetodo(escopoAtual, escopoAtual, (IDENTIFICADOR20!=null?IDENTIFICADOR20.getText():null));
            			escopoAtual.definirExpressao(expressao);
            			escopoAtual = expressao;
            			escoposDonos.push(expressao);
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
    // $ANTLR end "referenciaDeMetodo"



    // $ANTLR start "terminarReferenciaDeMetodo"
    // fontes/g/CanecaSemantico.g:739:1: terminarReferenciaDeMetodo : ^( REFERENCIA_ IDENTIFICADOR ( . )+ ) ;
    public final void terminarReferenciaDeMetodo() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:740:2: ( ^( REFERENCIA_ IDENTIFICADOR ( . )+ ) )
            // fontes/g/CanecaSemantico.g:740:4: ^( REFERENCIA_ IDENTIFICADOR ( . )+ )
            {
            match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_terminarReferenciaDeMetodo2058); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_terminarReferenciaDeMetodo2060); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:740:32: ( . )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0 >= ATRIBUIDOR && LA28_0 <= UNIDADE_)) ) {
                    alt28=1;
                }
                else if ( (LA28_0==UP) ) {
                    alt28=2;
                }


                switch (alt28) {
            	case 1 :
            	    // fontes/g/CanecaSemantico.g:740:32: .
            	    {
            	    matchAny(input); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminarReferenciaDeMetodo");
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
    // $ANTLR end "terminarReferenciaDeMetodo"



    // $ANTLR start "instanciacao"
    // fontes/g/CanecaSemantico.g:747:1: instanciacao : ^( INSTANCIACAO_ tipo . ) ;
    public final void instanciacao() throws RecognitionException {
        Tipo tipo21 =null;


        try {
            // fontes/g/CanecaSemantico.g:748:2: ( ^( INSTANCIACAO_ tipo . ) )
            // fontes/g/CanecaSemantico.g:748:4: ^( INSTANCIACAO_ tipo . )
            {
            match(input,INSTANCIACAO_,FOLLOW_INSTANCIACAO__in_instanciacao2080); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tipo_in_instanciacao2082);
            tipo21=tipo();

            state._fsp--;
            if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("instanciacao");
            			ExpressaoInstanciacao expressao = new ExpressaoInstanciacao(escopoAtual, tipo21);
            			escopoAtual.definirExpressao(expressao);
            			escopoAtual = expressao;
            			escoposDonos.push(expressao);
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
    // $ANTLR end "instanciacao"



    // $ANTLR start "terminarInstanciacao"
    // fontes/g/CanecaSemantico.g:758:1: terminarInstanciacao : ^( INSTANCIACAO_ tipo . ) ;
    public final void terminarInstanciacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:759:2: ( ^( INSTANCIACAO_ tipo . ) )
            // fontes/g/CanecaSemantico.g:759:4: ^( INSTANCIACAO_ tipo . )
            {
            match(input,INSTANCIACAO_,FOLLOW_INSTANCIACAO__in_terminarInstanciacao2101); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tipo_in_terminarInstanciacao2103);
            tipo();

            state._fsp--;
            if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminarInstanciacao");
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
    // $ANTLR end "terminarInstanciacao"



    // $ANTLR start "chamada"
    // fontes/g/CanecaSemantico.g:766:1: chamada : ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ) ;
    public final void chamada() throws RecognitionException {
        CommonTree IDENTIFICADOR22=null;

        try {
            // fontes/g/CanecaSemantico.g:767:2: ( ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ) )
            // fontes/g/CanecaSemantico.g:767:4: ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR )
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
            IDENTIFICADOR22=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_chamada2130); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("." + (IDENTIFICADOR22!=null?IDENTIFICADOR22.getText():null));
            			ExpressaoReferencia expressao = new ExpressaoReferencia(escopoAtual, escoposDonos.pop(), (IDENTIFICADOR22!=null?IDENTIFICADOR22.getText():null));
            			escopoAtual.definirExpressao(expressao);
            			escoposDonos.push(expressao);
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
    // $ANTLR end "chamada"



    // $ANTLR start "chamadaDeMetodo"
    // fontes/g/CanecaSemantico.g:776:1: chamadaDeMetodo : ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( . )+ ) ;
    public final void chamadaDeMetodo() throws RecognitionException {
        CommonTree IDENTIFICADOR23=null;

        try {
            // fontes/g/CanecaSemantico.g:777:2: ( ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( . )+ ) )
            // fontes/g/CanecaSemantico.g:777:4: ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( . )+ )
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
            IDENTIFICADOR23=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_chamadaDeMetodo2155); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:777:60: ( . )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0 >= ATRIBUIDOR && LA29_0 <= UNIDADE_)) ) {
                    alt29=1;
                }
                else if ( (LA29_0==UP) ) {
                    alt29=2;
                }


                switch (alt29) {
            	case 1 :
            	    // fontes/g/CanecaSemantico.g:777:60: .
            	    {
            	    matchAny(input); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("chamadaDeMetodo");
            			ExpressaoChamadaDeMetodo expressao = new ExpressaoChamadaDeMetodo(escopoAtual, escoposDonos.pop(), (IDENTIFICADOR23!=null?IDENTIFICADOR23.getText():null));
            			escopoAtual.definirExpressao(expressao);
            			escopoAtual = expressao;
            			escoposDonos.push(expressao);
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
    // $ANTLR end "chamadaDeMetodo"



    // $ANTLR start "terminarChamadaDeMetodo"
    // fontes/g/CanecaSemantico.g:787:1: terminarChamadaDeMetodo : ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( . )+ ) ;
    public final void terminarChamadaDeMetodo() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:788:2: ( ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( . )+ ) )
            // fontes/g/CanecaSemantico.g:788:4: ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( . )+ )
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
            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_terminarChamadaDeMetodo2183); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:788:60: ( . )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0 >= ATRIBUIDOR && LA30_0 <= UNIDADE_)) ) {
                    alt30=1;
                }
                else if ( (LA30_0==UP) ) {
                    alt30=2;
                }


                switch (alt30) {
            	case 1 :
            	    // fontes/g/CanecaSemantico.g:788:60: .
            	    {
            	    matchAny(input); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminarChamadaDeMetodo");
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
    // $ANTLR end "terminarChamadaDeMetodo"



    // $ANTLR start "destruicao"
    // fontes/g/CanecaSemantico.g:795:1: destruicao : ^( DESTRUICAO_ . ) ;
    public final void destruicao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:796:2: ( ^( DESTRUICAO_ . ) )
            // fontes/g/CanecaSemantico.g:796:4: ^( DESTRUICAO_ . )
            {
            match(input,DESTRUICAO_,FOLLOW_DESTRUICAO__in_destruicao2203); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("destrua");
            			InstrucaoDestrua instrucao = new InstrucaoDestrua(escopoAtual);
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
    // $ANTLR end "destruicao"



    // $ANTLR start "terminarDestruicao"
    // fontes/g/CanecaSemantico.g:805:1: terminarDestruicao : ^( DESTRUICAO_ . ) ;
    public final void terminarDestruicao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:806:2: ( ^( DESTRUICAO_ . ) )
            // fontes/g/CanecaSemantico.g:806:4: ^( DESTRUICAO_ . )
            {
            match(input,DESTRUICAO_,FOLLOW_DESTRUICAO__in_terminarDestruicao2222); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminarDestruicao");
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
    // $ANTLR end "terminarDestruicao"



    // $ANTLR start "retorno"
    // fontes/g/CanecaSemantico.g:813:1: retorno : ^( RETORNO_ . ) ;
    public final void retorno() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:814:2: ( ^( RETORNO_ . ) )
            // fontes/g/CanecaSemantico.g:814:4: ^( RETORNO_ . )
            {
            match(input,RETORNO_,FOLLOW_RETORNO__in_retorno2242); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("retorne");
            			InstrucaoRetorne instrucao = new InstrucaoRetorne(escopoAtual);
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
    // $ANTLR end "retorno"



    // $ANTLR start "terminarRetorno"
    // fontes/g/CanecaSemantico.g:823:1: terminarRetorno : ^( RETORNO_ . ) ;
    public final void terminarRetorno() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:824:2: ( ^( RETORNO_ . ) )
            // fontes/g/CanecaSemantico.g:824:4: ^( RETORNO_ . )
            {
            match(input,RETORNO_,FOLLOW_RETORNO__in_terminarRetorno2261); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			mostrar("terminarRetorne");
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
    // $ANTLR end "terminarRetorno"



    // $ANTLR start "se"
    // fontes/g/CanecaSemantico.g:831:1: se : ^( SE_ . . ( . )? ) ;
    public final void se() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:832:2: ( ^( SE_ . . ( . )? ) )
            // fontes/g/CanecaSemantico.g:832:4: ^( SE_ . . ( . )? )
            {
            match(input,SE_,FOLLOW_SE__in_se2280); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:832:14: ( . )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0 >= ATRIBUIDOR && LA31_0 <= UNIDADE_)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:832:14: .
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
    // fontes/g/CanecaSemantico.g:841:1: terminarSe : ^( SE_ . . ( . )? ) ;
    public final void terminarSe() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:842:2: ( ^( SE_ . . ( . )? ) )
            // fontes/g/CanecaSemantico.g:842:4: ^( SE_ . . ( . )? )
            {
            match(input,SE_,FOLLOW_SE__in_terminarSe2304); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:842:14: ( . )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0 >= ATRIBUIDOR && LA32_0 <= UNIDADE_)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:842:14: .
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
    // fontes/g/CanecaSemantico.g:849:1: para : ^( PARA_ . . . . ) ;
    public final void para() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:850:2: ( ^( PARA_ . . . . ) )
            // fontes/g/CanecaSemantico.g:850:4: ^( PARA_ . . . . )
            {
            match(input,PARA_,FOLLOW_PARA__in_para2328); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:859:1: terminarPara : ^( PARA_ . . . . ) ;
    public final void terminarPara() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:860:2: ( ^( PARA_ . . . . ) )
            // fontes/g/CanecaSemantico.g:860:4: ^( PARA_ . . . . )
            {
            match(input,PARA_,FOLLOW_PARA__in_terminarPara2353); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:867:1: repita : ^( REPITA_ . . . ) ;
    public final void repita() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:868:2: ( ^( REPITA_ . . . ) )
            // fontes/g/CanecaSemantico.g:868:4: ^( REPITA_ . . . )
            {
            match(input,REPITA_,FOLLOW_REPITA__in_repita2378); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:877:1: terminarRepita : ^( REPITA_ . . . ) ;
    public final void terminarRepita() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:878:2: ( ^( REPITA_ . . . ) )
            // fontes/g/CanecaSemantico.g:878:4: ^( REPITA_ . . . )
            {
            match(input,REPITA_,FOLLOW_REPITA__in_terminarRepita2401); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:885:1: enquanto : ^( ENQUANTO_ . . ) ;
    public final void enquanto() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:886:2: ( ^( ENQUANTO_ . . ) )
            // fontes/g/CanecaSemantico.g:886:4: ^( ENQUANTO_ . . )
            {
            match(input,ENQUANTO_,FOLLOW_ENQUANTO__in_enquanto2424); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:895:1: terminarEnquanto : ^( ENQUANTO_ . . ) ;
    public final void terminarEnquanto() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:896:2: ( ^( ENQUANTO_ . . ) )
            // fontes/g/CanecaSemantico.g:896:4: ^( ENQUANTO_ . . )
            {
            match(input,ENQUANTO_,FOLLOW_ENQUANTO__in_terminarEnquanto2445); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:903:1: tente : ^( TENTE_ . . ) ;
    public final void tente() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:904:2: ( ^( TENTE_ . . ) )
            // fontes/g/CanecaSemantico.g:904:4: ^( TENTE_ . . )
            {
            match(input,TENTE_,FOLLOW_TENTE__in_tente2466); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:913:1: terminarTente : ^( TENTE_ . . ) ;
    public final void terminarTente() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:914:2: ( ^( TENTE_ . . ) )
            // fontes/g/CanecaSemantico.g:914:4: ^( TENTE_ . . )
            {
            match(input,TENTE_,FOLLOW_TENTE__in_terminarTente2487); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:921:1: capture : ^( CAPTURE_ . . ) ;
    public final void capture() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:922:2: ( ^( CAPTURE_ . . ) )
            // fontes/g/CanecaSemantico.g:922:4: ^( CAPTURE_ . . )
            {
            match(input,CAPTURE_,FOLLOW_CAPTURE__in_capture2508); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:931:1: terminarCapture : ^( CAPTURE_ . . ) ;
    public final void terminarCapture() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:932:2: ( ^( CAPTURE_ . . ) )
            // fontes/g/CanecaSemantico.g:932:4: ^( CAPTURE_ . . )
            {
            match(input,CAPTURE_,FOLLOW_CAPTURE__in_terminarCapture2529); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:939:1: lance : ^( LANCE_ . ) ;
    public final void lance() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:940:2: ( ^( LANCE_ . ) )
            // fontes/g/CanecaSemantico.g:940:4: ^( LANCE_ . )
            {
            match(input,LANCE_,FOLLOW_LANCE__in_lance2550); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:949:1: terminarLance : ^( LANCE_ . ) ;
    public final void terminarLance() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:950:2: ( ^( LANCE_ . ) )
            // fontes/g/CanecaSemantico.g:950:4: ^( LANCE_ . )
            {
            match(input,LANCE_,FOLLOW_LANCE__in_terminarLance2569); if (state.failed) return ;

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



    // $ANTLR start "imprimir"
    // fontes/g/CanecaSemantico.g:957:1: imprimir : IMPRIMIR ;
    public final void imprimir() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:958:2: ( IMPRIMIR )
            // fontes/g/CanecaSemantico.g:958:4: IMPRIMIR
            {
            match(input,IMPRIMIR,FOLLOW_IMPRIMIR_in_imprimir2587); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            			mostrar("imprimir");
            			InstrucaoImprimir instrucao = new InstrucaoImprimir(escopoAtual);
            			escopoAtual.definirInstrucao(instrucao);
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
    // $ANTLR end "imprimir"



    // $ANTLR start "bloco"
    // fontes/g/CanecaSemantico.g:966:1: bloco : ^( INSTRUCOES_ ( . )* ) ;
    public final void bloco() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:967:2: ( ^( INSTRUCOES_ ( . )* ) )
            // fontes/g/CanecaSemantico.g:967:4: ^( INSTRUCOES_ ( . )* )
            {
            match(input,INSTRUCOES_,FOLLOW_INSTRUCOES__in_bloco2603); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:967:18: ( . )*
                loop33:
                do {
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0 >= ATRIBUIDOR && LA33_0 <= UNIDADE_)) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==UP) ) {
                        alt33=2;
                    }


                    switch (alt33) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:967:19: .
                	    {
                	    matchAny(input); if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop33;
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
    // fontes/g/CanecaSemantico.g:976:1: terminarBloco : ^( INSTRUCOES_ ( . )* ) ;
    public final void terminarBloco() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:977:2: ( ^( INSTRUCOES_ ( . )* ) )
            // fontes/g/CanecaSemantico.g:977:4: ^( INSTRUCOES_ ( . )* )
            {
            match(input,INSTRUCOES_,FOLLOW_INSTRUCOES__in_terminarBloco2625); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:977:18: ( . )*
                loop34:
                do {
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0 >= ATRIBUIDOR && LA34_0 <= UNIDADE_)) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==UP) ) {
                        alt34=2;
                    }


                    switch (alt34) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:977:19: .
                	    {
                	    matchAny(input); if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop34;
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
        "\1\u0082\1\2\1\130\1\2\1\163\1\2\1\43\1\3\1\152\1\2\1\3\1\2\1\3"+
        "\1\42\1\135\1\43\1\3\2\uffff\4\3";
    static final String DFA4_maxS =
        "\1\u0082\1\2\1\130\1\2\1\163\1\2\1\43\1\3\1\152\1\2\1\151\1\2\1"+
        "\3\1\43\1\156\1\43\1\3\2\uffff\1\42\1\151\1\3\1\151";
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
            "\1\14\145\uffff\1\13",
            "\1\15",
            "\1\16",
            "\1\17\1\20",
            "\1\21\20\uffff\1\22",
            "\1\23",
            "\1\24",
            "",
            "",
            "\1\26\36\uffff\1\25",
            "\1\14\145\uffff\1\13",
            "\1\26",
            "\1\14\145\uffff\1\13"
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
            return "173:1: unicadeDeCompilacao : ( ^( UNIDADE_ cabecalho classe ) | ^( UNIDADE_ cabecalho interfaces ) );";
        }
    }
 

    public static final BitSet FOLLOW_classe_in_topdown60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atributo_in_topdown65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_construtor_in_topdown70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destrutor_in_topdown75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_metodo_in_topdown80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracao_in_topdown85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloco_in_topdown90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imprimir_in_topdown95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_se_in_topdown100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_para_in_topdown105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repita_in_topdown110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enquanto_in_topdown115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tente_in_topdown120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_capture_in_topdown125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lance_in_topdown130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destruicao_in_topdown135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retorno_in_topdown140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoAtribuicao_in_topdown145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoOu_in_topdown150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoE_in_topdown155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoIgual_in_topdown160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoDiferente_in_topdown165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoMaior_in_topdown170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoMaiorIgual_in_topdown175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoMenor_in_topdown180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoMenorIgual_in_topdown185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoSoma_in_topdown190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoSubtracao_in_topdown195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoMultiplicacao_in_topdown200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoDivisao_in_topdown205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoRestoDaDivisao_in_topdown210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoNegativacao_in_topdown215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoNegacao_in_topdown220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoPrimaria_in_topdown225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comando_in_topdown230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_referencia_in_topdown235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_referenciaDeMetodo_in_topdown240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanciacao_in_topdown245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chamada_in_topdown250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chamadaDeMetodo_in_topdown255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminaClasse_in_bottomup266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarConstrutor_in_bottomup271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarDestrutor_in_bottomup276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarMetodo_in_bottomup281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarBloco_in_bottomup286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarSe_in_bottomup291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarPara_in_bottomup296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarRepita_in_bottomup301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarEnquanto_in_bottomup306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarTente_in_bottomup311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarCapture_in_bottomup316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarLance_in_bottomup321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarDestruicao_in_bottomup326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarRetorno_in_bottomup331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoAtribuicao_in_bottomup336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoOu_in_bottomup341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoE_in_bottomup346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoIgual_in_bottomup351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoDiferente_in_bottomup356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoMaior_in_bottomup361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoMaiorIgual_in_bottomup366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoMenor_in_bottomup371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoMenorIgual_in_bottomup376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoSoma_in_bottomup381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoSubtracao_in_bottomup386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoMultiplicacao_in_bottomup391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoDivisao_in_bottomup396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoRestoDaDivisao_in_bottomup401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoNegativacao_in_bottomup406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoNegacao_in_bottomup411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarComando_in_bottomup416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarReferenciaDeMetodo_in_bottomup421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarInstanciacao_in_bottomup426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarChamadaDeMetodo_in_bottomup431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROGRAMA__in_programa443 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_unicadeDeCompilacao_in_programa446 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_UNIDADE__in_unicadeDeCompilacao461 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_cabecalho_in_unicadeDeCompilacao463 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_classe_in_unicadeDeCompilacao465 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNIDADE__in_unicadeDeCompilacao472 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_cabecalho_in_unicadeDeCompilacao474 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_interfaces_in_unicadeDeCompilacao476 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CABECALHO__in_cabecalho489 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pacote_in_cabecalho491 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_importacoes_in_cabecalho493 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PACOTE__in_pacote506 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_DE_PACOTE_in_pacote508 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORTACOES__in_importacoes521 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_importacao_in_importacoes524 = new BitSet(new long[]{0x0000000000000008L,0x0000020000000000L});
    public static final BitSet FOLLOW_IMPORTACAO__in_importacao539 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_importacao541 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao543 = new BitSet(new long[]{0x0000000400000008L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_importacao546 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORTACAO__in_importacao555 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao557 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASSE__in_classe570 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoFeminino_in_classe572 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_classe574 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_listaDeTiposGenericos_in_classe576 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_classe578 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000007L});
    public static final BitSet FOLLOW_CLASSE__in_terminaClasse597 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoFeminino_in_terminaClasse599 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_terminaClasse601 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_listaDeTiposGenericos_in_terminaClasse603 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_terminaClasse605 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000007L});
    public static final BitSet FOLLOW_INTERFACE__in_interfaces624 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoFeminino_in_interfaces626 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_interfaces628 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_listaDeTiposGenericos_in_interfaces630 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_interfaces632 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_corpoDaInterface_in_interfaces634 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CORPO__in_corpoDaClasse647 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atributos_in_corpoDaClasse649 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_construtores_in_corpoDaClasse651 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_destrutor_in_corpoDaClasse653 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_metodos_in_corpoDaClasse655 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CORPO__in_corpoDaInterface668 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atributos_in_corpoDaInterface670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_assinaturasDeMetodos_in_corpoDaInterface672 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATRIBUTOS__in_atributos685 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atributo_in_atributos688 = new BitSet(new long[]{0x0000000000000008L,0x0000000000800000L});
    public static final BitSet FOLLOW_CONSTRUTORES__in_construtores703 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_construtor_in_construtores706 = new BitSet(new long[]{0x0000000000000008L,0x0000000100000000L});
    public static final BitSet FOLLOW_METODOS__in_metodos721 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_metodo_in_metodos724 = new BitSet(new long[]{0x0000000000000008L,0x0002000000000000L});
    public static final BitSet FOLLOW_ASSINATURAS_DE_METODOS__in_assinaturasDeMetodos739 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_assinaturasDeMetodos743 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_assinaturasDeMetodos745 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ESTATICO_in_assinaturasDeMetodos748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_tipo_in_assinaturasDeMetodos752 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_assinaturasDeMetodos754 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000007L});
    public static final BitSet FOLLOW_ATRIBUTO__in_atributo772 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_atributo774 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ESTATICO_in_atributo777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_tipo_in_atributo781 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_atributo783 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0000000000000007L});
    public static final BitSet FOLLOW_CONSTRUTOR__in_construtor805 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_construtor809 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_construtor811 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_construtor813 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000007L});
    public static final BitSet FOLLOW_CONSTRUTOR__in_terminarConstrutor835 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_terminarConstrutor839 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_terminarConstrutor841 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_terminarConstrutor843 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000007L});
    public static final BitSet FOLLOW_DESTRUTOR__in_destrutor865 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_destrutor868 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_destrutor870 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_destrutor872 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000007L});
    public static final BitSet FOLLOW_DESTRUTOR__in_terminarDestrutor894 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_terminarDestrutor897 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_terminarDestrutor899 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_terminarDestrutor901 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000007L});
    public static final BitSet FOLLOW_METODO__in_metodo923 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_metodo926 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_metodo928 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ESTATICO_in_metodo931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_tipo_in_metodo935 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_metodo937 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000007L});
    public static final BitSet FOLLOW_METODO__in_terminarMetodo959 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_terminarMetodo962 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_terminarMetodo964 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ESTATICO_in_terminarMetodo967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_tipo_in_terminarMetodo971 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_terminarMetodo973 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000007L});
    public static final BitSet FOLLOW_PARAMETROS__in_listaDeParametros1037 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARGUMENTOS__in_listaDeArgumentosVazia1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGUMENTOS__in_listaDeArgumentos1066 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTERFACES__in_listaDeInterfaces1084 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_listaDeInterfaces1087 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_TIPOS_GENERICOS__in_listaDeTiposGenericos1102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipoGenerico_in_listaDeTiposGenericos1105 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_TIPOS__in_listaDeTipos1120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_listaDeTipos1123 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_CAPTURAS__in_listaDeCapturas1138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_capture_in_listaDeCapturas1141 = new BitSet(new long[]{0x0000000000000008L,0x0000000004000000L});
    public static final BitSet FOLLOW_TIPO_GENERICO__in_tipoGenerico1156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_tipoGenerico1158 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_tipoGenerico1160 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIPO__in_tipo1177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_tipo1179 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_listaDeTipos_in_tipo1181 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARACAO__in_declaracao1198 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_declaracao1200 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_declaracao1202 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATRIBUIDOR_in_expressaoAtribuicao1219 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ATRIBUIDOR_in_terminarExpressaoAtribuicao1240 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OU_in_expressaoOu1261 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OU_in_terminarExpressaoOu1282 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_E_in_expressaoE1303 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_E_in_terminarExpressaoE1324 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IGUAL_in_expressaoIgual1345 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IGUAL_in_terminarExpressaoIgual1366 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIFERENTE_in_expressaoDiferente1387 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIFERENTE_in_terminarExpressaoDiferente1408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MAIOR_in_expressaoMaior1429 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MAIOR_in_terminarExpressaoMaior1450 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MAIOR_IGUAL_in_expressaoMaiorIgual1471 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MAIOR_IGUAL_in_terminarExpressaoMaiorIgual1492 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MENOR_in_expressaoMenor1513 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MENOR_in_terminarExpressaoMenor1534 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MENOR_IGUAL_in_expressaoMenorIgual1555 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MENOR_IGUAL_in_terminarExpressaoMenorIgual1576 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SOMA_in_expressaoSoma1597 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SOMA_in_terminarExpressaoSoma1618 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBTRACAO_in_expressaoSubtracao1639 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBTRACAO_in_terminarExpressaoSubtracao1660 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MULTIPLICACAO_in_expressaoMultiplicacao1681 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MULTIPLICACAO_in_terminarExpressaoMultiplicacao1702 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIVISAO_in_expressaoDivisao1723 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIVISAO_in_terminarExpressaoDivisao1744 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RESTO_DA_DIVISAO_in_expressaoRestoDaDivisao1765 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RESTO_DA_DIVISAO_in_terminarExpressaoRestoDaDivisao1786 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEGATIVACAO__in_expressaoNegativacao1807 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEGATIVACAO__in_terminarExpressaoNegativacao1826 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEGACAO_in_expressaoNegacao1845 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEGACAO_in_terminarExpressaoNegacao1864 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VALOR_BOOLEANO_in_expressaoPrimaria1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALOR_NULO_in_expressaoPrimaria1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTE_INTEIRA_in_expressaoPrimaria1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTE_REAL_in_expressaoPrimaria1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_CARACTERE_in_expressaoPrimaria1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_TEXTO_in_expressaoPrimaria1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMANDO__in_comando1943 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_COMANDO__in_terminarComando1967 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_REFERENCIA__in_referencia1991 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ESSE_in_referencia1993 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REFERENCIA__in_referencia2004 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ESSA_in_referencia2006 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REFERENCIA__in_referencia2017 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_referencia2019 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REFERENCIA__in_referenciaDeMetodo2036 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_referenciaDeMetodo2038 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000007L});
    public static final BitSet FOLLOW_REFERENCIA__in_terminarReferenciaDeMetodo2058 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_terminarReferenciaDeMetodo2060 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000007L});
    public static final BitSet FOLLOW_INSTANCIACAO__in_instanciacao2080 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_instanciacao2082 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000007L});
    public static final BitSet FOLLOW_INSTANCIACAO__in_terminarInstanciacao2101 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_terminarInstanciacao2103 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000007L});
    public static final BitSet FOLLOW_set_in_chamada2122 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_chamada2130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_chamadaDeMetodo2147 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_chamadaDeMetodo2155 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000007L});
    public static final BitSet FOLLOW_set_in_terminarChamadaDeMetodo2175 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_terminarChamadaDeMetodo2183 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000007L});
    public static final BitSet FOLLOW_DESTRUICAO__in_destruicao2203 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DESTRUICAO__in_terminarDestruicao2222 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RETORNO__in_retorno2242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RETORNO__in_terminarRetorno2261 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SE__in_se2280 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SE__in_terminarSe2304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PARA__in_para2328 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PARA__in_terminarPara2353 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_REPITA__in_repita2378 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_REPITA__in_terminarRepita2401 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ENQUANTO__in_enquanto2424 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ENQUANTO__in_terminarEnquanto2445 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TENTE__in_tente2466 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TENTE__in_terminarTente2487 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CAPTURE__in_capture2508 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CAPTURE__in_terminarCapture2529 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LANCE__in_lance2550 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LANCE__in_terminarLance2569 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IMPRIMIR_in_imprimir2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCOES__in_bloco2603 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INSTRUCOES__in_terminarBloco2625 = new BitSet(new long[]{0x0000000000000004L});

}