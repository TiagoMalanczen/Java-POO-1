package br.com.utfpr.revisaoprova3;

public abstract class Colaborador {

	protected int id;
	protected String nome;
	protected double salarioBase;
	
	public Colaborador(int id, String nome, double salarioBase) {
		super();
		this.id = id;
		this.nome = nome;
		this.salarioBase = salarioBase;
	}
	
	public abstract double calcularSalario();
	
	public void exibirHolerite() {
		System.out.println("Id  = " + this.id);
		System.out.println("Nome  = " + this.nome);
		System.out.println("Salario base = " + this.salarioBase);
	}
}
