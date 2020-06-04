package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao5 {

	public static void main(String[] args) {

		// TODO kss pata atg - Corrigir métodos

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		String paisA = "A";
		String paisB = "B";

		double populacaoA = obterPopulacao(scan);
		double populacaoB = obterPopulacao(scan);
		double taxaA = obterTaxaCrescimento(scan);
		double taxaB = obterTaxaCrescimento(scan);

		int contador = 0;

		while (populacaoA < populacaoB) {

			populacaoA += calculo(populacaoA, taxaA);
			populacaoB += calculo(populacaoB, taxaB);
			contador++;

		}

		imprimirPopulacao(paisA, populacaoA);
		imprimirPopulacao(paisB, populacaoB);
		imprimirQuantidadeAnos(contador);

	}

	private static double obterPopulacao(Scanner scan) {

		boolean valido = false;
		double populacao;

		do {

			System.out.println("Entre com a população:");
			populacao = scan.nextInt();

			if (populacao > 0) {
				valido = true;
			} else {
				System.out.println("População precisa ser maior que 0.");
			}

		} while (!valido);

		return populacao;
	}

	private static double obterTaxaCrescimento(Scanner scan) {

		boolean valido = false;
		double taxa;

		do {

			System.out.println("Entre com a taxa de crescimento da população :");
			taxa = scan.nextDouble();

			if (taxa > 0) {
				valido = true;
			} else {
				System.out.println("Taxa de crescimento precisa ser maior que 0.");
			}

		} while (!valido);

		return taxa;
	}

	private static double calculo(double populacao, double taxa) {

		double resultado = (populacao / 100) * taxa;

		return resultado;

	}

	private static void imprimirPopulacao(String pais, double populacao) {

		System.out.println("Pais " + pais + " tem população de : " + populacao);

	}

	private static void imprimirQuantidadeAnos(double quantAnos) {

		System.out.println("Quantidade de anos " + quantAnos);

	}

}
