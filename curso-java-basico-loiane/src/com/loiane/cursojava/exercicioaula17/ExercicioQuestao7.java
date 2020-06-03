package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int numero;
		int numeroMaior = Integer.MIN_VALUE;

		for (int i = 1; i <= 5; i++) {

			System.out.println("Informe o " + i + "° número: ");
			numero = scan.nextInt();

			if (numero > numeroMaior) {
				numeroMaior = numero;
			}
		}

		System.out.println("O maior número digitado foi: " + numeroMaior);

		scan.close();
	}
}
