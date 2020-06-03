package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		String nome = cadastrarNome(scan);
		int idade = cadastrarIdade(scan);
		double salario = cadastrarSalario(scan);
		String sexo = cadastrarSexo(scan);
		String estadoCivil = cadastrarEstadoCivil(scan);

		imprimirDados(nome, idade, salario, sexo, estadoCivil);

		scan.close();

	}

	private static String cadastrarNome(Scanner scan) {

		boolean informacaoValida = false;
		String nomeUsuario;

		do {

			System.out.println("Nome: ");
			nomeUsuario = scan.next();

			if (nomeUsuario.length() > 3) {
				informacaoValida = true;
			} else {
				System.out.println("Nome precisa no mínimo de 3 caracteres. Tente novamente!");
			}

		} while (!informacaoValida);

		return nomeUsuario;
	}

	private static int cadastrarIdade(Scanner scan) {

		boolean informacaoValida = false;
		int idade;

		do {

			System.out.println("Idade: ");
			idade = scan.nextInt();

			if (idade >= 0 && idade <= 150) {
				informacaoValida = true;
			} else {
				System.out.println("Idade precisa ser entre 0 e 150. Tente novamente!");
			}

		} while (!informacaoValida);

		return idade;
	}

	private static double cadastrarSalario(Scanner scan) {

		boolean informacaoValida = false;
		double salario;

		do {

			System.out.println("Salário: ");
			salario = scan.nextDouble();

			if (salario > 0) {
				informacaoValida = true;
			} else {
				System.out.println("Salário precisa ser maior que 0 (zero). Tente novamente!");
			}

		} while (!informacaoValida);

		return salario;
	}

	private static String cadastrarSexo(Scanner scan) {

		boolean informacaoValida = false;
		String sexo;

		do {

			System.out.println("Sexo: ");
			sexo = scan.next();

			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				informacaoValida = true;
			} else {
				System.out.println("Sexo precisa ser 'f' ou 'm'. Tente novamente!");
			}

		} while (!informacaoValida);

		return sexo;
	}

	private static String cadastrarEstadoCivil(Scanner scan) {

		boolean informacaoValida = false;
		String estadoCivil;

		do {

			System.out.println("Estado Civil: ");
			estadoCivil = scan.next();

			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				informacaoValida = true;
			} else {
				System.out.println("Estado Civil precisa ser 's', 'c', 'v', 'd'. Tente novamente!");
			}

		} while (!informacaoValida);

		return estadoCivil;
	}

	private static void imprimirDados(String nome, int idade, double salario, String sexo, String estadoCivil) {

		System.out.println("As seguintes informações foram coletadas:");
		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);

	}
}
