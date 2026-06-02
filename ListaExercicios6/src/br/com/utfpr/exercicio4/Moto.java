package br.com.utfpr.exercicio4;

public class Moto extends Veiculos{
//	=================Atributos=================
	private String guidao;

//	=================Construtor=================
	public Moto(String guidao, String marca, String modelo,  String anoFabricacao, double valor) {
		super(marca, modelo, anoFabricacao, valor);
		this.guidao = guidao;
	}
	
//	=================Metodos=================
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Guidao = " + this.guidao);
	}
	public void calcularIPVA() {
		System.out.println("Valor IPVA = " + super.valor*1.02);
	}
}
