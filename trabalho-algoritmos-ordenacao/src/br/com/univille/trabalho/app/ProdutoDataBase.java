package br.com.univille.trabalho.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProdutoDataBase {
	
	
	/**
	 * Adicione mais produtos conforme a necessidade
	 * @return
	 */
	public static List<Produto> obterTodosOsProdutos(){
		List<Produto> lista = new ArrayList<Produto>();
		
		lista.add(Produto.buildWith("Tenis Olympikus Fly"
				, 129.99
				, 4.5, 
				1000, 
				new Date(2020-1900,01,01)));
		
		lista.add(Produto.buildWith("Tenis Adidas Advantage Base Feminino"
				, 159.99
				, 4.5, 
				1200, 
				new Date(2020-1900,02,01)));
		
		lista.add(Produto.buildWith("Tenis Burn Maize Masculino"
				, 59.99
				, 4, 
				900, 
				new Date(2019-1900,02,01)));
		
		lista.add(Produto.buildWith("Tenis Ecko Plataforma Feminino"
				, 159.99
				, 4.8, 
				1010, 
				new Date(2020-1900,02,8)));
		
		lista.add(Produto.buildWith("Tenis Sbelta Oxford Feminino"
				, 73.9
				, 4., 
				890, 
				new Date(2020-1900,02,04)));
		
		lista.add(Produto.buildWith("Tenis Beira Rio Montecar Feminino"
				, 54.99
				, 4.5, 
				180, 
				new Date(2020-1900,03,10)));
		
		lista.add(Produto.buildWith("Tenis Nike Couro Court Royale Masculino"
				, 169.99
				, 4.5, 
				1201, 
				new Date(2020-1900,03,10)));
		
		lista.add(Produto.buildWith("Tenis Adidas Grand Court Base Feminino"
				, 189.99
				, 4.5, 
				1210, 
				new Date(2020-1900,01,15)));
		
		return lista;
	}

}
