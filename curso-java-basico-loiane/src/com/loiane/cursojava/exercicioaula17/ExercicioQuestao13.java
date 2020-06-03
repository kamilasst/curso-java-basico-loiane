package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Insira a base");
		int base = scan.nextInt();

		System.out.println("Insira a potência");
		int potencia = scan.nextInt();

		int resultado = base;

		int resultado2 = base;

		for (int i = 1; i < potencia; i++) {

			resultado *= base;
			resultado2 = resultado2 * base;
		}

		System.out.println("Resultado: " + resultado);
		System.out.println("Resultado2: " + resultado2);

		scan.close();

	}
}
