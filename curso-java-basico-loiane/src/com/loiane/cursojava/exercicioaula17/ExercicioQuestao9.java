package com.loiane.cursojava.exercicioaula17;

import com.loiane.cursojava.util.Util;

public class ExercicioQuestao9 {

	public static void main(String[] args) {

		for (int i = 0; i < 50; i++) {

			if (Util.IsImpar(i)) { // Irá imprimir apenas os números ímpares.
				System.out.println(i + " ");
			}
		}
	}
}
