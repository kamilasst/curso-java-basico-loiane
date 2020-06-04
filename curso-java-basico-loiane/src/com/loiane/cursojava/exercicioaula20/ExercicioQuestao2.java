package com.loiane.cursojava.exercicioaula20;

import java.util.Random;

public class ExercicioQuestao2 {

	public static void main(String[] args) {

		int[][] numerosAleatorios = new int[10][10];

		Random numeroRandom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {

				numerosAleatorios[i][j] = numeroRandom.nextInt(100);

			}
		}

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print("[" + numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}

		int maiorLinha5 = Integer.MIN_VALUE;
		int menorLinha5 = Integer.MAX_VALUE;
		int maiorColuna7 = Integer.MIN_VALUE;
		int menorColuna7 = Integer.MAX_VALUE;
		int linha5 = 5;
		int coluna7 = 7;

		for (int i = 0; i < numerosAleatorios[linha5].length; i++) {

			if (numerosAleatorios[5][i] > maiorLinha5) {
				maiorLinha5 = numerosAleatorios[linha5][i];
			}
			if (numerosAleatorios[5][i] < menorLinha5) {
				menorLinha5 = numerosAleatorios[linha5][i];
			}
		}

		System.out.println(" Maior da Linha 5 " + maiorLinha5);
		System.out.println(" Menor da Linha 5 " + menorLinha5);

		for (int j = 0; j < numerosAleatorios[coluna7].length; j++) {

			if (numerosAleatorios[j][coluna7] > maiorColuna7) {
				maiorColuna7 = numerosAleatorios[j][coluna7];
			}
			if (numerosAleatorios[j][coluna7] < menorColuna7) {
				menorColuna7 = numerosAleatorios[j][coluna7];
			}
		}

		System.out.println(" Maior da Coluna 7 " + maiorColuna7);
		System.out.println(" Menor da Coluna 7 " + menorColuna7);

	}

}
