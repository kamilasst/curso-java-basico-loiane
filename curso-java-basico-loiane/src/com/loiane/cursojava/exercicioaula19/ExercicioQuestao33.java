package com.loiane.cursojava.exercicioaula19;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao33 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}

		boolean primo = true;
		String msg;

		for (int i = 0; i < vetorA.length; i++) {

			for (int j = 2; j < vetorA[i]; j++) {

				primo = true;
				if (vetorA[i] % j == 0) {
					primo = false;
					break;
				}
			}

			msg = "";

			if (primo) {
				msg = "É primo!";

			} else {
				msg = "Não é primo!";
			}

			System.out.println(vetorA[i] + " - " + msg);

		}

		scan.close();
	}

}
