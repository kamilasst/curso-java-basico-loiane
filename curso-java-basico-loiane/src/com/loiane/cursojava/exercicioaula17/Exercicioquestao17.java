package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class Exercicioquestao17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Digite um n�mero: ");
		int numero = scan.nextInt();

		int fatorial = 1;

		System.out.println(numero + "! = ");

		for (int i = numero; i > 0; i--) {

			fatorial *= i;
			System.out.println(i);

		}
		System.out.println("Resultado = " + fatorial);

		scan.close();
	}
}
