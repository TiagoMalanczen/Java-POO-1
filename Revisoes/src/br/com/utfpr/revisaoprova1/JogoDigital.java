package br.com.utfpr.revisaoprova1;

public class JogoDigital extends Jogo{

	private double cupomDesconto;

	public JogoDigital(int id, String titulo, double precoBase, double cupomDesconto) {
		super(id, titulo, precoBase);
		this.cupomDesconto = cupomDesconto;
	}
	
	public JogoDigital(int id, String titulo, double precoBase) {
		super(id, titulo, precoBase);
		this.cupomDesconto = 0.0;
	}

	@Override 
	public double calcularPrecoFinal() {
		return this.precoBase - this.cupomDesconto;
	}
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Valor do cupom de desconto" + this.cupomDesconto);
	}
	
}
