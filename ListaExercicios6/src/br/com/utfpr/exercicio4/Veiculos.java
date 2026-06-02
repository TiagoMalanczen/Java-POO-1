package br.com.utfpr.exercicio4;

public class Veiculos {
//	=================Atributos=================
	protected String marca;
	protected String modelo;
	protected String anoFabricacao;
	protected double valor;
//	=================Construtor=================
	public Veiculos(String marca, String modelo, String anoFabricacao, double valor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.valor = valor;
	}
	
//	=================Metodos=================
	public void imprimirDados() {
		System.out.println("Marca = " + this.marca);
		System.out.println("Modelo = " + this.modelo);
		System.out.println("Ano fabricacao = " + this.anoFabricacao);
		System.out.println("Valor = " + this.valor);
	}
}
