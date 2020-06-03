package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao30 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Escolha a tabuada: ");
		int tabuada = scan.nextInt();

		boolean valido = true;
		int inicioTabuada;
		int finalTabuada;

		do {

			System.out.println("Digite o inicio da tabuada: ");
			inicioTabuada = scan.nextInt();

			System.out.println("Digite o final da tabuada: ");
			finalTabuada = scan.nextInt();

			if (finalTabuada < inicioTabuada) {
				valido = false;

			} else {
				valido = true;
			}

		} while (!valido);

		System.out.println("Mostrar a Tabuada de: " + tabuada + "\n");
		System.out.println("Começar por : " + inicioTabuada);
		System.out.println("Termminar em: " + finalTabuada + "\n");
		System.out.println("Vou montar a Tabuada de " + tabuada + " começando em " + inicioTabuada + " e terminando em "
				+ finalTabuada + ". \n");

		for (int i = inicioTabuada; i <= finalTabuada; i++) {

			int resultado = tabuada * i;
			System.out.println(tabuada + " x " + i + " = " + resultado);

		}
		scan.close();
	}
}
