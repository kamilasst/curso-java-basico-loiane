package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao32 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int[] vetorA = new int[5];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor da posição " + i);
			vetorA[i] = scan.nextInt();

		}

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Tabuada de " + vetorA[i]);

			for (int j = 1; j <= 10; j++) {

				System.out.println(vetorA[i] + " * " + j + " = " + (vetorA[i] * j));
			}

			System.out.println();
		}

		scan.close();
	}

}
