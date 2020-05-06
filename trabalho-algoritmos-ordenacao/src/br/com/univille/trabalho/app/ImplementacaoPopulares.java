package br.com.univille.trabalho.app;

import java.util.ArrayList;
import java.util.List;

public class ImplementacaoPopulares implements ServicoOrdenacao {
	List<Produto> novosProdutos = new ArrayList<Produto>();
	
	@Override
	public List<Produto> quicksort(List<Produto> produtos, int inicio, int fim) {
		novosProdutos = produtos;
		if(inicio < fim) {
			int posicao = separar(inicio, fim);
			quicksort(novosProdutos, inicio, posicao - 1);
			quicksort(novosProdutos, posicao + 1, fim);
		}
		return novosProdutos;
	}
	
	private int separar(int inicio, int fim) {
		long pivo = novosProdutos.get(fim).getQuantidadeDeVendas();
		Produto posicaoPivo = novosProdutos.get(fim);
		int i = inicio;
		int j = fim;
		while (j >= i){
			if(novosProdutos.get(i).getQuantidadeDeVendas() >= pivo)/*do nothing*/; 
			else if(pivo >= novosProdutos.get(i).getQuantidadeDeVendas()) j--;
			else {
				Produto aux = novosProdutos.get(j);
				novosProdutos.set(j, novosProdutos.get(i));
				novosProdutos.set(i,aux);
				i++;
				j--;
			}
		}
		
		novosProdutos.set(inicio, novosProdutos.get(i));
		novosProdutos.set(i, posicaoPivo);
		
		return i -1;
	}
}
