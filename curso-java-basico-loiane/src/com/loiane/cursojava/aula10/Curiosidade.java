package com.loiane.cursojava.aula10;

public class Curiosidade {
	
	public static void main(String[] args) {
		
		int valor01 = 2147483647;
		
		int valor02 = 1;
		
		int valor03 = 100;
		
		System.out.println(valor01 + valor02); 
		/* valor de sa�da -2147483648 - Isso pq os n�meros em java funcionam
		como uma roleta, no momento que pego o limite e somo com algum n�mero
		ele volta para os n�meros negativos */
		
		System.out.println(valor01 + valor03);
		/* valor de sa�da -2147483549 - */
		
		/*valor inicial do int = -2147483648 
		  valor limite do int = 2147483647  */
		
		
	}

}
