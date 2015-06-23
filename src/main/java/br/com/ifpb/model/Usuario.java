package br.com.ifpb.model;

import br.com.ifpb.tipos.TipoStatus;

public class Usuario {

	private TipoStatus tipo;
	private String login;
	private String senha;
	private int status;
	private String cargo;
	private String email;

	public Usuario(){
		
	}
	
	public void redefinirSenha(){
		
	}
	
	public void login(){
		
	}
	
	public void logoff(){
		
	}
	
	public boolean senhaValida(){
		return true;//-----
	}
	
	public void alterarStatus(){
		
	}
	
	
	public TipoStatus getTipo() {
		return tipo;
	}

	public void setTipo(TipoStatus tipo) {
		this.tipo = tipo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
