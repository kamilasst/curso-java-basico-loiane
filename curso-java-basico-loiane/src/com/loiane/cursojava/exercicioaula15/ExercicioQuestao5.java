package com.loiane.cursojava.exercicioaula15;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		double media = calcularMedia(scan);

		analisarSituacaoAluno(media);

		scan.close();
	}

	private static double calcularMedia(Scanner scan) {

		System.out.println("Insira a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Insira a segunda nota: ");
		double nota2 = scan.nextDouble();

		double media = (nota1 + nota2) / 2;

		return media;
	}

	private static void analisarSituacaoAluno(double media) {

		if (media == 10) {
			System.out.println("Aprovado com Distinção!");
		} else if (media >= 7 && media < 10) {
			System.out.println("Aprovado! ");
		} else if (media >= 0 && media < 7) {
			System.out.println("Reprovado! ");
		} else {
			System.out.println("Média Inválida! ");
		}
	}
}
