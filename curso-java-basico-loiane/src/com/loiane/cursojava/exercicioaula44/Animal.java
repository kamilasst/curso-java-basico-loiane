package com.loiane.cursojava.exercicioaula44;

public abstract class Animal {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract void emitirSom();
}
