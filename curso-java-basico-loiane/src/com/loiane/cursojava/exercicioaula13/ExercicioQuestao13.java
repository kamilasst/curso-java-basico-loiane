package com.loiane.cursojava.exercicioaula13;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao13 {

	// TODO kss - Declarando uma constante
	static final double NUMERO_MASCULINO = 0.0;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		double pesoIdeal = 0.0;

		System.out.println("Qual seu sexo: ");
		System.out.println(" 1 - Masculino ");
		System.out.println(" 2 - Feminino ");
		int sexo = scan.nextInt();

		System.out.println("Insira a sua altura: ");
		double altura = scan.nextDouble();

		System.out.println("Insira seu peso atual: ");
		double pesoAtual = scan.nextDouble();

		switch (sexo) {
		case 1:
			pesoIdeal = (72.7 * altura) - 58;
			break;

		case 2:
			pesoIdeal = (62.1 * altura) - 44.7;
			break;

		default:
			System.out.println("Valor inválido! ");
			break;
		}

		if (pesoAtual < pesoIdeal) {
			System.out.println("\nVocê está abaixo do peso!");

		} else if (pesoAtual == pesoIdeal) {
			System.out.println("\nVocê está com o peso ideal!");

		} else {
			System.out.println("\nVocê está acima do peso! ");

		}

		System.out.println("Seu peso ideal é: " + pesoIdeal);
		scan.close();
	}
}