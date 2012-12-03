// $ANTLR 3.4 fontes/g/CanecaSemanticoResolucao.g 2012-12-03 08:07:20

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
public class CanecaSemanticoResolucao extends TreeFilter {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATRIBUIDOR", "ATRIBUTO", "CAPTURE", "CARACTERE", "CARACTERE_DE_ESCAPE", "CARACTERE_NAO_IMPRIMIVEL", "CHAMADA_DE_CLASSE", "CHAMADA_DE_OBJETO", "CLASSE", "COLCHETE_DIREITO", "COLCHETE_ESQUERDO", "COMENTARIO_EM_BLOCO", "COMENTARIO_EM_LINHA", "COMO", "CONSTANTE_INTEIRA", "CONSTANTE_REAL", "CONSTRUTOR", "DECLARE", "DESTRUA", "DESTRUTOR", "DIFERENTE", "DIGITO", "DIVISAO", "E", "ENQUANTO", "ESPACO_EM_BRANCO", "ESSA", "ESSE", "ESTATICO", "FIM", "IDENTIFICADOR", "IDENTIFICADOR_DE_PACOTE", "IGUAL", "IMPLEMENTA", "IMPORTE", "INICIO", "INTERFACE", "LANCE", "LETRA", "LITERAL_CARACTERE", "LITERAL_TEXTO", "MAIOR", "MAIOR_IGUAL", "MENOR", "MENOR_IGUAL", "METODO", "MULTIPLICACAO", "NEGACAO", "NOVA", "NOVO", "OU", "PACOTE", "PARA", "PARENTESE_DIREITO", "PARENTESE_ESQUERDO", "PRIVADA", "PRIVADO", "PROTEGIDA", "PROTEGIDO", "PUBLICA", "PUBLICO", "QUEBRA_DE_LINHA", "REPITA", "RESTO_DA_DIVISAO", "RETORNE", "SE", "SENAO", "SEPARADOR", "SOMA", "SUBTRACAO", "TABULACAO", "TENTE", "TERMINADOR", "USADO_EM_TEXTO", "VALOR_BOOLEANO", "VALOR_NULO", "ARGUMENTOS_", "ASSINATURAS_DE_METODOS_", "ASSINATURA_", "ASSINATURA_DE_METODO_", "ATRIBUICAO_", "ATRIBUTOS_", "ATRIBUTO_", "CABECALHO_", "CAPTURAS_", "CAPTURE_", "CHAMADA_DE_CLASSE_", "CHAMADA_DE_OBJETO_", "CLASSE_", "COMANDO_", "CONSTRUTORES_", "CONSTRUTOR_", "CORPO_", "DECLARACAO_", "DECLARACAO_COM_ATRIBUICAO_OPICIONAL_", "DESTRUICAO_", "DESTRUTORES_", "DESTRUTOR_", "ENQUANTO_", "EXPRESSAO_", "IMPORTACAO_", "IMPORTACOES_", "INSTANCIACAO_", "INSTRUCOES_", "INTERFACES_", "INTERFACE_", "LANCE_", "METODOS_", "METODO_", "PACOTE_", "PARAMETROS_", "PARA_", "PROGRAMA_", "REFERENCIA_", "REPITA_", "RETORNO_", "SELECAO_", "SE_", "TENTE_", "TIPOS_", "TIPOS_GENERICOS_", "TIPO_", "TIPO_GENERICO_", "UNIDADE_"
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
    public static final int PROGRAMA_=116;
    public static final int REFERENCIA_=117;
    public static final int REPITA_=118;
    public static final int RETORNO_=119;
    public static final int SELECAO_=120;
    public static final int SE_=121;
    public static final int TENTE_=122;
    public static final int TIPOS_=123;
    public static final int TIPOS_GENERICOS_=124;
    public static final int TIPO_=125;
    public static final int TIPO_GENERICO_=126;
    public static final int UNIDADE_=127;

