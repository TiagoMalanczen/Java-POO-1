package br.com.utfpr.exercicio1;

public abstract class Figuras {

	//===========Atributos===========
	protected String cor;
	
	//===========Construtor===========
	protected Figuras(String cor) {
		super();
		this.cor = cor;
	}
	//===========Metodos===========
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
	
}
