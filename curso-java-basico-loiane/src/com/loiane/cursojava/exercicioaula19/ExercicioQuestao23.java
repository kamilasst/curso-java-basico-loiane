package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Digite o valor para a posição " + i);
			vetorA[i] = scan.nextInt();

			if (vetorA[i] % 2 != 0) {
				break;
			}
		}
		scan.close();
	}
}
