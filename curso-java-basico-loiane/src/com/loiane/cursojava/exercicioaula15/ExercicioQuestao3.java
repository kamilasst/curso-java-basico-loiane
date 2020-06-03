package com.loiane.cursojava.exercicioaula15;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Qual o sexo: ");
		System.out.println("F - Feminino ");
		System.out.println("M - Masculino ");
		String sexo = scan.next();

		/*
		 * TODO atg para kss - Igualdade de "objetos": Para compara��o de igualdade de
		 * String n�o utiliza ==. A classe String tem sua propria fun��o para realizar
		 * compara��o. S�o elas equals e equalsIgnoreCase e ser� utilizado o
		 * equalsIgnoreCase pq a letra poder� se mai�scula ou min�scula
		 */
		if (sexo.equalsIgnoreCase("f")) {
			System.out.println("F - Feminino");
		} else if (sexo.equalsIgnoreCase("m")) {
			System.out.println("M - Masculino");
		} else {
			System.out.println("Sexo Inv�lido");
		}

		switch (sexo) {
		case "f":
		case "F":
			System.out.println("O sexo � feminino.");
			break;

		case "m":
		case "M":
			System.out.println("O sexo � masculino.");
			break;
		default:
			System.out.println("O sexo Inv�lido!");
			break;
		}

		scan.close();
	}
}
