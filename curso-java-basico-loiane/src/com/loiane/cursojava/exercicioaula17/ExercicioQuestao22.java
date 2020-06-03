package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao22 {

	private int parei = 0;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Insira a quantidade de CDs: ");
		int quantidadeCd = scan.nextInt();

		double soma = 0.0;

		for (int i = 1; i <= quantidadeCd; i++) {

			System.out.println("Digte o valor do " + i + " cd: ");
			double precoCd = scan.nextDouble();

			soma += precoCd;
		}

		double media = soma / quantidadeCd;

		System.out.println("Valor total dos Cds: " + soma);
		System.out.println("Valor médio dos Cds: " + media);

		scan.close();
	}
}
