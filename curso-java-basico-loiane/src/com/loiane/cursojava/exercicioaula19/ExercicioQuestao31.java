package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

import com.loiane.cursojava.util.Util;

public class ExercicioQuestao31 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length]; // Pares e Ímpares

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}

		int posicaoB = 0;

		for (int i = 0; i < vetorA.length; i++) {
			if (Util.IsPar(vetorA[i])) {
				vetorB[posicaoB] = vetorA[i];
				posicaoB++;
			}
		}

		for (int i = 0; i < vetorA.length; i++) {
			if (Util.IsImpar(vetorA[i])) {
				vetorB[posicaoB] = vetorA[i];
				posicaoB++;
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
