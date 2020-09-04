package com.loiane.cursojava.exercicioaula36.questao2;

import java.time.LocalDateTime;

public class TesteAula32Questao2 {

	public static void main(String[] args) {

		Professor professor = new Professor();
		professor.setNome("Carlos");
		professor.setDepartamento("Matemática");
		professor.setEmail("carlos@hotmail.com");

		Aluno aluno1 = new Aluno();
		aluno1.setMatricula("12345");
		aluno1.setNome("Kamila");
		aluno1.adicionarNota(10.0);
		aluno1.adicionarNota(8.0);
		aluno1.adicionarNota(6.0);
		aluno1.adicionarNota(8.0);

		Aluno aluno2 = new Aluno();
		aluno2.setMatricula("23451");
		aluno2.setNome("João");
		aluno2.adicionarNota(10.0);
		aluno2.adicionarNota(6.0);
		aluno2.adicionarNota(9.0);
		aluno2.adicionarNota(9.0);

		Aluno aluno3 = new Aluno();
		aluno3.setMatricula("34512");
		aluno3.setNome("Maria");
		aluno3.adicionarNota(7.0);
		aluno3.adicionarNota(8.0);
		aluno3.adicionarNota(6.0);
		aluno3.adicionarNota(6.0);

		Aluno aluno4 = new Aluno();
		aluno4.setMatricula("45123");
		aluno4.setNome("Daniel");
		aluno4.adicionarNota(5.0);
		aluno4.adicionarNota(9.0);
		aluno4.adicionarNota(7.0);
		aluno4.adicionarNota(6.0);

		Aluno aluno5 = new Aluno();
		aluno5.setMatricula("51234");
		aluno5.setNome("Bruna");
		aluno5.adicionarNota(10.0);
		aluno5.adicionarNota(9.0);
		aluno5.adicionarNota(10.0);
		aluno5.adicionarNota(10.0);

		Curso cursoMatematica = new Curso("Matemática", professor, LocalDateTime.of(2020, 8, 24, 13, 00));
		cursoMatematica.adicionarAlunos(aluno1);
		cursoMatematica.adicionarAlunos(aluno2);
		cursoMatematica.adicionarAlunos(aluno3);
		cursoMatematica.adicionarAlunos(aluno4);
		cursoMatematica.adicionarAlunos(aluno5);

		imprimirInformacoes(cursoMatematica);
	}

	public static double obterMediaAluno(double[] notas) {

		double somaNotas = 0.0;
		double mediaAluno = 0.0;

		for (int i = 0; i < notas.length; i++) {

			double nota = notas[i];
			System.out.println((i + 1) + " Nota - " + nota);
			somaNotas += nota;
		}

		mediaAluno = somaNotas / notas.length;

		return mediaAluno;

	}

	public static String imprimirAprovadoOuRecuperacao(double mediaAluno) {

		if (mediaAluno >= 7.0) {
			return "Aprovado(a)!";
		}

		return "Em Recuperação!";
	}

	public static double obterMediaTurma(double[] mediaAluno) {

		double somaMedia = 0.0;

		for (double media : mediaAluno) {
			somaMedia += media;
		}

		double mediaTurma = somaMedia / mediaAluno.length;

		return mediaTurma;
	}

	public static void imprimirInformacoes(Curso curso) {

		System.out.println(curso);
		System.out.println("\nProfessor(a): " + curso.getProfessor().getNome());
		System.out.println("Email: " + curso.getProfessor().getEmail());

//		TODO o foreach utilizado na questao é o mesmo que esse exemplo com barra dupla:
//		for (int i = 0; i < curso.getAlunos().length; i++) {
//		Aluno aluno = curso.getAlunos()[i];

		double[] mediasAlunos = new double[curso.getAlunos().length];
		int index = 0;

		for (Aluno aluno : curso.getAlunos()) {
			System.out.println("\nAluno(a) : " + aluno.getNome());
			System.out.println("\nMatrícula: " + aluno.getMatricula());
			double mediaAluno = obterMediaAluno(aluno.getNotas());
			mediasAlunos[index] = mediaAluno;
			index++;
			System.out.println("\nMédia: " + mediaAluno);
			System.out.println("\nSituação: " + imprimirAprovadoOuRecuperacao(mediaAluno));
			System.out.println("==========================================");
		}

		System.out.println("\nMédia Turma - " + obterMediaTurma(mediasAlunos));

	}
}
