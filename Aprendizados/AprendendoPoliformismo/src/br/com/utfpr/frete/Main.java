package br.com.utfpr.frete;

public class Main {
	public static void main(String[] args) {
	

		//===========Instanciando===========
	FreteExpresso expresso = new FreteExpresso(10.8, 10.7);
	
		//===========Testando===========
		System.out.println(expresso.calcularFrete());
	}
}
