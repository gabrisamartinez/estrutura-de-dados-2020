package br.univille.estd.recursao.exemplo;

public class Fatorial {
	
	
	public static long fatorial(long x) {
		if(x <= 1) return 1;
		return x * fatorial(x -1);
	}
	
	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MAX_VALUE+1);
		System.out.println(Long.MIN_VALUE);
		System.out.println("Fatorial 10 = "+fatorial(10l));
		System.out.println("Fatorial 50 = "+fatorial(50l));
		System.out.println("Fatorial 100 = "+fatorial(100l));
		System.out.println("Fatorial 100 = "+fatorial(102l));
	}

}
