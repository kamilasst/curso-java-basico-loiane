package com.loiane.cursojava.exercicioaula15;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int maior = 0;
		int menor = 0;

		// TODO fazer vetor nesse exercicio

		for (int contador = 1; contador <= 3; contador++) {

			System.out.println("Informe o " + contador + " valor:");
			int numero = scan.nextInt();

			if (maior < numero || contador == 1) {
				// maior = numero
			}
			if (menor > numero || contador == 1) {
				// menor = numero
			}

		}
		scan.close();
	}

}
