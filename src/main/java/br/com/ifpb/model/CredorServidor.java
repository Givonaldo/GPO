package br.com.ifpb.model;

import java.util.Date;

public class CredorServidor extends Credor {

	private String cargo, matricula, cpf, endereco;
	private Date dataDeNasciento;

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataDeNasciento() {
		return dataDeNasciento;
	}

	public void setDataDeNasciento(Date dataDeNasciento) {
		this.dataDeNasciento = dataDeNasciento;
	}

}
