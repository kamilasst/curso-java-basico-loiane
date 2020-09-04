package com.loiane.cursojava.exercicioaula43.questao1;

public class ContaBancaria {

	private String nomeCliente;
	private String numeroConta;
	private double saldo;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		// TODO atg para ksst - Forma antiga
//		String s = "Conta Bancária [";
//		s += " Nome Cliente: " + this.nomeCliente;
//		s += " - Numero Conta: " + this.numeroConta;
//		s += " - Saldo " + this.saldo;
//		s += " ]";
//
//		return s;

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Conta Bancária [ Nome Cliente: ");
		stringBuilder.append(this.nomeCliente);
		stringBuilder.append("- Numero Conta: ");
		stringBuilder.append(this.numeroConta);
		stringBuilder.append("- Saldo: ");
		stringBuilder.append(this.saldo);
		stringBuilder.append(" ]");

		return stringBuilder.toString();
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public boolean sacar(double valor) {
		if ((this.saldo - valor) >= 0) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
}
