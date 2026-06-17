package br.com.utfpr.sobrecarga;

public class Main {

	public static void main(String[] args) {
		
		
		Mensageiro mensageiro = new Mensageiro();
		
		mensageiro.imprimirMensagem(12);
		System.out.println();
		mensageiro.imprimirMensagem("Boa noite");
		System.out.println();
		mensageiro.imprimirMensagem("Bom dia " , 43);
		
		
	}
}
