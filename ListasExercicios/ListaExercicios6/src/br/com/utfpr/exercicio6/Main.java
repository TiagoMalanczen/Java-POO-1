package br.com.utfpr.exercicio6;

public class Main {
	public static void main(String[] args) {
		
		//===========Instanciando===========
		Administrativo adm = new Administrativo("Carlos", 12345, 4500.00, 1200.00);
		Desenvolvedor dev = new Desenvolvedor("Mario", 23456, 5500.00, 10, 500.00);
		Gerente ger = new Gerente("Gerivaldo", 28764, 10000.00, 100000.00, 2);
		
		//===========Testando===========
		adm.imprimirDados();
		System.out.println("=============");
		dev.imprimirDados();
		System.out.println("=============");
		ger.imprimirDados();
	}
}
