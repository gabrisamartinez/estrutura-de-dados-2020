package br.univille.estd.recursao.exemplo;

import java.util.Scanner;


public class Regressiva {
	
	static Scanner leitor = new Scanner(System.in);
	
	
	public static void regressiva(int i) {
		System.out.println(i);
		
		if(i % 12200 == 0) {
			leitor.nextLine();
		}
		
		regressiva(i+1);
	}
	
	public static void main(String[] args) {
		regressiva(10);
	}

}
