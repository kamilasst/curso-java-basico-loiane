package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class Exercicioquestao27 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Digite a quantidade de temperaturas: ");
		int quantidadeTemperaturas = scan.nextInt();

		double temperatura = 0.0;
		double soma = 0.0;
		double maior = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;

		for (int i = 1; i <= quantidadeTemperaturas; i++) {

			System.out.println("Informe a " + i + " º temperatura: ");
			temperatura = scan.nextDouble();

			soma += temperatura;

			if (temperatura > maior) {
				maior = temperatura;

			} else {
				menor = temperatura;
			}
		}

		double media = soma / quantidadeTemperaturas;

		System.out.println("Maior Temperatura é " + maior);
		System.out.println("Menor Temperatura é " + menor);
		System.out.println("Média das Temperaturas:  " + media);

		scan.close();
	}
}
