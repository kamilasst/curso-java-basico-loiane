package com.loiane.cursojava.exercicioaula17;

public class ExercicioQuestao24 {

	static final double VALOR_PAO = 0.18;
	static final int QUANTIDADE_PAES = 50;

	public static void main(String[] args) {

		System.out.println("Pre�o do p�o: R$ 0.18 \n");
		System.out.println("Panificadora pa� de ontem - Tabela de pre�os \n");

		for (int i = 1; i <= QUANTIDADE_PAES; i++) {
			System.out.println(+i + " - R$ " + (VALOR_PAO * i));
		}
	}
}
