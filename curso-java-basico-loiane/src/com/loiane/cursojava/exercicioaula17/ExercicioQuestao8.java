package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int numero;
		int soma = 0;

		for (int i = 1; i <= 5; i++) {

			System.out.println("Informe o " + i + "° número: ");
			numero = scan.nextInt();
			soma += numero;
		}

		double media = soma / 5;

		// 1
		System.out.println("Total da soma: " + soma);

		// 2
		imprimir("Total da soma: " + soma);

		// 3
		String mensagem = "Total da soma: " + soma;
		imprimir(mensagem);

		System.out.println("Média: " + media);

		scan.close();
	}

	private static void imprimir(String mensagem) {
		System.out.println(mensagem);
	}
}
