package br.com.utfpr.exercicio1;

public class Losango extends Figuras{

	//===========Atributos===========
	private double diagonalMaior;
	private double diagonalMenor;
			
	//===========Construtor===========
	public Losango(String cor, double diagonalMaior, double diagonalMenor) {
		super(cor);
		this.diagonalMaior = diagonalMaior;
		this.diagonalMenor = diagonalMenor;
	}
	//===========Metodos===========
	@Override
		public double calcularArea() {
			return (this.diagonalMaior*this.diagonalMenor)/2;
		}
	
	@Override
		public double calcularPerimetro() {
			return 4*this.calcularLado();
		}
		
		public double calcularLado() {
			return Math.sqrt(Math.pow(this.diagonalMaior / 2, 2) + Math.pow(this.diagonalMenor / 2, 2));
		}
}
