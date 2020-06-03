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

		// TODO atg para kss: Criar m�todo
		do {

			System.out.println("Digite a popula��o do Pa�s A:");
			paisA = scan.nextDouble();

			if (paisA > 0) {
				valido = true;

			} else {
				System.out.println("A popula��o do pa�s A precisa ser maior que 0 (zero)");
			}

		} while (!valido);

		valido = false;

		do {

			System.out.println("Digite a popula��o do Pa�s B:");
			paisB = scan.nextDouble();

			if (paisB > 0) {
				valido = true;

			} else {
				System.out.println("A popula��o do pa�s B precisa ser maior que 0 (zero)");
			}

		} while (!valido);

		valido = false;

		do {

			System.out.println("Digite a taxa de crescimento da popula��o do Pa�s A:");
			taxaPaisA = scan.nextDouble();

			if (taxaPaisA > 0) {
				valido = true;

			} else {
				System.out.println("A taxa da popula��o do pa�s A precisa ser maior que 0 (zero)");
			}

		} while (!valido);

		valido = false;

		do {

			System.out.println("Digite a taxa de crescimento da popula��o do Pa�s B:");
			taxaPaisB = scan.nextDouble();

			if (taxaPaisB > 0) {
				valido = true;

			} else {
				System.out.println("A taxa da popula��o do pa�s B precisa ser maior que 0 (zero)");
			}

		} while (!valido);

		while (paisA < paisB) {

			paisA += (paisA / 100) * taxaPaisA;
			paisB += (paisB / 100) * taxaPaisB;
			contador++;

		}
		System.out.println("Pais A tem popula��o de: " + paisA);
		System.out.println("Pais B tem popula��o de: " + paisB);
		System.out.println("Quantidade de anos " + contador);

		scan.close();
	}

}
