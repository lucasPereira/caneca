package br.ufsc.inf.ine5426.caneca.interno;

import br.ufsc.inf.ine5426.caneca.maquina.Codigo;
import br.ufsc.inf.ine5426.caneca.maquina.CodigoChamar;
import br.ufsc.inf.ine5426.caneca.maquina.CodigoExtrairContexto;
import br.ufsc.inf.ine5426.caneca.maquina.CodigoFecharContexto;
import br.ufsc.inf.ine5426.caneca.maquina.CodigoInstanciar;

import java.util.LinkedList;
import java.util.List;

public final class ExpressaoInstanciacao extends EscopoAbstrato implements Expressao {
	private Tipo tipo;
	private List<Expressao> parametros;
	
	public ExpressaoInstanciacao(Escopo escopoPai, Tipo tipo) {
		super(escopoPai);
		this.tipo = tipo;
		parametros = new LinkedList<Expressao>();
	}
	
	@Override
	public void gerarCodigo(List<Codigo> codigo) {
		for (Expressao parametro : parametros) {
			parametro.gerarCodigo(codigo);
		}
		codigo.add(new CodigoInstanciar(tipo.fornecerNomeDaClasse()).encapsular());
		codigo.add(new CodigoExtrairContexto().encapsular());
		codigo.add(new CodigoChamar("construtor").encapsular());
		codigo.add(new CodigoFecharContexto().encapsular());
	}
	
	@Override
	public boolean definirExpressao(Expressao expressao) {
		parametros.add(expressao);
		Reporter.instancia().reportarDefinicaoDeExpressao(expressao);
		return true;
	}
	
	@Override
	public Tipo fornecerTipo() {
		return tipo;
	}
	
	@Override
	public String comoTexto() {
		return "novo " + tipo.comoTexto();
	}
}
