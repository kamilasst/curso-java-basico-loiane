package com.loiane.cursojava.exercicioaula13;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("insira um valor inteiro: ");
		int primeiroValor = scan.nextInt();

		System.out.println("insira um valor inteiro: ");
		int segundoValor = scan.nextInt();

		System.out.println("Insira um valor real: ");
		double terceiroValor = scan.nextDouble();

		int produto = (primeiroValor * 2) * (segundoValor / 2);
		double soma = (primeiroValor * 3) + terceiroValor;
		double cubo = Math.pow(terceiroValor, 3);

		System.out.println("a) O produto do dobro do primeiro com metade do segundo é: " + produto);
		System.out.println("b) A soma do triplo do primeiro com o segundo é: " + soma);
		System.out.println("c) O terceiro elevado ao cubo é " + cubo);

		scan.close();
	}

}