    // delegates
    public TreeFilter[] getDelegates() {
        return new TreeFilter[] {};
    }

    // delegators


    public CanecaSemanticoResolucao(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public CanecaSemanticoResolucao(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return CanecaSemanticoResolucao.tokenNames; }
    public String getGrammarFileName() { return "fontes/g/CanecaSemanticoResolucao.g"; }


    	private Escopo escopoAtual;
    	private Escopo referencia;
    	private Queue<Escopo> filaDeEscopos;
    	
    	public void fixarFilaDeEscopos(Queue<Escopo> filaDeEscopos) {
    		this.filaDeEscopos = filaDeEscopos;
    		this.escopoAtual = filaDeEscopos.poll();
    	}
    	
    	public <T extends Escopo> void reportarResolucao(String nomeDoMembro, T membro, String tipoDoSimbolo, int linha, int coluna) {
    		Reporter reporter = Reporter.fornecerInstancia();
    		if (membro == Classe.NAO_ENCONTRADA ||
    					membro == Atributo.NAO_ENCONTRADO ||
    					membro == Metodo.NAO_ENCONTRADO ||
    					membro == Variavel.NAO_ENCONTRADA) {
    			reporter.reportarErro(String.format("[%s] [%s, %s] [%s] %s não resolvido.", escopoAtual.fornecerNome(), linha, coluna, tipoDoSimbolo, nomeDoMembro), membro);
    		} else {
    			reporter.reportarSucesso(String.format("[%s] [%s, %s] [%s] %s resolvido.", escopoAtual.fornecerNome(), linha, coluna, tipoDoSimbolo, nomeDoMembro), membro);
    		}
    	}



    // $ANTLR start "topdown"
    // fontes/g/CanecaSemanticoResolucao.g:48:1: topdown : ( iniciarClasse | iniciarMetodo | iniciarConstrutor | iniciarDestrutor | iniciarBloco | declaracao | declaracaoDeAtributo | instanciacao );
    public final void topdown() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoResolucao.g:49:2: ( iniciarClasse | iniciarMetodo | iniciarConstrutor | iniciarDestrutor | iniciarBloco | declaracao | declaracaoDeAtributo | instanciacao )
            int alt1=8;
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
            case INSTANCIACAO_:
                {
                alt1=8;
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
                    // fontes/g/CanecaSemanticoResolucao.g:49:4: iniciarClasse
                    {
                    pushFollow(FOLLOW_iniciarClasse_in_topdown55);
                    iniciarClasse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemanticoResolucao.g:50:4: iniciarMetodo
                    {
                    pushFollow(FOLLOW_iniciarMetodo_in_topdown60);
                    iniciarMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemanticoResolucao.g:51:4: iniciarConstrutor
                    {
                    pushFollow(FOLLOW_iniciarConstrutor_in_topdown65);
                    iniciarConstrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSemanticoResolucao.g:52:4: iniciarDestrutor
                    {
                    pushFollow(FOLLOW_iniciarDestrutor_in_topdown70);
                    iniciarDestrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSemanticoResolucao.g:53:4: iniciarBloco
                    {
                    pushFollow(FOLLOW_iniciarBloco_in_topdown75);
                    iniciarBloco();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // fontes/g/CanecaSemanticoResolucao.g:54:4: declaracao
                    {
                    pushFollow(FOLLOW_declaracao_in_topdown80);
                    declaracao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // fontes/g/CanecaSemanticoResolucao.g:55:4: declaracaoDeAtributo
                    {
                    pushFollow(FOLLOW_declaracaoDeAtributo_in_topdown85);
                    declaracaoDeAtributo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // fontes/g/CanecaSemanticoResolucao.g:56:4: instanciacao
                    {
                    pushFollow(FOLLOW_instanciacao_in_topdown90);
                    instanciacao();

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
    // fontes/g/CanecaSemanticoResolucao.g:59:1: bottomup : ( terminarClasse | terminarMetodo | terminarConstrutor | terminarDestrutor | terminarBloco | referencia | chamada );
    public final void bottomup() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoResolucao.g:60:2: ( terminarClasse | terminarMetodo | terminarConstrutor | terminarDestrutor | terminarBloco | referencia | chamada )
            int alt2=7;
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
            case REFERENCIA_:
                {
                alt2=6;
                }
                break;
            case CHAMADA_DE_CLASSE:
            case CHAMADA_DE_OBJETO:
                {
                alt2=7;
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
                    // fontes/g/CanecaSemanticoResolucao.g:60:4: terminarClasse
                    {
                    pushFollow(FOLLOW_terminarClasse_in_bottomup101);
                    terminarClasse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemanticoResolucao.g:61:4: terminarMetodo
                    {
                    pushFollow(FOLLOW_terminarMetodo_in_bottomup106);
                    terminarMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemanticoResolucao.g:62:4: terminarConstrutor
                    {
                    pushFollow(FOLLOW_terminarConstrutor_in_bottomup111);
                    terminarConstrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSemanticoResolucao.g:63:4: terminarDestrutor
                    {
                    pushFollow(FOLLOW_terminarDestrutor_in_bottomup116);
                    terminarDestrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSemanticoResolucao.g:64:4: terminarBloco
                    {
                    pushFollow(FOLLOW_terminarBloco_in_bottomup121);
                    terminarBloco();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // fontes/g/CanecaSemanticoResolucao.g:65:4: referencia
                    {
                    pushFollow(FOLLOW_referencia_in_bottomup126);
                    referencia();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // fontes/g/CanecaSemanticoResolucao.g:66:4: chamada
                    {
                    pushFollow(FOLLOW_chamada_in_bottomup131);
                    chamada();

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
    // fontes/g/CanecaSemanticoResolucao.g:69:1: iniciarClasse : ^( CLASSE_ . IDENTIFICADOR . . . ) ;
    public final void iniciarClasse() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoResolucao.g:70:2: ( ^( CLASSE_ . IDENTIFICADOR . . . ) )
            // fontes/g/CanecaSemanticoResolucao.g:70:4: ^( CLASSE_ . IDENTIFICADOR . . . )
            {
            match(input,CLASSE_,FOLLOW_CLASSE__in_iniciarClasse143); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_iniciarClasse147); if (state.failed) return ;

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
    // fontes/g/CanecaSemanticoResolucao.g:76:1: terminarClasse : CLASSE_ ;
    public final void terminarClasse() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoResolucao.g:77:2: ( CLASSE_ )
            // fontes/g/CanecaSemanticoResolucao.g:77:4: CLASSE_
            {
            match(input,CLASSE_,FOLLOW_CLASSE__in_terminarClasse169); if (state.failed) return ;

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
    // fontes/g/CanecaSemanticoResolucao.g:83:1: iniciarMetodo : ^( METODO_ ^( ASSINATURA_ . ( ESTATICO )? tipo IDENTIFICADOR . ) . ) ;
    public final void iniciarMetodo() throws RecognitionException {
        Tipo tipo1 =null;


        try {
            // fontes/g/CanecaSemanticoResolucao.g:84:2: ( ^( METODO_ ^( ASSINATURA_ . ( ESTATICO )? tipo IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemanticoResolucao.g:84:4: ^( METODO_ ^( ASSINATURA_ . ( ESTATICO )? tipo IDENTIFICADOR . ) . )
            {
            match(input,METODO_,FOLLOW_METODO__in_iniciarMetodo185); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_iniciarMetodo188); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            // fontes/g/CanecaSemanticoResolucao.g:84:30: ( ESTATICO )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ESTATICO) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // fontes/g/CanecaSemanticoResolucao.g:84:31: ESTATICO
                    {
                    match(input,ESTATICO,FOLLOW_ESTATICO_in_iniciarMetodo193); if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_iniciarMetodo197);
            tipo1=tipo();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_iniciarMetodo199); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			Classe classe = escopoAtual.resolverClasse(tipo1.fornecerNome());
            			reportarResolucao(tipo1.fornecerNome(), classe, "classe", tipo1.fornecerLinha(), tipo1.fornecerColuna());
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
    // fontes/g/CanecaSemanticoResolucao.g:92:1: terminarMetodo : METODO_ ;
    public final void terminarMetodo() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoResolucao.g:93:2: ( METODO_ )
            // fontes/g/CanecaSemanticoResolucao.g:93:4: METODO_
            {
            match(input,METODO_,FOLLOW_METODO__in_terminarMetodo220); if (state.failed) return ;

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
    // fontes/g/CanecaSemanticoResolucao.g:99:1: iniciarConstrutor : ^( CONSTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . ) ;
    public final void iniciarConstrutor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoResolucao.g:100:2: ( ^( CONSTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemanticoResolucao.g:100:4: ^( CONSTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . )
            {
            match(input,CONSTRUTOR_,FOLLOW_CONSTRUTOR__in_iniciarConstrutor236); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_iniciarConstrutor239); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_iniciarConstrutor243); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
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
    // fontes/g/CanecaSemanticoResolucao.g:105:1: terminarConstrutor : CONSTRUTOR_ ;
    public final void terminarConstrutor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoResolucao.g:106:2: ( CONSTRUTOR_ )
            // fontes/g/CanecaSemanticoResolucao.g:106:4: CONSTRUTOR_
            {
            match(input,CONSTRUTOR_,FOLLOW_CONSTRUTOR__in_terminarConstrutor264); if (state.failed) return ;

            if ( state.backtracking==1 ) {
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
    // fontes/g/CanecaSemanticoResolucao.g:111:1: iniciarDestrutor : ^( DESTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . ) ;
    public final void iniciarDestrutor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoResolucao.g:112:2: ( ^( DESTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemanticoResolucao.g:112:4: ^( DESTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . )
            {
            match(input,DESTRUTOR_,FOLLOW_DESTRUTOR__in_iniciarDestrutor280); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_iniciarDestrutor283); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_iniciarDestrutor287); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
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
    // fontes/g/CanecaSemanticoResolucao.g:117:1: terminarDestrutor : DESTRUTOR_ ;
    public final void terminarDestrutor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoResolucao.g:118:2: ( DESTRUTOR_ )
            // fontes/g/CanecaSemanticoResolucao.g:118:4: DESTRUTOR_
            {
            match(input,DESTRUTOR_,FOLLOW_DESTRUTOR__in_terminarDestrutor308); if (state.failed) return ;

            if ( state.backtracking==1 ) {
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
    // fontes/g/CanecaSemanticoResolucao.g:123:1: iniciarBloco : ^( INSTRUCOES_ ( . )* ) ;
    public final void iniciarBloco() throws RecognitionException {
        CommonTree INSTRUCOES_2=null;

        try {
            // fontes/g/CanecaSemanticoResolucao.g:124:2: ( ^( INSTRUCOES_ ( . )* ) )
            // fontes/g/CanecaSemanticoResolucao.g:124:4: ^( INSTRUCOES_ ( . )* )
            {
            INSTRUCOES_2=(CommonTree)match(input,INSTRUCOES_,FOLLOW_INSTRUCOES__in_iniciarBloco324); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemanticoResolucao.g:124:18: ( . )*
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
                	    // fontes/g/CanecaSemanticoResolucao.g:124:19: .
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
    // $ANTLR end "iniciarBloco"



    // $ANTLR start "terminarBloco"
    // fontes/g/CanecaSemanticoResolucao.g:132:1: terminarBloco : INSTRUCOES_ ;
    public final void terminarBloco() throws RecognitionException {
        CommonTree INSTRUCOES_3=null;

        try {
            // fontes/g/CanecaSemanticoResolucao.g:133:2: ( INSTRUCOES_ )
            // fontes/g/CanecaSemanticoResolucao.g:133:4: INSTRUCOES_
            {
            INSTRUCOES_3=(CommonTree)match(input,INSTRUCOES_,FOLLOW_INSTRUCOES__in_terminarBloco345); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            			if (INSTRUCOES_3.hasAncestor(METODO_)) {
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



    // $ANTLR start "declaracao"
    // fontes/g/CanecaSemanticoResolucao.g:141:1: declaracao : ^( DECLARACAO_ tipo IDENTIFICADOR ) ;
    public final void declaracao() throws RecognitionException {
        Tipo tipo4 =null;


        try {
            // fontes/g/CanecaSemanticoResolucao.g:142:2: ( ^( DECLARACAO_ tipo IDENTIFICADOR ) )
            // fontes/g/CanecaSemanticoResolucao.g:142:4: ^( DECLARACAO_ tipo IDENTIFICADOR )
            {
            match(input,DECLARACAO_,FOLLOW_DECLARACAO__in_declaracao361); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tipo_in_declaracao363);
            tipo4=tipo();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_declaracao365); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			Classe classe = escopoAtual.resolverClasse(tipo4.fornecerNome());
            			reportarResolucao(tipo4.fornecerNome(), classe, "classe", tipo4.fornecerLinha(), tipo4.fornecerColuna());
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
    // fontes/g/CanecaSemanticoResolucao.g:149:1: declaracaoDeAtributo : ^( ATRIBUTO_ . ( ESTATICO )? tipo IDENTIFICADOR ( . )? ) ;
    public final void declaracaoDeAtributo() throws RecognitionException {
        Tipo tipo5 =null;


        try {
            // fontes/g/CanecaSemanticoResolucao.g:150:2: ( ^( ATRIBUTO_ . ( ESTATICO )? tipo IDENTIFICADOR ( . )? ) )
            // fontes/g/CanecaSemanticoResolucao.g:150:4: ^( ATRIBUTO_ . ( ESTATICO )? tipo IDENTIFICADOR ( . )? )
            {
            match(input,ATRIBUTO_,FOLLOW_ATRIBUTO__in_declaracaoDeAtributo382); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            // fontes/g/CanecaSemanticoResolucao.g:150:18: ( ESTATICO )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ESTATICO) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // fontes/g/CanecaSemanticoResolucao.g:150:19: ESTATICO
                    {
                    match(input,ESTATICO,FOLLOW_ESTATICO_in_declaracaoDeAtributo387); if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_declaracaoDeAtributo391);
            tipo5=tipo();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_declaracaoDeAtributo393); if (state.failed) return ;

            // fontes/g/CanecaSemanticoResolucao.g:150:49: ( . )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0 >= ATRIBUIDOR && LA6_0 <= UNIDADE_)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // fontes/g/CanecaSemanticoResolucao.g:150:50: .
                    {
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			Classe classe = escopoAtual.resolverClasse(tipo5.fornecerNome());
            			reportarResolucao(tipo5.fornecerNome(), classe, "classe", tipo5.fornecerLinha(), tipo5.fornecerColuna());
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



    // $ANTLR start "instanciacao"
    // fontes/g/CanecaSemanticoResolucao.g:157:1: instanciacao : ^( INSTANCIACAO_ tipo . ) ;
    public final void instanciacao() throws RecognitionException {
        Tipo tipo6 =null;


        try {
            // fontes/g/CanecaSemanticoResolucao.g:158:2: ( ^( INSTANCIACAO_ tipo . ) )
            // fontes/g/CanecaSemanticoResolucao.g:158:4: ^( INSTANCIACAO_ tipo . )
            {
            match(input,INSTANCIACAO_,FOLLOW_INSTANCIACAO__in_instanciacao415); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tipo_in_instanciacao417);
            tipo6=tipo();

            state._fsp--;
            if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			Classe classe = escopoAtual.resolverClasse(tipo6.fornecerNome());
            			reportarResolucao(tipo6.fornecerNome(), classe, "classe", tipo6.fornecerLinha(), tipo6.fornecerColuna());
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
    // $ANTLR end "instanciacao"



    // $ANTLR start "referencia"
    // fontes/g/CanecaSemanticoResolucao.g:165:1: referencia : ( ^( REFERENCIA_ identificador= ( IDENTIFICADOR | ESSE | ESSA ) ) | ^( REFERENCIA_ IDENTIFICADOR . ) );
    public final void referencia() throws RecognitionException {
        CommonTree identificador=null;
        CommonTree IDENTIFICADOR7=null;

        try {
            // fontes/g/CanecaSemanticoResolucao.g:166:2: ( ^( REFERENCIA_ identificador= ( IDENTIFICADOR | ESSE | ESSA ) ) | ^( REFERENCIA_ IDENTIFICADOR . ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==REFERENCIA_) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==DOWN) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==IDENTIFICADOR) ) {
                        int LA7_3 = input.LA(4);

                        if ( (LA7_3==UP) ) {
                            alt7=1;
                        }
                        else if ( ((LA7_3 >= ATRIBUIDOR && LA7_3 <= UNIDADE_)) ) {
                            alt7=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 3, input);

                            throw nvae;

                        }
                    }
                    else if ( ((LA7_2 >= ESSA && LA7_2 <= ESSE)) ) {
                        alt7=1;
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
                    // fontes/g/CanecaSemanticoResolucao.g:166:4: ^( REFERENCIA_ identificador= ( IDENTIFICADOR | ESSE | ESSA ) )
                    {
                    match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_referencia436); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    identificador=(CommonTree)input.LT(1);

                    if ( (input.LA(1) >= ESSA && input.LA(1) <= ESSE)||input.LA(1)==IDENTIFICADOR ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==1 ) {
                    			Variavel referenciaDeVariavel = escopoAtual.resolverVariavel((identificador!=null?identificador.getText():null), identificador.getTokenStartIndex());
                    			referencia = referenciaDeVariavel;
                    			if (referenciaDeVariavel == Variavel.NAO_ENCONTRADA) {
                    				Atributo referenciaDeAtributo = escopoAtual.resolverAtributo((identificador!=null?identificador.getText():null));
                    				referencia = referenciaDeAtributo;
                    				if (referenciaDeAtributo == Atributo.NAO_ENCONTRADO) {
                    					Classe referenciaDeClasse = escopoAtual.resolverClasse((identificador!=null?identificador.getText():null));
                    					referencia = referenciaDeClasse;
                    					if (referenciaDeClasse == Classe.NAO_ENCONTRADA) {
                    						reportarResolucao((identificador!=null?identificador.getText():null), referenciaDeVariavel, "variavel", identificador.getLine(), identificador.getCharPositionInLine());
                    						reportarResolucao((identificador!=null?identificador.getText():null), referenciaDeAtributo, "atributo", identificador.getLine(), identificador.getCharPositionInLine());
                    						reportarResolucao((identificador!=null?identificador.getText():null), referenciaDeClasse, "classe", identificador.getLine(), identificador.getCharPositionInLine());
                    						referencia = null;
                    					} else {
                    						reportarResolucao((identificador!=null?identificador.getText():null), referenciaDeClasse, "classe", identificador.getLine(), identificador.getCharPositionInLine());
                    					}
                    				} else {
                    					reportarResolucao((identificador!=null?identificador.getText():null), referenciaDeAtributo, "atributo", identificador.getLine(), identificador.getCharPositionInLine());
                    				}
                    			} else {
                    				reportarResolucao((identificador!=null?identificador.getText():null), referenciaDeVariavel, "variavel", identificador.getLine(), identificador.getCharPositionInLine());				
                    			}
                    		}

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemanticoResolucao.g:191:4: ^( REFERENCIA_ IDENTIFICADOR . )
                    {
                    match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_referencia463); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    IDENTIFICADOR7=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_referencia465); if (state.failed) return ;

                    matchAny(input); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==1 ) {
                    			Metodo referenciaDeMetodo = escopoAtual.resolverMetodo((IDENTIFICADOR7!=null?IDENTIFICADOR7.getText():null));
                    			reportarResolucao((IDENTIFICADOR7!=null?IDENTIFICADOR7.getText():null), referenciaDeMetodo, "metodo", IDENTIFICADOR7.getLine(), IDENTIFICADOR7.getCharPositionInLine());
                    			referencia = referenciaDeMetodo;
                    			if (referenciaDeMetodo != Metodo.NAO_ENCONTRADO) {
                    				referencia = new Variavel("retorne", referencia.fornecerTipo(), 0);
                    				referencia.abrir(escopoAtual);
                    				referencia.fechar();
                    			} else {
                    				referencia = null;
                    			}
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
        return ;
    }
    // $ANTLR end "referencia"



    // $ANTLR start "chamada"
    // fontes/g/CanecaSemanticoResolucao.g:206:1: chamada : ( ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ) | ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR . ) );
    public final void chamada() throws RecognitionException {
        CommonTree IDENTIFICADOR8=null;
        CommonTree IDENTIFICADOR9=null;

        try {
            // fontes/g/CanecaSemanticoResolucao.g:207:2: ( ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ) | ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR . ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0 >= CHAMADA_DE_CLASSE && LA8_0 <= CHAMADA_DE_OBJETO)) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==DOWN) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==IDENTIFICADOR) ) {
                        int LA8_3 = input.LA(4);

                        if ( (LA8_3==UP) ) {
                            alt8=1;
                        }
                        else if ( ((LA8_3 >= ATRIBUIDOR && LA8_3 <= UNIDADE_)) ) {
                            alt8=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // fontes/g/CanecaSemanticoResolucao.g:207:4: ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR )
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
                    IDENTIFICADOR8=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_chamada492); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==1 ) {
                    			if (referencia != null) {
                    				Atributo referenciaDeAtributo = referencia.resolverAtributo((IDENTIFICADOR8!=null?IDENTIFICADOR8.getText():null));
                    				reportarResolucao((IDENTIFICADOR8!=null?IDENTIFICADOR8.getText():null), referenciaDeAtributo, "atributo", IDENTIFICADOR8.getLine(), IDENTIFICADOR8.getCharPositionInLine());
                    				referencia = referenciaDeAtributo;
                    				if (referenciaDeAtributo == Atributo.NAO_ENCONTRADO) {
                    					referencia = null;
                    				}
                    			}
                    		}

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemanticoResolucao.g:218:4: ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR . )
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
                    IDENTIFICADOR9=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_chamada511); if (state.failed) return ;

                    matchAny(input); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==1 ) {
                    			if (referencia != null) {
                    				Metodo referenciaDeMetodo = referencia.resolverMetodo((IDENTIFICADOR9!=null?IDENTIFICADOR9.getText():null));
                    				reportarResolucao((IDENTIFICADOR9!=null?IDENTIFICADOR9.getText():null), referenciaDeMetodo, "metodo", IDENTIFICADOR9.getLine(), IDENTIFICADOR9.getCharPositionInLine());
                    				referencia = referenciaDeMetodo;
                    				if (referenciaDeMetodo != Metodo.NAO_ENCONTRADO) {
                    					referencia = new Variavel("retorne", referencia.fornecerTipo(), 0);
                    					referencia.abrir(escopoAtual);
                    					referencia.fechar();
                    				} else {
                    					referencia = null;
                    				}
                    			}
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
        return ;
    }
    // $ANTLR end "chamada"



    // $ANTLR start "tipo"
    // fontes/g/CanecaSemanticoResolucao.g:235:1: tipo returns [Tipo umTipo] : ^( TIPO_ IDENTIFICADOR listaDeTipos[umTipo] ) ;
    public final Tipo tipo() throws RecognitionException {
        Tipo umTipo = null;


        CommonTree IDENTIFICADOR10=null;

        try {
            // fontes/g/CanecaSemanticoResolucao.g:236:2: ( ^( TIPO_ IDENTIFICADOR listaDeTipos[umTipo] ) )
            // fontes/g/CanecaSemanticoResolucao.g:236:4: ^( TIPO_ IDENTIFICADOR listaDeTipos[umTipo] )
            {
            match(input,TIPO_,FOLLOW_TIPO__in_tipo534); if (state.failed) return umTipo;

            match(input, Token.DOWN, null); if (state.failed) return umTipo;
            IDENTIFICADOR10=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_tipo536); if (state.failed) return umTipo;

            if ( state.backtracking==1 ) {
            			umTipo = new Tipo((IDENTIFICADOR10!=null?IDENTIFICADOR10.getText():null), IDENTIFICADOR10.getLine(), IDENTIFICADOR10.getCharPositionInLine());
            		}

            pushFollow(FOLLOW_listaDeTipos_in_tipo544);
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
    // fontes/g/CanecaSemanticoResolucao.g:243:1: listaDeTipos[Tipo tipoPai] : ^( TIPOS_ ( tipo )* ) ;
    public final void listaDeTipos(Tipo tipoPai) throws RecognitionException {
        Tipo tipo11 =null;


        try {
            // fontes/g/CanecaSemanticoResolucao.g:244:2: ( ^( TIPOS_ ( tipo )* ) )
            // fontes/g/CanecaSemanticoResolucao.g:244:4: ^( TIPOS_ ( tipo )* )
            {
            match(input,TIPOS_,FOLLOW_TIPOS__in_listaDeTipos559); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemanticoResolucao.g:244:13: ( tipo )*
                loop9:
                do {
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==TIPO_) ) {
                        alt9=1;
                    }


                    switch (alt9) {
                	case 1 :
                	    // fontes/g/CanecaSemanticoResolucao.g:244:14: tipo
                	    {
                	    pushFollow(FOLLOW_tipo_in_listaDeTipos562);
                	    tipo11=tipo();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    if ( state.backtracking==1 ) {
                	    			tipoPai.adicionarTipoAninhado(tipo11);
                	    		}

                	    }
                	    break;

                	default :
                	    break loop9;
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
    public static final BitSet FOLLOW_instanciacao_in_topdown90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarClasse_in_bottomup101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarMetodo_in_bottomup106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarConstrutor_in_bottomup111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarDestrutor_in_bottomup116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarBloco_in_bottomup121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_referencia_in_bottomup126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chamada_in_bottomup131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASSE__in_iniciarClasse143 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_iniciarClasse147 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_CLASSE__in_terminarClasse169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METODO__in_iniciarMetodo185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_iniciarMetodo188 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ESTATICO_in_iniciarMetodo193 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_tipo_in_iniciarMetodo197 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_iniciarMetodo199 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_METODO__in_terminarMetodo220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUTOR__in_iniciarConstrutor236 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_iniciarConstrutor239 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_iniciarConstrutor243 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_CONSTRUTOR__in_terminarConstrutor264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTRUTOR__in_iniciarDestrutor280 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_iniciarDestrutor283 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_iniciarDestrutor287 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DESTRUTOR__in_terminarDestrutor308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCOES__in_iniciarBloco324 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INSTRUCOES__in_terminarBloco345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARACAO__in_declaracao361 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_declaracao363 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_declaracao365 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATRIBUTO__in_declaracaoDeAtributo382 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ESTATICO_in_declaracaoDeAtributo387 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_tipo_in_declaracaoDeAtributo391 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_declaracaoDeAtributo393 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_INSTANCIACAO__in_instanciacao415 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_instanciacao417 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_REFERENCIA__in_referencia436 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_referencia442 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REFERENCIA__in_referencia463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_referencia465 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_set_in_chamada484 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_chamada492 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_chamada503 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_chamada511 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_TIPO__in_tipo534 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_tipo536 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_listaDeTipos_in_tipo544 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIPOS__in_listaDeTipos559 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_listaDeTipos562 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000000L});

}