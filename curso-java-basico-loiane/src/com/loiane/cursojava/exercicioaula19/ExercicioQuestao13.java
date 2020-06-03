package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int[] vetorA = new int[10];
		int somaMultiplos5 = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor da posição " + i);
			vetorA[i] = scan.nextInt();

			if (vetorA[i] % 5 == 0) {
				somaMultiplos5 += vetorA[i];
			}
		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.print("Soma dos múltiplos de 5: " + somaMultiplos5);

		scan.close();
	}
}
