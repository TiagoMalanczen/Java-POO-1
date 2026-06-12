package br.com.utfpr.frete;

public abstract class Frete {
	//===========Atributos===========
	protected double distanciaKM;
	protected double pesoKg;
	
	//===========Construtor===========
	public Frete(double distanciaKM, double pesoKg) {
		super();
		this.distanciaKM = distanciaKM;
		this.pesoKg = pesoKg;
	}
	//===========Metodos===========
	public abstract double calcularFrete();
}
