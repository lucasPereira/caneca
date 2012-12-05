// $ANTLR 3.4 fontes/g/CanecaSemanticoExpressoes.g 2012-12-05 02:33:05

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


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CanecaSemanticoExpressoes extends TreeFilter {
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


    public CanecaSemanticoExpressoes(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public CanecaSemanticoExpressoes(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return CanecaSemanticoExpressoes.tokenNames; }
    public String getGrammarFileName() { return "fontes/g/CanecaSemanticoExpressoes.g"; }


    	private Escopo escopoAtual;
    	private Escopo referencia;
    	private Tipo ultimaDeclaracao;
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
    		Reporter.fornecerInstancia().reportarErro(String.format("[%s] [%s, %s] tipo inválido.", tipo.fornecerNome(), tipo.fornecerLinha(), tipo.fornecerColuna()), escopoAtual);
    	}



    // $ANTLR start "topdown"
    // fontes/g/CanecaSemanticoExpressoes.g:63:1: topdown : ( iniciarClasse | iniciarMetodo | iniciarConstrutor | iniciarDestrutor | iniciarBloco | iniciarExpressao | iniciarExpressaoOuLogico | iniciarExpressaoELogico | iniciarExpressaoComparativaAritmetica | iniciarExpressaoComparativa | iniciarExpressaoAditiva | iniciarExpressaoMultiplicativa | expressaoUnaria );
    public final void topdown() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:64:2: ( iniciarClasse | iniciarMetodo | iniciarConstrutor | iniciarDestrutor | iniciarBloco | iniciarExpressao | iniciarExpressaoOuLogico | iniciarExpressaoELogico | iniciarExpressaoComparativaAritmetica | iniciarExpressaoComparativa | iniciarExpressaoAditiva | iniciarExpressaoMultiplicativa | expressaoUnaria )
            int alt1=13;
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
            case ATRIBUIDOR:
                {
                alt1=6;
                }
                break;
            case OU:
                {
                alt1=7;
                }
                break;
            case E:
                {
                alt1=8;
                }
                break;
            case MAIOR:
            case MAIOR_IGUAL:
            case MENOR:
            case MENOR_IGUAL:
                {
                alt1=9;
                }
                break;
            case DIFERENTE:
            case IGUAL:
                {
                alt1=10;
                }
                break;
            case SOMA:
            case SUBTRACAO:
                {
                alt1=11;
                }
                break;
            case DIVISAO:
            case MULTIPLICACAO:
            case RESTO_DA_DIVISAO:
                {
                alt1=12;
                }
                break;
            case NEGACAO:
            case PRIMARIA_:
            case SUBTRACAO_UNARIA_:
                {
                alt1=13;
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
                    // fontes/g/CanecaSemanticoExpressoes.g:64:4: iniciarClasse
                    {
                    pushFollow(FOLLOW_iniciarClasse_in_topdown55);
                    iniciarClasse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemanticoExpressoes.g:65:4: iniciarMetodo
                    {
                    pushFollow(FOLLOW_iniciarMetodo_in_topdown60);
                    iniciarMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemanticoExpressoes.g:66:4: iniciarConstrutor
                    {
                    pushFollow(FOLLOW_iniciarConstrutor_in_topdown65);
                    iniciarConstrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSemanticoExpressoes.g:67:4: iniciarDestrutor
                    {
                    pushFollow(FOLLOW_iniciarDestrutor_in_topdown70);
                    iniciarDestrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSemanticoExpressoes.g:68:4: iniciarBloco
                    {
                    pushFollow(FOLLOW_iniciarBloco_in_topdown75);
                    iniciarBloco();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // fontes/g/CanecaSemanticoExpressoes.g:69:4: iniciarExpressao
                    {
                    pushFollow(FOLLOW_iniciarExpressao_in_topdown80);
                    iniciarExpressao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // fontes/g/CanecaSemanticoExpressoes.g:70:4: iniciarExpressaoOuLogico
                    {
                    pushFollow(FOLLOW_iniciarExpressaoOuLogico_in_topdown85);
                    iniciarExpressaoOuLogico();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // fontes/g/CanecaSemanticoExpressoes.g:71:4: iniciarExpressaoELogico
                    {
                    pushFollow(FOLLOW_iniciarExpressaoELogico_in_topdown90);
                    iniciarExpressaoELogico();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // fontes/g/CanecaSemanticoExpressoes.g:72:4: iniciarExpressaoComparativaAritmetica
                    {
                    pushFollow(FOLLOW_iniciarExpressaoComparativaAritmetica_in_topdown95);
                    iniciarExpressaoComparativaAritmetica();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // fontes/g/CanecaSemanticoExpressoes.g:73:4: iniciarExpressaoComparativa
                    {
                    pushFollow(FOLLOW_iniciarExpressaoComparativa_in_topdown100);
                    iniciarExpressaoComparativa();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // fontes/g/CanecaSemanticoExpressoes.g:74:4: iniciarExpressaoAditiva
                    {
                    pushFollow(FOLLOW_iniciarExpressaoAditiva_in_topdown105);
                    iniciarExpressaoAditiva();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // fontes/g/CanecaSemanticoExpressoes.g:75:4: iniciarExpressaoMultiplicativa
                    {
                    pushFollow(FOLLOW_iniciarExpressaoMultiplicativa_in_topdown110);
                    iniciarExpressaoMultiplicativa();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // fontes/g/CanecaSemanticoExpressoes.g:76:4: expressaoUnaria
                    {
                    pushFollow(FOLLOW_expressaoUnaria_in_topdown115);
                    expressaoUnaria();

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
    // fontes/g/CanecaSemanticoExpressoes.g:79:1: bottomup : ( terminarClasse | terminarMetodo | terminarConstrutor | terminarDestrutor | terminarBloco | terminarExpressao | terminarExpressaoOuLogico | terminarExpressaoELogico | terminarExpressaoComparativaAritmetica | terminarExpressaoComparativa | terminarExpressaoAditiva | terminarExpressaoMultiplicativa );
    public final void bottomup() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:80:2: ( terminarClasse | terminarMetodo | terminarConstrutor | terminarDestrutor | terminarBloco | terminarExpressao | terminarExpressaoOuLogico | terminarExpressaoELogico | terminarExpressaoComparativaAritmetica | terminarExpressaoComparativa | terminarExpressaoAditiva | terminarExpressaoMultiplicativa )
            int alt2=12;
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
            case ATRIBUIDOR:
                {
                alt2=6;
                }
                break;
            case OU:
                {
                alt2=7;
                }
                break;
            case E:
                {
                alt2=8;
                }
                break;
            case MAIOR:
            case MAIOR_IGUAL:
            case MENOR:
            case MENOR_IGUAL:
                {
                alt2=9;
                }
                break;
            case DIFERENTE:
            case IGUAL:
                {
                alt2=10;
                }
                break;
            case SOMA:
            case SUBTRACAO:
                {
                alt2=11;
                }
                break;
            case DIVISAO:
            case MULTIPLICACAO:
            case RESTO_DA_DIVISAO:
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
                    // fontes/g/CanecaSemanticoExpressoes.g:80:4: terminarClasse
                    {
                    pushFollow(FOLLOW_terminarClasse_in_bottomup126);
                    terminarClasse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemanticoExpressoes.g:81:4: terminarMetodo
                    {
                    pushFollow(FOLLOW_terminarMetodo_in_bottomup131);
                    terminarMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemanticoExpressoes.g:82:4: terminarConstrutor
                    {
                    pushFollow(FOLLOW_terminarConstrutor_in_bottomup136);
                    terminarConstrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSemanticoExpressoes.g:83:4: terminarDestrutor
                    {
                    pushFollow(FOLLOW_terminarDestrutor_in_bottomup141);
                    terminarDestrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSemanticoExpressoes.g:84:4: terminarBloco
                    {
                    pushFollow(FOLLOW_terminarBloco_in_bottomup146);
                    terminarBloco();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // fontes/g/CanecaSemanticoExpressoes.g:85:4: terminarExpressao
                    {
                    pushFollow(FOLLOW_terminarExpressao_in_bottomup151);
                    terminarExpressao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // fontes/g/CanecaSemanticoExpressoes.g:86:4: terminarExpressaoOuLogico
                    {
                    pushFollow(FOLLOW_terminarExpressaoOuLogico_in_bottomup156);
                    terminarExpressaoOuLogico();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // fontes/g/CanecaSemanticoExpressoes.g:87:4: terminarExpressaoELogico
                    {
                    pushFollow(FOLLOW_terminarExpressaoELogico_in_bottomup161);
                    terminarExpressaoELogico();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // fontes/g/CanecaSemanticoExpressoes.g:88:4: terminarExpressaoComparativaAritmetica
                    {
                    pushFollow(FOLLOW_terminarExpressaoComparativaAritmetica_in_bottomup166);
                    terminarExpressaoComparativaAritmetica();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // fontes/g/CanecaSemanticoExpressoes.g:89:4: terminarExpressaoComparativa
                    {
                    pushFollow(FOLLOW_terminarExpressaoComparativa_in_bottomup171);
                    terminarExpressaoComparativa();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // fontes/g/CanecaSemanticoExpressoes.g:90:4: terminarExpressaoAditiva
                    {
                    pushFollow(FOLLOW_terminarExpressaoAditiva_in_bottomup176);
                    terminarExpressaoAditiva();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // fontes/g/CanecaSemanticoExpressoes.g:91:4: terminarExpressaoMultiplicativa
                    {
                    pushFollow(FOLLOW_terminarExpressaoMultiplicativa_in_bottomup181);
                    terminarExpressaoMultiplicativa();

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
    // fontes/g/CanecaSemanticoExpressoes.g:94:1: iniciarClasse : ^( CLASSE_ . IDENTIFICADOR . . . ) ;
    public final void iniciarClasse() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:95:2: ( ^( CLASSE_ . IDENTIFICADOR . . . ) )
            // fontes/g/CanecaSemanticoExpressoes.g:95:4: ^( CLASSE_ . IDENTIFICADOR . . . )
            {
            match(input,CLASSE_,FOLLOW_CLASSE__in_iniciarClasse193); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_iniciarClasse197); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			escopoAtual = filaDeEscopos.poll();
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
    // fontes/g/CanecaSemanticoExpressoes.g:101:1: terminarClasse : CLASSE_ ;
    public final void terminarClasse() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:102:2: ( CLASSE_ )
            // fontes/g/CanecaSemanticoExpressoes.g:102:4: CLASSE_
            {
            match(input,CLASSE_,FOLLOW_CLASSE__in_terminarClasse219); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            			escopoAtual = filaDeEscopos.poll();
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
    // fontes/g/CanecaSemanticoExpressoes.g:108:1: iniciarMetodo : ^( METODO_ ^( ASSINATURA_ . ( ESTATICO )? tipo IDENTIFICADOR . ) . ) ;
    public final void iniciarMetodo() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:109:2: ( ^( METODO_ ^( ASSINATURA_ . ( ESTATICO )? tipo IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemanticoExpressoes.g:109:4: ^( METODO_ ^( ASSINATURA_ . ( ESTATICO )? tipo IDENTIFICADOR . ) . )
            {
            match(input,METODO_,FOLLOW_METODO__in_iniciarMetodo235); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_iniciarMetodo238); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            // fontes/g/CanecaSemanticoExpressoes.g:109:30: ( ESTATICO )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ESTATICO) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // fontes/g/CanecaSemanticoExpressoes.g:109:31: ESTATICO
                    {
                    match(input,ESTATICO,FOLLOW_ESTATICO_in_iniciarMetodo243); if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_iniciarMetodo247);
            tipo();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_iniciarMetodo249); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			escopoAtual = filaDeEscopos.poll();
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
    // fontes/g/CanecaSemanticoExpressoes.g:115:1: terminarMetodo : METODO_ ;
    public final void terminarMetodo() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:116:2: ( METODO_ )
            // fontes/g/CanecaSemanticoExpressoes.g:116:4: METODO_
            {
            match(input,METODO_,FOLLOW_METODO__in_terminarMetodo270); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            			escopoAtual = filaDeEscopos.poll();
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
    // fontes/g/CanecaSemanticoExpressoes.g:122:1: iniciarConstrutor : ^( CONSTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . ) ;
    public final void iniciarConstrutor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:123:2: ( ^( CONSTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemanticoExpressoes.g:123:4: ^( CONSTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . )
            {
            match(input,CONSTRUTOR_,FOLLOW_CONSTRUTOR__in_iniciarConstrutor286); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_iniciarConstrutor289); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_iniciarConstrutor293); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			escopoAtual = filaDeEscopos.poll();
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
    // fontes/g/CanecaSemanticoExpressoes.g:129:1: terminarConstrutor : CONSTRUTOR_ ;
    public final void terminarConstrutor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:130:2: ( CONSTRUTOR_ )
            // fontes/g/CanecaSemanticoExpressoes.g:130:4: CONSTRUTOR_
            {
            match(input,CONSTRUTOR_,FOLLOW_CONSTRUTOR__in_terminarConstrutor314); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            			escopoAtual = filaDeEscopos.poll();
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
    // fontes/g/CanecaSemanticoExpressoes.g:136:1: iniciarDestrutor : ^( DESTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . ) ;
    public final void iniciarDestrutor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:137:2: ( ^( DESTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemanticoExpressoes.g:137:4: ^( DESTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . )
            {
            match(input,DESTRUTOR_,FOLLOW_DESTRUTOR__in_iniciarDestrutor330); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_iniciarDestrutor333); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_iniciarDestrutor337); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			escopoAtual = filaDeEscopos.poll();
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
    // fontes/g/CanecaSemanticoExpressoes.g:143:1: terminarDestrutor : DESTRUTOR_ ;
    public final void terminarDestrutor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:144:2: ( DESTRUTOR_ )
            // fontes/g/CanecaSemanticoExpressoes.g:144:4: DESTRUTOR_
            {
            match(input,DESTRUTOR_,FOLLOW_DESTRUTOR__in_terminarDestrutor358); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            			escopoAtual = filaDeEscopos.poll();
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
    // fontes/g/CanecaSemanticoExpressoes.g:150:1: iniciarBloco : ^( INSTRUCOES_ ( . )* ) ;
    public final void iniciarBloco() throws RecognitionException {
        CommonTree INSTRUCOES_1=null;

        try {
            // fontes/g/CanecaSemanticoExpressoes.g:151:2: ( ^( INSTRUCOES_ ( . )* ) )
            // fontes/g/CanecaSemanticoExpressoes.g:151:4: ^( INSTRUCOES_ ( . )* )
            {
            INSTRUCOES_1=(CommonTree)match(input,INSTRUCOES_,FOLLOW_INSTRUCOES__in_iniciarBloco374); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemanticoExpressoes.g:151:18: ( . )*
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
                	    // fontes/g/CanecaSemanticoExpressoes.g:151:19: .
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
            			if (INSTRUCOES_1.hasAncestor(METODO_)) {
            				escopoAtual = filaDeEscopos.poll();
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
    // fontes/g/CanecaSemanticoExpressoes.g:159:1: terminarBloco : INSTRUCOES_ ;
    public final void terminarBloco() throws RecognitionException {
        CommonTree INSTRUCOES_2=null;

        try {
            // fontes/g/CanecaSemanticoExpressoes.g:160:2: ( INSTRUCOES_ )
            // fontes/g/CanecaSemanticoExpressoes.g:160:4: INSTRUCOES_
            {
            INSTRUCOES_2=(CommonTree)match(input,INSTRUCOES_,FOLLOW_INSTRUCOES__in_terminarBloco395); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            			if (INSTRUCOES_2.hasAncestor(METODO_)) {
            				escopoAtual = filaDeEscopos.poll();
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



    // $ANTLR start "iniciarExpressao"
    // fontes/g/CanecaSemanticoExpressoes.g:168:1: iniciarExpressao : ^( ATRIBUIDOR . . ) ;
    public final void iniciarExpressao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:169:2: ( ^( ATRIBUIDOR . . ) )
            // fontes/g/CanecaSemanticoExpressoes.g:169:4: ^( ATRIBUIDOR . . )
            {
            match(input,ATRIBUIDOR,FOLLOW_ATRIBUIDOR_in_iniciarExpressao411); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			//System.out.println("IEXP");
            			ExpressaoAtribuicao expressao = new ExpressaoAtribuicao();
            			expressao.abrir(ultimaExpressao);
            			ultimaExpressao = expressao;
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
    // $ANTLR end "iniciarExpressao"



    // $ANTLR start "terminarExpressao"
    // fontes/g/CanecaSemanticoExpressoes.g:178:1: terminarExpressao : ^( ATRIBUIDOR . . ) ;
    public final void terminarExpressao() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:179:2: ( ^( ATRIBUIDOR . . ) )
            // fontes/g/CanecaSemanticoExpressoes.g:179:4: ^( ATRIBUIDOR . . )
            {
            match(input,ATRIBUIDOR,FOLLOW_ATRIBUIDOR_in_terminarExpressao432); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			//System.out.println("TEXP");
            			ultimaExpressao = ultimaExpressao.fechar();
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
    // $ANTLR end "terminarExpressao"



    // $ANTLR start "iniciarExpressaoOuLogico"
    // fontes/g/CanecaSemanticoExpressoes.g:191:1: iniciarExpressaoOuLogico : ^( OU . . ) ;
    public final void iniciarExpressaoOuLogico() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:192:2: ( ^( OU . . ) )
            // fontes/g/CanecaSemanticoExpressoes.g:192:4: ^( OU . . )
            {
            match(input,OU,FOLLOW_OU_in_iniciarExpressaoOuLogico455); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			//System.out.println("IE||");
            			ExpressaoOuLogico expressao = new ExpressaoOuLogico();
            			expressao.abrir(ultimaExpressao);
            			ultimaExpressao = expressao;
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
    // $ANTLR end "iniciarExpressaoOuLogico"



    // $ANTLR start "terminarExpressaoOuLogico"
    // fontes/g/CanecaSemanticoExpressoes.g:201:1: terminarExpressaoOuLogico : ^( OU . . ) ;
    public final void terminarExpressaoOuLogico() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:202:2: ( ^( OU . . ) )
            // fontes/g/CanecaSemanticoExpressoes.g:202:4: ^( OU . . )
            {
            match(input,OU,FOLLOW_OU_in_terminarExpressaoOuLogico476); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			//System.out.println("TE||");
            			ultimaExpressao = ultimaExpressao.fechar();
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
    // $ANTLR end "terminarExpressaoOuLogico"



    // $ANTLR start "iniciarExpressaoELogico"
    // fontes/g/CanecaSemanticoExpressoes.g:209:1: iniciarExpressaoELogico : ^( E . . ) ;
    public final void iniciarExpressaoELogico() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:210:2: ( ^( E . . ) )
            // fontes/g/CanecaSemanticoExpressoes.g:210:4: ^( E . . )
            {
            match(input,E,FOLLOW_E_in_iniciarExpressaoELogico497); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			//System.out.println("IE&&");
            			ExpressaoELogico expressao = new ExpressaoELogico();
            			expressao.abrir(ultimaExpressao);
            			ultimaExpressao = expressao;
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
    // $ANTLR end "iniciarExpressaoELogico"



    // $ANTLR start "terminarExpressaoELogico"
    // fontes/g/CanecaSemanticoExpressoes.g:219:1: terminarExpressaoELogico : ^( E . . ) ;
    public final void terminarExpressaoELogico() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:220:2: ( ^( E . . ) )
            // fontes/g/CanecaSemanticoExpressoes.g:220:4: ^( E . . )
            {
            match(input,E,FOLLOW_E_in_terminarExpressaoELogico518); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			//System.out.println("TE&&");
            			ultimaExpressao = ultimaExpressao.fechar();
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
    // $ANTLR end "terminarExpressaoELogico"



    // $ANTLR start "iniciarExpressaoComparativaAritmetica"
    // fontes/g/CanecaSemanticoExpressoes.g:227:1: iniciarExpressaoComparativaAritmetica : ^( ( MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) . . ) ;
    public final void iniciarExpressaoComparativaAritmetica() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:228:2: ( ^( ( MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) . . ) )
            // fontes/g/CanecaSemanticoExpressoes.g:228:4: ^( ( MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) . . )
            {
            if ( (input.LA(1) >= MAIOR && input.LA(1) <= MENOR_IGUAL) ) {
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
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			//System.out.println("IECA");
            			ExpressaoComparativaAritmetica expressao = new ExpressaoComparativaAritmetica();
            			expressao.abrir(ultimaExpressao);
            			ultimaExpressao = expressao;
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
    // $ANTLR end "iniciarExpressaoComparativaAritmetica"



    // $ANTLR start "terminarExpressaoComparativaAritmetica"
    // fontes/g/CanecaSemanticoExpressoes.g:237:1: terminarExpressaoComparativaAritmetica : ^( ( MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) . . ) ;
    public final void terminarExpressaoComparativaAritmetica() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:238:2: ( ^( ( MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) . . ) )
            // fontes/g/CanecaSemanticoExpressoes.g:238:4: ^( ( MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) . . )
            {
            if ( (input.LA(1) >= MAIOR && input.LA(1) <= MENOR_IGUAL) ) {
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
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			//System.out.println("TECA");
            			ultimaExpressao = ultimaExpressao.fechar();
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
    // $ANTLR end "terminarExpressaoComparativaAritmetica"



    // $ANTLR start "iniciarExpressaoComparativa"
    // fontes/g/CanecaSemanticoExpressoes.g:245:1: iniciarExpressaoComparativa : ^( ( IGUAL | DIFERENTE ) . . ) ;
    public final void iniciarExpressaoComparativa() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:246:2: ( ^( ( IGUAL | DIFERENTE ) . . ) )
            // fontes/g/CanecaSemanticoExpressoes.g:246:4: ^( ( IGUAL | DIFERENTE ) . . )
            {
            if ( input.LA(1)==DIFERENTE||input.LA(1)==IGUAL ) {
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
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			//System.out.println("IEC");
            			ExpressaoComparativa expressao = new ExpressaoComparativa();
            			expressao.abrir(ultimaExpressao);
            			ultimaExpressao = expressao;
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
    // $ANTLR end "iniciarExpressaoComparativa"



    // $ANTLR start "terminarExpressaoComparativa"
    // fontes/g/CanecaSemanticoExpressoes.g:255:1: terminarExpressaoComparativa : ^( ( IGUAL | DIFERENTE ) . . ) ;
    public final void terminarExpressaoComparativa() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:256:2: ( ^( ( IGUAL | DIFERENTE ) . . ) )
            // fontes/g/CanecaSemanticoExpressoes.g:256:4: ^( ( IGUAL | DIFERENTE ) . . )
            {
            if ( input.LA(1)==DIFERENTE||input.LA(1)==IGUAL ) {
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
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			//System.out.println("TEC");
            			ultimaExpressao = ultimaExpressao.fechar();
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
    // $ANTLR end "terminarExpressaoComparativa"



    // $ANTLR start "iniciarExpressaoAditiva"
    // fontes/g/CanecaSemanticoExpressoes.g:263:1: iniciarExpressaoAditiva : ^( ( SOMA | SUBTRACAO ) . . ) ;
    public final void iniciarExpressaoAditiva() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:264:2: ( ^( ( SOMA | SUBTRACAO ) . . ) )
            // fontes/g/CanecaSemanticoExpressoes.g:264:4: ^( ( SOMA | SUBTRACAO ) . . )
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
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			//System.out.println("IEA");
            			ExpressaoAditiva expressao = new ExpressaoAditiva();
            			expressao.abrir(ultimaExpressao);
            			ultimaExpressao = expressao;
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
    // $ANTLR end "iniciarExpressaoAditiva"



    // $ANTLR start "terminarExpressaoAditiva"
    // fontes/g/CanecaSemanticoExpressoes.g:273:1: terminarExpressaoAditiva : ^( ( SOMA | SUBTRACAO ) . . ) ;
    public final void terminarExpressaoAditiva() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:274:2: ( ^( ( SOMA | SUBTRACAO ) . . ) )
            // fontes/g/CanecaSemanticoExpressoes.g:274:4: ^( ( SOMA | SUBTRACAO ) . . )
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
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			//System.out.println("TEA");
            			ultimaExpressao = ultimaExpressao.fechar();
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
    // $ANTLR end "terminarExpressaoAditiva"



    // $ANTLR start "iniciarExpressaoMultiplicativa"
    // fontes/g/CanecaSemanticoExpressoes.g:281:1: iniciarExpressaoMultiplicativa : ^( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) . . ) ;
    public final void iniciarExpressaoMultiplicativa() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:282:2: ( ^( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) . . ) )
            // fontes/g/CanecaSemanticoExpressoes.g:282:4: ^( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) . . )
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
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			//System.out.println("IEM");
            			ExpressaoMultiplicativa expressao = new ExpressaoMultiplicativa();
            			expressao.abrir(ultimaExpressao);
            			ultimaExpressao = expressao;
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
    // $ANTLR end "iniciarExpressaoMultiplicativa"



    // $ANTLR start "terminarExpressaoMultiplicativa"
    // fontes/g/CanecaSemanticoExpressoes.g:291:1: terminarExpressaoMultiplicativa : ^( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) . . ) ;
    public final void terminarExpressaoMultiplicativa() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoExpressoes.g:292:2: ( ^( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) . . ) )
            // fontes/g/CanecaSemanticoExpressoes.g:292:4: ^( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) . . )
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
            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			//System.out.println("TEM");
            			ultimaExpressao = ultimaExpressao.fechar();
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
    // $ANTLR end "terminarExpressaoMultiplicativa"



    // $ANTLR start "expressaoUnaria"
    // fontes/g/CanecaSemanticoExpressoes.g:299:1: expressaoUnaria returns [Tipo meuTipo] : ( ^( PRIMARIA_ expressaoPrimaria ) | ^( SUBTRACAO_UNARIA_ expressaoPrimaria ) | ^( NEGACAO expressaoPrimaria ) );
    public final Tipo expressaoUnaria() throws RecognitionException {
        Tipo meuTipo = null;


        Tipo expressaoPrimaria3 =null;

        Tipo expressaoPrimaria4 =null;

        Tipo expressaoPrimaria5 =null;


        try {
            // fontes/g/CanecaSemanticoExpressoes.g:300:2: ( ^( PRIMARIA_ expressaoPrimaria ) | ^( SUBTRACAO_UNARIA_ expressaoPrimaria ) | ^( NEGACAO expressaoPrimaria ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case PRIMARIA_:
                {
                alt5=1;
                }
                break;
            case SUBTRACAO_UNARIA_:
                {
                alt5=2;
                }
                break;
            case NEGACAO:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return meuTipo;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // fontes/g/CanecaSemanticoExpressoes.g:300:4: ^( PRIMARIA_ expressaoPrimaria )
                    {
                    match(input,PRIMARIA_,FOLLOW_PRIMARIA__in_expressaoUnaria783); if (state.failed) return meuTipo;

                    match(input, Token.DOWN, null); if (state.failed) return meuTipo;
                    pushFollow(FOLLOW_expressaoPrimaria_in_expressaoUnaria785);
                    expressaoPrimaria3=expressaoPrimaria();

                    state._fsp--;
                    if (state.failed) return meuTipo;

                    match(input, Token.UP, null); if (state.failed) return meuTipo;


                    if ( state.backtracking==1 ) {
                    			//System.out.println("EP");
                    			ExpressaoPrimaria expressao = new ExpressaoPrimaria();
                    			expressao.abrir(ultimaExpressao);
                    			expressao.adicionarTipo(expressaoPrimaria3);
                    			ultimaExpressao = expressao.fechar();
                    		}

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemanticoExpressoes.g:308:4: ^( SUBTRACAO_UNARIA_ expressaoPrimaria )
                    {
                    match(input,SUBTRACAO_UNARIA_,FOLLOW_SUBTRACAO_UNARIA__in_expressaoUnaria796); if (state.failed) return meuTipo;

                    match(input, Token.DOWN, null); if (state.failed) return meuTipo;
                    pushFollow(FOLLOW_expressaoPrimaria_in_expressaoUnaria798);
                    expressaoPrimaria4=expressaoPrimaria();

                    state._fsp--;
                    if (state.failed) return meuTipo;

                    match(input, Token.UP, null); if (state.failed) return meuTipo;


                    if ( state.backtracking==1 ) {
                    			//System.out.println("EPS");
                    			ExpressaoSubtracao expressao = new ExpressaoSubtracao();
                    			expressao.abrir(ultimaExpressao);
                    			expressao.adicionarTipo(expressaoPrimaria4);
                    			ultimaExpressao = expressao.fechar();
                    		}

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemanticoExpressoes.g:316:4: ^( NEGACAO expressaoPrimaria )
                    {
                    match(input,NEGACAO,FOLLOW_NEGACAO_in_expressaoUnaria809); if (state.failed) return meuTipo;

                    match(input, Token.DOWN, null); if (state.failed) return meuTipo;
                    pushFollow(FOLLOW_expressaoPrimaria_in_expressaoUnaria811);
                    expressaoPrimaria5=expressaoPrimaria();

                    state._fsp--;
                    if (state.failed) return meuTipo;

                    match(input, Token.UP, null); if (state.failed) return meuTipo;


                    if ( state.backtracking==1 ) {
                    			//System.out.println("EPN");
                    			ExpressaoNegacao expressao = new ExpressaoNegacao();
                    			expressao.abrir(ultimaExpressao);
                    			expressao.adicionarTipo(expressaoPrimaria5);
                    			ultimaExpressao = expressao.fechar();
                    		}

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
        return meuTipo;
    }
    // $ANTLR end "expressaoUnaria"



    // $ANTLR start "expressaoPrimaria"
    // fontes/g/CanecaSemanticoExpressoes.g:326:1: expressaoPrimaria returns [Tipo meuTipo] : ( VALOR_BOOLEANO | VALOR_NULO | CONSTANTE_INTEIRA | CONSTANTE_REAL | LITERAL_CARACTERE | LITERAL_TEXTO | comando );
    public final Tipo expressaoPrimaria() throws RecognitionException {
        Tipo meuTipo = null;


        CommonTree VALOR_BOOLEANO6=null;
        CommonTree VALOR_NULO7=null;
        CommonTree CONSTANTE_INTEIRA8=null;
        CommonTree CONSTANTE_REAL9=null;
        CommonTree LITERAL_CARACTERE10=null;
        CommonTree LITERAL_TEXTO11=null;
        Tipo comando12 =null;


        try {
            // fontes/g/CanecaSemanticoExpressoes.g:328:2: ( VALOR_BOOLEANO | VALOR_NULO | CONSTANTE_INTEIRA | CONSTANTE_REAL | LITERAL_CARACTERE | LITERAL_TEXTO | comando )
            int alt6=7;
            switch ( input.LA(1) ) {
            case VALOR_BOOLEANO:
                {
                alt6=1;
                }
                break;
            case VALOR_NULO:
                {
                alt6=2;
                }
                break;
            case CONSTANTE_INTEIRA:
                {
                alt6=3;
                }
                break;
            case CONSTANTE_REAL:
                {
                alt6=4;
                }
                break;
            case LITERAL_CARACTERE:
                {
                alt6=5;
                }
                break;
            case LITERAL_TEXTO:
                {
                alt6=6;
                }
                break;
            case COMANDO_:
                {
                alt6=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return meuTipo;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // fontes/g/CanecaSemanticoExpressoes.g:328:4: VALOR_BOOLEANO
                    {
                    VALOR_BOOLEANO6=(CommonTree)match(input,VALOR_BOOLEANO,FOLLOW_VALOR_BOOLEANO_in_expressaoPrimaria833); if (state.failed) return meuTipo;

                    if ( state.backtracking==1 ) { meuTipo = new Tipo("Booleano", VALOR_BOOLEANO6.getLine(), VALOR_BOOLEANO6.getCharPositionInLine()); }

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemanticoExpressoes.g:329:4: VALOR_NULO
                    {
                    VALOR_NULO7=(CommonTree)match(input,VALOR_NULO,FOLLOW_VALOR_NULO_in_expressaoPrimaria840); if (state.failed) return meuTipo;

                    if ( state.backtracking==1 ) { meuTipo = new Tipo("Nulo", VALOR_NULO7.getLine(), VALOR_NULO7.getCharPositionInLine()); }

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemanticoExpressoes.g:330:4: CONSTANTE_INTEIRA
                    {
                    CONSTANTE_INTEIRA8=(CommonTree)match(input,CONSTANTE_INTEIRA,FOLLOW_CONSTANTE_INTEIRA_in_expressaoPrimaria847); if (state.failed) return meuTipo;

                    if ( state.backtracking==1 ) { meuTipo = new Tipo("Inteiro", CONSTANTE_INTEIRA8.getLine(), CONSTANTE_INTEIRA8.getCharPositionInLine()); }

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSemanticoExpressoes.g:331:4: CONSTANTE_REAL
                    {
                    CONSTANTE_REAL9=(CommonTree)match(input,CONSTANTE_REAL,FOLLOW_CONSTANTE_REAL_in_expressaoPrimaria854); if (state.failed) return meuTipo;

                    if ( state.backtracking==1 ) { meuTipo = new Tipo("Real", CONSTANTE_REAL9.getLine(), CONSTANTE_REAL9.getCharPositionInLine()); }

                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSemanticoExpressoes.g:332:4: LITERAL_CARACTERE
                    {
                    LITERAL_CARACTERE10=(CommonTree)match(input,LITERAL_CARACTERE,FOLLOW_LITERAL_CARACTERE_in_expressaoPrimaria861); if (state.failed) return meuTipo;

                    if ( state.backtracking==1 ) { meuTipo = new Tipo("Caractere", LITERAL_CARACTERE10.getLine(), LITERAL_CARACTERE10.getCharPositionInLine()); }

                    }
                    break;
                case 6 :
                    // fontes/g/CanecaSemanticoExpressoes.g:333:4: LITERAL_TEXTO
                    {
                    LITERAL_TEXTO11=(CommonTree)match(input,LITERAL_TEXTO,FOLLOW_LITERAL_TEXTO_in_expressaoPrimaria868); if (state.failed) return meuTipo;

                    if ( state.backtracking==1 ) { meuTipo = new Tipo("Texto", LITERAL_TEXTO11.getLine(), LITERAL_TEXTO11.getCharPositionInLine()); }

                    }
                    break;
                case 7 :
                    // fontes/g/CanecaSemanticoExpressoes.g:334:4: comando
                    {
                    pushFollow(FOLLOW_comando_in_expressaoPrimaria875);
                    comando12=comando();

                    state._fsp--;
                    if (state.failed) return meuTipo;

                    if ( state.backtracking==1 ) { meuTipo = comando12; }

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
        return meuTipo;
    }
    // $ANTLR end "expressaoPrimaria"



    // $ANTLR start "comando"
    // fontes/g/CanecaSemanticoExpressoes.g:337:1: comando returns [Tipo meuTipo] : ^( COMANDO_ . ( . )? ) ;
    public final Tipo comando() throws RecognitionException {
        Tipo meuTipo = null;


        try {
            // fontes/g/CanecaSemanticoExpressoes.g:338:2: ( ^( COMANDO_ . ( . )? ) )
            // fontes/g/CanecaSemanticoExpressoes.g:338:4: ^( COMANDO_ . ( . )? )
            {
            match(input,COMANDO_,FOLLOW_COMANDO__in_comando893); if (state.failed) return meuTipo;

            match(input, Token.DOWN, null); if (state.failed) return meuTipo;
            matchAny(input); if (state.failed) return meuTipo;

            // fontes/g/CanecaSemanticoExpressoes.g:338:17: ( . )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0 >= ATRIBUIDOR && LA7_0 <= UNIDADE_)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // fontes/g/CanecaSemanticoExpressoes.g:338:17: .
                    {
                    matchAny(input); if (state.failed) return meuTipo;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return meuTipo;


            if ( state.backtracking==1 ) {
            			referencia = filaDeReferencias.poll();
            			if (referencia != null) {
            				meuTipo = referencia.fornecerTipo();
            			} else {
            				meuTipo = new Tipo("Nulo");
            				System.out.println("MERDA");
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
        return meuTipo;
    }
    // $ANTLR end "comando"



    // $ANTLR start "tipo"
    // fontes/g/CanecaSemanticoExpressoes.g:350:1: tipo returns [Tipo umTipo] : ^( TIPO_ IDENTIFICADOR listaDeTipos[umTipo] ) ;
    public final Tipo tipo() throws RecognitionException {
        Tipo umTipo = null;


        CommonTree IDENTIFICADOR13=null;

        try {
            // fontes/g/CanecaSemanticoExpressoes.g:351:2: ( ^( TIPO_ IDENTIFICADOR listaDeTipos[umTipo] ) )
            // fontes/g/CanecaSemanticoExpressoes.g:351:4: ^( TIPO_ IDENTIFICADOR listaDeTipos[umTipo] )
            {
            match(input,TIPO_,FOLLOW_TIPO__in_tipo919); if (state.failed) return umTipo;

            match(input, Token.DOWN, null); if (state.failed) return umTipo;
            IDENTIFICADOR13=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_tipo921); if (state.failed) return umTipo;

            if ( state.backtracking==1 ) {
            			umTipo = new Tipo((IDENTIFICADOR13!=null?IDENTIFICADOR13.getText():null), IDENTIFICADOR13.getLine(), IDENTIFICADOR13.getCharPositionInLine());
            		}

            pushFollow(FOLLOW_listaDeTipos_in_tipo929);
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
    // fontes/g/CanecaSemanticoExpressoes.g:358:1: listaDeTipos[Tipo tipoPai] : ^( TIPOS_ ( tipo )* ) ;
    public final void listaDeTipos(Tipo tipoPai) throws RecognitionException {
        Tipo tipo14 =null;


        try {
            // fontes/g/CanecaSemanticoExpressoes.g:359:2: ( ^( TIPOS_ ( tipo )* ) )
            // fontes/g/CanecaSemanticoExpressoes.g:359:4: ^( TIPOS_ ( tipo )* )
            {
            match(input,TIPOS_,FOLLOW_TIPOS__in_listaDeTipos944); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemanticoExpressoes.g:359:13: ( tipo )*
                loop8:
                do {
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==TIPO_) ) {
                        alt8=1;
                    }


                    switch (alt8) {
                	case 1 :
                	    // fontes/g/CanecaSemanticoExpressoes.g:359:14: tipo
                	    {
                	    pushFollow(FOLLOW_tipo_in_listaDeTipos947);
                	    tipo14=tipo();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    if ( state.backtracking==1 ) {
                	    			tipoPai.adicionarTipoAninhado(tipo14);
                	    		}

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
    public static final BitSet FOLLOW_iniciarExpressao_in_topdown80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iniciarExpressaoOuLogico_in_topdown85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iniciarExpressaoELogico_in_topdown90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iniciarExpressaoComparativaAritmetica_in_topdown95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iniciarExpressaoComparativa_in_topdown100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iniciarExpressaoAditiva_in_topdown105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iniciarExpressaoMultiplicativa_in_topdown110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoUnaria_in_topdown115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarClasse_in_bottomup126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarMetodo_in_bottomup131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarConstrutor_in_bottomup136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarDestrutor_in_bottomup141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarBloco_in_bottomup146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressao_in_bottomup151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoOuLogico_in_bottomup156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoELogico_in_bottomup161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoComparativaAritmetica_in_bottomup166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoComparativa_in_bottomup171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoAditiva_in_bottomup176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarExpressaoMultiplicativa_in_bottomup181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASSE__in_iniciarClasse193 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_iniciarClasse197 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_CLASSE__in_terminarClasse219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METODO__in_iniciarMetodo235 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_iniciarMetodo238 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ESTATICO_in_iniciarMetodo243 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_tipo_in_iniciarMetodo247 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_iniciarMetodo249 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_METODO__in_terminarMetodo270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUTOR__in_iniciarConstrutor286 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_iniciarConstrutor289 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_iniciarConstrutor293 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_CONSTRUTOR__in_terminarConstrutor314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTRUTOR__in_iniciarDestrutor330 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_iniciarDestrutor333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_iniciarDestrutor337 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_DESTRUTOR__in_terminarDestrutor358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCOES__in_iniciarBloco374 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INSTRUCOES__in_terminarBloco395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATRIBUIDOR_in_iniciarExpressao411 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ATRIBUIDOR_in_terminarExpressao432 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OU_in_iniciarExpressaoOuLogico455 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OU_in_terminarExpressaoOuLogico476 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_E_in_iniciarExpressaoELogico497 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_E_in_terminarExpressaoELogico518 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_iniciarExpressaoComparativaAritmetica539 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_terminarExpressaoComparativaAritmetica574 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_iniciarExpressaoComparativa609 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_terminarExpressaoComparativa636 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_iniciarExpressaoAditiva663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_terminarExpressaoAditiva690 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_iniciarExpressaoMultiplicativa717 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_terminarExpressaoMultiplicativa748 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PRIMARIA__in_expressaoUnaria783 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoPrimaria_in_expressaoUnaria785 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBTRACAO_UNARIA__in_expressaoUnaria796 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoPrimaria_in_expressaoUnaria798 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGACAO_in_expressaoUnaria809 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressaoPrimaria_in_expressaoUnaria811 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VALOR_BOOLEANO_in_expressaoPrimaria833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALOR_NULO_in_expressaoPrimaria840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTE_INTEIRA_in_expressaoPrimaria847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTE_REAL_in_expressaoPrimaria854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_CARACTERE_in_expressaoPrimaria861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_TEXTO_in_expressaoPrimaria868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comando_in_expressaoPrimaria875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMANDO__in_comando893 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TIPO__in_tipo919 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_tipo921 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_listaDeTipos_in_tipo929 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIPOS__in_listaDeTipos944 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_listaDeTipos947 = new BitSet(new long[]{0x0000000000000008L,0x8000000000000000L});

}