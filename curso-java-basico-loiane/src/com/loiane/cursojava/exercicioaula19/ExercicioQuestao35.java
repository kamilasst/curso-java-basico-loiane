package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao35 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do vetor A na posição " + i);
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Analisando o número " + vetorA[i]);

			for (int j = 1; j <= vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					System.out.println(j + "- É divisor!");
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
