package br.com.univille.trabalho.app;

import java.util.Date;

public class Produto {
	
	private String nome;
	private double preco;
	private double avaliacao;
	private long quantidadeDeVendas;
	private Date dataDeLancamento;
	
	public Produto() {}
	
	
	
	public Produto(String nome, double preco, double avaliacao, long quantidadeDeVendas, Date dataDeLancamento) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.avaliacao = avaliacao;
		this.quantidadeDeVendas = quantidadeDeVendas;
		this.dataDeLancamento = dataDeLancamento;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}
	public long getQuantidadeDeVendas() {
		return quantidadeDeVendas;
	}
	public void setQuantidadeDeVendas(long quantidadeDeVendas) {
		this.quantidadeDeVendas = quantidadeDeVendas;
	}
	public Date getDataDeLancamento() {
		return dataDeLancamento;
	}
	public void setDataDeLancamento(Date dataDeLancamento) {
		this.dataDeLancamento = dataDeLancamento;
	}
	
	
	public static Produto buildWith(String nome, double preco, double avaliacao, long quantidadeDeVendas, Date dataDeLancamento) {
		return new Produto( nome,  preco,  avaliacao,  quantidadeDeVendas,  dataDeLancamento);
	}

}
