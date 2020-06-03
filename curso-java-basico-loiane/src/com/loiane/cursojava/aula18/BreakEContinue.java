package com.loiane.cursojava.aula18;

import java.util.Locale;
import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		/*
		 * System.out.println("Digite um número:"); int numero = scan.nextInt();
		 * 
		 * System.out.println("Digite um limite:"); int maximo = scan.nextInt();
		 * 
		 * //Comando break
		 * 
		 * for (int i = numero; i <= maximo; i++) { System.out.println(i); if (i % 7 ==
		 * 0) { System.out.println("O valor de i é: " + i); break; } }
		 * 
		 * // Comando Break com rótulo (label) = conhecido com goto
		 * 
		 * for (int i = 0; i < 4; i++) { rotulo1:{ rotulo2:{ rotulo3:{ if (i == 1) {
		 * break rotulo1; } if (i == 2) { break rotulo2; } if (i == 3) { break rotulo3;
		 * } System.out.println("rótulo3"); } System.out.println("rótulo2"); }
		 * System.out.println("rótulo1"); } System.out.println(i); }
		 */

		// Comando Continue (Lê contínuo)

		System.out.println("Digite um número:");
		int numero = scan.nextInt();

		System.out.println("Digite um limite:");
		int maximo = scan.nextInt();

		for (int i = numero; i <= maximo; i++) {
			if (i % 7 == 0) {
				continue;
			}
			System.out.println("O valor de i é: " + i);
		}

		scan.close();
	}
}
