package com.loiane.cursojava.exercicioaula19;

public class ExerciiocQuestao22 {

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int zero = 0;
		int um = 0;

		for (int i = 0; i < vetorA.length; i++) {

// M�todo round = Faz arredondamento e retorna double;
// M�todo random = retorna um n�mero de 0 a 1 e retorna double;
// (int) = Est� fazendo "Cast",ou seja, a transforma��o de um outro tipo de vari�vel
// O n�mero 1 � o limite dos n�meros sorteados que desejo. Exemplo, se desejo um sorteio com n�meros at� 100 eu coloco o n�mero 100 no lugar do 1.
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
