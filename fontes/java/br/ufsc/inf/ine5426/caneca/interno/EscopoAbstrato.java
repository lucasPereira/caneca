package br.ufsc.inf.ine5426.caneca.interno;

import java.util.Map;

public abstract class EscopoAbstrato implements Escopo {
	private Escopo escopoPai;
	private String nome;
	private String nomeDoTipo;
	
	public EscopoAbstrato(String nome) {
		this(nome, null);
	}
	
	public EscopoAbstrato(String nome, String nomeDoTipo) {
		this.nome = nome;
		this.nomeDoTipo = nomeDoTipo;
	}
	
	@Override
	public final void abrir(Escopo escopoPai) {
		if (!(this instanceof Variavel || this instanceof Atributo)) {
			System.out.println(String.format("[%s] Escopo aberto.", fornecerNome()));
		}
		this.escopoPai = escopoPai;
	}
	
	@Override
	public final Escopo fechar() {
		if (!(this instanceof Variavel || this instanceof Atributo)) {
			System.out.println(String.format("[%s] Escopo fechado.", fornecerNome()));
		}
		return escopoPai;
	}
	
	@Override
	public boolean definirClasse(Classe classe) {
		return false;
	}
	
	@Override
	public boolean definirAtributo(Atributo atributo) {
		return false;
	}
	
	@Override
	public boolean definirMetodo(Metodo metodo) {
		return false;
	}
	
	@Override
	public boolean definirVariavel(Variavel variavel) {
		return false;
	}
	
	@Override
	public Classe resolverClasse(String nomeDaClasse) {
		return Classe.NAO_ENCONTRADA;
	}
	
	@Override
	public Atributo resolverAtributo(String nomeDoAtributo) {
		return Atributo.NAO_ENCONTRADO;
	}
	
	@Override
	public Metodo resolverMetodo(String nomeDoMetodo) {
		return Metodo.NAO_ENCONTRADO;
	}
	
	@Override
	public Variavel resolverVariavel(String nomeDaVariavel, int indice) {
		return Variavel.NAO_ENCONTRADA;
	}
	
	@Override
	public final String fornecerNome() {
		return nome;
	}
	
	@Override
	public final Classe fornecerTipo() {
		if (nomeDoTipo == null) {
			return Classe.NAO_ENCONTRADA;
		}
		return resolverClasse(nomeDoTipo);
	}
	
	@Override
	public final Escopo fornecerEscopoPai() {
		return escopoPai;
	}
	
	protected final <T extends Escopo> boolean definirMembro(Map<String, T> membros, T membro, String tipoDoMembro) {
		String nomeDoMembro = membro.fornecerNome();
		if (membros.containsKey(nomeDoMembro)) {
			return false;
		}
		membros.put(nomeDoMembro, membro);
		return true;
	}
	
	protected final <T extends Escopo> T resolverMembro(Map<String, T> membros, T membroNaoEncontrado, String nomeDoMembro, String tipoDoMembro) {
		T membro = membros.get(nomeDoMembro);
		if (membro == null) {
			return membroNaoEncontrado;
		}
		return membro;
	}
}

