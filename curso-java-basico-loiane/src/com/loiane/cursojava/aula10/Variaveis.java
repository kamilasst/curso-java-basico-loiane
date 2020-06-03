package com.loiane.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {

		// Convenção Java
		int idade = 20;
		String nome = "Kamila";
		String nomeDoMeuCachorro = "Chano";
		String ano2014 = "2014";

		// Aceito, mas não é utilizado
		int _idade;
		int $idade;

		// Não é convenção java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;

		idade = 25;

		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);

		// má prática
		int a = 10; // Fica ruim de ler essas variáveis
		String b = "Kamila";

	}

}
