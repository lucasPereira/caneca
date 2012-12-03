package br.ufsc.inf.ine5426.caneca;

public class Compilador {
	public static void main(String[] argumentos) throws Exception {
		String nomeDoArquivoComCodigo = argumentos[0];
		String acao = argumentos[1];
		if (acao.equals("lexica")) {
			new AnaliseLexica(nomeDoArquivoComCodigo).analisar();
		} else if (acao.equals("sintatica")) {
				new AnaliseSintatica(nomeDoArquivoComCodigo).analisar();
		} else if (acao.equals("semantica")) {
			//try {
				new AnaliseSemantica(nomeDoArquivoComCodigo).analisar();
			//} catch (Exception excecao) {
			//	System.out.println("Não foir possível realizar a análise semantica, pois existes erros léxicos e/ou sintáticos.");
			//}
		} else if (acao.equals("simbolos")) {
			new ApresentacaoDeSimbolos(nomeDoArquivoComCodigo).apresentar();
		} else if (acao.equals("arvore")) {
			new ApresentacaoDeArvore(nomeDoArquivoComCodigo).apresentar();
		} else {
			System.out.println("Opção inválida.");
		}
	}
}

