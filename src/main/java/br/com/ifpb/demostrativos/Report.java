package br.com.ifpb.demostrativos;

import com.sun.xml.xsom.impl.scd.Iterators.Map;

public abstract class Report<T> implements Exportavel {

	private Map<String, Object> parametros;

	public void gerarRelatorio(Map<String, Object> parametro) {

	}

	public void mapearDados(T objeto) {

	}

	public Map<String, Object> getParametros() {
		return parametros;
	}

	public void setParametros(Map<String, Object> parametros) {
		this.parametros = parametros;
	}

}
