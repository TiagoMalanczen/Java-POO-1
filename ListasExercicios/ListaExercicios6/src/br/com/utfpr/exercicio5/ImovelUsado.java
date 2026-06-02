package br.com.utfpr.exercicio5;

public class ImovelUsado extends Imovel{
//	=================Atributos=================
	private double valorDesconto;

//	=================Construtor=================
	public ImovelUsado(double valorBase, Endereco endereco, double valorDesconto) {
	super(valorBase, endereco);
	this.valorDesconto = valorDesconto;
}
//	=================Metodos=================
	public double calcularFinal() {
		return super.valorBase - this.valorDesconto;
	}
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Valor do desconto = " + this.valorDesconto);
	}
	
}
