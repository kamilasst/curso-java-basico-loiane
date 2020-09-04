package com.loiane.cursojava.exercicioaula36.arraynoconstrutor;

public class TesteAgendaArrayNoConstrutor {

	public static void main(String[] args) {

		Contato contato1 = new Contato();
		contato1.setNome("Kamila");
		contato1.setTelefone("87 9999-4444");
		contato1.setEmail("kamilinha@gmail.com");

		Contato contato2 = new Contato();
		contato2.setNome("Adler");
		contato2.setTelefone("87 4444-7777");
		contato2.setEmail("adlerzinho@gmail.com");

		Contato contato3 = new Contato();
		contato3.setNome("Zilda");
		contato3.setTelefone("87 2222-4444");
		contato3.setEmail("zildinha@gmail.com");

		Agenda agenda = new Agenda("Minha Agenda");
		agenda.add(contato1);
		agenda.add(contato2);
		agenda.add(contato3);

		if (agenda != null) {
			System.out.println(agenda.obterInformacoes());
		}
	}
}
