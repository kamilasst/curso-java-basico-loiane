package com.loiane.cursojava.exercicioaula52.questao1;

public class Contato {

	private int identificador;
	private String nome;
	private String telefone;
	private String email;
	private static int contador = 0;

	public Contato() {
		contador++;
		this.identificador = contador;
	}

	public int getIdentificador() {
		return identificador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		String s = "[ ";
		s += " Id - " + this.identificador;
		s += " / Nome - " + this.nome;
		s += " / Telefone - " + this.telefone;
		s += " / Email - " + this.email;
		s += " ] ";
		return s;
	}
}