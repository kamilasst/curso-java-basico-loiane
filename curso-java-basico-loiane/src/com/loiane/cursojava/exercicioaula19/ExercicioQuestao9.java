package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		double[] vetorA = new double[10];
		double[] vetorB = new double[10];
		double[] vetorC = new double[10];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Insira com o valor A da posição " + i);
			vetorA[i] = scan.nextDouble();
		}

		for (int i = 0; i < vetorB.length; i++) {

			System.out.println("Insira com o valor B da posição " + i);
			vetorB[i] = scan.nextDouble();
		}

		for (int i = 0; i < vetorC.length; i++) {

			vetorC[i] = vetorA[i] / vetorB[i];
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

		System.out.println();

		System.out.print("Vetor C (Divisão) = ");

		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}

		scan.close();
	}
}