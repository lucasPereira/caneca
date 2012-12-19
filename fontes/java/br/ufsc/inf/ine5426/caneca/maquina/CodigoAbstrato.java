package br.ufsc.inf.ine5426.caneca.maquina;

import java.util.Stack;

public abstract class CodigoAbstrato implements Codigo {
	@Override
	public CodigoEncapsulado encapsular() {
		return new CodigoEncapsulado(this);
	}
}
