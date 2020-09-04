package com.loiane.cursojava.exercicioaula44;

public interface AnimalDomesticado {

	public static String VALOR = "1";

	default String getTipo() {
		return "Animal Domesticado";
	}

	void levarVeterinario();

	void alimentar();
}
