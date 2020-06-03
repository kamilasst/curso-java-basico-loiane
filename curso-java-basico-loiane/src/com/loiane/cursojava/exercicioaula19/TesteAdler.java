package com.loiane.cursojava.exercicioaula19;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class TesteAdler {

	public static void main(String[] args) {

		// TODO kss Exemplo de alteração de locale da aplicação
		// Locale.setDefault(Locale.ENGLISH);

		// Português já é o default da aplicação
		DecimalFormat df = new DecimalFormat("###,###.###");
		double valor = 1.414;
		System.out.println("Exemplo Locale em Português: " + df.format(valor));

		DecimalFormat df2 = new DecimalFormat("###,###.###", new DecimalFormatSymbols(Locale.ENGLISH));
		System.out.println("Exemplo Locale em Inglês: " + df2.format(valor));
	}
}
