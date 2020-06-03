package com.loiane.cursojava.exercicioaula13;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Insira o valor do raio: ");
		double valorDoRaio = scan.nextDouble();

		// TODO atg para kss - Exemplo usando uma constante - PI
		double area = Math.PI * Math.pow(valorDoRaio, 2);
		System.out.println("O valor da área é: " + area);

		scan.close();
	}
}
