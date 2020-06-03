package com.loiane.cursojava.exercicioaula13;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Insira o tamanho do arquivo: ");
		double tamanhoArquivo = scan.nextDouble();

		System.out.println("Insira a velocidade da internet: ");
		double velocidadeInternet = scan.nextDouble();

		double tempoDownload = tamanhoArquivo / velocidadeInternet;

		System.out.println("O tempo de Download é " + tempoDownload);

		scan.close();

	}
}
