package com.loiane.cursojava.exercicioaula13;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Digite o valor do metro: ");
		double metro = scan.nextDouble();

		// 1m = 100cm
		double valorEmCentimetro = metro * 100;
		System.out.println(metro + " metros corresponde a " + valorEmCentimetro + " centímetros.");

		scan.close();
	}
}
