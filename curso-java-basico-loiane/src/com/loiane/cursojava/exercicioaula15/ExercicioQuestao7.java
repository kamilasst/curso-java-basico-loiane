package com.loiane.cursojava.exercicioaula15;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Digite o 1° número: ");
		int numero1 = scan.nextInt();
		System.out.println("Digite o 2° número: ");
		int numero2 = scan.nextInt();
		System.out.println("Digite o 3° número: ");
		int numero3 = scan.nextInt();

		if (primeiroValorEMaior(numero1, numero2) && primeiroValorEMaior(numero1, numero3)) {
			System.out.println("1° número é maior: " + numero1);

		} else if (primeiroValorEMaior(numero2, numero1) && primeiroValorEMaior(numero2, numero3)) {
			System.out.println("2° número é maior: " + numero2);

		} else if (primeiroValorEMaior(numero3, numero1) && primeiroValorEMaior(numero3, numero2)) {
			System.out.println("3° número é maior: " + numero3);
		}

		if (primeiroValorEMenor(numero1, numero2) && primeiroValorEMenor(numero1, numero3)) {
			System.out.println("1° número é menor: " + numero1);

		} else if (primeiroValorEMenor(numero2, numero1) && primeiroValorEMenor(numero2, numero3)) {
			System.out.println("2° número é menor: " + numero2);

		} else if (primeiroValorEMenor(numero3, numero1) && primeiroValorEMenor(numero3, numero2)) {
			System.out.println("3° número é menor: " + numero3);
		}

		scan.close();
	}

	private static boolean primeiroValorEMaior(int numero1, int numero2) {

		boolean numeroMaior = numero1 > numero2;
		return numeroMaior;
	}

	private static boolean primeiroValorEMenor(int numero1, int numero2) {

		boolean numeroMenor = numero1 < numero2;
		return numeroMenor;
	}
}
