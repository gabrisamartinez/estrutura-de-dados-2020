package br.univille.estd.recursao.exemplo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void procurePelaCaixa(Caixa caixa){ 
		// Coloca a caixa principal no monte 
		List<Caixa> monte = new ArrayList<Caixa>(); 
		monte.add(caixa);
		
		while(!monte.isEmpty()){
			// Pega uma caixa do monte 
			Caixa c = monte.remove(0); 

			System.out.println(c.toString());
			// Caixa está vazia? 
			if(c.getItem() != null){
				Item i = c.getItem(); 
				if(i instanceof Chave){
					System.out.println("Achei a chave"); 
				}else{
					// O item é uma Caixa Adiciona no monte
					monte.add((Caixa) i);
				}
			} 
		}
		
	}

	public static void procurePelaCaixaRecursivo(Caixa caixa){ 
		System.out.println(caixa.toString());
		// Caixa está vazia?
		if(caixa.getItem() != null){
			// pega o item
			Item i = caixa.getItem();
			// O item é uma chave?
			if(i instanceof Chave){
				// Encontrei a chave, finaliza 
				System.out.println("Achei a chave");
			}else{
				// chamada recursiva
				procurePelaCaixaRecursivo((Caixa)i ); 
			}
		} 
	}

	public static void main(String[] args) {
		Chave chave = new Chave();
		Caixa a = new Caixa("a", chave);
		Caixa b = new Caixa("b", a);
		Caixa c = new Caixa("c", b);
		Caixa d = new Caixa("d", c);
		Caixa e = new Caixa("e", d);
		
		procurePelaCaixa(e);
		System.out.println("==================");
		procurePelaCaixaRecursivo(e);
		
	}

}
