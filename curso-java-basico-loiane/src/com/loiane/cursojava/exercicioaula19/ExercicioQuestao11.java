package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

import com.loiane.cursojava.util.Util;

public class ExercicioQuestao11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Digite o valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}

		int quantidadePares = 0;

		// TODO kss para atg - Corrigir utilização da classe util
		for (int i = 0; i < vetorA.length; i++) {

			int valor = vetorA[i];
			if (Util.IsPar(valor)) {

				quantidadePares++;
			}
		}

		System.out.print("Vetor A = ");

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.println("Quantidade de números pares: " + quantidadePares);

		scan.close();
	}
}
