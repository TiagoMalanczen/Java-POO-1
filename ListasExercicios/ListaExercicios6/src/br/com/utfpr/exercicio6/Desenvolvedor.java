package br.com.utfpr.exercicio6;

public class Desenvolvedor extends Funcionario{
	//===========Atributos===========
	private int projetosConcluidos;
	private double bonificacaoProjetos;

	//===========Construtor===========
	public Desenvolvedor(String nome, int registro, double salarioBase, int projetosConcluidos,
			double bonificacaoProjetos) {
		super(nome, registro, salarioBase);
		this.projetosConcluidos = projetosConcluidos;
		this.bonificacaoProjetos = bonificacaoProjetos;
	}
	
	//===========Metodos===========
	public double valorBonificacao() {
		return this.projetosConcluidos*this.bonificacaoProjetos;
	}
	
	public double calcularSalario() {
		return super.salarioBase+this.valorBonificacao();
	}
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Total de projetos concluidos = " + this.projetosConcluidos);
		System.out.println("Valor bonificacao = " + this.bonificacaoProjetos);
		System.out.println("Valor salario total = " + this.calcularSalario());
	}
}
