package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		boolean informacoesValidas = false;
		String nomeUsuario;
		String senha;

		do {

			System.out.println("Digite o seu nome: ");
			nomeUsuario = scan.next();

			System.out.println("Digite sua senha: ");
			senha = scan.next();

			// TODO atg pra kss: Fazer m�todo
			if (nomeUsuario.equalsIgnoreCase(senha)) {
				informacoesValidas = false;
				System.out.println("Senha igual ao usu�rio. Digite novamente!");

			} else {
				informacoesValidas = true;
				System.out.println("Senha e usu�rio v�lidos! ");
			}

		} while (!informacoesValidas);

		scan.close();
	}
}
