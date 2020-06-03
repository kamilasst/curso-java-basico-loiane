package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Digite o número de notas");
		int numeroNotas = scan.nextInt();

		double soma = 0;
		double media = 0;

		for (int i = 1; i <= numeroNotas; i++) {

			System.out.println("Insira a " + i + "° nota: ");
			double nota = scan.nextDouble();

			soma += nota;
		}
		media = soma / numeroNotas;

		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + media);

		scan.close();

	}
}
