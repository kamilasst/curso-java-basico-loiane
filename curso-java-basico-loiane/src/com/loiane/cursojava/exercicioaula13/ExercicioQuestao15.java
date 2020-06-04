package com.loiane.cursojava.exercicioaula13;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao15 {

	public static void main(String[] args) {

		double vetor[] = new double[6];

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		// TODO kss para atg - Corrigir métodos

		System.out.println("Quanto você ganha em reais por hora: ");
		double valorPorHora = scan.nextDouble();

		System.out.println("Quantas horas você trabalha no mês: ");
		double horasTrabalhadasMes = scan.nextDouble();

		double salarioBruto = calcularSalarioBruto(valorPorHora, horasTrabalhadasMes);
		vetor[0] = salarioBruto;

		double inss = calcularInss(salarioBruto);
		vetor[1] = inss;

		double sindicato = calcularSindicato(salarioBruto);
		vetor[2] = sindicato;

		double ir = calcularIR(salarioBruto);
		vetor[3] = ir;

		double totalDescontos = calcularDesconto(inss, sindicato, ir);
		vetor[4] = totalDescontos;

		double salarioLiquido = calcularSalarioLiquido(salarioBruto, totalDescontos);
		vetor[5] = salarioLiquido;

		imprimirContraCheque(vetor);

		scan.close();
	}

	private static double calcularSalarioBruto(double valorHora, double horasTrabalhoMes) {

		double salarioBruto = valorHora * horasTrabalhoMes;

		return salarioBruto;
	}

	private static double calcularInss(double salarioBruto) {

		double inss = (salarioBruto / 100) * 8;

		return inss;
	}

	private static double calcularSindicato(double salarioBruto) {

		double sindicato = (salarioBruto / 100) * 5;

		return sindicato;
	}

	private static double calcularIR(double salarioBruto) {

		double ir = (salarioBruto / 100) * 11;

		return ir;
	}

	private static double calcularDesconto(double inss, double sindicato, double ir) {

		double desconto = inss + sindicato + ir;

		return desconto;
	}

	private static double calcularSalarioLiquido(double salarioBruto, double descontos) {

		double salarioLiquido = salarioBruto - descontos;

		return salarioLiquido;
	}

	private static void imprimirContraCheque(double vetor[]) {

		System.out.println("Salário Bruto " + vetor[0]);
		System.out.println("INSS " + vetor[1]);
		System.out.println("Sindicato " + vetor[2]);
		System.out.println("Imposto de Renda " + vetor[3]);
		System.out.println("Tota de descontos " + vetor[4]);
		System.out.println("Salário Líquido " + vetor[5]);
	}
}
