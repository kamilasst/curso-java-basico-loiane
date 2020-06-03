package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Digite o número para gerar a tabuada (1 - 10)");
		int numeroTabuada = scan.nextInt();

		System.out.println("Tabuada de " + numeroTabuada + ": \n");
		for (int i = 1; i <= 10; i++) {

			System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada * i));

		}

		scan.close();
	}
}
