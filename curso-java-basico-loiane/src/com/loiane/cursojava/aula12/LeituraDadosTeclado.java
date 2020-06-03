package com.loiane.cursojava.aula12;

import java.util.Locale;
import java.util.Scanner;

public class LeituraDadosTeclado {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		//Lendo uma linha inteira
		/*System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome); 
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura);*/
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação: ");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Primeiro Nome: " + primeiroNome);
		System.out.println("Sua idade: " + idade);
		System.out.println("Tem filhos: " + qtdFilhos);
		System.out.println("Sua altura é: " + altura);
		System.out.println("Tem Bichinho de estimação: " + temPet);
		
		scan.close();
		
	}
}
