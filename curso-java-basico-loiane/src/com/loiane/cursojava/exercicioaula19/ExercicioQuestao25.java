package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

import com.loiane.cursojava.util.Util;

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
<<<<<<< HEAD

// TODO kss para atg - Corrigir utilização da classe util	
			vetorB[i] = Util.IsPar(vetorA[i]) ? 1 : 0;
=======
			
			// TODO atg para kss Usar funcoa do Utils
			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
>>>>>>> branch 'master' of https://github.com/kamilasst/curso-java-basico-loiane.git

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
