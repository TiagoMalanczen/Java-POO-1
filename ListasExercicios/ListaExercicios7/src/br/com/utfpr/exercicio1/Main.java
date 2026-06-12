package br.com.utfpr.exercicio1;

public class Main {

	
	public static void main(String[] args) {
		
		int opcao = 2;
		Figuras fig = null;
		switch(opcao) {
		case 1:
		fig = new Quadrado("Amarelo", 10);
		break;
		case 2:
		fig = new Retangulo("Roxo", 14, 15);
		break;
		case 3:
		fig = new Losango("Azul", 10,16);
		break;
		}
		
		System.out.println("Area = " + fig.calcularArea());
		System.out.println("Perimetro = " + fig.calcularPerimetro());
	}

}
