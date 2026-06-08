package br.com.utfpr.exercicio6;

public class Gerente extends Funcionario{
	//===========Atributos===========
	private double totalLucro;
	private int porcentagemParticipacaoLucros;
	
	//===========Construtor===========
	public Gerente(String nome, int registro, double salarioBase, double totalLucro, int porcentagemParticipacaoLucros) {
		super(nome, registro, salarioBase);
		this.totalLucro = totalLucro;
		this.porcentagemParticipacaoLucros = porcentagemParticipacaoLucros;
	}

	//===========Getters e Setters===========
	public double calcularLucros() {
		return super.salarioBase+(this.totalLucro*this.porcentagemParticipacaoLucros)/100;
	}
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Total lucro empresa = " + this.totalLucro);
		System.out.println("Porcentagem sober lucro da empresa = " + this.porcentagemParticipacaoLucros+ "%");
		System.out.println("Valor total salrio = " + this.calcularLucros());
	}
}
