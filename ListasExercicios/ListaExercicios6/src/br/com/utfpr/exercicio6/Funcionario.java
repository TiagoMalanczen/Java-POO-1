package br.com.utfpr.exercicio6;

public class Funcionario {

	//===========Atributos===========
	protected String nome;
	protected int registro;
	protected double salarioBase;
	
	//===========Construtor===========
	public Funcionario(String nome, int registro, double salarioBase) {
		super();
		this.nome = nome;
		this.registro = registro;
		this.salarioBase = salarioBase;
	}
	
	//===========Metodos===========
	public void imprimirDados() {
		System.out.println("Nome = " + this.nome);
		System.out.println("Registro = " + this.registro);
		System.out.println("Salario base = " + this.salarioBase);
	}

}
