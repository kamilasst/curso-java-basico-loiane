package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int[] vetorA = new int[10];
		int somaMenor15 = 0;
		int somaMaior15 = 0;
		int quantidadeIgual15 = 0;
		int quantidadeMaior15 = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira o valor da posição " + i);
			vetorA[i] = scan.nextInt();

			if (vetorA[i] < 15) {
				somaMenor15 += vetorA[i];
			} else if (vetorA[i] == 15) {
				quantidadeIgual15++;
			} else {
				somaMaior15 += vetorA[i];
				quantidadeMaior15++;
			}
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		int media = somaMaior15 / quantidadeMaior15;

		System.out.println();
		System.out.println("Soma - Números < 15 :" + somaMenor15);
		System.out.println("Quantidade - Números == 15 :" + quantidadeIgual15);
		System.out.println("Média - Números > 15 :" + media);

		scan.close();
	}

}
