package br.com.univille.trabalho.app;

import java.util.ArrayList;
import java.util.List;

public class ImplementacaoMenorPreco implements ServicoOrdenacao {
	
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
		Produto posicaoPivo = novosProdutos.get(inicio);
		double pivo = novosProdutos.get(inicio).getPreco();
		int i = inicio + 1; 
		int j = fim;
		
		while(i <= j) {
			if(novosProdutos.get(i).getPreco() <= pivo) i++;
			else if(pivo < novosProdutos.get(j).getPreco()) j--;
			else {
				Produto aux = novosProdutos.get(i);
				novosProdutos.set(i, novosProdutos.get(j));
				novosProdutos.set(j,aux);
				i++;
				j--;
				
			}
		}
		
		novosProdutos.set(inicio, novosProdutos.get(j));
		novosProdutos.set(j, posicaoPivo);
		return j;
	}

}
