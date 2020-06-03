package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Digite a quantidade de idades:");
		int numeroIdades = scan.nextInt();

		int soma = 0;
		double media = 0;

		for (int i = 1; i <= numeroIdades; i++) {

			System.out.println("Insira a " + i + "° idade: ");
			int idade = scan.nextInt();

			soma += idade;
		}

		media = soma / numeroIdades;

		System.out.println("Média de idade: " + media);
		if (media >= 0 && media <= 25) {
			System.out.println("A turma é jovem!");

		} else if (media >= 26 && media <= 60) {
			System.out.println("A turma é adulta!");

		} else if (media > 60) {
			System.out.println("A turma é idosa!");
		}

		scan.close();
	}
}
