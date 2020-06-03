package com.loiane.cursojava.exercicioaula15;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Insira o primeiro número: ");
		int numeroPrimeiro = scan.nextInt();

		System.out.println("Insira o segundo número: ");
		int numeroSegundo = scan.nextInt();

		if (numeroPrimeiro > numeroSegundo) {
			System.out.println(" O primeiro número é maior: " + numeroPrimeiro);
		} else {
			System.out.println(" O segundo número é maior: " + numeroSegundo);
		}
		scan.close();
	}
}
