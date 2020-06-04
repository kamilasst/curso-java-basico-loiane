package com.loiane.cursojava.exercicioaula17;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuestao2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		String nomeUsuario;
		String senha;

		boolean informacoesValidas;

		do {

			System.out.println("Digite o seu nome: ");
			nomeUsuario = scan.next();

			System.out.println("Digite sua senha: ");
			senha = scan.next();

			// TODO kss pra atg: Corrigir método

			informacoesValidas = validarNomeSenha(nomeUsuario, senha);

		} while (!informacoesValidas);

		scan.close();
	}

	private static boolean validarNomeSenha(String nomeUsurio, String senha) {

		boolean informacoesValidas = false;

		if (nomeUsurio.equalsIgnoreCase(senha)) {
			informacoesValidas = false;
			System.out.println("Senha igual ao usuário. Digite novamente!");

		} else {
			informacoesValidas = true;
			System.out.println("Senha e usuário válidos! ");
		}

		return informacoesValidas;
	}
}
