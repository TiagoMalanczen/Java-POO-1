package br.com.utfpr.exercicio5;

public class Imovel {
//	=================Atributos=================
	protected double valorBase;
	protected Endereco endereco;
	
//	=================Construtor=================
	public Imovel(double valorBase, Endereco endereco) {
		super();
		this.valorBase = valorBase;
		this.endereco = endereco;
	}
//	=================Metodos=================
	public void imprimirDados() {
		System.out.println("Dados endereco:");
		System.out.println("Logradouro = " + this.endereco.getLogradouro());
		System.out.println("Bairro = " + this.endereco.getBairro());
		System.out.println("Numero = " + this.endereco.getNumero());
		System.out.println("Cidade = " + this.endereco.getCidade());
		System.out.println("Unidade Federativa = " + this.endereco.getUf());
		System.out.println("Dados imovel:");
		System.out.println("Valor base = " + this.valorBase);
	}
}
