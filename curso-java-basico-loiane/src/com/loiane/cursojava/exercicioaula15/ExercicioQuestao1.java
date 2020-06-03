package com.loiane.cursojava.exercicioaula15;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Insira o primeiro n�mero: ");
		int numeroPrimeiro = scan.nextInt();

		System.out.println("Insira o segundo n�mero: ");
		int numeroSegundo = scan.nextInt();

		if (numeroPrimeiro > numeroSegundo) {
			System.out.println(" O primeiro n�mero � maior: " + numeroPrimeiro);
		} else {
			System.out.println(" O segundo n�mero � maior: " + numeroSegundo);
		}
		scan.close();
	}
}
