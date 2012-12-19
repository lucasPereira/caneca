package br.ufsc.inf.ine5426.caneca.interno;

import br.ufsc.inf.ine5426.caneca.maquina.Codigo;
import br.ufsc.inf.ine5426.caneca.maquina.CodigoAtualizarSimbolo;

import java.util.List;

public final class ExpressaoAtribuicao extends ExpressaoBinaria {
	Tipo tipo;
	
	public ExpressaoAtribuicao(Escopo escopoPai) {
		super(escopoPai);
	}
	
	@Override
	public void gerarCodigo(List<Codigo> codigo) {
		fornecerOperandoEsquerdo().gerarCodigo(codigo);
		fornecerOperandoDireito().gerarCodigo(codigo);
		codigo.add(new CodigoAtualizarSimbolo().encapsular());
	}
	
	@Override
	public Tipo fornecerTipo() {
		if (tipo == null) {
			tipo = fornecerOperandoEsquerdo().fornecerTipo();
		}
		return tipo;
	}
	
	@Override
	public String comoTexto() {
		return "=";
	}
}
