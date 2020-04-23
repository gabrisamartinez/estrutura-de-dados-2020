package br.univille.estd.recursao;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestesUnitariosRecursao {
	
	@Test
	void exercicio01() {
		assertEquals(24, Recursao.exercicio01(4),"Deve retornar 24");
		assertEquals(1, Recursao.exercicio01(1),"Deve retornar 1");
		assertEquals(5040, Recursao.exercicio01(7),"Deve retornar 5040");
	}
	
	@Test
	void exercicio02() {
		assertEquals(24, Recursao.exercicio02(4),"Deve retornar 24");
		assertEquals(1, Recursao.exercicio02(1),"Deve retornar 1");
		assertEquals(5040, Recursao.exercicio02(7),"Deve retornar 5040");
	}
	
	@Test
	void exercicio03() {
		int A[] = {1, 3, 4, 5};
		assertEquals(13, Recursao.exercicio03(A),"Deve retornar 13");
		int B[] = {1, 0, 4, 0};
		assertEquals(5, Recursao.exercicio03(B),"Deve retornar 1");
		int C[] = {-1, 0, -4, 0};
		assertEquals(-5, Recursao.exercicio03(C),"Deve retornar -5");
	}
	
	@Test
	void exercicio04() {
		int A[] = {1, 3, 4, 5};
		assertEquals(13, Recursao.exercicio04(A,0),"Deve retornar 13");
		int B[] = {1, 0, 4, 0};
		assertEquals(5, Recursao.exercicio04(B,0),"Deve retornar 1");
		int C[] = {-1, 0, -4, 0};
		assertEquals(-5, Recursao.exercicio04(C,0),"Deve retornar -5");
	}
	
	@Test
	void exercicio05() {
		int A[] = {1, 3, 4, 5};
		int A_[]= {5,4,3,1};
		assertArrayEquals(A_, Recursao.exercicio05(A),"Arranjo deve estar invertido");

		int B[] = {1, 0, 4, 0};
		int B_[] = {0, 4, 0, 1};
		assertArrayEquals(B_, Recursao.exercicio05(B),"Arranjo deve estar invertido");
		
		int C[] = {-1, 0, -4, 0};
		int C_[] = {0, -4, 0, -1};
		assertArrayEquals(C_, Recursao.exercicio05(C),"Arranjo deve estar invertido");
	}
	
	@Test
	void exercicio06() {
		int A[] = {1, 3, 4, 5};
		int A_[]= {5,4,3,1};
		assertArrayEquals(A_, Recursao.exercicio06(A,0,A.length-1),"Arranjo deve estar invertido");

		int B[] = {1, 0, 4, 0};
		int B_[] = {0, 4, 0, 1};
		assertArrayEquals(B_, Recursao.exercicio06(B,0,A.length-1),"Arranjo deve estar invertido");
		
		int C[] = {-1, 0, -4, 0};
		int C_[] = {0, -4, 0, -1};
		assertArrayEquals(C_, Recursao.exercicio06(C,0,A.length-1),"Arranjo deve estar invertido");
	}

}
