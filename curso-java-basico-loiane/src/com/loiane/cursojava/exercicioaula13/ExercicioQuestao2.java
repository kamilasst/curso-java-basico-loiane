package com.loiane.cursojava.exercicioaula13;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Digite um n�mero inteiro: ");
		int numeroEscolhido = scan.nextInt();

		System.out.println("O n�mero informado foi: " + numeroEscolhido);

		scan.close();
	}
}
