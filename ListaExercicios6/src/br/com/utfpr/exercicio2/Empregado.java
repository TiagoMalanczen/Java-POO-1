package br.com.utfpr.exercicio2;

public class Empregado extends Funcionario{
	//===========Atributos===========
	private int carteiraTrabalho;

	
	//===========Construtor===========
	public Empregado(String nome, String endereco, String dataInicio, String funcao, double salario, int carteiraTrabalho) {
		super(nome, endereco, dataInicio, funcao, salario);
		this.carteiraTrabalho = carteiraTrabalho;
	}
	
	//===========Metodos===========
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Carteira de trabalho = " + this.carteiraTrabalho);
	}
}
