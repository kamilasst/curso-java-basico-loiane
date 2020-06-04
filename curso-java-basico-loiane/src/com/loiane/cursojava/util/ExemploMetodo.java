package com.loiane.cursojava.util;

public class ExemploMetodo {

	public static void main(String[] args) {
		//
		// TODO atg para kss - Exemplos de como Utilizar métodos
	}

//
	// TODO atg para kss - Exemplo método retornando valor e recebendo parâmetros
	private static double calcularDesconto(double salarioBruto, int percentualDesconto) {
		return (salarioBruto / 100) * percentualDesconto;
	}

	// TODO atg para kss - Exemplo método retornando void e recebendo parâmetros
	private static void imprimirSalarioBruto(double salarioBruto) {
		System.out.println(salarioBruto);
	}

	// TODO atg para kss - Exemplo método retornando void e sem receber parâmetros
	private static void imprimirOla() {
		System.out.println("Olá");
	}

	// TODO atg para kss - Exemplo método retornando valor e sem receber parâmetros
	private static double GetPercentualDesconto() {
		return 11;
	}
}
