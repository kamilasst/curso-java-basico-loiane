package com.loiane.cursojava.exercicioaula19;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		double[] vetorA = new double[15];
		double[] vetorB = new double[15];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Insira o valor da posição " + i);
			vetorA[i] = scan.nextDouble();

			vetorB[i] = Math.sqrt(vetorA[i]); // Para saber a raiz quadrada.
		}

		System.out.print("Vetor A = ");

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();

		DecimalFormat df = new DecimalFormat("###,###.###");

		System.out.print("Vetor B = ");

		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(df.format(vetorB[i]) + " ");
		}

		scan.close();
	}
}