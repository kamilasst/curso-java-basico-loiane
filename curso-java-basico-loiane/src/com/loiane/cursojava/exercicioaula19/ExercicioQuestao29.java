package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao29 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length * 2];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Digite o valor do Vetor A na posição " + i);
			vetorA[i] = scan.nextInt();

			vetorC[i] = vetorA[i];
		}

		for (int i = 0; i < vetorB.length; i++) {

			System.out.println("Digite o valor do Vetor B na posição " + i);
			vetorB[i] = scan.nextInt();

			vetorC[vetorA.length + i] = vetorB[i];
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
