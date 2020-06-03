package com.loiane.cursojava.aula10;

public class Curiosidade {
	
	public static void main(String[] args) {
		
		int valor01 = 2147483647;
		
		int valor02 = 1;
		
		int valor03 = 100;
		
		System.out.println(valor01 + valor02); 
		/* valor de saída -2147483648 - Isso pq os números em java funcionam
		como uma roleta, no momento que pego o limite e somo com algum número
		ele volta para os números negativos */
		
		System.out.println(valor01 + valor03);
		/* valor de saída -2147483549 - */
		
		/*valor inicial do int = -2147483648 
		  valor limite do int = 2147483647  */
		
		
	}

}
