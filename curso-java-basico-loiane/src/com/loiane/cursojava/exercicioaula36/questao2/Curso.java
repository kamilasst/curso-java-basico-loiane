package com.loiane.cursojava.exercicioaula36.questao2;

import java.time.LocalDateTime;

public class Curso {

	private String nomeCurso;
	private LocalDateTime horario;
	private Professor professor;
	private Aluno[] alunos;
	private int index = 0;

	public Curso(String nomeCurso, Professor professor, LocalDateTime horario) {
		this.nomeCurso = nomeCurso;
		this.professor = professor;
		this.horario = horario;
		this.alunos = new Aluno[5];
	}

	public void adicionarAlunos(Aluno aluno) {

		this.alunos[index] = aluno;
		index++;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public LocalDateTime getHorario() {
		return horario;
	}

	public void setHorario(LocalDateTime horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	@Override
	public String toString() {
		return "Curso: " + getNomeCurso() + " - Horário " + getHorario().toLocalTime();
	}
}
