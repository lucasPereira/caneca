package br.ufsc.inf.ine5426.caneca;

import br.ufsc.inf.ine5426.caneca.antlr.CanecaArvore;
import br.ufsc.inf.ine5426.caneca.antlr.CanecaLexico;
import br.ufsc.inf.ine5426.caneca.antlr.CanecaSintatico;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

import java.lang.StringBuilder;

import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.RewriteCardinalityException;
import org.antlr.runtime.tree.TreeNodeStream;

public class Compilador {
	private static final String ARQUIVO_ORIGEM_ARVORE_SINTATICA_HTML = "fontes/html/arvoreSintatica.html";
	private static final String ARQUIVO_DESTINO_ARVORE_SINTATICA_HTML = "gerados/html/arvoreSintatica.html";
	private static final String ARQUIVO_ORIGEM_SIMBOLOS_HTML = "fontes/html/simbolos.html";
	private static final String ARQUIVO_DESTINO_SIMBOLOS_HTML = "gerados/html/simbolos.html";
	private static final String MARCA_DE_TEMPLATE_ARVORE_SINTATICA = "<!-- arvoreSintatica -->";
	private static final String MARCA_DE_TEMPLATE_SIMBOLOS = "<!-- simbolos -->";
	private static final String MARCA_DE_TEMPLATE_CODIGO = "<!-- codigo -->";
	private static final int TAMANHO_DO_BALDE = 1024;
	private CharStream fluxoDeCaracteres;
	private TokenStream fluxoDeSimbolos;
	private CommonTreeNodeStream fluxoDeNodos;
	private CanecaLexico analisadorLexico;
	private CanecaSintatico analisadorSintatico;
	private CanecaArvore analisadorArvore;
	private String nomeDoArquivoComCodigo;
	
	public Compilador(String nomeDoArquivoComCodigo) throws RecognitionException, FileNotFoundException, IOException {
		this.nomeDoArquivoComCodigo = nomeDoArquivoComCodigo;
		this.fluxoDeCaracteres = new ANTLRFileStream(nomeDoArquivoComCodigo);
		this.analisadorLexico = new CanecaLexico(fluxoDeCaracteres);
		this.fluxoDeSimbolos = new CommonTokenStream(analisadorLexico);
		this.analisadorSintatico = new CanecaSintatico(fluxoDeSimbolos);
	}
	
	public void analisarCaracteres() {
		while (analisadorLexico.nextToken().getType() != Token.EOF);
	}
	
	public void analisarSimbolos() {
		try {
			analisadorSintatico.programa();
		} catch (RecognitionException excecao) {
			excecao.printStackTrace();
		}
	}
	
	public void apresentarSimbolos() throws FileNotFoundException, IOException {
		String template = lerArquivo(ARQUIVO_ORIGEM_SIMBOLOS_HTML);
		String codigo = lerArquivo(nomeDoArquivoComCodigo);
		String simbolos = obterSimbolos();
		template = template.replace(MARCA_DE_TEMPLATE_CODIGO, codigo);
		template = template.replace(MARCA_DE_TEMPLATE_SIMBOLOS, simbolos);
		escreverArquivo(ARQUIVO_DESTINO_SIMBOLOS_HTML, template);
	}
		
	public void apresentarArvore() throws RecognitionException, FileNotFoundException, IOException {
		String template = lerArquivo(ARQUIVO_ORIGEM_ARVORE_SINTATICA_HTML);
		String codigo = lerArquivo(nomeDoArquivoComCodigo);
		String arvoreSintaticaHtml = obterArvoreSintaticaHtml();
		template = template.replace(MARCA_DE_TEMPLATE_CODIGO, codigo);
		template = template.replace(MARCA_DE_TEMPLATE_ARVORE_SINTATICA, arvoreSintaticaHtml);
		escreverArquivo(ARQUIVO_DESTINO_ARVORE_SINTATICA_HTML, template);
	}
	
	public String obterSimbolos() throws FileNotFoundException, IOException {
		Token simbolo;
		String[] nomesDosSimbolos = CanecaSintatico.tokenNames;
		StringBuilder simbolos = new StringBuilder();
		while ((simbolo = analisadorLexico.nextToken()).getType() != Token.EOF) {
			simbolos.append("<section>");
			simbolos.append("<h1>");
			simbolos.append(nomesDosSimbolos[simbolo.getType()]);
			simbolos.append("</h1>");
			simbolos.append("<p>");
			simbolos.append(String.format("Linha: %s. Coluna: %s.", simbolo.getLine(), simbolo.getCharPositionInLine()));
			simbolos.append("</p>");
			simbolos.append("<p class=\"codigo\">");
			simbolos.append(simbolo.getText());
			simbolos.append("</p>");
			simbolos.append("</section>");
		}
		return simbolos.toString();
	}

