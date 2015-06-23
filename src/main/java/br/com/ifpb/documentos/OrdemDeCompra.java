package br.com.ifpb.documentos;

import br.com.ifpb.model.CredorFornecedor;

public class OrdemDeCompra {

	private TomadaDePreco tomadaDePreco;
	private CredorFornecedor credor;
	private float valorTotal;
	private String programaDeTrabalho;

	public TomadaDePreco getTomadaDePreco() {
		return tomadaDePreco;
	}

	public void setTomadaDePreco(TomadaDePreco tomadaDePreco) {
		this.tomadaDePreco = tomadaDePreco;
	}

	public CredorFornecedor getCredor() {
		return credor;
	}

	public void setCredor(CredorFornecedor credor) {
		this.credor = credor;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getProgramaDeTrabalho() {
		return programaDeTrabalho;
	}

	public void setProgramaDeTrabalho(String programaDeTrabalho) {
		this.programaDeTrabalho = programaDeTrabalho;
	}

}
