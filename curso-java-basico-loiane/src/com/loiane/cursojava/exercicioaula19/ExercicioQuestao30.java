package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

import com.loiane.cursojava.util.Util;

public class ExercicioQuestao30 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length]; // pares
		int[] vetorC = new int[vetorA.length]; // �mpares

		int posicaoB = 0;
		int posicaoC = 0;

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Digite o valor da posi��o " + i);
			vetorA[i] = scan.nextInt();
<<<<<<< HEAD
// TODO kss para atg - Corrigir utiliza��o da classe util		
			if (Util.IsPar(vetorA[i])) {
=======

			// TODO atg para kss Usar funcao do utils
			if (vetorA[i] % 2 == 0) {
>>>>>>> branch 'master' of https://github.com/kamilasst/curso-java-basico-loiane.git
				vetorB[posicaoB] = vetorA[i];
				posicaoB++;

			} else {
				vetorC[posicaoC] = vetorA[i];
				posicaoC++;
			}
		}

		System.out.print("Vetor A =");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();

		System.out.print("Vetor B = ");
		for (int i = 0; i < posicaoB; i++) {
			System.out.print(vetorB[i] + " ");
		}

		System.out.println();

		System.out.print("Vetor C = ");
		for (int i = 0; i < posicaoC; i++) {
			System.out.print(vetorC[i] + " ");
		}

		scan.close();
	}

}
