package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao34 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Digite o valor de n : ");
		int n = scan.nextInt();

		double soma = 0.0;

		for (int i = 1; i <= n; i++) {

			System.out.print(1 + "/" + i + " + ");
			soma += 1 / i;
		}

		System.out.println("\nSoma : " + soma);

		scan.close();
	}
}
