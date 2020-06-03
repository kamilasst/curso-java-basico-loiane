package com.loiane.cursojava.aula10;

public class VariaveisChar {

	public static void main(String[] args) {
		
		//char o = 'o';
		//char i = 'i';
		
		char o = 111;
		char i = 105;
		char interrogacao = 0x3f; //caracter Ascii - numero hexadecimal //valor ?
		
		System.out.println(o + i); //imprime 216 (devido os valores da tabela Ascii)
		System.out.println("" + o + i); //transformando para um char
		System.out.println("" + o + i + interrogacao); 

	}

}