	private String obterArvoreSintaticaHtml()  throws RecognitionException, FileNotFoundException, IOException {
		this.fluxoDeNodos = new CommonTreeNodeStream((CommonTree) analisadorSintatico.programa().getTree());
		this.analisadorArvore = new CanecaArvore(fluxoDeNodos);
		fluxoDeNodos.setTokenStream(fluxoDeSimbolos);
		CommonTree arvore = (CommonTree) (analisadorArvore.programa().getTree());
		StringBuilder arvoreSintaticaHtml = new StringBuilder();
		arvoreSintaticaHtml.append("<ul>");
		obterArvoreSintaticaHtml(arvore, arvoreSintaticaHtml);
		arvoreSintaticaHtml.append("</ul>");
		return arvoreSintaticaHtml.toString();
	}
	
	private void obterArvoreSintaticaHtml(CommonTree arvore, StringBuilder arvoreSintaticaHtml) {
		arvoreSintaticaHtml.append("<li>");
		arvoreSintaticaHtml.append("<h1>");
		arvoreSintaticaHtml.append(arvore.getText());
		arvoreSintaticaHtml.append("</h1>");
		List filhos = arvore.getChildren();
		if (filhos != null && filhos.size() > 0) {
			arvoreSintaticaHtml.append("<ul>");
			for (Object filho : filhos) {
				obterArvoreSintaticaHtml((CommonTree) filho, arvoreSintaticaHtml);
			}
			arvoreSintaticaHtml.append("</ul>");
		}
		arvoreSintaticaHtml.append("</li>");
	}
	
	private String lerArquivo(String nomeDoArquivo) throws FileNotFoundException, IOException {
		Reader leitor =  new BufferedReader(new FileReader(nomeDoArquivo));
		StringBuilder arquivoLido = new StringBuilder();
		char[] baldeDeLeitura = new char[TAMANHO_DO_BALDE];
		int quantidadeDeCaracteresLidos = 0;
		while ((quantidadeDeCaracteresLidos = leitor.read(baldeDeLeitura)) > 0) {
			arquivoLido.append(baldeDeLeitura, 0, quantidadeDeCaracteresLidos);
		}
		leitor.close();
		return arquivoLido.toString();
	}
	
	private void escreverArquivo(String nomeDoArquivo, String saida) throws FileNotFoundException, IOException {
		File arquivo = new File(nomeDoArquivo);
		arquivo.createNewFile();
		Writer escritor = new BufferedWriter(new FileWriter(arquivo));
		escritor.write(saida);
		escritor.flush();
		escritor.close();
	}
	
	public void esconderErros() {
		analisadorLexico.esconderErros();
		analisadorSintatico.esconderErros();
	}
	
	public int contarErrosLexicos() {
		return analisadorLexico.fornecerErros().size();
	}
	
	public int contarErrosSintaticos() {
		return analisadorSintatico.fornecerErros().size();
	}
	
	public static void main(String[] argumentos) throws RecognitionException, FileNotFoundException, IOException {
		String nomeDoArquivoComCodigo = argumentos[0];
		String acao = argumentos[1];
		Compilador compilador = new Compilador(nomeDoArquivoComCodigo);
		if (acao.equals("lexica")) {
			compilador.analisarCaracteres();
		} else if (acao.equals("sintatica")) {
			compilador.analisarSimbolos();
		} else if (acao.equals("simbolos")) {
			compilador.esconderErros();
			compilador.apresentarSimbolos();
		} else if (acao.equals("arvore")) {
			compilador.esconderErros();
			try {
				compilador.apresentarArvore();
			} catch (RewriteCardinalityException excecao) {
				System.out.println("Não foi possível gerar a árvore sintática, pois existem erros de compilação.");
			} catch (RecognitionException excecao) {
				System.out.println("Não foi possível gerar a árvore sintática, pois existem erros de compilação;");
			} catch (Exception excecao) {
				System.out.println("Não foi possível gerar a árvore sintática, pois existem erros de compilação!");
			}
		} else {
			System.out.println("Opção inválida.");
		}
		System.out.println(String.format("Erros léxicos: %s.", compilador.contarErrosLexicos()));
		System.out.println(String.format("Erros sintáticos: %s.", compilador.contarErrosSintaticos()));
	}
}

