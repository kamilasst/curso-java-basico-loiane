package com.loiane.cursojava.exercicioaula13;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Insira o tamanho de um lado do quadrado: ");
		double lado = scan.nextDouble();
		
		// area = lado * lado ou usa a classe (como foi usado)
		double area = Math.pow(lado, 2);
		double dobroArea = area * 2;

		System.out.println("A área é " + area + " e o seu dobro é " + dobroArea);

		scan.close();
	}
}
