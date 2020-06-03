package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Digite um n�mero: ");
		int numero = scan.nextInt();

		boolean primo = true;

		for (int i = 1; i <= numero; i++) {

			if (numero % i == 0) {
				System.out.println("N�o � primo - divis�vel por " + i + ".");
				primo = false;
			}
		}

		if (primo) {
			System.out.println("� n�mero primo!");
		}
		scan.close();
	}
}
