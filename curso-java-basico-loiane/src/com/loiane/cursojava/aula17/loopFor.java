package com.loiane.cursojava.aula17;

public class loopFor {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			System.out.println("i tem valor de: " + i);
		}

		for (int i = 5; i >= 0; i--) {
			System.out.println("i tem valor de: " + i);
		}

		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i = " + i + "; j = " + j);
		}

		int count = 0;

		for (; count < 5;) {
			System.out.println("Valor de count: " + count);
			count += 2;
		}

		for (int cout = 0; cout < 5; cout += 2) {
			System.out.println("Valor de cout: " + cout);

		}

		int soma = 0;
		for (int i = 1; i < 5; soma += i++)
			;
		System.out.println("O valor da soma é: " + soma);
	}
}
