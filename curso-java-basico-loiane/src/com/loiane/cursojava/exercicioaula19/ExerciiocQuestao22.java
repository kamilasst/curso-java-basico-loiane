package com.loiane.cursojava.exercicioaula19;

public class ExerciiocQuestao22 {

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int zero = 0;
		int um = 0;

		for (int i = 0; i < vetorA.length; i++) {

// Método round = Faz arredondamento e retorna double;
// Método random = retorna um número de 0 a 1 e retorna double;
// (int) = Está fazendo "Cast",ou seja, a transformação de um outro tipo de variável
// O número 1 é o limite dos números sorteados que desejo. Exemplo, se desejo um sorteio com números até 100 eu coloco o número 100 no lugar do 1.
//			double random = Math.random();
//			double valor = random * 1;
//			double round = Math.round(valor);
//			vetorA[i] = (int) round;

			vetorA[i] = (int) Math.round(Math.random() * 1);

			if (vetorA[i] == 0) {
				zero++;

			} else {
				um++;
			}
		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();

		double porcentagemZero = (zero * 100) / vetorA.length;
		double porcentagemUm = (um * 100) / vetorA.length;

		System.out.println("Zero = " + porcentagemZero + " % ");
		System.out.println("Um = " + porcentagemUm + " % ");
	}
}
