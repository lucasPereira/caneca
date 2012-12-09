package br.ufsc.inf.ine5426.caneca.interno;

import java.util.HashMap;
import java.util.Map;

public final class TabelaDeSimbolos extends EscopoAbstrato {
	private Map<String, Classe> classes;
	
	public TabelaDeSimbolos() {
		super(null);
		classes = new HashMap<String, Classe>();
	}
	
	@Override
	public boolean definirClasse(Classe classe) {
		if (classes.containsKey(classe.fornecerNome())) {
			Reporter.instancia().reportarErroDeDefinicaoRepetidaDeClasse(classe);
			return false;
		}
		classes.put(classe.fornecerNome(), classe);
		Reporter.instancia().reportarDefinicaoDeClasse(classe);
		return true;
	}
}
