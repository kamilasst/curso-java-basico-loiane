package com.loiane.cursojava.exercicioaula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicioquestao8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Quanto voc� ganha em reais por hora: ");
		double valorPorHora = scan.nextDouble();

		System.out.println("Quantas horas voc� trabalha no m�s: ");
		double horasTrabalhadasMes = scan.nextDouble();

		double salario = valorPorHora * horasTrabalhadasMes;
		System.out.println("O sal�rio deste m�s � " + salario);

		scan.close();

	}
}
