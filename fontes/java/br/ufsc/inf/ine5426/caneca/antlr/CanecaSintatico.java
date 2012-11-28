// $ANTLR 3.4 fontes/g/CanecaSintatico.g 2012-11-27 22:14:57

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
    // fontes/g/CanecaSintatico.g:209:1: atributo : ATRIBUTO modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR ( atribuicao )? TERMINADOR ;
    public final CanecaSintatico.atributo_return atributo() throws RecognitionException {
        CanecaSintatico.atributo_return retval = new CanecaSintatico.atributo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ATRIBUTO45=null;
        Token ESTATICO47=null;
        Token IDENTIFICADOR49=null;
        Token TERMINADOR51=null;
        CanecaSintatico.modificadorDeAcessoMasculino_return modificadorDeAcessoMasculino46 =null;

        CanecaSintatico.tipo_return tipo48 =null;

        CanecaSintatico.atribuicao_return atribuicao50 =null;


        Object ATRIBUTO45_tree=null;
        Object ESTATICO47_tree=null;
        Object IDENTIFICADOR49_tree=null;
        Object TERMINADOR51_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:210:2: ( ATRIBUTO modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR ( atribuicao )? TERMINADOR )
            // fontes/g/CanecaSintatico.g:210:4: ATRIBUTO modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR ( atribuicao )? TERMINADOR
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


            // fontes/g/CanecaSintatico.g:210:73: ( atribuicao )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ATRIBUIDOR) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:210:74: atribuicao
                    {
                    pushFollow(FOLLOW_atribuicao_in_atributo333);
                    atribuicao50=atribuicao();

                    state._fsp--;

                    adaptor.addChild(root_0, atribuicao50.getTree());

                    }
                    break;

            }


            TERMINADOR51=(Token)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_atributo337); 
            TERMINADOR51_tree = 
            (Object)adaptor.create(TERMINADOR51)
            ;
            adaptor.addChild(root_0, TERMINADOR51_tree);


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

        CanecaSintatico.assinaturaDeConstrutor_return assinaturaDeConstrutor52 =null;

        CanecaSintatico.blocoDeInstrucoes_return blocoDeInstrucoes53 =null;



        try {
            // fontes/g/CanecaSintatico.g:214:2: ( assinaturaDeConstrutor blocoDeInstrucoes )
            // fontes/g/CanecaSintatico.g:214:4: assinaturaDeConstrutor blocoDeInstrucoes
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assinaturaDeConstrutor_in_construtor348);
            assinaturaDeConstrutor52=assinaturaDeConstrutor();

            state._fsp--;

            adaptor.addChild(root_0, assinaturaDeConstrutor52.getTree());

            pushFollow(FOLLOW_blocoDeInstrucoes_in_construtor350);
            blocoDeInstrucoes53=blocoDeInstrucoes();

            state._fsp--;

            adaptor.addChild(root_0, blocoDeInstrucoes53.getTree());

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

        CanecaSintatico.assinaturaDeDestrutor_return assinaturaDeDestrutor54 =null;

        CanecaSintatico.blocoDeInstrucoes_return blocoDeInstrucoes55 =null;



        try {
            // fontes/g/CanecaSintatico.g:218:2: ( assinaturaDeDestrutor blocoDeInstrucoes )
            // fontes/g/CanecaSintatico.g:218:4: assinaturaDeDestrutor blocoDeInstrucoes
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assinaturaDeDestrutor_in_destrutor361);
            assinaturaDeDestrutor54=assinaturaDeDestrutor();

            state._fsp--;

            adaptor.addChild(root_0, assinaturaDeDestrutor54.getTree());

            pushFollow(FOLLOW_blocoDeInstrucoes_in_destrutor363);
            blocoDeInstrucoes55=blocoDeInstrucoes();

            state._fsp--;

            adaptor.addChild(root_0, blocoDeInstrucoes55.getTree());

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

        CanecaSintatico.assinaturaDeMetodo_return assinaturaDeMetodo56 =null;

        CanecaSintatico.blocoDeInstrucoes_return blocoDeInstrucoes57 =null;



        try {
            // fontes/g/CanecaSintatico.g:222:2: ( assinaturaDeMetodo blocoDeInstrucoes )
            // fontes/g/CanecaSintatico.g:222:4: assinaturaDeMetodo blocoDeInstrucoes
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assinaturaDeMetodo_in_metodo374);
            assinaturaDeMetodo56=assinaturaDeMetodo();

            state._fsp--;

            adaptor.addChild(root_0, assinaturaDeMetodo56.getTree());

            pushFollow(FOLLOW_blocoDeInstrucoes_in_metodo376);
            blocoDeInstrucoes57=blocoDeInstrucoes();

            state._fsp--;

            adaptor.addChild(root_0, blocoDeInstrucoes57.getTree());

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

        Token CONSTRUTOR58=null;
        Token IDENTIFICADOR60=null;
        CanecaSintatico.modificadorDeAcessoMasculino_return modificadorDeAcessoMasculino59 =null;

        CanecaSintatico.listaDeArgumentos_return listaDeArgumentos61 =null;


        Object CONSTRUTOR58_tree=null;
        Object IDENTIFICADOR60_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:226:2: ( CONSTRUTOR modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos )
            // fontes/g/CanecaSintatico.g:226:4: CONSTRUTOR modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos
            {
            root_0 = (Object)adaptor.nil();


            CONSTRUTOR58=(Token)match(input,CONSTRUTOR,FOLLOW_CONSTRUTOR_in_assinaturaDeConstrutor387); 
            CONSTRUTOR58_tree = 
            (Object)adaptor.create(CONSTRUTOR58)
            ;
            adaptor.addChild(root_0, CONSTRUTOR58_tree);


            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_assinaturaDeConstrutor389);
            modificadorDeAcessoMasculino59=modificadorDeAcessoMasculino();

            state._fsp--;

            adaptor.addChild(root_0, modificadorDeAcessoMasculino59.getTree());

            IDENTIFICADOR60=(Token)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_assinaturaDeConstrutor391); 
            IDENTIFICADOR60_tree = 
            (Object)adaptor.create(IDENTIFICADOR60)
            ;
            adaptor.addChild(root_0, IDENTIFICADOR60_tree);


            pushFollow(FOLLOW_listaDeArgumentos_in_assinaturaDeConstrutor393);
            listaDeArgumentos61=listaDeArgumentos();

            state._fsp--;

            adaptor.addChild(root_0, listaDeArgumentos61.getTree());

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
    // fontes/g/CanecaSintatico.g:229:1: assinaturaDeDestrutor : DESTRUTOR modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos ;
    public final CanecaSintatico.assinaturaDeDestrutor_return assinaturaDeDestrutor() throws RecognitionException {
        CanecaSintatico.assinaturaDeDestrutor_return retval = new CanecaSintatico.assinaturaDeDestrutor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DESTRUTOR62=null;
        Token IDENTIFICADOR64=null;
        CanecaSintatico.modificadorDeAcessoMasculino_return modificadorDeAcessoMasculino63 =null;

        CanecaSintatico.listaDeArgumentos_return listaDeArgumentos65 =null;


        Object DESTRUTOR62_tree=null;
        Object IDENTIFICADOR64_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:230:2: ( DESTRUTOR modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos )
            // fontes/g/CanecaSintatico.g:230:4: DESTRUTOR modificadorDeAcessoMasculino IDENTIFICADOR listaDeArgumentos
            {
            root_0 = (Object)adaptor.nil();


            DESTRUTOR62=(Token)match(input,DESTRUTOR,FOLLOW_DESTRUTOR_in_assinaturaDeDestrutor404); 
            DESTRUTOR62_tree = 
            (Object)adaptor.create(DESTRUTOR62)
            ;
            adaptor.addChild(root_0, DESTRUTOR62_tree);


            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_assinaturaDeDestrutor406);
            modificadorDeAcessoMasculino63=modificadorDeAcessoMasculino();

            state._fsp--;

            adaptor.addChild(root_0, modificadorDeAcessoMasculino63.getTree());

            IDENTIFICADOR64=(Token)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_assinaturaDeDestrutor408); 
            IDENTIFICADOR64_tree = 
            (Object)adaptor.create(IDENTIFICADOR64)
            ;
            adaptor.addChild(root_0, IDENTIFICADOR64_tree);


            pushFollow(FOLLOW_listaDeArgumentos_in_assinaturaDeDestrutor410);
            listaDeArgumentos65=listaDeArgumentos();

            state._fsp--;

            adaptor.addChild(root_0, listaDeArgumentos65.getTree());

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

        Token METODO66=null;
        Token ESTATICO68=null;
        Token IDENTIFICADOR70=null;
        CanecaSintatico.modificadorDeAcessoMasculino_return modificadorDeAcessoMasculino67 =null;

        CanecaSintatico.tipo_return tipo69 =null;

        CanecaSintatico.listaDeArgumentos_return listaDeArgumentos71 =null;


        Object METODO66_tree=null;
        Object ESTATICO68_tree=null;
        Object IDENTIFICADOR70_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:234:2: ( METODO modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR listaDeArgumentos )
            // fontes/g/CanecaSintatico.g:234:4: METODO modificadorDeAcessoMasculino ( ESTATICO )? tipo IDENTIFICADOR listaDeArgumentos
            {
            root_0 = (Object)adaptor.nil();


            METODO66=(Token)match(input,METODO,FOLLOW_METODO_in_assinaturaDeMetodo421); 
            METODO66_tree = 
            (Object)adaptor.create(METODO66)
            ;
            adaptor.addChild(root_0, METODO66_tree);


            pushFollow(FOLLOW_modificadorDeAcessoMasculino_in_assinaturaDeMetodo423);
            modificadorDeAcessoMasculino67=modificadorDeAcessoMasculino();

            state._fsp--;

            adaptor.addChild(root_0, modificadorDeAcessoMasculino67.getTree());

            // fontes/g/CanecaSintatico.g:234:40: ( ESTATICO )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ESTATICO) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:234:41: ESTATICO
                    {
                    ESTATICO68=(Token)match(input,ESTATICO,FOLLOW_ESTATICO_in_assinaturaDeMetodo426); 
                    ESTATICO68_tree = 
                    (Object)adaptor.create(ESTATICO68)
                    ;
                    adaptor.addChild(root_0, ESTATICO68_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_tipo_in_assinaturaDeMetodo430);
            tipo69=tipo();

            state._fsp--;

            adaptor.addChild(root_0, tipo69.getTree());

            IDENTIFICADOR70=(Token)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_assinaturaDeMetodo432); 
            IDENTIFICADOR70_tree = 
            (Object)adaptor.create(IDENTIFICADOR70)
            ;
            adaptor.addChild(root_0, IDENTIFICADOR70_tree);


            pushFollow(FOLLOW_listaDeArgumentos_in_assinaturaDeMetodo434);
            listaDeArgumentos71=listaDeArgumentos();

            state._fsp--;

            adaptor.addChild(root_0, listaDeArgumentos71.getTree());

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

        Token set72=null;

        Object set72_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:238:2: ( PUBLICO | PRIVADO | PROTEGIDO )
            // fontes/g/CanecaSintatico.g:
            {
            root_0 = (Object)adaptor.nil();


            set72=(Token)input.LT(1);

            if ( input.LA(1)==PRIVADO||input.LA(1)==PROTEGIDO||input.LA(1)==PUBLICO ) {
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

        Token set73=null;

        Object set73_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:244:2: ( PUBLICA | PRIVADA | PROTEGIDA )
            // fontes/g/CanecaSintatico.g:
            {
            root_0 = (Object)adaptor.nil();


            set73=(Token)input.LT(1);

            if ( input.LA(1)==PRIVADA||input.LA(1)==PROTEGIDA||input.LA(1)==PUBLICA ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set73)
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

        Token PARENTESE_ESQUERDO74=null;
        Token SEPARADOR76=null;
        Token PARENTESE_DIREITO78=null;
        CanecaSintatico.expressao_return expressao75 =null;

        CanecaSintatico.expressao_return expressao77 =null;


        Object PARENTESE_ESQUERDO74_tree=null;
        Object SEPARADOR76_tree=null;
        Object PARENTESE_DIREITO78_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:250:2: ( PARENTESE_ESQUERDO ( expressao ( SEPARADOR expressao )* )? PARENTESE_DIREITO )
            // fontes/g/CanecaSintatico.g:250:4: PARENTESE_ESQUERDO ( expressao ( SEPARADOR expressao )* )? PARENTESE_DIREITO
            {
            root_0 = (Object)adaptor.nil();


            PARENTESE_ESQUERDO74=(Token)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_listaDeParametros487); 
            PARENTESE_ESQUERDO74_tree = 
            (Object)adaptor.create(PARENTESE_ESQUERDO74)
            ;
            adaptor.addChild(root_0, PARENTESE_ESQUERDO74_tree);


            // fontes/g/CanecaSintatico.g:250:23: ( expressao ( SEPARADOR expressao )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0 >= CONSTANTE_INTEIRA && LA14_0 <= CONSTANTE_REAL)||(LA14_0 >= ESSA && LA14_0 <= ESSE)||LA14_0==IDENTIFICADOR||(LA14_0 >= LITERAL_CARACTERE && LA14_0 <= LITERAL_TEXTO)||(LA14_0 >= NEGACAO && LA14_0 <= NOVO)||LA14_0==PARENTESE_ESQUERDO||LA14_0==SUBTRACAO||(LA14_0 >= VALOR_BOOLEANO && LA14_0 <= VALOR_NULO)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:250:24: expressao ( SEPARADOR expressao )*
                    {
                    pushFollow(FOLLOW_expressao_in_listaDeParametros490);
                    expressao75=expressao();

                    state._fsp--;

                    adaptor.addChild(root_0, expressao75.getTree());

                    // fontes/g/CanecaSintatico.g:250:34: ( SEPARADOR expressao )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==SEPARADOR) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // fontes/g/CanecaSintatico.g:250:35: SEPARADOR expressao
                    	    {
                    	    SEPARADOR76=(Token)match(input,SEPARADOR,FOLLOW_SEPARADOR_in_listaDeParametros493); 
                    	    SEPARADOR76_tree = 
                    	    (Object)adaptor.create(SEPARADOR76)
                    	    ;
                    	    adaptor.addChild(root_0, SEPARADOR76_tree);


                    	    pushFollow(FOLLOW_expressao_in_listaDeParametros495);
                    	    expressao77=expressao();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expressao77.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


            PARENTESE_DIREITO78=(Token)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_listaDeParametros501); 
            PARENTESE_DIREITO78_tree = 
            (Object)adaptor.create(PARENTESE_DIREITO78)
            ;
            adaptor.addChild(root_0, PARENTESE_DIREITO78_tree);


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


    public static class listaDeArgumentos_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listaDeArgumentos"
    // fontes/g/CanecaSintatico.g:253:1: listaDeArgumentos : PARENTESE_ESQUERDO ( declaracao ( SEPARADOR declaracao )* )? PARENTESE_DIREITO ;
    public final CanecaSintatico.listaDeArgumentos_return listaDeArgumentos() throws RecognitionException {
        CanecaSintatico.listaDeArgumentos_return retval = new CanecaSintatico.listaDeArgumentos_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PARENTESE_ESQUERDO79=null;
        Token SEPARADOR81=null;
        Token PARENTESE_DIREITO83=null;
        CanecaSintatico.declaracao_return declaracao80 =null;

        CanecaSintatico.declaracao_return declaracao82 =null;


        Object PARENTESE_ESQUERDO79_tree=null;
        Object SEPARADOR81_tree=null;
        Object PARENTESE_DIREITO83_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:254:2: ( PARENTESE_ESQUERDO ( declaracao ( SEPARADOR declaracao )* )? PARENTESE_DIREITO )
            // fontes/g/CanecaSintatico.g:254:4: PARENTESE_ESQUERDO ( declaracao ( SEPARADOR declaracao )* )? PARENTESE_DIREITO
            {
            root_0 = (Object)adaptor.nil();


            PARENTESE_ESQUERDO79=(Token)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_listaDeArgumentos512); 
            PARENTESE_ESQUERDO79_tree = 
            (Object)adaptor.create(PARENTESE_ESQUERDO79)
            ;
            adaptor.addChild(root_0, PARENTESE_ESQUERDO79_tree);


            // fontes/g/CanecaSintatico.g:254:23: ( declaracao ( SEPARADOR declaracao )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENTIFICADOR) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:254:24: declaracao ( SEPARADOR declaracao )*
                    {
                    pushFollow(FOLLOW_declaracao_in_listaDeArgumentos515);
                    declaracao80=declaracao();

                    state._fsp--;

                    adaptor.addChild(root_0, declaracao80.getTree());

                    // fontes/g/CanecaSintatico.g:254:35: ( SEPARADOR declaracao )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==SEPARADOR) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // fontes/g/CanecaSintatico.g:254:36: SEPARADOR declaracao
                    	    {
                    	    SEPARADOR81=(Token)match(input,SEPARADOR,FOLLOW_SEPARADOR_in_listaDeArgumentos518); 
                    	    SEPARADOR81_tree = 
                    	    (Object)adaptor.create(SEPARADOR81)
                    	    ;
                    	    adaptor.addChild(root_0, SEPARADOR81_tree);


                    	    pushFollow(FOLLOW_declaracao_in_listaDeArgumentos520);
                    	    declaracao82=declaracao();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, declaracao82.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }


            PARENTESE_DIREITO83=(Token)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_listaDeArgumentos526); 
            PARENTESE_DIREITO83_tree = 
            (Object)adaptor.create(PARENTESE_DIREITO83)
            ;
            adaptor.addChild(root_0, PARENTESE_DIREITO83_tree);


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
    // fontes/g/CanecaSintatico.g:257:1: listaDeInterfaces : ( IMPLEMENTA tipo ( SEPARADOR tipo )* )? ;
    public final CanecaSintatico.listaDeInterfaces_return listaDeInterfaces() throws RecognitionException {
        CanecaSintatico.listaDeInterfaces_return retval = new CanecaSintatico.listaDeInterfaces_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IMPLEMENTA84=null;
        Token SEPARADOR86=null;
        CanecaSintatico.tipo_return tipo85 =null;

        CanecaSintatico.tipo_return tipo87 =null;


        Object IMPLEMENTA84_tree=null;
        Object SEPARADOR86_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:258:2: ( ( IMPLEMENTA tipo ( SEPARADOR tipo )* )? )
            // fontes/g/CanecaSintatico.g:258:4: ( IMPLEMENTA tipo ( SEPARADOR tipo )* )?
            {
            root_0 = (Object)adaptor.nil();


            // fontes/g/CanecaSintatico.g:258:4: ( IMPLEMENTA tipo ( SEPARADOR tipo )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IMPLEMENTA) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:258:5: IMPLEMENTA tipo ( SEPARADOR tipo )*
                    {
                    IMPLEMENTA84=(Token)match(input,IMPLEMENTA,FOLLOW_IMPLEMENTA_in_listaDeInterfaces538); 
                    IMPLEMENTA84_tree = 
                    (Object)adaptor.create(IMPLEMENTA84)
                    ;
                    adaptor.addChild(root_0, IMPLEMENTA84_tree);


                    pushFollow(FOLLOW_tipo_in_listaDeInterfaces540);
                    tipo85=tipo();

                    state._fsp--;

                    adaptor.addChild(root_0, tipo85.getTree());

                    // fontes/g/CanecaSintatico.g:258:21: ( SEPARADOR tipo )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==SEPARADOR) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // fontes/g/CanecaSintatico.g:258:22: SEPARADOR tipo
                    	    {
                    	    SEPARADOR86=(Token)match(input,SEPARADOR,FOLLOW_SEPARADOR_in_listaDeInterfaces543); 
                    	    SEPARADOR86_tree = 
                    	    (Object)adaptor.create(SEPARADOR86)
                    	    ;
                    	    adaptor.addChild(root_0, SEPARADOR86_tree);


                    	    pushFollow(FOLLOW_tipo_in_listaDeInterfaces545);
                    	    tipo87=tipo();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, tipo87.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
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
    // fontes/g/CanecaSintatico.g:261:2: listaDeTiposGenericos : ( COLCHETE_ESQUERDO tipoGenerico COLCHETE_DIREITO )* ;
    public final CanecaSintatico.listaDeTiposGenericos_return listaDeTiposGenericos() throws RecognitionException {
        CanecaSintatico.listaDeTiposGenericos_return retval = new CanecaSintatico.listaDeTiposGenericos_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COLCHETE_ESQUERDO88=null;
        Token COLCHETE_DIREITO90=null;
        CanecaSintatico.tipoGenerico_return tipoGenerico89 =null;


        Object COLCHETE_ESQUERDO88_tree=null;
        Object COLCHETE_DIREITO90_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:262:2: ( ( COLCHETE_ESQUERDO tipoGenerico COLCHETE_DIREITO )* )
            // fontes/g/CanecaSintatico.g:262:4: ( COLCHETE_ESQUERDO tipoGenerico COLCHETE_DIREITO )*
            {
            root_0 = (Object)adaptor.nil();


            // fontes/g/CanecaSintatico.g:262:4: ( COLCHETE_ESQUERDO tipoGenerico COLCHETE_DIREITO )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==COLCHETE_ESQUERDO) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // fontes/g/CanecaSintatico.g:262:5: COLCHETE_ESQUERDO tipoGenerico COLCHETE_DIREITO
            	    {
            	    COLCHETE_ESQUERDO88=(Token)match(input,COLCHETE_ESQUERDO,FOLLOW_COLCHETE_ESQUERDO_in_listaDeTiposGenericos562); 
            	    COLCHETE_ESQUERDO88_tree = 
            	    (Object)adaptor.create(COLCHETE_ESQUERDO88)
            	    ;
            	    adaptor.addChild(root_0, COLCHETE_ESQUERDO88_tree);


            	    pushFollow(FOLLOW_tipoGenerico_in_listaDeTiposGenericos564);
            	    tipoGenerico89=tipoGenerico();

            	    state._fsp--;

            	    adaptor.addChild(root_0, tipoGenerico89.getTree());

            	    COLCHETE_DIREITO90=(Token)match(input,COLCHETE_DIREITO,FOLLOW_COLCHETE_DIREITO_in_listaDeTiposGenericos566); 
            	    COLCHETE_DIREITO90_tree = 
            	    (Object)adaptor.create(COLCHETE_DIREITO90)
            	    ;
            	    adaptor.addChild(root_0, COLCHETE_DIREITO90_tree);


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // fontes/g/CanecaSintatico.g:265:1: listaDeTipos : ( COLCHETE_ESQUERDO tipo ( SEPARADOR tipo )* COLCHETE_DIREITO )? ;
    public final CanecaSintatico.listaDeTipos_return listaDeTipos() throws RecognitionException {
        CanecaSintatico.listaDeTipos_return retval = new CanecaSintatico.listaDeTipos_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COLCHETE_ESQUERDO91=null;
        Token SEPARADOR93=null;
        Token COLCHETE_DIREITO95=null;
        CanecaSintatico.tipo_return tipo92 =null;

        CanecaSintatico.tipo_return tipo94 =null;


        Object COLCHETE_ESQUERDO91_tree=null;
        Object SEPARADOR93_tree=null;
        Object COLCHETE_DIREITO95_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:266:2: ( ( COLCHETE_ESQUERDO tipo ( SEPARADOR tipo )* COLCHETE_DIREITO )? )
            // fontes/g/CanecaSintatico.g:266:4: ( COLCHETE_ESQUERDO tipo ( SEPARADOR tipo )* COLCHETE_DIREITO )?
            {
            root_0 = (Object)adaptor.nil();


            // fontes/g/CanecaSintatico.g:266:4: ( COLCHETE_ESQUERDO tipo ( SEPARADOR tipo )* COLCHETE_DIREITO )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==COLCHETE_ESQUERDO) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:266:5: COLCHETE_ESQUERDO tipo ( SEPARADOR tipo )* COLCHETE_DIREITO
                    {
                    COLCHETE_ESQUERDO91=(Token)match(input,COLCHETE_ESQUERDO,FOLLOW_COLCHETE_ESQUERDO_in_listaDeTipos580); 
                    COLCHETE_ESQUERDO91_tree = 
                    (Object)adaptor.create(COLCHETE_ESQUERDO91)
                    ;
                    adaptor.addChild(root_0, COLCHETE_ESQUERDO91_tree);


                    pushFollow(FOLLOW_tipo_in_listaDeTipos582);
                    tipo92=tipo();

                    state._fsp--;

                    adaptor.addChild(root_0, tipo92.getTree());

                    // fontes/g/CanecaSintatico.g:266:28: ( SEPARADOR tipo )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==SEPARADOR) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // fontes/g/CanecaSintatico.g:266:29: SEPARADOR tipo
                    	    {
                    	    SEPARADOR93=(Token)match(input,SEPARADOR,FOLLOW_SEPARADOR_in_listaDeTipos585); 
                    	    SEPARADOR93_tree = 
                    	    (Object)adaptor.create(SEPARADOR93)
                    	    ;
                    	    adaptor.addChild(root_0, SEPARADOR93_tree);


                    	    pushFollow(FOLLOW_tipo_in_listaDeTipos587);
                    	    tipo94=tipo();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, tipo94.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    COLCHETE_DIREITO95=(Token)match(input,COLCHETE_DIREITO,FOLLOW_COLCHETE_DIREITO_in_listaDeTipos591); 
                    COLCHETE_DIREITO95_tree = 
                    (Object)adaptor.create(COLCHETE_DIREITO95)
                    ;
                    adaptor.addChild(root_0, COLCHETE_DIREITO95_tree);


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
    // fontes/g/CanecaSintatico.g:269:1: listaDeCapturas : ( capture )+ ;
    public final CanecaSintatico.listaDeCapturas_return listaDeCapturas() throws RecognitionException {
        CanecaSintatico.listaDeCapturas_return retval = new CanecaSintatico.listaDeCapturas_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CanecaSintatico.capture_return capture96 =null;



        try {
            // fontes/g/CanecaSintatico.g:270:2: ( ( capture )+ )
            // fontes/g/CanecaSintatico.g:270:4: ( capture )+
            {
            root_0 = (Object)adaptor.nil();


            // fontes/g/CanecaSintatico.g:270:4: ( capture )+
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
            	    // fontes/g/CanecaSintatico.g:270:5: capture
            	    {
            	    pushFollow(FOLLOW_capture_in_listaDeCapturas605);
            	    capture96=capture();

            	    state._fsp--;

            	    adaptor.addChild(root_0, capture96.getTree());

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
    // fontes/g/CanecaSintatico.g:273:1: tipoGenerico : IDENTIFICADOR listaDeInterfaces ;
    public final CanecaSintatico.tipoGenerico_return tipoGenerico() throws RecognitionException {
        CanecaSintatico.tipoGenerico_return retval = new CanecaSintatico.tipoGenerico_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFICADOR97=null;
        CanecaSintatico.listaDeInterfaces_return listaDeInterfaces98 =null;


        Object IDENTIFICADOR97_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:274:2: ( IDENTIFICADOR listaDeInterfaces )
            // fontes/g/CanecaSintatico.g:274:4: IDENTIFICADOR listaDeInterfaces
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFICADOR97=(Token)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_tipoGenerico618); 
            IDENTIFICADOR97_tree = 
            (Object)adaptor.create(IDENTIFICADOR97)
            ;
            adaptor.addChild(root_0, IDENTIFICADOR97_tree);


            pushFollow(FOLLOW_listaDeInterfaces_in_tipoGenerico620);
            listaDeInterfaces98=listaDeInterfaces();

            state._fsp--;

            adaptor.addChild(root_0, listaDeInterfaces98.getTree());

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
    // fontes/g/CanecaSintatico.g:277:1: tipo : IDENTIFICADOR listaDeTipos ;
    public final CanecaSintatico.tipo_return tipo() throws RecognitionException {
        CanecaSintatico.tipo_return retval = new CanecaSintatico.tipo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFICADOR99=null;
        CanecaSintatico.listaDeTipos_return listaDeTipos100 =null;


        Object IDENTIFICADOR99_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:278:2: ( IDENTIFICADOR listaDeTipos )
            // fontes/g/CanecaSintatico.g:278:4: IDENTIFICADOR listaDeTipos
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFICADOR99=(Token)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_tipo631); 
            IDENTIFICADOR99_tree = 
            (Object)adaptor.create(IDENTIFICADOR99)
            ;
            adaptor.addChild(root_0, IDENTIFICADOR99_tree);


            pushFollow(FOLLOW_listaDeTipos_in_tipo633);
            listaDeTipos100=listaDeTipos();

            state._fsp--;

            adaptor.addChild(root_0, listaDeTipos100.getTree());

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
    // fontes/g/CanecaSintatico.g:281:1: declaracao : tipo IDENTIFICADOR ;
    public final CanecaSintatico.declaracao_return declaracao() throws RecognitionException {
        CanecaSintatico.declaracao_return retval = new CanecaSintatico.declaracao_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFICADOR102=null;
        CanecaSintatico.tipo_return tipo101 =null;


        Object IDENTIFICADOR102_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:282:2: ( tipo IDENTIFICADOR )
            // fontes/g/CanecaSintatico.g:282:4: tipo IDENTIFICADOR
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_tipo_in_declaracao644);
            tipo101=tipo();

            state._fsp--;

            adaptor.addChild(root_0, tipo101.getTree());

            IDENTIFICADOR102=(Token)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_declaracao646); 
            IDENTIFICADOR102_tree = 
            (Object)adaptor.create(IDENTIFICADOR102)
            ;
            adaptor.addChild(root_0, IDENTIFICADOR102_tree);


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


    public static class atribuicao_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atribuicao"
    // fontes/g/CanecaSintatico.g:285:1: atribuicao : ATRIBUIDOR expressaoOuLogico ;
    public final CanecaSintatico.atribuicao_return atribuicao() throws RecognitionException {
        CanecaSintatico.atribuicao_return retval = new CanecaSintatico.atribuicao_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ATRIBUIDOR103=null;
        CanecaSintatico.expressaoOuLogico_return expressaoOuLogico104 =null;


        Object ATRIBUIDOR103_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:286:2: ( ATRIBUIDOR expressaoOuLogico )
            // fontes/g/CanecaSintatico.g:286:4: ATRIBUIDOR expressaoOuLogico
            {
            root_0 = (Object)adaptor.nil();


            ATRIBUIDOR103=(Token)match(input,ATRIBUIDOR,FOLLOW_ATRIBUIDOR_in_atribuicao657); 
            ATRIBUIDOR103_tree = 
            (Object)adaptor.create(ATRIBUIDOR103)
            ;
            adaptor.addChild(root_0, ATRIBUIDOR103_tree);


            pushFollow(FOLLOW_expressaoOuLogico_in_atribuicao659);
            expressaoOuLogico104=expressaoOuLogico();

            state._fsp--;

            adaptor.addChild(root_0, expressaoOuLogico104.getTree());

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
    // $ANTLR end "atribuicao"


    public static class declaracaoComAtribuicaoOpcional_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaracaoComAtribuicaoOpcional"
    // fontes/g/CanecaSintatico.g:289:1: declaracaoComAtribuicaoOpcional : declaracao ( atribuicao )? ;
    public final CanecaSintatico.declaracaoComAtribuicaoOpcional_return declaracaoComAtribuicaoOpcional() throws RecognitionException {
        CanecaSintatico.declaracaoComAtribuicaoOpcional_return retval = new CanecaSintatico.declaracaoComAtribuicaoOpcional_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CanecaSintatico.declaracao_return declaracao105 =null;

        CanecaSintatico.atribuicao_return atribuicao106 =null;



        try {
            // fontes/g/CanecaSintatico.g:290:2: ( declaracao ( atribuicao )? )
            // fontes/g/CanecaSintatico.g:290:4: declaracao ( atribuicao )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_declaracao_in_declaracaoComAtribuicaoOpcional670);
            declaracao105=declaracao();

            state._fsp--;

            adaptor.addChild(root_0, declaracao105.getTree());

            // fontes/g/CanecaSintatico.g:290:15: ( atribuicao )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ATRIBUIDOR) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:290:16: atribuicao
                    {
                    pushFollow(FOLLOW_atribuicao_in_declaracaoComAtribuicaoOpcional673);
                    atribuicao106=atribuicao();

                    state._fsp--;

                    adaptor.addChild(root_0, atribuicao106.getTree());

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
    // $ANTLR end "declaracaoComAtribuicaoOpcional"


    public static class expressao_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressao"
    // fontes/g/CanecaSintatico.g:293:1: expressao : expressaoOuLogico ( ATRIBUIDOR expressaoOuLogico )? ;
    public final CanecaSintatico.expressao_return expressao() throws RecognitionException {
        CanecaSintatico.expressao_return retval = new CanecaSintatico.expressao_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ATRIBUIDOR108=null;
        CanecaSintatico.expressaoOuLogico_return expressaoOuLogico107 =null;

        CanecaSintatico.expressaoOuLogico_return expressaoOuLogico109 =null;


        Object ATRIBUIDOR108_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:294:2: ( expressaoOuLogico ( ATRIBUIDOR expressaoOuLogico )? )
            // fontes/g/CanecaSintatico.g:294:4: expressaoOuLogico ( ATRIBUIDOR expressaoOuLogico )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expressaoOuLogico_in_expressao686);
            expressaoOuLogico107=expressaoOuLogico();

            state._fsp--;

            adaptor.addChild(root_0, expressaoOuLogico107.getTree());

            // fontes/g/CanecaSintatico.g:294:22: ( ATRIBUIDOR expressaoOuLogico )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ATRIBUIDOR) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:294:23: ATRIBUIDOR expressaoOuLogico
                    {
                    ATRIBUIDOR108=(Token)match(input,ATRIBUIDOR,FOLLOW_ATRIBUIDOR_in_expressao689); 
                    ATRIBUIDOR108_tree = 
                    (Object)adaptor.create(ATRIBUIDOR108)
                    ;
                    adaptor.addChild(root_0, ATRIBUIDOR108_tree);


                    pushFollow(FOLLOW_expressaoOuLogico_in_expressao691);
                    expressaoOuLogico109=expressaoOuLogico();

                    state._fsp--;

                    adaptor.addChild(root_0, expressaoOuLogico109.getTree());

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
    // fontes/g/CanecaSintatico.g:297:1: expressaoOuLogico : expressaoELogico ( OU expressaoELogico )* ;
    public final CanecaSintatico.expressaoOuLogico_return expressaoOuLogico() throws RecognitionException {
        CanecaSintatico.expressaoOuLogico_return retval = new CanecaSintatico.expressaoOuLogico_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OU111=null;
        CanecaSintatico.expressaoELogico_return expressaoELogico110 =null;

        CanecaSintatico.expressaoELogico_return expressaoELogico112 =null;


        Object OU111_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:298:2: ( expressaoELogico ( OU expressaoELogico )* )
            // fontes/g/CanecaSintatico.g:298:4: expressaoELogico ( OU expressaoELogico )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expressaoELogico_in_expressaoOuLogico704);
            expressaoELogico110=expressaoELogico();

            state._fsp--;

            adaptor.addChild(root_0, expressaoELogico110.getTree());

            // fontes/g/CanecaSintatico.g:298:21: ( OU expressaoELogico )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==OU) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // fontes/g/CanecaSintatico.g:298:22: OU expressaoELogico
            	    {
            	    OU111=(Token)match(input,OU,FOLLOW_OU_in_expressaoOuLogico707); 
            	    OU111_tree = 
            	    (Object)adaptor.create(OU111)
            	    ;
            	    adaptor.addChild(root_0, OU111_tree);


            	    pushFollow(FOLLOW_expressaoELogico_in_expressaoOuLogico709);
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
    // fontes/g/CanecaSintatico.g:301:1: expressaoELogico : expressaoComparacaoLogica ( E expressaoComparacaoLogica )* ;
    public final CanecaSintatico.expressaoELogico_return expressaoELogico() throws RecognitionException {
        CanecaSintatico.expressaoELogico_return retval = new CanecaSintatico.expressaoELogico_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token E114=null;
        CanecaSintatico.expressaoComparacaoLogica_return expressaoComparacaoLogica113 =null;

        CanecaSintatico.expressaoComparacaoLogica_return expressaoComparacaoLogica115 =null;


        Object E114_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:302:2: ( expressaoComparacaoLogica ( E expressaoComparacaoLogica )* )
            // fontes/g/CanecaSintatico.g:302:4: expressaoComparacaoLogica ( E expressaoComparacaoLogica )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expressaoComparacaoLogica_in_expressaoELogico722);
            expressaoComparacaoLogica113=expressaoComparacaoLogica();

            state._fsp--;

            adaptor.addChild(root_0, expressaoComparacaoLogica113.getTree());

            // fontes/g/CanecaSintatico.g:302:30: ( E expressaoComparacaoLogica )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==E) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // fontes/g/CanecaSintatico.g:302:31: E expressaoComparacaoLogica
            	    {
            	    E114=(Token)match(input,E,FOLLOW_E_in_expressaoELogico725); 
            	    E114_tree = 
            	    (Object)adaptor.create(E114)
            	    ;
            	    adaptor.addChild(root_0, E114_tree);


            	    pushFollow(FOLLOW_expressaoComparacaoLogica_in_expressaoELogico727);
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
    // fontes/g/CanecaSintatico.g:305:1: expressaoComparacaoLogica : expressaoAditiva ( ( IGUAL | DIFERENTE | MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) expressaoAditiva )* ;
    public final CanecaSintatico.expressaoComparacaoLogica_return expressaoComparacaoLogica() throws RecognitionException {
        CanecaSintatico.expressaoComparacaoLogica_return retval = new CanecaSintatico.expressaoComparacaoLogica_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set117=null;
        CanecaSintatico.expressaoAditiva_return expressaoAditiva116 =null;

        CanecaSintatico.expressaoAditiva_return expressaoAditiva118 =null;


        Object set117_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:306:2: ( expressaoAditiva ( ( IGUAL | DIFERENTE | MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) expressaoAditiva )* )
            // fontes/g/CanecaSintatico.g:306:4: expressaoAditiva ( ( IGUAL | DIFERENTE | MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) expressaoAditiva )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica740);
            expressaoAditiva116=expressaoAditiva();

            state._fsp--;

            adaptor.addChild(root_0, expressaoAditiva116.getTree());

            // fontes/g/CanecaSintatico.g:306:21: ( ( IGUAL | DIFERENTE | MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) expressaoAditiva )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==DIFERENTE||LA27_0==IGUAL||(LA27_0 >= MAIOR && LA27_0 <= MENOR_IGUAL)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // fontes/g/CanecaSintatico.g:306:22: ( IGUAL | DIFERENTE | MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL ) expressaoAditiva
            	    {
            	    set117=(Token)input.LT(1);

            	    if ( input.LA(1)==DIFERENTE||input.LA(1)==IGUAL||(input.LA(1) >= MAIOR && input.LA(1) <= MENOR_IGUAL) ) {
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


            	    pushFollow(FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica767);
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
    // fontes/g/CanecaSintatico.g:309:1: expressaoAditiva : expressaoMultiplicativa ( ( SOMA | SUBTRACAO ) expressaoMultiplicativa )* ;
    public final CanecaSintatico.expressaoAditiva_return expressaoAditiva() throws RecognitionException {
        CanecaSintatico.expressaoAditiva_return retval = new CanecaSintatico.expressaoAditiva_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set120=null;
        CanecaSintatico.expressaoMultiplicativa_return expressaoMultiplicativa119 =null;

        CanecaSintatico.expressaoMultiplicativa_return expressaoMultiplicativa121 =null;


        Object set120_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:310:2: ( expressaoMultiplicativa ( ( SOMA | SUBTRACAO ) expressaoMultiplicativa )* )
            // fontes/g/CanecaSintatico.g:310:4: expressaoMultiplicativa ( ( SOMA | SUBTRACAO ) expressaoMultiplicativa )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expressaoMultiplicativa_in_expressaoAditiva780);
            expressaoMultiplicativa119=expressaoMultiplicativa();

            state._fsp--;

            adaptor.addChild(root_0, expressaoMultiplicativa119.getTree());

            // fontes/g/CanecaSintatico.g:310:28: ( ( SOMA | SUBTRACAO ) expressaoMultiplicativa )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0 >= SOMA && LA28_0 <= SUBTRACAO)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // fontes/g/CanecaSintatico.g:310:29: ( SOMA | SUBTRACAO ) expressaoMultiplicativa
            	    {
            	    set120=(Token)input.LT(1);

            	    if ( (input.LA(1) >= SOMA && input.LA(1) <= SUBTRACAO) ) {
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


            	    pushFollow(FOLLOW_expressaoMultiplicativa_in_expressaoAditiva791);
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
    // fontes/g/CanecaSintatico.g:313:1: expressaoMultiplicativa : expressaoUnaria ( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) expressaoUnaria )* ;
    public final CanecaSintatico.expressaoMultiplicativa_return expressaoMultiplicativa() throws RecognitionException {
        CanecaSintatico.expressaoMultiplicativa_return retval = new CanecaSintatico.expressaoMultiplicativa_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set123=null;
        CanecaSintatico.expressaoUnaria_return expressaoUnaria122 =null;

        CanecaSintatico.expressaoUnaria_return expressaoUnaria124 =null;


        Object set123_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:314:2: ( expressaoUnaria ( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) expressaoUnaria )* )
            // fontes/g/CanecaSintatico.g:314:4: expressaoUnaria ( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) expressaoUnaria )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expressaoUnaria_in_expressaoMultiplicativa804);
            expressaoUnaria122=expressaoUnaria();

            state._fsp--;

            adaptor.addChild(root_0, expressaoUnaria122.getTree());

            // fontes/g/CanecaSintatico.g:314:20: ( ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) expressaoUnaria )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==DIVISAO||LA29_0==MULTIPLICACAO||LA29_0==RESTO_DA_DIVISAO) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // fontes/g/CanecaSintatico.g:314:21: ( MULTIPLICACAO | DIVISAO | RESTO_DA_DIVISAO ) expressaoUnaria
            	    {
            	    set123=(Token)input.LT(1);

            	    if ( input.LA(1)==DIVISAO||input.LA(1)==MULTIPLICACAO||input.LA(1)==RESTO_DA_DIVISAO ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set123)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_expressaoUnaria_in_expressaoMultiplicativa819);
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
    // fontes/g/CanecaSintatico.g:317:1: expressaoUnaria : ( expressaoPrimaria | SUBTRACAO expressaoUnaria | NEGACAO expressaoUnaria );
    public final CanecaSintatico.expressaoUnaria_return expressaoUnaria() throws RecognitionException {
        CanecaSintatico.expressaoUnaria_return retval = new CanecaSintatico.expressaoUnaria_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SUBTRACAO126=null;
        Token NEGACAO128=null;
        CanecaSintatico.expressaoPrimaria_return expressaoPrimaria125 =null;

        CanecaSintatico.expressaoUnaria_return expressaoUnaria127 =null;

        CanecaSintatico.expressaoUnaria_return expressaoUnaria129 =null;


        Object SUBTRACAO126_tree=null;
        Object NEGACAO128_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:318:2: ( expressaoPrimaria | SUBTRACAO expressaoUnaria | NEGACAO expressaoUnaria )
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
                    // fontes/g/CanecaSintatico.g:318:4: expressaoPrimaria
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expressaoPrimaria_in_expressaoUnaria832);
                    expressaoPrimaria125=expressaoPrimaria();

                    state._fsp--;

                    adaptor.addChild(root_0, expressaoPrimaria125.getTree());

                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSintatico.g:319:4: SUBTRACAO expressaoUnaria
                    {
                    root_0 = (Object)adaptor.nil();


                    SUBTRACAO126=(Token)match(input,SUBTRACAO,FOLLOW_SUBTRACAO_in_expressaoUnaria837); 
                    SUBTRACAO126_tree = 
                    (Object)adaptor.create(SUBTRACAO126)
                    ;
                    adaptor.addChild(root_0, SUBTRACAO126_tree);


                    pushFollow(FOLLOW_expressaoUnaria_in_expressaoUnaria839);
                    expressaoUnaria127=expressaoUnaria();

                    state._fsp--;

                    adaptor.addChild(root_0, expressaoUnaria127.getTree());

                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSintatico.g:320:4: NEGACAO expressaoUnaria
                    {
                    root_0 = (Object)adaptor.nil();


                    NEGACAO128=(Token)match(input,NEGACAO,FOLLOW_NEGACAO_in_expressaoUnaria844); 
                    NEGACAO128_tree = 
                    (Object)adaptor.create(NEGACAO128)
                    ;
                    adaptor.addChild(root_0, NEGACAO128_tree);


                    pushFollow(FOLLOW_expressaoUnaria_in_expressaoUnaria846);
                    expressaoUnaria129=expressaoUnaria();

                    state._fsp--;

                    adaptor.addChild(root_0, expressaoUnaria129.getTree());

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
    // fontes/g/CanecaSintatico.g:323:1: expressaoPrimaria : ( PARENTESE_ESQUERDO expressao PARENTESE_DIREITO | VALOR_BOOLEANO | VALOR_NULO | CONSTANTE_INTEIRA | CONSTANTE_REAL | LITERAL_CARACTERE | LITERAL_TEXTO | comando );
    public final CanecaSintatico.expressaoPrimaria_return expressaoPrimaria() throws RecognitionException {
        CanecaSintatico.expressaoPrimaria_return retval = new CanecaSintatico.expressaoPrimaria_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PARENTESE_ESQUERDO130=null;
        Token PARENTESE_DIREITO132=null;
        Token VALOR_BOOLEANO133=null;
        Token VALOR_NULO134=null;
        Token CONSTANTE_INTEIRA135=null;
        Token CONSTANTE_REAL136=null;
        Token LITERAL_CARACTERE137=null;
        Token LITERAL_TEXTO138=null;
        CanecaSintatico.expressao_return expressao131 =null;

        CanecaSintatico.comando_return comando139 =null;


        Object PARENTESE_ESQUERDO130_tree=null;
        Object PARENTESE_DIREITO132_tree=null;
        Object VALOR_BOOLEANO133_tree=null;
        Object VALOR_NULO134_tree=null;
        Object CONSTANTE_INTEIRA135_tree=null;
        Object CONSTANTE_REAL136_tree=null;
        Object LITERAL_CARACTERE137_tree=null;
        Object LITERAL_TEXTO138_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:324:2: ( PARENTESE_ESQUERDO expressao PARENTESE_DIREITO | VALOR_BOOLEANO | VALOR_NULO | CONSTANTE_INTEIRA | CONSTANTE_REAL | LITERAL_CARACTERE | LITERAL_TEXTO | comando )
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
                    // fontes/g/CanecaSintatico.g:324:4: PARENTESE_ESQUERDO expressao PARENTESE_DIREITO
                    {
                    root_0 = (Object)adaptor.nil();


                    PARENTESE_ESQUERDO130=(Token)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_expressaoPrimaria857); 
                    PARENTESE_ESQUERDO130_tree = 
                    (Object)adaptor.create(PARENTESE_ESQUERDO130)
                    ;
                    adaptor.addChild(root_0, PARENTESE_ESQUERDO130_tree);


                    pushFollow(FOLLOW_expressao_in_expressaoPrimaria859);
                    expressao131=expressao();

                    state._fsp--;

                    adaptor.addChild(root_0, expressao131.getTree());

                    PARENTESE_DIREITO132=(Token)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_expressaoPrimaria861); 
                    PARENTESE_DIREITO132_tree = 
                    (Object)adaptor.create(PARENTESE_DIREITO132)
                    ;
                    adaptor.addChild(root_0, PARENTESE_DIREITO132_tree);


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSintatico.g:325:4: VALOR_BOOLEANO
                    {
                    root_0 = (Object)adaptor.nil();


                    VALOR_BOOLEANO133=(Token)match(input,VALOR_BOOLEANO,FOLLOW_VALOR_BOOLEANO_in_expressaoPrimaria866); 
                    VALOR_BOOLEANO133_tree = 
                    (Object)adaptor.create(VALOR_BOOLEANO133)
                    ;
                    adaptor.addChild(root_0, VALOR_BOOLEANO133_tree);


                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSintatico.g:326:4: VALOR_NULO
                    {
                    root_0 = (Object)adaptor.nil();


                    VALOR_NULO134=(Token)match(input,VALOR_NULO,FOLLOW_VALOR_NULO_in_expressaoPrimaria871); 
                    VALOR_NULO134_tree = 
                    (Object)adaptor.create(VALOR_NULO134)
                    ;
                    adaptor.addChild(root_0, VALOR_NULO134_tree);


                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSintatico.g:327:4: CONSTANTE_INTEIRA
                    {
                    root_0 = (Object)adaptor.nil();


                    CONSTANTE_INTEIRA135=(Token)match(input,CONSTANTE_INTEIRA,FOLLOW_CONSTANTE_INTEIRA_in_expressaoPrimaria876); 
                    CONSTANTE_INTEIRA135_tree = 
                    (Object)adaptor.create(CONSTANTE_INTEIRA135)
                    ;
                    adaptor.addChild(root_0, CONSTANTE_INTEIRA135_tree);


                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSintatico.g:328:4: CONSTANTE_REAL
                    {
                    root_0 = (Object)adaptor.nil();


                    CONSTANTE_REAL136=(Token)match(input,CONSTANTE_REAL,FOLLOW_CONSTANTE_REAL_in_expressaoPrimaria881); 
                    CONSTANTE_REAL136_tree = 
                    (Object)adaptor.create(CONSTANTE_REAL136)
                    ;
                    adaptor.addChild(root_0, CONSTANTE_REAL136_tree);


                    }
                    break;
                case 6 :
                    // fontes/g/CanecaSintatico.g:329:4: LITERAL_CARACTERE
                    {
                    root_0 = (Object)adaptor.nil();


                    LITERAL_CARACTERE137=(Token)match(input,LITERAL_CARACTERE,FOLLOW_LITERAL_CARACTERE_in_expressaoPrimaria886); 
                    LITERAL_CARACTERE137_tree = 
                    (Object)adaptor.create(LITERAL_CARACTERE137)
                    ;
                    adaptor.addChild(root_0, LITERAL_CARACTERE137_tree);


                    }
                    break;
                case 7 :
                    // fontes/g/CanecaSintatico.g:330:4: LITERAL_TEXTO
                    {
                    root_0 = (Object)adaptor.nil();


                    LITERAL_TEXTO138=(Token)match(input,LITERAL_TEXTO,FOLLOW_LITERAL_TEXTO_in_expressaoPrimaria891); 
                    LITERAL_TEXTO138_tree = 
                    (Object)adaptor.create(LITERAL_TEXTO138)
                    ;
                    adaptor.addChild(root_0, LITERAL_TEXTO138_tree);


                    }
                    break;
                case 8 :
                    // fontes/g/CanecaSintatico.g:331:4: comando
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_comando_in_expressaoPrimaria896);
                    comando139=comando();

                    state._fsp--;

                    adaptor.addChild(root_0, comando139.getTree());

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
    // fontes/g/CanecaSintatico.g:334:1: comando : seletor ( chamada )* ;
    public final CanecaSintatico.comando_return comando() throws RecognitionException {
        CanecaSintatico.comando_return retval = new CanecaSintatico.comando_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CanecaSintatico.seletor_return seletor140 =null;

        CanecaSintatico.chamada_return chamada141 =null;



        try {
            // fontes/g/CanecaSintatico.g:335:2: ( seletor ( chamada )* )
            // fontes/g/CanecaSintatico.g:335:4: seletor ( chamada )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_seletor_in_comando907);
            seletor140=seletor();

            state._fsp--;

            adaptor.addChild(root_0, seletor140.getTree());

            // fontes/g/CanecaSintatico.g:335:12: ( chamada )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0 >= CHAMADA_DE_CLASSE && LA32_0 <= CHAMADA_DE_OBJETO)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // fontes/g/CanecaSintatico.g:335:13: chamada
            	    {
            	    pushFollow(FOLLOW_chamada_in_comando910);
            	    chamada141=chamada();

            	    state._fsp--;

            	    adaptor.addChild(root_0, chamada141.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // fontes/g/CanecaSintatico.g:338:1: seletor : ( ESSE | ESSA | instanciacao | IDENTIFICADOR ( listaDeParametros )? );
    public final CanecaSintatico.seletor_return seletor() throws RecognitionException {
        CanecaSintatico.seletor_return retval = new CanecaSintatico.seletor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ESSE142=null;
        Token ESSA143=null;
        Token IDENTIFICADOR145=null;
        CanecaSintatico.instanciacao_return instanciacao144 =null;

        CanecaSintatico.listaDeParametros_return listaDeParametros146 =null;


        Object ESSE142_tree=null;
        Object ESSA143_tree=null;
        Object IDENTIFICADOR145_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:339:2: ( ESSE | ESSA | instanciacao | IDENTIFICADOR ( listaDeParametros )? )
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
                    // fontes/g/CanecaSintatico.g:339:4: ESSE
                    {
                    root_0 = (Object)adaptor.nil();


                    ESSE142=(Token)match(input,ESSE,FOLLOW_ESSE_in_seletor923); 
                    ESSE142_tree = 
                    (Object)adaptor.create(ESSE142)
                    ;
                    adaptor.addChild(root_0, ESSE142_tree);


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSintatico.g:340:4: ESSA
                    {
                    root_0 = (Object)adaptor.nil();


                    ESSA143=(Token)match(input,ESSA,FOLLOW_ESSA_in_seletor928); 
                    ESSA143_tree = 
                    (Object)adaptor.create(ESSA143)
                    ;
                    adaptor.addChild(root_0, ESSA143_tree);


                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSintatico.g:341:4: instanciacao
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_instanciacao_in_seletor933);
                    instanciacao144=instanciacao();

                    state._fsp--;

                    adaptor.addChild(root_0, instanciacao144.getTree());

                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSintatico.g:342:4: IDENTIFICADOR ( listaDeParametros )?
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFICADOR145=(Token)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_seletor938); 
                    IDENTIFICADOR145_tree = 
                    (Object)adaptor.create(IDENTIFICADOR145)
                    ;
                    adaptor.addChild(root_0, IDENTIFICADOR145_tree);


                    // fontes/g/CanecaSintatico.g:342:18: ( listaDeParametros )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==PARENTESE_ESQUERDO) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // fontes/g/CanecaSintatico.g:342:19: listaDeParametros
                            {
                            pushFollow(FOLLOW_listaDeParametros_in_seletor941);
                            listaDeParametros146=listaDeParametros();

                            state._fsp--;

                            adaptor.addChild(root_0, listaDeParametros146.getTree());

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
    // fontes/g/CanecaSintatico.g:345:1: chamada : ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( listaDeParametros )? ;
    public final CanecaSintatico.chamada_return chamada() throws RecognitionException {
        CanecaSintatico.chamada_return retval = new CanecaSintatico.chamada_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set147=null;
        Token IDENTIFICADOR148=null;
        CanecaSintatico.listaDeParametros_return listaDeParametros149 =null;


        Object set147_tree=null;
        Object IDENTIFICADOR148_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:346:2: ( ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( listaDeParametros )? )
            // fontes/g/CanecaSintatico.g:346:4: ( CHAMADA_DE_CLASSE | CHAMADA_DE_OBJETO ) IDENTIFICADOR ( listaDeParametros )?
            {
            root_0 = (Object)adaptor.nil();


            set147=(Token)input.LT(1);

            if ( (input.LA(1) >= CHAMADA_DE_CLASSE && input.LA(1) <= CHAMADA_DE_OBJETO) ) {
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


            IDENTIFICADOR148=(Token)match(input,IDENTIFICADOR,FOLLOW_IDENTIFICADOR_in_chamada962); 
            IDENTIFICADOR148_tree = 
            (Object)adaptor.create(IDENTIFICADOR148)
            ;
            adaptor.addChild(root_0, IDENTIFICADOR148_tree);


            // fontes/g/CanecaSintatico.g:346:58: ( listaDeParametros )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==PARENTESE_ESQUERDO) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:346:59: listaDeParametros
                    {
                    pushFollow(FOLLOW_listaDeParametros_in_chamada965);
                    listaDeParametros149=listaDeParametros();

                    state._fsp--;

                    adaptor.addChild(root_0, listaDeParametros149.getTree());

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
    // fontes/g/CanecaSintatico.g:349:1: instanciacao : ( NOVO | NOVA ) tipo listaDeParametros ;
    public final CanecaSintatico.instanciacao_return instanciacao() throws RecognitionException {
        CanecaSintatico.instanciacao_return retval = new CanecaSintatico.instanciacao_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set150=null;
        CanecaSintatico.tipo_return tipo151 =null;

        CanecaSintatico.listaDeParametros_return listaDeParametros152 =null;


        Object set150_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:350:2: ( ( NOVO | NOVA ) tipo listaDeParametros )
            // fontes/g/CanecaSintatico.g:350:4: ( NOVO | NOVA ) tipo listaDeParametros
            {
            root_0 = (Object)adaptor.nil();


            set150=(Token)input.LT(1);

            if ( (input.LA(1) >= NOVA && input.LA(1) <= NOVO) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set150)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            pushFollow(FOLLOW_tipo_in_instanciacao986);
            tipo151=tipo();

            state._fsp--;

            adaptor.addChild(root_0, tipo151.getTree());

            pushFollow(FOLLOW_listaDeParametros_in_instanciacao988);
            listaDeParametros152=listaDeParametros();

            state._fsp--;

            adaptor.addChild(root_0, listaDeParametros152.getTree());

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
    // fontes/g/CanecaSintatico.g:353:1: destruicao : DESTRUA expressao ;
    public final CanecaSintatico.destruicao_return destruicao() throws RecognitionException {
        CanecaSintatico.destruicao_return retval = new CanecaSintatico.destruicao_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DESTRUA153=null;
        CanecaSintatico.expressao_return expressao154 =null;


        Object DESTRUA153_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:354:2: ( DESTRUA expressao )
            // fontes/g/CanecaSintatico.g:354:4: DESTRUA expressao
            {
            root_0 = (Object)adaptor.nil();


            DESTRUA153=(Token)match(input,DESTRUA,FOLLOW_DESTRUA_in_destruicao999); 
            DESTRUA153_tree = 
            (Object)adaptor.create(DESTRUA153)
            ;
            adaptor.addChild(root_0, DESTRUA153_tree);


            pushFollow(FOLLOW_expressao_in_destruicao1001);
            expressao154=expressao();

            state._fsp--;

            adaptor.addChild(root_0, expressao154.getTree());

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
    // fontes/g/CanecaSintatico.g:357:1: retorno : RETORNE expressao ;
    public final CanecaSintatico.retorno_return retorno() throws RecognitionException {
        CanecaSintatico.retorno_return retval = new CanecaSintatico.retorno_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RETORNE155=null;
        CanecaSintatico.expressao_return expressao156 =null;


        Object RETORNE155_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:358:2: ( RETORNE expressao )
            // fontes/g/CanecaSintatico.g:358:4: RETORNE expressao
            {
            root_0 = (Object)adaptor.nil();


            RETORNE155=(Token)match(input,RETORNE,FOLLOW_RETORNE_in_retorno1013); 
            RETORNE155_tree = 
            (Object)adaptor.create(RETORNE155)
            ;
            adaptor.addChild(root_0, RETORNE155_tree);


            pushFollow(FOLLOW_expressao_in_retorno1015);
            expressao156=expressao();

            state._fsp--;

            adaptor.addChild(root_0, expressao156.getTree());

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
    // fontes/g/CanecaSintatico.g:361:1: se : SE PARENTESE_ESQUERDO expressao PARENTESE_DIREITO blocoDeInstrucoes ( SENAO blocoDeInstrucoes )? ;
    public final CanecaSintatico.se_return se() throws RecognitionException {
        CanecaSintatico.se_return retval = new CanecaSintatico.se_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SE157=null;
        Token PARENTESE_ESQUERDO158=null;
        Token PARENTESE_DIREITO160=null;
        Token SENAO162=null;
        CanecaSintatico.expressao_return expressao159 =null;

        CanecaSintatico.blocoDeInstrucoes_return blocoDeInstrucoes161 =null;

        CanecaSintatico.blocoDeInstrucoes_return blocoDeInstrucoes163 =null;


        Object SE157_tree=null;
        Object PARENTESE_ESQUERDO158_tree=null;
        Object PARENTESE_DIREITO160_tree=null;
        Object SENAO162_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:362:2: ( SE PARENTESE_ESQUERDO expressao PARENTESE_DIREITO blocoDeInstrucoes ( SENAO blocoDeInstrucoes )? )
            // fontes/g/CanecaSintatico.g:362:4: SE PARENTESE_ESQUERDO expressao PARENTESE_DIREITO blocoDeInstrucoes ( SENAO blocoDeInstrucoes )?
            {
            root_0 = (Object)adaptor.nil();


            SE157=(Token)match(input,SE,FOLLOW_SE_in_se1026); 
            SE157_tree = 
            (Object)adaptor.create(SE157)
            ;
            adaptor.addChild(root_0, SE157_tree);


            PARENTESE_ESQUERDO158=(Token)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_se1028); 
            PARENTESE_ESQUERDO158_tree = 
            (Object)adaptor.create(PARENTESE_ESQUERDO158)
            ;
            adaptor.addChild(root_0, PARENTESE_ESQUERDO158_tree);


            pushFollow(FOLLOW_expressao_in_se1030);
            expressao159=expressao();

            state._fsp--;

            adaptor.addChild(root_0, expressao159.getTree());

            PARENTESE_DIREITO160=(Token)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_se1032); 
            PARENTESE_DIREITO160_tree = 
            (Object)adaptor.create(PARENTESE_DIREITO160)
            ;
            adaptor.addChild(root_0, PARENTESE_DIREITO160_tree);


            pushFollow(FOLLOW_blocoDeInstrucoes_in_se1034);
            blocoDeInstrucoes161=blocoDeInstrucoes();

            state._fsp--;

            adaptor.addChild(root_0, blocoDeInstrucoes161.getTree());

            // fontes/g/CanecaSintatico.g:362:72: ( SENAO blocoDeInstrucoes )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==SENAO) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:362:73: SENAO blocoDeInstrucoes
                    {
                    SENAO162=(Token)match(input,SENAO,FOLLOW_SENAO_in_se1037); 
                    SENAO162_tree = 
                    (Object)adaptor.create(SENAO162)
                    ;
                    adaptor.addChild(root_0, SENAO162_tree);


                    pushFollow(FOLLOW_blocoDeInstrucoes_in_se1039);
                    blocoDeInstrucoes163=blocoDeInstrucoes();

                    state._fsp--;

                    adaptor.addChild(root_0, blocoDeInstrucoes163.getTree());

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
    // fontes/g/CanecaSintatico.g:365:1: para : PARA PARENTESE_ESQUERDO expressao TERMINADOR expressao TERMINADOR expressao PARENTESE_DIREITO blocoDeInstrucoes ;
    public final CanecaSintatico.para_return para() throws RecognitionException {
        CanecaSintatico.para_return retval = new CanecaSintatico.para_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PARA164=null;
        Token PARENTESE_ESQUERDO165=null;
        Token TERMINADOR167=null;
        Token TERMINADOR169=null;
        Token PARENTESE_DIREITO171=null;
        CanecaSintatico.expressao_return expressao166 =null;

        CanecaSintatico.expressao_return expressao168 =null;

        CanecaSintatico.expressao_return expressao170 =null;

        CanecaSintatico.blocoDeInstrucoes_return blocoDeInstrucoes172 =null;


        Object PARA164_tree=null;
        Object PARENTESE_ESQUERDO165_tree=null;
        Object TERMINADOR167_tree=null;
        Object TERMINADOR169_tree=null;
        Object PARENTESE_DIREITO171_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:366:2: ( PARA PARENTESE_ESQUERDO expressao TERMINADOR expressao TERMINADOR expressao PARENTESE_DIREITO blocoDeInstrucoes )
            // fontes/g/CanecaSintatico.g:366:4: PARA PARENTESE_ESQUERDO expressao TERMINADOR expressao TERMINADOR expressao PARENTESE_DIREITO blocoDeInstrucoes
            {
            root_0 = (Object)adaptor.nil();


            PARA164=(Token)match(input,PARA,FOLLOW_PARA_in_para1052); 
            PARA164_tree = 
            (Object)adaptor.create(PARA164)
            ;
            adaptor.addChild(root_0, PARA164_tree);


            PARENTESE_ESQUERDO165=(Token)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_para1054); 
            PARENTESE_ESQUERDO165_tree = 
            (Object)adaptor.create(PARENTESE_ESQUERDO165)
            ;
            adaptor.addChild(root_0, PARENTESE_ESQUERDO165_tree);


            pushFollow(FOLLOW_expressao_in_para1056);
            expressao166=expressao();

            state._fsp--;

            adaptor.addChild(root_0, expressao166.getTree());

            TERMINADOR167=(Token)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_para1058); 
            TERMINADOR167_tree = 
            (Object)adaptor.create(TERMINADOR167)
            ;
            adaptor.addChild(root_0, TERMINADOR167_tree);


            pushFollow(FOLLOW_expressao_in_para1060);
            expressao168=expressao();

            state._fsp--;

            adaptor.addChild(root_0, expressao168.getTree());

            TERMINADOR169=(Token)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_para1062); 
            TERMINADOR169_tree = 
            (Object)adaptor.create(TERMINADOR169)
            ;
            adaptor.addChild(root_0, TERMINADOR169_tree);


            pushFollow(FOLLOW_expressao_in_para1064);
            expressao170=expressao();

            state._fsp--;

            adaptor.addChild(root_0, expressao170.getTree());

            PARENTESE_DIREITO171=(Token)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_para1066); 
            PARENTESE_DIREITO171_tree = 
            (Object)adaptor.create(PARENTESE_DIREITO171)
            ;
            adaptor.addChild(root_0, PARENTESE_DIREITO171_tree);


            pushFollow(FOLLOW_blocoDeInstrucoes_in_para1068);
            blocoDeInstrucoes172=blocoDeInstrucoes();

            state._fsp--;

            adaptor.addChild(root_0, blocoDeInstrucoes172.getTree());

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
    // fontes/g/CanecaSintatico.g:369:1: repita : REPITA PARENTESE_ESQUERDO declaracao PARENTESE_DIREITO blocoDeInstrucoes ;
    public final CanecaSintatico.repita_return repita() throws RecognitionException {
        CanecaSintatico.repita_return retval = new CanecaSintatico.repita_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token REPITA173=null;
        Token PARENTESE_ESQUERDO174=null;
        Token PARENTESE_DIREITO176=null;
        CanecaSintatico.declaracao_return declaracao175 =null;

        CanecaSintatico.blocoDeInstrucoes_return blocoDeInstrucoes177 =null;


        Object REPITA173_tree=null;
        Object PARENTESE_ESQUERDO174_tree=null;
        Object PARENTESE_DIREITO176_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:370:2: ( REPITA PARENTESE_ESQUERDO declaracao PARENTESE_DIREITO blocoDeInstrucoes )
            // fontes/g/CanecaSintatico.g:370:4: REPITA PARENTESE_ESQUERDO declaracao PARENTESE_DIREITO blocoDeInstrucoes
            {
            root_0 = (Object)adaptor.nil();


            REPITA173=(Token)match(input,REPITA,FOLLOW_REPITA_in_repita1079); 
            REPITA173_tree = 
            (Object)adaptor.create(REPITA173)
            ;
            adaptor.addChild(root_0, REPITA173_tree);


            PARENTESE_ESQUERDO174=(Token)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_repita1081); 
            PARENTESE_ESQUERDO174_tree = 
            (Object)adaptor.create(PARENTESE_ESQUERDO174)
            ;
            adaptor.addChild(root_0, PARENTESE_ESQUERDO174_tree);


            pushFollow(FOLLOW_declaracao_in_repita1083);
            declaracao175=declaracao();

            state._fsp--;

            adaptor.addChild(root_0, declaracao175.getTree());

            PARENTESE_DIREITO176=(Token)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_repita1085); 
            PARENTESE_DIREITO176_tree = 
            (Object)adaptor.create(PARENTESE_DIREITO176)
            ;
            adaptor.addChild(root_0, PARENTESE_DIREITO176_tree);


            pushFollow(FOLLOW_blocoDeInstrucoes_in_repita1087);
            blocoDeInstrucoes177=blocoDeInstrucoes();

            state._fsp--;

            adaptor.addChild(root_0, blocoDeInstrucoes177.getTree());

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
    // fontes/g/CanecaSintatico.g:373:1: enquanto : ENQUANTO PARENTESE_ESQUERDO expressao PARENTESE_DIREITO blocoDeInstrucoes ;
    public final CanecaSintatico.enquanto_return enquanto() throws RecognitionException {
        CanecaSintatico.enquanto_return retval = new CanecaSintatico.enquanto_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ENQUANTO178=null;
        Token PARENTESE_ESQUERDO179=null;
        Token PARENTESE_DIREITO181=null;
        CanecaSintatico.expressao_return expressao180 =null;

        CanecaSintatico.blocoDeInstrucoes_return blocoDeInstrucoes182 =null;


        Object ENQUANTO178_tree=null;
        Object PARENTESE_ESQUERDO179_tree=null;
        Object PARENTESE_DIREITO181_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:374:2: ( ENQUANTO PARENTESE_ESQUERDO expressao PARENTESE_DIREITO blocoDeInstrucoes )
            // fontes/g/CanecaSintatico.g:374:4: ENQUANTO PARENTESE_ESQUERDO expressao PARENTESE_DIREITO blocoDeInstrucoes
            {
            root_0 = (Object)adaptor.nil();


            ENQUANTO178=(Token)match(input,ENQUANTO,FOLLOW_ENQUANTO_in_enquanto1098); 
            ENQUANTO178_tree = 
            (Object)adaptor.create(ENQUANTO178)
            ;
            adaptor.addChild(root_0, ENQUANTO178_tree);


            PARENTESE_ESQUERDO179=(Token)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_enquanto1100); 
            PARENTESE_ESQUERDO179_tree = 
            (Object)adaptor.create(PARENTESE_ESQUERDO179)
            ;
            adaptor.addChild(root_0, PARENTESE_ESQUERDO179_tree);


            pushFollow(FOLLOW_expressao_in_enquanto1102);
            expressao180=expressao();

            state._fsp--;

            adaptor.addChild(root_0, expressao180.getTree());

            PARENTESE_DIREITO181=(Token)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_enquanto1104); 
            PARENTESE_DIREITO181_tree = 
            (Object)adaptor.create(PARENTESE_DIREITO181)
            ;
            adaptor.addChild(root_0, PARENTESE_DIREITO181_tree);


            pushFollow(FOLLOW_blocoDeInstrucoes_in_enquanto1106);
            blocoDeInstrucoes182=blocoDeInstrucoes();

            state._fsp--;

            adaptor.addChild(root_0, blocoDeInstrucoes182.getTree());

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
    // fontes/g/CanecaSintatico.g:377:1: tente : TENTE blocoDeInstrucoes listaDeCapturas ;
    public final CanecaSintatico.tente_return tente() throws RecognitionException {
        CanecaSintatico.tente_return retval = new CanecaSintatico.tente_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TENTE183=null;
        CanecaSintatico.blocoDeInstrucoes_return blocoDeInstrucoes184 =null;

        CanecaSintatico.listaDeCapturas_return listaDeCapturas185 =null;


        Object TENTE183_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:378:2: ( TENTE blocoDeInstrucoes listaDeCapturas )
            // fontes/g/CanecaSintatico.g:378:4: TENTE blocoDeInstrucoes listaDeCapturas
            {
            root_0 = (Object)adaptor.nil();


            TENTE183=(Token)match(input,TENTE,FOLLOW_TENTE_in_tente1117); 
            TENTE183_tree = 
            (Object)adaptor.create(TENTE183)
            ;
            adaptor.addChild(root_0, TENTE183_tree);


            pushFollow(FOLLOW_blocoDeInstrucoes_in_tente1119);
            blocoDeInstrucoes184=blocoDeInstrucoes();

            state._fsp--;

            adaptor.addChild(root_0, blocoDeInstrucoes184.getTree());

            pushFollow(FOLLOW_listaDeCapturas_in_tente1121);
            listaDeCapturas185=listaDeCapturas();

            state._fsp--;

            adaptor.addChild(root_0, listaDeCapturas185.getTree());

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
    // fontes/g/CanecaSintatico.g:381:1: capture : CAPTURE PARENTESE_ESQUERDO declaracao PARENTESE_DIREITO blocoDeInstrucoes ;
    public final CanecaSintatico.capture_return capture() throws RecognitionException {
        CanecaSintatico.capture_return retval = new CanecaSintatico.capture_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CAPTURE186=null;
        Token PARENTESE_ESQUERDO187=null;
        Token PARENTESE_DIREITO189=null;
        CanecaSintatico.declaracao_return declaracao188 =null;

        CanecaSintatico.blocoDeInstrucoes_return blocoDeInstrucoes190 =null;


        Object CAPTURE186_tree=null;
        Object PARENTESE_ESQUERDO187_tree=null;
        Object PARENTESE_DIREITO189_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:382:2: ( CAPTURE PARENTESE_ESQUERDO declaracao PARENTESE_DIREITO blocoDeInstrucoes )
            // fontes/g/CanecaSintatico.g:382:4: CAPTURE PARENTESE_ESQUERDO declaracao PARENTESE_DIREITO blocoDeInstrucoes
            {
            root_0 = (Object)adaptor.nil();


            CAPTURE186=(Token)match(input,CAPTURE,FOLLOW_CAPTURE_in_capture1132); 
            CAPTURE186_tree = 
            (Object)adaptor.create(CAPTURE186)
            ;
            adaptor.addChild(root_0, CAPTURE186_tree);


            PARENTESE_ESQUERDO187=(Token)match(input,PARENTESE_ESQUERDO,FOLLOW_PARENTESE_ESQUERDO_in_capture1134); 
            PARENTESE_ESQUERDO187_tree = 
            (Object)adaptor.create(PARENTESE_ESQUERDO187)
            ;
            adaptor.addChild(root_0, PARENTESE_ESQUERDO187_tree);


            pushFollow(FOLLOW_declaracao_in_capture1136);
            declaracao188=declaracao();

            state._fsp--;

            adaptor.addChild(root_0, declaracao188.getTree());

            PARENTESE_DIREITO189=(Token)match(input,PARENTESE_DIREITO,FOLLOW_PARENTESE_DIREITO_in_capture1138); 
            PARENTESE_DIREITO189_tree = 
            (Object)adaptor.create(PARENTESE_DIREITO189)
            ;
            adaptor.addChild(root_0, PARENTESE_DIREITO189_tree);


            pushFollow(FOLLOW_blocoDeInstrucoes_in_capture1140);
            blocoDeInstrucoes190=blocoDeInstrucoes();

            state._fsp--;

            adaptor.addChild(root_0, blocoDeInstrucoes190.getTree());

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
    // fontes/g/CanecaSintatico.g:385:1: lance : LANCE expressao ;
    public final CanecaSintatico.lance_return lance() throws RecognitionException {
        CanecaSintatico.lance_return retval = new CanecaSintatico.lance_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LANCE191=null;
        CanecaSintatico.expressao_return expressao192 =null;


        Object LANCE191_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:386:2: ( LANCE expressao )
            // fontes/g/CanecaSintatico.g:386:4: LANCE expressao
            {
            root_0 = (Object)adaptor.nil();


            LANCE191=(Token)match(input,LANCE,FOLLOW_LANCE_in_lance1151); 
            LANCE191_tree = 
            (Object)adaptor.create(LANCE191)
            ;
            adaptor.addChild(root_0, LANCE191_tree);


            pushFollow(FOLLOW_expressao_in_lance1153);
            expressao192=expressao();

            state._fsp--;

            adaptor.addChild(root_0, expressao192.getTree());

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
    // fontes/g/CanecaSintatico.g:389:1: instrucao : ( ( options {k=2; } : expressao TERMINADOR | declaracaoComAtribuicaoOpcional TERMINADOR ) | destruicao TERMINADOR | retorno TERMINADOR | se | para | repita | enquanto | tente | lance TERMINADOR );
    public final CanecaSintatico.instrucao_return instrucao() throws RecognitionException {
        CanecaSintatico.instrucao_return retval = new CanecaSintatico.instrucao_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TERMINADOR194=null;
        Token TERMINADOR196=null;
        Token TERMINADOR198=null;
        Token TERMINADOR200=null;
        Token TERMINADOR207=null;
        CanecaSintatico.expressao_return expressao193 =null;

        CanecaSintatico.declaracaoComAtribuicaoOpcional_return declaracaoComAtribuicaoOpcional195 =null;

        CanecaSintatico.destruicao_return destruicao197 =null;

        CanecaSintatico.retorno_return retorno199 =null;

        CanecaSintatico.se_return se201 =null;

        CanecaSintatico.para_return para202 =null;

        CanecaSintatico.repita_return repita203 =null;

        CanecaSintatico.enquanto_return enquanto204 =null;

        CanecaSintatico.tente_return tente205 =null;

        CanecaSintatico.lance_return lance206 =null;


        Object TERMINADOR194_tree=null;
        Object TERMINADOR196_tree=null;
        Object TERMINADOR198_tree=null;
        Object TERMINADOR200_tree=null;
        Object TERMINADOR207_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:390:2: ( ( options {k=2; } : expressao TERMINADOR | declaracaoComAtribuicaoOpcional TERMINADOR ) | destruicao TERMINADOR | retorno TERMINADOR | se | para | repita | enquanto | tente | lance TERMINADOR )
            int alt38=9;
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
                alt38=1;
                }
                break;
            case DESTRUA:
                {
                alt38=2;
                }
                break;
            case RETORNE:
                {
                alt38=3;
                }
                break;
            case SE:
                {
                alt38=4;
                }
                break;
            case PARA:
                {
                alt38=5;
                }
                break;
            case REPITA:
                {
                alt38=6;
                }
                break;
            case ENQUANTO:
                {
                alt38=7;
                }
                break;
            case TENTE:
                {
                alt38=8;
                }
                break;
            case LANCE:
                {
                alt38=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }

            switch (alt38) {
                case 1 :
                    // fontes/g/CanecaSintatico.g:391:2: ( options {k=2; } : expressao TERMINADOR | declaracaoComAtribuicaoOpcional TERMINADOR )
                    {
                    root_0 = (Object)adaptor.nil();


                    // fontes/g/CanecaSintatico.g:391:2: ( options {k=2; } : expressao TERMINADOR | declaracaoComAtribuicaoOpcional TERMINADOR )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( ((LA37_0 >= CONSTANTE_INTEIRA && LA37_0 <= CONSTANTE_REAL)||(LA37_0 >= ESSA && LA37_0 <= ESSE)||(LA37_0 >= LITERAL_CARACTERE && LA37_0 <= LITERAL_TEXTO)||(LA37_0 >= NEGACAO && LA37_0 <= NOVO)||LA37_0==PARENTESE_ESQUERDO||LA37_0==SUBTRACAO||(LA37_0 >= VALOR_BOOLEANO && LA37_0 <= VALOR_NULO)) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==IDENTIFICADOR) ) {
                        int LA37_11 = input.LA(2);

                        if ( (LA37_11==ATRIBUIDOR||(LA37_11 >= CHAMADA_DE_CLASSE && LA37_11 <= CHAMADA_DE_OBJETO)||LA37_11==DIFERENTE||(LA37_11 >= DIVISAO && LA37_11 <= E)||LA37_11==IGUAL||(LA37_11 >= MAIOR && LA37_11 <= MENOR_IGUAL)||LA37_11==MULTIPLICACAO||LA37_11==OU||LA37_11==PARENTESE_ESQUERDO||LA37_11==RESTO_DA_DIVISAO||(LA37_11 >= SOMA && LA37_11 <= SUBTRACAO)||LA37_11==TERMINADOR) ) {
                            alt37=1;
                        }
                        else if ( (LA37_11==COLCHETE_ESQUERDO||LA37_11==IDENTIFICADOR) ) {
                            alt37=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 37, 11, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;

                    }
                    switch (alt37) {
                        case 1 :
                            // fontes/g/CanecaSintatico.g:392:5: expressao TERMINADOR
                            {
                            pushFollow(FOLLOW_expressao_in_instrucao1181);
                            expressao193=expressao();

                            state._fsp--;

                            adaptor.addChild(root_0, expressao193.getTree());

                            TERMINADOR194=(Token)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_instrucao1183); 
                            TERMINADOR194_tree = 
                            (Object)adaptor.create(TERMINADOR194)
                            ;
                            adaptor.addChild(root_0, TERMINADOR194_tree);


                            }
                            break;
                        case 2 :
                            // fontes/g/CanecaSintatico.g:393:5: declaracaoComAtribuicaoOpcional TERMINADOR
                            {
                            pushFollow(FOLLOW_declaracaoComAtribuicaoOpcional_in_instrucao1189);
                            declaracaoComAtribuicaoOpcional195=declaracaoComAtribuicaoOpcional();

                            state._fsp--;

                            adaptor.addChild(root_0, declaracaoComAtribuicaoOpcional195.getTree());

                            TERMINADOR196=(Token)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_instrucao1191); 
                            TERMINADOR196_tree = 
                            (Object)adaptor.create(TERMINADOR196)
                            ;
                            adaptor.addChild(root_0, TERMINADOR196_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // fontes/g/CanecaSintatico.g:395:4: destruicao TERMINADOR
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_destruicao_in_instrucao1199);
                    destruicao197=destruicao();

                    state._fsp--;

                    adaptor.addChild(root_0, destruicao197.getTree());

                    TERMINADOR198=(Token)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_instrucao1201); 
                    TERMINADOR198_tree = 
                    (Object)adaptor.create(TERMINADOR198)
                    ;
                    adaptor.addChild(root_0, TERMINADOR198_tree);


                    }
                    break;
                case 3 :
                    // fontes/g/CanecaSintatico.g:396:4: retorno TERMINADOR
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_retorno_in_instrucao1206);
                    retorno199=retorno();

                    state._fsp--;

                    adaptor.addChild(root_0, retorno199.getTree());

                    TERMINADOR200=(Token)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_instrucao1208); 
                    TERMINADOR200_tree = 
                    (Object)adaptor.create(TERMINADOR200)
                    ;
                    adaptor.addChild(root_0, TERMINADOR200_tree);


                    }
                    break;
                case 4 :
                    // fontes/g/CanecaSintatico.g:397:4: se
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_se_in_instrucao1213);
                    se201=se();

                    state._fsp--;

                    adaptor.addChild(root_0, se201.getTree());

                    }
                    break;
                case 5 :
                    // fontes/g/CanecaSintatico.g:398:4: para
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_para_in_instrucao1218);
                    para202=para();

                    state._fsp--;

                    adaptor.addChild(root_0, para202.getTree());

                    }
                    break;
                case 6 :
                    // fontes/g/CanecaSintatico.g:399:4: repita
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_repita_in_instrucao1223);
                    repita203=repita();

                    state._fsp--;

                    adaptor.addChild(root_0, repita203.getTree());

                    }
                    break;
                case 7 :
                    // fontes/g/CanecaSintatico.g:400:4: enquanto
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enquanto_in_instrucao1228);
                    enquanto204=enquanto();

                    state._fsp--;

                    adaptor.addChild(root_0, enquanto204.getTree());

                    }
                    break;
                case 8 :
                    // fontes/g/CanecaSintatico.g:401:4: tente
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_tente_in_instrucao1233);
                    tente205=tente();

                    state._fsp--;

                    adaptor.addChild(root_0, tente205.getTree());

                    }
                    break;
                case 9 :
                    // fontes/g/CanecaSintatico.g:402:4: lance TERMINADOR
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_lance_in_instrucao1238);
                    lance206=lance();

                    state._fsp--;

                    adaptor.addChild(root_0, lance206.getTree());

                    TERMINADOR207=(Token)match(input,TERMINADOR,FOLLOW_TERMINADOR_in_instrucao1240); 
                    TERMINADOR207_tree = 
                    (Object)adaptor.create(TERMINADOR207)
                    ;
                    adaptor.addChild(root_0, TERMINADOR207_tree);


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
    // fontes/g/CanecaSintatico.g:405:1: blocoDeInstrucoes : INICIO ( instrucao )* FIM ;
    public final CanecaSintatico.blocoDeInstrucoes_return blocoDeInstrucoes() throws RecognitionException {
        CanecaSintatico.blocoDeInstrucoes_return retval = new CanecaSintatico.blocoDeInstrucoes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INICIO208=null;
        Token FIM210=null;
        CanecaSintatico.instrucao_return instrucao209 =null;


        Object INICIO208_tree=null;
        Object FIM210_tree=null;

        try {
            // fontes/g/CanecaSintatico.g:406:2: ( INICIO ( instrucao )* FIM )
            // fontes/g/CanecaSintatico.g:406:4: INICIO ( instrucao )* FIM
            {
            root_0 = (Object)adaptor.nil();


            INICIO208=(Token)match(input,INICIO,FOLLOW_INICIO_in_blocoDeInstrucoes1251); 
            INICIO208_tree = 
            (Object)adaptor.create(INICIO208)
            ;
            adaptor.addChild(root_0, INICIO208_tree);


            // fontes/g/CanecaSintatico.g:406:11: ( instrucao )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0 >= CONSTANTE_INTEIRA && LA39_0 <= CONSTANTE_REAL)||LA39_0==DESTRUA||LA39_0==ENQUANTO||(LA39_0 >= ESSA && LA39_0 <= ESSE)||LA39_0==IDENTIFICADOR||LA39_0==LANCE||(LA39_0 >= LITERAL_CARACTERE && LA39_0 <= LITERAL_TEXTO)||(LA39_0 >= NEGACAO && LA39_0 <= NOVO)||LA39_0==PARA||LA39_0==PARENTESE_ESQUERDO||LA39_0==REPITA||(LA39_0 >= RETORNE && LA39_0 <= SE)||LA39_0==SUBTRACAO||LA39_0==TENTE||(LA39_0 >= VALOR_BOOLEANO && LA39_0 <= VALOR_NULO)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // fontes/g/CanecaSintatico.g:406:12: instrucao
            	    {
            	    pushFollow(FOLLOW_instrucao_in_blocoDeInstrucoes1254);
            	    instrucao209=instrucao();

            	    state._fsp--;

            	    adaptor.addChild(root_0, instrucao209.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            FIM210=(Token)match(input,FIM,FOLLOW_FIM_in_blocoDeInstrucoes1258); 
            FIM210_tree = 
            (Object)adaptor.create(FIM210)
            ;
            adaptor.addChild(root_0, FIM210_tree);


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
    public static final BitSet FOLLOW_IDENTIFICADOR_in_atributo330 = new BitSet(new long[]{0x0000000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_atribuicao_in_atributo333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_atributo337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assinaturaDeConstrutor_in_construtor348 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_construtor350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assinaturaDeDestrutor_in_destrutor361 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_destrutor363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assinaturaDeMetodo_in_metodo374 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_metodo376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUTOR_in_assinaturaDeConstrutor387 = new BitSet(new long[]{0x5000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_assinaturaDeConstrutor389 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_assinaturaDeConstrutor391 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_listaDeArgumentos_in_assinaturaDeConstrutor393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTRUTOR_in_assinaturaDeDestrutor404 = new BitSet(new long[]{0x5000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_assinaturaDeDestrutor406 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_assinaturaDeDestrutor408 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_listaDeArgumentos_in_assinaturaDeDestrutor410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METODO_in_assinaturaDeMetodo421 = new BitSet(new long[]{0x5000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_modificadorDeAcessoMasculino_in_assinaturaDeMetodo423 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_ESTATICO_in_assinaturaDeMetodo426 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipo_in_assinaturaDeMetodo430 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_assinaturaDeMetodo432 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_listaDeArgumentos_in_assinaturaDeMetodo434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_listaDeParametros487 = new BitSet(new long[]{0x06381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_listaDeParametros490 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SEPARADOR_in_listaDeParametros493 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_listaDeParametros495 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_listaDeParametros501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_listaDeArgumentos512 = new BitSet(new long[]{0x0200000400000000L});
    public static final BitSet FOLLOW_declaracao_in_listaDeArgumentos515 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SEPARADOR_in_listaDeArgumentos518 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_declaracao_in_listaDeArgumentos520 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_listaDeArgumentos526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTA_in_listaDeInterfaces538 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipo_in_listaDeInterfaces540 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_SEPARADOR_in_listaDeInterfaces543 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipo_in_listaDeInterfaces545 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_COLCHETE_ESQUERDO_in_listaDeTiposGenericos562 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipoGenerico_in_listaDeTiposGenericos564 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLCHETE_DIREITO_in_listaDeTiposGenericos566 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_COLCHETE_ESQUERDO_in_listaDeTipos580 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipo_in_listaDeTipos582 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SEPARADOR_in_listaDeTipos585 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipo_in_listaDeTipos587 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000080L});
    public static final BitSet FOLLOW_COLCHETE_DIREITO_in_listaDeTipos591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_capture_in_listaDeCapturas605 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_tipoGenerico618 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_listaDeInterfaces_in_tipoGenerico620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_tipo631 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_listaDeTipos_in_tipo633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipo_in_declaracao644 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_declaracao646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATRIBUIDOR_in_atribuicao657 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoOuLogico_in_atribuicao659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracao_in_declaracaoComAtribuicaoOpcional670 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_atribuicao_in_declaracaoComAtribuicaoOpcional673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoOuLogico_in_expressao686 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ATRIBUIDOR_in_expressao689 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoOuLogico_in_expressao691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoELogico_in_expressaoOuLogico704 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_OU_in_expressaoOuLogico707 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoELogico_in_expressaoOuLogico709 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_expressaoComparacaoLogica_in_expressaoELogico722 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_E_in_expressaoELogico725 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoComparacaoLogica_in_expressaoELogico727 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica740 = new BitSet(new long[]{0x0001E01001000002L});
    public static final BitSet FOLLOW_set_in_expressaoComparacaoLogica743 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoAditiva_in_expressaoComparacaoLogica767 = new BitSet(new long[]{0x0001E01001000002L});
    public static final BitSet FOLLOW_expressaoMultiplicativa_in_expressaoAditiva780 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_set_in_expressaoAditiva783 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoMultiplicativa_in_expressaoAditiva791 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_expressaoUnaria_in_expressaoMultiplicativa804 = new BitSet(new long[]{0x0004000004000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expressaoMultiplicativa807 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoUnaria_in_expressaoMultiplicativa819 = new BitSet(new long[]{0x0004000004000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_expressaoPrimaria_in_expressaoUnaria832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBTRACAO_in_expressaoUnaria837 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoUnaria_in_expressaoUnaria839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGACAO_in_expressaoUnaria844 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressaoUnaria_in_expressaoUnaria846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_expressaoPrimaria857 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_expressaoPrimaria859 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_expressaoPrimaria861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALOR_BOOLEANO_in_expressaoPrimaria866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALOR_NULO_in_expressaoPrimaria871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTE_INTEIRA_in_expressaoPrimaria876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTE_REAL_in_expressaoPrimaria881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_CARACTERE_in_expressaoPrimaria886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_TEXTO_in_expressaoPrimaria891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comando_in_expressaoPrimaria896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_seletor_in_comando907 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_chamada_in_comando910 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_ESSE_in_seletor923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ESSA_in_seletor928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanciacao_in_seletor933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_seletor938 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_listaDeParametros_in_seletor941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_chamada954 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDENTIFICADOR_in_chamada962 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_listaDeParametros_in_chamada965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_instanciacao978 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_tipo_in_instanciacao986 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_listaDeParametros_in_instanciacao988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTRUA_in_destruicao999 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_destruicao1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETORNE_in_retorno1013 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_retorno1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SE_in_se1026 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_se1028 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_se1030 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_se1032 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_se1034 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_SENAO_in_se1037 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_se1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARA_in_para1052 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_para1054 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_para1056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_para1058 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_para1060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_para1062 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_para1064 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_para1066 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_para1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPITA_in_repita1079 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_repita1081 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_declaracao_in_repita1083 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_repita1085 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_repita1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENQUANTO_in_enquanto1098 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_enquanto1100 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_enquanto1102 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_enquanto1104 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_enquanto1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TENTE_in_tente1117 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_tente1119 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_listaDeCapturas_in_tente1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPTURE_in_capture1132 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_PARENTESE_ESQUERDO_in_capture1134 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_declaracao_in_capture1136 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_PARENTESE_DIREITO_in_capture1138 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_blocoDeInstrucoes_in_capture1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANCE_in_lance1151 = new BitSet(new long[]{0x04381804C00C0000L,0x000000000000C200L});
    public static final BitSet FOLLOW_expressao_in_lance1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressao_in_instrucao1181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_instrucao1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracaoComAtribuicaoOpcional_in_instrucao1189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_instrucao1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destruicao_in_instrucao1199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_instrucao1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retorno_in_instrucao1206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_instrucao1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_se_in_instrucao1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_para_in_instrucao1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repita_in_instrucao1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enquanto_in_instrucao1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tente_in_instrucao1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lance_in_instrucao1238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TERMINADOR_in_instrucao1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INICIO_in_blocoDeInstrucoes1251 = new BitSet(new long[]{0x05381A06D04C0000L,0x000000000000CA34L});
    public static final BitSet FOLLOW_instrucao_in_blocoDeInstrucoes1254 = new BitSet(new long[]{0x05381A06D04C0000L,0x000000000000CA34L});
    public static final BitSet FOLLOW_FIM_in_blocoDeInstrucoes1258 = new BitSet(new long[]{0x0000000000000002L});

}