package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao26 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Digite o valor do Vetor A para a posição " + i);
			vetorA[i] = scan.nextInt();

			System.out.println("Digite o valor do Vetor B para a posição " + i);
			vetorB[i] = scan.nextInt();

			if (vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;

			} else if (vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;

			} else if (vetorA[i] < vetorB[i]) {
				vetorC[i] = -1;
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

		System.out.println();

		System.out.print("Vetor C = ");

		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}

		scan.close();
	}
}
