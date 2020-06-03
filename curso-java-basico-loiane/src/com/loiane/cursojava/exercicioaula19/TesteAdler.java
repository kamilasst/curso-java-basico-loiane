package com.loiane.cursojava.exercicioaula19;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class TesteAdler {

	public static void main(String[] args) {

		// TODO kss Exemplo de altera��o de locale da aplica��o
		// Locale.setDefault(Locale.ENGLISH);

		// Portugu�s j� � o default da aplica��o
		DecimalFormat df = new DecimalFormat("###,###.###");
		double valor = 1.414;
		System.out.println("Exemplo Locale em Portugu�s: " + df.format(valor));

		DecimalFormat df2 = new DecimalFormat("###,###.###", new DecimalFormatSymbols(Locale.ENGLISH));
		System.out.println("Exemplo Locale em Ingl�s: " + df2.format(valor));
	}
}
