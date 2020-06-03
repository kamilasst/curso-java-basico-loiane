package com.loiane.cursojava.exercicioaula17;

import java.text.DecimalFormat;

public class ExercicioQuestao31 {

	public static void main(String[] args) {

		double salario = 1000.00;
		double percentual = 1.5;

		DecimalFormat format = new DecimalFormat("#####");

		for (int i = 1997; i <= 2020; i++) {

			if (i == 1997) {

				salario += (salario / 100) * percentual;
				System.out.println(i + " = " + format.format(salario) + " - " + percentual + " % ");

			} else {

				percentual *= 2;

				salario += (salario / 100) * percentual;
				System.out.println(i + " = " + format.format(salario) + " - " + percentual + " % ");

			}

		}
	}
}
