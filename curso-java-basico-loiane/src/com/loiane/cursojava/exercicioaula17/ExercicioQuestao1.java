package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		// Primeira op��o
		System.out.println("Insira a sua nota (0-10): ");
		double nota1 = scan.nextDouble();

		// TODO atg para kss: Fazer m�todo: IsNotaValida(nota1)
		while (nota1 < 0 || nota1 > 10) {
			System.out.println("Voc� digitou uma nota inv�lida! Tente novamente.");

			System.out.println("Insira a sua nota (0-10): ");
			nota1 = scan.nextInt();
		}

		// Segunda op��o
		boolean notaValida = false;

		do {

			System.out.println("Insira a sua nota (0-10): ");
			double nota2 = scan.nextInt();

			if (nota2 >= 0 && nota2 <= 10) {
				notaValida = true;
				System.out.println("Voc� digitou: " + nota2);

			} else {
				notaValida = false;
				System.out.println("Voc� digitou uma nota inv�lida! Tente novamente.");
			}
		} while (!notaValida);

		scan.close();
	}
}
