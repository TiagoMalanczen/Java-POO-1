package utfpr.edu.br.ex1;

public class Professor extends Pessoa{

	//===========Atributos===========
	private double salarioBase;
	private double salarioTitulacao;
	
	//===========Construtor===========
	public Professor(String nome, int idade, double salarioBase, double salarioTitulacao) {
		super(nome, idade);
		this.salarioBase = salarioBase;
		this.salarioTitulacao = salarioTitulacao;
	}
	
	//===========Metodos===========
	public double calcularSalario() {
		double salarioFinal = this.salarioBase + this.salarioTitulacao;
		
		return salarioFinal;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Salario base = " + this.salarioBase);
		System.out.println("Salario titulacao = " + this.salarioTitulacao);
		System.out.println("Salario final = " + this.calcularSalario());
	}
}
