package com.loiane.cursojava.exercicioaula13;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Insira a temperatura em Fahrenheit: ");
		double temperaturaFahrenheit = scan.nextDouble();

		double temperaturaCelsius = (5 * (temperaturaFahrenheit - 32) / 9);
		System.out.println("A temperatura em Celsius: " + temperaturaCelsius);

		scan.close();
	}
}
