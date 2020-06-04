package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int[] vetorA = new int[10];
		int par = 0;
		int impar = 0;
		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Insira o valor da posição: " + i);
			vetorA[i] = scan.nextInt();

			// TODO atg para kss Usar funcao do utils
			if (vetorA[i] % 2 == 0) {
				par++;
			}
		}

		impar = vetorA.length - par;

		double porcentagemPar = (par * 100) / vetorA.length;
		double porcentagemImpar = (impar * 100) / vetorA.length;

		System.out.print("Vetor A = ");

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.println("Porcentagem pares : " + porcentagemPar);
		System.out.println("Porcentagem ímpares: " + porcentagemImpar);

		scan.close();
	}
}
