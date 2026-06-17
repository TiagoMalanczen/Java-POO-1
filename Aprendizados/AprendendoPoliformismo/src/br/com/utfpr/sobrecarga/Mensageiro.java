package br.com.utfpr.sobrecarga;

public class Mensageiro {

	public void imprimirMensagem(String texto) {
		System.out.println("Imprimindo mensagem " +  texto);
	}
	
	public void imprimirMensagem(int numero) {
		System.out.println("Imprimindo numero " + numero);
	}
	
	public void imprimirMensagem(String mensagem, int numero) {
		System.out.println("Imprimindo mensagem " + mensagem);
		System.out.println("Imprimindo numero " + numero);
	}
}
