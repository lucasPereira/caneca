package br.ufsc.inf.ine5426.caneca.interno;

import br.ufsc.inf.ine5426.caneca.maquina.*;

import java.util.List;

public final class ExpressaoDivisao extends ExpressaoAritmetica {
	public ExpressaoDivisao(Escopo escopoPai) {
		super(escopoPai);
	}
	
	@Override
	public void gerarCodigo(List<Codigo> areaDeCodigo, Contexto areaDeDados) {
		fornecerOperandoEsquerdo().gerarCodigo(areaDeCodigo, areaDeDados);
		fornecerOperandoDireito().gerarCodigo(areaDeCodigo, areaDeDados);
		if (fornecerTipo().mesmoQue(Tipo.INTEIRO)) {
			areaDeCodigo.add(new CodigoDividirI());
		} else if (fornecerTipo().mesmoQue(Tipo.REAL)) {
			areaDeCodigo.add(new CodigoDividirR());
		}
	}
	
	@Override
	public String comoTexto() {
		return "/";
	}
}
