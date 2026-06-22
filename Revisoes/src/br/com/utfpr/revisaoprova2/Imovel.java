package br.com.utfpr.revisaoprova2;

public abstract class Imovel {
	protected int id;
	protected String endereco;
	protected double valorAluguel;
	
	public Imovel(int id, String endereco, double valorAluguel) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.valorAluguel = valorAluguel;
	}
	
	public abstract double calcularLocacao();
	
	public void exibirDados() {
		System.out.println("Id = " + this.id);
		System.out.println("Endereco = " + this.endereco);
		System.out.println("Valor do aluguel = = " + this.valorAluguel);
	}
}
