package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

import com.loiane.cursojava.util.Util;

public class ExercicioQuestao34 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do vetor A na posi��o " + i);
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Analisando o n�mero " + vetorA[i]);

			for (int j = 2; j <= vetorA[i]; j++) {
// TODO kss para atg - Corrigir utiliza��o da classe util
				if (Util.IsPar(j)) {
					System.out.println(j + "- � par!");
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
