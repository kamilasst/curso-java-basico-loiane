package com.loiane.cursojava.exercicioaula13;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Insira a nota do 1° bimestre: ");
		double notaPrimeiroBimestre = scan.nextDouble();

		System.out.println("Insira a nota do 2° bimestre: ");
		double notaSegundoBimestre = scan.nextDouble();

		System.out.println("Insira a nota do 3° bimestre: ");
		double notaTerceiroBimestre = scan.nextDouble();

		System.out.println("Insira a nota do 4° bimestre: ");
		double notaQuartoBimestre = scan.nextDouble();

		double media = (notaPrimeiroBimestre + notaSegundoBimestre + notaTerceiroBimestre + notaQuartoBimestre) / 4;
		System.out.println("A sua média é: " + media);

		scan.close();
	}
}
