package com.loiane.cursojava.exercicioaula36;

public class Agenda {

	private String nome;
	private Contato[] contatos;

	public Agenda() {

	}

	public Agenda(String nome) {

		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contato) {
		this.contatos = contato;
	}

	public String obterInformacoes() {

		String info = "Nome = " + this.nome + "\n";

		if (contatos != null) {
			for (Contato contato : contatos) {
				info += contato.obterInformacoes() + "\n";
			}
		}
		return info;
	}

}
