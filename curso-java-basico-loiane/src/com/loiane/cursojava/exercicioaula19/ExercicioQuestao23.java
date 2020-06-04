package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

import com.loiane.cursojava.util.Util;

public class ExercicioQuestao23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Digite o valor para a posição " + i);
			vetorA[i] = scan.nextInt();
<<<<<<< HEAD
// TODO kss para atg - Corrigir utilização da classe util
			if (Util.IsImpar(vetorA[i])) {
=======

			// TODO atg para kss Usar funcao do utils
			if (vetorA[i] % 2 != 0) {
>>>>>>> branch 'master' of https://github.com/kamilasst/curso-java-basico-loiane.git
				break;
			}
		}
		scan.close();
	}
}
