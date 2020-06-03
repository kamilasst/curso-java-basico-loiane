package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		double paisA;
		double paisB;
		double contador = 0;
		double taxaPaisA;
		double taxaPaisB;

		boolean valido = false;

		// TODO atg para kss: Criar método
		do {

			System.out.println("Digite a população do País A:");
			paisA = scan.nextDouble();

			if (paisA > 0) {
				valido = true;

			} else {
				System.out.println("A população do país A precisa ser maior que 0 (zero)");
			}

		} while (!valido);

		valido = false;

		do {

			System.out.println("Digite a população do País B:");
			paisB = scan.nextDouble();

			if (paisB > 0) {
				valido = true;

			} else {
				System.out.println("A população do país B precisa ser maior que 0 (zero)");
			}

		} while (!valido);

		valido = false;

		do {

			System.out.println("Digite a taxa de crescimento da população do País A:");
			taxaPaisA = scan.nextDouble();

			if (taxaPaisA > 0) {
				valido = true;

			} else {
				System.out.println("A taxa da população do país A precisa ser maior que 0 (zero)");
			}

		} while (!valido);

		valido = false;

		do {

			System.out.println("Digite a taxa de crescimento da população do País B:");
			taxaPaisB = scan.nextDouble();

			if (taxaPaisB > 0) {
				valido = true;

			} else {
				System.out.println("A taxa da população do país B precisa ser maior que 0 (zero)");
			}

		} while (!valido);

		while (paisA < paisB) {

			paisA += (paisA / 100) * taxaPaisA;
			paisB += (paisB / 100) * taxaPaisB;
			contador++;

		}
		System.out.println("Pais A tem população de: " + paisA);
		System.out.println("Pais B tem população de: " + paisB);
		System.out.println("Quantidade de anos " + contador);

		scan.close();
	}

}
