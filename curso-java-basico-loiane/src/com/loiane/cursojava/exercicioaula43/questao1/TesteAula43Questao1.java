package com.loiane.cursojava.exercicioaula43.questao1;

public class TesteAula43Questao1 {

	public static void main(String[] args) {

		System.out.println("*** TesteAula43Questao3 Conta Bancária ***");

		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente Conta Simples");
		contaSimples.setNumeroConta("12345");

		contaSimples.depositar(100);
		realizarSaque(contaSimples, 50);
		realizarSaque(contaSimples, 70);

		System.out.println(contaSimples);

		System.out.println("*** TesteAula43Questao3 Conta Poupança ***");

		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Cliente Conta Poupança");
		contaPoupanca.setNumeroConta("22222");
		contaPoupanca.setDiaRendimento(31);

		contaPoupanca.depositar(100);
		realizarSaque(contaPoupanca, 50);
		realizarSaque(contaPoupanca, 70);

		if (contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento Aplicado. Novo saldo é: " + contaPoupanca.getSaldo());
		} else {
			System.out.println("Hoje não é dia de rendimento. Novo saldo não calculado.");
		}
		System.out.println(contaPoupanca);

		System.out.println("*** TesteAula43Questao3 Conta Especial ***");

		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Cliente Conta Poupança");
		contaEspecial.setNumeroConta("33333");
		contaEspecial.setLimite(50);

		contaEspecial.depositar(100);
		boolean conseguiuSacar = contaEspecial.sacar(50);
		imprimir(conseguiuSacar, contaEspecial.getSaldo(), 50);
		contaEspecial.sacar(70);
		contaEspecial.sacar(80);

//		realizarSaque(contaEspecial, 50);
//		realizarSaque(contaEspecial, 70);
//		realizarSaque(contaEspecial, 80);

		System.out.println(contaEspecial);
	}

	public static void imprimir(boolean conseguiuSacar, double saldo, double valor) {

		if (conseguiuSacar) {
			System.out.println("Saque Efetuado com Sucesso! Novo saldo: " + saldo);
		} else {
			System.out.println("Saldo Insuficiente para saque de " + valor + " - Seu Saldo é : " + saldo);
		}
	}

	public static void realizarSaque(ContaBancaria conta, double valor) {

		if (conta.sacar(valor)) {
			System.out.println("Saque Efetuado com Sucesso! Novo saldo: " + conta.getSaldo());
		} else {
			System.out.println("Saldo Insuficiente para saque de " + valor + " - Seu Saldo é : " + conta.getSaldo());
		}
	}
}
