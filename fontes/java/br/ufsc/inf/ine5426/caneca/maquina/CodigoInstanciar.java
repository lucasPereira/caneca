package br.ufsc.inf.ine5426.caneca.maquina;

public final class CodigoInstanciar implements Codigo {
	String nomeDaClasse;
	
	public CodigoInstanciar(String nomeDaClasse) {
		this.nomeDaClasse = nomeDaClasse;
	}
	
	@Override
	public void executar(MaquinaCaneca maquina) {
		//TODO
	}
	
	@Override
	public String comoTexto() {
		return String.format("instanciar %s", nomeDaClasse);
	}
}
