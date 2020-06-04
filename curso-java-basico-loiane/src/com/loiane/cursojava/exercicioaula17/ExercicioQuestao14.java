package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

import com.loiane.cursojava.util.Util;

public class ExercicioQuestao14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int numerosPares = 0;
		int numerosImpares = 0;

		for (int i = 1; i <= 10; i++) {

			System.out.println("Insira um n�mero: ");
			int numero = scan.nextInt();

			// TODO kss para atg - Corrigir a Utiliza��o do util.Ispar (criado por kss)

			if (Util.IsPar(numero)) {
				numerosPares++;

			} else {
				numerosImpares++;
			}
		}

		System.out.println("Quantidade de n�meros pares: " + numerosPares);
		System.out.println("Quantidade de n�meros �mpares: " + numerosImpares);

		scan.close();
	}

}
