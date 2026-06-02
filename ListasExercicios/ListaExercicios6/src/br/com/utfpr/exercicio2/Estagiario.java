package br.com.utfpr.exercicio2;

public class Estagiario extends Funcionario{
	//===========Atributos===========
	private int ciee;

	
	//===========Construtor===========
	public Estagiario(String nome, String endereco, String dataInicio, String funcao, double salario, int ciee) {
		super(nome, endereco, dataInicio, funcao, salario);
		this.ciee = ciee;
	}
	
	//===========Metodos===========
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Ciee = " + this.ciee);
	}
}
