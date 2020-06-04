package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao29 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Digite um número: ");
		int numero = scan.nextInt();

		boolean primo;

		for (int i = 1; i <= numero; i++) {

			primo = true;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					primo = false;
				}
			}

			if (primo) {
				System.out.println(i);
			}
		}
		scan.close();
	}
}
