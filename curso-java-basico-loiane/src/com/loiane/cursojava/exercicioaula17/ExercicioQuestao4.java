package com.loiane.cursojava.exercicioaula17;

public class ExercicioQuestao4 {

	public static void main(String[] args) {

		int paisA = 80000;
		int paisB = 200000;
		int contador = 0;

		while (paisA <= paisB) {

			paisA += (paisA / 100) * 3;
			paisB += (paisB / 100) * 1.5;
			contador++;
		}

		System.out.println("Pais A tem popula��o de: " + paisA);
		System.out.println("Pais B tem popula��o de: " + paisB);
		System.out.println("Quantidade de anos " + contador);

	}
}
