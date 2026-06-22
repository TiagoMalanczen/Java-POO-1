package br.com.utfpr.revisaoprova3;

public class Desenvolverdor extends Colaborador{

	private final double VALOR_PRO_PROJETO = 400.00;
	private int quantidadeProjetosConcluidos;
	
	
	public Desenvolverdor(int id, String nome, double salarioBase, int quantidadeProjetosConcluidos) {
		super(id, nome, salarioBase);
		this.quantidadeProjetosConcluidos = quantidadeProjetosConcluidos;
	}
	@Override
	public double calcularSalario() {
		return this.salarioBase + (this.VALOR_PRO_PROJETO* this.quantidadeProjetosConcluidos);
	}

	@Override 
	public void exibirHolerite() {
		super.exibirHolerite();
		System.out.println("Valor por projeto concluido = " + this.VALOR_PRO_PROJETO);
		System.out.println("Quantidade de projetos concluidos = " + this.quantidadeProjetosConcluidos);
	}
}
