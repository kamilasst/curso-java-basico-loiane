package com.loiane.cursojava.exercicioaula13;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Insira a sua altura: ");
		double altura = scan.nextDouble();

		double pesoIdeal = (72.7 * altura) - 58;

		System.out.println("O seu peso ideal é: " + pesoIdeal);

		scan.close();
	}
}
