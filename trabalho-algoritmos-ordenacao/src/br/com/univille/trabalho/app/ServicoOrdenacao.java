package br.com.univille.trabalho.app;

import java.util.List;

public interface ServicoOrdenacao {
	public List<Produto> quicksort(List<Produto> produtos, int inicio, int fim);
}
