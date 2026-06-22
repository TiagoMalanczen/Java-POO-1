package br.com.utfpr.revisaoprova1;

public abstract class Jogo {

	protected int id;
	protected String titulo;
	protected double precoBase;
	
	public Jogo(int id, String titulo, double precoBase) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.precoBase = precoBase;
	}
	
	public abstract double calcularPrecoFinal();
	
	
	public void exibirDados() {
		System.out.println("Id = " + this.id);
		System.out.println("Titulo = " + this.titulo);
		System.out.println("Preco base = " + this.precoBase);
	}
	
}
