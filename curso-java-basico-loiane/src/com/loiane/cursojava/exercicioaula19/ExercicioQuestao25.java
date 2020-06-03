package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorB.length; i++) {

			System.out.println("Digite o valor do Vetor A na posição " + i);
			vetorA[i] = scan.nextInt();

//			Utilizado o operador ternário
//			? = Significa o If - Se a condição for verdadeira entra nesse " ? " e recebe 1
//			: = Signica else - Se for falso entra no " : " e recebe 0
			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;

//			O operador ternário é a mesma coisa do if else, como exemplo abaixo:
//			if (vetorA[i] % 2 == 0) {
//				vetorB[i] = 1;
//			
//			} else {
//				vetorB[i] = 0;
//			}
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
		scan.close();
	}
}
