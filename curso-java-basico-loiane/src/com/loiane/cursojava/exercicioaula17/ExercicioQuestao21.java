package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Digite a quantidade de turmas:");
		int numeroTurmas = scan.nextInt();

		int soma = 0;

		for (int i = 1; i <= numeroTurmas; i++) {

			System.out.println("Insira o n�mero de alunos da " + i + " turma:");
			int numeroAlunos = scan.nextInt();

			if (numeroAlunos > 40) {
				System.out.println("N�mero de alunos inv�lido. Digite novamente.");
				i--;

			} else {

				soma += numeroAlunos;
			}
		}

		double media = soma / numeroTurmas;

		System.out.println("A soma da quantidade de alunos �: " + soma);
		System.out.println("A m�dia da quantidade de alunos �: " + media);

		scan.close();
	}
}
