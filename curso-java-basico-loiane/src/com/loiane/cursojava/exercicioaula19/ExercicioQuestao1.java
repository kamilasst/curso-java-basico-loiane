package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int[] vetorA = new int[5];
		int[] vetorB = new int[5];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Insira o valor da posição " + i);
			vetorA[i] = scan.nextInt();

			vetorB[i] = vetorA[i];
		}

		// TODO atg para kss Apagar código comentado
		// for (int i = 0; i < vetorA.length; i++) {
		//
		// vetorB [i] = vetorA [i];
		// }

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
