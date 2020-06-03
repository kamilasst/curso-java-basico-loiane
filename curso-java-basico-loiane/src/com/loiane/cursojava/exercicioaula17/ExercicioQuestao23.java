package com.loiane.cursojava.exercicioaula17;

import com.loiane.cursojava.util.Util;

public class ExercicioQuestao23 {

	static final double VALOR_PRODUTO = 1.99;

	public static void main(String[] args) {

		System.out.println("Lojas Quase Dois - Tabela de preços");

		for (int i = 1; i <= Util.QUANTIDADE_50; i++) {

			System.out.println(i + " - R$ " + (VALOR_PRODUTO * i));
		}
	}
}
