package br.com.utfpr.revisaoprova3;

public class Gerente extends Colaborador{

	private double bonusGerencial;

	public Gerente(int id, String nome, double salarioBase, double bonusGerencial) {
		super(id, nome, salarioBase);
		this.bonusGerencial = bonusGerencial;
	}

	public Gerente(int id, String nome, double salarioBase) {
		super(id, nome, salarioBase);
		this.bonusGerencial = 1500.00;
	}
	
	@Override
	public double calcularSalario() {
		return this.salarioBase + this.bonusGerencial;
	}

	@Override 
	public void exibirHolerite() {
		super.exibirHolerite();
		System.out.println("Bonus gerencial = " + this.bonusGerencial);
	}
}
