// $ANTLR 3.4 fontes/g/CanecaSemantico.g 2012-12-17 22:19:30

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATRIBUIDOR", "ATRIBUTO", "CAPTURE", "CARACTERE", "CARACTERE_DE_ESCAPE", "CARACTERE_NAO_IMPRIMIVEL", "CHAMADA_DE_CLASSE", "CHAMADA_DE_OBJETO", "CLASSE", "COLCHETE_DIREITO", "COLCHETE_ESQUERDO", "COMENTARIO_EM_BLOCO", "COMENTARIO_EM_LINHA", "COMO", "CONSTANTE_INTEIRA", "CONSTANTE_REAL", "CONSTRUTOR", "DECLARE", "DESTRUA", "DESTRUTOR", "DIFERENTE", "DIGITO", "DIVISAO", "E", "ENQUANTO", "ESPACO_EM_BRANCO", "ESSA", "ESSE", "ESTATICO", "FIM", "IDENTIFICADOR", "IDENTIFICADOR_DE_PACOTE", "IGUAL", "IMPLEMENTA", "IMPORTE", "INICIO", "INTERFACE", "LANCE", "LETRA", "LITERAL_CARACTERE", "LITERAL_TEXTO", "MAIOR", "MAIOR_IGUAL", "MENOR", "MENOR_IGUAL", "METODO", "MULTIPLICACAO", "NEGACAO", "NOVA", "NOVO", "OU", "PACOTE", "PARA", "PARENTESE_DIREITO", "PARENTESE_ESQUERDO", "PRIVADA", "PRIVADO", "PROTEGIDA", "PROTEGIDO", "PUBLICA", "PUBLICO", "QUEBRA_DE_LINHA", "REPITA", "RESTO_DA_DIVISAO", "RETORNE", "SE", "SENAO", "SEPARADOR", "SOMA", "SUBTRACAO", "TABULACAO", "TENTE", "TERMINADOR", "USADO_EM_TEXTO", "VALOR_BOOLEANO", "VALOR_NULO", "ARGUMENTOS_", "ASSINATURAS_DE_METODOS_", "ASSINATURA_", "ASSINATURA_DE_METODO_", "ATRIBUICAO_", "ATRIBUTOS_", "ATRIBUTO_", "CABECALHO_", "CAPTURAS_", "CAPTURE_", "CHAMADA_DE_CLASSE_", "CHAMADA_DE_OBJETO_", "CLASSE_", "COMANDO_", "CONSTRUTORES_", "CONSTRUTOR_", "CORPO_", "DECLARACAO_", "DECLARACAO_COM_ATRIBUICAO_OPICIONAL_", "DESTRUICAO_", "DESTRUTORES_", "DESTRUTOR_", "ENQUANTO_", "EXPRESSAO_", "IMPORTACAO_", "IMPORTACOES_", "INSTANCIACAO_", "INSTRUCOES_", "INTERFACES_", "INTERFACE_", "LANCE_", "METODOS_", "METODO_", "NEGATIVACAO_", "PACOTE_", "PARAMETROS_", "PARA_", "PRIMARIA_", "PROGRAMA_", "REFERENCIA_", "REPITA_", "RETORNO_", "SELECAO_", "SE_", "TENTE_", "TIPOS_", "TIPOS_GENERICOS_", "TIPO_", "TIPO_GENERICO_", "UNIDADE_"
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
    public static final int NEGATIVACAO_=113;
    public static final int PACOTE_=114;
    public static final int PARAMETROS_=115;
    public static final int PARA_=116;
    public static final int PRIMARIA_=117;
    public static final int PROGRAMA_=118;
    public static final int REFERENCIA_=119;
    public static final int REPITA_=120;
    public static final int RETORNO_=121;
    public static final int SELECAO_=122;
    public static final int SE_=123;
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
    // fontes/g/CanecaSemantico.g:88:1: topdown : ( classe | atributo | construtor | destrutor | metodo | declaracao | bloco | se | para | repita | enquanto | tente | capture | lance | destruicao | retorno | expressaoAtribuicao | expressaoOu | expressaoE | expressaoIgual | expressaoDiferente | expressaoMaior | expressaoMaiorIgual | expressaoMenor | expressaoMenorIgual | expressaoSoma | expressaoSubtracao | expressaoMultiplicacao | expressaoDivisao | expressaoRestoDaDivisao | expressaoNegativacao | expressaoNegacao | expressaoPrimaria | comando | referencia | referenciaDeMetodo | instanciacao | chamada | chamadaDeMetodo );
    public final void topdown() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:89:2: ( classe | atributo | construtor | destrutor | metodo | declaracao | bloco | se | para | repita | enquanto | tente | capture | lance | destruicao | retorno | expressaoAtribuicao | expressaoOu | expressaoE | expressaoIgual | expressaoDiferente | expressaoMaior | expressaoMaiorIgual | expressaoMenor | expressaoMenorIgual | expressaoSoma | expressaoSubtracao | expressaoMultiplicacao | expressaoDivisao | expressaoRestoDaDivisao | expressaoNegativacao | expressaoNegacao | expressaoPrimaria | comando | referencia | referenciaDeMetodo | instanciacao | chamada | chamadaDeMetodo )
            int alt1=39;
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
            case DESTRUICAO_:
                {
                alt1=15;
                }
                break;
            case RETORNO_:
                {
                alt1=16;
                }
                break;
            case ATRIBUIDOR:
                {
                alt1=17;
                }
                break;
            case OU:
                {
                alt1=18;
                }
                break;
            case E:
                {
                alt1=19;
                }
                break;
            case IGUAL:
                {
                alt1=20;
                }
                break;
            case DIFERENTE:
                {
                alt1=21;
                }
                break;
            case MAIOR:
                {
                alt1=22;
                }
                break;
            case MAIOR_IGUAL:
                {
                alt1=23;
                }
                break;
            case MENOR:
                {
                alt1=24;
                }
                break;
            case MENOR_IGUAL:
                {
                alt1=25;
                }
                break;
            case SOMA:
                {
                alt1=26;
                }
                break;
            case SUBTRACAO:
                {
                alt1=27;
                }
                break;
            case MULTIPLICACAO:
                {
                alt1=28;
                }
                break;
            case DIVISAO:
                {
                alt1=29;
                }
                break;
            case RESTO_DA_DIVISAO:
                {
                alt1=30;
                }
                break;
            case NEGATIVACAO_:
                {
                alt1=31;
                }
                break;
            case NEGACAO:
                {
                alt1=32;
                }
                break;
            case CONSTANTE_INTEIRA:
            case CONSTANTE_REAL:
            case LITERAL_CARACTERE:
            case LITERAL_TEXTO:
            case VALOR_BOOLEANO:
            case VALOR_NULO:
                {
                alt1=33;
                }
                break;
            case COMANDO_:
                {
                alt1=34;
                }
                break;
            case REFERENCIA_:
                {
                int LA1_35 = input.LA(2);

                if ( (LA1_35==DOWN) ) {
                    int LA1_38 = input.LA(3);

                    if ( ((LA1_38 >= ESSA && LA1_38 <= ESSE)) ) {
                        alt1=35;
                    }
                    else if ( (LA1_38==IDENTIFICADOR) ) {
                        int LA1_41 = input.LA(4);

                        if ( (LA1_41==UP) ) {
                            alt1=35;
                        }
                        else if ( ((LA1_41 >= ATRIBUIDOR && LA1_41 <= UNIDADE_)) ) {
                            alt1=36;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 41, input);

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
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 35, input);

                    throw nvae;

                }
                }
                break;
            case INSTANCIACAO_:
                {
                alt1=37;
                }
                break;
            case CHAMADA_DE_CLASSE:
            case CHAMADA_DE_OBJETO:
                {
                int LA1_37 = input.LA(2);

                if ( (LA1_37==DOWN) ) {
                    int LA1_39 = input.LA(3);

                    if ( (LA1_39==IDENTIFICADOR) ) {
                        int LA1_42 = input.LA(4);

                        if ( (LA1_42==UP) ) {
                            alt1=38;
                        }
                        else if ( ((LA1_42 >= ATRIBUIDOR && LA1_42 <= UNIDADE_)) ) {
                            alt1=39;
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
                        new NoViableAltException("", 1, 37, input);

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
                    // fontes/g/CanecaSemantico.g:89:4: classe
                    {
                    pushFollow(FOLLOW_classe_in_topdown60);
                    classe();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:90:4: atributo
                    {
                    pushFollow(FOLLOW_atributo_in_topdown65);
                    atributo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemantico.g:91:4: construtor
                    {
                    pushFollow(FOLLOW_construtor_in_topdown70);
                    construtor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSemantico.g:92:4: destrutor
                    {
                    pushFollow(FOLLOW_destrutor_in_topdown75);
                    destrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSemantico.g:93:4: metodo
                    {
                    pushFollow(FOLLOW_metodo_in_topdown80);
                    metodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // fontes/g/CanecaSemantico.g:94:4: declaracao
                    {
                    pushFollow(FOLLOW_declaracao_in_topdown85);
                    declaracao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // fontes/g/CanecaSemantico.g:95:4: bloco
                    {
                    pushFollow(FOLLOW_bloco_in_topdown90);
                    bloco();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // fontes/g/CanecaSemantico.g:96:4: se
                    {
                    pushFollow(FOLLOW_se_in_topdown95);
                    se();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // fontes/g/CanecaSemantico.g:97:4: para
                    {
                    pushFollow(FOLLOW_para_in_topdown100);
                    para();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // fontes/g/CanecaSemantico.g:98:4: repita
                    {
                    pushFollow(FOLLOW_repita_in_topdown105);
                    repita();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // fontes/g/CanecaSemantico.g:99:4: enquanto
                    {
                    pushFollow(FOLLOW_enquanto_in_topdown110);
                    enquanto();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // fontes/g/CanecaSemantico.g:100:4: tente
                    {
                    pushFollow(FOLLOW_tente_in_topdown115);
                    tente();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // fontes/g/CanecaSemantico.g:101:4: capture
                    {
                    pushFollow(FOLLOW_capture_in_topdown120);
                    capture();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // fontes/g/CanecaSemantico.g:102:4: lance
                    {
                    pushFollow(FOLLOW_lance_in_topdown125);
                    lance();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 15 :
                    // fontes/g/CanecaSemantico.g:103:4: destruicao
                    {
                    pushFollow(FOLLOW_destruicao_in_topdown130);
                    destruicao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 16 :
                    // fontes/g/CanecaSemantico.g:104:4: retorno
                    {
                    pushFollow(FOLLOW_retorno_in_topdown135);
                    retorno();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 17 :
                    // fontes/g/CanecaSemantico.g:105:4: expressaoAtribuicao
                    {
                    pushFollow(FOLLOW_expressaoAtribuicao_in_topdown140);
                    expressaoAtribuicao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 18 :
                    // fontes/g/CanecaSemantico.g:106:4: expressaoOu
                    {
                    pushFollow(FOLLOW_expressaoOu_in_topdown145);
                    expressaoOu();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 19 :
                    // fontes/g/CanecaSemantico.g:107:4: expressaoE
                    {
                    pushFollow(FOLLOW_expressaoE_in_topdown150);
                    expressaoE();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 20 :
                    // fontes/g/CanecaSemantico.g:108:4: expressaoIgual
                    {
                    pushFollow(FOLLOW_expressaoIgual_in_topdown155);
                    expressaoIgual();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 21 :
                    // fontes/g/CanecaSemantico.g:109:4: expressaoDiferente
                    {
                    pushFollow(FOLLOW_expressaoDiferente_in_topdown160);
                    expressaoDiferente();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 22 :
                    // fontes/g/CanecaSemantico.g:110:4: expressaoMaior
                    {
                    pushFollow(FOLLOW_expressaoMaior_in_topdown165);
                    expressaoMaior();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 23 :
                    // fontes/g/CanecaSemantico.g:111:4: expressaoMaiorIgual
                    {
                    pushFollow(FOLLOW_expressaoMaiorIgual_in_topdown170);
                    expressaoMaiorIgual();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 24 :
                    // fontes/g/CanecaSemantico.g:112:4: expressaoMenor
                    {
                    pushFollow(FOLLOW_expressaoMenor_in_topdown175);
                    expressaoMenor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 25 :
                    // fontes/g/CanecaSemantico.g:113:4: expressaoMenorIgual
                    {
                    pushFollow(FOLLOW_expressaoMenorIgual_in_topdown180);
                    expressaoMenorIgual();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 26 :
                    // fontes/g/CanecaSemantico.g:114:4: expressaoSoma
                    {
                    pushFollow(FOLLOW_expressaoSoma_in_topdown185);
                    expressaoSoma();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 27 :
                    // fontes/g/CanecaSemantico.g:115:4: expressaoSubtracao
                    {
                    pushFollow(FOLLOW_expressaoSubtracao_in_topdown190);
                    expressaoSubtracao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 28 :
                    // fontes/g/CanecaSemantico.g:116:4: expressaoMultiplicacao
                    {
                    pushFollow(FOLLOW_expressaoMultiplicacao_in_topdown195);
                    expressaoMultiplicacao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 29 :
                    // fontes/g/CanecaSemantico.g:117:4: expressaoDivisao
                    {
                    pushFollow(FOLLOW_expressaoDivisao_in_topdown200);
                    expressaoDivisao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 30 :
                    // fontes/g/CanecaSemantico.g:118:4: expressaoRestoDaDivisao
                    {
                    pushFollow(FOLLOW_expressaoRestoDaDivisao_in_topdown205);
                    expressaoRestoDaDivisao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 31 :
                    // fontes/g/CanecaSemantico.g:119:4: expressaoNegativacao
                    {
                    pushFollow(FOLLOW_expressaoNegativacao_in_topdown210);
                    expressaoNegativacao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 32 :
                    // fontes/g/CanecaSemantico.g:120:4: expressaoNegacao
                    {
                    pushFollow(FOLLOW_expressaoNegacao_in_topdown215);
                    expressaoNegacao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 33 :
                    // fontes/g/CanecaSemantico.g:121:4: expressaoPrimaria
                    {
                    pushFollow(FOLLOW_expressaoPrimaria_in_topdown220);
                    expressaoPrimaria();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 34 :
                    // fontes/g/CanecaSemantico.g:122:4: comando
                    {
                    pushFollow(FOLLOW_comando_in_topdown225);
                    comando();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 35 :
                    // fontes/g/CanecaSemantico.g:123:4: referencia
                    {
                    pushFollow(FOLLOW_referencia_in_topdown230);
                    referencia();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 36 :
                    // fontes/g/CanecaSemantico.g:124:4: referenciaDeMetodo
                    {
                    pushFollow(FOLLOW_referenciaDeMetodo_in_topdown235);
                    referenciaDeMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 37 :
                    // fontes/g/CanecaSemantico.g:125:4: instanciacao
                    {
                    pushFollow(FOLLOW_instanciacao_in_topdown240);
                    instanciacao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 38 :
                    // fontes/g/CanecaSemantico.g:126:4: chamada
                    {
                    pushFollow(FOLLOW_chamada_in_topdown245);
                    chamada();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 39 :
                    // fontes/g/CanecaSemantico.g:127:4: chamadaDeMetodo
                    {
                    pushFollow(FOLLOW_chamadaDeMetodo_in_topdown250);
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
    // fontes/g/CanecaSemantico.g:130:1: bottomup : ( terminaClasse | terminarConstrutor | terminarDestrutor | terminarMetodo | terminarBloco | terminarSe | terminarPara | terminarRepita | terminarEnquanto | terminarTente | terminarCapture | terminarLance | terminarDestruicao | terminarRetorno | terminarExpressaoAtribuicao | terminarExpressaoOu | terminarExpressaoE | terminarExpressaoIgual | terminarExpressaoDiferente | terminarExpressaoMaior | terminarExpressaoMaiorIgual | terminarExpressaoMenor | terminarExpressaoMenorIgual | terminarExpressaoSoma | terminarExpressaoSubtracao | terminarExpressaoMultiplicacao | terminarExpressaoDivisao | terminarExpressaoRestoDaDivisao | terminarExpressaoNegativacao | terminarExpressaoNegacao | terminarComando | terminarReferenciaDeMetodo | terminarInstanciacao | terminarChamadaDeMetodo );
    public final void bottomup() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:131:2: ( terminaClasse | terminarConstrutor | terminarDestrutor | terminarMetodo | terminarBloco | terminarSe | terminarPara | terminarRepita | terminarEnquanto | terminarTente | terminarCapture | terminarLance | terminarDestruicao | terminarRetorno | terminarExpressaoAtribuicao | terminarExpressaoOu | terminarExpressaoE | terminarExpressaoIgual | terminarExpressaoDiferente | terminarExpressaoMaior | terminarExpressaoMaiorIgual | terminarExpressaoMenor | terminarExpressaoMenorIgual | terminarExpressaoSoma | terminarExpressaoSubtracao | terminarExpressaoMultiplicacao | terminarExpressaoDivisao | terminarExpressaoRestoDaDivisao | terminarExpressaoNegativacao | terminarExpressaoNegacao | terminarComando | terminarReferenciaDeMetodo | terminarInstanciacao | terminarChamadaDeMetodo )
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
                    // fontes/g/CanecaSemantico.g:131:4: terminaClasse
                    {
                    pushFollow(FOLLOW_terminaClasse_in_bottomup261);
                    terminaClasse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:132:4: terminarConstrutor
                    {
                    pushFollow(FOLLOW_terminarConstrutor_in_bottomup266);
                    terminarConstrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemantico.g:133:4: terminarDestrutor
                    {
                    pushFollow(FOLLOW_terminarDestrutor_in_bottomup271);
                    terminarDestrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSemantico.g:134:4: terminarMetodo
                    {
                    pushFollow(FOLLOW_terminarMetodo_in_bottomup276);
                    terminarMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSemantico.g:135:4: terminarBloco
                    {
                    pushFollow(FOLLOW_terminarBloco_in_bottomup281);
                    terminarBloco();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // fontes/g/CanecaSemantico.g:136:4: terminarSe
                    {
                    pushFollow(FOLLOW_terminarSe_in_bottomup286);
                    terminarSe();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // fontes/g/CanecaSemantico.g:137:4: terminarPara
                    {
                    pushFollow(FOLLOW_terminarPara_in_bottomup291);
                    terminarPara();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // fontes/g/CanecaSemantico.g:138:4: terminarRepita
                    {
                    pushFollow(FOLLOW_terminarRepita_in_bottomup296);
                    terminarRepita();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // fontes/g/CanecaSemantico.g:139:4: terminarEnquanto
                    {
                    pushFollow(FOLLOW_terminarEnquanto_in_bottomup301);
                    terminarEnquanto();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // fontes/g/CanecaSemantico.g:140:4: terminarTente
                    {
                    pushFollow(FOLLOW_terminarTente_in_bottomup306);
                    terminarTente();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // fontes/g/CanecaSemantico.g:141:4: terminarCapture
                    {
                    pushFollow(FOLLOW_terminarCapture_in_bottomup311);
                    terminarCapture();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // fontes/g/CanecaSemantico.g:142:4: terminarLance
                    {
                    pushFollow(FOLLOW_terminarLance_in_bottomup316);
                    terminarLance();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // fontes/g/CanecaSemantico.g:143:4: terminarDestruicao
                    {
                    pushFollow(FOLLOW_terminarDestruicao_in_bottomup321);
                    terminarDestruicao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // fontes/g/CanecaSemantico.g:144:4: terminarRetorno
                    {
                    pushFollow(FOLLOW_terminarRetorno_in_bottomup326);
                    terminarRetorno();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 15 :
                    // fontes/g/CanecaSemantico.g:145:4: terminarExpressaoAtribuicao
                    {
                    pushFollow(FOLLOW_terminarExpressaoAtribuicao_in_bottomup331);
                    terminarExpressaoAtribuicao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 16 :
                    // fontes/g/CanecaSemantico.g:146:4: terminarExpressaoOu
                    {
                    pushFollow(FOLLOW_terminarExpressaoOu_in_bottomup336);
                    terminarExpressaoOu();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 17 :
                    // fontes/g/CanecaSemantico.g:147:4: terminarExpressaoE
                    {
                    pushFollow(FOLLOW_terminarExpressaoE_in_bottomup341);
                    terminarExpressaoE();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 18 :
                    // fontes/g/CanecaSemantico.g:148:4: terminarExpressaoIgual
                    {
                    pushFollow(FOLLOW_terminarExpressaoIgual_in_bottomup346);
                    terminarExpressaoIgual();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 19 :
                    // fontes/g/CanecaSemantico.g:149:4: terminarExpressaoDiferente
                    {
                    pushFollow(FOLLOW_terminarExpressaoDiferente_in_bottomup351);
                    terminarExpressaoDiferente();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 20 :
                    // fontes/g/CanecaSemantico.g:150:4: terminarExpressaoMaior
                    {
                    pushFollow(FOLLOW_terminarExpressaoMaior_in_bottomup356);
                    terminarExpressaoMaior();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 21 :
                    // fontes/g/CanecaSemantico.g:151:4: terminarExpressaoMaiorIgual
                    {
                    pushFollow(FOLLOW_terminarExpressaoMaiorIgual_in_bottomup361);
                    terminarExpressaoMaiorIgual();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 22 :
                    // fontes/g/CanecaSemantico.g:152:4: terminarExpressaoMenor
                    {
                    pushFollow(FOLLOW_terminarExpressaoMenor_in_bottomup366);
                    terminarExpressaoMenor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 23 :
                    // fontes/g/CanecaSemantico.g:153:4: terminarExpressaoMenorIgual
                    {
                    pushFollow(FOLLOW_terminarExpressaoMenorIgual_in_bottomup371);
                    terminarExpressaoMenorIgual();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 24 :
                    // fontes/g/CanecaSemantico.g:154:4: terminarExpressaoSoma
                    {
                    pushFollow(FOLLOW_terminarExpressaoSoma_in_bottomup376);
                    terminarExpressaoSoma();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 25 :
                    // fontes/g/CanecaSemantico.g:155:4: terminarExpressaoSubtracao
                    {
                    pushFollow(FOLLOW_terminarExpressaoSubtracao_in_bottomup381);
                    terminarExpressaoSubtracao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 26 :
                    // fontes/g/CanecaSemantico.g:156:4: terminarExpressaoMultiplicacao
                    {
                    pushFollow(FOLLOW_terminarExpressaoMultiplicacao_in_bottomup386);
                    terminarExpressaoMultiplicacao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 27 :
                    // fontes/g/CanecaSemantico.g:157:4: terminarExpressaoDivisao
                    {
                    pushFollow(FOLLOW_terminarExpressaoDivisao_in_bottomup391);
                    terminarExpressaoDivisao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 28 :
                    // fontes/g/CanecaSemantico.g:158:4: terminarExpressaoRestoDaDivisao
                    {
                    pushFollow(FOLLOW_terminarExpressaoRestoDaDivisao_in_bottomup396);
                    terminarExpressaoRestoDaDivisao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 29 :
                    // fontes/g/CanecaSemantico.g:159:4: terminarExpressaoNegativacao
                    {
                    pushFollow(FOLLOW_terminarExpressaoNegativacao_in_bottomup401);
                    terminarExpressaoNegativacao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 30 :
                    // fontes/g/CanecaSemantico.g:160:4: terminarExpressaoNegacao
                    {
                    pushFollow(FOLLOW_terminarExpressaoNegacao_in_bottomup406);
                    terminarExpressaoNegacao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 31 :
                    // fontes/g/CanecaSemantico.g:161:4: terminarComando
                    {
                    pushFollow(FOLLOW_terminarComando_in_bottomup411);
                    terminarComando();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 32 :
                    // fontes/g/CanecaSemantico.g:162:4: terminarReferenciaDeMetodo
                    {
                    pushFollow(FOLLOW_terminarReferenciaDeMetodo_in_bottomup416);
                    terminarReferenciaDeMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 33 :
                    // fontes/g/CanecaSemantico.g:163:4: terminarInstanciacao
                    {
                    pushFollow(FOLLOW_terminarInstanciacao_in_bottomup421);
                    terminarInstanciacao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 34 :
                    // fontes/g/CanecaSemantico.g:164:4: terminarChamadaDeMetodo
                    {
                    pushFollow(FOLLOW_terminarChamadaDeMetodo_in_bottomup426);
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
    // fontes/g/CanecaSemantico.g:167:1: programa : ^( PROGRAMA_ ( unicadeDeCompilacao )+ ) ;
    public final void programa() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:168:2: ( ^( PROGRAMA_ ( unicadeDeCompilacao )+ ) )
            // fontes/g/CanecaSemantico.g:168:4: ^( PROGRAMA_ ( unicadeDeCompilacao )+ )
            {
            match(input,PROGRAMA_,FOLLOW_PROGRAMA__in_programa438); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // fontes/g/CanecaSemantico.g:168:16: ( unicadeDeCompilacao )+
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
            	    // fontes/g/CanecaSemantico.g:168:17: unicadeDeCompilacao
            	    {
            	    pushFollow(FOLLOW_unicadeDeCompilacao_in_programa441);
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
    // fontes/g/CanecaSemantico.g:171:1: unicadeDeCompilacao : ( ^( UNIDADE_ cabecalho classe ) | ^( UNIDADE_ cabecalho interfaces ) );
    public final void unicadeDeCompilacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:172:2: ( ^( UNIDADE_ cabecalho classe ) | ^( UNIDADE_ cabecalho interfaces ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:172:4: ^( UNIDADE_ cabecalho classe )
                    {
                    match(input,UNIDADE_,FOLLOW_UNIDADE__in_unicadeDeCompilacao456); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_cabecalho_in_unicadeDeCompilacao458);
                    cabecalho();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_classe_in_unicadeDeCompilacao460);
                    classe();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:173:4: ^( UNIDADE_ cabecalho interfaces )
                    {
                    match(input,UNIDADE_,FOLLOW_UNIDADE__in_unicadeDeCompilacao467); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_cabecalho_in_unicadeDeCompilacao469);
                    cabecalho();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_interfaces_in_unicadeDeCompilacao471);
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
    // fontes/g/CanecaSemantico.g:176:1: cabecalho : ^( CABECALHO_ pacote importacoes ) ;
    public final void cabecalho() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:177:2: ( ^( CABECALHO_ pacote importacoes ) )
            // fontes/g/CanecaSemantico.g:177:4: ^( CABECALHO_ pacote importacoes )
            {
            match(input,CABECALHO_,FOLLOW_CABECALHO__in_cabecalho484); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_pacote_in_cabecalho486);
            pacote();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_importacoes_in_cabecalho488);
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
    // fontes/g/CanecaSemantico.g:180:1: pacote : ^( PACOTE_ IDENTIFICADOR_DE_PACOTE ) ;
    public final void pacote() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:181:2: ( ^( PACOTE_ IDENTIFICADOR_DE_PACOTE ) )
            // fontes/g/CanecaSemantico.g:181:4: ^( PACOTE_ IDENTIFICADOR_DE_PACOTE )
            {
            match(input,PACOTE_,FOLLOW_PACOTE__in_pacote501); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,IDENTIFICADOR_DE_PACOTE,FOLLOW_IDENTIFICADOR_DE_PACOTE_in_pacote503); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:184:1: importacoes : ^( IMPORTACOES_ ( importacao )* ) ;
    public final void importacoes() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:185:2: ( ^( IMPORTACOES_ ( importacao )* ) )
            // fontes/g/CanecaSemantico.g:185:4: ^( IMPORTACOES_ ( importacao )* )
            {
            match(input,IMPORTACOES_,FOLLOW_IMPORTACOES__in_importacoes516); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:185:19: ( importacao )*
                loop5:
                do {
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==IMPORTACAO_) ) {
                        alt5=1;
                    }


                    switch (alt5) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:185:20: importacao
                	    {
                	    pushFollow(FOLLOW_importacao_in_importacoes519);
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
    // fontes/g/CanecaSemantico.g:188:1: importacao : ( ^( IMPORTACAO_ IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( IDENTIFICADOR )? ) | ^( IMPORTACAO_ IDENTIFICADOR_DE_PACOTE ) );
    public final void importacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:189:2: ( ^( IMPORTACAO_ IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( IDENTIFICADOR )? ) | ^( IMPORTACAO_ IDENTIFICADOR_DE_PACOTE ) )
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
                    // fontes/g/CanecaSemantico.g:189:4: ^( IMPORTACAO_ IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( IDENTIFICADOR )? )
                    {
                    match(input,IMPORTACAO_,FOLLOW_IMPORTACAO__in_importacao534); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_importacao536); if (state.failed) return ;

                    match(input,IDENTIFICADOR_DE_PACOTE,FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao538); if (state.failed) return ;

                    // fontes/g/CanecaSemantico.g:189:56: ( IDENTIFICADOR )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==IDENTIFICADOR) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // fontes/g/CanecaSemantico.g:189:57: IDENTIFICADOR
                            {
                            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_importacao541); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:190:4: ^( IMPORTACAO_ IDENTIFICADOR_DE_PACOTE )
                    {
                    match(input,IMPORTACAO_,FOLLOW_IMPORTACAO__in_importacao550); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,IDENTIFICADOR_DE_PACOTE,FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao552); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:193:1: classe : ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . ) ;
    public final void classe() throws RecognitionException {
        CommonTree IDENTIFICADOR1=null;

        try {
            // fontes/g/CanecaSemantico.g:194:2: ( ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . ) )
            // fontes/g/CanecaSemantico.g:194:4: ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . )
            {
            match(input,CLASSE_,FOLLOW_CLASSE__in_classe565); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoFeminino_in_classe567);
            modificadorDeAcessoFeminino();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR1=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_classe569); if (state.failed) return ;

            pushFollow(FOLLOW_listaDeTiposGenericos_in_classe571);
            listaDeTiposGenericos();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_listaDeInterfaces_in_classe573);
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
    // fontes/g/CanecaSemantico.g:203:1: terminaClasse : ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . ) ;
    public final void terminaClasse() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:204:2: ( ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . ) )
            // fontes/g/CanecaSemantico.g:204:4: ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces . )
            {
            match(input,CLASSE_,FOLLOW_CLASSE__in_terminaClasse592); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoFeminino_in_terminaClasse594);
            modificadorDeAcessoFeminino();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_terminaClasse596); if (state.failed) return ;

            pushFollow(FOLLOW_listaDeTiposGenericos_in_terminaClasse598);
            listaDeTiposGenericos();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_listaDeInterfaces_in_terminaClasse600);
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
    // fontes/g/CanecaSemantico.g:211:1: interfaces : ^( INTERFACE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface ) ;
    public final void interfaces() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:212:2: ( ^( INTERFACE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface ) )
            // fontes/g/CanecaSemantico.g:212:4: ^( INTERFACE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface )
            {
            match(input,INTERFACE_,FOLLOW_INTERFACE__in_interfaces619); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoFeminino_in_interfaces621);
            modificadorDeAcessoFeminino();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_interfaces623); if (state.failed) return ;

            pushFollow(FOLLOW_listaDeTiposGenericos_in_interfaces625);
            listaDeTiposGenericos();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_listaDeInterfaces_in_interfaces627);
            listaDeInterfaces();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_corpoDaInterface_in_interfaces629);
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
    // fontes/g/CanecaSemantico.g:215:1: corpoDaClasse : ^( CORPO_ atributos construtores destrutor metodos ) ;
    public final void corpoDaClasse() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:216:2: ( ^( CORPO_ atributos construtores destrutor metodos ) )
            // fontes/g/CanecaSemantico.g:216:4: ^( CORPO_ atributos construtores destrutor metodos )
            {
            match(input,CORPO_,FOLLOW_CORPO__in_corpoDaClasse642); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_atributos_in_corpoDaClasse644);
            atributos();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_construtores_in_corpoDaClasse646);
            construtores();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_destrutor_in_corpoDaClasse648);
            destrutor();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_metodos_in_corpoDaClasse650);
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
    // fontes/g/CanecaSemantico.g:219:1: corpoDaInterface : ^( CORPO_ atributos assinaturasDeMetodos ) ;
    public final void corpoDaInterface() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:220:2: ( ^( CORPO_ atributos assinaturasDeMetodos ) )
            // fontes/g/CanecaSemantico.g:220:4: ^( CORPO_ atributos assinaturasDeMetodos )
            {
            match(input,CORPO_,FOLLOW_CORPO__in_corpoDaInterface663); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_atributos_in_corpoDaInterface665);
            atributos();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_assinaturasDeMetodos_in_corpoDaInterface667);
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
    // fontes/g/CanecaSemantico.g:223:1: atributos : ^( ATRIBUTOS_ ( atributo )* ) ;
    public final void atributos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:224:2: ( ^( ATRIBUTOS_ ( atributo )* ) )
            // fontes/g/CanecaSemantico.g:224:4: ^( ATRIBUTOS_ ( atributo )* )
            {
            match(input,ATRIBUTOS_,FOLLOW_ATRIBUTOS__in_atributos680); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:224:17: ( atributo )*
                loop8:
                do {
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==ATRIBUTO_) ) {
                        alt8=1;
                    }


                    switch (alt8) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:224:18: atributo
                	    {
                	    pushFollow(FOLLOW_atributo_in_atributos683);
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
    // fontes/g/CanecaSemantico.g:227:1: construtores : ^( CONSTRUTORES_ ( construtor )+ ) ;
    public final void construtores() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:228:2: ( ^( CONSTRUTORES_ ( construtor )+ ) )
            // fontes/g/CanecaSemantico.g:228:4: ^( CONSTRUTORES_ ( construtor )+ )
            {
            match(input,CONSTRUTORES_,FOLLOW_CONSTRUTORES__in_construtores698); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // fontes/g/CanecaSemantico.g:228:20: ( construtor )+
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
            	    // fontes/g/CanecaSemantico.g:228:21: construtor
            	    {
            	    pushFollow(FOLLOW_construtor_in_construtores701);
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
    // fontes/g/CanecaSemantico.g:231:1: metodos : ^( METODOS_ ( metodo )* ) ;
    public final void metodos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:232:2: ( ^( METODOS_ ( metodo )* ) )
            // fontes/g/CanecaSemantico.g:232:4: ^( METODOS_ ( metodo )* )
            {
            match(input,METODOS_,FOLLOW_METODOS__in_metodos716); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:232:15: ( metodo )*
                loop10:
                do {
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==METODO_) ) {
                        alt10=1;
                    }


                    switch (alt10) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:232:16: metodo
                	    {
                	    pushFollow(FOLLOW_metodo_in_metodos719);
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
    // fontes/g/CanecaSemantico.g:235:1: assinaturasDeMetodos : ^( ASSINATURAS_DE_METODOS_ ( ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) )* ) ;
    public final void assinaturasDeMetodos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:236:2: ( ^( ASSINATURAS_DE_METODOS_ ( ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) )* ) )
            // fontes/g/CanecaSemantico.g:236:4: ^( ASSINATURAS_DE_METODOS_ ( ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) )* )
            {
            match(input,ASSINATURAS_DE_METODOS_,FOLLOW_ASSINATURAS_DE_METODOS__in_assinaturasDeMetodos734); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:236:30: ( ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) )*
                loop12:
                do {
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==ASSINATURA_) ) {
                        alt12=1;
                    }


                    switch (alt12) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:236:31: ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . )
                	    {
                	    match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_assinaturasDeMetodos738); if (state.failed) return ;

                	    match(input, Token.DOWN, null); if (state.failed) return ;
                	    pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_assinaturasDeMetodos740);
                	    modificadorDeAcessoMasculino();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    // fontes/g/CanecaSemantico.g:236:74: ( ESTATICO )?
                	    int alt11=2;
                	    int LA11_0 = input.LA(1);

                	    if ( (LA11_0==ESTATICO) ) {
                	        alt11=1;
                	    }
                	    switch (alt11) {
                	        case 1 :
                	            // fontes/g/CanecaSemantico.g:236:75: ESTATICO
                	            {
                	            match(input,ESTATICO,FOLLOW_ESTATICO_in_assinaturasDeMetodos743); if (state.failed) return ;

                	            }
                	            break;

                	    }


                	    pushFollow(FOLLOW_tipo_in_assinaturasDeMetodos747);
                	    tipo();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_assinaturasDeMetodos749); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:239:1: atributo : ^( ATRIBUTO_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR ( . )? ) ;
    public final void atributo() throws RecognitionException {
        CommonTree IDENTIFICADOR3=null;
        Tipo tipo2 =null;


        try {
            // fontes/g/CanecaSemantico.g:240:2: ( ^( ATRIBUTO_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR ( . )? ) )
            // fontes/g/CanecaSemantico.g:240:4: ^( ATRIBUTO_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR ( . )? )
            {
            match(input,ATRIBUTO_,FOLLOW_ATRIBUTO__in_atributo767); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_atributo769);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:240:45: ( ESTATICO )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ESTATICO) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:240:46: ESTATICO
                    {
                    match(input,ESTATICO,FOLLOW_ESTATICO_in_atributo772); if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_atributo776);
            tipo2=tipo();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR3=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_atributo778); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:240:76: ( . )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0 >= ATRIBUIDOR && LA14_0 <= UNIDADE_)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:240:77: .
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
    // fontes/g/CanecaSemantico.g:248:1: construtor : ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) ;
    public final void construtor() throws RecognitionException {
        CommonTree IDENTIFICADOR4=null;

        try {
            // fontes/g/CanecaSemantico.g:249:2: ( ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemantico.g:249:4: ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . )
            {
            match(input,CONSTRUTOR_,FOLLOW_CONSTRUTOR__in_construtor800); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_construtor804); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_construtor806);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR4=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_construtor808); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:258:1: terminarConstrutor : ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) ;
    public final void terminarConstrutor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:259:2: ( ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemantico.g:259:4: ^( CONSTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . )
            {
            match(input,CONSTRUTOR_,FOLLOW_CONSTRUTOR__in_terminarConstrutor830); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_terminarConstrutor834); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_terminarConstrutor836);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_terminarConstrutor838); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:266:1: destrutor : ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) ;
    public final void destrutor() throws RecognitionException {
        CommonTree IDENTIFICADOR5=null;

        try {
            // fontes/g/CanecaSemantico.g:267:2: ( ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemantico.g:267:4: ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . )
            {
            match(input,DESTRUTOR_,FOLLOW_DESTRUTOR__in_destrutor860); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_destrutor863); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_destrutor865);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR5=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_destrutor867); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:276:1: terminarDestrutor : ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) ;
    public final void terminarDestrutor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:277:2: ( ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemantico.g:277:4: ^( DESTRUTOR_ ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR . ) . )
            {
            match(input,DESTRUTOR_,FOLLOW_DESTRUTOR__in_terminarDestrutor889); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_terminarDestrutor892); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_terminarDestrutor894);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_terminarDestrutor896); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:284:1: metodo : ^( METODO_ ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) . ) ;
    public final void metodo() throws RecognitionException {
        CommonTree IDENTIFICADOR7=null;
        Tipo tipo6 =null;


        try {
            // fontes/g/CanecaSemantico.g:285:2: ( ^( METODO_ ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemantico.g:285:4: ^( METODO_ ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) . )
            {
            match(input,METODO_,FOLLOW_METODO__in_metodo918); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_metodo921); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_metodo923);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:285:57: ( ESTATICO )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ESTATICO) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:285:58: ESTATICO
                    {
                    match(input,ESTATICO,FOLLOW_ESTATICO_in_metodo926); if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_metodo930);
            tipo6=tipo();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR7=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_metodo932); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:294:1: terminarMetodo : ^( METODO_ ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) . ) ;
    public final void terminarMetodo() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:295:2: ( ^( METODO_ ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemantico.g:295:4: ^( METODO_ ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR . ) . )
            {
            match(input,METODO_,FOLLOW_METODO__in_terminarMetodo954); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_terminarMetodo957); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_terminarMetodo959);
            modificadorDeAcessoMasculino();

            state._fsp--;
            if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:295:57: ( ESTATICO )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ESTATICO) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:295:58: ESTATICO
                    {
                    match(input,ESTATICO,FOLLOW_ESTATICO_in_terminarMetodo962); if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_terminarMetodo966);
            tipo();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_terminarMetodo968); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:302:1: modificadorDeAcessoMasculino : ( PUBLICO | PRIVADO | PROTEGIDO );
    public final void modificadorDeAcessoMasculino() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:303:2: ( PUBLICO | PRIVADO | PROTEGIDO )
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
    // fontes/g/CanecaSemantico.g:308:1: modificadorDeAcessoFeminino : ( PUBLICA | PRIVADA | PROTEGIDA );
    public final void modificadorDeAcessoFeminino() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:309:2: ( PUBLICA | PRIVADA | PROTEGIDA )
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
    // fontes/g/CanecaSemantico.g:314:1: listaDeParametros : ^( PARAMETROS_ ( . )* ) ;
    public final void listaDeParametros() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:315:2: ( ^( PARAMETROS_ ( . )* ) )
            // fontes/g/CanecaSemantico.g:315:4: ^( PARAMETROS_ ( . )* )
            {
            match(input,PARAMETROS_,FOLLOW_PARAMETROS__in_listaDeParametros1032); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:315:18: ( . )*
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
                	    // fontes/g/CanecaSemantico.g:315:19: .
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
    // fontes/g/CanecaSemantico.g:318:1: listaDeArgumentosVazia : ARGUMENTOS_ ;
    public final void listaDeArgumentosVazia() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:319:2: ( ARGUMENTOS_ )
            // fontes/g/CanecaSemantico.g:319:4: ARGUMENTOS_
            {
            match(input,ARGUMENTOS_,FOLLOW_ARGUMENTOS__in_listaDeArgumentosVazia1049); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:322:1: listaDeArgumentos : ^( ARGUMENTOS_ ( . )* ) ;
    public final void listaDeArgumentos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:323:2: ( ^( ARGUMENTOS_ ( . )* ) )
            // fontes/g/CanecaSemantico.g:323:4: ^( ARGUMENTOS_ ( . )* )
            {
            match(input,ARGUMENTOS_,FOLLOW_ARGUMENTOS__in_listaDeArgumentos1061); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:323:18: ( . )*
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
                	    // fontes/g/CanecaSemantico.g:323:19: .
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
    // fontes/g/CanecaSemantico.g:326:1: listaDeInterfaces : ^( INTERFACES_ ( tipo )* ) ;
    public final void listaDeInterfaces() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:327:2: ( ^( INTERFACES_ ( tipo )* ) )
            // fontes/g/CanecaSemantico.g:327:4: ^( INTERFACES_ ( tipo )* )
            {
            match(input,INTERFACES_,FOLLOW_INTERFACES__in_listaDeInterfaces1079); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:327:18: ( tipo )*
                loop19:
                do {
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==TIPO_) ) {
                        alt19=1;
                    }


                    switch (alt19) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:327:19: tipo
                	    {
                	    pushFollow(FOLLOW_tipo_in_listaDeInterfaces1082);
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
    // fontes/g/CanecaSemantico.g:330:1: listaDeTiposGenericos : ^( TIPOS_GENERICOS_ ( tipoGenerico )* ) ;
    public final void listaDeTiposGenericos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:331:2: ( ^( TIPOS_GENERICOS_ ( tipoGenerico )* ) )
            // fontes/g/CanecaSemantico.g:331:4: ^( TIPOS_GENERICOS_ ( tipoGenerico )* )
            {
            match(input,TIPOS_GENERICOS_,FOLLOW_TIPOS_GENERICOS__in_listaDeTiposGenericos1097); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:331:23: ( tipoGenerico )*
                loop20:
                do {
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==TIPO_GENERICO_) ) {
                        alt20=1;
                    }


                    switch (alt20) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:331:24: tipoGenerico
                	    {
                	    pushFollow(FOLLOW_tipoGenerico_in_listaDeTiposGenericos1100);
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
    // fontes/g/CanecaSemantico.g:334:1: listaDeTipos : ^( TIPOS_ ( tipo )* ) ;
    public final void listaDeTipos() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:335:2: ( ^( TIPOS_ ( tipo )* ) )
            // fontes/g/CanecaSemantico.g:335:4: ^( TIPOS_ ( tipo )* )
            {
            match(input,TIPOS_,FOLLOW_TIPOS__in_listaDeTipos1115); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:335:13: ( tipo )*
                loop21:
                do {
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==TIPO_) ) {
                        alt21=1;
                    }


                    switch (alt21) {
                	case 1 :
                	    // fontes/g/CanecaSemantico.g:335:14: tipo
                	    {
                	    pushFollow(FOLLOW_tipo_in_listaDeTipos1118);
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
    // fontes/g/CanecaSemantico.g:338:1: listaDeCapturas : ^( CAPTURAS_ ( capture )+ ) ;
    public final void listaDeCapturas() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:339:2: ( ^( CAPTURAS_ ( capture )+ ) )
            // fontes/g/CanecaSemantico.g:339:4: ^( CAPTURAS_ ( capture )+ )
            {
            match(input,CAPTURAS_,FOLLOW_CAPTURAS__in_listaDeCapturas1133); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // fontes/g/CanecaSemantico.g:339:16: ( capture )+
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
            	    // fontes/g/CanecaSemantico.g:339:17: capture
            	    {
            	    pushFollow(FOLLOW_capture_in_listaDeCapturas1136);
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
    // fontes/g/CanecaSemantico.g:342:1: tipoGenerico : ^( TIPO_GENERICO_ IDENTIFICADOR listaDeInterfaces ) ;
    public final void tipoGenerico() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:343:2: ( ^( TIPO_GENERICO_ IDENTIFICADOR listaDeInterfaces ) )
            // fontes/g/CanecaSemantico.g:343:4: ^( TIPO_GENERICO_ IDENTIFICADOR listaDeInterfaces )
            {
            match(input,TIPO_GENERICO_,FOLLOW_TIPO_GENERICO__in_tipoGenerico1151); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_tipoGenerico1153); if (state.failed) return ;

            pushFollow(FOLLOW_listaDeInterfaces_in_tipoGenerico1155);
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
    // fontes/g/CanecaSemantico.g:346:1: tipo returns [Tipo tipo] : ^( TIPO_ IDENTIFICADOR listaDeTipos ) ;
    public final Tipo tipo() throws RecognitionException {
        Tipo tipo = null;


        CommonTree IDENTIFICADOR8=null;

        try {
            // fontes/g/CanecaSemantico.g:347:2: ( ^( TIPO_ IDENTIFICADOR listaDeTipos ) )
            // fontes/g/CanecaSemantico.g:347:4: ^( TIPO_ IDENTIFICADOR listaDeTipos )
            {
            match(input,TIPO_,FOLLOW_TIPO__in_tipo1172); if (state.failed) return tipo;

            match(input, Token.DOWN, null); if (state.failed) return tipo;
            IDENTIFICADOR8=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_tipo1174); if (state.failed) return tipo;

            pushFollow(FOLLOW_listaDeTipos_in_tipo1176);
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
    // fontes/g/CanecaSemantico.g:353:1: declaracao : ^( DECLARACAO_ tipo IDENTIFICADOR ) ;
    public final void declaracao() throws RecognitionException {
        CommonTree IDENTIFICADOR10=null;
        Tipo tipo9 =null;


        try {
            // fontes/g/CanecaSemantico.g:354:2: ( ^( DECLARACAO_ tipo IDENTIFICADOR ) )
            // fontes/g/CanecaSemantico.g:354:4: ^( DECLARACAO_ tipo IDENTIFICADOR )
            {
            match(input,DECLARACAO_,FOLLOW_DECLARACAO__in_declaracao1193); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tipo_in_declaracao1195);
            tipo9=tipo();

            state._fsp--;
            if (state.failed) return ;

            IDENTIFICADOR10=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_declaracao1197); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:362:1: expressaoAtribuicao : ^( ATRIBUIDOR . . ) ;
    public final void expressaoAtribuicao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:363:2: ( ^( ATRIBUIDOR . . ) )
            // fontes/g/CanecaSemantico.g:363:4: ^( ATRIBUIDOR . . )
            {
            match(input,ATRIBUIDOR,FOLLOW_ATRIBUIDOR_in_expressaoAtribuicao1214); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:372:1: terminarExpressaoAtribuicao : ^( ATRIBUIDOR . . ) ;
    public final void terminarExpressaoAtribuicao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:373:2: ( ^( ATRIBUIDOR . . ) )
            // fontes/g/CanecaSemantico.g:373:4: ^( ATRIBUIDOR . . )
            {
            match(input,ATRIBUIDOR,FOLLOW_ATRIBUIDOR_in_terminarExpressaoAtribuicao1235); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:380:1: expressaoOu : ^( OU . . ) ;
    public final void expressaoOu() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:381:2: ( ^( OU . . ) )
            // fontes/g/CanecaSemantico.g:381:4: ^( OU . . )
            {
            match(input,OU,FOLLOW_OU_in_expressaoOu1256); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:390:1: terminarExpressaoOu : ^( OU . . ) ;
    public final void terminarExpressaoOu() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:391:2: ( ^( OU . . ) )
            // fontes/g/CanecaSemantico.g:391:4: ^( OU . . )
            {
            match(input,OU,FOLLOW_OU_in_terminarExpressaoOu1277); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:398:1: expressaoE : ^( E . . ) ;
    public final void expressaoE() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:399:2: ( ^( E . . ) )
            // fontes/g/CanecaSemantico.g:399:4: ^( E . . )
            {
            match(input,E,FOLLOW_E_in_expressaoE1298); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:408:1: terminarExpressaoE : ^( E . . ) ;
    public final void terminarExpressaoE() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:409:2: ( ^( E . . ) )
            // fontes/g/CanecaSemantico.g:409:4: ^( E . . )
            {
            match(input,E,FOLLOW_E_in_terminarExpressaoE1319); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:416:1: expressaoIgual : ^( IGUAL . . ) ;
    public final void expressaoIgual() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:417:2: ( ^( IGUAL . . ) )
            // fontes/g/CanecaSemantico.g:417:4: ^( IGUAL . . )
            {
            match(input,IGUAL,FOLLOW_IGUAL_in_expressaoIgual1340); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:426:1: terminarExpressaoIgual : ^( IGUAL . . ) ;
    public final void terminarExpressaoIgual() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:427:2: ( ^( IGUAL . . ) )
            // fontes/g/CanecaSemantico.g:427:4: ^( IGUAL . . )
            {
            match(input,IGUAL,FOLLOW_IGUAL_in_terminarExpressaoIgual1361); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:434:1: expressaoDiferente : ^( DIFERENTE . . ) ;
    public final void expressaoDiferente() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:435:2: ( ^( DIFERENTE . . ) )
            // fontes/g/CanecaSemantico.g:435:4: ^( DIFERENTE . . )
            {
            match(input,DIFERENTE,FOLLOW_DIFERENTE_in_expressaoDiferente1382); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:444:1: terminarExpressaoDiferente : ^( DIFERENTE . . ) ;
    public final void terminarExpressaoDiferente() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:445:2: ( ^( DIFERENTE . . ) )
            // fontes/g/CanecaSemantico.g:445:4: ^( DIFERENTE . . )
            {
            match(input,DIFERENTE,FOLLOW_DIFERENTE_in_terminarExpressaoDiferente1403); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:452:1: expressaoMaior : ^( MAIOR . . ) ;
    public final void expressaoMaior() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:453:2: ( ^( MAIOR . . ) )
            // fontes/g/CanecaSemantico.g:453:4: ^( MAIOR . . )
            {
            match(input,MAIOR,FOLLOW_MAIOR_in_expressaoMaior1424); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:462:1: terminarExpressaoMaior : ^( MAIOR . . ) ;
    public final void terminarExpressaoMaior() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:463:2: ( ^( MAIOR . . ) )
            // fontes/g/CanecaSemantico.g:463:4: ^( MAIOR . . )
            {
            match(input,MAIOR,FOLLOW_MAIOR_in_terminarExpressaoMaior1445); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:470:1: expressaoMaiorIgual : ^( MAIOR_IGUAL . . ) ;
    public final void expressaoMaiorIgual() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:471:2: ( ^( MAIOR_IGUAL . . ) )
            // fontes/g/CanecaSemantico.g:471:4: ^( MAIOR_IGUAL . . )
            {
            match(input,MAIOR_IGUAL,FOLLOW_MAIOR_IGUAL_in_expressaoMaiorIgual1466); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:480:1: terminarExpressaoMaiorIgual : ^( MAIOR_IGUAL . . ) ;
    public final void terminarExpressaoMaiorIgual() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:481:2: ( ^( MAIOR_IGUAL . . ) )
            // fontes/g/CanecaSemantico.g:481:4: ^( MAIOR_IGUAL . . )
            {
            match(input,MAIOR_IGUAL,FOLLOW_MAIOR_IGUAL_in_terminarExpressaoMaiorIgual1487); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:488:1: expressaoMenor : ^( MENOR . . ) ;
    public final void expressaoMenor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:489:2: ( ^( MENOR . . ) )
            // fontes/g/CanecaSemantico.g:489:4: ^( MENOR . . )
            {
            match(input,MENOR,FOLLOW_MENOR_in_expressaoMenor1508); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:498:1: terminarExpressaoMenor : ^( MENOR . . ) ;
    public final void terminarExpressaoMenor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:499:2: ( ^( MENOR . . ) )
            // fontes/g/CanecaSemantico.g:499:4: ^( MENOR . . )
            {
            match(input,MENOR,FOLLOW_MENOR_in_terminarExpressaoMenor1529); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:506:1: expressaoMenorIgual : ^( MENOR_IGUAL . . ) ;
    public final void expressaoMenorIgual() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:507:2: ( ^( MENOR_IGUAL . . ) )
            // fontes/g/CanecaSemantico.g:507:4: ^( MENOR_IGUAL . . )
            {
            match(input,MENOR_IGUAL,FOLLOW_MENOR_IGUAL_in_expressaoMenorIgual1550); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:516:1: terminarExpressaoMenorIgual : ^( MENOR_IGUAL . . ) ;
    public final void terminarExpressaoMenorIgual() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:517:2: ( ^( MENOR_IGUAL . . ) )
            // fontes/g/CanecaSemantico.g:517:4: ^( MENOR_IGUAL . . )
            {
            match(input,MENOR_IGUAL,FOLLOW_MENOR_IGUAL_in_terminarExpressaoMenorIgual1571); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:524:1: expressaoSoma : ^( SOMA . . ) ;
    public final void expressaoSoma() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:525:2: ( ^( SOMA . . ) )
            // fontes/g/CanecaSemantico.g:525:4: ^( SOMA . . )
            {
            match(input,SOMA,FOLLOW_SOMA_in_expressaoSoma1592); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:534:1: terminarExpressaoSoma : ^( SOMA . . ) ;
    public final void terminarExpressaoSoma() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:535:2: ( ^( SOMA . . ) )
            // fontes/g/CanecaSemantico.g:535:4: ^( SOMA . . )
            {
            match(input,SOMA,FOLLOW_SOMA_in_terminarExpressaoSoma1613); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:542:1: expressaoSubtracao : ^( SUBTRACAO . . ) ;
    public final void expressaoSubtracao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:543:2: ( ^( SUBTRACAO . . ) )
            // fontes/g/CanecaSemantico.g:543:4: ^( SUBTRACAO . . )
            {
            match(input,SUBTRACAO,FOLLOW_SUBTRACAO_in_expressaoSubtracao1634); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:552:1: terminarExpressaoSubtracao : ^( SUBTRACAO . . ) ;
    public final void terminarExpressaoSubtracao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:553:2: ( ^( SUBTRACAO . . ) )
            // fontes/g/CanecaSemantico.g:553:4: ^( SUBTRACAO . . )
            {
            match(input,SUBTRACAO,FOLLOW_SUBTRACAO_in_terminarExpressaoSubtracao1655); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:560:1: expressaoMultiplicacao : ^( MULTIPLICACAO . . ) ;
    public final void expressaoMultiplicacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:561:2: ( ^( MULTIPLICACAO . . ) )
            // fontes/g/CanecaSemantico.g:561:4: ^( MULTIPLICACAO . . )
            {
            match(input,MULTIPLICACAO,FOLLOW_MULTIPLICACAO_in_expressaoMultiplicacao1676); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:570:1: terminarExpressaoMultiplicacao : ^( MULTIPLICACAO . . ) ;
    public final void terminarExpressaoMultiplicacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:571:2: ( ^( MULTIPLICACAO . . ) )
            // fontes/g/CanecaSemantico.g:571:4: ^( MULTIPLICACAO . . )
            {
            match(input,MULTIPLICACAO,FOLLOW_MULTIPLICACAO_in_terminarExpressaoMultiplicacao1697); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:578:1: expressaoDivisao : ^( DIVISAO . . ) ;
    public final void expressaoDivisao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:579:2: ( ^( DIVISAO . . ) )
            // fontes/g/CanecaSemantico.g:579:4: ^( DIVISAO . . )
            {
            match(input,DIVISAO,FOLLOW_DIVISAO_in_expressaoDivisao1718); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:588:1: terminarExpressaoDivisao : ^( DIVISAO . . ) ;
    public final void terminarExpressaoDivisao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:589:2: ( ^( DIVISAO . . ) )
            // fontes/g/CanecaSemantico.g:589:4: ^( DIVISAO . . )
            {
            match(input,DIVISAO,FOLLOW_DIVISAO_in_terminarExpressaoDivisao1739); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:596:1: expressaoRestoDaDivisao : ^( RESTO_DA_DIVISAO . . ) ;
    public final void expressaoRestoDaDivisao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:597:2: ( ^( RESTO_DA_DIVISAO . . ) )
            // fontes/g/CanecaSemantico.g:597:4: ^( RESTO_DA_DIVISAO . . )
            {
            match(input,RESTO_DA_DIVISAO,FOLLOW_RESTO_DA_DIVISAO_in_expressaoRestoDaDivisao1760); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:606:1: terminarExpressaoRestoDaDivisao : ^( RESTO_DA_DIVISAO . . ) ;
    public final void terminarExpressaoRestoDaDivisao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:607:2: ( ^( RESTO_DA_DIVISAO . . ) )
            // fontes/g/CanecaSemantico.g:607:4: ^( RESTO_DA_DIVISAO . . )
            {
            match(input,RESTO_DA_DIVISAO,FOLLOW_RESTO_DA_DIVISAO_in_terminarExpressaoRestoDaDivisao1781); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:614:1: expressaoNegativacao : ^( NEGATIVACAO_ . ) ;
    public final void expressaoNegativacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:615:2: ( ^( NEGATIVACAO_ . ) )
            // fontes/g/CanecaSemantico.g:615:4: ^( NEGATIVACAO_ . )
            {
            match(input,NEGATIVACAO_,FOLLOW_NEGATIVACAO__in_expressaoNegativacao1802); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:624:1: terminarExpressaoNegativacao : ^( NEGATIVACAO_ . ) ;
    public final void terminarExpressaoNegativacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:625:2: ( ^( NEGATIVACAO_ . ) )
            // fontes/g/CanecaSemantico.g:625:4: ^( NEGATIVACAO_ . )
            {
            match(input,NEGATIVACAO_,FOLLOW_NEGATIVACAO__in_terminarExpressaoNegativacao1821); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:632:1: expressaoNegacao : ^( NEGACAO . ) ;
    public final void expressaoNegacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:633:2: ( ^( NEGACAO . ) )
            // fontes/g/CanecaSemantico.g:633:4: ^( NEGACAO . )
            {
            match(input,NEGACAO,FOLLOW_NEGACAO_in_expressaoNegacao1840); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:642:1: terminarExpressaoNegacao : ^( NEGACAO . ) ;
    public final void terminarExpressaoNegacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:643:2: ( ^( NEGACAO . ) )
            // fontes/g/CanecaSemantico.g:643:4: ^( NEGACAO . )
            {
            match(input,NEGACAO,FOLLOW_NEGACAO_in_terminarExpressaoNegacao1859); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:650:1: expressaoPrimaria : ( VALOR_BOOLEANO | VALOR_NULO | CONSTANTE_INTEIRA | CONSTANTE_REAL | LITERAL_CARACTERE | LITERAL_TEXTO );
    public final void expressaoPrimaria() throws RecognitionException {
        CommonTree VALOR_BOOLEANO11=null;
        CommonTree VALOR_NULO12=null;
        CommonTree CONSTANTE_INTEIRA13=null;
        CommonTree CONSTANTE_REAL14=null;
        CommonTree LITERAL_CARACTERE15=null;
        CommonTree LITERAL_TEXTO16=null;

        try {
            // fontes/g/CanecaSemantico.g:651:2: ( VALOR_BOOLEANO | VALOR_NULO | CONSTANTE_INTEIRA | CONSTANTE_REAL | LITERAL_CARACTERE | LITERAL_TEXTO )
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
                    // fontes/g/CanecaSemantico.g:651:4: VALOR_BOOLEANO
                    {
                    VALOR_BOOLEANO11=(CommonTree)match(input,VALOR_BOOLEANO,FOLLOW_VALOR_BOOLEANO_in_expressaoPrimaria1877); if (state.failed) return ;

                    if ( state.backtracking==1 ) {
                    			mostrar((VALOR_BOOLEANO11!=null?VALOR_BOOLEANO11.getText():null));
                    			escopoAtual.definirExpressao(new ExpressaoValorBooleano(escopoAtual, (VALOR_BOOLEANO11!=null?VALOR_BOOLEANO11.getText():null)));
                    		}

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemantico.g:656:4: VALOR_NULO
                    {
                    VALOR_NULO12=(CommonTree)match(input,VALOR_NULO,FOLLOW_VALOR_NULO_in_expressaoPrimaria1886); if (state.failed) return ;

                    if ( state.backtracking==1 ) {
                    			mostrar((VALOR_NULO12!=null?VALOR_NULO12.getText():null));
                    			escopoAtual.definirExpressao(new ExpressaoValorNulo(escopoAtual, (VALOR_NULO12!=null?VALOR_NULO12.getText():null)));
                    		}

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemantico.g:661:4: CONSTANTE_INTEIRA
                    {
                    CONSTANTE_INTEIRA13=(CommonTree)match(input,CONSTANTE_INTEIRA,FOLLOW_CONSTANTE_INTEIRA_in_expressaoPrimaria1895); if (state.failed) return ;

                    if ( state.backtracking==1 ) {
                    			mostrar((CONSTANTE_INTEIRA13!=null?CONSTANTE_INTEIRA13.getText():null));
                    			escopoAtual.definirExpressao(new ExpressaoConstanteInteira(escopoAtual, (CONSTANTE_INTEIRA13!=null?CONSTANTE_INTEIRA13.getText():null)));
                    		}

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSemantico.g:666:4: CONSTANTE_REAL
                    {
                    CONSTANTE_REAL14=(CommonTree)match(input,CONSTANTE_REAL,FOLLOW_CONSTANTE_REAL_in_expressaoPrimaria1904); if (state.failed) return ;

                    if ( state.backtracking==1 ) {
                    			mostrar((CONSTANTE_REAL14!=null?CONSTANTE_REAL14.getText():null));
                    			escopoAtual.definirExpressao(new ExpressaoConstanteReal(escopoAtual, (CONSTANTE_REAL14!=null?CONSTANTE_REAL14.getText():null)));
                    		}

                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSemantico.g:671:4: LITERAL_CARACTERE
                    {
                    LITERAL_CARACTERE15=(CommonTree)match(input,LITERAL_CARACTERE,FOLLOW_LITERAL_CARACTERE_in_expressaoPrimaria1913); if (state.failed) return ;

                    if ( state.backtracking==1 ) {
                    			mostrar((LITERAL_CARACTERE15!=null?LITERAL_CARACTERE15.getText():null));
                    			escopoAtual.definirExpressao(new ExpressaoLiteralCaractere(escopoAtual, (LITERAL_CARACTERE15!=null?LITERAL_CARACTERE15.getText():null)));
                    		}

                    }
                    break;
                case 6 :
                    // fontes/g/CanecaSemantico.g:676:4: LITERAL_TEXTO
                    {
                    LITERAL_TEXTO16=(CommonTree)match(input,LITERAL_TEXTO,FOLLOW_LITERAL_TEXTO_in_expressaoPrimaria1922); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:683:1: comando : ^( COMANDO_ . ( . )* ) ;
    public final void comando() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:684:2: ( ^( COMANDO_ . ( . )* ) )
            // fontes/g/CanecaSemantico.g:684:4: ^( COMANDO_ . ( . )* )
            {
            match(input,COMANDO_,FOLLOW_COMANDO__in_comando1938); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:684:17: ( . )*
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
            	    // fontes/g/CanecaSemantico.g:684:18: .
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
    // fontes/g/CanecaSemantico.g:693:1: terminarComando : ^( COMANDO_ . ( . )* ) ;
    public final void terminarComando() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:694:2: ( ^( COMANDO_ . ( . )* ) )
            // fontes/g/CanecaSemantico.g:694:4: ^( COMANDO_ . ( . )* )
            {
            match(input,COMANDO_,FOLLOW_COMANDO__in_terminarComando1962); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:694:17: ( . )*
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
            	    // fontes/g/CanecaSemantico.g:694:18: .
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
    // fontes/g/CanecaSemantico.g:702:1: referencia : ( ^( REFERENCIA_ ESSE ) | ^( REFERENCIA_ ESSA ) | ^( REFERENCIA_ IDENTIFICADOR ) );
    public final void referencia() throws RecognitionException {
        CommonTree ESSE17=null;
        CommonTree ESSA18=null;
        CommonTree IDENTIFICADOR19=null;

        try {
            // fontes/g/CanecaSemantico.g:703:2: ( ^( REFERENCIA_ ESSE ) | ^( REFERENCIA_ ESSA ) | ^( REFERENCIA_ IDENTIFICADOR ) )
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
                    // fontes/g/CanecaSemantico.g:703:4: ^( REFERENCIA_ ESSE )
                    {
                    match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_referencia1986); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    ESSE17=(CommonTree)match(input,ESSE,FOLLOW_ESSE_in_referencia1988); if (state.failed) return ;

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
                    // fontes/g/CanecaSemantico.g:710:4: ^( REFERENCIA_ ESSA )
                    {
                    match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_referencia1999); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    ESSA18=(CommonTree)match(input,ESSA,FOLLOW_ESSA_in_referencia2001); if (state.failed) return ;

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
                    // fontes/g/CanecaSemantico.g:717:4: ^( REFERENCIA_ IDENTIFICADOR )
                    {
                    match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_referencia2012); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    IDENTIFICADOR19=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_referencia2014); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:726:1: referenciaDeMetodo : ^( REFERENCIA_ IDENTIFICADOR ( . )+ ) ;
    public final void referenciaDeMetodo() throws RecognitionException {
        CommonTree IDENTIFICADOR20=null;

        try {
            // fontes/g/CanecaSemantico.g:727:2: ( ^( REFERENCIA_ IDENTIFICADOR ( . )+ ) )
            // fontes/g/CanecaSemantico.g:727:4: ^( REFERENCIA_ IDENTIFICADOR ( . )+ )
            {
            match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_referenciaDeMetodo2031); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            IDENTIFICADOR20=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_referenciaDeMetodo2033); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:727:32: ( . )+
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
            	    // fontes/g/CanecaSemantico.g:727:32: .
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
    // fontes/g/CanecaSemantico.g:737:1: terminarReferenciaDeMetodo : ^( REFERENCIA_ IDENTIFICADOR ( . )+ ) ;
    public final void terminarReferenciaDeMetodo() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:738:2: ( ^( REFERENCIA_ IDENTIFICADOR ( . )+ ) )
            // fontes/g/CanecaSemantico.g:738:4: ^( REFERENCIA_ IDENTIFICADOR ( . )+ )
            {
            match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_terminarReferenciaDeMetodo2053); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_terminarReferenciaDeMetodo2055); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:738:32: ( . )+
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
            	    // fontes/g/CanecaSemantico.g:738:32: .
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
    // fontes/g/CanecaSemantico.g:745:1: instanciacao : ^( INSTANCIACAO_ tipo . ) ;
    public final void instanciacao() throws RecognitionException {
        Tipo tipo21 =null;


        try {
            // fontes/g/CanecaSemantico.g:746:2: ( ^( INSTANCIACAO_ tipo . ) )
            // fontes/g/CanecaSemantico.g:746:4: ^( INSTANCIACAO_ tipo . )
            {
            match(input,INSTANCIACAO_,FOLLOW_INSTANCIACAO__in_instanciacao2075); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tipo_in_instanciacao2077);
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
    // fontes/g/CanecaSemantico.g:756:1: terminarInstanciacao : ^( INSTANCIACAO_ tipo . ) ;
    public final void terminarInstanciacao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:757:2: ( ^( INSTANCIACAO_ tipo . ) )
            // fontes/g/CanecaSemantico.g:757:4: ^( INSTANCIACAO_ tipo . )
            {
            match(input,INSTANCIACAO_,FOLLOW_INSTANCIACAO__in_terminarInstanciacao2096); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tipo_in_terminarInstanciacao2098);
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
    // fontes/g/CanecaSemantico.g:764:1: chamada : ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ) ;
    public final void chamada() throws RecognitionException {
        CommonTree IDENTIFICADOR22=null;

        try {
            // fontes/g/CanecaSemantico.g:765:2: ( ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ) )
            // fontes/g/CanecaSemantico.g:765:4: ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR )
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
            IDENTIFICADOR22=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_chamada2125); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:774:1: chamadaDeMetodo : ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( . )+ ) ;
    public final void chamadaDeMetodo() throws RecognitionException {
        CommonTree IDENTIFICADOR23=null;

        try {
            // fontes/g/CanecaSemantico.g:775:2: ( ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( . )+ ) )
            // fontes/g/CanecaSemantico.g:775:4: ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( . )+ )
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
            IDENTIFICADOR23=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_chamadaDeMetodo2150); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:775:60: ( . )+
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
            	    // fontes/g/CanecaSemantico.g:775:60: .
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
    // fontes/g/CanecaSemantico.g:785:1: terminarChamadaDeMetodo : ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( . )+ ) ;
    public final void terminarChamadaDeMetodo() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:786:2: ( ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( . )+ ) )
            // fontes/g/CanecaSemantico.g:786:4: ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( . )+ )
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
            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_terminarChamadaDeMetodo2178); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:786:60: ( . )+
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
            	    // fontes/g/CanecaSemantico.g:786:60: .
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
    // fontes/g/CanecaSemantico.g:793:1: destruicao : ^( DESTRUICAO_ . ) ;
    public final void destruicao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:794:2: ( ^( DESTRUICAO_ . ) )
            // fontes/g/CanecaSemantico.g:794:4: ^( DESTRUICAO_ . )
            {
            match(input,DESTRUICAO_,FOLLOW_DESTRUICAO__in_destruicao2198); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:803:1: terminarDestruicao : ^( DESTRUICAO_ . ) ;
    public final void terminarDestruicao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:804:2: ( ^( DESTRUICAO_ . ) )
            // fontes/g/CanecaSemantico.g:804:4: ^( DESTRUICAO_ . )
            {
            match(input,DESTRUICAO_,FOLLOW_DESTRUICAO__in_terminarDestruicao2217); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:811:1: retorno : ^( RETORNO_ . ) ;
    public final void retorno() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:812:2: ( ^( RETORNO_ . ) )
            // fontes/g/CanecaSemantico.g:812:4: ^( RETORNO_ . )
            {
            match(input,RETORNO_,FOLLOW_RETORNO__in_retorno2237); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:821:1: terminarRetorno : ^( RETORNO_ . ) ;
    public final void terminarRetorno() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:822:2: ( ^( RETORNO_ . ) )
            // fontes/g/CanecaSemantico.g:822:4: ^( RETORNO_ . )
            {
            match(input,RETORNO_,FOLLOW_RETORNO__in_terminarRetorno2256); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:829:1: se : ^( SE_ . . ( . )? ) ;
    public final void se() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:830:2: ( ^( SE_ . . ( . )? ) )
            // fontes/g/CanecaSemantico.g:830:4: ^( SE_ . . ( . )? )
            {
            match(input,SE_,FOLLOW_SE__in_se2275); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:830:14: ( . )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0 >= ATRIBUIDOR && LA31_0 <= UNIDADE_)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:830:14: .
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
    // fontes/g/CanecaSemantico.g:839:1: terminarSe : ^( SE_ . . ( . )? ) ;
    public final void terminarSe() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:840:2: ( ^( SE_ . . ( . )? ) )
            // fontes/g/CanecaSemantico.g:840:4: ^( SE_ . . ( . )? )
            {
            match(input,SE_,FOLLOW_SE__in_terminarSe2299); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            // fontes/g/CanecaSemantico.g:840:14: ( . )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0 >= ATRIBUIDOR && LA32_0 <= UNIDADE_)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // fontes/g/CanecaSemantico.g:840:14: .
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
    // fontes/g/CanecaSemantico.g:847:1: para : ^( PARA_ . . . . ) ;
    public final void para() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:848:2: ( ^( PARA_ . . . . ) )
            // fontes/g/CanecaSemantico.g:848:4: ^( PARA_ . . . . )
            {
            match(input,PARA_,FOLLOW_PARA__in_para2323); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:857:1: terminarPara : ^( PARA_ . . . . ) ;
    public final void terminarPara() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:858:2: ( ^( PARA_ . . . . ) )
            // fontes/g/CanecaSemantico.g:858:4: ^( PARA_ . . . . )
            {
            match(input,PARA_,FOLLOW_PARA__in_terminarPara2348); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:865:1: repita : ^( REPITA_ . . . ) ;
    public final void repita() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:866:2: ( ^( REPITA_ . . . ) )
            // fontes/g/CanecaSemantico.g:866:4: ^( REPITA_ . . . )
            {
            match(input,REPITA_,FOLLOW_REPITA__in_repita2373); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:875:1: terminarRepita : ^( REPITA_ . . . ) ;
    public final void terminarRepita() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:876:2: ( ^( REPITA_ . . . ) )
            // fontes/g/CanecaSemantico.g:876:4: ^( REPITA_ . . . )
            {
            match(input,REPITA_,FOLLOW_REPITA__in_terminarRepita2396); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:883:1: enquanto : ^( ENQUANTO_ . . ) ;
    public final void enquanto() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:884:2: ( ^( ENQUANTO_ . . ) )
            // fontes/g/CanecaSemantico.g:884:4: ^( ENQUANTO_ . . )
            {
            match(input,ENQUANTO_,FOLLOW_ENQUANTO__in_enquanto2419); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:893:1: terminarEnquanto : ^( ENQUANTO_ . . ) ;
    public final void terminarEnquanto() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:894:2: ( ^( ENQUANTO_ . . ) )
            // fontes/g/CanecaSemantico.g:894:4: ^( ENQUANTO_ . . )
            {
            match(input,ENQUANTO_,FOLLOW_ENQUANTO__in_terminarEnquanto2440); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:901:1: tente : ^( TENTE_ . . ) ;
    public final void tente() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:902:2: ( ^( TENTE_ . . ) )
            // fontes/g/CanecaSemantico.g:902:4: ^( TENTE_ . . )
            {
            match(input,TENTE_,FOLLOW_TENTE__in_tente2461); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:911:1: terminarTente : ^( TENTE_ . . ) ;
    public final void terminarTente() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:912:2: ( ^( TENTE_ . . ) )
            // fontes/g/CanecaSemantico.g:912:4: ^( TENTE_ . . )
            {
            match(input,TENTE_,FOLLOW_TENTE__in_terminarTente2482); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:919:1: capture : ^( CAPTURE_ . . ) ;
    public final void capture() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:920:2: ( ^( CAPTURE_ . . ) )
            // fontes/g/CanecaSemantico.g:920:4: ^( CAPTURE_ . . )
            {
            match(input,CAPTURE_,FOLLOW_CAPTURE__in_capture2503); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:929:1: terminarCapture : ^( CAPTURE_ . . ) ;
    public final void terminarCapture() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:930:2: ( ^( CAPTURE_ . . ) )
            // fontes/g/CanecaSemantico.g:930:4: ^( CAPTURE_ . . )
            {
            match(input,CAPTURE_,FOLLOW_CAPTURE__in_terminarCapture2524); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:937:1: lance : ^( LANCE_ . ) ;
    public final void lance() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:938:2: ( ^( LANCE_ . ) )
            // fontes/g/CanecaSemantico.g:938:4: ^( LANCE_ . )
            {
            match(input,LANCE_,FOLLOW_LANCE__in_lance2545); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:947:1: terminarLance : ^( LANCE_ . ) ;
    public final void terminarLance() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:948:2: ( ^( LANCE_ . ) )
            // fontes/g/CanecaSemantico.g:948:4: ^( LANCE_ . )
            {
            match(input,LANCE_,FOLLOW_LANCE__in_terminarLance2564); if (state.failed) return ;

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
    // fontes/g/CanecaSemantico.g:955:1: bloco : ^( INSTRUCOES_ ( . )* ) ;
    public final void bloco() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:956:2: ( ^( INSTRUCOES_ ( . )* ) )
            // fontes/g/CanecaSemantico.g:956:4: ^( INSTRUCOES_ ( . )* )
            {
            match(input,INSTRUCOES_,FOLLOW_INSTRUCOES__in_bloco2583); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:956:18: ( . )*
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
                	    // fontes/g/CanecaSemantico.g:956:19: .
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
    // fontes/g/CanecaSemantico.g:965:1: terminarBloco : ^( INSTRUCOES_ ( . )* ) ;
    public final void terminarBloco() throws RecognitionException {
        try {
            // fontes/g/CanecaSemantico.g:966:2: ( ^( INSTRUCOES_ ( . )* ) )
            // fontes/g/CanecaSemantico.g:966:4: ^( INSTRUCOES_ ( . )* )
            {
            match(input,INSTRUCOES_,FOLLOW_INSTRUCOES__in_terminarBloco2605); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemantico.g:966:18: ( . )*
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
                	    // fontes/g/CanecaSemantico.g:966:19: .
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
        "\1\u0081\1\2\1\127\1\2\1\162\1\2\1\43\1\3\1\151\1\2\1\3\1\2\1\3"+
        "\1\42\1\134\1\43\1\3\2\uffff\4\3";
    static final String DFA4_maxS =
        "\1\u0081\1\2\1\127\1\2\1\162\1\2\1\43\1\3\1\151\1\2\1\150\1\2\1"+
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
            return "171:1: unicadeDeCompilacao : ( ^( UNIDADE_ cabecalho classe ) | ^( UNIDADE_ cabecalho interfaces ) );";
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
    public static final BitSet FOLLOW_destruicao_in_topdown130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retorno_in_topdown135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoAtribuicao_in_topdown140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoOu_in_topdown145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoE_in_topdown150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoIgual_in_topdown155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoDiferente_in_topdown160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoMaior_in_topdown165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoMaiorIgual_in_topdown170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoMenor_in_topdown175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoMenorIgual_in_topdown180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoSoma_in_topdown185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoSubtracao_in_topdown190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoMultiplicacao_in_topdown195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoDivisao_in_topdown200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoRestoDaDivisao_in_topdown205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoNegativacao_in_topdown210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoNegacao_in_topdown215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoPrimaria_in_topdown220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comando_in_topdown225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_referencia_in_topdown230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_referenciaDeMetodo_in_topdown235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanciacao_in_topdown240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chamada_in_topdown245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chamadaDeMetodo_in_topdown250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminaClasse_in_bottomup261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarConstrutor_in_bottomup266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarDestrutor_in_bottomup271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarMetodo_in_bottomup276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarBloco_in_bottomup281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarSe_in_bottomup286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarPara_in_bottomup291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarRepita_in_bottomup296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarEnquanto_in_bottomup301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarTente_in_bottomup306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarCapture_in_bottomup311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarLance_in_bottomup316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarDestruicao_in_bottomup321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarRetorno_in_bottomup326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoAtribuicao_in_bottomup331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoOu_in_bottomup336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoE_in_bottomup341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoIgual_in_bottomup346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoDiferente_in_bottomup351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoMaior_in_bottomup356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoMaiorIgual_in_bottomup361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoMenor_in_bottomup366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoMenorIgual_in_bottomup371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoSoma_in_bottomup376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoSubtracao_in_bottomup381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoMultiplicacao_in_bottomup386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoDivisao_in_bottomup391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoRestoDaDivisao_in_bottomup396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoNegativacao_in_bottomup401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoNegacao_in_bottomup406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarComando_in_bottomup411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarReferenciaDeMetodo_in_bottomup416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarInstanciacao_in_bottomup421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarChamadaDeMetodo_in_bottomup426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROGRAMA__in_programa438 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_unicadeDeCompilacao_in_programa441 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_UNIDADE__in_unicadeDeCompilacao456 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_cabecalho_in_unicadeDeCompilacao458 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_classe_in_unicadeDeCompilacao460 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNIDADE__in_unicadeDeCompilacao467 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_cabecalho_in_unicadeDeCompilacao469 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_interfaces_in_unicadeDeCompilacao471 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CABECALHO__in_cabecalho484 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pacote_in_cabecalho486 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_importacoes_in_cabecalho488 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PACOTE__in_pacote501 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_DE_PACOTE_in_pacote503 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORTACOES__in_importacoes516 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_importacao_in_importacoes519 = new BitSet(new long[]{0x0000000000000008L,0x0000010000000000L});
    public static final BitSet FOLLOW_IMPORTACAO__in_importacao534 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_importacao536 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao538 = new BitSet(new long[]{0x0000000400000008L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_importacao541 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORTACAO__in_importacao550 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao552 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASSE__in_classe565 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoFeminino_in_classe567 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_classe569 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_listaDeTiposGenericos_in_classe571 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_classe573 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_CLASSE__in_terminaClasse592 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoFeminino_in_terminaClasse594 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_terminaClasse596 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_listaDeTiposGenericos_in_terminaClasse598 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_terminaClasse600 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_INTERFACE__in_interfaces619 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoFeminino_in_interfaces621 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_interfaces623 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_listaDeTiposGenericos_in_interfaces625 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_interfaces627 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_corpoDaInterface_in_interfaces629 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CORPO__in_corpoDaClasse642 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atributos_in_corpoDaClasse644 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_construtores_in_corpoDaClasse646 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_destrutor_in_corpoDaClasse648 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_metodos_in_corpoDaClasse650 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CORPO__in_corpoDaInterface663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atributos_in_corpoDaInterface665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_assinaturasDeMetodos_in_corpoDaInterface667 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATRIBUTOS__in_atributos680 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atributo_in_atributos683 = new BitSet(new long[]{0x0000000000000008L,0x0000000000400000L});
    public static final BitSet FOLLOW_CONSTRUTORES__in_construtores698 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_construtor_in_construtores701 = new BitSet(new long[]{0x0000000000000008L,0x0000000080000000L});
    public static final BitSet FOLLOW_METODOS__in_metodos716 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_metodo_in_metodos719 = new BitSet(new long[]{0x0000000000000008L,0x0001000000000000L});
    public static final BitSet FOLLOW_ASSINATURAS_DE_METODOS__in_assinaturasDeMetodos734 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_assinaturasDeMetodos738 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_assinaturasDeMetodos740 = new BitSet(new long[]{0x0000000100000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_ESTATICO_in_assinaturasDeMetodos743 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_tipo_in_assinaturasDeMetodos747 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_assinaturasDeMetodos749 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_ATRIBUTO__in_atributo767 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_atributo769 = new BitSet(new long[]{0x0000000100000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_ESTATICO_in_atributo772 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_tipo_in_atributo776 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_atributo778 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_CONSTRUTOR__in_construtor800 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_construtor804 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_construtor806 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_construtor808 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_CONSTRUTOR__in_terminarConstrutor830 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_terminarConstrutor834 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_terminarConstrutor836 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_terminarConstrutor838 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_DESTRUTOR__in_destrutor860 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_destrutor863 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_destrutor865 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_destrutor867 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_DESTRUTOR__in_terminarDestrutor889 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_terminarDestrutor892 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_terminarDestrutor894 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_terminarDestrutor896 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_METODO__in_metodo918 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_metodo921 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_metodo923 = new BitSet(new long[]{0x0000000100000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_ESTATICO_in_metodo926 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_tipo_in_metodo930 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_metodo932 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_METODO__in_terminarMetodo954 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_terminarMetodo957 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_terminarMetodo959 = new BitSet(new long[]{0x0000000100000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_ESTATICO_in_terminarMetodo962 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_tipo_in_terminarMetodo966 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_terminarMetodo968 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_PARAMETROS__in_listaDeParametros1032 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARGUMENTOS__in_listaDeArgumentosVazia1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGUMENTOS__in_listaDeArgumentos1061 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTERFACES__in_listaDeInterfaces1079 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_listaDeInterfaces1082 = new BitSet(new long[]{0x0000000000000008L,0x8000000000000000L});
    public static final BitSet FOLLOW_TIPOS_GENERICOS__in_listaDeTiposGenericos1097 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipoGenerico_in_listaDeTiposGenericos1100 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_TIPOS__in_listaDeTipos1115 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_listaDeTipos1118 = new BitSet(new long[]{0x0000000000000008L,0x8000000000000000L});
    public static final BitSet FOLLOW_CAPTURAS__in_listaDeCapturas1133 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_capture_in_listaDeCapturas1136 = new BitSet(new long[]{0x0000000000000008L,0x0000000002000000L});
    public static final BitSet FOLLOW_TIPO_GENERICO__in_tipoGenerico1151 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_tipoGenerico1153 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_tipoGenerico1155 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIPO__in_tipo1172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_tipo1174 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_listaDeTipos_in_tipo1176 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARACAO__in_declaracao1193 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_declaracao1195 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_declaracao1197 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATRIBUIDOR_in_expressaoAtribuicao1214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ATRIBUIDOR_in_terminarExpressaoAtribuicao1235 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OU_in_expressaoOu1256 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OU_in_terminarExpressaoOu1277 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_E_in_expressaoE1298 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_E_in_terminarExpressaoE1319 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IGUAL_in_expressaoIgual1340 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IGUAL_in_terminarExpressaoIgual1361 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIFERENTE_in_expressaoDiferente1382 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIFERENTE_in_terminarExpressaoDiferente1403 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MAIOR_in_expressaoMaior1424 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MAIOR_in_terminarExpressaoMaior1445 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MAIOR_IGUAL_in_expressaoMaiorIgual1466 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MAIOR_IGUAL_in_terminarExpressaoMaiorIgual1487 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MENOR_in_expressaoMenor1508 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MENOR_in_terminarExpressaoMenor1529 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MENOR_IGUAL_in_expressaoMenorIgual1550 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MENOR_IGUAL_in_terminarExpressaoMenorIgual1571 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SOMA_in_expressaoSoma1592 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SOMA_in_terminarExpressaoSoma1613 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBTRACAO_in_expressaoSubtracao1634 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBTRACAO_in_terminarExpressaoSubtracao1655 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MULTIPLICACAO_in_expressaoMultiplicacao1676 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MULTIPLICACAO_in_terminarExpressaoMultiplicacao1697 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIVISAO_in_expressaoDivisao1718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIVISAO_in_terminarExpressaoDivisao1739 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RESTO_DA_DIVISAO_in_expressaoRestoDaDivisao1760 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RESTO_DA_DIVISAO_in_terminarExpressaoRestoDaDivisao1781 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEGATIVACAO__in_expressaoNegativacao1802 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEGATIVACAO__in_terminarExpressaoNegativacao1821 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEGACAO_in_expressaoNegacao1840 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEGACAO_in_terminarExpressaoNegacao1859 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VALOR_BOOLEANO_in_expressaoPrimaria1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALOR_NULO_in_expressaoPrimaria1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTE_INTEIRA_in_expressaoPrimaria1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTE_REAL_in_expressaoPrimaria1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_CARACTERE_in_expressaoPrimaria1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_TEXTO_in_expressaoPrimaria1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMANDO__in_comando1938 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_COMANDO__in_terminarComando1962 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_REFERENCIA__in_referencia1986 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ESSE_in_referencia1988 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REFERENCIA__in_referencia1999 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ESSA_in_referencia2001 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REFERENCIA__in_referencia2012 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_referencia2014 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REFERENCIA__in_referenciaDeMetodo2031 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_referenciaDeMetodo2033 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_REFERENCIA__in_terminarReferenciaDeMetodo2053 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_terminarReferenciaDeMetodo2055 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_INSTANCIACAO__in_instanciacao2075 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_instanciacao2077 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_INSTANCIACAO__in_terminarInstanciacao2096 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_terminarInstanciacao2098 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_set_in_chamada2117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_chamada2125 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_chamadaDeMetodo2142 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_chamadaDeMetodo2150 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_set_in_terminarChamadaDeMetodo2170 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_terminarChamadaDeMetodo2178 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_DESTRUICAO__in_destruicao2198 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DESTRUICAO__in_terminarDestruicao2217 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RETORNO__in_retorno2237 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RETORNO__in_terminarRetorno2256 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SE__in_se2275 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SE__in_terminarSe2299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PARA__in_para2323 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PARA__in_terminarPara2348 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_REPITA__in_repita2373 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_REPITA__in_terminarRepita2396 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ENQUANTO__in_enquanto2419 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ENQUANTO__in_terminarEnquanto2440 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TENTE__in_tente2461 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TENTE__in_terminarTente2482 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CAPTURE__in_capture2503 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CAPTURE__in_terminarCapture2524 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LANCE__in_lance2545 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LANCE__in_terminarLance2564 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INSTRUCOES__in_bloco2583 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INSTRUCOES__in_terminarBloco2605 = new BitSet(new long[]{0x0000000000000004L});

}