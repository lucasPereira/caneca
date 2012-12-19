package br.ufsc.inf.ine5426.caneca.interno;

import br.ufsc.inf.ine5426.caneca.maquina.Codigo;
import br.ufsc.inf.ine5426.caneca.maquina.CodigoSomarI;
import br.ufsc.inf.ine5426.caneca.maquina.CodigoSomarR;

import java.util.List;

public final class ExpressaoAdicao extends ExpressaoAritmetica {
	public ExpressaoAdicao(Escopo escopoPai) {
		super(escopoPai);
	}
	
	@Override
	public void gerarCodigo(List<Codigo> codigo) {
		fornecerOperandoEsquerdo().gerarCodigo(codigo);
		fornecerOperandoDireito().gerarCodigo(codigo);
		if (fornecerTipo().mesmoQue(Tipo.INTEIRO)) {
			codigo.add(new CodigoSomarI().encapsular());
		} else if (fornecerTipo().mesmoQue(Tipo.REAL)) {
			codigo.add(new CodigoSomarR().encapsular());
		}
	}
	
	@Override
	public String comoTexto() {
		return "+";
	}
}
