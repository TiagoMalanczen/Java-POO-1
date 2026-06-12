package br.com.utfpr.exercicio1;

public class Quadrado extends Figuras{

	//===========Atributos===========
		private double lado;
		
	//===========Construtor===========

		public Quadrado(String cor, double lado) {
			super(cor);
			this.lado = lado;
		}
	//===========Metodos===========
	@Override
		public double calcularArea() {
			return this.lado*this.lado;
		}
	@Override
		public double calcularPerimetro() {
			return this.lado*4;
		}


}
