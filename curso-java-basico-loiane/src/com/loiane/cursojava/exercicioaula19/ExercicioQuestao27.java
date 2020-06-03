package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao27 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int[] vetorA = new int[10];
		char[] vetorB = new char[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Digite o valor da posição " + i);
			vetorA[i] = scan.nextInt();

			if (vetorA[i] < 7) {
				vetorB[i] = 'a';
			} else if (vetorA[i] == 7) {
				vetorB[i] = 'b';
			} else if (vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = 'c';
			} else if (vetorA[i] == 10) {
				vetorB[i] = 'd';
			} else if (vetorA[i] > 10) {
				vetorB[i] = 'e';
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
