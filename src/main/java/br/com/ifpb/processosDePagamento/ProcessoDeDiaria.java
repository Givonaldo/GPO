package br.com.ifpb.processosDePagamento;

import java.util.Date;

import br.com.ifpb.model.CredorServidor;

public class ProcessoDeDiaria extends ProcessoOrcamentario {

	private CredorServidor servidor;
	private String destinoDaViagem;
	private Date dataDeSaida;
	private Date dataDeChegada;

	public ProcessoDeDiaria() {

	}

	public boolean verificarDisponibilidadeDeDiaria() {
		return true;//-----
	}
	
	public CredorServidor getServidor() {
		return servidor;
	}

	public void setServidor(CredorServidor servidor) {
		this.servidor = servidor;
	}

	public String getDestinoDaViagem() {
		return destinoDaViagem;
	}

	public void setDestinoDaViagem(String destinoDaViagem) {
		this.destinoDaViagem = destinoDaViagem;
	}

	public Date getDataDeSaida() {
		return dataDeSaida;
	}

	public void setDataDeSaida(Date dataDeSaida) {
		this.dataDeSaida = dataDeSaida;
	}

	public Date getDataDeChegada() {
		return dataDeChegada;
	}

	public void setDataDeChegada(Date dataDeChegada) {
		this.dataDeChegada = dataDeChegada;
	}

}
