package com.loiane.cursojava.aula14;

import java.util.Locale;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		/*
		 * System.out.println("Digite sua idade: "); int idade = scan.nextInt();
		 * 
		 * if (idade >= 18) { System.out.println("É maior de idade!"); } else {
		 * System.out.println("Não é maior de idade!"); }
		 */
		// barato < 10
		// 10 < valor < 15 - opedir desconto
		// 15 <= valor < 17 - pesquisar
		// >= 17 muito caro

		System.out.println("Insira o preço do item: ");
		double valorItem = scan.nextDouble();

		if (valorItem <= 10) {
			System.out.println("Está barato, pode comprar! ");
		} else if (valorItem > 10 && valorItem < 15) {
			System.out.println("Você pode pedir um desconto! ");
		} else if (valorItem >= 15 && valorItem < 17) {
			System.out.println("Pode pesquisar mais!");
		} else { // valor >= 17
			System.out.println("Está muito caro!");
		}
		
		scan.close();
	}
}
