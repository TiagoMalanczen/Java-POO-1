package br.com.utfpr.exercicio4;

public class Main {
	public static void main(String[] args) {
//		=================Instanciando=================

	    Carro carro = new Carro(4 ,"Toyota", "Corolla", "2023" , 120000.00);
	    Moto moto = new Moto("Esportivo", "Honda", "CB 500X", "2024", 40000.00);
	    Caminhao caminhao = new Caminhao( 74.0 , "Volvo", "FH 540", "2022" , 600000.00);
//		=================Testando=================

	    System.out.println("---------");
	    carro.imprimirDados();
	    System.out.println("---------");
	    moto.imprimirDados();
	    System.out.println("---------");
	    caminhao.imprimirDados();
	    
	    carro.calcularIPVA();
	    
	}
}
