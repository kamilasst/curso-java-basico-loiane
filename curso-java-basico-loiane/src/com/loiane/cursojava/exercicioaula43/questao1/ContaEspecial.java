package com.loiane.cursojava.exercicioaula43.questao1;

public class ContaEspecial extends ContaBancaria {

	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		String s = "Conta Especial [";
		s += " Limite: " + this.limite;
		s += " - " + super.toString();
		s += " ]";

		return s;
	}

	public boolean sacar(double valor) {

		double saldoComLimite = super.getSaldo() + this.limite;

		if ((saldoComLimite - valor) >= 0) {
			super.setSaldo(super.getSaldo() - valor);
			return true;
		}
		return false;
	}

}
