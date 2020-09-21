package com.loiane.cursojava.exercicioaula52.questao1;

public class AgendaCheiaException extends Exception {

	@Override
	public String getMessage() {
		return "Agenda já está cheia!";
	}
}
