package com.loiane.cursojava.exercicioaula36;

import java.util.Locale;
import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.println("Entre com o nome da Agenda: ");
		String nome = scan.nextLine();

		Agenda agenda = new Agenda(nome);

		Contato[] contatos = new Contato[3];

		for (int i = 0; i < 1; i++) {
			System.out.println("Entre com o " + (i + 1) + " contato:");

			System.out.println("Entre com o Nome: ");
			nome = scan.nextLine();

			System.out.println("Entre com o telefone: ");
			String telefone = scan.nextLine();

			System.out.println("Entre com o email: ");
			String email = scan.nextLine();

			Contato contatoDados = new Contato();
			contatoDados.setNome(nome);
			contatoDados.setTelefone(telefone);
			contatoDados.setEmail(email);

			contatos[i] = contatoDados;
		}

		agenda.setContatos(contatos);

		if (agenda != null) {
			System.out.println(agenda.obterInformacoes());
		}

		scan.close();
	}

}
