package br.com.utfpr.exercicio5;

public class ImovelNovo extends Imovel{

//	=================Atributos=================
	private double valorAdicional;

//	=================Construtor=================
	public ImovelNovo(double valorBase, Endereco endereco, double valorAdicional) {
	super(valorBase, endereco);
	this.valorAdicional = valorAdicional;
}
//	=================Metodos=================
	public double calcularFinal() {
		return this.valorAdicional + super.valorBase;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Valor adicional = " + this.valorAdicional);
	}
}
