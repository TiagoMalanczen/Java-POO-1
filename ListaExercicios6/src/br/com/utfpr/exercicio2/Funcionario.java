package br.com.utfpr.exercicio2;

public class Funcionario extends Colaborador {

	//===========Atributos===========
	protected String funcao;
	protected double salario;
	
	//===========Construtor===========
	public Funcionario(String nome, String endereco, String dataInicio, String funcao, double salario) {
		super(nome, endereco, dataInicio);
		this.funcao = funcao;
		this.salario = salario;
	}

	//===========Metodos===========
	public void exibirDados() {
	super.exibirDados(); 
	System.out.println("Funcao = " + this.funcao);
	System.out.println("Salario = " + this.salario);
	}

}
