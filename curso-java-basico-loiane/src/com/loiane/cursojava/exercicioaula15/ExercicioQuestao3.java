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
		 * TODO atg para kss - Igualdade de "objetos": Para comparação de igualdade de
		 * String não utiliza ==. A classe String tem sua propria função para realizar
		 * comparação. São elas equals e equalsIgnoreCase e será utilizado o
		 * equalsIgnoreCase pq a letra poderá se maiúscula ou minúscula
		 */
		if (sexo.equalsIgnoreCase("f")) {
			System.out.println("F - Feminino");
		} else if (sexo.equalsIgnoreCase("m")) {
			System.out.println("M - Masculino");
		} else {
			System.out.println("Sexo Inválido");
		}

		switch (sexo) {
		case "f":
		case "F":
			System.out.println("O sexo é feminino.");
			break;

		case "m":
		case "M":
			System.out.println("O sexo é masculino.");
			break;
		default:
			System.out.println("O sexo Inválido!");
			break;
		}

		scan.close();
	}
}
