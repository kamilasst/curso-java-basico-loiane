package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class Exerc�cioQuestao32 {

	static final double PRECO_CACHORRO_QUENTE = 1.20;
	static final double PRECO_BAURU_SIMPLES = 1.30;
	static final double PRECO_BAURO_COM_OVO = 1.50;
	static final double PRECO_HAMBURGUER = 1.20;
	static final double PRECO_CHEESERBURGUER = 1.30;
	static final double PRECO_REFRIGERANTE = 1.00;
	static final int CODIGO_CACHORRO_QUENTE = 100;
	static final int CODIGO_BAURU_SIMPLES = 101;
	static final int CODIGO_BAURO_COM_OVO = 102;
	static final int CODIGO_HAMBURGUER = 103;
	static final int CODIGO_CHEESERBURGUER = 104;
	static final int CODIGO_REFRIGERANTE = 105;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		boolean finalizar = false;
		int codigoProduto;
		double quantidadeProduto = 0.0;
		double total = 0.0;
		double preco = 0.0;
		String output = "";

		do {

			System.out.println("Digite o c�digo e a quantidade. Digite 0 0 para finalizar o pedido:");
			codigoProduto = scan.nextInt();
			quantidadeProduto = scan.nextInt();

			if (codigoProduto == 0 && quantidadeProduto == 0) {
				output += "\nTotal a pagar    -> " + total;
				finalizar = true;

			} else {

				/// TODO kss para atg - Corrigir a cria��o de constantes para os c�digos dos
				/// produtos
				switch (codigoProduto) {
				case CODIGO_CACHORRO_QUENTE:
					preco = PRECO_CACHORRO_QUENTE;
					output += "Cachorro Quente -> R$ 1,20 * " + quantidadeProduto;
					output += " = " + (preco * quantidadeProduto) + "\n";
					break;

				case CODIGO_BAURU_SIMPLES:
					preco = PRECO_BAURU_SIMPLES;
					output += "Bauru Simples   -> R$ 1,30 * " + quantidadeProduto;
					output += " = " + (preco * quantidadeProduto) + "\n";
					break;

				case CODIGO_BAURO_COM_OVO:
					preco = PRECO_BAURO_COM_OVO;
					output += "Bauru com Ovo   -> R$ 1,50 * " + quantidadeProduto;
					output += " = " + (preco * quantidadeProduto) + "\n";
					break;

				case CODIGO_HAMBURGUER:
					preco = PRECO_HAMBURGUER;
					output += "Hamb�rguer      -> R$ 1,20 * " + quantidadeProduto;
					output += " = " + (preco * quantidadeProduto) + "\n";
					break;

				case CODIGO_CHEESERBURGUER:
					preco = PRECO_CHEESERBURGUER;
					output += "Cheeseburguer   -> R$ 1,30 * " + quantidadeProduto;
					output += " = " + (preco * quantidadeProduto) + "\n";
					total += 1.20 * quantidadeProduto;
					break;

				case CODIGO_REFRIGERANTE:
					preco = PRECO_REFRIGERANTE;
					output += "Refrigerante    -> R$ 1,00 * " + quantidadeProduto;
					output += " = " + (PRECO_REFRIGERANTE * quantidadeProduto) + "\n";
					break;

				default:
					System.out.println("C�digo inv�lido");
					break;
				}
				total += preco * quantidadeProduto;
				finalizar = false;
			}

		} while (!finalizar);

		System.out.println("\nEspecifica��o       Pre�o   Quant  Total\n");
		System.out.println(output);

		scan.close();
	}

}
