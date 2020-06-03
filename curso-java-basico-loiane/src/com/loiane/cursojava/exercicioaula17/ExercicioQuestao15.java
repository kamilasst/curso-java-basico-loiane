package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Insira o n-ésimo termo da sériede Fibonacci");
		int numero = scan.nextInt();

		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;

		System.out.println(primeiro);
		System.out.println(segundo);

		for (int i = 3; i <= numero; i++) {

			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;

			System.out.println(proximo);

		}
		scan.close();
	}

}
