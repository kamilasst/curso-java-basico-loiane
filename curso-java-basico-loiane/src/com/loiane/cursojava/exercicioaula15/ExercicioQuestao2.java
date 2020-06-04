package com.loiane.cursojava.exercicioaula15;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Digite um número inteiro (positivo ou negativo): ");
		int numero = scan.nextInt();

		if (numero >= 0) {
			System.out.println("O número informado é positivo: " + numero);

		} else {
			System.out.println("O número informado é negativo: " + numero);
		}
		scan.close();

	}
}
