package br.com.ifpb.processosDePagamento;

public class ProcessoDeCompraEServicos extends ProcessoOrcamentario {

	private int numeroDaReservaOrcamentaria;
	private int numeroDaAPExtraOrcamentaria;
	private float valorTotal;
	private String elemento;
	private int fonte;

	public ProcessoDeCompraEServicos() {

	}

	public int getNumeroDaReservaOrcamentaria() {
		return numeroDaReservaOrcamentaria;
	}

	public void setNumeroDaReservaOrcamentaria(int numeroDaReservaOrcamentaria) {
		this.numeroDaReservaOrcamentaria = numeroDaReservaOrcamentaria;
	}

	public int getNumeroDaAPExtraOrcamentaria() {
		return numeroDaAPExtraOrcamentaria;
	}

	public void setNumeroDaAPExtraOrcamentaria(int numeroDaAPExtraOrcamentaria) {
		this.numeroDaAPExtraOrcamentaria = numeroDaAPExtraOrcamentaria;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public int getFonte() {
		return fonte;
	}

	public void setFonte(int fonte) {
		this.fonte = fonte;
	}

}
