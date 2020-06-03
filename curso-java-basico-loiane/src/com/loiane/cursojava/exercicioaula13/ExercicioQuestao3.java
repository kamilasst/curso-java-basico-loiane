package com.loiane.cursojava.exercicioaula13;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		scan.useLocale(Locale.US);
			
		System.out.println("Insira o primeiro número: ");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Insira o segundo número: ");
		int segundoNumero = scan.nextInt();
		
		int soma = primeiroNumero + segundoNumero;
		System.out.println("A soma do primeiro e segundo número é: " + soma);
		
		scan.close();
	}
}
