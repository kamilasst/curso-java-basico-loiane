package com.loiane.cursojava.exercicioaula15;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Digite uma letra: ");
		String letra = scan.next();

		/*
		 * if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
		 * letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
		 * letra.equalsIgnoreCase("u")) {
		 * 
		 * System.out.println("É uma vogal.");
		 * 
		 * } else { System.out.println("É uma cosoante."); }
		 */

		// O método length consegue ver quantos caracteres tem nessa string.

		if (letra.length() > 1) {
			System.out.println("Não é uma letra válida!");

		} else {

			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.println("É uma vogal.");
				break;

			default:
				System.out.println("É uma consoante.");
				break;
			}
		}
		scan.close();
	}
}
