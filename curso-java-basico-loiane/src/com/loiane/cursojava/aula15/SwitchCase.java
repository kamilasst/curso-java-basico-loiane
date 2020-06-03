package com.loiane.cursojava.aula15;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Insira o dia da semana (1-7): ");
		int diaSemana = scan.nextInt();

		/*
		 * No if sempre terá uma condição lógica (expressão lógica), utilizando
		 * operadores lógicos e relacionais, cujo resultado sempre será boleano, true ou
		 * false
		 */

		if (diaSemana == 1) {
			System.out.println("Domingo");
		} else if (diaSemana == 2) {
			System.out.println("Segunda");
		} else if (diaSemana == 3) {
			System.out.println("Terça");
		} else if (diaSemana == 4) {
			System.out.println("Quarta");
		} else if (diaSemana == 5) {
			System.out.println("Quinta");
		} else if (diaSemana == 6) {
			System.out.println("Sexta");
		} else if (diaSemana == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Não é um dia da semana válido!");
		}

		// No switch pode entrar o byte, short, int, char, String ou Enum.
		switch (diaSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Não é um dia da semana válido!");
			break;
		}

		/*
		 * Se retirar o Break, ele vai executar o valor que foi repassado para o switch
		 * e todos as linhas de códigos que tiverem depois dele e vai parar somente
		 * quando encontrar um break. Por isso, a importãncia de colocar o break
		 */

		switch (diaSemana) {
		case 1:
			System.out.println("Domingo");
		case 2:
			System.out.println("Segunda");
		case 3:
			System.out.println("Terça");
		case 4:
			System.out.println("Quarta");
		case 5:
			System.out.println("Quinta");
		case 6:
			System.out.println("Sexta");
		case 7:
			System.out.println("Sábado");
		default:
			System.out.println("Não é um dia da semana válido!");
			break;
		}

		switch (diaSemana) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Dia útil!");
			break;
		case 1:
		case 7:
			System.out.println("Fim de semana!");
			break;
		default:
			System.out.println("Não é um dia da semana válido!");
			break;
		}

		scan.close();
	}
}
