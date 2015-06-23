package br.com.ifpb.relatorios;

import br.com.ifpb.demostrativos.Report;

public class MapaComparativoDePrecoReport<T> extends Report<T> {

	private long valorMedio;
	private long menorValor;

	public long getValorMedio() {
		return valorMedio;
	}

	public void setValorMedio(long valorMedio) {
		this.valorMedio = valorMedio;
	}

	public long getMenorValor() {
		return menorValor;
	}

	public void setMenorValor(long menorValor) {
		this.menorValor = menorValor;
	}

	@Override
	public void exportarPDF() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exportarSVC() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exportarXML() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exportarXLS() {
		// TODO Auto-generated method stub
		
	}

}
