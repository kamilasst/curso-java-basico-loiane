package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

public class Exercicioquestao14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int[] vetorA = new int[10];
		int soma = 0;
		int quantidadeImpares = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira o valor do vetor na posição " + i);
			vetorA[i] = scan.nextInt();

			if (vetorA[i] % 2 == 1) {

				soma += vetorA[i];
				quantidadeImpares++;
			}
		}

		double media = soma / quantidadeImpares;

		System.out.print("Vetor A = ");

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.println("Soma dos Números Ímpares: " + soma);
		System.out.println("Média dos Números Ímpares: " + media);

		scan.close();
	}
}
