package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

public class ExrcicicioQuestao37 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int[] vetorA = new int[3];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {

			vetorB[i] = 1;

			for (int j = 1; j <= vetorA[i]; j++) {

				vetorB[i] *= j;
			}
		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();

		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

		scan.close();
	}

}
