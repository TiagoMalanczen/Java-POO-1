package br.com.utfpr.exercicio1;

public class Retangulo extends Figuras{

	//===========Atributos===========
			private double comprimento;
			private double largura;
			
	//===========Construtor===========
	public Retangulo(String cor, double comprimento, double largura) {
		super(cor);
		this.comprimento = comprimento;
		this.largura = largura;
	}
	//===========Metodos===========
	@Override
		public double calcularArea() {
			return this.largura*this.comprimento;
		}
	
	@Override
		public double calcularPerimetro() {
			return this.comprimento*2 + this.largura*2;
		}
}
