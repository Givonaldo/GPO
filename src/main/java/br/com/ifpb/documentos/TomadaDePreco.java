package br.com.ifpb.documentos;

import java.util.HashMap;

import br.com.ifpb.model.CredorFornecedor;
import br.com.ifpb.model.Produto;

public class TomadaDePreco {

	private String codigo;
	private CredorFornecedor credor;
	private HashMap<String, Produto> produto;

	public TomadaDePreco() {

	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public CredorFornecedor getCredor() {
		return credor;
	}

	public void setCredor(CredorFornecedor credor) {
		this.credor = credor;
	}

	public HashMap<String, Produto> getProduto() {
		return produto;
	}

	public void setProduto(HashMap<String, Produto> produto) {
		this.produto = produto;
	}

}
