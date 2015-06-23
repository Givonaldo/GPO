package br.com.ifpb.documentos;

import br.com.ifpb.processosDePagamento.ProcessoDeDiaria;

public class RelatorioDeViagem {

	private ProcessoDeDiaria processoDeDiaria;
	private String assunto, atividadesDesenvolvidas;

	public ProcessoDeDiaria getProcessoDeDiaria() {
		return processoDeDiaria;
	}

	public void setProcessoDeDiaria(ProcessoDeDiaria processoDeDiaria) {
		this.processoDeDiaria = processoDeDiaria;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getAtividadesDesenvolvidas() {
		return atividadesDesenvolvidas;
	}

	public void setAtividadesDesenvolvidas(String atividadesDesenvolvidas) {
		this.atividadesDesenvolvidas = atividadesDesenvolvidas;
	}

}
