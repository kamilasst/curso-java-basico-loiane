package com.loiane.cursojava.exercicioaula36.questao2;

public class Aluno {

	private String nome;
	private String matricula;
	private double[] notas;
	private int index = 0;

	public Aluno() {
		this.notas = new double[4];
	}

	public void adicionarNota(double nota) {
		this.notas[index] = nota;
		index++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double[] getNotas() {
		return notas;
	}
}
