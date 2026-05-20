package utfpr.edu.br.ex2;

public class Professor extends Pessoa{
	//===========Atributos===========
	private double salarioBase;
	private double salarioTitulacao;
	
	//===========Construtor===========
	public Professor(String nome, int idade, double salarioBase, double salarioTitulacao, Endereco endereco) {
		super(nome, idade, endereco);
		this.salarioBase = salarioBase;
		this.salarioTitulacao = salarioTitulacao;
	}
	
	//===========Metodos===========
	public double calcularSalario() {
		double salarioFinal = this.salarioBase + this.salarioTitulacao;
		
		return salarioFinal;
	}
	
	public void imprimirDados() {
		
		System.out.println("Salario base = " + this.salarioBase);
		System.out.println("Salario titulacao = " + this.salarioTitulacao);
		System.out.println("Salario final = " + this.calcularSalario());
		
		super.imprimirDados();
	}
}
