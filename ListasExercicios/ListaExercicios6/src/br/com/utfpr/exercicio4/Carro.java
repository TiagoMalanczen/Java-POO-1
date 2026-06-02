package br.com.utfpr.exercicio4;

public class Carro extends Veiculos{
//	=================Atributos=================
	private int quantiaPortas;

//	=================Construtor=================
	public Carro(int quantiaPortas, String marca, String modelo,  String anoFabricacao, double valor) {
		super(marca, modelo, anoFabricacao, valor);
		this.quantiaPortas = quantiaPortas;
	}
	
//	=================Metodos=================
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Quantidade de portas = " + this.quantiaPortas);
	}
	public void calcularIPVA() {
		System.out.println("Valor IPVA = " + super.valor*1.035);
	}
}
