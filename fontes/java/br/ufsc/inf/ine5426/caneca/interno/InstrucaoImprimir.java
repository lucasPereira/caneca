package br.ufsc.inf.ine5426.caneca.interno;

import br.ufsc.inf.ine5426.caneca.maquina.Codigo;
import br.ufsc.inf.ine5426.caneca.maquina.CodigoImprimir;

import java.util.List;

public final class InstrucaoImprimir extends EscopoAbstrato implements Instrucao {
	public InstrucaoImprimir(Escopo escopoPai) {
		super(escopoPai);
	}
	
	@Override
	public void gerarCodigo(List<Codigo> codigo) {
		codigo.add(new CodigoImprimir().encapsular());
	}

	@Override
	public String comoTexto() {
		return "imprimir";
	}
}
