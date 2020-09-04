package com.loiane.cursojava.exercicioaula44.questao1;

public class Piramide extends Figura3D {

	private double altura;
	private double arestabase;
	private double apotema;
	private int numPoliBase;

	private Figura2D base;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArestabase() {
		return arestabase;
	}

	public void setArestabase(double arestabase) {
		this.arestabase = arestabase;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public Figura2D getBase() {
		return base;
	}

	public void setBase(Figura2D base) {
		this.base = base;
	}

	public int getNumPoliBase() {
		return numPoliBase;
	}

	public void setNumPoliBase(int numPoliBase) {
		this.numPoliBase = numPoliBase;
	}

	@Override
	public double calcularArea() {
		if (base != null) {
			return (numPoliBase * ((arestabase * apotema) / 2)) + base.calcularArea();
		}
		return 0;
	}

	@Override
	public double calcularVolume() {
		if (base != null) {
			return (base.calcularArea() * altura) / 3;
		}
		return 0;
	}

}
