package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

public class ExercecioQuesto12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int[] vetorA = new int[10];
		int somaVetor = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite os valores do vetor A na posição " + i);
			vetorA[i] = scan.nextInt();

			somaVetor += vetorA[i];
		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("A soma do vetor é: " + somaVetor);

		scan.close();
	}

}
