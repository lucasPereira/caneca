package br.ufsc.inf.ine5426.caneca.interno;

import java.util.Map;

public abstract class EscopoAbstrato implements Escopo {
	private Escopo escopoPai;
	private String nome;
	private Tipo tipo;
	
	public EscopoAbstrato(String nome) {
		this(nome, null);
	}
	
	public EscopoAbstrato(String nome, Tipo tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}
	
	@Override
	public final void abrir(Escopo escopoPai) {
		Reporter.fornecerInstancia().reportarAberturaDeEscopo(this);
		this.escopoPai = escopoPai;
	}
	
	@Override
	public final Escopo fechar() {
		Reporter.fornecerInstancia().reportarFechamentoDeEscopo(this);
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
	public final Classe fornecerClasseDoTipo() {
		return (tipo == null) ? Classe.NAO_ENCONTRADA : resolverClasse(tipo.fornecerNome());
	}
	
	@Override
	public final Tipo fornecerTipo() {
		return tipo;
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

