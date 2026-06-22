package br.com.utfpr.revisaoprova1;

public class JogoFisico extends Jogo{

	private double valorFrete;

	public JogoFisico(int id, String titulo, double precoBase, double valorFrete) {
		super(id, titulo, precoBase);
		this.valorFrete = valorFrete;
	}
	
	@Override
	public double calcularPrecoFinal() {
		return this.precoBase+this.valorFrete;
	}
	@Override
	public void imprimirDados() {
		super.exibirDados();
		System.out.println("Valor do frete = " + this.valorFrete);
	}
}
