package com.loiane.cursojava.exercicioaula15;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Insira o primeiro pre�o: ");
		double preco1 = scan.nextDouble();
		System.out.println("Insira o segundo pre�o: ");
		double preco2 = scan.nextDouble();
		System.out.println("Insira o terceiro pre�o: ");
		double preco3 = scan.nextDouble();

		if (verificarEMenorPreco(preco1, preco2) && verificarEMenorPreco(preco1, preco3)) {
			System.out.println("Compre o 1� produto! ");

		} else if (verificarEMenorPreco(preco2, preco1) && verificarEMenorPreco(preco2, preco3)) {
			System.out.println("Compre o 2� produto! ");

		} else if (verificarEMenorPreco(preco3, preco1) && verificarEMenorPreco(preco3, preco2)) {
			System.out.println("Compre o 3� produto! ");
		}

		scan.close();
	}

	private static boolean verificarEMenorPreco(double preco1, double preco2) {

		boolean menorPreco = preco1 < preco2;

		return menorPreco;
	}
}
