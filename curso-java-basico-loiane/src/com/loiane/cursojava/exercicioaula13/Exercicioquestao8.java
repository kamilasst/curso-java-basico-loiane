package com.loiane.cursojava.exercicioaula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicioquestao8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Quanto você ganha em reais por hora: ");
		double valorPorHora = scan.nextDouble();

		System.out.println("Quantas horas você trabalha no mês: ");
		double horasTrabalhadasMes = scan.nextDouble();

		double salario = valorPorHora * horasTrabalhadasMes;
		System.out.println("O salário deste mês é " + salario);

		scan.close();

	}
}
