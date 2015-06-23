package br.com.ifpb.processosDePagamento;

import java.util.Date;

import br.com.ifpb.documentos.MemorandoDePagamento;

public abstract class ProcessoOrcamentario {

	private String codigo;
	private Date dataEmissao;
	private Date dataPagamento;
	private int status;
	private int numeroDoEmpenho;
	private int numeroDaLiquidacao;
	private MemorandoDePagamento memorando;
	private int classificacao;

	public ProcessoOrcamentario() {

	}

	public void realizarPagamento() {

	}

	public void cancelarPagamento() {

	}

	public void gerarCodigo() {

	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getNumeroDoEmpenho() {
		return numeroDoEmpenho;
	}

	public void setNumeroDoEmpenho(int numeroDoEmpenho) {
		this.numeroDoEmpenho = numeroDoEmpenho;
	}

	public int getNumeroDaLiquidacao() {
		return numeroDaLiquidacao;
	}

	public void setNumeroDaLiquidacao(int numeroDaLiquidacao) {
		this.numeroDaLiquidacao = numeroDaLiquidacao;
	}

	public MemorandoDePagamento getMemorando() {
		return memorando;
	}

	public void setMemorando(MemorandoDePagamento memorando) {
		this.memorando = memorando;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

}
