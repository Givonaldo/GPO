package br.com.ifpb.model;

public abstract class Credor {

	private String nome, telefone, celular;

	public boolean contemOutroVinculo(){
		return true;//-----
	}
	
	public boolean contemProcessoOrcamentario(){
		return true;//-----
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

}
