package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao26 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Digite um número: ");
		int numero = scan.nextInt();

		int fatorial = 1;

		System.out.println("\nFatorial de " + numero + ":");

		System.out.print(numero + "! = ");

		for (int i = numero; i > 0; i--) {

			fatorial *= i;
			System.out.print(i + " * ");

		}
		System.out.print(" = " + fatorial);

		scan.close();
	}
}
