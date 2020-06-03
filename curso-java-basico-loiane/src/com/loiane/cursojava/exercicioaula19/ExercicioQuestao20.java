package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		double[] vetorA = new double[20];
		double cotação = 0;

		System.out.println("Entre com a cotação do Dólar :");
		cotação = scan.nextDouble();

		for (int i = 0; i < vetorA.length; i++) {

			vetorA[i] = cotação * (i + 1);
		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		scan.close();
	}
}
