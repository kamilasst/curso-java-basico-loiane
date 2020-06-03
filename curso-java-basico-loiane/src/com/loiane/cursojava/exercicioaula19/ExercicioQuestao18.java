package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int[] vetorIdades = new int[10];

		for (int i = 0; i < vetorIdades.length; i++) {
			System.out.println("Insira a idade da pessoa " + (i + 1));
			vetorIdades[i] = scan.nextInt();
		}
		int maior = vetorIdades[0];
		int indexMaior = 0;
		int menor = vetorIdades[0];
		int indexMenor = 0;

		for (int i = 1; i < vetorIdades.length; i++) {

			if (vetorIdades[i] > maior) {
				maior = vetorIdades[i];
				indexMaior = i;
			} else if (vetorIdades[i] < menor) {
				menor = vetorIdades[i];
				indexMenor = i;
			}
		}

		System.out.print("Vetor de Idades = ");
		for (int i = 0; i < vetorIdades.length; i++) {
			System.out.print(vetorIdades[i] + " ");
		}
		System.out.println();
		System.out.println("Menor idade :" + menor);
		System.out.println("Índice - Menor Idade: " + indexMenor);
		System.out.println("Maior idade :" + maior);
		System.out.println("Índice - Maior Idade: " + indexMaior);

		scan.close();
	}

}
