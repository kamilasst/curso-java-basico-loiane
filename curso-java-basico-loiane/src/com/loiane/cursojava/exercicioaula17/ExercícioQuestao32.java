package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercícioQuestao32 {

	static final double PRECO_CACHORRO_QUENTE = 1.20;
	static final double PRECO_BAURU_SIMPLES = 1.30;
	static final double PRECO_BAURO_COM_OVO = 1.50;
	static final double PRECO_HAMBURGUER = 1.20;
	static final double PRECO_CHEESERBURGUER = 1.30;
	static final double PRECO_REFRIGERANTE = 1.00;

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

			System.out.println("Digite o código e a quantidade. Digite 0 0 para finalizar o pedido:");
			codigoProduto = scan.nextInt();
			quantidadeProduto = scan.nextInt();

			if (codigoProduto == 0 && quantidadeProduto == 0) {
				output += "\nTotal a pagar    -> " + total;
				finalizar = true;

			} else {

				/// TODO atg para kss Criar constantes para os códigos dos produtos
				switch (codigoProduto) {
				case 100:
					preco = PRECO_CACHORRO_QUENTE;
					output += "Cachorro Quente -> R$ 1,20 * " + quantidadeProduto;
					output += " = " + (preco * quantidadeProduto) + "\n";
					break;

				case 101:
					preco = PRECO_BAURU_SIMPLES;
					output += "Bauru Simples   -> R$ 1,30 * " + quantidadeProduto;
					output += " = " + (preco * quantidadeProduto) + "\n";
					break;

				case 102:
					preco = PRECO_BAURO_COM_OVO;
					output += "Bauru com Ovo   -> R$ 1,50 * " + quantidadeProduto;
					output += " = " + (preco * quantidadeProduto) + "\n";
					break;

				case 103:
					preco = PRECO_HAMBURGUER;
					output += "Hambúrguer      -> R$ 1,20 * " + quantidadeProduto;
					output += " = " + (preco * quantidadeProduto) + "\n";
					break;

				case 104:
					preco = PRECO_CHEESERBURGUER;
					output += "Cheeseburguer   -> R$ 1,30 * " + quantidadeProduto;
					output += " = " + (preco * quantidadeProduto) + "\n";
					total += 1.20 * quantidadeProduto;
					break;

				case 105:
					preco = PRECO_REFRIGERANTE;
					output += "Refrigerante    -> R$ 1,00 * " + quantidadeProduto;
					output += " = " + (PRECO_REFRIGERANTE * quantidadeProduto) + "\n";
					break;

				default:
					System.out.println("Código inválido");
					break;
				}
				total += preco * quantidadeProduto;
				finalizar = false;
			}

		} while (!finalizar);

		System.out.println("\nEspecificação       Preço   Quant  Total\n");
		System.out.println(output);

		scan.close();
	}

}
