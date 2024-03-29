package com.loiane.cursojava.exercicioaula43.questao2;

public class PessoaJuridica extends Contribuinte {

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		return this.getRendaBruta() * 0.1;
	}

	@Override
	public String toString() {
		String s = "Pessoa Jur�dica [";
		s += super.toString();
		s += " - CNPJ: " + this.cnpj;
		s += " - Imposto a ser pago: " + calcularImposto();
		s += "]";

		return s;
	}
}
