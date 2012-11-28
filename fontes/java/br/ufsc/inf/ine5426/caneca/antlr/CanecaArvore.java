// $ANTLR 3.4 fontes/g/CanecaArvore.g 2012-11-27 22:14:58

	package br.ufsc.inf.ine5426.caneca.antlr;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class CanecaArvore extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATRIBUIDOR", "ATRIBUTO", "CAPTURE", "CARACTERE", "CARACTERE_DE_ESCAPE", "CARACTERE_NAO_IMPRIMIVEL", "CHAMADA_DE_CLASSE", "CHAMADA_DE_OBJETO", "CLASSE", "COLCHETE_DIREITO", "COLCHETE_ESQUERDO", "COMENTARIO_EM_BLOCO", "COMENTARIO_EM_LINHA", "COMO", "CONSTANTE_INTEIRA", "CONSTANTE_REAL", "CONSTRUTOR", "DECLARE", "DESTRUA", "DESTRUTOR", "DIFERENTE", "DIGITO", "DIVISAO", "E", "ENQUANTO", "ESPACO_EM_BRANCO", "ESSA", "ESSE", "ESTATICO", "FIM", "IDENTIFICADOR", "IDENTIFICADOR_DE_PACOTE", "IGUAL", "IMPLEMENTA", "IMPORTE", "INICIO", "INTERFACE", "LANCE", "LETRA", "LITERAL_CARACTERE", "LITERAL_TEXTO", "MAIOR", "MAIOR_IGUAL", "MENOR", "MENOR_IGUAL", "METODO", "MULTIPLICACAO", "NEGACAO", "NOVA", "NOVO", "OU", "PACOTE", "PARA", "PARENTESE_DIREITO", "PARENTESE_ESQUERDO", "PRIVADA", "PRIVADO", "PROTEGIDA", "PROTEGIDO", "PUBLICA", "PUBLICO", "QUEBRA_DE_LINHA", "REPITA", "RESTO_DA_DIVISAO", "RETORNE", "SE", "SENAO", "SEPARADOR", "SOMA", "SUBTRACAO", "TABULACAO", "TENTE", "TERMINADOR", "USADO_EM_TEXTO", "VALOR_BOOLEANO", "VALOR_NULO", "ARGUMENTOS_", "ASSINATURAS_DE_METODOS_", "ASSINATURA_", "ASSINATURA_DE_METODO_", "ATRIBUICAO_", "ATRIBUTOS_", "ATRIBUTO_", "CABECALHO_", "CAPTURAS_", "CAPTURE_", "CHAMADA_DE_CLASSE_", "CHAMADA_DE_OBJETO_", "CLASSE_", "COMANDO_", "CONSTRUTORES_", "CONSTRUTOR_", "CORPO_", "DECLARACAO_", "DECLARACAO_COM_ATRIBUICAO_OPICIONAL_", "DESTRUICAO_", "DESTRUTORES_", "DESTRUTOR_", "ENQUANTO_", "EXPRESSAO_", "IMPORTACAO_", "IMPORTACOES_", "INSTANCIACAO_", "INSTRUCOES_", "INTERFACES_", "INTERFACE_", "LANCE_", "METODOS_", "METODO_", "PACOTE_", "PARAMETROS_", "PARA_", "PROGRAMA_", "REPITA_", "RETORNO_", "SELECAO_", "SE_", "TENTE_", "TIPOS_", "TIPOS_GENERICOS_", "TIPO_", "TIPO_GENERICO_", "UNIDADE_"
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
    public static final int REPITA_=117;
    public static final int RETORNO_=118;
    public static final int SELECAO_=119;
    public static final int SE_=120;
    public static final int TENTE_=121;
    public static final int TIPOS_=122;
    public static final int TIPOS_GENERICOS_=123;
    public static final int TIPO_=124;
    public static final int TIPO_GENERICO_=125;
    public static final int UNIDADE_=126;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public CanecaArvore(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public CanecaArvore(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return CanecaArvore.tokenNames; }
    public String getGrammarFileName() { return "fontes/g/CanecaArvore.g"; }


    	@Override
    	public void recover(IntStream entrada, RecognitionException erro) {
    		
    	}
    	
    	@Override
    	public Object recoverFromMismatchedToken(IntStream entrada, int tipoDoSimbolo, BitSet conjuntoDeFollows) throws RecognitionException {
    		throw new MismatchedTokenException(tipoDoSimbolo, entrada);
    	}
    	
    	@Override
    	public Object recoverFromMismatchedSet(IntStream entrada, RecognitionException erro, BitSet conjuntoDeFollows) throws RecognitionException {
    		throw erro;
    	}


    public static class programa_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "programa"
    // fontes/g/CanecaArvore.g:90:1: programa : ( unicadeDeCompilacao )+ -> ^( PROGRAMA_ ( unicadeDeCompilacao )+ ) ;
    public final CanecaArvore.programa_return programa() throws RecognitionException {
        CanecaArvore.programa_return retval = new CanecaArvore.programa_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CanecaArvore.unicadeDeCompilacao_return unicadeDeCompilacao1 =null;


        RewriteRuleSubtreeStream stream_unicadeDeCompilacao=new RewriteRuleSubtreeStream(adaptor,"rule unicadeDeCompilacao");
        try {
            // fontes/g/CanecaArvore.g:91:2: ( ( unicadeDeCompilacao )+ -> ^( PROGRAMA_ ( unicadeDeCompilacao )+ ) )
            // fontes/g/CanecaArvore.g:91:4: ( unicadeDeCompilacao )+
            {
            // fontes/g/CanecaArvore.g:91:4: ( unicadeDeCompilacao )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==PACOTE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // fontes/g/CanecaArvore.g:91:5: unicadeDeCompilacao
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_unicadeDeCompilacao_in_programa279);
            	    unicadeDeCompilacao1=unicadeDeCompilacao();

            	    state._fsp--;

            	    stream_unicadeDeCompilacao.add(unicadeDeCompilacao1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // AST REWRITE
            // elements: unicadeDeCompilacao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 91:27: -> ^( PROGRAMA_ ( unicadeDeCompilacao )+ )
            {
                // fontes/g/CanecaArvore.g:91:30: ^( PROGRAMA_ ( unicadeDeCompilacao )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PROGRAMA_, "PROGRAMA_")
                , root_1);

                if ( !(stream_unicadeDeCompilacao.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_unicadeDeCompilacao.hasNext() ) {
                    adaptor.addChild(root_1, stream_unicadeDeCompilacao.nextTree());

                }
                stream_unicadeDeCompilacao.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "programa"


    public static class unicadeDeCompilacao_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unicadeDeCompilacao"
    // fontes/g/CanecaArvore.g:94:1: unicadeDeCompilacao : cabecalho ( classe -> ^( UNIDADE_ cabecalho classe ) | interfaces -> ^( UNIDADE_ cabecalho interfaces ) ) ;
    public final CanecaArvore.unicadeDeCompilacao_return unicadeDeCompilacao() throws RecognitionException {
        CanecaArvore.unicadeDeCompilacao_return retval = new CanecaArvore.unicadeDeCompilacao_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CanecaArvore.cabecalho_return cabecalho2 =null;

        CanecaArvore.classe_return classe3 =null;

        CanecaArvore.interfaces_return interfaces4 =null;


        RewriteRuleSubtreeStream stream_classe=new RewriteRuleSubtreeStream(adaptor,"rule classe");
        RewriteRuleSubtreeStream stream_interfaces=new RewriteRuleSubtreeStream(adaptor,"rule interfaces");
        RewriteRuleSubtreeStream stream_cabecalho=new RewriteRuleSubtreeStream(adaptor,"rule cabecalho");
        try {
            // fontes/g/CanecaArvore.g:95:2: ( cabecalho ( classe -> ^( UNIDADE_ cabecalho classe ) | interfaces -> ^( UNIDADE_ cabecalho interfaces ) ) )
            // fontes/g/CanecaArvore.g:95:4: cabecalho ( classe -> ^( UNIDADE_ cabecalho classe ) | interfaces -> ^( UNIDADE_ cabecalho interfaces ) )
            {
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_cabecalho_in_unicadeDeCompilacao303);
            cabecalho2=cabecalho();

            state._fsp--;

            stream_cabecalho.add(cabecalho2.getTree());

            // fontes/g/CanecaArvore.g:96:3: ( classe -> ^( UNIDADE_ cabecalho classe ) | interfaces -> ^( UNIDADE_ cabecalho interfaces ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CLASSE) ) {
                alt2=1;
            }
            else if ( (LA2_0==INTERFACE) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // fontes/g/CanecaArvore.g:96:5: classe
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_classe_in_unicadeDeCompilacao309);
                    classe3=classe();

                    state._fsp--;

                    stream_classe.add(classe3.getTree());

                    // AST REWRITE
                    // elements: classe, cabecalho
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 96:12: -> ^( UNIDADE_ cabecalho classe )
                    {
                        // fontes/g/CanecaArvore.g:96:15: ^( UNIDADE_ cabecalho classe )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(UNIDADE_, "UNIDADE_")
                        , root_1);

                        adaptor.addChild(root_1, stream_cabecalho.nextTree());

                        adaptor.addChild(root_1, stream_classe.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaArvore.g:97:5: interfaces
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_interfaces_in_unicadeDeCompilacao325);
                    interfaces4=interfaces();

                    state._fsp--;

                    stream_interfaces.add(interfaces4.getTree());

                    // AST REWRITE
                    // elements: interfaces, cabecalho
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 97:16: -> ^( UNIDADE_ cabecalho interfaces )
                    {
                        // fontes/g/CanecaArvore.g:97:19: ^( UNIDADE_ cabecalho interfaces )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(UNIDADE_, "UNIDADE_")
                        , root_1);

                        adaptor.addChild(root_1, stream_cabecalho.nextTree());

                        adaptor.addChild(root_1, stream_interfaces.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unicadeDeCompilacao"


    public static class cabecalho_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cabecalho"
    // fontes/g/CanecaArvore.g:101:1: cabecalho : pacote importacoes -> ^( CABECALHO_ pacote importacoes ) ;
    public final CanecaArvore.cabecalho_return cabecalho() throws RecognitionException {
        CanecaArvore.cabecalho_return retval = new CanecaArvore.cabecalho_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CanecaArvore.pacote_return pacote5 =null;

        CanecaArvore.importacoes_return importacoes6 =null;


        RewriteRuleSubtreeStream stream_pacote=new RewriteRuleSubtreeStream(adaptor,"rule pacote");
        RewriteRuleSubtreeStream stream_importacoes=new RewriteRuleSubtreeStream(adaptor,"rule importacoes");
        try {
            // fontes/g/CanecaArvore.g:102:2: ( pacote importacoes -> ^( CABECALHO_ pacote importacoes ) )
            // fontes/g/CanecaArvore.g:102:4: pacote importacoes
            {
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pacote_in_cabecalho350);
            pacote5=pacote();

            state._fsp--;

            stream_pacote.add(pacote5.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_importacoes_in_cabecalho352);
            importacoes6=importacoes();

            state._fsp--;

            stream_importacoes.add(importacoes6.getTree());

            // AST REWRITE
            // elements: pacote, importacoes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 102:23: -> ^( CABECALHO_ pacote importacoes )
            {
                // fontes/g/CanecaArvore.g:102:26: ^( CABECALHO_ pacote importacoes )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CABECALHO_, "CABECALHO_")
                , root_1);

                adaptor.addChild(root_1, stream_pacote.nextTree());

                adaptor.addChild(root_1, stream_importacoes.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cabecalho"


    public static class pacote_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pacote"
    // fontes/g/CanecaArvore.g:105:1: pacote : PACOTE IDENTIFICADOR_DE_PACOTE TERMINADOR -> ^( PACOTE_ IDENTIFICADOR_DE_PACOTE ) ;
    public final CanecaArvore.pacote_return pacote() throws RecognitionException {
        CanecaArvore.pacote_return retval = new CanecaArvore.pacote_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PACOTE7=null;
        CommonTree IDENTIFICADOR_DE_PACOTE8=null;
        CommonTree TERMINADOR9=null;

        CommonTree PACOTE7_tree=null;
        CommonTree IDENTIFICADOR_DE_PACOTE8_tree=null;
        CommonTree TERMINADOR9_tree=null;
        RewriteRuleNodeStream stream_PACOTE=new RewriteRuleNodeStream(adaptor,"token PACOTE");
        RewriteRuleNodeStream stream_TERMINADOR=new RewriteRuleNodeStream(adaptor,"token TERMINADOR");
        RewriteRuleNodeStream stream_IDENTIFICADOR_DE_PACOTE=new RewriteRuleNodeStream(adaptor,"token IDENTIFICADOR_DE_PACOTE");

        try {
            // fontes/g/CanecaArvore.g:106:2: ( PACOTE IDENTIFICADOR_DE_PACOTE TERMINADOR -> ^( PACOTE_ IDENTIFICADOR_DE_PACOTE ) )
            // fontes/g/CanecaArvore.g:106:4: PACOTE IDENTIFICADOR_DE_PACOTE TERMINADOR
            {
            _last = (CommonTree)input.LT(1);
            PACOTE7=(CommonTree)match(input,PACOTE,FOLLOW_PACOTE_in_pacote373);  
            stream_PACOTE.add(PACOTE7);


            _last = (CommonTree)input.LT(1);
            IDENTIFICADOR_DE_PACOTE8=(CommonTree)match(input,IDENTIFICADOR_DE_PACOTE,FOLLOW_IDENTIFICADOR_DE_PACOTE_in_pacote375);  
            stream_IDENTIFICADOR_DE_PACOTE.add(IDENTIFICADOR_DE_PACOTE8);


            _last = (CommonTree)input.LT(1);
            TERMINADOR9=(CommonTree)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_pacote377);  
            stream_TERMINADOR.add(TERMINADOR9);


            // AST REWRITE
            // elements: IDENTIFICADOR_DE_PACOTE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 106:46: -> ^( PACOTE_ IDENTIFICADOR_DE_PACOTE )
            {
                // fontes/g/CanecaArvore.g:106:49: ^( PACOTE_ IDENTIFICADOR_DE_PACOTE )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PACOTE_, "PACOTE_")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFICADOR_DE_PACOTE.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pacote"


    public static class importacoes_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "importacoes"
    // fontes/g/CanecaArvore.g:109:1: importacoes : ( importacao )* -> ^( IMPORTACOES_ ( importacao )* ) ;
    public final CanecaArvore.importacoes_return importacoes() throws RecognitionException {
        CanecaArvore.importacoes_return retval = new CanecaArvore.importacoes_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CanecaArvore.importacao_return importacao10 =null;


        RewriteRuleSubtreeStream stream_importacao=new RewriteRuleSubtreeStream(adaptor,"rule importacao");
        try {
            // fontes/g/CanecaArvore.g:110:2: ( ( importacao )* -> ^( IMPORTACOES_ ( importacao )* ) )
            // fontes/g/CanecaArvore.g:110:4: ( importacao )*
            {
            // fontes/g/CanecaArvore.g:110:4: ( importacao )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IMPORTE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // fontes/g/CanecaArvore.g:110:5: importacao
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_importacao_in_importacoes397);
            	    importacao10=importacao();

            	    state._fsp--;

            	    stream_importacao.add(importacao10.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // AST REWRITE
            // elements: importacao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 110:18: -> ^( IMPORTACOES_ ( importacao )* )
            {
                // fontes/g/CanecaArvore.g:110:21: ^( IMPORTACOES_ ( importacao )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(IMPORTACOES_, "IMPORTACOES_")
                , root_1);

                // fontes/g/CanecaArvore.g:110:36: ( importacao )*
                while ( stream_importacao.hasNext() ) {
                    adaptor.addChild(root_1, stream_importacao.nextTree());

                }
                stream_importacao.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "importacoes"


    public static class importacao_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "importacao"
    // fontes/g/CanecaArvore.g:113:1: importacao : IMPORTE ( IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( COMO IDENTIFICADOR )? -> ^( IMPORTACAO_ IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( IDENTIFICADOR )? ) | IDENTIFICADOR_DE_PACOTE -> ^( IMPORTACAO_ IDENTIFICADOR_DE_PACOTE ) ) TERMINADOR ;
    public final CanecaArvore.importacao_return importacao() throws RecognitionException {
        CanecaArvore.importacao_return retval = new CanecaArvore.importacao_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IMPORTE11=null;
        CommonTree IDENTIFICADOR12=null;
        CommonTree IDENTIFICADOR_DE_PACOTE13=null;
        CommonTree COMO14=null;
        CommonTree IDENTIFICADOR15=null;
        CommonTree IDENTIFICADOR_DE_PACOTE16=null;
        CommonTree TERMINADOR17=null;

        CommonTree IMPORTE11_tree=null;
        CommonTree IDENTIFICADOR12_tree=null;
        CommonTree IDENTIFICADOR_DE_PACOTE13_tree=null;
        CommonTree COMO14_tree=null;
        CommonTree IDENTIFICADOR15_tree=null;
        CommonTree IDENTIFICADOR_DE_PACOTE16_tree=null;
        CommonTree TERMINADOR17_tree=null;
        RewriteRuleNodeStream stream_TERMINADOR=new RewriteRuleNodeStream(adaptor,"token TERMINADOR");
        RewriteRuleNodeStream stream_COMO=new RewriteRuleNodeStream(adaptor,"token COMO");
        RewriteRuleNodeStream stream_IMPORTE=new RewriteRuleNodeStream(adaptor,"token IMPORTE");
        RewriteRuleNodeStream stream_IDENTIFICADOR_DE_PACOTE=new RewriteRuleNodeStream(adaptor,"token IDENTIFICADOR_DE_PACOTE");
        RewriteRuleNodeStream stream_IDENTIFICADOR=new RewriteRuleNodeStream(adaptor,"token IDENTIFICADOR");

        try {
            // fontes/g/CanecaArvore.g:114:2: ( IMPORTE ( IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( COMO IDENTIFICADOR )? -> ^( IMPORTACAO_ IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( IDENTIFICADOR )? ) | IDENTIFICADOR_DE_PACOTE -> ^( IMPORTACAO_ IDENTIFICADOR_DE_PACOTE ) ) TERMINADOR )
            // fontes/g/CanecaArvore.g:114:4: IMPORTE ( IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( COMO IDENTIFICADOR )? -> ^( IMPORTACAO_ IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( IDENTIFICADOR )? ) | IDENTIFICADOR_DE_PACOTE -> ^( IMPORTACAO_ IDENTIFICADOR_DE_PACOTE ) ) TERMINADOR
            {
            _last = (CommonTree)input.LT(1);
            IMPORTE11=(CommonTree)match(input,IMPORTE,FOLLOW_IMPORTE_in_importacao421);  
            stream_IMPORTE.add(IMPORTE11);


            // fontes/g/CanecaArvore.g:115:3: ( IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( COMO IDENTIFICADOR )? -> ^( IMPORTACAO_ IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( IDENTIFICADOR )? ) | IDENTIFICADOR_DE_PACOTE -> ^( IMPORTACAO_ IDENTIFICADOR_DE_PACOTE ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDENTIFICADOR) ) {
                alt5=1;
            }
            else if ( (LA5_0==IDENTIFICADOR_DE_PACOTE) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // fontes/g/CanecaArvore.g:115:5: IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( COMO IDENTIFICADOR )?
                    {
                    _last = (CommonTree)input.LT(1);
                    IDENTIFICADOR12=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_importacao427);  
                    stream_IDENTIFICADOR.add(IDENTIFICADOR12);


                    _last = (CommonTree)input.LT(1);
                    IDENTIFICADOR_DE_PACOTE13=(CommonTree)match(input,IDENTIFICADOR_DE_PACOTE,FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao429);  
                    stream_IDENTIFICADOR_DE_PACOTE.add(IDENTIFICADOR_DE_PACOTE13);


                    // fontes/g/CanecaArvore.g:115:43: ( COMO IDENTIFICADOR )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==COMO) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // fontes/g/CanecaArvore.g:115:44: COMO IDENTIFICADOR
                            {
                            _last = (CommonTree)input.LT(1);
                            COMO14=(CommonTree)match(input,COMO,FOLLOW_COMO_in_importacao432);  
                            stream_COMO.add(COMO14);


                            _last = (CommonTree)input.LT(1);
                            IDENTIFICADOR15=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_importacao434);  
                            stream_IDENTIFICADOR.add(IDENTIFICADOR15);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: IDENTIFICADOR, IDENTIFICADOR, IDENTIFICADOR_DE_PACOTE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 115:65: -> ^( IMPORTACAO_ IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( IDENTIFICADOR )? )
                    {
                        // fontes/g/CanecaArvore.g:115:68: ^( IMPORTACAO_ IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( IDENTIFICADOR )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(IMPORTACAO_, "IMPORTACAO_")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENTIFICADOR.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_IDENTIFICADOR_DE_PACOTE.nextNode()
                        );

                        // fontes/g/CanecaArvore.g:115:120: ( IDENTIFICADOR )?
                        if ( stream_IDENTIFICADOR.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFICADOR.nextNode()
                            );

                        }
                        stream_IDENTIFICADOR.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaArvore.g:116:5: IDENTIFICADOR_DE_PACOTE
                    {
                    _last = (CommonTree)input.LT(1);
                    IDENTIFICADOR_DE_PACOTE16=(CommonTree)match(input,IDENTIFICADOR_DE_PACOTE,FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao457);  
                    stream_IDENTIFICADOR_DE_PACOTE.add(IDENTIFICADOR_DE_PACOTE16);


                    // AST REWRITE
                    // elements: IDENTIFICADOR_DE_PACOTE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 116:29: -> ^( IMPORTACAO_ IDENTIFICADOR_DE_PACOTE )
                    {
                        // fontes/g/CanecaArvore.g:116:32: ^( IMPORTACAO_ IDENTIFICADOR_DE_PACOTE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(IMPORTACAO_, "IMPORTACAO_")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENTIFICADOR_DE_PACOTE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            TERMINADOR17=(CommonTree)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_importacao471);  
            stream_TERMINADOR.add(TERMINADOR17);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "importacao"


    public static class classe_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classe"
    // fontes/g/CanecaArvore.g:120:1: classe : CLASSE modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaClasse -> ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaClasse ) ;
    public final CanecaArvore.classe_return classe() throws RecognitionException {
        CanecaArvore.classe_return retval = new CanecaArvore.classe_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CLASSE18=null;
        CommonTree IDENTIFICADOR20=null;
        CanecaArvore.modificadorDeAcessoFeminino_return modificadorDeAcessoFeminino19 =null;

        CanecaArvore.listaDeTiposGenericos_return listaDeTiposGenericos21 =null;

        CanecaArvore.listaDeInterfaces_return listaDeInterfaces22 =null;

        CanecaArvore.corpoDaClasse_return corpoDaClasse23 =null;


        CommonTree CLASSE18_tree=null;
        CommonTree IDENTIFICADOR20_tree=null;
        RewriteRuleNodeStream stream_CLASSE=new RewriteRuleNodeStream(adaptor,"token CLASSE");
        RewriteRuleNodeStream stream_IDENTIFICADOR=new RewriteRuleNodeStream(adaptor,"token IDENTIFICADOR");
        RewriteRuleSubtreeStream stream_modificadorDeAcessoFeminino=new RewriteRuleSubtreeStream(adaptor,"rule modificadorDeAcessoFeminino");
        RewriteRuleSubtreeStream stream_corpoDaClasse=new RewriteRuleSubtreeStream(adaptor,"rule corpoDaClasse");
        RewriteRuleSubtreeStream stream_listaDeTiposGenericos=new RewriteRuleSubtreeStream(adaptor,"rule listaDeTiposGenericos");
        RewriteRuleSubtreeStream stream_listaDeInterfaces=new RewriteRuleSubtreeStream(adaptor,"rule listaDeInterfaces");
        try {
            // fontes/g/CanecaArvore.g:121:2: ( CLASSE modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaClasse -> ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaClasse ) )
            // fontes/g/CanecaArvore.g:121:4: CLASSE modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaClasse
            {
            _last = (CommonTree)input.LT(1);
            CLASSE18=(CommonTree)match(input,CLASSE,FOLLOW_CLASSE_in_classe482);  
            stream_CLASSE.add(CLASSE18);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_modificadorDeAcessoFeminino_in_classe484);
            modificadorDeAcessoFeminino19=modificadorDeAcessoFeminino();

            state._fsp--;

            stream_modificadorDeAcessoFeminino.add(modificadorDeAcessoFeminino19.getTree());

            _last = (CommonTree)input.LT(1);
            IDENTIFICADOR20=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_classe486);  
            stream_IDENTIFICADOR.add(IDENTIFICADOR20);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_listaDeTiposGenericos_in_classe488);
            listaDeTiposGenericos21=listaDeTiposGenericos();

            state._fsp--;

            stream_listaDeTiposGenericos.add(listaDeTiposGenericos21.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_listaDeInterfaces_in_classe490);
            listaDeInterfaces22=listaDeInterfaces();

            state._fsp--;

            stream_listaDeInterfaces.add(listaDeInterfaces22.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_corpoDaClasse_in_classe492);
            corpoDaClasse23=corpoDaClasse();

            state._fsp--;

            stream_corpoDaClasse.add(corpoDaClasse23.getTree());

            // AST REWRITE
            // elements: listaDeTiposGenericos, listaDeInterfaces, modificadorDeAcessoFeminino, corpoDaClasse, IDENTIFICADOR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 121:107: -> ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaClasse )
            {
                // fontes/g/CanecaArvore.g:121:110: ^( CLASSE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaClasse )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CLASSE_, "CLASSE_")
                , root_1);

                adaptor.addChild(root_1, stream_modificadorDeAcessoFeminino.nextTree());

                adaptor.addChild(root_1, 
                stream_IDENTIFICADOR.nextNode()
                );

                adaptor.addChild(root_1, stream_listaDeTiposGenericos.nextTree());

                adaptor.addChild(root_1, stream_listaDeInterfaces.nextTree());

                adaptor.addChild(root_1, stream_corpoDaClasse.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classe"


    public static class interfaces_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaces"
    // fontes/g/CanecaArvore.g:124:1: interfaces : INTERFACE modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface -> ^( INTERFACE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface ) ;
    public final CanecaArvore.interfaces_return interfaces() throws RecognitionException {
        CanecaArvore.interfaces_return retval = new CanecaArvore.interfaces_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTERFACE24=null;
        CommonTree IDENTIFICADOR26=null;
        CanecaArvore.modificadorDeAcessoFeminino_return modificadorDeAcessoFeminino25 =null;

        CanecaArvore.listaDeTiposGenericos_return listaDeTiposGenericos27 =null;

        CanecaArvore.listaDeInterfaces_return listaDeInterfaces28 =null;

        CanecaArvore.corpoDaInterface_return corpoDaInterface29 =null;


        CommonTree INTERFACE24_tree=null;
        CommonTree IDENTIFICADOR26_tree=null;
        RewriteRuleNodeStream stream_INTERFACE=new RewriteRuleNodeStream(adaptor,"token INTERFACE");
        RewriteRuleNodeStream stream_IDENTIFICADOR=new RewriteRuleNodeStream(adaptor,"token IDENTIFICADOR");
        RewriteRuleSubtreeStream stream_corpoDaInterface=new RewriteRuleSubtreeStream(adaptor,"rule corpoDaInterface");
        RewriteRuleSubtreeStream stream_modificadorDeAcessoFeminino=new RewriteRuleSubtreeStream(adaptor,"rule modificadorDeAcessoFeminino");
        RewriteRuleSubtreeStream stream_listaDeTiposGenericos=new RewriteRuleSubtreeStream(adaptor,"rule listaDeTiposGenericos");
        RewriteRuleSubtreeStream stream_listaDeInterfaces=new RewriteRuleSubtreeStream(adaptor,"rule listaDeInterfaces");
        try {
            // fontes/g/CanecaArvore.g:125:2: ( INTERFACE modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface -> ^( INTERFACE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface ) )
            // fontes/g/CanecaArvore.g:125:4: INTERFACE modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface
            {
            _last = (CommonTree)input.LT(1);
            INTERFACE24=(CommonTree)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaces519);  
            stream_INTERFACE.add(INTERFACE24);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_modificadorDeAcessoFeminino_in_interfaces521);
            modificadorDeAcessoFeminino25=modificadorDeAcessoFeminino();

            state._fsp--;

            stream_modificadorDeAcessoFeminino.add(modificadorDeAcessoFeminino25.getTree());

            _last = (CommonTree)input.LT(1);
            IDENTIFICADOR26=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_interfaces523);  
            stream_IDENTIFICADOR.add(IDENTIFICADOR26);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_listaDeTiposGenericos_in_interfaces525);
            listaDeTiposGenericos27=listaDeTiposGenericos();

            state._fsp--;

            stream_listaDeTiposGenericos.add(listaDeTiposGenericos27.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_listaDeInterfaces_in_interfaces527);
            listaDeInterfaces28=listaDeInterfaces();

            state._fsp--;

            stream_listaDeInterfaces.add(listaDeInterfaces28.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_corpoDaInterface_in_interfaces529);
            corpoDaInterface29=corpoDaInterface();

            state._fsp--;

            stream_corpoDaInterface.add(corpoDaInterface29.getTree());

            // AST REWRITE
            // elements: listaDeInterfaces, listaDeTiposGenericos, corpoDaInterface, modificadorDeAcessoFeminino, IDENTIFICADOR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 125:113: -> ^( INTERFACE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface )
            {
                // fontes/g/CanecaArvore.g:125:116: ^( INTERFACE_ modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(INTERFACE_, "INTERFACE_")
                , root_1);

                adaptor.addChild(root_1, stream_modificadorDeAcessoFeminino.nextTree());

                adaptor.addChild(root_1, 
                stream_IDENTIFICADOR.nextNode()
                );

                adaptor.addChild(root_1, stream_listaDeTiposGenericos.nextTree());

                adaptor.addChild(root_1, stream_listaDeInterfaces.nextTree());

                adaptor.addChild(root_1, stream_corpoDaInterface.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "interfaces"


    public static class corpoDaClasse_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "corpoDaClasse"
    // fontes/g/CanecaArvore.g:128:1: corpoDaClasse : INICIO atributos construtores destrutor metodos FIM -> ^( CORPO_ atributos construtores destrutor metodos ) ;
    public final CanecaArvore.corpoDaClasse_return corpoDaClasse() throws RecognitionException {
        CanecaArvore.corpoDaClasse_return retval = new CanecaArvore.corpoDaClasse_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INICIO30=null;
        CommonTree FIM35=null;
        CanecaArvore.atributos_return atributos31 =null;

        CanecaArvore.construtores_return construtores32 =null;

        CanecaArvore.destrutor_return destrutor33 =null;

        CanecaArvore.metodos_return metodos34 =null;


        CommonTree INICIO30_tree=null;
        CommonTree FIM35_tree=null;
        RewriteRuleNodeStream stream_INICIO=new RewriteRuleNodeStream(adaptor,"token INICIO");
        RewriteRuleNodeStream stream_FIM=new RewriteRuleNodeStream(adaptor,"token FIM");
        RewriteRuleSubtreeStream stream_construtores=new RewriteRuleSubtreeStream(adaptor,"rule construtores");
        RewriteRuleSubtreeStream stream_atributos=new RewriteRuleSubtreeStream(adaptor,"rule atributos");
        RewriteRuleSubtreeStream stream_metodos=new RewriteRuleSubtreeStream(adaptor,"rule metodos");
        RewriteRuleSubtreeStream stream_destrutor=new RewriteRuleSubtreeStream(adaptor,"rule destrutor");
        try {
            // fontes/g/CanecaArvore.g:129:2: ( INICIO atributos construtores destrutor metodos FIM -> ^( CORPO_ atributos construtores destrutor metodos ) )
            // fontes/g/CanecaArvore.g:129:4: INICIO atributos construtores destrutor metodos FIM
            {
            _last = (CommonTree)input.LT(1);
            INICIO30=(CommonTree)match(input,INICIO,FOLLOW_INICIO_in_corpoDaClasse556);  
            stream_INICIO.add(INICIO30);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_atributos_in_corpoDaClasse558);
            atributos31=atributos();

            state._fsp--;

            stream_atributos.add(atributos31.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_construtores_in_corpoDaClasse560);
            construtores32=construtores();

            state._fsp--;

            stream_construtores.add(construtores32.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_destrutor_in_corpoDaClasse562);
            destrutor33=destrutor();

            state._fsp--;

            stream_destrutor.add(destrutor33.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_metodos_in_corpoDaClasse564);
            metodos34=metodos();

            state._fsp--;

            stream_metodos.add(metodos34.getTree());

            _last = (CommonTree)input.LT(1);
            FIM35=(CommonTree)match(input,FIM,FOLLOW_FIM_in_corpoDaClasse566);  
            stream_FIM.add(FIM35);


            // AST REWRITE
            // elements: construtores, metodos, destrutor, atributos
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 129:56: -> ^( CORPO_ atributos construtores destrutor metodos )
            {
                // fontes/g/CanecaArvore.g:129:59: ^( CORPO_ atributos construtores destrutor metodos )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CORPO_, "CORPO_")
                , root_1);

                adaptor.addChild(root_1, stream_atributos.nextTree());

                adaptor.addChild(root_1, stream_construtores.nextTree());

                adaptor.addChild(root_1, stream_destrutor.nextTree());

                adaptor.addChild(root_1, stream_metodos.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "corpoDaClasse"


    public static class corpoDaInterface_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "corpoDaInterface"
    // fontes/g/CanecaArvore.g:132:1: corpoDaInterface : INICIO atributos assinaturasDeMetodos FIM -> ^( CORPO_ atributos assinaturasDeMetodos ) ;
    public final CanecaArvore.corpoDaInterface_return corpoDaInterface() throws RecognitionException {
        CanecaArvore.corpoDaInterface_return retval = new CanecaArvore.corpoDaInterface_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INICIO36=null;
        CommonTree FIM39=null;
        CanecaArvore.atributos_return atributos37 =null;

        CanecaArvore.assinaturasDeMetodos_return assinaturasDeMetodos38 =null;


        CommonTree INICIO36_tree=null;
        CommonTree FIM39_tree=null;
        RewriteRuleNodeStream stream_INICIO=new RewriteRuleNodeStream(adaptor,"token INICIO");
        RewriteRuleNodeStream stream_FIM=new RewriteRuleNodeStream(adaptor,"token FIM");
        RewriteRuleSubtreeStream stream_atributos=new RewriteRuleSubtreeStream(adaptor,"rule atributos");
        RewriteRuleSubtreeStream stream_assinaturasDeMetodos=new RewriteRuleSubtreeStream(adaptor,"rule assinaturasDeMetodos");
        try {
            // fontes/g/CanecaArvore.g:133:2: ( INICIO atributos assinaturasDeMetodos FIM -> ^( CORPO_ atributos assinaturasDeMetodos ) )
            // fontes/g/CanecaArvore.g:133:4: INICIO atributos assinaturasDeMetodos FIM
            {
            _last = (CommonTree)input.LT(1);
            INICIO36=(CommonTree)match(input,INICIO,FOLLOW_INICIO_in_corpoDaInterface591);  
            stream_INICIO.add(INICIO36);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_atributos_in_corpoDaInterface593);
            atributos37=atributos();

            state._fsp--;

            stream_atributos.add(atributos37.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_assinaturasDeMetodos_in_corpoDaInterface595);
            assinaturasDeMetodos38=assinaturasDeMetodos();

            state._fsp--;

            stream_assinaturasDeMetodos.add(assinaturasDeMetodos38.getTree());

            _last = (CommonTree)input.LT(1);
            FIM39=(CommonTree)match(input,FIM,FOLLOW_FIM_in_corpoDaInterface597);  
            stream_FIM.add(FIM39);


            // AST REWRITE
            // elements: atributos, assinaturasDeMetodos
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 133:46: -> ^( CORPO_ atributos assinaturasDeMetodos )
            {
                // fontes/g/CanecaArvore.g:133:49: ^( CORPO_ atributos assinaturasDeMetodos )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CORPO_, "CORPO_")
                , root_1);

                adaptor.addChild(root_1, stream_atributos.nextTree());

                adaptor.addChild(root_1, stream_assinaturasDeMetodos.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "corpoDaInterface"


    public static class atributos_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atributos"
    // fontes/g/CanecaArvore.g:136:1: atributos : ( atributo )* -> ^( ATRIBUTOS_ ( atributo )* ) ;
    public final CanecaArvore.atributos_return atributos() throws RecognitionException {
        CanecaArvore.atributos_return retval = new CanecaArvore.atributos_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CanecaArvore.atributo_return atributo40 =null;


        RewriteRuleSubtreeStream stream_atributo=new RewriteRuleSubtreeStream(adaptor,"rule atributo");
        try {
            // fontes/g/CanecaArvore.g:137:2: ( ( atributo )* -> ^( ATRIBUTOS_ ( atributo )* ) )
            // fontes/g/CanecaArvore.g:137:4: ( atributo )*
            {
            // fontes/g/CanecaArvore.g:137:4: ( atributo )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==ATRIBUTO) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // fontes/g/CanecaArvore.g:137:5: atributo
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_atributo_in_atributos619);
            	    atributo40=atributo();

            	    state._fsp--;

            	    stream_atributo.add(atributo40.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // AST REWRITE
            // elements: atributo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 137:16: -> ^( ATRIBUTOS_ ( atributo )* )
            {
                // fontes/g/CanecaArvore.g:137:19: ^( ATRIBUTOS_ ( atributo )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ATRIBUTOS_, "ATRIBUTOS_")
                , root_1);

                // fontes/g/CanecaArvore.g:137:32: ( atributo )*
                while ( stream_atributo.hasNext() ) {
                    adaptor.addChild(root_1, stream_atributo.nextTree());

                }
                stream_atributo.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atributos"


    public static class construtores_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "construtores"
    // fontes/g/CanecaArvore.g:140:1: construtores : ( construtor )+ -> ^( CONSTRUTORES_ ( construtor )+ ) ;
    public final CanecaArvore.construtores_return construtores() throws RecognitionException {
        CanecaArvore.construtores_return retval = new CanecaArvore.construtores_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CanecaArvore.construtor_return construtor41 =null;


        RewriteRuleSubtreeStream stream_construtor=new RewriteRuleSubtreeStream(adaptor,"rule construtor");
        try {
            // fontes/g/CanecaArvore.g:141:2: ( ( construtor )+ -> ^( CONSTRUTORES_ ( construtor )+ ) )
            // fontes/g/CanecaArvore.g:141:4: ( construtor )+
            {
            // fontes/g/CanecaArvore.g:141:4: ( construtor )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==CONSTRUTOR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // fontes/g/CanecaArvore.g:141:5: construtor
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_construtor_in_construtores644);
            	    construtor41=construtor();

            	    state._fsp--;

            	    stream_construtor.add(construtor41.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            // AST REWRITE
            // elements: construtor
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 141:18: -> ^( CONSTRUTORES_ ( construtor )+ )
            {
                // fontes/g/CanecaArvore.g:141:21: ^( CONSTRUTORES_ ( construtor )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CONSTRUTORES_, "CONSTRUTORES_")
                , root_1);

                if ( !(stream_construtor.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_construtor.hasNext() ) {
                    adaptor.addChild(root_1, stream_construtor.nextTree());

                }
                stream_construtor.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "construtores"


    public static class metodos_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "metodos"
    // fontes/g/CanecaArvore.g:144:1: metodos : ( metodo )* -> ^( METODOS_ ( metodo )* ) ;
    public final CanecaArvore.metodos_return metodos() throws RecognitionException {
        CanecaArvore.metodos_return retval = new CanecaArvore.metodos_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CanecaArvore.metodo_return metodo42 =null;


        RewriteRuleSubtreeStream stream_metodo=new RewriteRuleSubtreeStream(adaptor,"rule metodo");
        try {
            // fontes/g/CanecaArvore.g:145:2: ( ( metodo )* -> ^( METODOS_ ( metodo )* ) )
            // fontes/g/CanecaArvore.g:145:4: ( metodo )*
            {
            // fontes/g/CanecaArvore.g:145:4: ( metodo )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==METODO) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // fontes/g/CanecaArvore.g:145:5: metodo
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_metodo_in_metodos669);
            	    metodo42=metodo();

            	    state._fsp--;

            	    stream_metodo.add(metodo42.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // AST REWRITE
            // elements: metodo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 145:14: -> ^( METODOS_ ( metodo )* )
            {
                // fontes/g/CanecaArvore.g:145:17: ^( METODOS_ ( metodo )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(METODOS_, "METODOS_")
                , root_1);

                // fontes/g/CanecaArvore.g:145:28: ( metodo )*
                while ( stream_metodo.hasNext() ) {
                    adaptor.addChild(root_1, stream_metodo.nextTree());

                }
                stream_metodo.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "metodos"


    public static class assinaturasDeMetodos_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assinaturasDeMetodos"
    // fontes/g/CanecaArvore.g:148:1: assinaturasDeMetodos : ( assinaturaDeMetodo TERMINADOR )* -> ^( ASSINATURAS_DE_METODOS_ ( assinaturaDeMetodo )* ) ;
    public final CanecaArvore.assinaturasDeMetodos_return assinaturasDeMetodos() throws RecognitionException {
        CanecaArvore.assinaturasDeMetodos_return retval = new CanecaArvore.assinaturasDeMetodos_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TERMINADOR44=null;
        CanecaArvore.assinaturaDeMetodo_return assinaturaDeMetodo43 =null;


        CommonTree TERMINADOR44_tree=null;
        RewriteRuleNodeStream stream_TERMINADOR=new RewriteRuleNodeStream(adaptor,"token TERMINADOR");
        RewriteRuleSubtreeStream stream_assinaturaDeMetodo=new RewriteRuleSubtreeStream(adaptor,"rule assinaturaDeMetodo");
        try {
            // fontes/g/CanecaArvore.g:149:2: ( ( assinaturaDeMetodo TERMINADOR )* -> ^( ASSINATURAS_DE_METODOS_ ( assinaturaDeMetodo )* ) )
            // fontes/g/CanecaArvore.g:149:4: ( assinaturaDeMetodo TERMINADOR )*
            {
            // fontes/g/CanecaArvore.g:149:4: ( assinaturaDeMetodo TERMINADOR )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==METODO) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // fontes/g/CanecaArvore.g:149:5: assinaturaDeMetodo TERMINADOR
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_assinaturaDeMetodo_in_assinaturasDeMetodos694);
            	    assinaturaDeMetodo43=assinaturaDeMetodo();

            	    state._fsp--;

            	    stream_assinaturaDeMetodo.add(assinaturaDeMetodo43.getTree());

            	    _last = (CommonTree)input.LT(1);
            	    TERMINADOR44=(CommonTree)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_assinaturasDeMetodos696);  
            	    stream_TERMINADOR.add(TERMINADOR44);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // AST REWRITE
            // elements: assinaturaDeMetodo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 149:37: -> ^( ASSINATURAS_DE_METODOS_ ( assinaturaDeMetodo )* )
            {
                // fontes/g/CanecaArvore.g:149:40: ^( ASSINATURAS_DE_METODOS_ ( assinaturaDeMetodo )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ASSINATURAS_DE_METODOS_, "ASSINATURAS_DE_METODOS_")
                , root_1);

                // fontes/g/CanecaArvore.g:149:66: ( assinaturaDeMetodo )*
                while ( stream_assinaturaDeMetodo.hasNext() ) {
                    adaptor.addChild(root_1, stream_assinaturaDeMetodo.nextTree());

                }
                stream_assinaturaDeMetodo.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assinaturasDeMetodos"


    public static class atributo_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atributo"
    // fontes/g/CanecaArvore.g:152:1: atributo : ATRIBUTO modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR ( atribuicao )? TERMINADOR -> ^( ATRIBUTO_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR ( atribuicao )? ) ;
    public final CanecaArvore.atributo_return atributo() throws RecognitionException {
        CanecaArvore.atributo_return retval = new CanecaArvore.atributo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ATRIBUTO45=null;
        CommonTree ESTATICO47=null;
        CommonTree IDENTIFICADOR49=null;
        CommonTree TERMINADOR51=null;
        CanecaArvore.modificadorDeAcessoMasculino_return modificadorDeAcessoMasculino46 =null;

        CanecaArvore.tipo_return tipo48 =null;

        CanecaArvore.atribuicao_return atribuicao50 =null;


        CommonTree ATRIBUTO45_tree=null;
        CommonTree ESTATICO47_tree=null;
        CommonTree IDENTIFICADOR49_tree=null;
        CommonTree TERMINADOR51_tree=null;
        RewriteRuleNodeStream stream_ATRIBUTO=new RewriteRuleNodeStream(adaptor,"token ATRIBUTO");
        RewriteRuleNodeStream stream_TERMINADOR=new RewriteRuleNodeStream(adaptor,"token TERMINADOR");
        RewriteRuleNodeStream stream_ESTATICO=new RewriteRuleNodeStream(adaptor,"token ESTATICO");
        RewriteRuleNodeStream stream_IDENTIFICADOR=new RewriteRuleNodeStream(adaptor,"token IDENTIFICADOR");
        RewriteRuleSubtreeStream stream_modificadorDeAcessoMasculino=new RewriteRuleSubtreeStream(adaptor,"rule modificadorDeAcessoMasculino");
        RewriteRuleSubtreeStream stream_atribuicao=new RewriteRuleSubtreeStream(adaptor,"rule atribuicao");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        try {
            // fontes/g/CanecaArvore.g:153:2: ( ATRIBUTO modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR ( atribuicao )? TERMINADOR -> ^( ATRIBUTO_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR ( atribuicao )? ) )
            // fontes/g/CanecaArvore.g:153:4: ATRIBUTO modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR ( atribuicao )? TERMINADOR
            {
            _last = (CommonTree)input.LT(1);
            ATRIBUTO45=(CommonTree)match(input,ATRIBUTO,FOLLOW_ATRIBUTO_in_atributo720);  
            stream_ATRIBUTO.add(ATRIBUTO45);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_atributo722);
            modificadorDeAcessoMasculino46=modificadorDeAcessoMasculino();

            state._fsp--;

            stream_modificadorDeAcessoMasculino.add(modificadorDeAcessoMasculino46.getTree());

            // fontes/g/CanecaArvore.g:153:42: ( ESTATICO )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ESTATICO) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // fontes/g/CanecaArvore.g:153:43: ESTATICO
                    {
                    _last = (CommonTree)input.LT(1);
                    ESTATICO47=(CommonTree)match(input,ESTATICO,FOLLOW_ESTATICO_in_atributo725);  
                    stream_ESTATICO.add(ESTATICO47);


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_tipo_in_atributo729);
            tipo48=tipo();

            state._fsp--;

            stream_tipo.add(tipo48.getTree());

            _last = (CommonTree)input.LT(1);
            IDENTIFICADOR49=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_atributo731);  
            stream_IDENTIFICADOR.add(IDENTIFICADOR49);


            // fontes/g/CanecaArvore.g:153:73: ( atribuicao )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ATRIBUIDOR) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // fontes/g/CanecaArvore.g:153:74: atribuicao
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_atribuicao_in_atributo734);
                    atribuicao50=atribuicao();

                    state._fsp--;

                    stream_atribuicao.add(atribuicao50.getTree());

                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            TERMINADOR51=(CommonTree)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_atributo738);  
            stream_TERMINADOR.add(TERMINADOR51);


            // AST REWRITE
            // elements: modificadorDeAcessoMasculino, IDENTIFICADOR, tipo, atribuicao, ESTATICO
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 153:98: -> ^( ATRIBUTO_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR ( atribuicao )? )
            {
                // fontes/g/CanecaArvore.g:153:101: ^( ATRIBUTO_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR ( atribuicao )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ATRIBUTO_, "ATRIBUTO_")
                , root_1);

                adaptor.addChild(root_1, stream_modificadorDeAcessoMasculino.nextTree());

                // fontes/g/CanecaArvore.g:153:142: ( ESTATICO )?
                if ( stream_ESTATICO.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ESTATICO.nextNode()
                    );

                }
                stream_ESTATICO.reset();

                adaptor.addChild(root_1, stream_tipo.nextTree());

                adaptor.addChild(root_1, 
                stream_IDENTIFICADOR.nextNode()
                );

                // fontes/g/CanecaArvore.g:153:173: ( atribuicao )?
                if ( stream_atribuicao.hasNext() ) {
                    adaptor.addChild(root_1, stream_atribuicao.nextTree());

                }
                stream_atribuicao.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atributo"


    public static class construtor_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "construtor"
    // fontes/g/CanecaArvore.g:156:1: construtor : assinaturaDeConstrutor blocoDeInstrucoes -> ^( CONSTRUTOR_ assinaturaDeConstrutor blocoDeInstrucoes ) ;
    public final CanecaArvore.construtor_return construtor() throws RecognitionException {
        CanecaArvore.construtor_return retval = new CanecaArvore.construtor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CanecaArvore.assinaturaDeConstrutor_return assinaturaDeConstrutor52 =null;

        CanecaArvore.blocoDeInstrucoes_return blocoDeInstrucoes53 =null;


        RewriteRuleSubtreeStream stream_assinaturaDeConstrutor=new RewriteRuleSubtreeStream(adaptor,"rule assinaturaDeConstrutor");
        RewriteRuleSubtreeStream stream_blocoDeInstrucoes=new RewriteRuleSubtreeStream(adaptor,"rule blocoDeInstrucoes");
        try {
            // fontes/g/CanecaArvore.g:157:2: ( assinaturaDeConstrutor blocoDeInstrucoes -> ^( CONSTRUTOR_ assinaturaDeConstrutor blocoDeInstrucoes ) )
            // fontes/g/CanecaArvore.g:157:4: assinaturaDeConstrutor blocoDeInstrucoes
            {
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_assinaturaDeConstrutor_in_construtor771);
            assinaturaDeConstrutor52=assinaturaDeConstrutor();

            state._fsp--;

            stream_assinaturaDeConstrutor.add(assinaturaDeConstrutor52.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_blocoDeInstrucoes_in_construtor773);
            blocoDeInstrucoes53=blocoDeInstrucoes();

            state._fsp--;

            stream_blocoDeInstrucoes.add(blocoDeInstrucoes53.getTree());

            // AST REWRITE
            // elements: assinaturaDeConstrutor, blocoDeInstrucoes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 157:45: -> ^( CONSTRUTOR_ assinaturaDeConstrutor blocoDeInstrucoes )
            {
                // fontes/g/CanecaArvore.g:157:48: ^( CONSTRUTOR_ assinaturaDeConstrutor blocoDeInstrucoes )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CONSTRUTOR_, "CONSTRUTOR_")
                , root_1);

                adaptor.addChild(root_1, stream_assinaturaDeConstrutor.nextTree());

                adaptor.addChild(root_1, stream_blocoDeInstrucoes.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "construtor"


    public static class destrutor_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "destrutor"
    // fontes/g/CanecaArvore.g:160:1: destrutor : assinaturaDeDestrutor blocoDeInstrucoes -> ^( DESTRUTOR_ assinaturaDeDestrutor blocoDeInstrucoes ) ;
    public final CanecaArvore.destrutor_return destrutor() throws RecognitionException {
        CanecaArvore.destrutor_return retval = new CanecaArvore.destrutor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CanecaArvore.assinaturaDeDestrutor_return assinaturaDeDestrutor54 =null;

        CanecaArvore.blocoDeInstrucoes_return blocoDeInstrucoes55 =null;


        RewriteRuleSubtreeStream stream_assinaturaDeDestrutor=new RewriteRuleSubtreeStream(adaptor,"rule assinaturaDeDestrutor");
        RewriteRuleSubtreeStream stream_blocoDeInstrucoes=new RewriteRuleSubtreeStream(adaptor,"rule blocoDeInstrucoes");
        try {
            // fontes/g/CanecaArvore.g:161:2: ( assinaturaDeDestrutor blocoDeInstrucoes -> ^( DESTRUTOR_ assinaturaDeDestrutor blocoDeInstrucoes ) )
            // fontes/g/CanecaArvore.g:161:4: assinaturaDeDestrutor blocoDeInstrucoes
            {
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_assinaturaDeDestrutor_in_destrutor794);
            assinaturaDeDestrutor54=assinaturaDeDestrutor();

            state._fsp--;

            stream_assinaturaDeDestrutor.add(assinaturaDeDestrutor54.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_blocoDeInstrucoes_in_destrutor796);
            blocoDeInstrucoes55=blocoDeInstrucoes();

            state._fsp--;

            stream_blocoDeInstrucoes.add(blocoDeInstrucoes55.getTree());

            // AST REWRITE
            // elements: assinaturaDeDestrutor, blocoDeInstrucoes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 161:44: -> ^( DESTRUTOR_ assinaturaDeDestrutor blocoDeInstrucoes )
            {
                // fontes/g/CanecaArvore.g:161:47: ^( DESTRUTOR_ assinaturaDeDestrutor blocoDeInstrucoes )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DESTRUTOR_, "DESTRUTOR_")
                , root_1);

                adaptor.addChild(root_1, stream_assinaturaDeDestrutor.nextTree());

                adaptor.addChild(root_1, stream_blocoDeInstrucoes.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "destrutor"


    public static class metodo_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "metodo"
    // fontes/g/CanecaArvore.g:164:1: metodo : assinaturaDeMetodo blocoDeInstrucoes -> ^( METODO_ assinaturaDeMetodo blocoDeInstrucoes ) ;
    public final CanecaArvore.metodo_return metodo() throws RecognitionException {
        CanecaArvore.metodo_return retval = new CanecaArvore.metodo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CanecaArvore.assinaturaDeMetodo_return assinaturaDeMetodo56 =null;

        CanecaArvore.blocoDeInstrucoes_return blocoDeInstrucoes57 =null;


        RewriteRuleSubtreeStream stream_assinaturaDeMetodo=new RewriteRuleSubtreeStream(adaptor,"rule assinaturaDeMetodo");
        RewriteRuleSubtreeStream stream_blocoDeInstrucoes=new RewriteRuleSubtreeStream(adaptor,"rule blocoDeInstrucoes");
        try {
            // fontes/g/CanecaArvore.g:165:2: ( assinaturaDeMetodo blocoDeInstrucoes -> ^( METODO_ assinaturaDeMetodo blocoDeInstrucoes ) )
            // fontes/g/CanecaArvore.g:165:4: assinaturaDeMetodo blocoDeInstrucoes
            {
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_assinaturaDeMetodo_in_metodo817);
            assinaturaDeMetodo56=assinaturaDeMetodo();

            state._fsp--;

            stream_assinaturaDeMetodo.add(assinaturaDeMetodo56.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_blocoDeInstrucoes_in_metodo819);
            blocoDeInstrucoes57=blocoDeInstrucoes();

            state._fsp--;

            stream_blocoDeInstrucoes.add(blocoDeInstrucoes57.getTree());

            // AST REWRITE
            // elements: assinaturaDeMetodo, blocoDeInstrucoes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 165:41: -> ^( METODO_ assinaturaDeMetodo blocoDeInstrucoes )
            {
                // fontes/g/CanecaArvore.g:165:44: ^( METODO_ assinaturaDeMetodo blocoDeInstrucoes )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(METODO_, "METODO_")
                , root_1);

                adaptor.addChild(root_1, stream_assinaturaDeMetodo.nextTree());

                adaptor.addChild(root_1, stream_blocoDeInstrucoes.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "metodo"


    public static class assinaturaDeConstrutor_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assinaturaDeConstrutor"
    // fontes/g/CanecaArvore.g:168:1: assinaturaDeConstrutor : CONSTRUTOR modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos -> ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos ) ;
    public final CanecaArvore.assinaturaDeConstrutor_return assinaturaDeConstrutor() throws RecognitionException {
        CanecaArvore.assinaturaDeConstrutor_return retval = new CanecaArvore.assinaturaDeConstrutor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CONSTRUTOR58=null;
        CommonTree IDENTIFICADOR60=null;
        CanecaArvore.modificadorDeAcessoMasculino_return modificadorDeAcessoMasculino59 =null;

        CanecaArvore.listaDeArgumentos_return listaDeArgumentos61 =null;


        CommonTree CONSTRUTOR58_tree=null;
        CommonTree IDENTIFICADOR60_tree=null;
        RewriteRuleNodeStream stream_CONSTRUTOR=new RewriteRuleNodeStream(adaptor,"token CONSTRUTOR");
        RewriteRuleNodeStream stream_IDENTIFICADOR=new RewriteRuleNodeStream(adaptor,"token IDENTIFICADOR");
        RewriteRuleSubtreeStream stream_modificadorDeAcessoMasculino=new RewriteRuleSubtreeStream(adaptor,"rule modificadorDeAcessoMasculino");
        RewriteRuleSubtreeStream stream_listaDeArgumentos=new RewriteRuleSubtreeStream(adaptor,"rule listaDeArgumentos");
        try {
            // fontes/g/CanecaArvore.g:169:2: ( CONSTRUTOR modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos -> ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos ) )
            // fontes/g/CanecaArvore.g:169:4: CONSTRUTOR modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos
            {
            _last = (CommonTree)input.LT(1);
            CONSTRUTOR58=(CommonTree)match(input,CONSTRUTOR,FOLLOW_CONSTRUTOR_in_assinaturaDeConstrutor840);  
            stream_CONSTRUTOR.add(CONSTRUTOR58);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_assinaturaDeConstrutor842);
            modificadorDeAcessoMasculino59=modificadorDeAcessoMasculino();

            state._fsp--;

            stream_modificadorDeAcessoMasculino.add(modificadorDeAcessoMasculino59.getTree());

            _last = (CommonTree)input.LT(1);
            IDENTIFICADOR60=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_assinaturaDeConstrutor844);  
            stream_IDENTIFICADOR.add(IDENTIFICADOR60);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_listaDeArgumentos_in_assinaturaDeConstrutor846);
            listaDeArgumentos61=listaDeArgumentos();

            state._fsp--;

            stream_listaDeArgumentos.add(listaDeArgumentos61.getTree());

            // AST REWRITE
            // elements: listaDeArgumentos, IDENTIFICADOR, modificadorDeAcessoMasculino
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 169:76: -> ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos )
            {
                // fontes/g/CanecaArvore.g:169:79: ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ASSINATURA_, "ASSINATURA_")
                , root_1);

                adaptor.addChild(root_1, stream_modificadorDeAcessoMasculino.nextTree());

                adaptor.addChild(root_1, 
                stream_IDENTIFICADOR.nextNode()
                );

                adaptor.addChild(root_1, stream_listaDeArgumentos.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assinaturaDeConstrutor"


    public static class assinaturaDeDestrutor_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assinaturaDeDestrutor"
    // fontes/g/CanecaArvore.g:172:1: assinaturaDeDestrutor : DESTRUTOR modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos -> ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos ) ;
    public final CanecaArvore.assinaturaDeDestrutor_return assinaturaDeDestrutor() throws RecognitionException {
        CanecaArvore.assinaturaDeDestrutor_return retval = new CanecaArvore.assinaturaDeDestrutor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DESTRUTOR62=null;
        CommonTree IDENTIFICADOR64=null;
        CanecaArvore.modificadorDeAcessoMasculino_return modificadorDeAcessoMasculino63 =null;

        CanecaArvore.listaDeArgumentos_return listaDeArgumentos65 =null;


        CommonTree DESTRUTOR62_tree=null;
        CommonTree IDENTIFICADOR64_tree=null;
        RewriteRuleNodeStream stream_DESTRUTOR=new RewriteRuleNodeStream(adaptor,"token DESTRUTOR");
        RewriteRuleNodeStream stream_IDENTIFICADOR=new RewriteRuleNodeStream(adaptor,"token IDENTIFICADOR");
        RewriteRuleSubtreeStream stream_modificadorDeAcessoMasculino=new RewriteRuleSubtreeStream(adaptor,"rule modificadorDeAcessoMasculino");
        RewriteRuleSubtreeStream stream_listaDeArgumentos=new RewriteRuleSubtreeStream(adaptor,"rule listaDeArgumentos");
        try {
            // fontes/g/CanecaArvore.g:173:2: ( DESTRUTOR modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos -> ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos ) )
            // fontes/g/CanecaArvore.g:173:4: DESTRUTOR modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos
            {
            _last = (CommonTree)input.LT(1);
            DESTRUTOR62=(CommonTree)match(input,DESTRUTOR,FOLLOW_DESTRUTOR_in_assinaturaDeDestrutor869);  
            stream_DESTRUTOR.add(DESTRUTOR62);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_assinaturaDeDestrutor871);
            modificadorDeAcessoMasculino63=modificadorDeAcessoMasculino();

            state._fsp--;

            stream_modificadorDeAcessoMasculino.add(modificadorDeAcessoMasculino63.getTree());

            _last = (CommonTree)input.LT(1);
            IDENTIFICADOR64=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_assinaturaDeDestrutor873);  
            stream_IDENTIFICADOR.add(IDENTIFICADOR64);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_listaDeArgumentos_in_assinaturaDeDestrutor875);
            listaDeArgumentos65=listaDeArgumentos();

            state._fsp--;

            stream_listaDeArgumentos.add(listaDeArgumentos65.getTree());

            // AST REWRITE
            // elements: IDENTIFICADOR, modificadorDeAcessoMasculino, listaDeArgumentos
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 173:75: -> ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos )
            {
                // fontes/g/CanecaArvore.g:173:78: ^( ASSINATURA_ modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ASSINATURA_, "ASSINATURA_")
                , root_1);

                adaptor.addChild(root_1, stream_modificadorDeAcessoMasculino.nextTree());

                adaptor.addChild(root_1, 
                stream_IDENTIFICADOR.nextNode()
                );

                adaptor.addChild(root_1, stream_listaDeArgumentos.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assinaturaDeDestrutor"


    public static class assinaturaDeMetodo_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assinaturaDeMetodo"
    // fontes/g/CanecaArvore.g:176:1: assinaturaDeMetodo : METODO modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR listaDeArgumentos -> ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR listaDeArgumentos ) ;
    public final CanecaArvore.assinaturaDeMetodo_return assinaturaDeMetodo() throws RecognitionException {
        CanecaArvore.assinaturaDeMetodo_return retval = new CanecaArvore.assinaturaDeMetodo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree METODO66=null;
        CommonTree ESTATICO68=null;
        CommonTree IDENTIFICADOR70=null;
        CanecaArvore.modificadorDeAcessoMasculino_return modificadorDeAcessoMasculino67 =null;

        CanecaArvore.tipo_return tipo69 =null;

        CanecaArvore.listaDeArgumentos_return listaDeArgumentos71 =null;


        CommonTree METODO66_tree=null;
        CommonTree ESTATICO68_tree=null;
        CommonTree IDENTIFICADOR70_tree=null;
        RewriteRuleNodeStream stream_METODO=new RewriteRuleNodeStream(adaptor,"token METODO");
        RewriteRuleNodeStream stream_ESTATICO=new RewriteRuleNodeStream(adaptor,"token ESTATICO");
        RewriteRuleNodeStream stream_IDENTIFICADOR=new RewriteRuleNodeStream(adaptor,"token IDENTIFICADOR");
        RewriteRuleSubtreeStream stream_modificadorDeAcessoMasculino=new RewriteRuleSubtreeStream(adaptor,"rule modificadorDeAcessoMasculino");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        RewriteRuleSubtreeStream stream_listaDeArgumentos=new RewriteRuleSubtreeStream(adaptor,"rule listaDeArgumentos");
        try {
            // fontes/g/CanecaArvore.g:177:2: ( METODO modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR listaDeArgumentos -> ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR listaDeArgumentos ) )
            // fontes/g/CanecaArvore.g:177:4: METODO modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR listaDeArgumentos
            {
            _last = (CommonTree)input.LT(1);
            METODO66=(CommonTree)match(input,METODO,FOLLOW_METODO_in_assinaturaDeMetodo898);  
            stream_METODO.add(METODO66);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_assinaturaDeMetodo900);
            modificadorDeAcessoMasculino67=modificadorDeAcessoMasculino();

            state._fsp--;

            stream_modificadorDeAcessoMasculino.add(modificadorDeAcessoMasculino67.getTree());

            // fontes/g/CanecaArvore.g:177:40: ( ESTATICO )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ESTATICO) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // fontes/g/CanecaArvore.g:177:41: ESTATICO
                    {
                    _last = (CommonTree)input.LT(1);
                    ESTATICO68=(CommonTree)match(input,ESTATICO,FOLLOW_ESTATICO_in_assinaturaDeMetodo903);  
                    stream_ESTATICO.add(ESTATICO68);


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_tipo_in_assinaturaDeMetodo907);
            tipo69=tipo();

            state._fsp--;

            stream_tipo.add(tipo69.getTree());

            _last = (CommonTree)input.LT(1);
            IDENTIFICADOR70=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_assinaturaDeMetodo909);  
            stream_IDENTIFICADOR.add(IDENTIFICADOR70);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_listaDeArgumentos_in_assinaturaDeMetodo911);
            listaDeArgumentos71=listaDeArgumentos();

            state._fsp--;

            stream_listaDeArgumentos.add(listaDeArgumentos71.getTree());

            // AST REWRITE
            // elements: tipo, modificadorDeAcessoMasculino, listaDeArgumentos, IDENTIFICADOR, ESTATICO
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 177:89: -> ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR listaDeArgumentos )
            {
                // fontes/g/CanecaArvore.g:177:92: ^( ASSINATURA_ modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR listaDeArgumentos )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ASSINATURA_, "ASSINATURA_")
                , root_1);

                adaptor.addChild(root_1, stream_modificadorDeAcessoMasculino.nextTree());

                // fontes/g/CanecaArvore.g:177:135: ( ESTATICO )?
                if ( stream_ESTATICO.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ESTATICO.nextNode()
                    );

                }
                stream_ESTATICO.reset();

                adaptor.addChild(root_1, stream_tipo.nextTree());

                adaptor.addChild(root_1, 
                stream_IDENTIFICADOR.nextNode()
                );

                adaptor.addChild(root_1, stream_listaDeArgumentos.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assinaturaDeMetodo"


    public static class modificadorDeAcessoMasculino_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "modificadorDeAcessoMasculino"
    // fontes/g/CanecaArvore.g:180:1: modificadorDeAcessoMasculino : ( PUBLICO | PRIVADO | PROTEGIDO );
    public final CanecaArvore.modificadorDeAcessoMasculino_return modificadorDeAcessoMasculino() throws RecognitionException {
        CanecaArvore.modificadorDeAcessoMasculino_return retval = new CanecaArvore.modificadorDeAcessoMasculino_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set72=null;

        CommonTree set72_tree=null;

        try {
            // fontes/g/CanecaArvore.g:181:2: ( PUBLICO | PRIVADO | PROTEGIDO )
            // fontes/g/CanecaArvore.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set72=(CommonTree)input.LT(1);

            if ( input.LA(1)==PRIVADO||input.LA(1)==PROTEGIDO||input.LA(1)==PUBLICO ) {
                input.consume();
                set72_tree = (CommonTree)adaptor.dupNode(set72);


                adaptor.addChild(root_0, set72_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "modificadorDeAcessoMasculino"


    public static class modificadorDeAcessoFeminino_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "modificadorDeAcessoFeminino"
    // fontes/g/CanecaArvore.g:186:1: modificadorDeAcessoFeminino : ( PUBLICA | PRIVADA | PROTEGIDA );
    public final CanecaArvore.modificadorDeAcessoFeminino_return modificadorDeAcessoFeminino() throws RecognitionException {
        CanecaArvore.modificadorDeAcessoFeminino_return retval = new CanecaArvore.modificadorDeAcessoFeminino_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set73=null;

        CommonTree set73_tree=null;

        try {
            // fontes/g/CanecaArvore.g:187:2: ( PUBLICA | PRIVADA | PROTEGIDA )
            // fontes/g/CanecaArvore.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set73=(CommonTree)input.LT(1);

            if ( input.LA(1)==PRIVADA||input.LA(1)==PROTEGIDA||input.LA(1)==PUBLICA ) {
                input.consume();
                set73_tree = (CommonTree)adaptor.dupNode(set73);


                adaptor.addChild(root_0, set73_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "modificadorDeAcessoFeminino"


    public static class listaDeParametros_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listaDeParametros"
    // fontes/g/CanecaArvore.g:192:1: listaDeParametros : PARENTESE_ESQUERDO ( expressao ( SEPARADOR expressao )* )? PARENTESE_DIREITO -> ^( PARAMETROS_ ( expressao )* ) ;
    public final CanecaArvore.listaDeParametros_return listaDeParametros() throws RecognitionException {
        CanecaArvore.listaDeParametros_return retval = new CanecaArvore.listaDeParametros_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PARENTESE_ESQUERDO74=null;
        CommonTree SEPARADOR76=null;
        CommonTree PARENTESE_DIREITO78=null;
        CanecaArvore.expressao_return expressao75 =null;

        CanecaArvore.expressao_return expressao77 =null;


        CommonTree PARENTESE_ESQUERDO74_tree=null;
        CommonTree SEPARADOR76_tree=null;
        CommonTree PARENTESE_DIREITO78_tree=null;
        RewriteRuleNodeStream stream_PARENTESE_ESQUERDO=new RewriteRuleNodeStream(adaptor,"token PARENTESE_ESQUERDO");
        RewriteRuleNodeStream stream_PARENTESE_DIREITO=new RewriteRuleNodeStream(adaptor,"token PARENTESE_DIREITO");
        RewriteRuleNodeStream stream_SEPARADOR=new RewriteRuleNodeStream(adaptor,"token SEPARADOR");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // fontes/g/CanecaArvore.g:193:2: ( PARENTESE_ESQUERDO ( expressao ( SEPARADOR expressao )* )? PARENTESE_DIREITO -> ^( PARAMETROS_ ( expressao )* ) )
            // fontes/g/CanecaArvore.g:193:4: PARENTESE_ESQUERDO ( expressao ( SEPARADOR expressao )* )? PARENTESE_DIREITO
            {
            _last = (CommonTree)input.LT(1);
            PARENTESE_ESQUERDO74=(CommonTree)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_listaDeParametros983);  
            stream_PARENTESE_ESQUERDO.add(PARENTESE_ESQUERDO74);


            // fontes/g/CanecaArvore.g:193:23: ( expressao ( SEPARADOR expressao )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0 >= CONSTANTE_INTEIRA && LA14_0 <= CONSTANTE_REAL)||(LA14_0 >= ESSA && LA14_0 <= ESSE)||LA14_0==IDENTIFICADOR||(LA14_0 >= LITERAL_CARACTERE && LA14_0 <= LITERAL_TEXTO)||(LA14_0 >= NEGACAO && LA14_0 <= NOVO)||LA14_0==PARENTESE_ESQUERDO||LA14_0==SUBTRACAO||(LA14_0 >= VALOR_BOOLEANO && LA14_0 <= VALOR_NULO)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // fontes/g/CanecaArvore.g:193:24: expressao ( SEPARADOR expressao )*
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expressao_in_listaDeParametros986);
                    expressao75=expressao();

                    state._fsp--;

                    stream_expressao.add(expressao75.getTree());

                    // fontes/g/CanecaArvore.g:193:34: ( SEPARADOR expressao )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==SEPARADOR) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // fontes/g/CanecaArvore.g:193:35: SEPARADOR expressao
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    SEPARADOR76=(CommonTree)match(input,SEPARADOR,FOLLOW_SEPARADOR_in_listaDeParametros989);  
                    	    stream_SEPARADOR.add(SEPARADOR76);


                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_expressao_in_listaDeParametros991);
                    	    expressao77=expressao();

                    	    state._fsp--;

                    	    stream_expressao.add(expressao77.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            PARENTESE_DIREITO78=(CommonTree)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_listaDeParametros997);  
            stream_PARENTESE_DIREITO.add(PARENTESE_DIREITO78);


            // AST REWRITE
            // elements: expressao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 193:77: -> ^( PARAMETROS_ ( expressao )* )
            {
                // fontes/g/CanecaArvore.g:193:80: ^( PARAMETROS_ ( expressao )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PARAMETROS_, "PARAMETROS_")
                , root_1);

                // fontes/g/CanecaArvore.g:193:94: ( expressao )*
                while ( stream_expressao.hasNext() ) {
                    adaptor.addChild(root_1, stream_expressao.nextTree());

                }
                stream_expressao.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listaDeParametros"


    public static class listaDeArgumentos_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listaDeArgumentos"
    // fontes/g/CanecaArvore.g:196:1: listaDeArgumentos : PARENTESE_ESQUERDO ( declaracao ( SEPARADOR declaracao )* )? PARENTESE_DIREITO -> ^( ARGUMENTOS_ ( declaracao )* ) ;
    public final CanecaArvore.listaDeArgumentos_return listaDeArgumentos() throws RecognitionException {
        CanecaArvore.listaDeArgumentos_return retval = new CanecaArvore.listaDeArgumentos_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PARENTESE_ESQUERDO79=null;
        CommonTree SEPARADOR81=null;
        CommonTree PARENTESE_DIREITO83=null;
        CanecaArvore.declaracao_return declaracao80 =null;

        CanecaArvore.declaracao_return declaracao82 =null;


        CommonTree PARENTESE_ESQUERDO79_tree=null;
        CommonTree SEPARADOR81_tree=null;
        CommonTree PARENTESE_DIREITO83_tree=null;
        RewriteRuleNodeStream stream_PARENTESE_ESQUERDO=new RewriteRuleNodeStream(adaptor,"token PARENTESE_ESQUERDO");
        RewriteRuleNodeStream stream_PARENTESE_DIREITO=new RewriteRuleNodeStream(adaptor,"token PARENTESE_DIREITO");
        RewriteRuleNodeStream stream_SEPARADOR=new RewriteRuleNodeStream(adaptor,"token SEPARADOR");
        RewriteRuleSubtreeStream stream_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule declaracao");
        try {
            // fontes/g/CanecaArvore.g:197:2: ( PARENTESE_ESQUERDO ( declaracao ( SEPARADOR declaracao )* )? PARENTESE_DIREITO -> ^( ARGUMENTOS_ ( declaracao )* ) )
            // fontes/g/CanecaArvore.g:197:4: PARENTESE_ESQUERDO ( declaracao ( SEPARADOR declaracao )* )? PARENTESE_DIREITO
            {
            _last = (CommonTree)input.LT(1);
            PARENTESE_ESQUERDO79=(CommonTree)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_listaDeArgumentos1019);  
            stream_PARENTESE_ESQUERDO.add(PARENTESE_ESQUERDO79);


            // fontes/g/CanecaArvore.g:197:23: ( declaracao ( SEPARADOR declaracao )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENTIFICADOR) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // fontes/g/CanecaArvore.g:197:24: declaracao ( SEPARADOR declaracao )*
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declaracao_in_listaDeArgumentos1022);
                    declaracao80=declaracao();

                    state._fsp--;

                    stream_declaracao.add(declaracao80.getTree());

                    // fontes/g/CanecaArvore.g:197:35: ( SEPARADOR declaracao )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==SEPARADOR) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // fontes/g/CanecaArvore.g:197:36: SEPARADOR declaracao
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    SEPARADOR81=(CommonTree)match(input,SEPARADOR,FOLLOW_SEPARADOR_in_listaDeArgumentos1025);  
                    	    stream_SEPARADOR.add(SEPARADOR81);


                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_declaracao_in_listaDeArgumentos1027);
                    	    declaracao82=declaracao();

                    	    state._fsp--;

                    	    stream_declaracao.add(declaracao82.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            PARENTESE_DIREITO83=(CommonTree)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_listaDeArgumentos1033);  
            stream_PARENTESE_DIREITO.add(PARENTESE_DIREITO83);


            // AST REWRITE
            // elements: declaracao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 197:79: -> ^( ARGUMENTOS_ ( declaracao )* )
            {
                // fontes/g/CanecaArvore.g:197:82: ^( ARGUMENTOS_ ( declaracao )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ARGUMENTOS_, "ARGUMENTOS_")
                , root_1);

                // fontes/g/CanecaArvore.g:197:96: ( declaracao )*
                while ( stream_declaracao.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaracao.nextTree());

                }
                stream_declaracao.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listaDeArgumentos"


    public static class listaDeInterfaces_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listaDeInterfaces"
    // fontes/g/CanecaArvore.g:200:1: listaDeInterfaces : ( IMPLEMENTA tipo ( SEPARADOR tipo )* )? -> ^( INTERFACES_ ( tipo )* ) ;
    public final CanecaArvore.listaDeInterfaces_return listaDeInterfaces() throws RecognitionException {
        CanecaArvore.listaDeInterfaces_return retval = new CanecaArvore.listaDeInterfaces_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IMPLEMENTA84=null;
        CommonTree SEPARADOR86=null;
        CanecaArvore.tipo_return tipo85 =null;

        CanecaArvore.tipo_return tipo87 =null;


        CommonTree IMPLEMENTA84_tree=null;
        CommonTree SEPARADOR86_tree=null;
        RewriteRuleNodeStream stream_IMPLEMENTA=new RewriteRuleNodeStream(adaptor,"token IMPLEMENTA");
        RewriteRuleNodeStream stream_SEPARADOR=new RewriteRuleNodeStream(adaptor,"token SEPARADOR");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        try {
            // fontes/g/CanecaArvore.g:201:2: ( ( IMPLEMENTA tipo ( SEPARADOR tipo )* )? -> ^( INTERFACES_ ( tipo )* ) )
            // fontes/g/CanecaArvore.g:201:4: ( IMPLEMENTA tipo ( SEPARADOR tipo )* )?
            {
            // fontes/g/CanecaArvore.g:201:4: ( IMPLEMENTA tipo ( SEPARADOR tipo )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IMPLEMENTA) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // fontes/g/CanecaArvore.g:201:5: IMPLEMENTA tipo ( SEPARADOR tipo )*
                    {
                    _last = (CommonTree)input.LT(1);
                    IMPLEMENTA84=(CommonTree)match(input,IMPLEMENTA,FOLLOW_IMPLEMENTA_in_listaDeInterfaces1056);  
                    stream_IMPLEMENTA.add(IMPLEMENTA84);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_tipo_in_listaDeInterfaces1058);
                    tipo85=tipo();

                    state._fsp--;

                    stream_tipo.add(tipo85.getTree());

                    // fontes/g/CanecaArvore.g:201:21: ( SEPARADOR tipo )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==SEPARADOR) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // fontes/g/CanecaArvore.g:201:22: SEPARADOR tipo
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    SEPARADOR86=(CommonTree)match(input,SEPARADOR,FOLLOW_SEPARADOR_in_listaDeInterfaces1061);  
                    	    stream_SEPARADOR.add(SEPARADOR86);


                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_tipo_in_listaDeInterfaces1063);
                    	    tipo87=tipo();

                    	    state._fsp--;

                    	    stream_tipo.add(tipo87.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }


            // AST REWRITE
            // elements: tipo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 201:41: -> ^( INTERFACES_ ( tipo )* )
            {
                // fontes/g/CanecaArvore.g:201:44: ^( INTERFACES_ ( tipo )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(INTERFACES_, "INTERFACES_")
                , root_1);

                // fontes/g/CanecaArvore.g:201:58: ( tipo )*
                while ( stream_tipo.hasNext() ) {
                    adaptor.addChild(root_1, stream_tipo.nextTree());

                }
                stream_tipo.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listaDeInterfaces"


    public static class listaDeTiposGenericos_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listaDeTiposGenericos"
    // fontes/g/CanecaArvore.g:204:2: listaDeTiposGenericos : ( COLCHETE_ESQUERDO tipoGenerico COLCHETE_DIREITO )* -> ^( TIPOS_GENERICOS_ ( tipoGenerico )* ) ;
    public final CanecaArvore.listaDeTiposGenericos_return listaDeTiposGenericos() throws RecognitionException {
        CanecaArvore.listaDeTiposGenericos_return retval = new CanecaArvore.listaDeTiposGenericos_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COLCHETE_ESQUERDO88=null;
        CommonTree COLCHETE_DIREITO90=null;
        CanecaArvore.tipoGenerico_return tipoGenerico89 =null;


        CommonTree COLCHETE_ESQUERDO88_tree=null;
        CommonTree COLCHETE_DIREITO90_tree=null;
        RewriteRuleNodeStream stream_COLCHETE_DIREITO=new RewriteRuleNodeStream(adaptor,"token COLCHETE_DIREITO");
        RewriteRuleNodeStream stream_COLCHETE_ESQUERDO=new RewriteRuleNodeStream(adaptor,"token COLCHETE_ESQUERDO");
        RewriteRuleSubtreeStream stream_tipoGenerico=new RewriteRuleSubtreeStream(adaptor,"rule tipoGenerico");
        try {
            // fontes/g/CanecaArvore.g:205:2: ( ( COLCHETE_ESQUERDO tipoGenerico COLCHETE_DIREITO )* -> ^( TIPOS_GENERICOS_ ( tipoGenerico )* ) )
            // fontes/g/CanecaArvore.g:205:4: ( COLCHETE_ESQUERDO tipoGenerico COLCHETE_DIREITO )*
            {
            // fontes/g/CanecaArvore.g:205:4: ( COLCHETE_ESQUERDO tipoGenerico COLCHETE_DIREITO )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==COLCHETE_ESQUERDO) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // fontes/g/CanecaArvore.g:205:5: COLCHETE_ESQUERDO tipoGenerico COLCHETE_DIREITO
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    COLCHETE_ESQUERDO88=(CommonTree)match(input,COLCHETE_ESQUERDO,FOLLOW_COLCHETE_ESQUERDO_in_listaDeTiposGenericos1091);  
            	    stream_COLCHETE_ESQUERDO.add(COLCHETE_ESQUERDO88);


            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_tipoGenerico_in_listaDeTiposGenericos1093);
            	    tipoGenerico89=tipoGenerico();

            	    state._fsp--;

            	    stream_tipoGenerico.add(tipoGenerico89.getTree());

            	    _last = (CommonTree)input.LT(1);
            	    COLCHETE_DIREITO90=(CommonTree)match(input,COLCHETE_DIREITO,FOLLOW_COLCHETE_DIREITO_in_listaDeTiposGenericos1095);  
            	    stream_COLCHETE_DIREITO.add(COLCHETE_DIREITO90);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            // AST REWRITE
            // elements: tipoGenerico
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 205:55: -> ^( TIPOS_GENERICOS_ ( tipoGenerico )* )
            {
                // fontes/g/CanecaArvore.g:205:58: ^( TIPOS_GENERICOS_ ( tipoGenerico )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TIPOS_GENERICOS_, "TIPOS_GENERICOS_")
                , root_1);

                // fontes/g/CanecaArvore.g:205:77: ( tipoGenerico )*
                while ( stream_tipoGenerico.hasNext() ) {
                    adaptor.addChild(root_1, stream_tipoGenerico.nextTree());

                }
                stream_tipoGenerico.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listaDeTiposGenericos"


    public static class listaDeTipos_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listaDeTipos"
    // fontes/g/CanecaArvore.g:208:1: listaDeTipos : ( COLCHETE_ESQUERDO tipo ( SEPARADOR tipo )* COLCHETE_DIREITO )? -> ^( TIPOS_ ( tipo )* ) ;
    public final CanecaArvore.listaDeTipos_return listaDeTipos() throws RecognitionException {
        CanecaArvore.listaDeTipos_return retval = new CanecaArvore.listaDeTipos_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COLCHETE_ESQUERDO91=null;
        CommonTree SEPARADOR93=null;
        CommonTree COLCHETE_DIREITO95=null;
        CanecaArvore.tipo_return tipo92 =null;

        CanecaArvore.tipo_return tipo94 =null;


        CommonTree COLCHETE_ESQUERDO91_tree=null;
        CommonTree SEPARADOR93_tree=null;
        CommonTree COLCHETE_DIREITO95_tree=null;
        RewriteRuleNodeStream stream_COLCHETE_DIREITO=new RewriteRuleNodeStream(adaptor,"token COLCHETE_DIREITO");
        RewriteRuleNodeStream stream_COLCHETE_ESQUERDO=new RewriteRuleNodeStream(adaptor,"token COLCHETE_ESQUERDO");
        RewriteRuleNodeStream stream_SEPARADOR=new RewriteRuleNodeStream(adaptor,"token SEPARADOR");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        try {
            // fontes/g/CanecaArvore.g:209:2: ( ( COLCHETE_ESQUERDO tipo ( SEPARADOR tipo )* COLCHETE_DIREITO )? -> ^( TIPOS_ ( tipo )* ) )
            // fontes/g/CanecaArvore.g:209:4: ( COLCHETE_ESQUERDO tipo ( SEPARADOR tipo )* COLCHETE_DIREITO )?
            {
            // fontes/g/CanecaArvore.g:209:4: ( COLCHETE_ESQUERDO tipo ( SEPARADOR tipo )* COLCHETE_DIREITO )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==COLCHETE_ESQUERDO) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // fontes/g/CanecaArvore.g:209:5: COLCHETE_ESQUERDO tipo ( SEPARADOR tipo )* COLCHETE_DIREITO
                    {
                    _last = (CommonTree)input.LT(1);
                    COLCHETE_ESQUERDO91=(CommonTree)match(input,COLCHETE_ESQUERDO,FOLLOW_COLCHETE_ESQUERDO_in_listaDeTipos1120);  
                    stream_COLCHETE_ESQUERDO.add(COLCHETE_ESQUERDO91);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_tipo_in_listaDeTipos1122);
                    tipo92=tipo();

                    state._fsp--;

                    stream_tipo.add(tipo92.getTree());

                    // fontes/g/CanecaArvore.g:209:28: ( SEPARADOR tipo )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==SEPARADOR) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // fontes/g/CanecaArvore.g:209:29: SEPARADOR tipo
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    SEPARADOR93=(CommonTree)match(input,SEPARADOR,FOLLOW_SEPARADOR_in_listaDeTipos1125);  
                    	    stream_SEPARADOR.add(SEPARADOR93);


                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_tipo_in_listaDeTipos1127);
                    	    tipo94=tipo();

                    	    state._fsp--;

                    	    stream_tipo.add(tipo94.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    _last = (CommonTree)input.LT(1);
                    COLCHETE_DIREITO95=(CommonTree)match(input,COLCHETE_DIREITO,FOLLOW_COLCHETE_DIREITO_in_listaDeTipos1131);  
                    stream_COLCHETE_DIREITO.add(COLCHETE_DIREITO95);


                    }
                    break;

            }


            // AST REWRITE
            // elements: tipo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 209:65: -> ^( TIPOS_ ( tipo )* )
            {
                // fontes/g/CanecaArvore.g:209:68: ^( TIPOS_ ( tipo )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TIPOS_, "TIPOS_")
                , root_1);

                // fontes/g/CanecaArvore.g:209:77: ( tipo )*
                while ( stream_tipo.hasNext() ) {
                    adaptor.addChild(root_1, stream_tipo.nextTree());

                }
                stream_tipo.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listaDeTipos"


    public static class listaDeCapturas_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listaDeCapturas"
    // fontes/g/CanecaArvore.g:212:1: listaDeCapturas : ( capture )+ -> ^( CAPTURAS_ ( capture )+ ) ;
    public final CanecaArvore.listaDeCapturas_return listaDeCapturas() throws RecognitionException {
        CanecaArvore.listaDeCapturas_return retval = new CanecaArvore.listaDeCapturas_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CanecaArvore.capture_return capture96 =null;


        RewriteRuleSubtreeStream stream_capture=new RewriteRuleSubtreeStream(adaptor,"rule capture");
        try {
            // fontes/g/CanecaArvore.g:213:2: ( ( capture )+ -> ^( CAPTURAS_ ( capture )+ ) )
            // fontes/g/CanecaArvore.g:213:4: ( capture )+
            {
            // fontes/g/CanecaArvore.g:213:4: ( capture )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==CAPTURE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // fontes/g/CanecaArvore.g:213:5: capture
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_capture_in_listaDeCapturas1156);
            	    capture96=capture();

            	    state._fsp--;

            	    stream_capture.add(capture96.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            // AST REWRITE
            // elements: capture
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 213:15: -> ^( CAPTURAS_ ( capture )+ )
            {
                // fontes/g/CanecaArvore.g:213:18: ^( CAPTURAS_ ( capture )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CAPTURAS_, "CAPTURAS_")
                , root_1);

                if ( !(stream_capture.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_capture.hasNext() ) {
                    adaptor.addChild(root_1, stream_capture.nextTree());

                }
                stream_capture.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listaDeCapturas"


    public static class tipoGenerico_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tipoGenerico"
    // fontes/g/CanecaArvore.g:216:1: tipoGenerico : IDENTIFICADOR listaDeInterfaces -> ^( TIPO_GENERICO_ IDENTIFICADOR listaDeInterfaces ) ;
    public final CanecaArvore.tipoGenerico_return tipoGenerico() throws RecognitionException {
        CanecaArvore.tipoGenerico_return retval = new CanecaArvore.tipoGenerico_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFICADOR97=null;
        CanecaArvore.listaDeInterfaces_return listaDeInterfaces98 =null;


        CommonTree IDENTIFICADOR97_tree=null;
        RewriteRuleNodeStream stream_IDENTIFICADOR=new RewriteRuleNodeStream(adaptor,"token IDENTIFICADOR");
        RewriteRuleSubtreeStream stream_listaDeInterfaces=new RewriteRuleSubtreeStream(adaptor,"rule listaDeInterfaces");
        try {
            // fontes/g/CanecaArvore.g:217:2: ( IDENTIFICADOR listaDeInterfaces -> ^( TIPO_GENERICO_ IDENTIFICADOR listaDeInterfaces ) )
            // fontes/g/CanecaArvore.g:217:4: IDENTIFICADOR listaDeInterfaces
            {
            _last = (CommonTree)input.LT(1);
            IDENTIFICADOR97=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_tipoGenerico1180);  
            stream_IDENTIFICADOR.add(IDENTIFICADOR97);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_listaDeInterfaces_in_tipoGenerico1182);
            listaDeInterfaces98=listaDeInterfaces();

            state._fsp--;

            stream_listaDeInterfaces.add(listaDeInterfaces98.getTree());

            // AST REWRITE
            // elements: IDENTIFICADOR, listaDeInterfaces
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 217:36: -> ^( TIPO_GENERICO_ IDENTIFICADOR listaDeInterfaces )
            {
                // fontes/g/CanecaArvore.g:217:39: ^( TIPO_GENERICO_ IDENTIFICADOR listaDeInterfaces )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TIPO_GENERICO_, "TIPO_GENERICO_")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFICADOR.nextNode()
                );

                adaptor.addChild(root_1, stream_listaDeInterfaces.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tipoGenerico"


    public static class tipo_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tipo"
    // fontes/g/CanecaArvore.g:220:1: tipo : IDENTIFICADOR listaDeTipos -> ^( TIPO_ IDENTIFICADOR listaDeTipos ) ;
    public final CanecaArvore.tipo_return tipo() throws RecognitionException {
        CanecaArvore.tipo_return retval = new CanecaArvore.tipo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFICADOR99=null;
        CanecaArvore.listaDeTipos_return listaDeTipos100 =null;


        CommonTree IDENTIFICADOR99_tree=null;
        RewriteRuleNodeStream stream_IDENTIFICADOR=new RewriteRuleNodeStream(adaptor,"token IDENTIFICADOR");
        RewriteRuleSubtreeStream stream_listaDeTipos=new RewriteRuleSubtreeStream(adaptor,"rule listaDeTipos");
        try {
            // fontes/g/CanecaArvore.g:221:2: ( IDENTIFICADOR listaDeTipos -> ^( TIPO_ IDENTIFICADOR listaDeTipos ) )
            // fontes/g/CanecaArvore.g:221:4: IDENTIFICADOR listaDeTipos
            {
            _last = (CommonTree)input.LT(1);
            IDENTIFICADOR99=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_tipo1203);  
            stream_IDENTIFICADOR.add(IDENTIFICADOR99);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_listaDeTipos_in_tipo1205);
            listaDeTipos100=listaDeTipos();

            state._fsp--;

            stream_listaDeTipos.add(listaDeTipos100.getTree());

            // AST REWRITE
            // elements: IDENTIFICADOR, listaDeTipos
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 221:31: -> ^( TIPO_ IDENTIFICADOR listaDeTipos )
            {
                // fontes/g/CanecaArvore.g:221:34: ^( TIPO_ IDENTIFICADOR listaDeTipos )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TIPO_, "TIPO_")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFICADOR.nextNode()
                );

                adaptor.addChild(root_1, stream_listaDeTipos.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tipo"


    public static class declaracao_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaracao"
    // fontes/g/CanecaArvore.g:224:1: declaracao : tipo IDENTIFICADOR -> ^( DECLARACAO_ tipo IDENTIFICADOR ) ;
    public final CanecaArvore.declaracao_return declaracao() throws RecognitionException {
        CanecaArvore.declaracao_return retval = new CanecaArvore.declaracao_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFICADOR102=null;
        CanecaArvore.tipo_return tipo101 =null;


        CommonTree IDENTIFICADOR102_tree=null;
        RewriteRuleNodeStream stream_IDENTIFICADOR=new RewriteRuleNodeStream(adaptor,"token IDENTIFICADOR");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        try {
            // fontes/g/CanecaArvore.g:225:2: ( tipo IDENTIFICADOR -> ^( DECLARACAO_ tipo IDENTIFICADOR ) )
            // fontes/g/CanecaArvore.g:225:4: tipo IDENTIFICADOR
            {
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_tipo_in_declaracao1226);
            tipo101=tipo();

            state._fsp--;

            stream_tipo.add(tipo101.getTree());

            _last = (CommonTree)input.LT(1);
            IDENTIFICADOR102=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_declaracao1228);  
            stream_IDENTIFICADOR.add(IDENTIFICADOR102);


            // AST REWRITE
            // elements: IDENTIFICADOR, tipo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 225:23: -> ^( DECLARACAO_ tipo IDENTIFICADOR )
            {
                // fontes/g/CanecaArvore.g:225:26: ^( DECLARACAO_ tipo IDENTIFICADOR )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DECLARACAO_, "DECLARACAO_")
                , root_1);

                adaptor.addChild(root_1, stream_tipo.nextTree());

                adaptor.addChild(root_1, 
                stream_IDENTIFICADOR.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaracao"


    public static class atribuicao_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atribuicao"
    // fontes/g/CanecaArvore.g:228:1: atribuicao : ATRIBUIDOR expressaoOuLogico -> ^( ATRIBUICAO_ expressaoOuLogico ) ;
    public final CanecaArvore.atribuicao_return atribuicao() throws RecognitionException {
        CanecaArvore.atribuicao_return retval = new CanecaArvore.atribuicao_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ATRIBUIDOR103=null;
        CanecaArvore.expressaoOuLogico_return expressaoOuLogico104 =null;


        CommonTree ATRIBUIDOR103_tree=null;
        RewriteRuleNodeStream stream_ATRIBUIDOR=new RewriteRuleNodeStream(adaptor,"token ATRIBUIDOR");
        RewriteRuleSubtreeStream stream_expressaoOuLogico=new RewriteRuleSubtreeStream(adaptor,"rule expressaoOuLogico");
        try {
            // fontes/g/CanecaArvore.g:229:2: ( ATRIBUIDOR expressaoOuLogico -> ^( ATRIBUICAO_ expressaoOuLogico ) )
            // fontes/g/CanecaArvore.g:229:4: ATRIBUIDOR expressaoOuLogico
            {
            _last = (CommonTree)input.LT(1);
            ATRIBUIDOR103=(CommonTree)match(input,ATRIBUIDOR,FOLLOW_ATRIBUIDOR_in_atribuicao1249);  
            stream_ATRIBUIDOR.add(ATRIBUIDOR103);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expressaoOuLogico_in_atribuicao1251);
            expressaoOuLogico104=expressaoOuLogico();

            state._fsp--;

            stream_expressaoOuLogico.add(expressaoOuLogico104.getTree());

            // AST REWRITE
            // elements: expressaoOuLogico
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 229:33: -> ^( ATRIBUICAO_ expressaoOuLogico )
            {
                // fontes/g/CanecaArvore.g:229:36: ^( ATRIBUICAO_ expressaoOuLogico )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ATRIBUICAO_, "ATRIBUICAO_")
                , root_1);

                adaptor.addChild(root_1, stream_expressaoOuLogico.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atribuicao"


    public static class declaracaoComAtribuicaoOpcional_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaracaoComAtribuicaoOpcional"
    // fontes/g/CanecaArvore.g:232:1: declaracaoComAtribuicaoOpcional : declaracao ( atribuicao )? -> ^( DECLARACAO_COM_ATRIBUICAO_OPICIONAL_ declaracao ( atribuicao )? ) ;
    public final CanecaArvore.declaracaoComAtribuicaoOpcional_return declaracaoComAtribuicaoOpcional() throws RecognitionException {
        CanecaArvore.declaracaoComAtribuicaoOpcional_return retval = new CanecaArvore.declaracaoComAtribuicaoOpcional_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CanecaArvore.declaracao_return declaracao105 =null;

        CanecaArvore.atribuicao_return atribuicao106 =null;


        RewriteRuleSubtreeStream stream_atribuicao=new RewriteRuleSubtreeStream(adaptor,"rule atribuicao");
        RewriteRuleSubtreeStream stream_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule declaracao");
        try {
            // fontes/g/CanecaArvore.g:233:2: ( declaracao ( atribuicao )? -> ^( DECLARACAO_COM_ATRIBUICAO_OPICIONAL_ declaracao ( atribuicao )? ) )
            // fontes/g/CanecaArvore.g:233:4: declaracao ( atribuicao )?
            {
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_declaracao_in_declaracaoComAtribuicaoOpcional1270);
            declaracao105=declaracao();

            state._fsp--;

            stream_declaracao.add(declaracao105.getTree());

            // fontes/g/CanecaArvore.g:233:15: ( atribuicao )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ATRIBUIDOR) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // fontes/g/CanecaArvore.g:233:16: atribuicao
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_atribuicao_in_declaracaoComAtribuicaoOpcional1273);
                    atribuicao106=atribuicao();

                    state._fsp--;

                    stream_atribuicao.add(atribuicao106.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: atribuicao, declaracao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 233:29: -> ^( DECLARACAO_COM_ATRIBUICAO_OPICIONAL_ declaracao ( atribuicao )? )
            {
                // fontes/g/CanecaArvore.g:233:32: ^( DECLARACAO_COM_ATRIBUICAO_OPICIONAL_ declaracao ( atribuicao )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DECLARACAO_COM_ATRIBUICAO_OPICIONAL_, "DECLARACAO_COM_ATRIBUICAO_OPICIONAL_")
                , root_1);

                adaptor.addChild(root_1, stream_declaracao.nextTree());

                // fontes/g/CanecaArvore.g:233:82: ( atribuicao )?
                if ( stream_atribuicao.hasNext() ) {
                    adaptor.addChild(root_1, stream_atribuicao.nextTree());

                }
                stream_atribuicao.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaracaoComAtribuicaoOpcional"


    public static class expressao_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressao"
    // fontes/g/CanecaArvore.g:236:1: expressao : expressaoOuLogico ( ATRIBUIDOR ^ expressaoOuLogico )? ;
    public final CanecaArvore.expressao_return expressao() throws RecognitionException {
        CanecaArvore.expressao_return retval = new CanecaArvore.expressao_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ATRIBUIDOR108=null;
        CanecaArvore.expressaoOuLogico_return expressaoOuLogico107 =null;

        CanecaArvore.expressaoOuLogico_return expressaoOuLogico109 =null;


        CommonTree ATRIBUIDOR108_tree=null;

        try {
            // fontes/g/CanecaArvore.g:237:2: ( expressaoOuLogico ( ATRIBUIDOR ^ expressaoOuLogico )? )
            // fontes/g/CanecaArvore.g:237:4: expressaoOuLogico ( ATRIBUIDOR ^ expressaoOuLogico )?
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expressaoOuLogico_in_expressao1299);
            expressaoOuLogico107=expressaoOuLogico();

            state._fsp--;

            adaptor.addChild(root_0, expressaoOuLogico107.getTree());


            // fontes/g/CanecaArvore.g:237:22: ( ATRIBUIDOR ^ expressaoOuLogico )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ATRIBUIDOR) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // fontes/g/CanecaArvore.g:237:23: ATRIBUIDOR ^ expressaoOuLogico
                    {
                    _last = (CommonTree)input.LT(1);
                    ATRIBUIDOR108=(CommonTree)match(input,ATRIBUIDOR,FOLLOW_ATRIBUIDOR_in_expressao1302); 
                    ATRIBUIDOR108_tree = (CommonTree)adaptor.dupNode(ATRIBUIDOR108);


                    root_0 = (CommonTree)adaptor.becomeRoot(ATRIBUIDOR108_tree, root_0);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expressaoOuLogico_in_expressao1305);
                    expressaoOuLogico109=expressaoOuLogico();

                    state._fsp--;

                    adaptor.addChild(root_0, expressaoOuLogico109.getTree());


                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressao"


    public static class expressaoOuLogico_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressaoOuLogico"
    // fontes/g/CanecaArvore.g:240:1: expressaoOuLogico : expressaoELogico ( OU ^ expressaoELogico )* ;
    public final CanecaArvore.expressaoOuLogico_return expressaoOuLogico() throws RecognitionException {
        CanecaArvore.expressaoOuLogico_return retval = new CanecaArvore.expressaoOuLogico_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OU111=null;
        CanecaArvore.expressaoELogico_return expressaoELogico110 =null;

        CanecaArvore.expressaoELogico_return expressaoELogico112 =null;


        CommonTree OU111_tree=null;

        try {
            // fontes/g/CanecaArvore.g:241:2: ( expressaoELogico ( OU ^ expressaoELogico )* )
            // fontes/g/CanecaArvore.g:241:4: expressaoELogico ( OU ^ expressaoELogico )*
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expressaoELogico_in_expressaoOuLogico1318);
            expressaoELogico110=expressaoELogico();

            state._fsp--;

            adaptor.addChild(root_0, expressaoELogico110.getTree());


            // fontes/g/CanecaArvore.g:241:21: ( OU ^ expressaoELogico )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==OU) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // fontes/g/CanecaArvore.g:241:22: OU ^ expressaoELogico
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    OU111=(CommonTree)match(input,OU,FOLLOW_OU_in_expressaoOuLogico1321); 
            	    OU111_tree = (CommonTree)adaptor.dupNode(OU111);


            	    root_0 = (CommonTree)adaptor.becomeRoot(OU111_tree, root_0);


            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expressaoELogico_in_expressaoOuLogico1324);
            	    expressaoELogico112=expressaoELogico();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expressaoELogico112.getTree());


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressaoOuLogico"


    public static class expressaoELogico_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressaoELogico"
    // fontes/g/CanecaArvore.g:244:1: expressaoELogico : expressaoComparacaoLogica ( E ^ expressaoComparacaoLogica )* ;
    public final CanecaArvore.expressaoELogico_return expressaoELogico() throws RecognitionException {
        CanecaArvore.expressaoELogico_return retval = new CanecaArvore.expressaoELogico_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree E114=null;
        CanecaArvore.expressaoComparacaoLogica_return expressaoComparacaoLogica113 =null;

        CanecaArvore.expressaoComparacaoLogica_return expressaoComparacaoLogica115 =null;


        CommonTree E114_tree=null;

        try {
            // fontes/g/CanecaArvore.g:245:2: ( expressaoComparacaoLogica ( E ^ expressaoComparacaoLogica )* )
            // fontes/g/CanecaArvore.g:245:4: expressaoComparacaoLogica ( E ^ expressaoComparacaoLogica )*
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expressaoComparacaoLogica_in_expressaoELogico1337);
            expressaoComparacaoLogica113=expressaoComparacaoLogica();

            state._fsp--;

            adaptor.addChild(root_0, expressaoComparacaoLogica113.getTree());


            // fontes/g/CanecaArvore.g:245:30: ( E ^ expressaoComparacaoLogica )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==E) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // fontes/g/CanecaArvore.g:245:31: E ^ expressaoComparacaoLogica
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    E114=(CommonTree)match(input,E,FOLLOW_E_in_expressaoELogico1340); 
            	    E114_tree = (CommonTree)adaptor.dupNode(E114);


            	    root_0 = (CommonTree)adaptor.becomeRoot(E114_tree, root_0);


            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expressaoComparacaoLogica_in_expressaoELogico1343);
            	    expressaoComparacaoLogica115=expressaoComparacaoLogica();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expressaoComparacaoLogica115.getTree());


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressaoELogico"


    public static class expressaoComparacaoLogica_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressaoComparacaoLogica"
    // fontes/g/CanecaArvore.g:248:1: expressaoComparacaoLogica : expressaoAditiva ( ( IGUAL | DIFERENTE | MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) ^ expressaoAditiva )* ;
    public final CanecaArvore.expressaoComparacaoLogica_return expressaoComparacaoLogica() throws RecognitionException {
        CanecaArvore.expressaoComparacaoLogica_return retval = new CanecaArvore.expressaoComparacaoLogica_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set117=null;
        CanecaArvore.expressaoAditiva_return expressaoAditiva116 =null;

        CanecaArvore.expressaoAditiva_return expressaoAditiva118 =null;


        CommonTree set117_tree=null;

        try {
            // fontes/g/CanecaArvore.g:249:2: ( expressaoAditiva ( ( IGUAL | DIFERENTE | MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) ^ expressaoAditiva )* )
            // fontes/g/CanecaArvore.g:249:4: expressaoAditiva ( ( IGUAL | DIFERENTE | MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) ^ expressaoAditiva )*
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica1356);
            expressaoAditiva116=expressaoAditiva();

            state._fsp--;

            adaptor.addChild(root_0, expressaoAditiva116.getTree());


            // fontes/g/CanecaArvore.g:249:21: ( ( IGUAL | DIFERENTE | MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) ^ expressaoAditiva )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==DIFERENTE||LA27_0==IGUAL||(LA27_0 >= MAIOR && LA27_0 <= MENOR_IGUAL)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // fontes/g/CanecaArvore.g:249:22: ( IGUAL | DIFERENTE | MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) ^ expressaoAditiva
            	    {
            	    set117=(CommonTree)input.LT(1);

            	    if ( input.LA(1)==DIFERENTE||input.LA(1)==IGUAL||(input.LA(1) >= MAIOR && input.LA(1) <= MENOR_IGUAL) ) {
            	        input.consume();
            	        set117_tree = (CommonTree)adaptor.dupNode(set117);


            	        root_0 = (CommonTree)adaptor.becomeRoot(set117_tree, root_0);

            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica1384);
            	    expressaoAditiva118=expressaoAditiva();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expressaoAditiva118.getTree());


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressaoComparacaoLogica"


    public static class expressaoAditiva_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressaoAditiva"
    // fontes/g/CanecaArvore.g:252:1: expressaoAditiva : expressaoMultiplicativa ( ( SOMA | SUBTRACAO ) ^ expressaoMultiplicativa )* ;
    public final CanecaArvore.expressaoAditiva_return expressaoAditiva() throws RecognitionException {
        CanecaArvore.expressaoAditiva_return retval = new CanecaArvore.expressaoAditiva_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set120=null;
        CanecaArvore.expressaoMultiplicativa_return expressaoMultiplicativa119 =null;

        CanecaArvore.expressaoMultiplicativa_return expressaoMultiplicativa121 =null;


        CommonTree set120_tree=null;

        try {
            // fontes/g/CanecaArvore.g:253:2: ( expressaoMultiplicativa ( ( SOMA | SUBTRACAO ) ^ expressaoMultiplicativa )* )
            // fontes/g/CanecaArvore.g:253:4: expressaoMultiplicativa ( ( SOMA | SUBTRACAO ) ^ expressaoMultiplicativa )*
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expressaoMultiplicativa_in_expressaoAditiva1397);
            expressaoMultiplicativa119=expressaoMultiplicativa();

            state._fsp--;

            adaptor.addChild(root_0, expressaoMultiplicativa119.getTree());


            // fontes/g/CanecaArvore.g:253:28: ( ( SOMA | SUBTRACAO ) ^ expressaoMultiplicativa )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0 >= SOMA && LA28_0 <= SUBTRACAO)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // fontes/g/CanecaArvore.g:253:29: ( SOMA | SUBTRACAO ) ^ expressaoMultiplicativa
            	    {
            	    set120=(CommonTree)input.LT(1);

            	    if ( (input.LA(1) >= SOMA && input.LA(1) <= SUBTRACAO) ) {
            	        input.consume();
            	        set120_tree = (CommonTree)adaptor.dupNode(set120);


            	        root_0 = (CommonTree)adaptor.becomeRoot(set120_tree, root_0);

            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expressaoMultiplicativa_in_expressaoAditiva1409);
            	    expressaoMultiplicativa121=expressaoMultiplicativa();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expressaoMultiplicativa121.getTree());


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressaoAditiva"


    public static class expressaoMultiplicativa_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressaoMultiplicativa"
    // fontes/g/CanecaArvore.g:256:1: expressaoMultiplicativa : expressaoUnaria ( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) ^ expressaoUnaria )* ;
    public final CanecaArvore.expressaoMultiplicativa_return expressaoMultiplicativa() throws RecognitionException {
        CanecaArvore.expressaoMultiplicativa_return retval = new CanecaArvore.expressaoMultiplicativa_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set123=null;
        CanecaArvore.expressaoUnaria_return expressaoUnaria122 =null;

        CanecaArvore.expressaoUnaria_return expressaoUnaria124 =null;


        CommonTree set123_tree=null;

        try {
            // fontes/g/CanecaArvore.g:257:2: ( expressaoUnaria ( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) ^ expressaoUnaria )* )
            // fontes/g/CanecaArvore.g:257:4: expressaoUnaria ( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) ^ expressaoUnaria )*
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expressaoUnaria_in_expressaoMultiplicativa1422);
            expressaoUnaria122=expressaoUnaria();

            state._fsp--;

            adaptor.addChild(root_0, expressaoUnaria122.getTree());


            // fontes/g/CanecaArvore.g:257:20: ( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) ^ expressaoUnaria )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==DIVISAO||LA29_0==MULTIPLICACAO||LA29_0==RESTO_DA_DIVISAO) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // fontes/g/CanecaArvore.g:257:21: ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) ^ expressaoUnaria
            	    {
            	    set123=(CommonTree)input.LT(1);

            	    if ( input.LA(1)==DIVISAO||input.LA(1)==MULTIPLICACAO||input.LA(1)==RESTO_DA_DIVISAO ) {
            	        input.consume();
            	        set123_tree = (CommonTree)adaptor.dupNode(set123);


            	        root_0 = (CommonTree)adaptor.becomeRoot(set123_tree, root_0);

            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expressaoUnaria_in_expressaoMultiplicativa1438);
            	    expressaoUnaria124=expressaoUnaria();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expressaoUnaria124.getTree());


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressaoMultiplicativa"


    public static class expressaoUnaria_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressaoUnaria"
    // fontes/g/CanecaArvore.g:260:1: expressaoUnaria : ( expressaoPrimaria | SUBTRACAO ^ expressaoUnaria | NEGACAO ^ expressaoUnaria );
    public final CanecaArvore.expressaoUnaria_return expressaoUnaria() throws RecognitionException {
        CanecaArvore.expressaoUnaria_return retval = new CanecaArvore.expressaoUnaria_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SUBTRACAO126=null;
        CommonTree NEGACAO128=null;
        CanecaArvore.expressaoPrimaria_return expressaoPrimaria125 =null;

        CanecaArvore.expressaoUnaria_return expressaoUnaria127 =null;

        CanecaArvore.expressaoUnaria_return expressaoUnaria129 =null;


        CommonTree SUBTRACAO126_tree=null;
        CommonTree NEGACAO128_tree=null;

        try {
            // fontes/g/CanecaArvore.g:261:2: ( expressaoPrimaria | SUBTRACAO ^ expressaoUnaria | NEGACAO ^ expressaoUnaria )
            int alt30=3;
            switch ( input.LA(1) ) {
            case CONSTANTE_INTEIRA:
            case CONSTANTE_REAL:
            case ESSA:
            case ESSE:
            case IDENTIFICADOR:
            case LITERAL_CARACTERE:
            case LITERAL_TEXTO:
            case NOVA:
            case NOVO:
            case PARENTESE_ESQUERDO:
            case VALOR_BOOLEANO:
            case VALOR_NULO:
                {
                alt30=1;
                }
                break;
            case SUBTRACAO:
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
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // fontes/g/CanecaArvore.g:261:4: expressaoPrimaria
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expressaoPrimaria_in_expressaoUnaria1451);
                    expressaoPrimaria125=expressaoPrimaria();

                    state._fsp--;

                    adaptor.addChild(root_0, expressaoPrimaria125.getTree());


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaArvore.g:262:4: SUBTRACAO ^ expressaoUnaria
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    SUBTRACAO126=(CommonTree)match(input,SUBTRACAO,FOLLOW_SUBTRACAO_in_expressaoUnaria1456); 
                    SUBTRACAO126_tree = (CommonTree)adaptor.dupNode(SUBTRACAO126);


                    root_0 = (CommonTree)adaptor.becomeRoot(SUBTRACAO126_tree, root_0);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expressaoUnaria_in_expressaoUnaria1459);
                    expressaoUnaria127=expressaoUnaria();

                    state._fsp--;

                    adaptor.addChild(root_0, expressaoUnaria127.getTree());


                    }
                    break;
                case 3 :
                    // fontes/g/CanecaArvore.g:263:4: NEGACAO ^ expressaoUnaria
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    NEGACAO128=(CommonTree)match(input,NEGACAO,FOLLOW_NEGACAO_in_expressaoUnaria1464); 
                    NEGACAO128_tree = (CommonTree)adaptor.dupNode(NEGACAO128);


                    root_0 = (CommonTree)adaptor.becomeRoot(NEGACAO128_tree, root_0);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expressaoUnaria_in_expressaoUnaria1467);
                    expressaoUnaria129=expressaoUnaria();

                    state._fsp--;

                    adaptor.addChild(root_0, expressaoUnaria129.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressaoUnaria"


    public static class expressaoPrimaria_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressaoPrimaria"
    // fontes/g/CanecaArvore.g:266:1: expressaoPrimaria : ( PARENTESE_ESQUERDO expressao PARENTESE_DIREITO -> ^( expressao ) | VALOR_BOOLEANO | VALOR_NULO | CONSTANTE_INTEIRA | CONSTANTE_REAL | LITERAL_CARACTERE | LITERAL_TEXTO | comando );
    public final CanecaArvore.expressaoPrimaria_return expressaoPrimaria() throws RecognitionException {
        CanecaArvore.expressaoPrimaria_return retval = new CanecaArvore.expressaoPrimaria_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PARENTESE_ESQUERDO130=null;
        CommonTree PARENTESE_DIREITO132=null;
        CommonTree VALOR_BOOLEANO133=null;
        CommonTree VALOR_NULO134=null;
        CommonTree CONSTANTE_INTEIRA135=null;
        CommonTree CONSTANTE_REAL136=null;
        CommonTree LITERAL_CARACTERE137=null;
        CommonTree LITERAL_TEXTO138=null;
        CanecaArvore.expressao_return expressao131 =null;

        CanecaArvore.comando_return comando139 =null;


        CommonTree PARENTESE_ESQUERDO130_tree=null;
        CommonTree PARENTESE_DIREITO132_tree=null;
        CommonTree VALOR_BOOLEANO133_tree=null;
        CommonTree VALOR_NULO134_tree=null;
        CommonTree CONSTANTE_INTEIRA135_tree=null;
        CommonTree CONSTANTE_REAL136_tree=null;
        CommonTree LITERAL_CARACTERE137_tree=null;
        CommonTree LITERAL_TEXTO138_tree=null;
        RewriteRuleNodeStream stream_PARENTESE_ESQUERDO=new RewriteRuleNodeStream(adaptor,"token PARENTESE_ESQUERDO");
        RewriteRuleNodeStream stream_PARENTESE_DIREITO=new RewriteRuleNodeStream(adaptor,"token PARENTESE_DIREITO");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // fontes/g/CanecaArvore.g:267:2: ( PARENTESE_ESQUERDO expressao PARENTESE_DIREITO -> ^( expressao ) | VALOR_BOOLEANO | VALOR_NULO | CONSTANTE_INTEIRA | CONSTANTE_REAL | LITERAL_CARACTERE | LITERAL_TEXTO | comando )
            int alt31=8;
            switch ( input.LA(1) ) {
            case PARENTESE_ESQUERDO:
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
            case ESSA:
            case ESSE:
            case IDENTIFICADOR:
            case NOVA:
            case NOVO:
                {
                alt31=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // fontes/g/CanecaArvore.g:267:4: PARENTESE_ESQUERDO expressao PARENTESE_DIREITO
                    {
                    _last = (CommonTree)input.LT(1);
                    PARENTESE_ESQUERDO130=(CommonTree)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_expressaoPrimaria1478);  
                    stream_PARENTESE_ESQUERDO.add(PARENTESE_ESQUERDO130);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expressao_in_expressaoPrimaria1480);
                    expressao131=expressao();

                    state._fsp--;

                    stream_expressao.add(expressao131.getTree());

                    _last = (CommonTree)input.LT(1);
                    PARENTESE_DIREITO132=(CommonTree)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_expressaoPrimaria1482);  
                    stream_PARENTESE_DIREITO.add(PARENTESE_DIREITO132);


                    // AST REWRITE
                    // elements: expressao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 267:51: -> ^( expressao )
                    {
                        // fontes/g/CanecaArvore.g:267:54: ^( expressao )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_expressao.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaArvore.g:268:4: VALOR_BOOLEANO
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    VALOR_BOOLEANO133=(CommonTree)match(input,VALOR_BOOLEANO,FOLLOW_VALOR_BOOLEANO_in_expressaoPrimaria1493); 
                    VALOR_BOOLEANO133_tree = (CommonTree)adaptor.dupNode(VALOR_BOOLEANO133);


                    adaptor.addChild(root_0, VALOR_BOOLEANO133_tree);


                    }
                    break;
                case 3 :
                    // fontes/g/CanecaArvore.g:269:4: VALOR_NULO
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    VALOR_NULO134=(CommonTree)match(input,VALOR_NULO,FOLLOW_VALOR_NULO_in_expressaoPrimaria1498); 
                    VALOR_NULO134_tree = (CommonTree)adaptor.dupNode(VALOR_NULO134);


                    adaptor.addChild(root_0, VALOR_NULO134_tree);


                    }
                    break;
                case 4 :
                    // fontes/g/CanecaArvore.g:270:4: CONSTANTE_INTEIRA
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CONSTANTE_INTEIRA135=(CommonTree)match(input,CONSTANTE_INTEIRA,FOLLOW_CONSTANTE_INTEIRA_in_expressaoPrimaria1503); 
                    CONSTANTE_INTEIRA135_tree = (CommonTree)adaptor.dupNode(CONSTANTE_INTEIRA135);


                    adaptor.addChild(root_0, CONSTANTE_INTEIRA135_tree);


                    }
                    break;
                case 5 :
                    // fontes/g/CanecaArvore.g:271:4: CONSTANTE_REAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CONSTANTE_REAL136=(CommonTree)match(input,CONSTANTE_REAL,FOLLOW_CONSTANTE_REAL_in_expressaoPrimaria1508); 
                    CONSTANTE_REAL136_tree = (CommonTree)adaptor.dupNode(CONSTANTE_REAL136);


                    adaptor.addChild(root_0, CONSTANTE_REAL136_tree);


                    }
                    break;
                case 6 :
                    // fontes/g/CanecaArvore.g:272:4: LITERAL_CARACTERE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    LITERAL_CARACTERE137=(CommonTree)match(input,LITERAL_CARACTERE,FOLLOW_LITERAL_CARACTERE_in_expressaoPrimaria1513); 
                    LITERAL_CARACTERE137_tree = (CommonTree)adaptor.dupNode(LITERAL_CARACTERE137);


                    adaptor.addChild(root_0, LITERAL_CARACTERE137_tree);


                    }
                    break;
                case 7 :
                    // fontes/g/CanecaArvore.g:273:4: LITERAL_TEXTO
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    LITERAL_TEXTO138=(CommonTree)match(input,LITERAL_TEXTO,FOLLOW_LITERAL_TEXTO_in_expressaoPrimaria1518); 
                    LITERAL_TEXTO138_tree = (CommonTree)adaptor.dupNode(LITERAL_TEXTO138);


                    adaptor.addChild(root_0, LITERAL_TEXTO138_tree);


                    }
                    break;
                case 8 :
                    // fontes/g/CanecaArvore.g:274:4: comando
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_comando_in_expressaoPrimaria1523);
                    comando139=comando();

                    state._fsp--;

                    adaptor.addChild(root_0, comando139.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressaoPrimaria"


    public static class comando_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comando"
    // fontes/g/CanecaArvore.g:277:1: comando : seletor ( chamada )* -> ^( COMANDO_ seletor ( chamada )* ) ;
    public final CanecaArvore.comando_return comando() throws RecognitionException {
        CanecaArvore.comando_return retval = new CanecaArvore.comando_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CanecaArvore.seletor_return seletor140 =null;

        CanecaArvore.chamada_return chamada141 =null;


        RewriteRuleSubtreeStream stream_chamada=new RewriteRuleSubtreeStream(adaptor,"rule chamada");
        RewriteRuleSubtreeStream stream_seletor=new RewriteRuleSubtreeStream(adaptor,"rule seletor");
        try {
            // fontes/g/CanecaArvore.g:278:2: ( seletor ( chamada )* -> ^( COMANDO_ seletor ( chamada )* ) )
            // fontes/g/CanecaArvore.g:278:4: seletor ( chamada )*
            {
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_seletor_in_comando1534);
            seletor140=seletor();

            state._fsp--;

            stream_seletor.add(seletor140.getTree());

            // fontes/g/CanecaArvore.g:278:12: ( chamada )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0 >= CHAMADA_DE_CLASSE && LA32_0 <= CHAMADA_DE_OBJETO)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // fontes/g/CanecaArvore.g:278:13: chamada
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_chamada_in_comando1537);
            	    chamada141=chamada();

            	    state._fsp--;

            	    stream_chamada.add(chamada141.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            // AST REWRITE
            // elements: chamada, seletor
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 278:23: -> ^( COMANDO_ seletor ( chamada )* )
            {
                // fontes/g/CanecaArvore.g:278:26: ^( COMANDO_ seletor ( chamada )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COMANDO_, "COMANDO_")
                , root_1);

                adaptor.addChild(root_1, stream_seletor.nextTree());

                // fontes/g/CanecaArvore.g:278:45: ( chamada )*
                while ( stream_chamada.hasNext() ) {
                    adaptor.addChild(root_1, stream_chamada.nextTree());

                }
                stream_chamada.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "comando"


    public static class seletor_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "seletor"
    // fontes/g/CanecaArvore.g:281:1: seletor : ( ESSE -> ^( SELECAO_ ESSE ) | ESSA -> ^( SELECAO_ ESSA ) | instanciacao -> ^( SELECAO_ instanciacao ) | IDENTIFICADOR ( listaDeParametros )? -> ^( SELECAO_ IDENTIFICADOR ( listaDeParametros )? ) );
    public final CanecaArvore.seletor_return seletor() throws RecognitionException {
        CanecaArvore.seletor_return retval = new CanecaArvore.seletor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ESSE142=null;
        CommonTree ESSA143=null;
        CommonTree IDENTIFICADOR145=null;
        CanecaArvore.instanciacao_return instanciacao144 =null;

        CanecaArvore.listaDeParametros_return listaDeParametros146 =null;


        CommonTree ESSE142_tree=null;
        CommonTree ESSA143_tree=null;
        CommonTree IDENTIFICADOR145_tree=null;
        RewriteRuleNodeStream stream_ESSE=new RewriteRuleNodeStream(adaptor,"token ESSE");
        RewriteRuleNodeStream stream_ESSA=new RewriteRuleNodeStream(adaptor,"token ESSA");
        RewriteRuleNodeStream stream_IDENTIFICADOR=new RewriteRuleNodeStream(adaptor,"token IDENTIFICADOR");
        RewriteRuleSubtreeStream stream_listaDeParametros=new RewriteRuleSubtreeStream(adaptor,"rule listaDeParametros");
        RewriteRuleSubtreeStream stream_instanciacao=new RewriteRuleSubtreeStream(adaptor,"rule instanciacao");
        try {
            // fontes/g/CanecaArvore.g:282:2: ( ESSE -> ^( SELECAO_ ESSE ) | ESSA -> ^( SELECAO_ ESSA ) | instanciacao -> ^( SELECAO_ instanciacao ) | IDENTIFICADOR ( listaDeParametros )? -> ^( SELECAO_ IDENTIFICADOR ( listaDeParametros )? ) )
            int alt34=4;
            switch ( input.LA(1) ) {
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
            case NOVA:
            case NOVO:
                {
                alt34=3;
                }
                break;
            case IDENTIFICADOR:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }

            switch (alt34) {
                case 1 :
                    // fontes/g/CanecaArvore.g:282:4: ESSE
                    {
                    _last = (CommonTree)input.LT(1);
                    ESSE142=(CommonTree)match(input,ESSE,FOLLOW_ESSE_in_seletor1563);  
                    stream_ESSE.add(ESSE142);


                    // AST REWRITE
                    // elements: ESSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 282:9: -> ^( SELECAO_ ESSE )
                    {
                        // fontes/g/CanecaArvore.g:282:12: ^( SELECAO_ ESSE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(SELECAO_, "SELECAO_")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ESSE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaArvore.g:283:4: ESSA
                    {
                    _last = (CommonTree)input.LT(1);
                    ESSA143=(CommonTree)match(input,ESSA,FOLLOW_ESSA_in_seletor1576);  
                    stream_ESSA.add(ESSA143);


                    // AST REWRITE
                    // elements: ESSA
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 283:9: -> ^( SELECAO_ ESSA )
                    {
                        // fontes/g/CanecaArvore.g:283:12: ^( SELECAO_ ESSA )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(SELECAO_, "SELECAO_")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ESSA.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaArvore.g:284:4: instanciacao
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_instanciacao_in_seletor1589);
                    instanciacao144=instanciacao();

                    state._fsp--;

                    stream_instanciacao.add(instanciacao144.getTree());

                    // AST REWRITE
                    // elements: instanciacao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 284:17: -> ^( SELECAO_ instanciacao )
                    {
                        // fontes/g/CanecaArvore.g:284:20: ^( SELECAO_ instanciacao )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(SELECAO_, "SELECAO_")
                        , root_1);

                        adaptor.addChild(root_1, stream_instanciacao.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaArvore.g:285:4: IDENTIFICADOR ( listaDeParametros )?
                    {
                    _last = (CommonTree)input.LT(1);
                    IDENTIFICADOR145=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_seletor1602);  
                    stream_IDENTIFICADOR.add(IDENTIFICADOR145);


                    // fontes/g/CanecaArvore.g:285:18: ( listaDeParametros )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==PARENTESE_ESQUERDO) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // fontes/g/CanecaArvore.g:285:19: listaDeParametros
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_listaDeParametros_in_seletor1605);
                            listaDeParametros146=listaDeParametros();

                            state._fsp--;

                            stream_listaDeParametros.add(listaDeParametros146.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: IDENTIFICADOR, listaDeParametros
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 285:39: -> ^( SELECAO_ IDENTIFICADOR ( listaDeParametros )? )
                    {
                        // fontes/g/CanecaArvore.g:285:42: ^( SELECAO_ IDENTIFICADOR ( listaDeParametros )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(SELECAO_, "SELECAO_")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENTIFICADOR.nextNode()
                        );

                        // fontes/g/CanecaArvore.g:285:67: ( listaDeParametros )?
                        if ( stream_listaDeParametros.hasNext() ) {
                            adaptor.addChild(root_1, stream_listaDeParametros.nextTree());

                        }
                        stream_listaDeParametros.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "seletor"


    public static class chamada_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chamada"
    // fontes/g/CanecaArvore.g:288:1: chamada : ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) ^ IDENTIFICADOR ( listaDeParametros )? ;
    public final CanecaArvore.chamada_return chamada() throws RecognitionException {
        CanecaArvore.chamada_return retval = new CanecaArvore.chamada_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set147=null;
        CommonTree IDENTIFICADOR148=null;
        CanecaArvore.listaDeParametros_return listaDeParametros149 =null;


        CommonTree set147_tree=null;
        CommonTree IDENTIFICADOR148_tree=null;

        try {
            // fontes/g/CanecaArvore.g:289:2: ( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) ^ IDENTIFICADOR ( listaDeParametros )? )
            // fontes/g/CanecaArvore.g:289:4: ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) ^ IDENTIFICADOR ( listaDeParametros )?
            {
            root_0 = (CommonTree)adaptor.nil();


            set147=(CommonTree)input.LT(1);

            if ( (input.LA(1) >= CHAMADA_DE_CLASSE && input.LA(1) <= CHAMADA_DE_OBJETO) ) {
                input.consume();
                set147_tree = (CommonTree)adaptor.dupNode(set147);


                root_0 = (CommonTree)adaptor.becomeRoot(set147_tree, root_0);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            _last = (CommonTree)input.LT(1);
            IDENTIFICADOR148=(CommonTree)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_chamada1640); 
            IDENTIFICADOR148_tree = (CommonTree)adaptor.dupNode(IDENTIFICADOR148);


            adaptor.addChild(root_0, IDENTIFICADOR148_tree);


            // fontes/g/CanecaArvore.g:289:59: ( listaDeParametros )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==PARENTESE_ESQUERDO) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // fontes/g/CanecaArvore.g:289:60: listaDeParametros
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_listaDeParametros_in_chamada1643);
                    listaDeParametros149=listaDeParametros();

                    state._fsp--;

                    adaptor.addChild(root_0, listaDeParametros149.getTree());


                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "chamada"


    public static class instanciacao_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instanciacao"
    // fontes/g/CanecaArvore.g:292:1: instanciacao : ( NOVO | NOVA ) tipo listaDeParametros -> ^( INSTANCIACAO_ tipo listaDeParametros ) ;
    public final CanecaArvore.instanciacao_return instanciacao() throws RecognitionException {
        CanecaArvore.instanciacao_return retval = new CanecaArvore.instanciacao_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NOVO150=null;
        CommonTree NOVA151=null;
        CanecaArvore.tipo_return tipo152 =null;

        CanecaArvore.listaDeParametros_return listaDeParametros153 =null;


        CommonTree NOVO150_tree=null;
        CommonTree NOVA151_tree=null;
        RewriteRuleNodeStream stream_NOVO=new RewriteRuleNodeStream(adaptor,"token NOVO");
        RewriteRuleNodeStream stream_NOVA=new RewriteRuleNodeStream(adaptor,"token NOVA");
        RewriteRuleSubtreeStream stream_listaDeParametros=new RewriteRuleSubtreeStream(adaptor,"rule listaDeParametros");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        try {
            // fontes/g/CanecaArvore.g:293:2: ( ( NOVO | NOVA ) tipo listaDeParametros -> ^( INSTANCIACAO_ tipo listaDeParametros ) )
            // fontes/g/CanecaArvore.g:293:4: ( NOVO | NOVA ) tipo listaDeParametros
            {
            // fontes/g/CanecaArvore.g:293:4: ( NOVO | NOVA )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==NOVO) ) {
                alt36=1;
            }
            else if ( (LA36_0==NOVA) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // fontes/g/CanecaArvore.g:293:5: NOVO
                    {
                    _last = (CommonTree)input.LT(1);
                    NOVO150=(CommonTree)match(input,NOVO,FOLLOW_NOVO_in_instanciacao1657);  
                    stream_NOVO.add(NOVO150);


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaArvore.g:293:12: NOVA
                    {
                    _last = (CommonTree)input.LT(1);
                    NOVA151=(CommonTree)match(input,NOVA,FOLLOW_NOVA_in_instanciacao1661);  
                    stream_NOVA.add(NOVA151);


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_tipo_in_instanciacao1664);
            tipo152=tipo();

            state._fsp--;

            stream_tipo.add(tipo152.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_listaDeParametros_in_instanciacao1666);
            listaDeParametros153=listaDeParametros();

            state._fsp--;

            stream_listaDeParametros.add(listaDeParametros153.getTree());

            // AST REWRITE
            // elements: listaDeParametros, tipo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 293:41: -> ^( INSTANCIACAO_ tipo listaDeParametros )
            {
                // fontes/g/CanecaArvore.g:293:44: ^( INSTANCIACAO_ tipo listaDeParametros )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(INSTANCIACAO_, "INSTANCIACAO_")
                , root_1);

                adaptor.addChild(root_1, stream_tipo.nextTree());

                adaptor.addChild(root_1, stream_listaDeParametros.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instanciacao"


    public static class destruicao_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "destruicao"
    // fontes/g/CanecaArvore.g:296:1: destruicao : DESTRUA expressao -> ^( DESTRUICAO_ expressao ) ;
    public final CanecaArvore.destruicao_return destruicao() throws RecognitionException {
        CanecaArvore.destruicao_return retval = new CanecaArvore.destruicao_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DESTRUA154=null;
        CanecaArvore.expressao_return expressao155 =null;


        CommonTree DESTRUA154_tree=null;
        RewriteRuleNodeStream stream_DESTRUA=new RewriteRuleNodeStream(adaptor,"token DESTRUA");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // fontes/g/CanecaArvore.g:297:2: ( DESTRUA expressao -> ^( DESTRUICAO_ expressao ) )
            // fontes/g/CanecaArvore.g:297:4: DESTRUA expressao
            {
            _last = (CommonTree)input.LT(1);
            DESTRUA154=(CommonTree)match(input,DESTRUA,FOLLOW_DESTRUA_in_destruicao1687);  
            stream_DESTRUA.add(DESTRUA154);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expressao_in_destruicao1689);
            expressao155=expressao();

            state._fsp--;

            stream_expressao.add(expressao155.getTree());

            // AST REWRITE
            // elements: expressao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 297:22: -> ^( DESTRUICAO_ expressao )
            {
                // fontes/g/CanecaArvore.g:297:25: ^( DESTRUICAO_ expressao )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DESTRUICAO_, "DESTRUICAO_")
                , root_1);

                adaptor.addChild(root_1, stream_expressao.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "destruicao"


    public static class retorno_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "retorno"
    // fontes/g/CanecaArvore.g:300:1: retorno : RETORNE expressao -> ^( RETORNO_ expressao ) ;
    public final CanecaArvore.retorno_return retorno() throws RecognitionException {
        CanecaArvore.retorno_return retval = new CanecaArvore.retorno_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RETORNE156=null;
        CanecaArvore.expressao_return expressao157 =null;


        CommonTree RETORNE156_tree=null;
        RewriteRuleNodeStream stream_RETORNE=new RewriteRuleNodeStream(adaptor,"token RETORNE");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // fontes/g/CanecaArvore.g:301:2: ( RETORNE expressao -> ^( RETORNO_ expressao ) )
            // fontes/g/CanecaArvore.g:301:4: RETORNE expressao
            {
            _last = (CommonTree)input.LT(1);
            RETORNE156=(CommonTree)match(input,RETORNE,FOLLOW_RETORNE_in_retorno1709);  
            stream_RETORNE.add(RETORNE156);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expressao_in_retorno1711);
            expressao157=expressao();

            state._fsp--;

            stream_expressao.add(expressao157.getTree());

            // AST REWRITE
            // elements: expressao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 301:22: -> ^( RETORNO_ expressao )
            {
                // fontes/g/CanecaArvore.g:301:25: ^( RETORNO_ expressao )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RETORNO_, "RETORNO_")
                , root_1);

                adaptor.addChild(root_1, stream_expressao.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "retorno"


    public static class se_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "se"
    // fontes/g/CanecaArvore.g:304:1: se : SE PARENTESE_ESQUERDO expressao PARENTESE_DIREITO blocoDeInstrucoes ( SENAO blocoDeInstrucoes )? -> ^( SE_ expressao blocoDeInstrucoes ( blocoDeInstrucoes )? ) ;
    public final CanecaArvore.se_return se() throws RecognitionException {
        CanecaArvore.se_return retval = new CanecaArvore.se_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SE158=null;
        CommonTree PARENTESE_ESQUERDO159=null;
        CommonTree PARENTESE_DIREITO161=null;
        CommonTree SENAO163=null;
        CanecaArvore.expressao_return expressao160 =null;

        CanecaArvore.blocoDeInstrucoes_return blocoDeInstrucoes162 =null;

        CanecaArvore.blocoDeInstrucoes_return blocoDeInstrucoes164 =null;


        CommonTree SE158_tree=null;
        CommonTree PARENTESE_ESQUERDO159_tree=null;
        CommonTree PARENTESE_DIREITO161_tree=null;
        CommonTree SENAO163_tree=null;
        RewriteRuleNodeStream stream_PARENTESE_ESQUERDO=new RewriteRuleNodeStream(adaptor,"token PARENTESE_ESQUERDO");
        RewriteRuleNodeStream stream_SE=new RewriteRuleNodeStream(adaptor,"token SE");
        RewriteRuleNodeStream stream_SENAO=new RewriteRuleNodeStream(adaptor,"token SENAO");
        RewriteRuleNodeStream stream_PARENTESE_DIREITO=new RewriteRuleNodeStream(adaptor,"token PARENTESE_DIREITO");
        RewriteRuleSubtreeStream stream_blocoDeInstrucoes=new RewriteRuleSubtreeStream(adaptor,"rule blocoDeInstrucoes");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // fontes/g/CanecaArvore.g:305:2: ( SE PARENTESE_ESQUERDO expressao PARENTESE_DIREITO blocoDeInstrucoes ( SENAO blocoDeInstrucoes )? -> ^( SE_ expressao blocoDeInstrucoes ( blocoDeInstrucoes )? ) )
            // fontes/g/CanecaArvore.g:305:4: SE PARENTESE_ESQUERDO expressao PARENTESE_DIREITO blocoDeInstrucoes ( SENAO blocoDeInstrucoes )?
            {
            _last = (CommonTree)input.LT(1);
            SE158=(CommonTree)match(input,SE,FOLLOW_SE_in_se1730);  
            stream_SE.add(SE158);


            _last = (CommonTree)input.LT(1);
            PARENTESE_ESQUERDO159=(CommonTree)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_se1732);  
            stream_PARENTESE_ESQUERDO.add(PARENTESE_ESQUERDO159);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expressao_in_se1734);
            expressao160=expressao();

            state._fsp--;

            stream_expressao.add(expressao160.getTree());

            _last = (CommonTree)input.LT(1);
            PARENTESE_DIREITO161=(CommonTree)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_se1736);  
            stream_PARENTESE_DIREITO.add(PARENTESE_DIREITO161);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_blocoDeInstrucoes_in_se1738);
            blocoDeInstrucoes162=blocoDeInstrucoes();

            state._fsp--;

            stream_blocoDeInstrucoes.add(blocoDeInstrucoes162.getTree());

            // fontes/g/CanecaArvore.g:305:72: ( SENAO blocoDeInstrucoes )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==SENAO) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // fontes/g/CanecaArvore.g:305:73: SENAO blocoDeInstrucoes
                    {
                    _last = (CommonTree)input.LT(1);
                    SENAO163=(CommonTree)match(input,SENAO,FOLLOW_SENAO_in_se1741);  
                    stream_SENAO.add(SENAO163);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_blocoDeInstrucoes_in_se1743);
                    blocoDeInstrucoes164=blocoDeInstrucoes();

                    state._fsp--;

                    stream_blocoDeInstrucoes.add(blocoDeInstrucoes164.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: expressao, blocoDeInstrucoes, blocoDeInstrucoes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 305:99: -> ^( SE_ expressao blocoDeInstrucoes ( blocoDeInstrucoes )? )
            {
                // fontes/g/CanecaArvore.g:305:102: ^( SE_ expressao blocoDeInstrucoes ( blocoDeInstrucoes )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SE_, "SE_")
                , root_1);

                adaptor.addChild(root_1, stream_expressao.nextTree());

                adaptor.addChild(root_1, stream_blocoDeInstrucoes.nextTree());

                // fontes/g/CanecaArvore.g:305:136: ( blocoDeInstrucoes )?
                if ( stream_blocoDeInstrucoes.hasNext() ) {
                    adaptor.addChild(root_1, stream_blocoDeInstrucoes.nextTree());

                }
                stream_blocoDeInstrucoes.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "se"


    public static class para_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "para"
    // fontes/g/CanecaArvore.g:308:1: para : PARA PARENTESE_ESQUERDO expressao TERMINADOR expressao TERMINADOR expressao PARENTESE_DIREITO blocoDeInstrucoes -> ^( PARA_ expressao expressao expressao ) ;
    public final CanecaArvore.para_return para() throws RecognitionException {
        CanecaArvore.para_return retval = new CanecaArvore.para_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PARA165=null;
        CommonTree PARENTESE_ESQUERDO166=null;
        CommonTree TERMINADOR168=null;
        CommonTree TERMINADOR170=null;
        CommonTree PARENTESE_DIREITO172=null;
        CanecaArvore.expressao_return expressao167 =null;

        CanecaArvore.expressao_return expressao169 =null;

        CanecaArvore.expressao_return expressao171 =null;

        CanecaArvore.blocoDeInstrucoes_return blocoDeInstrucoes173 =null;


        CommonTree PARA165_tree=null;
        CommonTree PARENTESE_ESQUERDO166_tree=null;
        CommonTree TERMINADOR168_tree=null;
        CommonTree TERMINADOR170_tree=null;
        CommonTree PARENTESE_DIREITO172_tree=null;
        RewriteRuleNodeStream stream_PARENTESE_ESQUERDO=new RewriteRuleNodeStream(adaptor,"token PARENTESE_ESQUERDO");
        RewriteRuleNodeStream stream_TERMINADOR=new RewriteRuleNodeStream(adaptor,"token TERMINADOR");
        RewriteRuleNodeStream stream_PARENTESE_DIREITO=new RewriteRuleNodeStream(adaptor,"token PARENTESE_DIREITO");
        RewriteRuleNodeStream stream_PARA=new RewriteRuleNodeStream(adaptor,"token PARA");
        RewriteRuleSubtreeStream stream_blocoDeInstrucoes=new RewriteRuleSubtreeStream(adaptor,"rule blocoDeInstrucoes");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // fontes/g/CanecaArvore.g:309:2: ( PARA PARENTESE_ESQUERDO expressao TERMINADOR expressao TERMINADOR expressao PARENTESE_DIREITO blocoDeInstrucoes -> ^( PARA_ expressao expressao expressao ) )
            // fontes/g/CanecaArvore.g:309:4: PARA PARENTESE_ESQUERDO expressao TERMINADOR expressao TERMINADOR expressao PARENTESE_DIREITO blocoDeInstrucoes
            {
            _last = (CommonTree)input.LT(1);
            PARA165=(CommonTree)match(input,PARA,FOLLOW_PARA_in_para1769);  
            stream_PARA.add(PARA165);


            _last = (CommonTree)input.LT(1);
            PARENTESE_ESQUERDO166=(CommonTree)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_para1771);  
            stream_PARENTESE_ESQUERDO.add(PARENTESE_ESQUERDO166);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expressao_in_para1773);
            expressao167=expressao();

            state._fsp--;

            stream_expressao.add(expressao167.getTree());

            _last = (CommonTree)input.LT(1);
            TERMINADOR168=(CommonTree)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_para1775);  
            stream_TERMINADOR.add(TERMINADOR168);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expressao_in_para1777);
            expressao169=expressao();

            state._fsp--;

            stream_expressao.add(expressao169.getTree());

            _last = (CommonTree)input.LT(1);
            TERMINADOR170=(CommonTree)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_para1779);  
            stream_TERMINADOR.add(TERMINADOR170);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expressao_in_para1781);
            expressao171=expressao();

            state._fsp--;

            stream_expressao.add(expressao171.getTree());

            _last = (CommonTree)input.LT(1);
            PARENTESE_DIREITO172=(CommonTree)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_para1783);  
            stream_PARENTESE_DIREITO.add(PARENTESE_DIREITO172);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_blocoDeInstrucoes_in_para1785);
            blocoDeInstrucoes173=blocoDeInstrucoes();

            state._fsp--;

            stream_blocoDeInstrucoes.add(blocoDeInstrucoes173.getTree());

            // AST REWRITE
            // elements: expressao, expressao, expressao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 309:116: -> ^( PARA_ expressao expressao expressao )
            {
                // fontes/g/CanecaArvore.g:309:119: ^( PARA_ expressao expressao expressao )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PARA_, "PARA_")
                , root_1);

                adaptor.addChild(root_1, stream_expressao.nextTree());

                adaptor.addChild(root_1, stream_expressao.nextTree());

                adaptor.addChild(root_1, stream_expressao.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "para"


    public static class repita_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "repita"
    // fontes/g/CanecaArvore.g:312:1: repita : REPITA PARENTESE_ESQUERDO declaracao PARENTESE_DIREITO blocoDeInstrucoes -> ^( REPITA_ declaracao ) ;
    public final CanecaArvore.repita_return repita() throws RecognitionException {
        CanecaArvore.repita_return retval = new CanecaArvore.repita_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree REPITA174=null;
        CommonTree PARENTESE_ESQUERDO175=null;
        CommonTree PARENTESE_DIREITO177=null;
        CanecaArvore.declaracao_return declaracao176 =null;

        CanecaArvore.blocoDeInstrucoes_return blocoDeInstrucoes178 =null;


        CommonTree REPITA174_tree=null;
        CommonTree PARENTESE_ESQUERDO175_tree=null;
        CommonTree PARENTESE_DIREITO177_tree=null;
        RewriteRuleNodeStream stream_PARENTESE_ESQUERDO=new RewriteRuleNodeStream(adaptor,"token PARENTESE_ESQUERDO");
        RewriteRuleNodeStream stream_REPITA=new RewriteRuleNodeStream(adaptor,"token REPITA");
        RewriteRuleNodeStream stream_PARENTESE_DIREITO=new RewriteRuleNodeStream(adaptor,"token PARENTESE_DIREITO");
        RewriteRuleSubtreeStream stream_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule declaracao");
        RewriteRuleSubtreeStream stream_blocoDeInstrucoes=new RewriteRuleSubtreeStream(adaptor,"rule blocoDeInstrucoes");
        try {
            // fontes/g/CanecaArvore.g:313:2: ( REPITA PARENTESE_ESQUERDO declaracao PARENTESE_DIREITO blocoDeInstrucoes -> ^( REPITA_ declaracao ) )
            // fontes/g/CanecaArvore.g:313:4: REPITA PARENTESE_ESQUERDO declaracao PARENTESE_DIREITO blocoDeInstrucoes
            {
            _last = (CommonTree)input.LT(1);
            REPITA174=(CommonTree)match(input,REPITA,FOLLOW_REPITA_in_repita1808);  
            stream_REPITA.add(REPITA174);


            _last = (CommonTree)input.LT(1);
            PARENTESE_ESQUERDO175=(CommonTree)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_repita1810);  
            stream_PARENTESE_ESQUERDO.add(PARENTESE_ESQUERDO175);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_declaracao_in_repita1812);
            declaracao176=declaracao();

            state._fsp--;

            stream_declaracao.add(declaracao176.getTree());

            _last = (CommonTree)input.LT(1);
            PARENTESE_DIREITO177=(CommonTree)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_repita1814);  
            stream_PARENTESE_DIREITO.add(PARENTESE_DIREITO177);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_blocoDeInstrucoes_in_repita1816);
            blocoDeInstrucoes178=blocoDeInstrucoes();

            state._fsp--;

            stream_blocoDeInstrucoes.add(blocoDeInstrucoes178.getTree());

            // AST REWRITE
            // elements: declaracao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 313:77: -> ^( REPITA_ declaracao )
            {
                // fontes/g/CanecaArvore.g:313:80: ^( REPITA_ declaracao )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(REPITA_, "REPITA_")
                , root_1);

                adaptor.addChild(root_1, stream_declaracao.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "repita"


    public static class enquanto_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enquanto"
    // fontes/g/CanecaArvore.g:316:1: enquanto : ENQUANTO PARENTESE_ESQUERDO expressao PARENTESE_DIREITO blocoDeInstrucoes -> ^( ENQUANTO_ expressao ) ;
    public final CanecaArvore.enquanto_return enquanto() throws RecognitionException {
        CanecaArvore.enquanto_return retval = new CanecaArvore.enquanto_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ENQUANTO179=null;
        CommonTree PARENTESE_ESQUERDO180=null;
        CommonTree PARENTESE_DIREITO182=null;
        CanecaArvore.expressao_return expressao181 =null;

        CanecaArvore.blocoDeInstrucoes_return blocoDeInstrucoes183 =null;


        CommonTree ENQUANTO179_tree=null;
        CommonTree PARENTESE_ESQUERDO180_tree=null;
        CommonTree PARENTESE_DIREITO182_tree=null;
        RewriteRuleNodeStream stream_ENQUANTO=new RewriteRuleNodeStream(adaptor,"token ENQUANTO");
        RewriteRuleNodeStream stream_PARENTESE_ESQUERDO=new RewriteRuleNodeStream(adaptor,"token PARENTESE_ESQUERDO");
        RewriteRuleNodeStream stream_PARENTESE_DIREITO=new RewriteRuleNodeStream(adaptor,"token PARENTESE_DIREITO");
        RewriteRuleSubtreeStream stream_blocoDeInstrucoes=new RewriteRuleSubtreeStream(adaptor,"rule blocoDeInstrucoes");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // fontes/g/CanecaArvore.g:317:2: ( ENQUANTO PARENTESE_ESQUERDO expressao PARENTESE_DIREITO blocoDeInstrucoes -> ^( ENQUANTO_ expressao ) )
            // fontes/g/CanecaArvore.g:317:4: ENQUANTO PARENTESE_ESQUERDO expressao PARENTESE_DIREITO blocoDeInstrucoes
            {
            _last = (CommonTree)input.LT(1);
            ENQUANTO179=(CommonTree)match(input,ENQUANTO,FOLLOW_ENQUANTO_in_enquanto1835);  
            stream_ENQUANTO.add(ENQUANTO179);


            _last = (CommonTree)input.LT(1);
            PARENTESE_ESQUERDO180=(CommonTree)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_enquanto1837);  
            stream_PARENTESE_ESQUERDO.add(PARENTESE_ESQUERDO180);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expressao_in_enquanto1839);
            expressao181=expressao();

            state._fsp--;

            stream_expressao.add(expressao181.getTree());

            _last = (CommonTree)input.LT(1);
            PARENTESE_DIREITO182=(CommonTree)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_enquanto1841);  
            stream_PARENTESE_DIREITO.add(PARENTESE_DIREITO182);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_blocoDeInstrucoes_in_enquanto1843);
            blocoDeInstrucoes183=blocoDeInstrucoes();

            state._fsp--;

            stream_blocoDeInstrucoes.add(blocoDeInstrucoes183.getTree());

            // AST REWRITE
            // elements: expressao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 317:78: -> ^( ENQUANTO_ expressao )
            {
                // fontes/g/CanecaArvore.g:317:81: ^( ENQUANTO_ expressao )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ENQUANTO_, "ENQUANTO_")
                , root_1);

                adaptor.addChild(root_1, stream_expressao.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "enquanto"


    public static class tente_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tente"
    // fontes/g/CanecaArvore.g:320:1: tente : TENTE blocoDeInstrucoes listaDeCapturas -> ^( TENTE_ blocoDeInstrucoes listaDeCapturas ) ;
    public final CanecaArvore.tente_return tente() throws RecognitionException {
        CanecaArvore.tente_return retval = new CanecaArvore.tente_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TENTE184=null;
        CanecaArvore.blocoDeInstrucoes_return blocoDeInstrucoes185 =null;

        CanecaArvore.listaDeCapturas_return listaDeCapturas186 =null;


        CommonTree TENTE184_tree=null;
        RewriteRuleNodeStream stream_TENTE=new RewriteRuleNodeStream(adaptor,"token TENTE");
        RewriteRuleSubtreeStream stream_listaDeCapturas=new RewriteRuleSubtreeStream(adaptor,"rule listaDeCapturas");
        RewriteRuleSubtreeStream stream_blocoDeInstrucoes=new RewriteRuleSubtreeStream(adaptor,"rule blocoDeInstrucoes");
        try {
            // fontes/g/CanecaArvore.g:321:2: ( TENTE blocoDeInstrucoes listaDeCapturas -> ^( TENTE_ blocoDeInstrucoes listaDeCapturas ) )
            // fontes/g/CanecaArvore.g:321:4: TENTE blocoDeInstrucoes listaDeCapturas
            {
            _last = (CommonTree)input.LT(1);
            TENTE184=(CommonTree)match(input,TENTE,FOLLOW_TENTE_in_tente1862);  
            stream_TENTE.add(TENTE184);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_blocoDeInstrucoes_in_tente1864);
            blocoDeInstrucoes185=blocoDeInstrucoes();

            state._fsp--;

            stream_blocoDeInstrucoes.add(blocoDeInstrucoes185.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_listaDeCapturas_in_tente1866);
            listaDeCapturas186=listaDeCapturas();

            state._fsp--;

            stream_listaDeCapturas.add(listaDeCapturas186.getTree());

            // AST REWRITE
            // elements: listaDeCapturas, blocoDeInstrucoes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 321:44: -> ^( TENTE_ blocoDeInstrucoes listaDeCapturas )
            {
                // fontes/g/CanecaArvore.g:321:47: ^( TENTE_ blocoDeInstrucoes listaDeCapturas )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TENTE_, "TENTE_")
                , root_1);

                adaptor.addChild(root_1, stream_blocoDeInstrucoes.nextTree());

                adaptor.addChild(root_1, stream_listaDeCapturas.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tente"


    public static class capture_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "capture"
    // fontes/g/CanecaArvore.g:324:1: capture : CAPTURE PARENTESE_ESQUERDO declaracao PARENTESE_DIREITO blocoDeInstrucoes -> ^( CAPTURE_ declaracao blocoDeInstrucoes ) ;
    public final CanecaArvore.capture_return capture() throws RecognitionException {
        CanecaArvore.capture_return retval = new CanecaArvore.capture_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CAPTURE187=null;
        CommonTree PARENTESE_ESQUERDO188=null;
        CommonTree PARENTESE_DIREITO190=null;
        CanecaArvore.declaracao_return declaracao189 =null;

        CanecaArvore.blocoDeInstrucoes_return blocoDeInstrucoes191 =null;


        CommonTree CAPTURE187_tree=null;
        CommonTree PARENTESE_ESQUERDO188_tree=null;
        CommonTree PARENTESE_DIREITO190_tree=null;
        RewriteRuleNodeStream stream_PARENTESE_ESQUERDO=new RewriteRuleNodeStream(adaptor,"token PARENTESE_ESQUERDO");
        RewriteRuleNodeStream stream_CAPTURE=new RewriteRuleNodeStream(adaptor,"token CAPTURE");
        RewriteRuleNodeStream stream_PARENTESE_DIREITO=new RewriteRuleNodeStream(adaptor,"token PARENTESE_DIREITO");
        RewriteRuleSubtreeStream stream_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule declaracao");
        RewriteRuleSubtreeStream stream_blocoDeInstrucoes=new RewriteRuleSubtreeStream(adaptor,"rule blocoDeInstrucoes");
        try {
            // fontes/g/CanecaArvore.g:325:2: ( CAPTURE PARENTESE_ESQUERDO declaracao PARENTESE_DIREITO blocoDeInstrucoes -> ^( CAPTURE_ declaracao blocoDeInstrucoes ) )
            // fontes/g/CanecaArvore.g:325:4: CAPTURE PARENTESE_ESQUERDO declaracao PARENTESE_DIREITO blocoDeInstrucoes
            {
            _last = (CommonTree)input.LT(1);
            CAPTURE187=(CommonTree)match(input,CAPTURE,FOLLOW_CAPTURE_in_capture1887);  
            stream_CAPTURE.add(CAPTURE187);


            _last = (CommonTree)input.LT(1);
            PARENTESE_ESQUERDO188=(CommonTree)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_capture1889);  
            stream_PARENTESE_ESQUERDO.add(PARENTESE_ESQUERDO188);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_declaracao_in_capture1891);
            declaracao189=declaracao();

            state._fsp--;

            stream_declaracao.add(declaracao189.getTree());

            _last = (CommonTree)input.LT(1);
            PARENTESE_DIREITO190=(CommonTree)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_capture1893);  
            stream_PARENTESE_DIREITO.add(PARENTESE_DIREITO190);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_blocoDeInstrucoes_in_capture1895);
            blocoDeInstrucoes191=blocoDeInstrucoes();

            state._fsp--;

            stream_blocoDeInstrucoes.add(blocoDeInstrucoes191.getTree());

            // AST REWRITE
            // elements: blocoDeInstrucoes, declaracao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 325:78: -> ^( CAPTURE_ declaracao blocoDeInstrucoes )
            {
                // fontes/g/CanecaArvore.g:325:81: ^( CAPTURE_ declaracao blocoDeInstrucoes )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CAPTURE_, "CAPTURE_")
                , root_1);

                adaptor.addChild(root_1, stream_declaracao.nextTree());

                adaptor.addChild(root_1, stream_blocoDeInstrucoes.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "capture"


    public static class lance_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lance"
    // fontes/g/CanecaArvore.g:328:1: lance : LANCE expressao -> ^( LANCE_ expressao ) ;
    public final CanecaArvore.lance_return lance() throws RecognitionException {
        CanecaArvore.lance_return retval = new CanecaArvore.lance_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LANCE192=null;
        CanecaArvore.expressao_return expressao193 =null;


        CommonTree LANCE192_tree=null;
        RewriteRuleNodeStream stream_LANCE=new RewriteRuleNodeStream(adaptor,"token LANCE");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // fontes/g/CanecaArvore.g:329:2: ( LANCE expressao -> ^( LANCE_ expressao ) )
            // fontes/g/CanecaArvore.g:329:4: LANCE expressao
            {
            _last = (CommonTree)input.LT(1);
            LANCE192=(CommonTree)match(input,LANCE,FOLLOW_LANCE_in_lance1916);  
            stream_LANCE.add(LANCE192);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expressao_in_lance1918);
            expressao193=expressao();

            state._fsp--;

            stream_expressao.add(expressao193.getTree());

            // AST REWRITE
            // elements: expressao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 329:20: -> ^( LANCE_ expressao )
            {
                // fontes/g/CanecaArvore.g:329:23: ^( LANCE_ expressao )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(LANCE_, "LANCE_")
                , root_1);

                adaptor.addChild(root_1, stream_expressao.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lance"


    public static class instrucao_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instrucao"
    // fontes/g/CanecaArvore.g:332:1: instrucao : ( ( options {k=2; } : expressao TERMINADOR !| declaracaoComAtribuicaoOpcional TERMINADOR !) | destruicao TERMINADOR !| retorno TERMINADOR !| se | para | repita | enquanto | tente | lance TERMINADOR !);
    public final CanecaArvore.instrucao_return instrucao() throws RecognitionException {
        CanecaArvore.instrucao_return retval = new CanecaArvore.instrucao_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TERMINADOR195=null;
        CommonTree TERMINADOR197=null;
        CommonTree TERMINADOR199=null;
        CommonTree TERMINADOR201=null;
        CommonTree TERMINADOR208=null;
        CanecaArvore.expressao_return expressao194 =null;

        CanecaArvore.declaracaoComAtribuicaoOpcional_return declaracaoComAtribuicaoOpcional196 =null;

        CanecaArvore.destruicao_return destruicao198 =null;

        CanecaArvore.retorno_return retorno200 =null;

        CanecaArvore.se_return se202 =null;

        CanecaArvore.para_return para203 =null;

        CanecaArvore.repita_return repita204 =null;

        CanecaArvore.enquanto_return enquanto205 =null;

        CanecaArvore.tente_return tente206 =null;

        CanecaArvore.lance_return lance207 =null;


        CommonTree TERMINADOR195_tree=null;
        CommonTree TERMINADOR197_tree=null;
        CommonTree TERMINADOR199_tree=null;
        CommonTree TERMINADOR201_tree=null;
        CommonTree TERMINADOR208_tree=null;

        try {
            // fontes/g/CanecaArvore.g:333:2: ( ( options {k=2; } : expressao TERMINADOR !| declaracaoComAtribuicaoOpcional TERMINADOR !) | destruicao TERMINADOR !| retorno TERMINADOR !| se | para | repita | enquanto | tente | lance TERMINADOR !)
            int alt39=9;
            switch ( input.LA(1) ) {
            case CONSTANTE_INTEIRA:
            case CONSTANTE_REAL:
            case ESSA:
            case ESSE:
            case IDENTIFICADOR:
            case LITERAL_CARACTERE:
            case LITERAL_TEXTO:
            case NEGACAO:
            case NOVA:
            case NOVO:
            case PARENTESE_ESQUERDO:
            case SUBTRACAO:
            case VALOR_BOOLEANO:
            case VALOR_NULO:
                {
                alt39=1;
                }
                break;
            case DESTRUA:
                {
                alt39=2;
                }
                break;
            case RETORNE:
                {
                alt39=3;
                }
                break;
            case SE:
                {
                alt39=4;
                }
                break;
            case PARA:
                {
                alt39=5;
                }
                break;
            case REPITA:
                {
                alt39=6;
                }
                break;
            case ENQUANTO:
                {
                alt39=7;
                }
                break;
            case TENTE:
                {
                alt39=8;
                }
                break;
            case LANCE:
                {
                alt39=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }

            switch (alt39) {
                case 1 :
                    // fontes/g/CanecaArvore.g:334:2: ( options {k=2; } : expressao TERMINADOR !| declaracaoComAtribuicaoOpcional TERMINADOR !)
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // fontes/g/CanecaArvore.g:334:2: ( options {k=2; } : expressao TERMINADOR !| declaracaoComAtribuicaoOpcional TERMINADOR !)
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( ((LA38_0 >= CONSTANTE_INTEIRA && LA38_0 <= CONSTANTE_REAL)||(LA38_0 >= ESSA && LA38_0 <= ESSE)||(LA38_0 >= LITERAL_CARACTERE && LA38_0 <= LITERAL_TEXTO)||(LA38_0 >= NEGACAO && LA38_0 <= NOVO)||LA38_0==PARENTESE_ESQUERDO||LA38_0==SUBTRACAO||(LA38_0 >= VALOR_BOOLEANO && LA38_0 <= VALOR_NULO)) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==IDENTIFICADOR) ) {
                        int LA38_12 = input.LA(2);

                        if ( (LA38_12==ATRIBUIDOR||(LA38_12 >= CHAMADA_DE_CLASSE && LA38_12 <= CHAMADA_DE_OBJETO)||LA38_12==DIFERENTE||(LA38_12 >= DIVISAO && LA38_12 <= E)||LA38_12==IGUAL||(LA38_12 >= MAIOR && LA38_12 <= MENOR_IGUAL)||LA38_12==MULTIPLICACAO||LA38_12==OU||LA38_12==PARENTESE_ESQUERDO||LA38_12==RESTO_DA_DIVISAO||(LA38_12 >= SOMA && LA38_12 <= SUBTRACAO)||LA38_12==TERMINADOR) ) {
                            alt38=1;
                        }
                        else if ( (LA38_12==COLCHETE_ESQUERDO||LA38_12==IDENTIFICADOR) ) {
                            alt38=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 38, 12, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;

                    }
                    switch (alt38) {
                        case 1 :
                            // fontes/g/CanecaArvore.g:335:5: expressao TERMINADOR !
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_expressao_in_instrucao1954);
                            expressao194=expressao();

                            state._fsp--;

                            adaptor.addChild(root_0, expressao194.getTree());


                            _last = (CommonTree)input.LT(1);
                            TERMINADOR195=(CommonTree)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_instrucao1956); 

                            }
                            break;
                        case 2 :
                            // fontes/g/CanecaArvore.g:336:5: declaracaoComAtribuicaoOpcional TERMINADOR !
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_declaracaoComAtribuicaoOpcional_in_instrucao1963);
                            declaracaoComAtribuicaoOpcional196=declaracaoComAtribuicaoOpcional();

                            state._fsp--;

                            adaptor.addChild(root_0, declaracaoComAtribuicaoOpcional196.getTree());


                            _last = (CommonTree)input.LT(1);
                            TERMINADOR197=(CommonTree)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_instrucao1965); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaArvore.g:338:4: destruicao TERMINADOR !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_destruicao_in_instrucao1974);
                    destruicao198=destruicao();

                    state._fsp--;

                    adaptor.addChild(root_0, destruicao198.getTree());


                    _last = (CommonTree)input.LT(1);
                    TERMINADOR199=(CommonTree)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_instrucao1976); 

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaArvore.g:339:4: retorno TERMINADOR !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_retorno_in_instrucao1982);
                    retorno200=retorno();

                    state._fsp--;

                    adaptor.addChild(root_0, retorno200.getTree());


                    _last = (CommonTree)input.LT(1);
                    TERMINADOR201=(CommonTree)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_instrucao1984); 

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaArvore.g:340:4: se
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_se_in_instrucao1990);
                    se202=se();

                    state._fsp--;

                    adaptor.addChild(root_0, se202.getTree());


                    }
                    break;
                case 5 :
                    // fontes/g/CanecaArvore.g:341:4: para
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_para_in_instrucao1995);
                    para203=para();

                    state._fsp--;

                    adaptor.addChild(root_0, para203.getTree());


                    }
                    break;
                case 6 :
                    // fontes/g/CanecaArvore.g:342:4: repita
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_repita_in_instrucao2000);
                    repita204=repita();

                    state._fsp--;

                    adaptor.addChild(root_0, repita204.getTree());


                    }
                    break;
                case 7 :
                    // fontes/g/CanecaArvore.g:343:4: enquanto
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_enquanto_in_instrucao2005);
                    enquanto205=enquanto();

                    state._fsp--;

                    adaptor.addChild(root_0, enquanto205.getTree());


                    }
                    break;
                case 8 :
                    // fontes/g/CanecaArvore.g:344:4: tente
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_tente_in_instrucao2010);
                    tente206=tente();

                    state._fsp--;

                    adaptor.addChild(root_0, tente206.getTree());


                    }
                    break;
                case 9 :
                    // fontes/g/CanecaArvore.g:345:4: lance TERMINADOR !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_lance_in_instrucao2015);
                    lance207=lance();

                    state._fsp--;

                    adaptor.addChild(root_0, lance207.getTree());


                    _last = (CommonTree)input.LT(1);
                    TERMINADOR208=(CommonTree)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_instrucao2017); 

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instrucao"


    public static class blocoDeInstrucoes_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blocoDeInstrucoes"
    // fontes/g/CanecaArvore.g:348:1: blocoDeInstrucoes : INICIO ( instrucao )* FIM -> ^( INSTRUCOES_ ( instrucao )* ) ;
    public final CanecaArvore.blocoDeInstrucoes_return blocoDeInstrucoes() throws RecognitionException {
        CanecaArvore.blocoDeInstrucoes_return retval = new CanecaArvore.blocoDeInstrucoes_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INICIO209=null;
        CommonTree FIM211=null;
        CanecaArvore.instrucao_return instrucao210 =null;


        CommonTree INICIO209_tree=null;
        CommonTree FIM211_tree=null;
        RewriteRuleNodeStream stream_INICIO=new RewriteRuleNodeStream(adaptor,"token INICIO");
        RewriteRuleNodeStream stream_FIM=new RewriteRuleNodeStream(adaptor,"token FIM");
        RewriteRuleSubtreeStream stream_instrucao=new RewriteRuleSubtreeStream(adaptor,"rule instrucao");
        try {
            // fontes/g/CanecaArvore.g:349:2: ( INICIO ( instrucao )* FIM -> ^( INSTRUCOES_ ( instrucao )* ) )
            // fontes/g/CanecaArvore.g:349:4: INICIO ( instrucao )* FIM
            {
            _last = (CommonTree)input.LT(1);
            INICIO209=(CommonTree)match(input,INICIO,FOLLOW_INICIO_in_blocoDeInstrucoes2029);  
            stream_INICIO.add(INICIO209);


            // fontes/g/CanecaArvore.g:349:11: ( instrucao )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0 >= CONSTANTE_INTEIRA && LA40_0 <= CONSTANTE_REAL)||LA40_0==DESTRUA||LA40_0==ENQUANTO||(LA40_0 >= ESSA && LA40_0 <= ESSE)||LA40_0==IDENTIFICADOR||LA40_0==LANCE||(LA40_0 >= LITERAL_CARACTERE && LA40_0 <= LITERAL_TEXTO)||(LA40_0 >= NEGACAO && LA40_0 <= NOVO)||LA40_0==PARA||LA40_0==PARENTESE_ESQUERDO||LA40_0==REPITA||(LA40_0 >= RETORNE && LA40_0 <= SE)||LA40_0==SUBTRACAO||LA40_0==TENTE||(LA40_0 >= VALOR_BOOLEANO && LA40_0 <= VALOR_NULO)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // fontes/g/CanecaArvore.g:349:12: instrucao
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_instrucao_in_blocoDeInstrucoes2032);
            	    instrucao210=instrucao();

            	    state._fsp--;

            	    stream_instrucao.add(instrucao210.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            _last = (CommonTree)input.LT(1);
            FIM211=(CommonTree)match(input,FIM,FOLLOW_FIM_in_blocoDeInstrucoes2036);  
            stream_FIM.add(FIM211);


            // AST REWRITE
            // elements: instrucao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 349:28: -> ^( INSTRUCOES_ ( instrucao )* )
            {
                // fontes/g/CanecaArvore.g:349:31: ^( INSTRUCOES_ ( instrucao )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(INSTRUCOES_, "INSTRUCOES_")
                , root_1);

                // fontes/g/CanecaArvore.g:349:45: ( instrucao )*
                while ( stream_instrucao.hasNext() ) {
                    adaptor.addChild(root_1, stream_instrucao.nextTree());

                }
                stream_instrucao.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }

        	catch (RecognitionException erro) {
        		throw erro;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "blocoDeInstrucoes"

    // Delegated rules


 

    public static final BitSet FOLLOW_unicadeDeCompilacao_in_programa279 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_cabecalho_in_unicadeDeCompilacao303 = new BitSet(new long[]{0x0000010000001000L});
    public static final BitSet FOLLOW_classe_in_unicadeDeCompilacao309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaces_in_unicadeDeCompilacao325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pacote_in_cabecalho350 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_importacoes_in_cabecalho352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACOTE_in_pacote373 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_DE_PACOTE_in_pacote375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_pacote377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importacao_in_importacoes397 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_IMPORTE_in_importacao421 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_importacao427 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao429 = new BitSet(new long[]{0x0000000000020000L,0x0000000000001000L});
    public static final BitSet FOLLOW_COMO_in_importacao432 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_importacao434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_importacao471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASSE_in_classe482 = new BitSet(new long[]{0xA800000000000000L});
    public static final BitSet FOLLOW_modificadorDeAcessoFeminino_in_classe484 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_classe486 = new BitSet(new long[]{0x000000A000004000L});
    public static final BitSet FOLLOW_listaDeTiposGenericos_in_classe488 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_classe490 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_corpoDaClasse_in_classe492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaces519 = new BitSet(new long[]{0xA800000000000000L});
    public static final BitSet FOLLOW_modificadorDeAcessoFeminino_in_interfaces521 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_interfaces523 = new BitSet(new long[]{0x000000A000004000L});
    public static final BitSet FOLLOW_listaDeTiposGenericos_in_interfaces525 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_interfaces527 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_corpoDaInterface_in_interfaces529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INICIO_in_corpoDaClasse556 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_atributos_in_corpoDaClasse558 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_construtores_in_corpoDaClasse560 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_destrutor_in_corpoDaClasse562 = new BitSet(new long[]{0x0002000200000000L});
    public static final BitSet FOLLOW_metodos_in_corpoDaClasse564 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_FIM_in_corpoDaClasse566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INICIO_in_corpoDaInterface591 = new BitSet(new long[]{0x0002000200000020L});
    public static final BitSet FOLLOW_atributos_in_corpoDaInterface593 = new BitSet(new long[]{0x0002000200000000L});
    public static final BitSet FOLLOW_assinaturasDeMetodos_in_corpoDaInterface595 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_FIM_in_corpoDaInterface597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atributo_in_atributos619 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_construtor_in_construtores644 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_metodo_in_metodos669 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_assinaturaDeMetodo_in_assinaturasDeMetodos694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_assinaturasDeMetodos696 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ATRIBUTO_in_atributo720 = new BitSet(new long[]{0x5000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_atributo722 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_ESTATICO_in_atributo725 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipo_in_atributo729 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_atributo731 = new BitSet(new long[]{0x0000000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_atribuicao_in_atributo734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_atributo738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assinaturaDeConstrutor_in_construtor771 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_construtor773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assinaturaDeDestrutor_in_destrutor794 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_destrutor796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assinaturaDeMetodo_in_metodo817 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_metodo819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUTOR_in_assinaturaDeConstrutor840 = new BitSet(new long[]{0x5000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_assinaturaDeConstrutor842 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_assinaturaDeConstrutor844 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_listaDeArgumentos_in_assinaturaDeConstrutor846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTRUTOR_in_assinaturaDeDestrutor869 = new BitSet(new long[]{0x5000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_assinaturaDeDestrutor871 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_assinaturaDeDestrutor873 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_listaDeArgumentos_in_assinaturaDeDestrutor875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METODO_in_assinaturaDeMetodo898 = new BitSet(new long[]{0x5000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_assinaturaDeMetodo900 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_ESTATICO_in_assinaturaDeMetodo903 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipo_in_assinaturaDeMetodo907 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_assinaturaDeMetodo909 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_listaDeArgumentos_in_assinaturaDeMetodo911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_listaDeParametros983 = new BitSet(new long[]{0x06381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_listaDeParametros986 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SEPARADOR_in_listaDeParametros989 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_listaDeParametros991 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_listaDeParametros997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_listaDeArgumentos1019 = new BitSet(new long[]{0x0200000400000000L});
    public static final BitSet FOLLOW_declaracao_in_listaDeArgumentos1022 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SEPARADOR_in_listaDeArgumentos1025 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_declaracao_in_listaDeArgumentos1027 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_listaDeArgumentos1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTA_in_listaDeInterfaces1056 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipo_in_listaDeInterfaces1058 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_SEPARADOR_in_listaDeInterfaces1061 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipo_in_listaDeInterfaces1063 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_COLCHETE_ESQUERDO_in_listaDeTiposGenericos1091 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipoGenerico_in_listaDeTiposGenericos1093 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLCHETE_DIREITO_in_listaDeTiposGenericos1095 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_COLCHETE_ESQUERDO_in_listaDeTipos1120 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipo_in_listaDeTipos1122 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SEPARADOR_in_listaDeTipos1125 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipo_in_listaDeTipos1127 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000080L});
    public static final BitSet FOLLOW_COLCHETE_DIREITO_in_listaDeTipos1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_capture_in_listaDeCapturas1156 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_tipoGenerico1180 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_tipoGenerico1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_tipo1203 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_listaDeTipos_in_tipo1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipo_in_declaracao1226 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_declaracao1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATRIBUIDOR_in_atribuicao1249 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoOuLogico_in_atribuicao1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracao_in_declaracaoComAtribuicaoOpcional1270 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_atribuicao_in_declaracaoComAtribuicaoOpcional1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoOuLogico_in_expressao1299 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ATRIBUIDOR_in_expressao1302 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoOuLogico_in_expressao1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoELogico_in_expressaoOuLogico1318 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_OU_in_expressaoOuLogico1321 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoELogico_in_expressaoOuLogico1324 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_expressaoComparacaoLogica_in_expressaoELogico1337 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_E_in_expressaoELogico1340 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoComparacaoLogica_in_expressaoELogico1343 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica1356 = new BitSet(new long[]{0x0001E01001000002L});
    public static final BitSet FOLLOW_set_in_expressaoComparacaoLogica1359 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica1384 = new BitSet(new long[]{0x0001E01001000002L});
    public static final BitSet FOLLOW_expressaoMultiplicativa_in_expressaoAditiva1397 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_set_in_expressaoAditiva1400 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoMultiplicativa_in_expressaoAditiva1409 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_expressaoUnaria_in_expressaoMultiplicativa1422 = new BitSet(new long[]{0x0004000004000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expressaoMultiplicativa1425 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoUnaria_in_expressaoMultiplicativa1438 = new BitSet(new long[]{0x0004000004000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_expressaoPrimaria_in_expressaoUnaria1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBTRACAO_in_expressaoUnaria1456 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoUnaria_in_expressaoUnaria1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGACAO_in_expressaoUnaria1464 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoUnaria_in_expressaoUnaria1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_expressaoPrimaria1478 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_expressaoPrimaria1480 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_expressaoPrimaria1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALOR_BOOLEANO_in_expressaoPrimaria1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALOR_NULO_in_expressaoPrimaria1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTE_INTEIRA_in_expressaoPrimaria1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTE_REAL_in_expressaoPrimaria1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_CARACTERE_in_expressaoPrimaria1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_TEXTO_in_expressaoPrimaria1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comando_in_expressaoPrimaria1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_seletor_in_comando1534 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_chamada_in_comando1537 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_ESSE_in_seletor1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ESSA_in_seletor1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanciacao_in_seletor1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_seletor1602 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_listaDeParametros_in_seletor1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_chamada1631 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_chamada1640 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_listaDeParametros_in_chamada1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOVO_in_instanciacao1657 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_NOVA_in_instanciacao1661 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipo_in_instanciacao1664 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_listaDeParametros_in_instanciacao1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTRUA_in_destruicao1687 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_destruicao1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETORNE_in_retorno1709 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_retorno1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SE_in_se1730 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_se1732 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_se1734 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_se1736 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_se1738 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_SENAO_in_se1741 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_se1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARA_in_para1769 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_para1771 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_para1773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_para1775 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_para1777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_para1779 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_para1781 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_para1783 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_para1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPITA_in_repita1808 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_repita1810 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_declaracao_in_repita1812 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_repita1814 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_repita1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENQUANTO_in_enquanto1835 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_enquanto1837 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_enquanto1839 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_enquanto1841 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_enquanto1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TENTE_in_tente1862 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_tente1864 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_listaDeCapturas_in_tente1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPTURE_in_capture1887 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_capture1889 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_declaracao_in_capture1891 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_capture1893 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_capture1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANCE_in_lance1916 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_lance1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressao_in_instrucao1954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_instrucao1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracaoComAtribuicaoOpcional_in_instrucao1963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_instrucao1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destruicao_in_instrucao1974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_instrucao1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retorno_in_instrucao1982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_instrucao1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_se_in_instrucao1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_para_in_instrucao1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repita_in_instrucao2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enquanto_in_instrucao2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tente_in_instrucao2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lance_in_instrucao2015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_instrucao2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INICIO_in_blocoDeInstrucoes2029 = new BitSet(new long[]{0x05381A06D04C0000L,0x000000000000CA34L});
    public static final BitSet FOLLOW_instrucao_in_blocoDeInstrucoes2032 = new BitSet(new long[]{0x05381A06D04C0000L,0x000000000000CA34L});
    public static final BitSet FOLLOW_FIM_in_blocoDeInstrucoes2036 = new BitSet(new long[]{0x0000000000000002L});

}