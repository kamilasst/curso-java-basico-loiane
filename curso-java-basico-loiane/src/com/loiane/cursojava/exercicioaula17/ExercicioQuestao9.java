package com.loiane.cursojava.exercicioaula17;

import com.loiane.cursojava.util.Util;

public class ExercicioQuestao9 {

	public static void main(String[] args) {

		for (int i = 0; i < 50; i++) {

			if (Util.IsImpar(i)) { // Ir� imprimir apenas os n�meros �mpares.
				System.out.println(i + " ");
			}
		}
	}
}
