package br.com.ifpb.demostrativos;

import net.sf.jasperreports.engine.JasperPrint;

import com.sun.xml.xsom.impl.scd.Iterators.Map;

public abstract class Report<T> implements Exportavel {

	private Map<String, Object> parametros;

	public JasperPrint gerarRelatorio(Map<String, Object> parametro) {
		return null;//------
	}

	public Map<String, Object> mapearDados(T objeto) {
		return null;//------
	}

	public Map<String, Object> getParametros() {
		return parametros;
	}

	public void setParametros(Map<String, Object> parametros) {
		this.parametros = parametros;
	}

}
