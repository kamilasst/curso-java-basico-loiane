package com.loiane.cursojava.exercicioaula43.questao1;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		String s = "Conta Poupança [";
		s += " Dia Rendimento: " + this.diaRendimento;
		s += " - " + super.toString();
		s += " ]";

		return s;
	}

	public boolean calcularNovoSaldo(double taxaRendimento) {

		Calendar hoje = Calendar.getInstance();

		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			super.setSaldo(super.getSaldo() + (super.getSaldo() * taxaRendimento));
			return true;
		}
		return false;
	}
}
