// $ANTLR 3.4 fontes/g/CanecaSemanticoResolucao.g 2012-12-05 02:33:04

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
    	private Queue<Escopo> filaDeReferencias;
    	
    	public void fixarFilaDeEscopos(Queue<Escopo> filaDeEscopos) {
    		this.filaDeEscopos = filaDeEscopos;
    		this.escopoAtual = filaDeEscopos.poll();
    	}
    	
    	public void fixarFilaDeReferencias(Queue<Escopo> filaDeReferencias) {
    		this.filaDeReferencias = filaDeReferencias;
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
    // fontes/g/CanecaSemanticoResolucao.g:53:1: topdown : ( iniciarClasse | iniciarMetodo | iniciarConstrutor | iniciarDestrutor | iniciarBloco | declaracao | declaracaoDeAtributo | comando );
    public final void topdown() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoResolucao.g:54:2: ( iniciarClasse | iniciarMetodo | iniciarConstrutor | iniciarDestrutor | iniciarBloco | declaracao | declaracaoDeAtributo | comando )
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
            case COMANDO_:
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
                    // fontes/g/CanecaSemanticoResolucao.g:54:4: iniciarClasse
                    {
                    pushFollow(FOLLOW_iniciarClasse_in_topdown55);
                    iniciarClasse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemanticoResolucao.g:55:4: iniciarMetodo
                    {
                    pushFollow(FOLLOW_iniciarMetodo_in_topdown60);
                    iniciarMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemanticoResolucao.g:56:4: iniciarConstrutor
                    {
                    pushFollow(FOLLOW_iniciarConstrutor_in_topdown65);
                    iniciarConstrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSemanticoResolucao.g:57:4: iniciarDestrutor
                    {
                    pushFollow(FOLLOW_iniciarDestrutor_in_topdown70);
                    iniciarDestrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSemanticoResolucao.g:58:4: iniciarBloco
                    {
                    pushFollow(FOLLOW_iniciarBloco_in_topdown75);
                    iniciarBloco();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // fontes/g/CanecaSemanticoResolucao.g:59:4: declaracao
                    {
                    pushFollow(FOLLOW_declaracao_in_topdown80);
                    declaracao();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // fontes/g/CanecaSemanticoResolucao.g:60:4: declaracaoDeAtributo
                    {
                    pushFollow(FOLLOW_declaracaoDeAtributo_in_topdown85);
                    declaracaoDeAtributo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // fontes/g/CanecaSemanticoResolucao.g:61:4: comando
                    {
                    pushFollow(FOLLOW_comando_in_topdown90);
                    comando();

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
    // fontes/g/CanecaSemanticoResolucao.g:64:1: bottomup : ( terminarClasse | terminarMetodo | terminarConstrutor | terminarDestrutor | terminarBloco );
    public final void bottomup() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoResolucao.g:65:2: ( terminarClasse | terminarMetodo | terminarConstrutor | terminarDestrutor | terminarBloco )
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
                    // fontes/g/CanecaSemanticoResolucao.g:65:4: terminarClasse
                    {
                    pushFollow(FOLLOW_terminarClasse_in_bottomup101);
                    terminarClasse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemanticoResolucao.g:66:4: terminarMetodo
                    {
                    pushFollow(FOLLOW_terminarMetodo_in_bottomup106);
                    terminarMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemanticoResolucao.g:67:4: terminarConstrutor
                    {
                    pushFollow(FOLLOW_terminarConstrutor_in_bottomup111);
                    terminarConstrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSemanticoResolucao.g:68:4: terminarDestrutor
                    {
                    pushFollow(FOLLOW_terminarDestrutor_in_bottomup116);
                    terminarDestrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSemanticoResolucao.g:69:4: terminarBloco
                    {
                    pushFollow(FOLLOW_terminarBloco_in_bottomup121);
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
    // fontes/g/CanecaSemanticoResolucao.g:72:1: iniciarClasse : ^( CLASSE_ . IDENTIFICADOR . . . ) ;
    public final void iniciarClasse() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoResolucao.g:73:2: ( ^( CLASSE_ . IDENTIFICADOR . . . ) )
            // fontes/g/CanecaSemanticoResolucao.g:73:4: ^( CLASSE_ . IDENTIFICADOR . . . )
            {
            match(input,CLASSE_,FOLLOW_CLASSE__in_iniciarClasse133); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_iniciarClasse137); if (state.failed) return ;

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
    // fontes/g/CanecaSemanticoResolucao.g:79:1: terminarClasse : CLASSE_ ;
    public final void terminarClasse() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoResolucao.g:80:2: ( CLASSE_ )
            // fontes/g/CanecaSemanticoResolucao.g:80:4: CLASSE_
            {
            match(input,CLASSE_,FOLLOW_CLASSE__in_terminarClasse159); if (state.failed) return ;

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
    // fontes/g/CanecaSemanticoResolucao.g:86:1: iniciarMetodo : ^( METODO_ ^( ASSINATURA_ . ( ESTATICO )? tipo IDENTIFICADOR . ) . ) ;
    public final void iniciarMetodo() throws RecognitionException {
        Tipo tipo1 =null;


        try {
            // fontes/g/CanecaSemanticoResolucao.g:87:2: ( ^( METODO_ ^( ASSINATURA_ . ( ESTATICO )? tipo IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemanticoResolucao.g:87:4: ^( METODO_ ^( ASSINATURA_ . ( ESTATICO )? tipo IDENTIFICADOR . ) . )
            {
            match(input,METODO_,FOLLOW_METODO__in_iniciarMetodo175); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_iniciarMetodo178); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            // fontes/g/CanecaSemanticoResolucao.g:87:30: ( ESTATICO )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ESTATICO) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // fontes/g/CanecaSemanticoResolucao.g:87:31: ESTATICO
                    {
                    match(input,ESTATICO,FOLLOW_ESTATICO_in_iniciarMetodo183); if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_iniciarMetodo187);
            tipo1=tipo();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_iniciarMetodo189); if (state.failed) return ;

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
    // fontes/g/CanecaSemanticoResolucao.g:95:1: terminarMetodo : METODO_ ;
    public final void terminarMetodo() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoResolucao.g:96:2: ( METODO_ )
            // fontes/g/CanecaSemanticoResolucao.g:96:4: METODO_
            {
            match(input,METODO_,FOLLOW_METODO__in_terminarMetodo210); if (state.failed) return ;

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
    // fontes/g/CanecaSemanticoResolucao.g:102:1: iniciarConstrutor : ^( CONSTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . ) ;
    public final void iniciarConstrutor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoResolucao.g:103:2: ( ^( CONSTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemanticoResolucao.g:103:4: ^( CONSTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . )
            {
            match(input,CONSTRUTOR_,FOLLOW_CONSTRUTOR__in_iniciarConstrutor226); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_iniciarConstrutor229); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_iniciarConstrutor233); if (state.failed) return ;

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
    // fontes/g/CanecaSemanticoResolucao.g:109:1: terminarConstrutor : CONSTRUTOR_ ;
    public final void terminarConstrutor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoResolucao.g:110:2: ( CONSTRUTOR_ )
            // fontes/g/CanecaSemanticoResolucao.g:110:4: CONSTRUTOR_
            {
            match(input,CONSTRUTOR_,FOLLOW_CONSTRUTOR__in_terminarConstrutor254); if (state.failed) return ;

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
    // fontes/g/CanecaSemanticoResolucao.g:116:1: iniciarDestrutor : ^( DESTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . ) ;
    public final void iniciarDestrutor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoResolucao.g:117:2: ( ^( DESTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . ) )
            // fontes/g/CanecaSemanticoResolucao.g:117:4: ^( DESTRUTOR_ ^( ASSINATURA_ . IDENTIFICADOR . ) . )
            {
            match(input,DESTRUTOR_,FOLLOW_DESTRUTOR__in_iniciarDestrutor270); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ASSINATURA_,FOLLOW_ASSINATURA__in_iniciarDestrutor273); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_iniciarDestrutor277); if (state.failed) return ;

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
    // fontes/g/CanecaSemanticoResolucao.g:123:1: terminarDestrutor : DESTRUTOR_ ;
    public final void terminarDestrutor() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoResolucao.g:124:2: ( DESTRUTOR_ )
            // fontes/g/CanecaSemanticoResolucao.g:124:4: DESTRUTOR_
            {
            match(input,DESTRUTOR_,FOLLOW_DESTRUTOR__in_terminarDestrutor298); if (state.failed) return ;

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
    // fontes/g/CanecaSemanticoResolucao.g:130:1: iniciarBloco : ^( INSTRUCOES_ ( . )* ) ;
    public final void iniciarBloco() throws RecognitionException {
        CommonTree INSTRUCOES_2=null;

        try {
            // fontes/g/CanecaSemanticoResolucao.g:131:2: ( ^( INSTRUCOES_ ( . )* ) )
            // fontes/g/CanecaSemanticoResolucao.g:131:4: ^( INSTRUCOES_ ( . )* )
            {
            INSTRUCOES_2=(CommonTree)match(input,INSTRUCOES_,FOLLOW_INSTRUCOES__in_iniciarBloco314); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemanticoResolucao.g:131:18: ( . )*
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
                	    // fontes/g/CanecaSemanticoResolucao.g:131:19: .
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
    // fontes/g/CanecaSemanticoResolucao.g:139:1: terminarBloco : INSTRUCOES_ ;
    public final void terminarBloco() throws RecognitionException {
        CommonTree INSTRUCOES_3=null;

        try {
            // fontes/g/CanecaSemanticoResolucao.g:140:2: ( INSTRUCOES_ )
            // fontes/g/CanecaSemanticoResolucao.g:140:4: INSTRUCOES_
            {
            INSTRUCOES_3=(CommonTree)match(input,INSTRUCOES_,FOLLOW_INSTRUCOES__in_terminarBloco335); if (state.failed) return ;

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
    // fontes/g/CanecaSemanticoResolucao.g:148:1: declaracao : ^( DECLARACAO_ tipo IDENTIFICADOR ) ;
    public final void declaracao() throws RecognitionException {
        Tipo tipo4 =null;


        try {
            // fontes/g/CanecaSemanticoResolucao.g:149:2: ( ^( DECLARACAO_ tipo IDENTIFICADOR ) )
            // fontes/g/CanecaSemanticoResolucao.g:149:4: ^( DECLARACAO_ tipo IDENTIFICADOR )
            {
            match(input,DECLARACAO_,FOLLOW_DECLARACAO__in_declaracao351); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tipo_in_declaracao353);
            tipo4=tipo();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_declaracao355); if (state.failed) return ;

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
    // fontes/g/CanecaSemanticoResolucao.g:156:1: declaracaoDeAtributo : ^( ATRIBUTO_ . ( ESTATICO )? tipo IDENTIFICADOR ( . )? ) ;
    public final void declaracaoDeAtributo() throws RecognitionException {
        Tipo tipo5 =null;


        try {
            // fontes/g/CanecaSemanticoResolucao.g:157:2: ( ^( ATRIBUTO_ . ( ESTATICO )? tipo IDENTIFICADOR ( . )? ) )
            // fontes/g/CanecaSemanticoResolucao.g:157:4: ^( ATRIBUTO_ . ( ESTATICO )? tipo IDENTIFICADOR ( . )? )
            {
            match(input,ATRIBUTO_,FOLLOW_ATRIBUTO__in_declaracaoDeAtributo372); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;

            // fontes/g/CanecaSemanticoResolucao.g:157:18: ( ESTATICO )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ESTATICO) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // fontes/g/CanecaSemanticoResolucao.g:157:19: ESTATICO
                    {
                    match(input,ESTATICO,FOLLOW_ESTATICO_in_declaracaoDeAtributo377); if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_declaracaoDeAtributo381);
            tipo5=tipo();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_declaracaoDeAtributo383); if (state.failed) return ;

            // fontes/g/CanecaSemanticoResolucao.g:157:49: ( . )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0 >= ATRIBUIDOR && LA6_0 <= UNIDADE_)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // fontes/g/CanecaSemanticoResolucao.g:157:50: .
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



    // $ANTLR start "comando"
    // fontes/g/CanecaSemanticoResolucao.g:164:1: comando : ^( COMANDO_ referencia ( chamada )* ) ;
    public final void comando() throws RecognitionException {
        try {
            // fontes/g/CanecaSemanticoResolucao.g:168:2: ( ^( COMANDO_ referencia ( chamada )* ) )
            // fontes/g/CanecaSemanticoResolucao.g:168:4: ^( COMANDO_ referencia ( chamada )* )
            {
            match(input,COMANDO_,FOLLOW_COMANDO__in_comando411); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_referencia_in_comando413);
            referencia();

            state._fsp--;
            if (state.failed) return ;

            // fontes/g/CanecaSemanticoResolucao.g:168:26: ( chamada )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= CHAMADA_DE_CLASSE && LA7_0 <= CHAMADA_DE_OBJETO)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // fontes/g/CanecaSemanticoResolucao.g:168:27: chamada
            	    {
            	    pushFollow(FOLLOW_chamada_in_comando416);
            	    chamada();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            }

            if ( state.backtracking==1 ) {
            		filaDeReferencias.add(referencia);
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
    // $ANTLR end "comando"



    // $ANTLR start "referencia"
    // fontes/g/CanecaSemanticoResolucao.g:171:1: referencia : ( ^( REFERENCIA_ identificador= ( IDENTIFICADOR | ESSE | ESSA ) ) | ^( REFERENCIA_ IDENTIFICADOR . ) | ^( REFERENCIA_ ^( INSTANCIACAO_ tipo . ) ) );
    public final void referencia() throws RecognitionException {
        CommonTree identificador=null;
        CommonTree IDENTIFICADOR6=null;
        Tipo tipo7 =null;


        try {
            // fontes/g/CanecaSemanticoResolucao.g:172:2: ( ^( REFERENCIA_ identificador= ( IDENTIFICADOR | ESSE | ESSA ) ) | ^( REFERENCIA_ IDENTIFICADOR . ) | ^( REFERENCIA_ ^( INSTANCIACAO_ tipo . ) ) )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==REFERENCIA_) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case IDENTIFICADOR:
                        {
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
                        break;
                    case ESSA:
                    case ESSE:
                        {
                        alt8=1;
                        }
                        break;
                    case INSTANCIACAO_:
                        {
                        alt8=3;
                        }
                        break;
                    default:
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
                    // fontes/g/CanecaSemanticoResolucao.g:172:4: ^( REFERENCIA_ identificador= ( IDENTIFICADOR | ESSE | ESSA ) )
                    {
                    match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_referencia431); if (state.failed) return ;

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
                    			//filaDeReferencias.add(referencia);
                    		}

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemanticoResolucao.g:198:4: ^( REFERENCIA_ IDENTIFICADOR . )
                    {
                    match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_referencia458); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    IDENTIFICADOR6=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_referencia460); if (state.failed) return ;

                    matchAny(input); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==1 ) {
                    			Metodo referenciaDeMetodo = escopoAtual.resolverMetodo((IDENTIFICADOR6!=null?IDENTIFICADOR6.getText():null));
                    			reportarResolucao((IDENTIFICADOR6!=null?IDENTIFICADOR6.getText():null), referenciaDeMetodo, "metodo", IDENTIFICADOR6.getLine(), IDENTIFICADOR6.getCharPositionInLine());
                    			referencia = referenciaDeMetodo;
                    			if (referenciaDeMetodo != Metodo.NAO_ENCONTRADO) {
                    				referencia = new Variavel("retorno", referencia.fornecerTipo(), 0);
                    				referencia.abrir(escopoAtual);
                    				referencia.fechar();
                    			} else {
                    				referencia = null;
                    			}
                    			//filaDeReferencias.add(referencia);
                    		}

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSemanticoResolucao.g:212:4: ^( REFERENCIA_ ^( INSTANCIACAO_ tipo . ) )
                    {
                    match(input,REFERENCIA_,FOLLOW_REFERENCIA__in_referencia473); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,INSTANCIACAO_,FOLLOW_INSTANCIACAO__in_referencia476); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_tipo_in_referencia478);
                    tipo7=tipo();

                    state._fsp--;
                    if (state.failed) return ;

                    matchAny(input); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==1 ) {
                    			Classe referenciaDeClasse = escopoAtual.resolverClasse(tipo7.fornecerNome());
                    			reportarResolucao(tipo7.fornecerNome(), referenciaDeClasse, "classe", tipo7.fornecerLinha(), tipo7.fornecerColuna());
                    			referencia = referenciaDeClasse;
                    			if (referenciaDeClasse != Classe.NAO_ENCONTRADA) {
                    				referencia = new Variavel("instancia", tipo7, 0);
                    				referencia.abrir(escopoAtual);
                    				referencia.fechar();
                    			} else {
                    				referencia = null;
                    			}
                    			//filaDeReferencias.add(referencia);
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
    // fontes/g/CanecaSemanticoResolucao.g:228:1: chamada : ( ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ) | ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR . ) );
    public final void chamada() throws RecognitionException {
        CommonTree IDENTIFICADOR8=null;
        CommonTree IDENTIFICADOR9=null;

        try {
            // fontes/g/CanecaSemanticoResolucao.g:229:2: ( ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ) | ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR . ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0 >= CHAMADA_DE_CLASSE && LA9_0 <= CHAMADA_DE_OBJETO)) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==DOWN) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==IDENTIFICADOR) ) {
                        int LA9_3 = input.LA(4);

                        if ( (LA9_3==UP) ) {
                            alt9=1;
                        }
                        else if ( ((LA9_3 >= ATRIBUIDOR && LA9_3 <= UNIDADE_)) ) {
                            alt9=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // fontes/g/CanecaSemanticoResolucao.g:229:4: ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR )
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
                    IDENTIFICADOR8=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_chamada506); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==1 ) {
                    			if (referencia != null) {
                    				Atributo referenciaDeAtributo = referencia.resolverAtributo((IDENTIFICADOR8!=null?IDENTIFICADOR8.getText():null));
                    				reportarResolucao((IDENTIFICADOR8!=null?IDENTIFICADOR8.getText():null), referenciaDeAtributo, "atributo", IDENTIFICADOR8.getLine(), IDENTIFICADOR8.getCharPositionInLine());
                    				referencia = referenciaDeAtributo;
                    				if (referenciaDeAtributo == Atributo.NAO_ENCONTRADO) {
                    					referencia = null;
                    				}
                    				//filaDeReferencias.add(referencia);
                    			}
                    		}

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSemanticoResolucao.g:241:4: ^( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR . )
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
                    IDENTIFICADOR9=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_chamada525); if (state.failed) return ;

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
                    				//filaDeReferencias.add(referencia);
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
    // fontes/g/CanecaSemanticoResolucao.g:259:1: tipo returns [Tipo umTipo] : ^( TIPO_ IDENTIFICADOR listaDeTipos[umTipo] ) ;
    public final Tipo tipo() throws RecognitionException {
        Tipo umTipo = null;


        CommonTree IDENTIFICADOR10=null;

        try {
            // fontes/g/CanecaSemanticoResolucao.g:260:2: ( ^( TIPO_ IDENTIFICADOR listaDeTipos[umTipo] ) )
            // fontes/g/CanecaSemanticoResolucao.g:260:4: ^( TIPO_ IDENTIFICADOR listaDeTipos[umTipo] )
            {
            match(input,TIPO_,FOLLOW_TIPO__in_tipo548); if (state.failed) return umTipo;

            match(input, Token.DOWN, null); if (state.failed) return umTipo;
            IDENTIFICADOR10=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_tipo550); if (state.failed) return umTipo;

            if ( state.backtracking==1 ) {
            			umTipo = new Tipo((IDENTIFICADOR10!=null?IDENTIFICADOR10.getText():null), IDENTIFICADOR10.getLine(), IDENTIFICADOR10.getCharPositionInLine());
            		}

            pushFollow(FOLLOW_listaDeTipos_in_tipo558);
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
    // fontes/g/CanecaSemanticoResolucao.g:267:1: listaDeTipos[Tipo tipoPai] : ^( TIPOS_ ( tipo )* ) ;
    public final void listaDeTipos(Tipo tipoPai) throws RecognitionException {
        Tipo tipo11 =null;


        try {
            // fontes/g/CanecaSemanticoResolucao.g:268:2: ( ^( TIPOS_ ( tipo )* ) )
            // fontes/g/CanecaSemanticoResolucao.g:268:4: ^( TIPOS_ ( tipo )* )
            {
            match(input,TIPOS_,FOLLOW_TIPOS__in_listaDeTipos573); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // fontes/g/CanecaSemanticoResolucao.g:268:13: ( tipo )*
                loop10:
                do {
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==TIPO_) ) {
                        alt10=1;
                    }


                    switch (alt10) {
                	case 1 :
                	    // fontes/g/CanecaSemanticoResolucao.g:268:14: tipo
                	    {
                	    pushFollow(FOLLOW_tipo_in_listaDeTipos576);
                	    tipo11=tipo();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    if ( state.backtracking==1 ) {
                	    			tipoPai.adicionarTipoAninhado(tipo11);
                	    		}

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
    public static final BitSet FOLLOW_comando_in_topdown90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarClasse_in_bottomup101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarMetodo_in_bottomup106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarConstrutor_in_bottomup111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarDestrutor_in_bottomup116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminarBloco_in_bottomup121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASSE__in_iniciarClasse133 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_iniciarClasse137 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_CLASSE__in_terminarClasse159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METODO__in_iniciarMetodo175 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_iniciarMetodo178 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ESTATICO_in_iniciarMetodo183 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_tipo_in_iniciarMetodo187 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_iniciarMetodo189 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_METODO__in_terminarMetodo210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUTOR__in_iniciarConstrutor226 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_iniciarConstrutor229 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_iniciarConstrutor233 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_CONSTRUTOR__in_terminarConstrutor254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTRUTOR__in_iniciarDestrutor270 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSINATURA__in_iniciarDestrutor273 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_iniciarDestrutor277 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_DESTRUTOR__in_terminarDestrutor298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCOES__in_iniciarBloco314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INSTRUCOES__in_terminarBloco335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARACAO__in_declaracao351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_declaracao353 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_declaracao355 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATRIBUTO__in_declaracaoDeAtributo372 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ESTATICO_in_declaracaoDeAtributo377 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_tipo_in_declaracaoDeAtributo381 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_declaracaoDeAtributo383 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_COMANDO__in_comando411 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_referencia_in_comando413 = new BitSet(new long[]{0x0000000000000C08L});
    public static final BitSet FOLLOW_chamada_in_comando416 = new BitSet(new long[]{0x0000000000000C08L});
    public static final BitSet FOLLOW_REFERENCIA__in_referencia431 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_referencia437 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REFERENCIA__in_referencia458 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_referencia460 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_REFERENCIA__in_referencia473 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INSTANCIACAO__in_referencia476 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_referencia478 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_set_in_chamada498 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_chamada506 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_chamada517 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_chamada525 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
    public static final BitSet FOLLOW_TIPO__in_tipo548 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_tipo550 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_listaDeTipos_in_tipo558 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIPOS__in_listaDeTipos573 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_listaDeTipos576 = new BitSet(new long[]{0x0000000000000008L,0x8000000000000000L});

}