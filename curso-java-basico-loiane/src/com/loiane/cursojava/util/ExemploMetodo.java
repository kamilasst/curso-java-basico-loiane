package com.loiane.cursojava.util;

public class ExemploMetodo {

	public static void main(String[] args) {
		//
		// TODO atg para kss - Exemplos de como Utilizar m�todos
	}

//
	// TODO atg para kss - Exemplo m�todo retornando valor e recebendo par�metros
	private static double calcularDesconto(double salarioBruto, int percentualDesconto) {
		return (salarioBruto / 100) * percentualDesconto;
	}

	// TODO atg para kss - Exemplo m�todo retornando void e recebendo par�metros
	private static void imprimirSalarioBruto(double salarioBruto) {
		System.out.println(salarioBruto);
	}

	// TODO atg para kss - Exemplo m�todo retornando void e sem receber par�metros
	private static void imprimirOla() {
		System.out.println("Ol�");
	}

	// TODO atg para kss - Exemplo m�todo retornando valor e sem receber par�metros
	private static double GetPercentualDesconto() {
		return 11;
	}
}
