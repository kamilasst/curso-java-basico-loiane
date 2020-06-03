package com.loiane.cursojava.exercicioaula15;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Informe o turno que voc� estuda: ");
		System.out.println("M - Matutino ");
		System.out.println("V - Vespertino ");
		System.out.println("N - Noturno ");
		String turno = scan.next();

		if (turno.equalsIgnoreCase("m")) {
			System.out.println("Bom dia! ");

		} else if (turno.equalsIgnoreCase("v")) {
			System.out.println("Boa Tarde! ");

		} else if (turno.equalsIgnoreCase("n")) {
			System.out.println("Boa Noite! ");

		} else {
			System.out.println("Letra Inv�lida");
		}

		switch (turno) {
		case "M":
		case "m":
			System.out.println("Bom dia! ");
			break;

		case "V":
		case "v":
			System.out.println("Boa Tarde! ");
			break;

		case "N":
		case "n":
			System.out.println("Bom Noite! ");
			break;

		default:
			System.out.println("Letra Inv�lida! ");
			break;
		}

		scan.close();

	}

}
