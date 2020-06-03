package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Lojas Tabajara");

		boolean sair = false;
		String continuarCompra;
		int quantidadeProdutos;
		double precoProduto;
		double total = 0.0;
		String output;
		double valorPago, troco;

		do {
			System.out.println("Deseja informa uma nova compra?");
			continuarCompra = scan.next();

			if (continuarCompra.equals("s")) {

				output = "Lojas Tabajara\n";

				System.out.println("Digite a quantidade de produtos da compra: ");
				quantidadeProdutos = scan.nextInt();

				for (int i = 1; i <= quantidadeProdutos; i++) {

					System.out.println("Preço: ");
					precoProduto = scan.nextDouble();

					total += precoProduto;
					output += "Produto" + i + " - R$ " + precoProduto + "\n";
				}
				output += "Total: R$ " + total + "\n";

				System.out.println("Total: R$ " + total);

				System.out.println("Digite o valor pago: ");
				valorPago = scan.nextDouble();

				output += "Dinheiro: R$ " + valorPago + "\n";

				troco = valorPago - total;

				output += "Troco: R$ " + troco;

				System.out.println(output);

			} else {
				sair = true;
			}

		} while (!sair);

		scan.close();
	}
}
