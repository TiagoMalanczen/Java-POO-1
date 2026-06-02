package br.com.utfpr.exercicio4;

public class Caminhao extends Veiculos{
//	=================Atributos=================
	private double capCarga;

//	=================Construtor=================
	public Caminhao(double capCarga, String marca, String modelo,  String anoFabricacao, double valor) {
		super(marca, modelo, anoFabricacao, valor);
		this.capCarga = capCarga;
	}
	
//	=================Metodos=================
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Capacidade de carga = " + this.capCarga);
	}
	public void calcularIPVA() {
		System.out.println("Valor IPVA = " + super.valor*1.015);
	}
}
