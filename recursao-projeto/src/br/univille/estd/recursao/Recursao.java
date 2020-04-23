package br.univille.estd.recursao;

public class Recursao {
	
	

	/**
	 * Desenvolva o algoritmo de Fatorial Iterativa
	 * @param x
	 */
	public static long exercicio01(long x) {
		long fat = 1;
		for(int j = 2; j <= x; j++) {
			fat = fat * j;
		}
		return fat;
	}
	
	/**
	 * Desenvolva o algoritmo de Fatorial Recursiva
	 * @param x
	 */
	public static long exercicio02(long x) {
		if(x <= 1) {

		return 1;

		}

		 

		return x * exercicio02(x-1);
	}
	
	/**
	 * Desenvolva um algoritmo para somar os elementos de um vetor
	 * de maneira iterativo.
	 * Retorne a soma
	 * @param x
	 */
	public static int exercicio03(int vetor[]) {
		int total = 0;
	
		for(int i : vetor) {
			total += i;
		}
	
		return total;
	}
	
	/**
	 * Desenvolva um algoritmo para somar os elementos de um vetor
	 * de maneira recursiva.
	 * Retorne a soma
	 * @param vetor[]
	 * @param posicao do arranjo
	 */
	public static int exercicio04(int vetor[], int posicao) {
		if(posicao == vetor.length) {
			return 0;
		}

		return vetor[posicao] + exercicio04(vetor,posicao+1);
	}
	
	/**
	 * Desenvolva um algoritmo para inverter os elementos de um vetor
	 * de maneira iterativa.
	 * Retorne o vetor
	 * @param x
	 */
	public static int[] exercicio05(int vetor[]) {
		int i =0;
		int vetorAux[] = new int[4];
		while(i < vetor.length) {
			int ultimo = vetor[vetor.length - (i+1)];
			vetorAux[i] = ultimo;
			i++;
		}
		return vetorAux;
	}
	
	/**
	 * Desenvolva um algoritmo para inverter os elementos de um vetor
	 * de maneira recursiva.
	 * Retorne o vetor
	 * @param x
	 */
	public static int[] exercicio06(int vetor[], int i, int j) {
		int aux = vetor[i];
		
		if(i == vetor.length/2) {
			return vetor;
		}
		
		vetor[i] = vetor[j];
		vetor[j] = aux;
		
		j--;
		i++;
		
		return exercicio06(vetor,i, j);
	}
	

}
