// $ANTLR 3.4 fontes/g/CanecaSintatico.g 2012-12-05 02:33:00

	package br.ufsc.inf.ine5426.caneca.antlr;
	import java.lang.System;
	import java.util.List;
	import java.util.LinkedList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class CanecaSintatico extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATRIBUIDOR", "ATRIBUTO", "CAPTURE", "CARACTERE", "CARACTERE_DE_ESCAPE", "CARACTERE_NAO_IMPRIMIVEL", "CHAMADA_DE_CLASSE", "CHAMADA_DE_OBJETO", "CLASSE", "COLCHETE_DIREITO", "COLCHETE_ESQUERDO", "COMENTARIO_EM_BLOCO", "COMENTARIO_EM_LINHA", "COMO", "CONSTANTE_INTEIRA", "CONSTANTE_REAL", "CONSTRUTOR", "DECLARE", "DESTRUA", "DESTRUTOR", "DIFERENTE", "DIGITO", "DIVISAO", "E", "ENQUANTO", "ESPACO_EM_BRANCO", "ESSA", "ESSE", "ESTATICO", "FIM", "IDENTIFICADOR", "IDENTIFICADOR_DE_PACOTE", "IGUAL", "IMPLEMENTA", "IMPORTE", "INICIO", "INTERFACE", "LANCE", "LETRA", "LITERAL_CARACTERE", "LITERAL_TEXTO", "MAIOR", "MAIOR_IGUAL", "MENOR", "MENOR_IGUAL", "METODO", "MULTIPLICACAO", "NEGACAO", "NOVA", "NOVO", "OU", "PACOTE", "PARA", "PARENTESE_DIREITO", "PARENTESE_ESQUERDO", "PRIVADA", "PRIVADO", "PROTEGIDA", "PROTEGIDO", "PUBLICA", "PUBLICO", "QUEBRA_DE_LINHA", "REPITA", "RESTO_DA_DIVISAO", "RETORNE", "SE", "SENAO", "SEPARADOR", "SOMA", "SUBTRACAO", "TABULACAO", "TENTE", "TERMINADOR", "USADO_EM_TEXTO", "VALOR_BOOLEANO", "VALOR_NULO"
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

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public CanecaSintatico(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public CanecaSintatico(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return CanecaSintatico.tokenNames; }
    public String getGrammarFileName() { return "fontes/g/CanecaSintatico.g"; }


    	private boolean mostrarErros = true;
    	private List<RecognitionException> erros = new LinkedList<RecognitionException>();
    	
    	public void esconderErros() {
    		this.mostrarErros = false;
    	}
    	
    	public List<RecognitionException> fornecerErros() {
    		return erros;
    	}
    	
    	@Override
    	public void reportError(RecognitionException erro) {
    		erros.add(erro);
    		super.reportError(erro);
    	}
    	
    	@Override
    	public void recover(IntStream entrada, RecognitionException erro) {
    		super.recover(entrada, erro);
    	}
    	
    	@Override
    	public Object recoverFromMismatchedToken(IntStream entrada, int tipoDoSimbolo, BitSet conjuntoDeFollows) throws RecognitionException {
    		throw new MismatchedTokenException(tipoDoSimbolo, entrada);
    	}
    	
    	@Override
    	public Object recoverFromMismatchedSet(IntStream entrada, RecognitionException erro, BitSet conjuntoDeFollows) throws RecognitionException {
    		throw erro;
    	}
    	
    	@Override
    	public void emitErrorMessage(String mensagemDeErro) {
    		System.err.println(mensagemDeErro);
    	}
    	
    	@Override
    	public void displayRecognitionError(String[] nomesDosSimbolos, RecognitionException erro) {
    		if (mostrarErros) {
    			String cabecalhoDeErro = getErrorHeader(erro);
    			String mensagemDeErro = getErrorMessage(erro, nomesDosSimbolos);
    			emitErrorMessage(String.format("[Erro sintático] %s %s\n", cabecalhoDeErro, mensagemDeErro));
    		}
    	}
    	
    	@Override
    	public String getErrorMessage(RecognitionException erro, String[] nomeDosSimbolos) {
    		if (erro instanceof UnwantedTokenException) {
    			UnwantedTokenException erroDeSimboloNaoDesejado = (UnwantedTokenException) erro;
    			String entradaNaoDesejada = getTokenErrorDisplay(erroDeSimboloNaoDesejado.getUnexpectedToken());
    			String simboloEsperado = getTokenErrorDisplay(erroDeSimboloNaoDesejado.expecting, nomeDosSimbolos);
    			return String.format("[UnwantedTokenException]\nEntrada não desejada: %s. O símbolo esperado era: %s.", entradaNaoDesejada, simboloEsperado);
    		} else if (erro instanceof MissingTokenException) {
    			MissingTokenException erroDeSimboloFaltando = (MissingTokenException) erro;
    			String simboloFaltando = getTokenErrorDisplay(erroDeSimboloFaltando.expecting, nomeDosSimbolos);
    			String entradaRecebida = getTokenErrorDisplay(erroDeSimboloFaltando.token);
    			return String.format("[MissingTokenException]\nSímbolo faltando: %s. A entrada recebida foi: %s.", simboloFaltando, entradaRecebida);
    		} else if (erro instanceof MismatchedTokenException) {
    			MismatchedTokenException erroDeSimboloIncompativel = (MismatchedTokenException) erro;
    			String entradaIncompativel = getTokenErrorDisplay(erroDeSimboloIncompativel.token);
    			String simboloEsperado = getTokenErrorDisplay(erroDeSimboloIncompativel.expecting, nomeDosSimbolos);
    			return String.format("[MismatchedTokenException]\nEntrada incompátivel: %s. O símbolo esperado era: %s.", entradaIncompativel, simboloEsperado);
    		} else if (erro instanceof MismatchedTreeNodeException) {
    			MismatchedTreeNodeException erroDeNodoIncompativel = (MismatchedTreeNodeException) erro;
    			Object nodoIncompativel = erroDeNodoIncompativel.node;
    			String simboloEsperado = getTokenErrorDisplay(erroDeNodoIncompativel.expecting, nomeDosSimbolos);
    			return String.format("[MismatchedTreeNodeException]\nNodo incompátivel: %s. O símbolo esperado era: %s.", nodoIncompativel.toString(), simboloEsperado);
    		} else if (erro instanceof NoViableAltException) {
    			NoViableAltException erroDeAlternativaInviavel = (NoViableAltException) erro;
    			String entradaRecebida = getTokenErrorDisplay(erroDeAlternativaInviavel.token);
    			return String.format("[NoViableAltException]\nSem alternativa viável. A entrada recebida foi: %s.", entradaRecebida);
    		} else if (erro instanceof EarlyExitException) {
    			EarlyExitException erroDeSaidaPrecoce = (EarlyExitException) erro;
    			String entradaRecebida = getTokenErrorDisplay(erroDeSaidaPrecoce.token);
    			return String.format("[EarlyExitException]\nEsperava-se reconhecer pelo menos uma alternativa, mas não foi reconhecida nenhuma. A entrada recebida foi: %s.", entradaRecebida);
    		} else if (erro instanceof MismatchedSetException) {
    			MismatchedSetException erroDeConjuntoIncompativel = (MismatchedSetException) erro;
    			String entradaIncompativel = getTokenErrorDisplay(erroDeConjuntoIncompativel.token);
    			BitSet conjuntoEsperado = erroDeConjuntoIncompativel.expecting;
    			return String.format("[MismatchedSetException]\nEntrada incompátivel: %s. O conjunto esperado era: %s.", entradaIncompativel, conjuntoEsperado);
    		} else if (erro instanceof MismatchedNotSetException) {
    			MismatchedNotSetException erroDeConjuntoNegadoIncompativel = (MismatchedNotSetException) erro;
    			String entradaIncompativel = getTokenErrorDisplay(erroDeConjuntoNegadoIncompativel.token);
    			BitSet conjuntoNegadoEsperado = erroDeConjuntoNegadoIncompativel.expecting;
    			return String.format("[MismatchedNotSetException]\nEntrada incompátivel: %s. O conjunto negado esperado era: %s.", entradaIncompativel, conjuntoNegadoEsperado);
    		} else if (erro instanceof FailedPredicateException) {
    			FailedPredicateException erroDePredicadoFalho = (FailedPredicateException) erro;
    			String regra = erroDePredicadoFalho.ruleName;
    			String predicado = erroDePredicadoFalho.predicateText;
    			return String.format("[FailedPredicateException]\nPredicado falho: %s na regra: %s.", predicado, regra);
    		}
    		return String.format("[Erro de reconhecimento]\n%s.", erro.getMessage());
    	}
    	
    	@Override
    	public String getErrorHeader(RecognitionException erro) {
    		String nomeDoArquivo = "";
    		if (getSourceName() != null) {
    			nomeDoArquivo = String.format("[%s] ", getSourceName());
    		}
    		return String.format("%s[%d, %d]", nomeDoArquivo, erro.line, erro.charPositionInLine);
    	}
    	
    	@Override
    	public String getTokenErrorDisplay(Token simbolo) {
    		String valor = simbolo.getText();
    		if (valor == null) {
    			valor = getTokenErrorDisplay(simbolo.getType(), getTokenNames());
    		}
    		valor = valor.replaceAll("\n", "\\\\n");
    		valor = valor.replaceAll("\r", "\\\\r");
    		valor = valor.replaceAll("\t", "\\\\t");
    		return String.format("'%s'", valor);
    	}
    	
    	public String getTokenErrorDisplay(int tipoDoSimbolo, String[] nomeDosSimbolos) {
    		String nomeDoSimbolo = "DESCONHECIDO";
    		if (tipoDoSimbolo == Token.EOF) {
    			nomeDoSimbolo = "FIM_DE_ARQUIVO";
    		} else if (tipoDoSimbolo >= 0 && tipoDoSimbolo < nomeDosSimbolos.length) {
    			nomeDoSimbolo = nomeDosSimbolos[tipoDoSimbolo];
    		}
    		return String.format("<%s>", nomeDoSimbolo);
    	}


    public static class programa_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "programa"
    // fontes/g/CanecaSintatico.g:153:1: programa : ( unicadeDeCompilacao )+ ;
    public final CanecaSintatico.programa_return programa() throws RecognitionException {
        CanecaSintatico.programa_return retval = new CanecaSintatico.programa_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CanecaSintatico.unicadeDeCompilacao_return unicadeDeCompilacao1 =null;



        try {
            // fontes/g/CanecaSintatico.g:154:2: ( ( unicadeDeCompilacao )+ )
            // fontes/g/CanecaSintatico.g:154:4: ( unicadeDeCompilacao )+
            {
            root_0 = (Object)adaptor.nil();


            // fontes/g/CanecaSintatico.g:154:4: ( unicadeDeCompilacao )+
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
            	    // fontes/g/CanecaSintatico.g:154:5: unicadeDeCompilacao
            	    {
            	    pushFollow(FOLLOW_unicadeDeCompilacao_in_programa77);
            	    unicadeDeCompilacao1=unicadeDeCompilacao();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unicadeDeCompilacao1.getTree());

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


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "programa"


    public static class unicadeDeCompilacao_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unicadeDeCompilacao"
    // fontes/g/CanecaSintatico.g:157:1: unicadeDeCompilacao : cabecalho ( classe | interfaces ) ;
    public final CanecaSintatico.unicadeDeCompilacao_return unicadeDeCompilacao() throws RecognitionException {
        CanecaSintatico.unicadeDeCompilacao_return retval = new CanecaSintatico.unicadeDeCompilacao_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CanecaSintatico.cabecalho_return cabecalho2 =null;

        CanecaSintatico.classe_return classe3 =null;

        CanecaSintatico.interfaces_return interfaces4 =null;



        try {
            // fontes/g/CanecaSintatico.g:158:2: ( cabecalho ( classe | interfaces ) )
            // fontes/g/CanecaSintatico.g:158:4: cabecalho ( classe | interfaces )
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cabecalho_in_unicadeDeCompilacao90);
            cabecalho2=cabecalho();

            state._fsp--;

            adaptor.addChild(root_0, cabecalho2.getTree());

            // fontes/g/CanecaSintatico.g:158:14: ( classe | interfaces )
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
                    // fontes/g/CanecaSintatico.g:158:15: classe
                    {
                    pushFollow(FOLLOW_classe_in_unicadeDeCompilacao93);
                    classe3=classe();

                    state._fsp--;

                    adaptor.addChild(root_0, classe3.getTree());

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSintatico.g:158:24: interfaces
                    {
                    pushFollow(FOLLOW_interfaces_in_unicadeDeCompilacao97);
                    interfaces4=interfaces();

                    state._fsp--;

                    adaptor.addChild(root_0, interfaces4.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unicadeDeCompilacao"


    public static class cabecalho_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cabecalho"
    // fontes/g/CanecaSintatico.g:161:1: cabecalho : pacote importacoes ;
    public final CanecaSintatico.cabecalho_return cabecalho() throws RecognitionException {
        CanecaSintatico.cabecalho_return retval = new CanecaSintatico.cabecalho_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CanecaSintatico.pacote_return pacote5 =null;

        CanecaSintatico.importacoes_return importacoes6 =null;



        try {
            // fontes/g/CanecaSintatico.g:162:2: ( pacote importacoes )
            // fontes/g/CanecaSintatico.g:162:4: pacote importacoes
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_pacote_in_cabecalho109);
            pacote5=pacote();

            state._fsp--;

            adaptor.addChild(root_0, pacote5.getTree());

            pushFollow(FOLLOW_importacoes_in_cabecalho111);
            importacoes6=importacoes();

            state._fsp--;

            adaptor.addChild(root_0, importacoes6.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cabecalho"


    public static class pacote_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pacote"
    // fontes/g/CanecaSintatico.g:165:1: pacote : PACOTE IDENTIFICADOR_DE_PACOTE TERMINADOR ;
    public final CanecaSintatico.pacote_return pacote() throws RecognitionException {
        CanecaSintatico.pacote_return retval = new CanecaSintatico.pacote_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PACOTE7=null;
        Token IDENTIFICADOR_DE_PACOTE8=null;
        Token TERMINADOR9=null;

        Object PACOTE7_tree=null;
        Object IDENTIFICADOR_DE_PACOTE8_tree=null;
        Object TERMINADOR9_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:166:2: ( PACOTE IDENTIFICADOR_DE_PACOTE TERMINADOR )
            // fontes/g/CanecaSintatico.g:166:4: PACOTE IDENTIFICADOR_DE_PACOTE TERMINADOR
            {
            root_0 = (Object)adaptor.nil();


            PACOTE7=(Token)match(input,PACOTE,FOLLOW_PACOTE_in_pacote122); 
            PACOTE7_tree = 
            (Object)adaptor.create(PACOTE7)
            ;
            adaptor.addChild(root_0, PACOTE7_tree);


            IDENTIFICADOR_DE_PACOTE8=(Token)match(input,IDENTIFICADOR_DE_PACOTE,FOLLOW_IDENTIFICADOR_DE_PACOTE_in_pacote124); 
            IDENTIFICADOR_DE_PACOTE8_tree = 
            (Object)adaptor.create(IDENTIFICADOR_DE_PACOTE8)
            ;
            adaptor.addChild(root_0, IDENTIFICADOR_DE_PACOTE8_tree);


            TERMINADOR9=(Token)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_pacote126); 
            TERMINADOR9_tree = 
            (Object)adaptor.create(TERMINADOR9)
            ;
            adaptor.addChild(root_0, TERMINADOR9_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pacote"


    public static class importacoes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "importacoes"
    // fontes/g/CanecaSintatico.g:169:1: importacoes : ( importacao )* ;
    public final CanecaSintatico.importacoes_return importacoes() throws RecognitionException {
        CanecaSintatico.importacoes_return retval = new CanecaSintatico.importacoes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CanecaSintatico.importacao_return importacao10 =null;



        try {
            // fontes/g/CanecaSintatico.g:170:2: ( ( importacao )* )
            // fontes/g/CanecaSintatico.g:170:4: ( importacao )*
            {
            root_0 = (Object)adaptor.nil();


            // fontes/g/CanecaSintatico.g:170:4: ( importacao )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IMPORTE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // fontes/g/CanecaSintatico.g:170:5: importacao
            	    {
            	    pushFollow(FOLLOW_importacao_in_importacoes138);
            	    importacao10=importacao();

            	    state._fsp--;

            	    adaptor.addChild(root_0, importacao10.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "importacoes"


    public static class importacao_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "importacao"
    // fontes/g/CanecaSintatico.g:173:1: importacao : IMPORTE ( IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( COMO IDENTIFICADOR )? | IDENTIFICADOR_DE_PACOTE ) TERMINADOR ;
    public final CanecaSintatico.importacao_return importacao() throws RecognitionException {
        CanecaSintatico.importacao_return retval = new CanecaSintatico.importacao_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IMPORTE11=null;
        Token IDENTIFICADOR12=null;
        Token IDENTIFICADOR_DE_PACOTE13=null;
        Token COMO14=null;
        Token IDENTIFICADOR15=null;
        Token IDENTIFICADOR_DE_PACOTE16=null;
        Token TERMINADOR17=null;

        Object IMPORTE11_tree=null;
        Object IDENTIFICADOR12_tree=null;
        Object IDENTIFICADOR_DE_PACOTE13_tree=null;
        Object COMO14_tree=null;
        Object IDENTIFICADOR15_tree=null;
        Object IDENTIFICADOR_DE_PACOTE16_tree=null;
        Object TERMINADOR17_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:174:2: ( IMPORTE ( IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( COMO IDENTIFICADOR )? | IDENTIFICADOR_DE_PACOTE ) TERMINADOR )
            // fontes/g/CanecaSintatico.g:174:4: IMPORTE ( IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( COMO IDENTIFICADOR )? | IDENTIFICADOR_DE_PACOTE ) TERMINADOR
            {
            root_0 = (Object)adaptor.nil();


            IMPORTE11=(Token)match(input,IMPORTE,FOLLOW_IMPORTE_in_importacao151); 
            IMPORTE11_tree = 
            (Object)adaptor.create(IMPORTE11)
            ;
            adaptor.addChild(root_0, IMPORTE11_tree);


            // fontes/g/CanecaSintatico.g:174:12: ( IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( COMO IDENTIFICADOR )? | IDENTIFICADOR_DE_PACOTE )
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
                    // fontes/g/CanecaSintatico.g:174:13: IDENTIFICADOR IDENTIFICADOR_DE_PACOTE ( COMO IDENTIFICADOR )?
                    {
                    IDENTIFICADOR12=(Token)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_importacao154); 
                    IDENTIFICADOR12_tree = 
                    (Object)adaptor.create(IDENTIFICADOR12)
                    ;
                    adaptor.addChild(root_0, IDENTIFICADOR12_tree);


                    IDENTIFICADOR_DE_PACOTE13=(Token)match(input,IDENTIFICADOR_DE_PACOTE,FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao156); 
                    IDENTIFICADOR_DE_PACOTE13_tree = 
                    (Object)adaptor.create(IDENTIFICADOR_DE_PACOTE13)
                    ;
                    adaptor.addChild(root_0, IDENTIFICADOR_DE_PACOTE13_tree);


                    // fontes/g/CanecaSintatico.g:174:51: ( COMO IDENTIFICADOR )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==COMO) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // fontes/g/CanecaSintatico.g:174:52: COMO IDENTIFICADOR
                            {
                            COMO14=(Token)match(input,COMO,FOLLOW_COMO_in_importacao159); 
                            COMO14_tree = 
                            (Object)adaptor.create(COMO14)
                            ;
                            adaptor.addChild(root_0, COMO14_tree);


                            IDENTIFICADOR15=(Token)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_importacao161); 
                            IDENTIFICADOR15_tree = 
                            (Object)adaptor.create(IDENTIFICADOR15)
                            ;
                            adaptor.addChild(root_0, IDENTIFICADOR15_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSintatico.g:174:75: IDENTIFICADOR_DE_PACOTE
                    {
                    IDENTIFICADOR_DE_PACOTE16=(Token)match(input,IDENTIFICADOR_DE_PACOTE,FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao167); 
                    IDENTIFICADOR_DE_PACOTE16_tree = 
                    (Object)adaptor.create(IDENTIFICADOR_DE_PACOTE16)
                    ;
                    adaptor.addChild(root_0, IDENTIFICADOR_DE_PACOTE16_tree);


                    }
                    break;

            }


            TERMINADOR17=(Token)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_importacao170); 
            TERMINADOR17_tree = 
            (Object)adaptor.create(TERMINADOR17)
            ;
            adaptor.addChild(root_0, TERMINADOR17_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "importacao"


    public static class classe_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classe"
    // fontes/g/CanecaSintatico.g:177:1: classe : CLASSE modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaClasse ;
    public final CanecaSintatico.classe_return classe() throws RecognitionException {
        CanecaSintatico.classe_return retval = new CanecaSintatico.classe_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CLASSE18=null;
        Token IDENTIFICADOR20=null;
        CanecaSintatico.modificadorDeAcessoFeminino_return modificadorDeAcessoFeminino19 =null;

        CanecaSintatico.listaDeTiposGenericos_return listaDeTiposGenericos21 =null;

        CanecaSintatico.listaDeInterfaces_return listaDeInterfaces22 =null;

        CanecaSintatico.corpoDaClasse_return corpoDaClasse23 =null;


        Object CLASSE18_tree=null;
        Object IDENTIFICADOR20_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:178:2: ( CLASSE modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaClasse )
            // fontes/g/CanecaSintatico.g:178:4: CLASSE modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaClasse
            {
            root_0 = (Object)adaptor.nil();


            CLASSE18=(Token)match(input,CLASSE,FOLLOW_CLASSE_in_classe181); 
            CLASSE18_tree = 
            (Object)adaptor.create(CLASSE18)
            ;
            adaptor.addChild(root_0, CLASSE18_tree);


            pushFollow(FOLLOW_modificadorDeAcessoFeminino_in_classe183);
            modificadorDeAcessoFeminino19=modificadorDeAcessoFeminino();

            state._fsp--;

            adaptor.addChild(root_0, modificadorDeAcessoFeminino19.getTree());

            IDENTIFICADOR20=(Token)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_classe185); 
            IDENTIFICADOR20_tree = 
            (Object)adaptor.create(IDENTIFICADOR20)
            ;
            adaptor.addChild(root_0, IDENTIFICADOR20_tree);


            pushFollow(FOLLOW_listaDeTiposGenericos_in_classe187);
            listaDeTiposGenericos21=listaDeTiposGenericos();

            state._fsp--;

            adaptor.addChild(root_0, listaDeTiposGenericos21.getTree());

            pushFollow(FOLLOW_listaDeInterfaces_in_classe189);
            listaDeInterfaces22=listaDeInterfaces();

            state._fsp--;

            adaptor.addChild(root_0, listaDeInterfaces22.getTree());

            pushFollow(FOLLOW_corpoDaClasse_in_classe191);
            corpoDaClasse23=corpoDaClasse();

            state._fsp--;

            adaptor.addChild(root_0, corpoDaClasse23.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classe"


    public static class interfaces_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaces"
    // fontes/g/CanecaSintatico.g:181:1: interfaces : INTERFACE modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface ;
    public final CanecaSintatico.interfaces_return interfaces() throws RecognitionException {
        CanecaSintatico.interfaces_return retval = new CanecaSintatico.interfaces_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTERFACE24=null;
        Token IDENTIFICADOR26=null;
        CanecaSintatico.modificadorDeAcessoFeminino_return modificadorDeAcessoFeminino25 =null;

        CanecaSintatico.listaDeTiposGenericos_return listaDeTiposGenericos27 =null;

        CanecaSintatico.listaDeInterfaces_return listaDeInterfaces28 =null;

        CanecaSintatico.corpoDaInterface_return corpoDaInterface29 =null;


        Object INTERFACE24_tree=null;
        Object IDENTIFICADOR26_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:182:2: ( INTERFACE modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface )
            // fontes/g/CanecaSintatico.g:182:4: INTERFACE modificadorDeAcessoFeminino IDENTIFICADOR listaDeTiposGenericos listaDeInterfaces corpoDaInterface
            {
            root_0 = (Object)adaptor.nil();


            INTERFACE24=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaces202); 
            INTERFACE24_tree = 
            (Object)adaptor.create(INTERFACE24)
            ;
            adaptor.addChild(root_0, INTERFACE24_tree);


            pushFollow(FOLLOW_modificadorDeAcessoFeminino_in_interfaces204);
            modificadorDeAcessoFeminino25=modificadorDeAcessoFeminino();

            state._fsp--;

            adaptor.addChild(root_0, modificadorDeAcessoFeminino25.getTree());

            IDENTIFICADOR26=(Token)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_interfaces206); 
            IDENTIFICADOR26_tree = 
            (Object)adaptor.create(IDENTIFICADOR26)
            ;
            adaptor.addChild(root_0, IDENTIFICADOR26_tree);


            pushFollow(FOLLOW_listaDeTiposGenericos_in_interfaces208);
            listaDeTiposGenericos27=listaDeTiposGenericos();

            state._fsp--;

            adaptor.addChild(root_0, listaDeTiposGenericos27.getTree());

            pushFollow(FOLLOW_listaDeInterfaces_in_interfaces210);
            listaDeInterfaces28=listaDeInterfaces();

            state._fsp--;

            adaptor.addChild(root_0, listaDeInterfaces28.getTree());

            pushFollow(FOLLOW_corpoDaInterface_in_interfaces212);
            corpoDaInterface29=corpoDaInterface();

            state._fsp--;

            adaptor.addChild(root_0, corpoDaInterface29.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "interfaces"


    public static class corpoDaClasse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "corpoDaClasse"
    // fontes/g/CanecaSintatico.g:185:1: corpoDaClasse : INICIO atributos construtores destrutor metodos FIM ;
    public final CanecaSintatico.corpoDaClasse_return corpoDaClasse() throws RecognitionException {
        CanecaSintatico.corpoDaClasse_return retval = new CanecaSintatico.corpoDaClasse_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INICIO30=null;
        Token FIM35=null;
        CanecaSintatico.atributos_return atributos31 =null;

        CanecaSintatico.construtores_return construtores32 =null;

        CanecaSintatico.destrutor_return destrutor33 =null;

        CanecaSintatico.metodos_return metodos34 =null;


        Object INICIO30_tree=null;
        Object FIM35_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:186:2: ( INICIO atributos construtores destrutor metodos FIM )
            // fontes/g/CanecaSintatico.g:186:4: INICIO atributos construtores destrutor metodos FIM
            {
            root_0 = (Object)adaptor.nil();


            INICIO30=(Token)match(input,INICIO,FOLLOW_INICIO_in_corpoDaClasse223); 
            INICIO30_tree = 
            (Object)adaptor.create(INICIO30)
            ;
            adaptor.addChild(root_0, INICIO30_tree);


            pushFollow(FOLLOW_atributos_in_corpoDaClasse225);
            atributos31=atributos();

            state._fsp--;

            adaptor.addChild(root_0, atributos31.getTree());

            pushFollow(FOLLOW_construtores_in_corpoDaClasse227);
            construtores32=construtores();

            state._fsp--;

            adaptor.addChild(root_0, construtores32.getTree());

            pushFollow(FOLLOW_destrutor_in_corpoDaClasse229);
            destrutor33=destrutor();

            state._fsp--;

            adaptor.addChild(root_0, destrutor33.getTree());

            pushFollow(FOLLOW_metodos_in_corpoDaClasse231);
            metodos34=metodos();

            state._fsp--;

            adaptor.addChild(root_0, metodos34.getTree());

            FIM35=(Token)match(input,FIM,FOLLOW_FIM_in_corpoDaClasse233); 
            FIM35_tree = 
            (Object)adaptor.create(FIM35)
            ;
            adaptor.addChild(root_0, FIM35_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "corpoDaClasse"


    public static class corpoDaInterface_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "corpoDaInterface"
    // fontes/g/CanecaSintatico.g:189:1: corpoDaInterface : INICIO atributos assinaturasDeMetodos FIM ;
    public final CanecaSintatico.corpoDaInterface_return corpoDaInterface() throws RecognitionException {
        CanecaSintatico.corpoDaInterface_return retval = new CanecaSintatico.corpoDaInterface_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INICIO36=null;
        Token FIM39=null;
        CanecaSintatico.atributos_return atributos37 =null;

        CanecaSintatico.assinaturasDeMetodos_return assinaturasDeMetodos38 =null;


        Object INICIO36_tree=null;
        Object FIM39_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:190:2: ( INICIO atributos assinaturasDeMetodos FIM )
            // fontes/g/CanecaSintatico.g:190:4: INICIO atributos assinaturasDeMetodos FIM
            {
            root_0 = (Object)adaptor.nil();


            INICIO36=(Token)match(input,INICIO,FOLLOW_INICIO_in_corpoDaInterface244); 
            INICIO36_tree = 
            (Object)adaptor.create(INICIO36)
            ;
            adaptor.addChild(root_0, INICIO36_tree);


            pushFollow(FOLLOW_atributos_in_corpoDaInterface246);
            atributos37=atributos();

            state._fsp--;

            adaptor.addChild(root_0, atributos37.getTree());

            pushFollow(FOLLOW_assinaturasDeMetodos_in_corpoDaInterface248);
            assinaturasDeMetodos38=assinaturasDeMetodos();

            state._fsp--;

            adaptor.addChild(root_0, assinaturasDeMetodos38.getTree());

            FIM39=(Token)match(input,FIM,FOLLOW_FIM_in_corpoDaInterface250); 
            FIM39_tree = 
            (Object)adaptor.create(FIM39)
            ;
            adaptor.addChild(root_0, FIM39_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "corpoDaInterface"


    public static class atributos_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atributos"
    // fontes/g/CanecaSintatico.g:193:1: atributos : ( atributo )* ;
    public final CanecaSintatico.atributos_return atributos() throws RecognitionException {
        CanecaSintatico.atributos_return retval = new CanecaSintatico.atributos_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CanecaSintatico.atributo_return atributo40 =null;



        try {
            // fontes/g/CanecaSintatico.g:194:2: ( ( atributo )* )
            // fontes/g/CanecaSintatico.g:194:4: ( atributo )*
            {
            root_0 = (Object)adaptor.nil();


            // fontes/g/CanecaSintatico.g:194:4: ( atributo )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==ATRIBUTO) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // fontes/g/CanecaSintatico.g:194:5: atributo
            	    {
            	    pushFollow(FOLLOW_atributo_in_atributos262);
            	    atributo40=atributo();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atributo40.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atributos"


    public static class construtores_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "construtores"
    // fontes/g/CanecaSintatico.g:197:1: construtores : ( construtor )+ ;
    public final CanecaSintatico.construtores_return construtores() throws RecognitionException {
        CanecaSintatico.construtores_return retval = new CanecaSintatico.construtores_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CanecaSintatico.construtor_return construtor41 =null;



        try {
            // fontes/g/CanecaSintatico.g:198:2: ( ( construtor )+ )
            // fontes/g/CanecaSintatico.g:198:4: ( construtor )+
            {
            root_0 = (Object)adaptor.nil();


            // fontes/g/CanecaSintatico.g:198:4: ( construtor )+
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
            	    // fontes/g/CanecaSintatico.g:198:5: construtor
            	    {
            	    pushFollow(FOLLOW_construtor_in_construtores276);
            	    construtor41=construtor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, construtor41.getTree());

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


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "construtores"


    public static class metodos_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "metodos"
    // fontes/g/CanecaSintatico.g:201:1: metodos : ( metodo )* ;
    public final CanecaSintatico.metodos_return metodos() throws RecognitionException {
        CanecaSintatico.metodos_return retval = new CanecaSintatico.metodos_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CanecaSintatico.metodo_return metodo42 =null;



        try {
            // fontes/g/CanecaSintatico.g:202:2: ( ( metodo )* )
            // fontes/g/CanecaSintatico.g:202:4: ( metodo )*
            {
            root_0 = (Object)adaptor.nil();


            // fontes/g/CanecaSintatico.g:202:4: ( metodo )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==METODO) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // fontes/g/CanecaSintatico.g:202:5: metodo
            	    {
            	    pushFollow(FOLLOW_metodo_in_metodos290);
            	    metodo42=metodo();

            	    state._fsp--;

            	    adaptor.addChild(root_0, metodo42.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "metodos"


    public static class assinaturasDeMetodos_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assinaturasDeMetodos"
    // fontes/g/CanecaSintatico.g:205:1: assinaturasDeMetodos : ( assinaturaDeMetodo TERMINADOR )* ;
    public final CanecaSintatico.assinaturasDeMetodos_return assinaturasDeMetodos() throws RecognitionException {
        CanecaSintatico.assinaturasDeMetodos_return retval = new CanecaSintatico.assinaturasDeMetodos_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TERMINADOR44=null;
        CanecaSintatico.assinaturaDeMetodo_return assinaturaDeMetodo43 =null;


        Object TERMINADOR44_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:206:2: ( ( assinaturaDeMetodo TERMINADOR )* )
            // fontes/g/CanecaSintatico.g:206:4: ( assinaturaDeMetodo TERMINADOR )*
            {
            root_0 = (Object)adaptor.nil();


            // fontes/g/CanecaSintatico.g:206:4: ( assinaturaDeMetodo TERMINADOR )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==METODO) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // fontes/g/CanecaSintatico.g:206:5: assinaturaDeMetodo TERMINADOR
            	    {
            	    pushFollow(FOLLOW_assinaturaDeMetodo_in_assinaturasDeMetodos304);
            	    assinaturaDeMetodo43=assinaturaDeMetodo();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assinaturaDeMetodo43.getTree());

            	    TERMINADOR44=(Token)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_assinaturasDeMetodos306); 
            	    TERMINADOR44_tree = 
            	    (Object)adaptor.create(TERMINADOR44)
            	    ;
            	    adaptor.addChild(root_0, TERMINADOR44_tree);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assinaturasDeMetodos"


    public static class atributo_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atributo"
    // fontes/g/CanecaSintatico.g:209:1: atributo : ATRIBUTO modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR TERMINADOR ;
    public final CanecaSintatico.atributo_return atributo() throws RecognitionException {
        CanecaSintatico.atributo_return retval = new CanecaSintatico.atributo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ATRIBUTO45=null;
        Token ESTATICO47=null;
        Token IDENTIFICADOR49=null;
        Token TERMINADOR50=null;
        CanecaSintatico.modificadorDeAcessoMasculino_return modificadorDeAcessoMasculino46 =null;

        CanecaSintatico.tipo_return tipo48 =null;


        Object ATRIBUTO45_tree=null;
        Object ESTATICO47_tree=null;
        Object IDENTIFICADOR49_tree=null;
        Object TERMINADOR50_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:210:2: ( ATRIBUTO modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR TERMINADOR )
            // fontes/g/CanecaSintatico.g:210:4: ATRIBUTO modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR TERMINADOR
            {
            root_0 = (Object)adaptor.nil();


            ATRIBUTO45=(Token)match(input,ATRIBUTO,FOLLOW_ATRIBUTO_in_atributo319); 
            ATRIBUTO45_tree = 
            (Object)adaptor.create(ATRIBUTO45)
            ;
            adaptor.addChild(root_0, ATRIBUTO45_tree);


            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_atributo321);
            modificadorDeAcessoMasculino46=modificadorDeAcessoMasculino();

            state._fsp--;

            adaptor.addChild(root_0, modificadorDeAcessoMasculino46.getTree());

            // fontes/g/CanecaSintatico.g:210:42: ( ESTATICO )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ESTATICO) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:210:43: ESTATICO
                    {
                    ESTATICO47=(Token)match(input,ESTATICO,FOLLOW_ESTATICO_in_atributo324); 
                    ESTATICO47_tree = 
                    (Object)adaptor.create(ESTATICO47)
                    ;
                    adaptor.addChild(root_0, ESTATICO47_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_atributo328);
            tipo48=tipo();

            state._fsp--;

            adaptor.addChild(root_0, tipo48.getTree());

            IDENTIFICADOR49=(Token)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_atributo330); 
            IDENTIFICADOR49_tree = 
            (Object)adaptor.create(IDENTIFICADOR49)
            ;
            adaptor.addChild(root_0, IDENTIFICADOR49_tree);


            TERMINADOR50=(Token)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_atributo334); 
            TERMINADOR50_tree = 
            (Object)adaptor.create(TERMINADOR50)
            ;
            adaptor.addChild(root_0, TERMINADOR50_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atributo"


    public static class construtor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "construtor"
    // fontes/g/CanecaSintatico.g:213:1: construtor : assinaturaDeConstrutor blocoDeInstrucoes ;
    public final CanecaSintatico.construtor_return construtor() throws RecognitionException {
        CanecaSintatico.construtor_return retval = new CanecaSintatico.construtor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CanecaSintatico.assinaturaDeConstrutor_return assinaturaDeConstrutor51 =null;

        CanecaSintatico.blocoDeInstrucoes_return blocoDeInstrucoes52 =null;



        try {
            // fontes/g/CanecaSintatico.g:214:2: ( assinaturaDeConstrutor blocoDeInstrucoes )
            // fontes/g/CanecaSintatico.g:214:4: assinaturaDeConstrutor blocoDeInstrucoes
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assinaturaDeConstrutor_in_construtor345);
            assinaturaDeConstrutor51=assinaturaDeConstrutor();

            state._fsp--;

            adaptor.addChild(root_0, assinaturaDeConstrutor51.getTree());

            pushFollow(FOLLOW_blocoDeInstrucoes_in_construtor347);
            blocoDeInstrucoes52=blocoDeInstrucoes();

            state._fsp--;

            adaptor.addChild(root_0, blocoDeInstrucoes52.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "construtor"


    public static class destrutor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "destrutor"
    // fontes/g/CanecaSintatico.g:217:1: destrutor : assinaturaDeDestrutor blocoDeInstrucoes ;
    public final CanecaSintatico.destrutor_return destrutor() throws RecognitionException {
        CanecaSintatico.destrutor_return retval = new CanecaSintatico.destrutor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CanecaSintatico.assinaturaDeDestrutor_return assinaturaDeDestrutor53 =null;

        CanecaSintatico.blocoDeInstrucoes_return blocoDeInstrucoes54 =null;



        try {
            // fontes/g/CanecaSintatico.g:218:2: ( assinaturaDeDestrutor blocoDeInstrucoes )
            // fontes/g/CanecaSintatico.g:218:4: assinaturaDeDestrutor blocoDeInstrucoes
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assinaturaDeDestrutor_in_destrutor358);
            assinaturaDeDestrutor53=assinaturaDeDestrutor();

            state._fsp--;

            adaptor.addChild(root_0, assinaturaDeDestrutor53.getTree());

            pushFollow(FOLLOW_blocoDeInstrucoes_in_destrutor360);
            blocoDeInstrucoes54=blocoDeInstrucoes();

            state._fsp--;

            adaptor.addChild(root_0, blocoDeInstrucoes54.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "destrutor"


    public static class metodo_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "metodo"
    // fontes/g/CanecaSintatico.g:221:1: metodo : assinaturaDeMetodo blocoDeInstrucoes ;
    public final CanecaSintatico.metodo_return metodo() throws RecognitionException {
        CanecaSintatico.metodo_return retval = new CanecaSintatico.metodo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CanecaSintatico.assinaturaDeMetodo_return assinaturaDeMetodo55 =null;

        CanecaSintatico.blocoDeInstrucoes_return blocoDeInstrucoes56 =null;



        try {
            // fontes/g/CanecaSintatico.g:222:2: ( assinaturaDeMetodo blocoDeInstrucoes )
            // fontes/g/CanecaSintatico.g:222:4: assinaturaDeMetodo blocoDeInstrucoes
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assinaturaDeMetodo_in_metodo371);
            assinaturaDeMetodo55=assinaturaDeMetodo();

            state._fsp--;

            adaptor.addChild(root_0, assinaturaDeMetodo55.getTree());

            pushFollow(FOLLOW_blocoDeInstrucoes_in_metodo373);
            blocoDeInstrucoes56=blocoDeInstrucoes();

            state._fsp--;

            adaptor.addChild(root_0, blocoDeInstrucoes56.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "metodo"


    public static class assinaturaDeConstrutor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assinaturaDeConstrutor"
    // fontes/g/CanecaSintatico.g:225:1: assinaturaDeConstrutor : CONSTRUTOR modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos ;
    public final CanecaSintatico.assinaturaDeConstrutor_return assinaturaDeConstrutor() throws RecognitionException {
        CanecaSintatico.assinaturaDeConstrutor_return retval = new CanecaSintatico.assinaturaDeConstrutor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONSTRUTOR57=null;
        Token IDENTIFICADOR59=null;
        CanecaSintatico.modificadorDeAcessoMasculino_return modificadorDeAcessoMasculino58 =null;

        CanecaSintatico.listaDeArgumentos_return listaDeArgumentos60 =null;


        Object CONSTRUTOR57_tree=null;
        Object IDENTIFICADOR59_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:226:2: ( CONSTRUTOR modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos )
            // fontes/g/CanecaSintatico.g:226:4: CONSTRUTOR modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos
            {
            root_0 = (Object)adaptor.nil();


            CONSTRUTOR57=(Token)match(input,CONSTRUTOR,FOLLOW_CONSTRUTOR_in_assinaturaDeConstrutor384); 
            CONSTRUTOR57_tree = 
            (Object)adaptor.create(CONSTRUTOR57)
            ;
            adaptor.addChild(root_0, CONSTRUTOR57_tree);


            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_assinaturaDeConstrutor386);
            modificadorDeAcessoMasculino58=modificadorDeAcessoMasculino();

            state._fsp--;

            adaptor.addChild(root_0, modificadorDeAcessoMasculino58.getTree());

            IDENTIFICADOR59=(Token)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_assinaturaDeConstrutor388); 
            IDENTIFICADOR59_tree = 
            (Object)adaptor.create(IDENTIFICADOR59)
            ;
            adaptor.addChild(root_0, IDENTIFICADOR59_tree);


            pushFollow(FOLLOW_listaDeArgumentos_in_assinaturaDeConstrutor390);
            listaDeArgumentos60=listaDeArgumentos();

            state._fsp--;

            adaptor.addChild(root_0, listaDeArgumentos60.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assinaturaDeConstrutor"


    public static class assinaturaDeDestrutor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assinaturaDeDestrutor"
    // fontes/g/CanecaSintatico.g:229:1: assinaturaDeDestrutor : DESTRUTOR modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentosVazia ;
    public final CanecaSintatico.assinaturaDeDestrutor_return assinaturaDeDestrutor() throws RecognitionException {
        CanecaSintatico.assinaturaDeDestrutor_return retval = new CanecaSintatico.assinaturaDeDestrutor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DESTRUTOR61=null;
        Token IDENTIFICADOR63=null;
        CanecaSintatico.modificadorDeAcessoMasculino_return modificadorDeAcessoMasculino62 =null;

        CanecaSintatico.listaDeArgumentosVazia_return listaDeArgumentosVazia64 =null;


        Object DESTRUTOR61_tree=null;
        Object IDENTIFICADOR63_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:230:2: ( DESTRUTOR modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentosVazia )
            // fontes/g/CanecaSintatico.g:230:4: DESTRUTOR modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentosVazia
            {
            root_0 = (Object)adaptor.nil();


            DESTRUTOR61=(Token)match(input,DESTRUTOR,FOLLOW_DESTRUTOR_in_assinaturaDeDestrutor401); 
            DESTRUTOR61_tree = 
            (Object)adaptor.create(DESTRUTOR61)
            ;
            adaptor.addChild(root_0, DESTRUTOR61_tree);


            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_assinaturaDeDestrutor403);
            modificadorDeAcessoMasculino62=modificadorDeAcessoMasculino();

            state._fsp--;

            adaptor.addChild(root_0, modificadorDeAcessoMasculino62.getTree());

            IDENTIFICADOR63=(Token)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_assinaturaDeDestrutor405); 
            IDENTIFICADOR63_tree = 
            (Object)adaptor.create(IDENTIFICADOR63)
            ;
            adaptor.addChild(root_0, IDENTIFICADOR63_tree);


            pushFollow(FOLLOW_listaDeArgumentosVazia_in_assinaturaDeDestrutor407);
            listaDeArgumentosVazia64=listaDeArgumentosVazia();

            state._fsp--;

            adaptor.addChild(root_0, listaDeArgumentosVazia64.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assinaturaDeDestrutor"


    public static class assinaturaDeMetodo_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assinaturaDeMetodo"
    // fontes/g/CanecaSintatico.g:233:1: assinaturaDeMetodo : METODO modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR listaDeArgumentos ;
    public final CanecaSintatico.assinaturaDeMetodo_return assinaturaDeMetodo() throws RecognitionException {
        CanecaSintatico.assinaturaDeMetodo_return retval = new CanecaSintatico.assinaturaDeMetodo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token METODO65=null;
        Token ESTATICO67=null;
        Token IDENTIFICADOR69=null;
        CanecaSintatico.modificadorDeAcessoMasculino_return modificadorDeAcessoMasculino66 =null;

        CanecaSintatico.tipo_return tipo68 =null;

        CanecaSintatico.listaDeArgumentos_return listaDeArgumentos70 =null;


        Object METODO65_tree=null;
        Object ESTATICO67_tree=null;
        Object IDENTIFICADOR69_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:234:2: ( METODO modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR listaDeArgumentos )
            // fontes/g/CanecaSintatico.g:234:4: METODO modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR listaDeArgumentos
            {
            root_0 = (Object)adaptor.nil();


            METODO65=(Token)match(input,METODO,FOLLOW_METODO_in_assinaturaDeMetodo418); 
            METODO65_tree = 
            (Object)adaptor.create(METODO65)
            ;
            adaptor.addChild(root_0, METODO65_tree);


            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_assinaturaDeMetodo420);
            modificadorDeAcessoMasculino66=modificadorDeAcessoMasculino();

            state._fsp--;

            adaptor.addChild(root_0, modificadorDeAcessoMasculino66.getTree());

            // fontes/g/CanecaSintatico.g:234:40: ( ESTATICO )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ESTATICO) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:234:41: ESTATICO
                    {
                    ESTATICO67=(Token)match(input,ESTATICO,FOLLOW_ESTATICO_in_assinaturaDeMetodo423); 
                    ESTATICO67_tree = 
                    (Object)adaptor.create(ESTATICO67)
                    ;
                    adaptor.addChild(root_0, ESTATICO67_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_assinaturaDeMetodo427);
            tipo68=tipo();

            state._fsp--;

            adaptor.addChild(root_0, tipo68.getTree());

            IDENTIFICADOR69=(Token)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_assinaturaDeMetodo429); 
            IDENTIFICADOR69_tree = 
            (Object)adaptor.create(IDENTIFICADOR69)
            ;
            adaptor.addChild(root_0, IDENTIFICADOR69_tree);


            pushFollow(FOLLOW_listaDeArgumentos_in_assinaturaDeMetodo431);
            listaDeArgumentos70=listaDeArgumentos();

            state._fsp--;

            adaptor.addChild(root_0, listaDeArgumentos70.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assinaturaDeMetodo"


    public static class modificadorDeAcessoMasculino_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "modificadorDeAcessoMasculino"
    // fontes/g/CanecaSintatico.g:237:1: modificadorDeAcessoMasculino : ( PUBLICO | PRIVADO | PROTEGIDO );
    public final CanecaSintatico.modificadorDeAcessoMasculino_return modificadorDeAcessoMasculino() throws RecognitionException {
        CanecaSintatico.modificadorDeAcessoMasculino_return retval = new CanecaSintatico.modificadorDeAcessoMasculino_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set71=null;

        Object set71_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:238:2: ( PUBLICO | PRIVADO | PROTEGIDO )
            // fontes/g/CanecaSintatico.g:
            {
            root_0 = (Object)adaptor.nil();


            set71=(Token)input.LT(1);

            if ( input.LA(1)==PRIVADO||input.LA(1)==PROTEGIDO||input.LA(1)==PUBLICO ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set71)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "modificadorDeAcessoMasculino"


    public static class modificadorDeAcessoFeminino_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "modificadorDeAcessoFeminino"
    // fontes/g/CanecaSintatico.g:243:1: modificadorDeAcessoFeminino : ( PUBLICA | PRIVADA | PROTEGIDA );
    public final CanecaSintatico.modificadorDeAcessoFeminino_return modificadorDeAcessoFeminino() throws RecognitionException {
        CanecaSintatico.modificadorDeAcessoFeminino_return retval = new CanecaSintatico.modificadorDeAcessoFeminino_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set72=null;

        Object set72_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:244:2: ( PUBLICA | PRIVADA | PROTEGIDA )
            // fontes/g/CanecaSintatico.g:
            {
            root_0 = (Object)adaptor.nil();


            set72=(Token)input.LT(1);

            if ( input.LA(1)==PRIVADA||input.LA(1)==PROTEGIDA||input.LA(1)==PUBLICA ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set72)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "modificadorDeAcessoFeminino"


    public static class listaDeParametros_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listaDeParametros"
    // fontes/g/CanecaSintatico.g:249:1: listaDeParametros : PARENTESE_ESQUERDO ( expressao ( SEPARADOR expressao )* )? PARENTESE_DIREITO ;
    public final CanecaSintatico.listaDeParametros_return listaDeParametros() throws RecognitionException {
        CanecaSintatico.listaDeParametros_return retval = new CanecaSintatico.listaDeParametros_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PARENTESE_ESQUERDO73=null;
        Token SEPARADOR75=null;
        Token PARENTESE_DIREITO77=null;
        CanecaSintatico.expressao_return expressao74 =null;

        CanecaSintatico.expressao_return expressao76 =null;


        Object PARENTESE_ESQUERDO73_tree=null;
        Object SEPARADOR75_tree=null;
        Object PARENTESE_DIREITO77_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:250:2: ( PARENTESE_ESQUERDO ( expressao ( SEPARADOR expressao )* )? PARENTESE_DIREITO )
            // fontes/g/CanecaSintatico.g:250:4: PARENTESE_ESQUERDO ( expressao ( SEPARADOR expressao )* )? PARENTESE_DIREITO
            {
            root_0 = (Object)adaptor.nil();


            PARENTESE_ESQUERDO73=(Token)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_listaDeParametros484); 
            PARENTESE_ESQUERDO73_tree = 
            (Object)adaptor.create(PARENTESE_ESQUERDO73)
            ;
            adaptor.addChild(root_0, PARENTESE_ESQUERDO73_tree);


            // fontes/g/CanecaSintatico.g:250:23: ( expressao ( SEPARADOR expressao )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0 >= CONSTANTE_INTEIRA && LA13_0 <= CONSTANTE_REAL)||(LA13_0 >= ESSA && LA13_0 <= ESSE)||LA13_0==IDENTIFICADOR||(LA13_0 >= LITERAL_CARACTERE && LA13_0 <= LITERAL_TEXTO)||(LA13_0 >= NEGACAO && LA13_0 <= NOVO)||LA13_0==PARENTESE_ESQUERDO||LA13_0==SUBTRACAO||(LA13_0 >= VALOR_BOOLEANO && LA13_0 <= VALOR_NULO)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:250:24: expressao ( SEPARADOR expressao )*
                    {
                    pushFollow(FOLLOW_expressao_in_listaDeParametros487);
                    expressao74=expressao();

                    state._fsp--;

                    adaptor.addChild(root_0, expressao74.getTree());

                    // fontes/g/CanecaSintatico.g:250:34: ( SEPARADOR expressao )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==SEPARADOR) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // fontes/g/CanecaSintatico.g:250:35: SEPARADOR expressao
                    	    {
                    	    SEPARADOR75=(Token)match(input,SEPARADOR,FOLLOW_SEPARADOR_in_listaDeParametros490); 
                    	    SEPARADOR75_tree = 
                    	    (Object)adaptor.create(SEPARADOR75)
                    	    ;
                    	    adaptor.addChild(root_0, SEPARADOR75_tree);


                    	    pushFollow(FOLLOW_expressao_in_listaDeParametros492);
                    	    expressao76=expressao();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expressao76.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }


            PARENTESE_DIREITO77=(Token)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_listaDeParametros498); 
            PARENTESE_DIREITO77_tree = 
            (Object)adaptor.create(PARENTESE_DIREITO77)
            ;
            adaptor.addChild(root_0, PARENTESE_DIREITO77_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listaDeParametros"


    public static class listaDeArgumentosVazia_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listaDeArgumentosVazia"
    // fontes/g/CanecaSintatico.g:253:1: listaDeArgumentosVazia : PARENTESE_ESQUERDO PARENTESE_DIREITO ;
    public final CanecaSintatico.listaDeArgumentosVazia_return listaDeArgumentosVazia() throws RecognitionException {
        CanecaSintatico.listaDeArgumentosVazia_return retval = new CanecaSintatico.listaDeArgumentosVazia_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PARENTESE_ESQUERDO78=null;
        Token PARENTESE_DIREITO79=null;

        Object PARENTESE_ESQUERDO78_tree=null;
        Object PARENTESE_DIREITO79_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:254:2: ( PARENTESE_ESQUERDO PARENTESE_DIREITO )
            // fontes/g/CanecaSintatico.g:254:4: PARENTESE_ESQUERDO PARENTESE_DIREITO
            {
            root_0 = (Object)adaptor.nil();


            PARENTESE_ESQUERDO78=(Token)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_listaDeArgumentosVazia509); 
            PARENTESE_ESQUERDO78_tree = 
            (Object)adaptor.create(PARENTESE_ESQUERDO78)
            ;
            adaptor.addChild(root_0, PARENTESE_ESQUERDO78_tree);


            PARENTESE_DIREITO79=(Token)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_listaDeArgumentosVazia511); 
            PARENTESE_DIREITO79_tree = 
            (Object)adaptor.create(PARENTESE_DIREITO79)
            ;
            adaptor.addChild(root_0, PARENTESE_DIREITO79_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listaDeArgumentosVazia"


    public static class listaDeArgumentos_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listaDeArgumentos"
    // fontes/g/CanecaSintatico.g:257:1: listaDeArgumentos : PARENTESE_ESQUERDO ( declaracao ( SEPARADOR declaracao )* )? PARENTESE_DIREITO ;
    public final CanecaSintatico.listaDeArgumentos_return listaDeArgumentos() throws RecognitionException {
        CanecaSintatico.listaDeArgumentos_return retval = new CanecaSintatico.listaDeArgumentos_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PARENTESE_ESQUERDO80=null;
        Token SEPARADOR82=null;
        Token PARENTESE_DIREITO84=null;
        CanecaSintatico.declaracao_return declaracao81 =null;

        CanecaSintatico.declaracao_return declaracao83 =null;


        Object PARENTESE_ESQUERDO80_tree=null;
        Object SEPARADOR82_tree=null;
        Object PARENTESE_DIREITO84_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:258:2: ( PARENTESE_ESQUERDO ( declaracao ( SEPARADOR declaracao )* )? PARENTESE_DIREITO )
            // fontes/g/CanecaSintatico.g:258:4: PARENTESE_ESQUERDO ( declaracao ( SEPARADOR declaracao )* )? PARENTESE_DIREITO
            {
            root_0 = (Object)adaptor.nil();


            PARENTESE_ESQUERDO80=(Token)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_listaDeArgumentos522); 
            PARENTESE_ESQUERDO80_tree = 
            (Object)adaptor.create(PARENTESE_ESQUERDO80)
            ;
            adaptor.addChild(root_0, PARENTESE_ESQUERDO80_tree);


            // fontes/g/CanecaSintatico.g:258:23: ( declaracao ( SEPARADOR declaracao )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENTIFICADOR) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:258:24: declaracao ( SEPARADOR declaracao )*
                    {
                    pushFollow(FOLLOW_declaracao_in_listaDeArgumentos525);
                    declaracao81=declaracao();

                    state._fsp--;

                    adaptor.addChild(root_0, declaracao81.getTree());

                    // fontes/g/CanecaSintatico.g:258:35: ( SEPARADOR declaracao )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==SEPARADOR) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // fontes/g/CanecaSintatico.g:258:36: SEPARADOR declaracao
                    	    {
                    	    SEPARADOR82=(Token)match(input,SEPARADOR,FOLLOW_SEPARADOR_in_listaDeArgumentos528); 
                    	    SEPARADOR82_tree = 
                    	    (Object)adaptor.create(SEPARADOR82)
                    	    ;
                    	    adaptor.addChild(root_0, SEPARADOR82_tree);


                    	    pushFollow(FOLLOW_declaracao_in_listaDeArgumentos530);
                    	    declaracao83=declaracao();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, declaracao83.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }


            PARENTESE_DIREITO84=(Token)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_listaDeArgumentos536); 
            PARENTESE_DIREITO84_tree = 
            (Object)adaptor.create(PARENTESE_DIREITO84)
            ;
            adaptor.addChild(root_0, PARENTESE_DIREITO84_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listaDeArgumentos"


    public static class listaDeInterfaces_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listaDeInterfaces"
    // fontes/g/CanecaSintatico.g:261:1: listaDeInterfaces : ( IMPLEMENTA tipo ( SEPARADOR tipo )* )? ;
    public final CanecaSintatico.listaDeInterfaces_return listaDeInterfaces() throws RecognitionException {
        CanecaSintatico.listaDeInterfaces_return retval = new CanecaSintatico.listaDeInterfaces_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IMPLEMENTA85=null;
        Token SEPARADOR87=null;
        CanecaSintatico.tipo_return tipo86 =null;

        CanecaSintatico.tipo_return tipo88 =null;


        Object IMPLEMENTA85_tree=null;
        Object SEPARADOR87_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:262:2: ( ( IMPLEMENTA tipo ( SEPARADOR tipo )* )? )
            // fontes/g/CanecaSintatico.g:262:4: ( IMPLEMENTA tipo ( SEPARADOR tipo )* )?
            {
            root_0 = (Object)adaptor.nil();


            // fontes/g/CanecaSintatico.g:262:4: ( IMPLEMENTA tipo ( SEPARADOR tipo )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IMPLEMENTA) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:262:5: IMPLEMENTA tipo ( SEPARADOR tipo )*
                    {
                    IMPLEMENTA85=(Token)match(input,IMPLEMENTA,FOLLOW_IMPLEMENTA_in_listaDeInterfaces548); 
                    IMPLEMENTA85_tree = 
                    (Object)adaptor.create(IMPLEMENTA85)
                    ;
                    adaptor.addChild(root_0, IMPLEMENTA85_tree);


                    pushFollow(FOLLOW_tipo_in_listaDeInterfaces550);
                    tipo86=tipo();

                    state._fsp--;

                    adaptor.addChild(root_0, tipo86.getTree());

                    // fontes/g/CanecaSintatico.g:262:21: ( SEPARADOR tipo )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==SEPARADOR) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // fontes/g/CanecaSintatico.g:262:22: SEPARADOR tipo
                    	    {
                    	    SEPARADOR87=(Token)match(input,SEPARADOR,FOLLOW_SEPARADOR_in_listaDeInterfaces553); 
                    	    SEPARADOR87_tree = 
                    	    (Object)adaptor.create(SEPARADOR87)
                    	    ;
                    	    adaptor.addChild(root_0, SEPARADOR87_tree);


                    	    pushFollow(FOLLOW_tipo_in_listaDeInterfaces555);
                    	    tipo88=tipo();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, tipo88.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listaDeInterfaces"


    public static class listaDeTiposGenericos_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listaDeTiposGenericos"
    // fontes/g/CanecaSintatico.g:265:1: listaDeTiposGenericos : ( COLCHETE_ESQUERDO tipoGenerico COLCHETE_DIREITO )* ;
    public final CanecaSintatico.listaDeTiposGenericos_return listaDeTiposGenericos() throws RecognitionException {
        CanecaSintatico.listaDeTiposGenericos_return retval = new CanecaSintatico.listaDeTiposGenericos_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COLCHETE_ESQUERDO89=null;
        Token COLCHETE_DIREITO91=null;
        CanecaSintatico.tipoGenerico_return tipoGenerico90 =null;


        Object COLCHETE_ESQUERDO89_tree=null;
        Object COLCHETE_DIREITO91_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:266:2: ( ( COLCHETE_ESQUERDO tipoGenerico COLCHETE_DIREITO )* )
            // fontes/g/CanecaSintatico.g:266:4: ( COLCHETE_ESQUERDO tipoGenerico COLCHETE_DIREITO )*
            {
            root_0 = (Object)adaptor.nil();


            // fontes/g/CanecaSintatico.g:266:4: ( COLCHETE_ESQUERDO tipoGenerico COLCHETE_DIREITO )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==COLCHETE_ESQUERDO) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // fontes/g/CanecaSintatico.g:266:5: COLCHETE_ESQUERDO tipoGenerico COLCHETE_DIREITO
            	    {
            	    COLCHETE_ESQUERDO89=(Token)match(input,COLCHETE_ESQUERDO,FOLLOW_COLCHETE_ESQUERDO_in_listaDeTiposGenericos571); 
            	    COLCHETE_ESQUERDO89_tree = 
            	    (Object)adaptor.create(COLCHETE_ESQUERDO89)
            	    ;
            	    adaptor.addChild(root_0, COLCHETE_ESQUERDO89_tree);


            	    pushFollow(FOLLOW_tipoGenerico_in_listaDeTiposGenericos573);
            	    tipoGenerico90=tipoGenerico();

            	    state._fsp--;

            	    adaptor.addChild(root_0, tipoGenerico90.getTree());

            	    COLCHETE_DIREITO91=(Token)match(input,COLCHETE_DIREITO,FOLLOW_COLCHETE_DIREITO_in_listaDeTiposGenericos575); 
            	    COLCHETE_DIREITO91_tree = 
            	    (Object)adaptor.create(COLCHETE_DIREITO91)
            	    ;
            	    adaptor.addChild(root_0, COLCHETE_DIREITO91_tree);


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listaDeTiposGenericos"


    public static class listaDeTipos_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listaDeTipos"
    // fontes/g/CanecaSintatico.g:269:1: listaDeTipos : ( COLCHETE_ESQUERDO tipo ( SEPARADOR tipo )* COLCHETE_DIREITO )? ;
    public final CanecaSintatico.listaDeTipos_return listaDeTipos() throws RecognitionException {
        CanecaSintatico.listaDeTipos_return retval = new CanecaSintatico.listaDeTipos_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COLCHETE_ESQUERDO92=null;
        Token SEPARADOR94=null;
        Token COLCHETE_DIREITO96=null;
        CanecaSintatico.tipo_return tipo93 =null;

        CanecaSintatico.tipo_return tipo95 =null;


        Object COLCHETE_ESQUERDO92_tree=null;
        Object SEPARADOR94_tree=null;
        Object COLCHETE_DIREITO96_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:270:2: ( ( COLCHETE_ESQUERDO tipo ( SEPARADOR tipo )* COLCHETE_DIREITO )? )
            // fontes/g/CanecaSintatico.g:270:4: ( COLCHETE_ESQUERDO tipo ( SEPARADOR tipo )* COLCHETE_DIREITO )?
            {
            root_0 = (Object)adaptor.nil();


            // fontes/g/CanecaSintatico.g:270:4: ( COLCHETE_ESQUERDO tipo ( SEPARADOR tipo )* COLCHETE_DIREITO )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==COLCHETE_ESQUERDO) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:270:5: COLCHETE_ESQUERDO tipo ( SEPARADOR tipo )* COLCHETE_DIREITO
                    {
                    COLCHETE_ESQUERDO92=(Token)match(input,COLCHETE_ESQUERDO,FOLLOW_COLCHETE_ESQUERDO_in_listaDeTipos589); 
                    COLCHETE_ESQUERDO92_tree = 
                    (Object)adaptor.create(COLCHETE_ESQUERDO92)
                    ;
                    adaptor.addChild(root_0, COLCHETE_ESQUERDO92_tree);


                    pushFollow(FOLLOW_tipo_in_listaDeTipos591);
                    tipo93=tipo();

                    state._fsp--;

                    adaptor.addChild(root_0, tipo93.getTree());

                    // fontes/g/CanecaSintatico.g:270:28: ( SEPARADOR tipo )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==SEPARADOR) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // fontes/g/CanecaSintatico.g:270:29: SEPARADOR tipo
                    	    {
                    	    SEPARADOR94=(Token)match(input,SEPARADOR,FOLLOW_SEPARADOR_in_listaDeTipos594); 
                    	    SEPARADOR94_tree = 
                    	    (Object)adaptor.create(SEPARADOR94)
                    	    ;
                    	    adaptor.addChild(root_0, SEPARADOR94_tree);


                    	    pushFollow(FOLLOW_tipo_in_listaDeTipos596);
                    	    tipo95=tipo();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, tipo95.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    COLCHETE_DIREITO96=(Token)match(input,COLCHETE_DIREITO,FOLLOW_COLCHETE_DIREITO_in_listaDeTipos600); 
                    COLCHETE_DIREITO96_tree = 
                    (Object)adaptor.create(COLCHETE_DIREITO96)
                    ;
                    adaptor.addChild(root_0, COLCHETE_DIREITO96_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listaDeTipos"


    public static class listaDeCapturas_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listaDeCapturas"
    // fontes/g/CanecaSintatico.g:273:1: listaDeCapturas : ( capture )+ ;
    public final CanecaSintatico.listaDeCapturas_return listaDeCapturas() throws RecognitionException {
        CanecaSintatico.listaDeCapturas_return retval = new CanecaSintatico.listaDeCapturas_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CanecaSintatico.capture_return capture97 =null;



        try {
            // fontes/g/CanecaSintatico.g:274:2: ( ( capture )+ )
            // fontes/g/CanecaSintatico.g:274:4: ( capture )+
            {
            root_0 = (Object)adaptor.nil();


            // fontes/g/CanecaSintatico.g:274:4: ( capture )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==CAPTURE) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // fontes/g/CanecaSintatico.g:274:5: capture
            	    {
            	    pushFollow(FOLLOW_capture_in_listaDeCapturas614);
            	    capture97=capture();

            	    state._fsp--;

            	    adaptor.addChild(root_0, capture97.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listaDeCapturas"


    public static class tipoGenerico_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tipoGenerico"
    // fontes/g/CanecaSintatico.g:277:1: tipoGenerico : IDENTIFICADOR listaDeInterfaces ;
    public final CanecaSintatico.tipoGenerico_return tipoGenerico() throws RecognitionException {
        CanecaSintatico.tipoGenerico_return retval = new CanecaSintatico.tipoGenerico_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFICADOR98=null;
        CanecaSintatico.listaDeInterfaces_return listaDeInterfaces99 =null;


        Object IDENTIFICADOR98_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:278:2: ( IDENTIFICADOR listaDeInterfaces )
            // fontes/g/CanecaSintatico.g:278:4: IDENTIFICADOR listaDeInterfaces
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFICADOR98=(Token)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_tipoGenerico627); 
            IDENTIFICADOR98_tree = 
            (Object)adaptor.create(IDENTIFICADOR98)
            ;
            adaptor.addChild(root_0, IDENTIFICADOR98_tree);


            pushFollow(FOLLOW_listaDeInterfaces_in_tipoGenerico629);
            listaDeInterfaces99=listaDeInterfaces();

            state._fsp--;

            adaptor.addChild(root_0, listaDeInterfaces99.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tipoGenerico"


    public static class tipo_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tipo"
    // fontes/g/CanecaSintatico.g:281:1: tipo : IDENTIFICADOR listaDeTipos ;
    public final CanecaSintatico.tipo_return tipo() throws RecognitionException {
        CanecaSintatico.tipo_return retval = new CanecaSintatico.tipo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFICADOR100=null;
        CanecaSintatico.listaDeTipos_return listaDeTipos101 =null;


        Object IDENTIFICADOR100_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:282:2: ( IDENTIFICADOR listaDeTipos )
            // fontes/g/CanecaSintatico.g:282:4: IDENTIFICADOR listaDeTipos
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFICADOR100=(Token)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_tipo640); 
            IDENTIFICADOR100_tree = 
            (Object)adaptor.create(IDENTIFICADOR100)
            ;
            adaptor.addChild(root_0, IDENTIFICADOR100_tree);


            pushFollow(FOLLOW_listaDeTipos_in_tipo642);
            listaDeTipos101=listaDeTipos();

            state._fsp--;

            adaptor.addChild(root_0, listaDeTipos101.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tipo"


    public static class declaracao_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaracao"
    // fontes/g/CanecaSintatico.g:285:1: declaracao : tipo IDENTIFICADOR ;
    public final CanecaSintatico.declaracao_return declaracao() throws RecognitionException {
        CanecaSintatico.declaracao_return retval = new CanecaSintatico.declaracao_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFICADOR103=null;
        CanecaSintatico.tipo_return tipo102 =null;


        Object IDENTIFICADOR103_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:286:2: ( tipo IDENTIFICADOR )
            // fontes/g/CanecaSintatico.g:286:4: tipo IDENTIFICADOR
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_tipo_in_declaracao653);
            tipo102=tipo();

            state._fsp--;

            adaptor.addChild(root_0, tipo102.getTree());

            IDENTIFICADOR103=(Token)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_declaracao655); 
            IDENTIFICADOR103_tree = 
            (Object)adaptor.create(IDENTIFICADOR103)
            ;
            adaptor.addChild(root_0, IDENTIFICADOR103_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaracao"


    public static class expressao_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressao"
    // fontes/g/CanecaSintatico.g:299:1: expressao : expressaoOuLogico ( ATRIBUIDOR expressaoOuLogico )? ;
    public final CanecaSintatico.expressao_return expressao() throws RecognitionException {
        CanecaSintatico.expressao_return retval = new CanecaSintatico.expressao_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ATRIBUIDOR105=null;
        CanecaSintatico.expressaoOuLogico_return expressaoOuLogico104 =null;

        CanecaSintatico.expressaoOuLogico_return expressaoOuLogico106 =null;


        Object ATRIBUIDOR105_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:300:2: ( expressaoOuLogico ( ATRIBUIDOR expressaoOuLogico )? )
            // fontes/g/CanecaSintatico.g:300:4: expressaoOuLogico ( ATRIBUIDOR expressaoOuLogico )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expressaoOuLogico_in_expressao669);
            expressaoOuLogico104=expressaoOuLogico();

            state._fsp--;

            adaptor.addChild(root_0, expressaoOuLogico104.getTree());

            // fontes/g/CanecaSintatico.g:300:22: ( ATRIBUIDOR expressaoOuLogico )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ATRIBUIDOR) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:300:23: ATRIBUIDOR expressaoOuLogico
                    {
                    ATRIBUIDOR105=(Token)match(input,ATRIBUIDOR,FOLLOW_ATRIBUIDOR_in_expressao672); 
                    ATRIBUIDOR105_tree = 
                    (Object)adaptor.create(ATRIBUIDOR105)
                    ;
                    adaptor.addChild(root_0, ATRIBUIDOR105_tree);


                    pushFollow(FOLLOW_expressaoOuLogico_in_expressao674);
                    expressaoOuLogico106=expressaoOuLogico();

                    state._fsp--;

                    adaptor.addChild(root_0, expressaoOuLogico106.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressao"


    public static class expressaoOuLogico_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressaoOuLogico"
    // fontes/g/CanecaSintatico.g:303:1: expressaoOuLogico : expressaoELogico ( OU expressaoELogico )* ;
    public final CanecaSintatico.expressaoOuLogico_return expressaoOuLogico() throws RecognitionException {
        CanecaSintatico.expressaoOuLogico_return retval = new CanecaSintatico.expressaoOuLogico_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OU108=null;
        CanecaSintatico.expressaoELogico_return expressaoELogico107 =null;

        CanecaSintatico.expressaoELogico_return expressaoELogico109 =null;


        Object OU108_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:304:2: ( expressaoELogico ( OU expressaoELogico )* )
            // fontes/g/CanecaSintatico.g:304:4: expressaoELogico ( OU expressaoELogico )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expressaoELogico_in_expressaoOuLogico687);
            expressaoELogico107=expressaoELogico();

            state._fsp--;

            adaptor.addChild(root_0, expressaoELogico107.getTree());

            // fontes/g/CanecaSintatico.g:304:21: ( OU expressaoELogico )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==OU) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // fontes/g/CanecaSintatico.g:304:22: OU expressaoELogico
            	    {
            	    OU108=(Token)match(input,OU,FOLLOW_OU_in_expressaoOuLogico690); 
            	    OU108_tree = 
            	    (Object)adaptor.create(OU108)
            	    ;
            	    adaptor.addChild(root_0, OU108_tree);


            	    pushFollow(FOLLOW_expressaoELogico_in_expressaoOuLogico692);
            	    expressaoELogico109=expressaoELogico();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expressaoELogico109.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressaoOuLogico"


    public static class expressaoELogico_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressaoELogico"
    // fontes/g/CanecaSintatico.g:307:1: expressaoELogico : expressaoComparacaoLogica ( E expressaoComparacaoLogica )* ;
    public final CanecaSintatico.expressaoELogico_return expressaoELogico() throws RecognitionException {
        CanecaSintatico.expressaoELogico_return retval = new CanecaSintatico.expressaoELogico_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token E111=null;
        CanecaSintatico.expressaoComparacaoLogica_return expressaoComparacaoLogica110 =null;

        CanecaSintatico.expressaoComparacaoLogica_return expressaoComparacaoLogica112 =null;


        Object E111_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:308:2: ( expressaoComparacaoLogica ( E expressaoComparacaoLogica )* )
            // fontes/g/CanecaSintatico.g:308:4: expressaoComparacaoLogica ( E expressaoComparacaoLogica )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expressaoComparacaoLogica_in_expressaoELogico705);
            expressaoComparacaoLogica110=expressaoComparacaoLogica();

            state._fsp--;

            adaptor.addChild(root_0, expressaoComparacaoLogica110.getTree());

            // fontes/g/CanecaSintatico.g:308:30: ( E expressaoComparacaoLogica )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==E) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // fontes/g/CanecaSintatico.g:308:31: E expressaoComparacaoLogica
            	    {
            	    E111=(Token)match(input,E,FOLLOW_E_in_expressaoELogico708); 
            	    E111_tree = 
            	    (Object)adaptor.create(E111)
            	    ;
            	    adaptor.addChild(root_0, E111_tree);


            	    pushFollow(FOLLOW_expressaoComparacaoLogica_in_expressaoELogico710);
            	    expressaoComparacaoLogica112=expressaoComparacaoLogica();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expressaoComparacaoLogica112.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressaoELogico"


    public static class expressaoComparacaoLogica_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressaoComparacaoLogica"
    // fontes/g/CanecaSintatico.g:311:1: expressaoComparacaoLogica : expressaoAditiva ( ( IGUAL | DIFERENTE | MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) expressaoAditiva )* ;
    public final CanecaSintatico.expressaoComparacaoLogica_return expressaoComparacaoLogica() throws RecognitionException {
        CanecaSintatico.expressaoComparacaoLogica_return retval = new CanecaSintatico.expressaoComparacaoLogica_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set114=null;
        CanecaSintatico.expressaoAditiva_return expressaoAditiva113 =null;

        CanecaSintatico.expressaoAditiva_return expressaoAditiva115 =null;


        Object set114_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:312:2: ( expressaoAditiva ( ( IGUAL | DIFERENTE | MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) expressaoAditiva )* )
            // fontes/g/CanecaSintatico.g:312:4: expressaoAditiva ( ( IGUAL | DIFERENTE | MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) expressaoAditiva )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica723);
            expressaoAditiva113=expressaoAditiva();

            state._fsp--;

            adaptor.addChild(root_0, expressaoAditiva113.getTree());

            // fontes/g/CanecaSintatico.g:312:21: ( ( IGUAL | DIFERENTE | MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) expressaoAditiva )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==DIFERENTE||LA25_0==IGUAL||(LA25_0 >= MAIOR && LA25_0 <= MENOR_IGUAL)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // fontes/g/CanecaSintatico.g:312:22: ( IGUAL | DIFERENTE | MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) expressaoAditiva
            	    {
            	    set114=(Token)input.LT(1);

            	    if ( input.LA(1)==DIFERENTE||input.LA(1)==IGUAL||(input.LA(1) >= MAIOR && input.LA(1) <= MENOR_IGUAL) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set114)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica750);
            	    expressaoAditiva115=expressaoAditiva();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expressaoAditiva115.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressaoComparacaoLogica"


    public static class expressaoAditiva_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressaoAditiva"
    // fontes/g/CanecaSintatico.g:315:1: expressaoAditiva : expressaoMultiplicativa ( ( SOMA | SUBTRACAO ) expressaoMultiplicativa )* ;
    public final CanecaSintatico.expressaoAditiva_return expressaoAditiva() throws RecognitionException {
        CanecaSintatico.expressaoAditiva_return retval = new CanecaSintatico.expressaoAditiva_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set117=null;
        CanecaSintatico.expressaoMultiplicativa_return expressaoMultiplicativa116 =null;

        CanecaSintatico.expressaoMultiplicativa_return expressaoMultiplicativa118 =null;


        Object set117_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:316:2: ( expressaoMultiplicativa ( ( SOMA | SUBTRACAO ) expressaoMultiplicativa )* )
            // fontes/g/CanecaSintatico.g:316:4: expressaoMultiplicativa ( ( SOMA | SUBTRACAO ) expressaoMultiplicativa )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expressaoMultiplicativa_in_expressaoAditiva763);
            expressaoMultiplicativa116=expressaoMultiplicativa();

            state._fsp--;

            adaptor.addChild(root_0, expressaoMultiplicativa116.getTree());

            // fontes/g/CanecaSintatico.g:316:28: ( ( SOMA | SUBTRACAO ) expressaoMultiplicativa )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0 >= SOMA && LA26_0 <= SUBTRACAO)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // fontes/g/CanecaSintatico.g:316:29: ( SOMA | SUBTRACAO ) expressaoMultiplicativa
            	    {
            	    set117=(Token)input.LT(1);

            	    if ( (input.LA(1) >= SOMA && input.LA(1) <= SUBTRACAO) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set117)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_expressaoMultiplicativa_in_expressaoAditiva774);
            	    expressaoMultiplicativa118=expressaoMultiplicativa();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expressaoMultiplicativa118.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressaoAditiva"


    public static class expressaoMultiplicativa_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressaoMultiplicativa"
    // fontes/g/CanecaSintatico.g:319:1: expressaoMultiplicativa : expressaoUnaria ( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) expressaoUnaria )* ;
    public final CanecaSintatico.expressaoMultiplicativa_return expressaoMultiplicativa() throws RecognitionException {
        CanecaSintatico.expressaoMultiplicativa_return retval = new CanecaSintatico.expressaoMultiplicativa_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set120=null;
        CanecaSintatico.expressaoUnaria_return expressaoUnaria119 =null;

        CanecaSintatico.expressaoUnaria_return expressaoUnaria121 =null;


        Object set120_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:320:2: ( expressaoUnaria ( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) expressaoUnaria )* )
            // fontes/g/CanecaSintatico.g:320:4: expressaoUnaria ( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) expressaoUnaria )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expressaoUnaria_in_expressaoMultiplicativa787);
            expressaoUnaria119=expressaoUnaria();

            state._fsp--;

            adaptor.addChild(root_0, expressaoUnaria119.getTree());

            // fontes/g/CanecaSintatico.g:320:20: ( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) expressaoUnaria )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==DIVISAO||LA27_0==MULTIPLICACAO||LA27_0==RESTO_DA_DIVISAO) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // fontes/g/CanecaSintatico.g:320:21: ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) expressaoUnaria
            	    {
            	    set120=(Token)input.LT(1);

            	    if ( input.LA(1)==DIVISAO||input.LA(1)==MULTIPLICACAO||input.LA(1)==RESTO_DA_DIVISAO ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set120)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_expressaoUnaria_in_expressaoMultiplicativa802);
            	    expressaoUnaria121=expressaoUnaria();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expressaoUnaria121.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressaoMultiplicativa"


    public static class expressaoUnaria_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressaoUnaria"
    // fontes/g/CanecaSintatico.g:323:1: expressaoUnaria : ( expressaoPrimaria | SUBTRACAO expressaoPrimaria | NEGACAO expressaoPrimaria );
    public final CanecaSintatico.expressaoUnaria_return expressaoUnaria() throws RecognitionException {
        CanecaSintatico.expressaoUnaria_return retval = new CanecaSintatico.expressaoUnaria_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SUBTRACAO123=null;
        Token NEGACAO125=null;
        CanecaSintatico.expressaoPrimaria_return expressaoPrimaria122 =null;

        CanecaSintatico.expressaoPrimaria_return expressaoPrimaria124 =null;

        CanecaSintatico.expressaoPrimaria_return expressaoPrimaria126 =null;


        Object SUBTRACAO123_tree=null;
        Object NEGACAO125_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:324:2: ( expressaoPrimaria | SUBTRACAO expressaoPrimaria | NEGACAO expressaoPrimaria )
            int alt28=3;
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
                alt28=1;
                }
                break;
            case SUBTRACAO:
                {
                alt28=2;
                }
                break;
            case NEGACAO:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:324:4: expressaoPrimaria
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expressaoPrimaria_in_expressaoUnaria815);
                    expressaoPrimaria122=expressaoPrimaria();

                    state._fsp--;

                    adaptor.addChild(root_0, expressaoPrimaria122.getTree());

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSintatico.g:325:4: SUBTRACAO expressaoPrimaria
                    {
                    root_0 = (Object)adaptor.nil();


                    SUBTRACAO123=(Token)match(input,SUBTRACAO,FOLLOW_SUBTRACAO_in_expressaoUnaria820); 
                    SUBTRACAO123_tree = 
                    (Object)adaptor.create(SUBTRACAO123)
                    ;
                    adaptor.addChild(root_0, SUBTRACAO123_tree);


                    pushFollow(FOLLOW_expressaoPrimaria_in_expressaoUnaria822);
                    expressaoPrimaria124=expressaoPrimaria();

                    state._fsp--;

                    adaptor.addChild(root_0, expressaoPrimaria124.getTree());

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSintatico.g:326:4: NEGACAO expressaoPrimaria
                    {
                    root_0 = (Object)adaptor.nil();


                    NEGACAO125=(Token)match(input,NEGACAO,FOLLOW_NEGACAO_in_expressaoUnaria827); 
                    NEGACAO125_tree = 
                    (Object)adaptor.create(NEGACAO125)
                    ;
                    adaptor.addChild(root_0, NEGACAO125_tree);


                    pushFollow(FOLLOW_expressaoPrimaria_in_expressaoUnaria829);
                    expressaoPrimaria126=expressaoPrimaria();

                    state._fsp--;

                    adaptor.addChild(root_0, expressaoPrimaria126.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressaoUnaria"


    public static class expressaoPrimaria_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressaoPrimaria"
    // fontes/g/CanecaSintatico.g:329:1: expressaoPrimaria : ( PARENTESE_ESQUERDO expressao PARENTESE_DIREITO | VALOR_BOOLEANO | VALOR_NULO | CONSTANTE_INTEIRA | CONSTANTE_REAL | LITERAL_CARACTERE | LITERAL_TEXTO | comando );
    public final CanecaSintatico.expressaoPrimaria_return expressaoPrimaria() throws RecognitionException {
        CanecaSintatico.expressaoPrimaria_return retval = new CanecaSintatico.expressaoPrimaria_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PARENTESE_ESQUERDO127=null;
        Token PARENTESE_DIREITO129=null;
        Token VALOR_BOOLEANO130=null;
        Token VALOR_NULO131=null;
        Token CONSTANTE_INTEIRA132=null;
        Token CONSTANTE_REAL133=null;
        Token LITERAL_CARACTERE134=null;
        Token LITERAL_TEXTO135=null;
        CanecaSintatico.expressao_return expressao128 =null;

        CanecaSintatico.comando_return comando136 =null;


        Object PARENTESE_ESQUERDO127_tree=null;
        Object PARENTESE_DIREITO129_tree=null;
        Object VALOR_BOOLEANO130_tree=null;
        Object VALOR_NULO131_tree=null;
        Object CONSTANTE_INTEIRA132_tree=null;
        Object CONSTANTE_REAL133_tree=null;
        Object LITERAL_CARACTERE134_tree=null;
        Object LITERAL_TEXTO135_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:330:2: ( PARENTESE_ESQUERDO expressao PARENTESE_DIREITO | VALOR_BOOLEANO | VALOR_NULO | CONSTANTE_INTEIRA | CONSTANTE_REAL | LITERAL_CARACTERE | LITERAL_TEXTO | comando )
            int alt29=8;
            switch ( input.LA(1) ) {
            case PARENTESE_ESQUERDO:
                {
                alt29=1;
                }
                break;
            case VALOR_BOOLEANO:
                {
                alt29=2;
                }
                break;
            case VALOR_NULO:
                {
                alt29=3;
                }
                break;
            case CONSTANTE_INTEIRA:
                {
                alt29=4;
                }
                break;
            case CONSTANTE_REAL:
                {
                alt29=5;
                }
                break;
            case LITERAL_CARACTERE:
                {
                alt29=6;
                }
                break;
            case LITERAL_TEXTO:
                {
                alt29=7;
                }
                break;
            case ESSA:
            case ESSE:
            case IDENTIFICADOR:
            case NOVA:
            case NOVO:
                {
                alt29=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:330:4: PARENTESE_ESQUERDO expressao PARENTESE_DIREITO
                    {
                    root_0 = (Object)adaptor.nil();


                    PARENTESE_ESQUERDO127=(Token)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_expressaoPrimaria840); 
                    PARENTESE_ESQUERDO127_tree = 
                    (Object)adaptor.create(PARENTESE_ESQUERDO127)
                    ;
                    adaptor.addChild(root_0, PARENTESE_ESQUERDO127_tree);


                    pushFollow(FOLLOW_expressao_in_expressaoPrimaria842);
                    expressao128=expressao();

                    state._fsp--;

                    adaptor.addChild(root_0, expressao128.getTree());

                    PARENTESE_DIREITO129=(Token)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_expressaoPrimaria844); 
                    PARENTESE_DIREITO129_tree = 
                    (Object)adaptor.create(PARENTESE_DIREITO129)
                    ;
                    adaptor.addChild(root_0, PARENTESE_DIREITO129_tree);


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSintatico.g:331:4: VALOR_BOOLEANO
                    {
                    root_0 = (Object)adaptor.nil();


                    VALOR_BOOLEANO130=(Token)match(input,VALOR_BOOLEANO,FOLLOW_VALOR_BOOLEANO_in_expressaoPrimaria849); 
                    VALOR_BOOLEANO130_tree = 
                    (Object)adaptor.create(VALOR_BOOLEANO130)
                    ;
                    adaptor.addChild(root_0, VALOR_BOOLEANO130_tree);


                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSintatico.g:332:4: VALOR_NULO
                    {
                    root_0 = (Object)adaptor.nil();


                    VALOR_NULO131=(Token)match(input,VALOR_NULO,FOLLOW_VALOR_NULO_in_expressaoPrimaria854); 
                    VALOR_NULO131_tree = 
                    (Object)adaptor.create(VALOR_NULO131)
                    ;
                    adaptor.addChild(root_0, VALOR_NULO131_tree);


                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSintatico.g:333:4: CONSTANTE_INTEIRA
                    {
                    root_0 = (Object)adaptor.nil();


                    CONSTANTE_INTEIRA132=(Token)match(input,CONSTANTE_INTEIRA,FOLLOW_CONSTANTE_INTEIRA_in_expressaoPrimaria859); 
                    CONSTANTE_INTEIRA132_tree = 
                    (Object)adaptor.create(CONSTANTE_INTEIRA132)
                    ;
                    adaptor.addChild(root_0, CONSTANTE_INTEIRA132_tree);


                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSintatico.g:334:4: CONSTANTE_REAL
                    {
                    root_0 = (Object)adaptor.nil();


                    CONSTANTE_REAL133=(Token)match(input,CONSTANTE_REAL,FOLLOW_CONSTANTE_REAL_in_expressaoPrimaria864); 
                    CONSTANTE_REAL133_tree = 
                    (Object)adaptor.create(CONSTANTE_REAL133)
                    ;
                    adaptor.addChild(root_0, CONSTANTE_REAL133_tree);


                    }
                    break;
                case 6 :
                    // fontes/g/CanecaSintatico.g:335:4: LITERAL_CARACTERE
                    {
                    root_0 = (Object)adaptor.nil();


                    LITERAL_CARACTERE134=(Token)match(input,LITERAL_CARACTERE,FOLLOW_LITERAL_CARACTERE_in_expressaoPrimaria869); 
                    LITERAL_CARACTERE134_tree = 
                    (Object)adaptor.create(LITERAL_CARACTERE134)
                    ;
                    adaptor.addChild(root_0, LITERAL_CARACTERE134_tree);


                    }
                    break;
                case 7 :
                    // fontes/g/CanecaSintatico.g:336:4: LITERAL_TEXTO
                    {
                    root_0 = (Object)adaptor.nil();


                    LITERAL_TEXTO135=(Token)match(input,LITERAL_TEXTO,FOLLOW_LITERAL_TEXTO_in_expressaoPrimaria874); 
                    LITERAL_TEXTO135_tree = 
                    (Object)adaptor.create(LITERAL_TEXTO135)
                    ;
                    adaptor.addChild(root_0, LITERAL_TEXTO135_tree);


                    }
                    break;
                case 8 :
                    // fontes/g/CanecaSintatico.g:337:4: comando
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_comando_in_expressaoPrimaria879);
                    comando136=comando();

                    state._fsp--;

                    adaptor.addChild(root_0, comando136.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressaoPrimaria"


    public static class comando_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comando"
    // fontes/g/CanecaSintatico.g:340:1: comando : seletor ( chamada )* ;
    public final CanecaSintatico.comando_return comando() throws RecognitionException {
        CanecaSintatico.comando_return retval = new CanecaSintatico.comando_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CanecaSintatico.seletor_return seletor137 =null;

        CanecaSintatico.chamada_return chamada138 =null;



        try {
            // fontes/g/CanecaSintatico.g:341:2: ( seletor ( chamada )* )
            // fontes/g/CanecaSintatico.g:341:4: seletor ( chamada )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_seletor_in_comando890);
            seletor137=seletor();

            state._fsp--;

            adaptor.addChild(root_0, seletor137.getTree());

            // fontes/g/CanecaSintatico.g:341:12: ( chamada )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0 >= CHAMADA_DE_CLASSE && LA30_0 <= CHAMADA_DE_OBJETO)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // fontes/g/CanecaSintatico.g:341:13: chamada
            	    {
            	    pushFollow(FOLLOW_chamada_in_comando893);
            	    chamada138=chamada();

            	    state._fsp--;

            	    adaptor.addChild(root_0, chamada138.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "comando"


    public static class seletor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "seletor"
    // fontes/g/CanecaSintatico.g:344:1: seletor : ( ESSE | ESSA | instanciacao | IDENTIFICADOR ( listaDeParametros )? );
    public final CanecaSintatico.seletor_return seletor() throws RecognitionException {
        CanecaSintatico.seletor_return retval = new CanecaSintatico.seletor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ESSE139=null;
        Token ESSA140=null;
        Token IDENTIFICADOR142=null;
        CanecaSintatico.instanciacao_return instanciacao141 =null;

        CanecaSintatico.listaDeParametros_return listaDeParametros143 =null;


        Object ESSE139_tree=null;
        Object ESSA140_tree=null;
        Object IDENTIFICADOR142_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:345:2: ( ESSE | ESSA | instanciacao | IDENTIFICADOR ( listaDeParametros )? )
            int alt32=4;
            switch ( input.LA(1) ) {
            case ESSE:
                {
                alt32=1;
                }
                break;
            case ESSA:
                {
                alt32=2;
                }
                break;
            case NOVA:
            case NOVO:
                {
                alt32=3;
                }
                break;
            case IDENTIFICADOR:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:345:4: ESSE
                    {
                    root_0 = (Object)adaptor.nil();


                    ESSE139=(Token)match(input,ESSE,FOLLOW_ESSE_in_seletor906); 
                    ESSE139_tree = 
                    (Object)adaptor.create(ESSE139)
                    ;
                    adaptor.addChild(root_0, ESSE139_tree);


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSintatico.g:346:4: ESSA
                    {
                    root_0 = (Object)adaptor.nil();


                    ESSA140=(Token)match(input,ESSA,FOLLOW_ESSA_in_seletor911); 
                    ESSA140_tree = 
                    (Object)adaptor.create(ESSA140)
                    ;
                    adaptor.addChild(root_0, ESSA140_tree);


                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSintatico.g:347:4: instanciacao
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_instanciacao_in_seletor916);
                    instanciacao141=instanciacao();

                    state._fsp--;

                    adaptor.addChild(root_0, instanciacao141.getTree());

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSintatico.g:348:4: IDENTIFICADOR ( listaDeParametros )?
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFICADOR142=(Token)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_seletor921); 
                    IDENTIFICADOR142_tree = 
                    (Object)adaptor.create(IDENTIFICADOR142)
                    ;
                    adaptor.addChild(root_0, IDENTIFICADOR142_tree);


                    // fontes/g/CanecaSintatico.g:348:18: ( listaDeParametros )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==PARENTESE_ESQUERDO) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // fontes/g/CanecaSintatico.g:348:19: listaDeParametros
                            {
                            pushFollow(FOLLOW_listaDeParametros_in_seletor924);
                            listaDeParametros143=listaDeParametros();

                            state._fsp--;

                            adaptor.addChild(root_0, listaDeParametros143.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "seletor"


    public static class chamada_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chamada"
    // fontes/g/CanecaSintatico.g:351:1: chamada : ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( listaDeParametros )? ;
    public final CanecaSintatico.chamada_return chamada() throws RecognitionException {
        CanecaSintatico.chamada_return retval = new CanecaSintatico.chamada_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set144=null;
        Token IDENTIFICADOR145=null;
        CanecaSintatico.listaDeParametros_return listaDeParametros146 =null;


        Object set144_tree=null;
        Object IDENTIFICADOR145_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:352:2: ( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( listaDeParametros )? )
            // fontes/g/CanecaSintatico.g:352:4: ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( listaDeParametros )?
            {
            root_0 = (Object)adaptor.nil();


            set144=(Token)input.LT(1);

            if ( (input.LA(1) >= CHAMADA_DE_CLASSE && input.LA(1) <= CHAMADA_DE_OBJETO) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set144)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            IDENTIFICADOR145=(Token)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_chamada945); 
            IDENTIFICADOR145_tree = 
            (Object)adaptor.create(IDENTIFICADOR145)
            ;
            adaptor.addChild(root_0, IDENTIFICADOR145_tree);


            // fontes/g/CanecaSintatico.g:352:58: ( listaDeParametros )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==PARENTESE_ESQUERDO) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:352:59: listaDeParametros
                    {
                    pushFollow(FOLLOW_listaDeParametros_in_chamada948);
                    listaDeParametros146=listaDeParametros();

                    state._fsp--;

                    adaptor.addChild(root_0, listaDeParametros146.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "chamada"


    public static class instanciacao_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instanciacao"
    // fontes/g/CanecaSintatico.g:355:1: instanciacao : ( NOVO | NOVA ) tipo listaDeParametros ;
    public final CanecaSintatico.instanciacao_return instanciacao() throws RecognitionException {
        CanecaSintatico.instanciacao_return retval = new CanecaSintatico.instanciacao_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set147=null;
        CanecaSintatico.tipo_return tipo148 =null;

        CanecaSintatico.listaDeParametros_return listaDeParametros149 =null;


        Object set147_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:356:2: ( ( NOVO | NOVA ) tipo listaDeParametros )
            // fontes/g/CanecaSintatico.g:356:4: ( NOVO | NOVA ) tipo listaDeParametros
            {
            root_0 = (Object)adaptor.nil();


            set147=(Token)input.LT(1);

            if ( (input.LA(1) >= NOVA && input.LA(1) <= NOVO) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set147)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            pushFollow(FOLLOW_tipo_in_instanciacao969);
            tipo148=tipo();

            state._fsp--;

            adaptor.addChild(root_0, tipo148.getTree());

            pushFollow(FOLLOW_listaDeParametros_in_instanciacao971);
            listaDeParametros149=listaDeParametros();

            state._fsp--;

            adaptor.addChild(root_0, listaDeParametros149.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instanciacao"


    public static class destruicao_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "destruicao"
    // fontes/g/CanecaSintatico.g:359:1: destruicao : DESTRUA expressao ;
    public final CanecaSintatico.destruicao_return destruicao() throws RecognitionException {
        CanecaSintatico.destruicao_return retval = new CanecaSintatico.destruicao_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DESTRUA150=null;
        CanecaSintatico.expressao_return expressao151 =null;


        Object DESTRUA150_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:360:2: ( DESTRUA expressao )
            // fontes/g/CanecaSintatico.g:360:4: DESTRUA expressao
            {
            root_0 = (Object)adaptor.nil();


            DESTRUA150=(Token)match(input,DESTRUA,FOLLOW_DESTRUA_in_destruicao982); 
            DESTRUA150_tree = 
            (Object)adaptor.create(DESTRUA150)
            ;
            adaptor.addChild(root_0, DESTRUA150_tree);


            pushFollow(FOLLOW_expressao_in_destruicao984);
            expressao151=expressao();

            state._fsp--;

            adaptor.addChild(root_0, expressao151.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "destruicao"


    public static class retorno_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "retorno"
    // fontes/g/CanecaSintatico.g:363:1: retorno : RETORNE expressao ;
    public final CanecaSintatico.retorno_return retorno() throws RecognitionException {
        CanecaSintatico.retorno_return retval = new CanecaSintatico.retorno_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RETORNE152=null;
        CanecaSintatico.expressao_return expressao153 =null;


        Object RETORNE152_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:364:2: ( RETORNE expressao )
            // fontes/g/CanecaSintatico.g:364:4: RETORNE expressao
            {
            root_0 = (Object)adaptor.nil();


            RETORNE152=(Token)match(input,RETORNE,FOLLOW_RETORNE_in_retorno996); 
            RETORNE152_tree = 
            (Object)adaptor.create(RETORNE152)
            ;
            adaptor.addChild(root_0, RETORNE152_tree);


            pushFollow(FOLLOW_expressao_in_retorno998);
            expressao153=expressao();

            state._fsp--;

            adaptor.addChild(root_0, expressao153.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "retorno"


    public static class se_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "se"
    // fontes/g/CanecaSintatico.g:367:1: se : SE PARENTESE_ESQUERDO expressao PARENTESE_DIREITO blocoDeInstrucoes ( SENAO blocoDeInstrucoes )? ;
    public final CanecaSintatico.se_return se() throws RecognitionException {
        CanecaSintatico.se_return retval = new CanecaSintatico.se_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SE154=null;
        Token PARENTESE_ESQUERDO155=null;
        Token PARENTESE_DIREITO157=null;
        Token SENAO159=null;
        CanecaSintatico.expressao_return expressao156 =null;

        CanecaSintatico.blocoDeInstrucoes_return blocoDeInstrucoes158 =null;

        CanecaSintatico.blocoDeInstrucoes_return blocoDeInstrucoes160 =null;


        Object SE154_tree=null;
        Object PARENTESE_ESQUERDO155_tree=null;
        Object PARENTESE_DIREITO157_tree=null;
        Object SENAO159_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:368:2: ( SE PARENTESE_ESQUERDO expressao PARENTESE_DIREITO blocoDeInstrucoes ( SENAO blocoDeInstrucoes )? )
            // fontes/g/CanecaSintatico.g:368:4: SE PARENTESE_ESQUERDO expressao PARENTESE_DIREITO blocoDeInstrucoes ( SENAO blocoDeInstrucoes )?
            {
            root_0 = (Object)adaptor.nil();


            SE154=(Token)match(input,SE,FOLLOW_SE_in_se1009); 
            SE154_tree = 
            (Object)adaptor.create(SE154)
            ;
            adaptor.addChild(root_0, SE154_tree);


            PARENTESE_ESQUERDO155=(Token)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_se1011); 
            PARENTESE_ESQUERDO155_tree = 
            (Object)adaptor.create(PARENTESE_ESQUERDO155)
            ;
            adaptor.addChild(root_0, PARENTESE_ESQUERDO155_tree);


            pushFollow(FOLLOW_expressao_in_se1013);
            expressao156=expressao();

            state._fsp--;

            adaptor.addChild(root_0, expressao156.getTree());

            PARENTESE_DIREITO157=(Token)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_se1015); 
            PARENTESE_DIREITO157_tree = 
            (Object)adaptor.create(PARENTESE_DIREITO157)
            ;
            adaptor.addChild(root_0, PARENTESE_DIREITO157_tree);


            pushFollow(FOLLOW_blocoDeInstrucoes_in_se1017);
            blocoDeInstrucoes158=blocoDeInstrucoes();

            state._fsp--;

            adaptor.addChild(root_0, blocoDeInstrucoes158.getTree());

            // fontes/g/CanecaSintatico.g:368:72: ( SENAO blocoDeInstrucoes )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==SENAO) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:368:73: SENAO blocoDeInstrucoes
                    {
                    SENAO159=(Token)match(input,SENAO,FOLLOW_SENAO_in_se1020); 
                    SENAO159_tree = 
                    (Object)adaptor.create(SENAO159)
                    ;
                    adaptor.addChild(root_0, SENAO159_tree);


                    pushFollow(FOLLOW_blocoDeInstrucoes_in_se1022);
                    blocoDeInstrucoes160=blocoDeInstrucoes();

                    state._fsp--;

                    adaptor.addChild(root_0, blocoDeInstrucoes160.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "se"


    public static class para_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "para"
    // fontes/g/CanecaSintatico.g:371:1: para : PARA PARENTESE_ESQUERDO expressao TERMINADOR expressao TERMINADOR expressao PARENTESE_DIREITO blocoDeInstrucoes ;
    public final CanecaSintatico.para_return para() throws RecognitionException {
        CanecaSintatico.para_return retval = new CanecaSintatico.para_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PARA161=null;
        Token PARENTESE_ESQUERDO162=null;
        Token TERMINADOR164=null;
        Token TERMINADOR166=null;
        Token PARENTESE_DIREITO168=null;
        CanecaSintatico.expressao_return expressao163 =null;

        CanecaSintatico.expressao_return expressao165 =null;

        CanecaSintatico.expressao_return expressao167 =null;

        CanecaSintatico.blocoDeInstrucoes_return blocoDeInstrucoes169 =null;


        Object PARA161_tree=null;
        Object PARENTESE_ESQUERDO162_tree=null;
        Object TERMINADOR164_tree=null;
        Object TERMINADOR166_tree=null;
        Object PARENTESE_DIREITO168_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:372:2: ( PARA PARENTESE_ESQUERDO expressao TERMINADOR expressao TERMINADOR expressao PARENTESE_DIREITO blocoDeInstrucoes )
            // fontes/g/CanecaSintatico.g:372:4: PARA PARENTESE_ESQUERDO expressao TERMINADOR expressao TERMINADOR expressao PARENTESE_DIREITO blocoDeInstrucoes
            {
            root_0 = (Object)adaptor.nil();


            PARA161=(Token)match(input,PARA,FOLLOW_PARA_in_para1035); 
            PARA161_tree = 
            (Object)adaptor.create(PARA161)
            ;
            adaptor.addChild(root_0, PARA161_tree);


            PARENTESE_ESQUERDO162=(Token)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_para1037); 
            PARENTESE_ESQUERDO162_tree = 
            (Object)adaptor.create(PARENTESE_ESQUERDO162)
            ;
            adaptor.addChild(root_0, PARENTESE_ESQUERDO162_tree);


            pushFollow(FOLLOW_expressao_in_para1039);
            expressao163=expressao();

            state._fsp--;

            adaptor.addChild(root_0, expressao163.getTree());

            TERMINADOR164=(Token)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_para1041); 
            TERMINADOR164_tree = 
            (Object)adaptor.create(TERMINADOR164)
            ;
            adaptor.addChild(root_0, TERMINADOR164_tree);


            pushFollow(FOLLOW_expressao_in_para1043);
            expressao165=expressao();

            state._fsp--;

            adaptor.addChild(root_0, expressao165.getTree());

            TERMINADOR166=(Token)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_para1045); 
            TERMINADOR166_tree = 
            (Object)adaptor.create(TERMINADOR166)
            ;
            adaptor.addChild(root_0, TERMINADOR166_tree);


            pushFollow(FOLLOW_expressao_in_para1047);
            expressao167=expressao();

            state._fsp--;

            adaptor.addChild(root_0, expressao167.getTree());

            PARENTESE_DIREITO168=(Token)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_para1049); 
            PARENTESE_DIREITO168_tree = 
            (Object)adaptor.create(PARENTESE_DIREITO168)
            ;
            adaptor.addChild(root_0, PARENTESE_DIREITO168_tree);


            pushFollow(FOLLOW_blocoDeInstrucoes_in_para1051);
            blocoDeInstrucoes169=blocoDeInstrucoes();

            state._fsp--;

            adaptor.addChild(root_0, blocoDeInstrucoes169.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "para"


    public static class repita_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "repita"
    // fontes/g/CanecaSintatico.g:375:1: repita : REPITA PARENTESE_ESQUERDO declaracao TERMINADOR expressao PARENTESE_DIREITO blocoDeInstrucoes ;
    public final CanecaSintatico.repita_return repita() throws RecognitionException {
        CanecaSintatico.repita_return retval = new CanecaSintatico.repita_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token REPITA170=null;
        Token PARENTESE_ESQUERDO171=null;
        Token TERMINADOR173=null;
        Token PARENTESE_DIREITO175=null;
        CanecaSintatico.declaracao_return declaracao172 =null;

        CanecaSintatico.expressao_return expressao174 =null;

        CanecaSintatico.blocoDeInstrucoes_return blocoDeInstrucoes176 =null;


        Object REPITA170_tree=null;
        Object PARENTESE_ESQUERDO171_tree=null;
        Object TERMINADOR173_tree=null;
        Object PARENTESE_DIREITO175_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:376:2: ( REPITA PARENTESE_ESQUERDO declaracao TERMINADOR expressao PARENTESE_DIREITO blocoDeInstrucoes )
            // fontes/g/CanecaSintatico.g:376:4: REPITA PARENTESE_ESQUERDO declaracao TERMINADOR expressao PARENTESE_DIREITO blocoDeInstrucoes
            {
            root_0 = (Object)adaptor.nil();


            REPITA170=(Token)match(input,REPITA,FOLLOW_REPITA_in_repita1062); 
            REPITA170_tree = 
            (Object)adaptor.create(REPITA170)
            ;
            adaptor.addChild(root_0, REPITA170_tree);


            PARENTESE_ESQUERDO171=(Token)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_repita1064); 
            PARENTESE_ESQUERDO171_tree = 
            (Object)adaptor.create(PARENTESE_ESQUERDO171)
            ;
            adaptor.addChild(root_0, PARENTESE_ESQUERDO171_tree);


            pushFollow(FOLLOW_declaracao_in_repita1066);
            declaracao172=declaracao();

            state._fsp--;

            adaptor.addChild(root_0, declaracao172.getTree());

            TERMINADOR173=(Token)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_repita1068); 
            TERMINADOR173_tree = 
            (Object)adaptor.create(TERMINADOR173)
            ;
            adaptor.addChild(root_0, TERMINADOR173_tree);


            pushFollow(FOLLOW_expressao_in_repita1070);
            expressao174=expressao();

            state._fsp--;

            adaptor.addChild(root_0, expressao174.getTree());

            PARENTESE_DIREITO175=(Token)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_repita1072); 
            PARENTESE_DIREITO175_tree = 
            (Object)adaptor.create(PARENTESE_DIREITO175)
            ;
            adaptor.addChild(root_0, PARENTESE_DIREITO175_tree);


            pushFollow(FOLLOW_blocoDeInstrucoes_in_repita1074);
            blocoDeInstrucoes176=blocoDeInstrucoes();

            state._fsp--;

            adaptor.addChild(root_0, blocoDeInstrucoes176.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "repita"


    public static class enquanto_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enquanto"
    // fontes/g/CanecaSintatico.g:379:1: enquanto : ENQUANTO PARENTESE_ESQUERDO expressao PARENTESE_DIREITO blocoDeInstrucoes ;
    public final CanecaSintatico.enquanto_return enquanto() throws RecognitionException {
        CanecaSintatico.enquanto_return retval = new CanecaSintatico.enquanto_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ENQUANTO177=null;
        Token PARENTESE_ESQUERDO178=null;
        Token PARENTESE_DIREITO180=null;
        CanecaSintatico.expressao_return expressao179 =null;

        CanecaSintatico.blocoDeInstrucoes_return blocoDeInstrucoes181 =null;


        Object ENQUANTO177_tree=null;
        Object PARENTESE_ESQUERDO178_tree=null;
        Object PARENTESE_DIREITO180_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:380:2: ( ENQUANTO PARENTESE_ESQUERDO expressao PARENTESE_DIREITO blocoDeInstrucoes )
            // fontes/g/CanecaSintatico.g:380:4: ENQUANTO PARENTESE_ESQUERDO expressao PARENTESE_DIREITO blocoDeInstrucoes
            {
            root_0 = (Object)adaptor.nil();


            ENQUANTO177=(Token)match(input,ENQUANTO,FOLLOW_ENQUANTO_in_enquanto1085); 
            ENQUANTO177_tree = 
            (Object)adaptor.create(ENQUANTO177)
            ;
            adaptor.addChild(root_0, ENQUANTO177_tree);


            PARENTESE_ESQUERDO178=(Token)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_enquanto1087); 
            PARENTESE_ESQUERDO178_tree = 
            (Object)adaptor.create(PARENTESE_ESQUERDO178)
            ;
            adaptor.addChild(root_0, PARENTESE_ESQUERDO178_tree);


            pushFollow(FOLLOW_expressao_in_enquanto1089);
            expressao179=expressao();

            state._fsp--;

            adaptor.addChild(root_0, expressao179.getTree());

            PARENTESE_DIREITO180=(Token)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_enquanto1091); 
            PARENTESE_DIREITO180_tree = 
            (Object)adaptor.create(PARENTESE_DIREITO180)
            ;
            adaptor.addChild(root_0, PARENTESE_DIREITO180_tree);


            pushFollow(FOLLOW_blocoDeInstrucoes_in_enquanto1093);
            blocoDeInstrucoes181=blocoDeInstrucoes();

            state._fsp--;

            adaptor.addChild(root_0, blocoDeInstrucoes181.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "enquanto"


    public static class tente_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tente"
    // fontes/g/CanecaSintatico.g:383:1: tente : TENTE blocoDeInstrucoes listaDeCapturas ;
    public final CanecaSintatico.tente_return tente() throws RecognitionException {
        CanecaSintatico.tente_return retval = new CanecaSintatico.tente_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TENTE182=null;
        CanecaSintatico.blocoDeInstrucoes_return blocoDeInstrucoes183 =null;

        CanecaSintatico.listaDeCapturas_return listaDeCapturas184 =null;


        Object TENTE182_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:384:2: ( TENTE blocoDeInstrucoes listaDeCapturas )
            // fontes/g/CanecaSintatico.g:384:4: TENTE blocoDeInstrucoes listaDeCapturas
            {
            root_0 = (Object)adaptor.nil();


            TENTE182=(Token)match(input,TENTE,FOLLOW_TENTE_in_tente1104); 
            TENTE182_tree = 
            (Object)adaptor.create(TENTE182)
            ;
            adaptor.addChild(root_0, TENTE182_tree);


            pushFollow(FOLLOW_blocoDeInstrucoes_in_tente1106);
            blocoDeInstrucoes183=blocoDeInstrucoes();

            state._fsp--;

            adaptor.addChild(root_0, blocoDeInstrucoes183.getTree());

            pushFollow(FOLLOW_listaDeCapturas_in_tente1108);
            listaDeCapturas184=listaDeCapturas();

            state._fsp--;

            adaptor.addChild(root_0, listaDeCapturas184.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tente"


    public static class capture_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "capture"
    // fontes/g/CanecaSintatico.g:387:1: capture : CAPTURE PARENTESE_ESQUERDO declaracao PARENTESE_DIREITO blocoDeInstrucoes ;
    public final CanecaSintatico.capture_return capture() throws RecognitionException {
        CanecaSintatico.capture_return retval = new CanecaSintatico.capture_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CAPTURE185=null;
        Token PARENTESE_ESQUERDO186=null;
        Token PARENTESE_DIREITO188=null;
        CanecaSintatico.declaracao_return declaracao187 =null;

        CanecaSintatico.blocoDeInstrucoes_return blocoDeInstrucoes189 =null;


        Object CAPTURE185_tree=null;
        Object PARENTESE_ESQUERDO186_tree=null;
        Object PARENTESE_DIREITO188_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:388:2: ( CAPTURE PARENTESE_ESQUERDO declaracao PARENTESE_DIREITO blocoDeInstrucoes )
            // fontes/g/CanecaSintatico.g:388:4: CAPTURE PARENTESE_ESQUERDO declaracao PARENTESE_DIREITO blocoDeInstrucoes
            {
            root_0 = (Object)adaptor.nil();


            CAPTURE185=(Token)match(input,CAPTURE,FOLLOW_CAPTURE_in_capture1119); 
            CAPTURE185_tree = 
            (Object)adaptor.create(CAPTURE185)
            ;
            adaptor.addChild(root_0, CAPTURE185_tree);


            PARENTESE_ESQUERDO186=(Token)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_capture1121); 
            PARENTESE_ESQUERDO186_tree = 
            (Object)adaptor.create(PARENTESE_ESQUERDO186)
            ;
            adaptor.addChild(root_0, PARENTESE_ESQUERDO186_tree);


            pushFollow(FOLLOW_declaracao_in_capture1123);
            declaracao187=declaracao();

            state._fsp--;

            adaptor.addChild(root_0, declaracao187.getTree());

            PARENTESE_DIREITO188=(Token)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_capture1125); 
            PARENTESE_DIREITO188_tree = 
            (Object)adaptor.create(PARENTESE_DIREITO188)
            ;
            adaptor.addChild(root_0, PARENTESE_DIREITO188_tree);


            pushFollow(FOLLOW_blocoDeInstrucoes_in_capture1127);
            blocoDeInstrucoes189=blocoDeInstrucoes();

            state._fsp--;

            adaptor.addChild(root_0, blocoDeInstrucoes189.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "capture"


    public static class lance_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lance"
    // fontes/g/CanecaSintatico.g:391:1: lance : LANCE expressao ;
    public final CanecaSintatico.lance_return lance() throws RecognitionException {
        CanecaSintatico.lance_return retval = new CanecaSintatico.lance_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LANCE190=null;
        CanecaSintatico.expressao_return expressao191 =null;


        Object LANCE190_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:392:2: ( LANCE expressao )
            // fontes/g/CanecaSintatico.g:392:4: LANCE expressao
            {
            root_0 = (Object)adaptor.nil();


            LANCE190=(Token)match(input,LANCE,FOLLOW_LANCE_in_lance1138); 
            LANCE190_tree = 
            (Object)adaptor.create(LANCE190)
            ;
            adaptor.addChild(root_0, LANCE190_tree);


            pushFollow(FOLLOW_expressao_in_lance1140);
            expressao191=expressao();

            state._fsp--;

            adaptor.addChild(root_0, expressao191.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lance"


    public static class instrucao_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instrucao"
    // fontes/g/CanecaSintatico.g:395:1: instrucao : ( ( options {k=2; } : expressao TERMINADOR | declaracao TERMINADOR ) | destruicao TERMINADOR | retorno TERMINADOR | se | para | repita | enquanto | tente | lance TERMINADOR );
    public final CanecaSintatico.instrucao_return instrucao() throws RecognitionException {
        CanecaSintatico.instrucao_return retval = new CanecaSintatico.instrucao_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TERMINADOR193=null;
        Token TERMINADOR195=null;
        Token TERMINADOR197=null;
        Token TERMINADOR199=null;
        Token TERMINADOR206=null;
        CanecaSintatico.expressao_return expressao192 =null;

        CanecaSintatico.declaracao_return declaracao194 =null;

        CanecaSintatico.destruicao_return destruicao196 =null;

        CanecaSintatico.retorno_return retorno198 =null;

        CanecaSintatico.se_return se200 =null;

        CanecaSintatico.para_return para201 =null;

        CanecaSintatico.repita_return repita202 =null;

        CanecaSintatico.enquanto_return enquanto203 =null;

        CanecaSintatico.tente_return tente204 =null;

        CanecaSintatico.lance_return lance205 =null;


        Object TERMINADOR193_tree=null;
        Object TERMINADOR195_tree=null;
        Object TERMINADOR197_tree=null;
        Object TERMINADOR199_tree=null;
        Object TERMINADOR206_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:396:2: ( ( options {k=2; } : expressao TERMINADOR | declaracao TERMINADOR ) | destruicao TERMINADOR | retorno TERMINADOR | se | para | repita | enquanto | tente | lance TERMINADOR )
            int alt36=9;
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
                alt36=1;
                }
                break;
            case DESTRUA:
                {
                alt36=2;
                }
                break;
            case RETORNE:
                {
                alt36=3;
                }
                break;
            case SE:
                {
                alt36=4;
                }
                break;
            case PARA:
                {
                alt36=5;
                }
                break;
            case REPITA:
                {
                alt36=6;
                }
                break;
            case ENQUANTO:
                {
                alt36=7;
                }
                break;
            case TENTE:
                {
                alt36=8;
                }
                break;
            case LANCE:
                {
                alt36=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:397:2: ( options {k=2; } : expressao TERMINADOR | declaracao TERMINADOR )
                    {
                    root_0 = (Object)adaptor.nil();


                    // fontes/g/CanecaSintatico.g:397:2: ( options {k=2; } : expressao TERMINADOR | declaracao TERMINADOR )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( ((LA35_0 >= CONSTANTE_INTEIRA && LA35_0 <= CONSTANTE_REAL)||(LA35_0 >= ESSA && LA35_0 <= ESSE)||(LA35_0 >= LITERAL_CARACTERE && LA35_0 <= LITERAL_TEXTO)||(LA35_0 >= NEGACAO && LA35_0 <= NOVO)||LA35_0==PARENTESE_ESQUERDO||LA35_0==SUBTRACAO||(LA35_0 >= VALOR_BOOLEANO && LA35_0 <= VALOR_NULO)) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==IDENTIFICADOR) ) {
                        int LA35_11 = input.LA(2);

                        if ( (LA35_11==ATRIBUIDOR||(LA35_11 >= CHAMADA_DE_CLASSE && LA35_11 <= CHAMADA_DE_OBJETO)||LA35_11==DIFERENTE||(LA35_11 >= DIVISAO && LA35_11 <= E)||LA35_11==IGUAL||(LA35_11 >= MAIOR && LA35_11 <= MENOR_IGUAL)||LA35_11==MULTIPLICACAO||LA35_11==OU||LA35_11==PARENTESE_ESQUERDO||LA35_11==RESTO_DA_DIVISAO||(LA35_11 >= SOMA && LA35_11 <= SUBTRACAO)||LA35_11==TERMINADOR) ) {
                            alt35=1;
                        }
                        else if ( (LA35_11==COLCHETE_ESQUERDO||LA35_11==IDENTIFICADOR) ) {
                            alt35=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 35, 11, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;

                    }
                    switch (alt35) {
                        case 1 :
                            // fontes/g/CanecaSintatico.g:398:5: expressao TERMINADOR
                            {
                            pushFollow(FOLLOW_expressao_in_instrucao1168);
                            expressao192=expressao();

                            state._fsp--;

                            adaptor.addChild(root_0, expressao192.getTree());

                            TERMINADOR193=(Token)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_instrucao1170); 
                            TERMINADOR193_tree = 
                            (Object)adaptor.create(TERMINADOR193)
                            ;
                            adaptor.addChild(root_0, TERMINADOR193_tree);


                            }
                            break;
                        case 2 :
                            // fontes/g/CanecaSintatico.g:399:41: declaracao TERMINADOR
                            {
                            pushFollow(FOLLOW_declaracao_in_instrucao1178);
                            declaracao194=declaracao();

                            state._fsp--;

                            adaptor.addChild(root_0, declaracao194.getTree());

                            TERMINADOR195=(Token)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_instrucao1180); 
                            TERMINADOR195_tree = 
                            (Object)adaptor.create(TERMINADOR195)
                            ;
                            adaptor.addChild(root_0, TERMINADOR195_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSintatico.g:401:4: destruicao TERMINADOR
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_destruicao_in_instrucao1188);
                    destruicao196=destruicao();

                    state._fsp--;

                    adaptor.addChild(root_0, destruicao196.getTree());

                    TERMINADOR197=(Token)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_instrucao1190); 
                    TERMINADOR197_tree = 
                    (Object)adaptor.create(TERMINADOR197)
                    ;
                    adaptor.addChild(root_0, TERMINADOR197_tree);


                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSintatico.g:402:4: retorno TERMINADOR
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_retorno_in_instrucao1195);
                    retorno198=retorno();

                    state._fsp--;

                    adaptor.addChild(root_0, retorno198.getTree());

                    TERMINADOR199=(Token)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_instrucao1197); 
                    TERMINADOR199_tree = 
                    (Object)adaptor.create(TERMINADOR199)
                    ;
                    adaptor.addChild(root_0, TERMINADOR199_tree);


                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSintatico.g:403:4: se
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_se_in_instrucao1202);
                    se200=se();

                    state._fsp--;

                    adaptor.addChild(root_0, se200.getTree());

                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSintatico.g:404:4: para
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_para_in_instrucao1207);
                    para201=para();

                    state._fsp--;

                    adaptor.addChild(root_0, para201.getTree());

                    }
                    break;
                case 6 :
                    // fontes/g/CanecaSintatico.g:405:4: repita
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_repita_in_instrucao1212);
                    repita202=repita();

                    state._fsp--;

                    adaptor.addChild(root_0, repita202.getTree());

                    }
                    break;
                case 7 :
                    // fontes/g/CanecaSintatico.g:406:4: enquanto
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enquanto_in_instrucao1217);
                    enquanto203=enquanto();

                    state._fsp--;

                    adaptor.addChild(root_0, enquanto203.getTree());

                    }
                    break;
                case 8 :
                    // fontes/g/CanecaSintatico.g:407:4: tente
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_tente_in_instrucao1222);
                    tente204=tente();

                    state._fsp--;

                    adaptor.addChild(root_0, tente204.getTree());

                    }
                    break;
                case 9 :
                    // fontes/g/CanecaSintatico.g:408:4: lance TERMINADOR
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_lance_in_instrucao1227);
                    lance205=lance();

                    state._fsp--;

                    adaptor.addChild(root_0, lance205.getTree());

                    TERMINADOR206=(Token)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_instrucao1229); 
                    TERMINADOR206_tree = 
                    (Object)adaptor.create(TERMINADOR206)
                    ;
                    adaptor.addChild(root_0, TERMINADOR206_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instrucao"


    public static class blocoDeInstrucoes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blocoDeInstrucoes"
    // fontes/g/CanecaSintatico.g:411:1: blocoDeInstrucoes : INICIO ( instrucao )* FIM ;
    public final CanecaSintatico.blocoDeInstrucoes_return blocoDeInstrucoes() throws RecognitionException {
        CanecaSintatico.blocoDeInstrucoes_return retval = new CanecaSintatico.blocoDeInstrucoes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INICIO207=null;
        Token FIM209=null;
        CanecaSintatico.instrucao_return instrucao208 =null;


        Object INICIO207_tree=null;
        Object FIM209_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:412:2: ( INICIO ( instrucao )* FIM )
            // fontes/g/CanecaSintatico.g:412:4: INICIO ( instrucao )* FIM
            {
            root_0 = (Object)adaptor.nil();


            INICIO207=(Token)match(input,INICIO,FOLLOW_INICIO_in_blocoDeInstrucoes1240); 
            INICIO207_tree = 
            (Object)adaptor.create(INICIO207)
            ;
            adaptor.addChild(root_0, INICIO207_tree);


            // fontes/g/CanecaSintatico.g:412:11: ( instrucao )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0 >= CONSTANTE_INTEIRA && LA37_0 <= CONSTANTE_REAL)||LA37_0==DESTRUA||LA37_0==ENQUANTO||(LA37_0 >= ESSA && LA37_0 <= ESSE)||LA37_0==IDENTIFICADOR||LA37_0==LANCE||(LA37_0 >= LITERAL_CARACTERE && LA37_0 <= LITERAL_TEXTO)||(LA37_0 >= NEGACAO && LA37_0 <= NOVO)||LA37_0==PARA||LA37_0==PARENTESE_ESQUERDO||LA37_0==REPITA||(LA37_0 >= RETORNE && LA37_0 <= SE)||LA37_0==SUBTRACAO||LA37_0==TENTE||(LA37_0 >= VALOR_BOOLEANO && LA37_0 <= VALOR_NULO)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // fontes/g/CanecaSintatico.g:412:12: instrucao
            	    {
            	    pushFollow(FOLLOW_instrucao_in_blocoDeInstrucoes1243);
            	    instrucao208=instrucao();

            	    state._fsp--;

            	    adaptor.addChild(root_0, instrucao208.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            FIM209=(Token)match(input,FIM,FOLLOW_FIM_in_blocoDeInstrucoes1247); 
            FIM209_tree = 
            (Object)adaptor.create(FIM209)
            ;
            adaptor.addChild(root_0, FIM209_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException erro) {
        		reportError(erro);
        		recover(input, erro);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "blocoDeInstrucoes"

    // Delegated rules


 

    public static final BitSet FOLLOW_unicadeDeCompilacao_in_programa77 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_cabecalho_in_unicadeDeCompilacao90 = new BitSet(new long[]{0x0000010000001000L});
    public static final BitSet FOLLOW_classe_in_unicadeDeCompilacao93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaces_in_unicadeDeCompilacao97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pacote_in_cabecalho109 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_importacoes_in_cabecalho111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACOTE_in_pacote122 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_DE_PACOTE_in_pacote124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_pacote126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importacao_in_importacoes138 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_IMPORTE_in_importacao151 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_importacao154 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao156 = new BitSet(new long[]{0x0000000000020000L,0x0000000000001000L});
    public static final BitSet FOLLOW_COMO_in_importacao159 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_importacao161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_DE_PACOTE_in_importacao167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_importacao170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASSE_in_classe181 = new BitSet(new long[]{0xA800000000000000L});
    public static final BitSet FOLLOW_modificadorDeAcessoFeminino_in_classe183 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_classe185 = new BitSet(new long[]{0x000000A000004000L});
    public static final BitSet FOLLOW_listaDeTiposGenericos_in_classe187 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_classe189 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_corpoDaClasse_in_classe191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaces202 = new BitSet(new long[]{0xA800000000000000L});
    public static final BitSet FOLLOW_modificadorDeAcessoFeminino_in_interfaces204 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_interfaces206 = new BitSet(new long[]{0x000000A000004000L});
    public static final BitSet FOLLOW_listaDeTiposGenericos_in_interfaces208 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_interfaces210 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_corpoDaInterface_in_interfaces212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INICIO_in_corpoDaClasse223 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_atributos_in_corpoDaClasse225 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_construtores_in_corpoDaClasse227 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_destrutor_in_corpoDaClasse229 = new BitSet(new long[]{0x0002000200000000L});
    public static final BitSet FOLLOW_metodos_in_corpoDaClasse231 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_FIM_in_corpoDaClasse233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INICIO_in_corpoDaInterface244 = new BitSet(new long[]{0x0002000200000020L});
    public static final BitSet FOLLOW_atributos_in_corpoDaInterface246 = new BitSet(new long[]{0x0002000200000000L});
    public static final BitSet FOLLOW_assinaturasDeMetodos_in_corpoDaInterface248 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_FIM_in_corpoDaInterface250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atributo_in_atributos262 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_construtor_in_construtores276 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_metodo_in_metodos290 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_assinaturaDeMetodo_in_assinaturasDeMetodos304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_assinaturasDeMetodos306 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ATRIBUTO_in_atributo319 = new BitSet(new long[]{0x5000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_atributo321 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_ESTATICO_in_atributo324 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipo_in_atributo328 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_atributo330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_atributo334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assinaturaDeConstrutor_in_construtor345 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_construtor347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assinaturaDeDestrutor_in_destrutor358 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_destrutor360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assinaturaDeMetodo_in_metodo371 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_metodo373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUTOR_in_assinaturaDeConstrutor384 = new BitSet(new long[]{0x5000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_assinaturaDeConstrutor386 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_assinaturaDeConstrutor388 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_listaDeArgumentos_in_assinaturaDeConstrutor390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTRUTOR_in_assinaturaDeDestrutor401 = new BitSet(new long[]{0x5000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_assinaturaDeDestrutor403 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_assinaturaDeDestrutor405 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_listaDeArgumentosVazia_in_assinaturaDeDestrutor407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METODO_in_assinaturaDeMetodo418 = new BitSet(new long[]{0x5000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_assinaturaDeMetodo420 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_ESTATICO_in_assinaturaDeMetodo423 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipo_in_assinaturaDeMetodo427 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_assinaturaDeMetodo429 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_listaDeArgumentos_in_assinaturaDeMetodo431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_listaDeParametros484 = new BitSet(new long[]{0x06381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_listaDeParametros487 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SEPARADOR_in_listaDeParametros490 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_listaDeParametros492 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_listaDeParametros498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_listaDeArgumentosVazia509 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_listaDeArgumentosVazia511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_listaDeArgumentos522 = new BitSet(new long[]{0x0200000400000000L});
    public static final BitSet FOLLOW_declaracao_in_listaDeArgumentos525 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SEPARADOR_in_listaDeArgumentos528 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_declaracao_in_listaDeArgumentos530 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_listaDeArgumentos536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTA_in_listaDeInterfaces548 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipo_in_listaDeInterfaces550 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_SEPARADOR_in_listaDeInterfaces553 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipo_in_listaDeInterfaces555 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_COLCHETE_ESQUERDO_in_listaDeTiposGenericos571 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipoGenerico_in_listaDeTiposGenericos573 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLCHETE_DIREITO_in_listaDeTiposGenericos575 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_COLCHETE_ESQUERDO_in_listaDeTipos589 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipo_in_listaDeTipos591 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SEPARADOR_in_listaDeTipos594 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipo_in_listaDeTipos596 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000080L});
    public static final BitSet FOLLOW_COLCHETE_DIREITO_in_listaDeTipos600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_capture_in_listaDeCapturas614 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_tipoGenerico627 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_tipoGenerico629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_tipo640 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_listaDeTipos_in_tipo642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipo_in_declaracao653 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_declaracao655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoOuLogico_in_expressao669 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ATRIBUIDOR_in_expressao672 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoOuLogico_in_expressao674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoELogico_in_expressaoOuLogico687 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_OU_in_expressaoOuLogico690 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoELogico_in_expressaoOuLogico692 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_expressaoComparacaoLogica_in_expressaoELogico705 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_E_in_expressaoELogico708 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoComparacaoLogica_in_expressaoELogico710 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica723 = new BitSet(new long[]{0x0001E01001000002L});
    public static final BitSet FOLLOW_set_in_expressaoComparacaoLogica726 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica750 = new BitSet(new long[]{0x0001E01001000002L});
    public static final BitSet FOLLOW_expressaoMultiplicativa_in_expressaoAditiva763 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_set_in_expressaoAditiva766 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoMultiplicativa_in_expressaoAditiva774 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_expressaoUnaria_in_expressaoMultiplicativa787 = new BitSet(new long[]{0x0004000004000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expressaoMultiplicativa790 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoUnaria_in_expressaoMultiplicativa802 = new BitSet(new long[]{0x0004000004000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_expressaoPrimaria_in_expressaoUnaria815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBTRACAO_in_expressaoUnaria820 = new BitSet(new long[]{0x04301804C00C0000L,0x000000000000C000L});
    public static final BitSet FOLLOW_expressaoPrimaria_in_expressaoUnaria822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGACAO_in_expressaoUnaria827 = new BitSet(new long[]{0x04301804C00C0000L,0x000000000000C000L});
    public static final BitSet FOLLOW_expressaoPrimaria_in_expressaoUnaria829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_expressaoPrimaria840 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_expressaoPrimaria842 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_expressaoPrimaria844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALOR_BOOLEANO_in_expressaoPrimaria849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALOR_NULO_in_expressaoPrimaria854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTE_INTEIRA_in_expressaoPrimaria859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTE_REAL_in_expressaoPrimaria864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_CARACTERE_in_expressaoPrimaria869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_TEXTO_in_expressaoPrimaria874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comando_in_expressaoPrimaria879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_seletor_in_comando890 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_chamada_in_comando893 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_ESSE_in_seletor906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ESSA_in_seletor911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanciacao_in_seletor916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_seletor921 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_listaDeParametros_in_seletor924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_chamada937 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_chamada945 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_listaDeParametros_in_chamada948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_instanciacao961 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipo_in_instanciacao969 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_listaDeParametros_in_instanciacao971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTRUA_in_destruicao982 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_destruicao984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETORNE_in_retorno996 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_retorno998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SE_in_se1009 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_se1011 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_se1013 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_se1015 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_se1017 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_SENAO_in_se1020 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_se1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARA_in_para1035 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_para1037 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_para1039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_para1041 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_para1043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_para1045 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_para1047 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_para1049 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_para1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPITA_in_repita1062 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_repita1064 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_declaracao_in_repita1066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_repita1068 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_repita1070 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_repita1072 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_repita1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENQUANTO_in_enquanto1085 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_enquanto1087 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_enquanto1089 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_enquanto1091 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_enquanto1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TENTE_in_tente1104 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_tente1106 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_listaDeCapturas_in_tente1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPTURE_in_capture1119 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_capture1121 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_declaracao_in_capture1123 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_capture1125 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_capture1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANCE_in_lance1138 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_lance1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressao_in_instrucao1168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_instrucao1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracao_in_instrucao1178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_instrucao1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destruicao_in_instrucao1188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_instrucao1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retorno_in_instrucao1195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_instrucao1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_se_in_instrucao1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_para_in_instrucao1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repita_in_instrucao1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enquanto_in_instrucao1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tente_in_instrucao1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lance_in_instrucao1227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_instrucao1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INICIO_in_blocoDeInstrucoes1240 = new BitSet(new long[]{0x05381A06D04C0000L,0x000000000000CA34L});
    public static final BitSet FOLLOW_instrucao_in_blocoDeInstrucoes1243 = new BitSet(new long[]{0x05381A06D04C0000L,0x000000000000CA34L});
    public static final BitSet FOLLOW_FIM_in_blocoDeInstrucoes1247 = new BitSet(new long[]{0x0000000000000002L});

}