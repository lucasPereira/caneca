package br.ufsc.inf.ine5426.caneca.maquina;

import java.util.Stack;

public interface Codigo {
	public void executar(MaquinaCaneca maquina);
	
	public String comoTexto();
}
