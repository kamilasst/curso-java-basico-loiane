package com.loiane.cursojava.exercicioaula13;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Insira a temperatura em Celsius: ");
		double temperaturaCelsius = scan.nextDouble();

		double temperaturaFahrenheit = ((temperaturaCelsius * 9) / 5) + 32;
		System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);

		scan.close();
	}
}
