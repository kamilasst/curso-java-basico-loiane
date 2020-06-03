package com.loiane.cursojava.aula20;

import java.util.Locale;
import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Digite o número de pessoas que serão entrevistadas: ");
		int numeroEntrevistadas = scan.nextInt();

		String[][] nomesFilhos = new String[numeroEntrevistadas][];

		for (int i = 0; i < nomesFilhos.length; i++) {

			System.out.println("Digite a quantidade de filhos: ");
			int quantidadeFilhos = scan.nextInt();

			nomesFilhos[i] = new String[quantidadeFilhos];

			for (int j = 0; j < nomesFilhos[i].length; j++) {

				System.out.println("Digite o nome do filho " + (j + 1));
				nomesFilhos[i][j] = scan.next();
			}

		}

		for (int i = 0; i < nomesFilhos.length; i++) {

			System.out.println("Pessoa " + (i + 1) + " - tem " + nomesFilhos[i].length + " filho : ");

			for (int j = 0; j < nomesFilhos[i].length; j++) {

				System.out.println(nomesFilhos[i][j]);

			}
			System.out.println();
		}
		scan.close();

	}

}
