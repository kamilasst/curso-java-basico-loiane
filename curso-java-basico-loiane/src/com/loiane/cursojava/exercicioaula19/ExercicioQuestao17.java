package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int[] vetorIdades = new int[10];
		int quantidadeMaior35 = 0;

		for (int i = 0; i < vetorIdades.length; i++) {
			System.out.println("Insira a idade da pessoa " + (i + 1));
			vetorIdades[i] = scan.nextInt();

			if (vetorIdades[i] > 35) {
				quantidadeMaior35++;
			}
		}

		System.out.print("Vetor de Idades = ");
		for (int i = 0; i < vetorIdades.length; i++) {
			System.out.print(vetorIdades[i] + " ");
		}
		System.out.println();
		System.out.println("Pessoas com idade > 35: " + quantidadeMaior35);

		scan.close();
	}
}
