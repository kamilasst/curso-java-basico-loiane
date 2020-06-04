package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao19 {

	private static final int TAMANHO_ARRAY = 10;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		double[] vetorNotas1 = new double[TAMANHO_ARRAY];

		// TODO kss para atg - Corrigir a constante
		// o length do outro, melhor vc criar uma constante e usal-la nos 3 casos
		double[] vetorNotas2 = new double[TAMANHO_ARRAY];
		double[] vetorResult = new double[TAMANHO_ARRAY];

		for (int i = 0; i < vetorNotas1.length; i++) {

			System.out.println("Insira a nota 1 do aluno " + (i + 1));
			vetorNotas1[i] = scan.nextDouble();

			System.out.println("Insira a nota 2 do aluno " + (i + 1));
			vetorNotas2[i] = scan.nextDouble();

			vetorResult[i] = (vetorNotas1[i] + vetorNotas2[i]) / 2;
		}

		System.out.print("1º Notas = ");
		for (int i = 0; i < vetorResult.length; i++) {
			System.out.print(vetorNotas1[i] + " ");
		}
		System.out.println();
		System.out.print("2º Notas = ");
		for (int i = 0; i < vetorResult.length; i++) {
			System.out.print(vetorNotas2[i] + " ");
		}
		System.out.println();
		System.out.println("Resultados : ");
		for (int i = 0; i < vetorResult.length; i++) {

			if (vetorResult[i] >= 7) {
				System.out.println("Aluno " + (i + 1) + " - Nota : " + vetorResult[i] + " - Aprovado!");

			} else {
				System.out.println("Aluno " + (i + 1) + " - Nota : " + vetorResult[i] + " - Reprovado!");
			}
		}
		scan.close();
	}
}
