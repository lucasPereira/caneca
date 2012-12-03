package br.ufsc.inf.ine5426.caneca.interno;

import java.util.Map;
import java.util.HashMap;

public final class TabelaDeSimbolos extends EscopoAbstrato {
	private Map<String, Classe> classes;
	
	public TabelaDeSimbolos() {
		super("Global");
		classes = new HashMap<String, Classe>();
	}
	
	@Override
	public boolean definirClasse(Classe classe) {
		return definirMembro(classes, classe, "classe");
	}
	
	@Override
	public Classe resolverClasse(String nomeDaClasse) {
		return resolverMembro(classes, Classe.NAO_ENCONTRADA, nomeDaClasse, "classe");
	}
}

