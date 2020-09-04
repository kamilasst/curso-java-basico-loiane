package com.loiane.cursojava.exercicioaula36.arraynoconstrutor;

public class Agenda {

	private String nome;
	private Contato[] contatos;
	private int index = 0;

	public Agenda() {
		this.contatos = new Contato[3];
	}

	public Agenda(String nome) {
		this();
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

	public void add(Contato contato) {

		this.contatos[index] = contato;
		index++;

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
