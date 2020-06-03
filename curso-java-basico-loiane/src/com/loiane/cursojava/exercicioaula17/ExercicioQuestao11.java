package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int soma = 0;

		System.out.println("Insira o primeiro número inteiro:");
		int numero1 = scan.nextInt();

		System.out.println("Insira o segundo número inteiro:");
		int numero2 = scan.nextInt();

		for (int i = numero1; i <= numero2; i++) {

			System.out.println(i);
			soma += i;
		}

		System.out.println("A soma do valores é: " + soma);
		scan.close();
	}
}
