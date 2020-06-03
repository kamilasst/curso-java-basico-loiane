package com.loiane.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {

		// double temperaturaDia001 = 31.3;
		// double temperaturaDia002 = 32;
		// double temperaturaDia003 = 33.7;
		// double temperaturaDia004 = 34;
		// double temperaturaDia005 = 33.1;

		// Organizando essas informções em um Arrays no Java

		double[] temperaturas = new double[365];

		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;

		// Imprimindo o valor na tela

		System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
		System.out.println("O valor da temperatura do dia 2 é: " + temperaturas[1]);
		System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);
		System.out.println("O valor da temperatura do dia 4 é: " + temperaturas[3]);
		System.out.println("O valor da temperatura do dia 5 é: " + temperaturas[4]);

		/*
		 * Pra saber quantas posições o array tem:Para isso utiliza a propriedade length
		 * que seria o tamanho (a quantidade de dados que tem nesse array)
		 */

		System.out.println("O tamanho do array: " + temperaturas.length);

		// A informação que aarece no console é o Endereço de memória em que esse array
		// está poltando.
		System.out.println("Valores do array: " + temperaturas);

		/*
		 * Para aparecer todos os valores que tem no array: O mais comum é utilizando o
		 * loop for. O valor inicial de um array é 0 (zero).
		 */

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println(" O valor da temperatura do dia " + (i + 1) + " é " + temperaturas[i]);
		}

		// Utilizando um for Melhorado. Nele tem acesso apenas ao valor do array.

		for (double temp : temperaturas) {
			System.out.println(temp);
		}

	}

}
