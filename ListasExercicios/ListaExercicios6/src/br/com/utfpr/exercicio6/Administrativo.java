package br.com.utfpr.exercicio6;

public class Administrativo extends Funcionario{

	//===========Atributos===========
	private double adicional;

	//===========Construtor===========
	public Administrativo(String nome, int registro, double salarioBase, double adicional) {
		super(nome, registro, salarioBase);
		this.adicional = adicional;
	}
	
	//===========Metodos===========
	public double calcularSalario() {
		return this.adicional + super.salarioBase;
	}
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Salario adicional = " + this.adicional);
		System.out.println("Salario final = " + this.calcularSalario());
	}
	
}
