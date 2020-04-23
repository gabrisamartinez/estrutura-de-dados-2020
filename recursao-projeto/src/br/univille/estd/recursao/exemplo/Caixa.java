package br.univille.estd.recursao.exemplo;

public class Caixa extends Item {
	
	private Item item;
	private String nome;
	
	public Caixa() {}
	public Caixa(String nome, Item item) {
		this.nome = nome;
		this.item = item;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Caixa " + nome;
	}

}
