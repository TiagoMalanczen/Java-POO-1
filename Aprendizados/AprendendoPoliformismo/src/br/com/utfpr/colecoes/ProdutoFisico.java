package br.com.utfpr.colecoes;

public class ProdutoFisico extends Produto {

	//===========Construtor===========
	public ProdutoFisico(String nome, double precoBase) {
		super(nome, precoBase);
	}
	
	//===========Metodos===========
	@Override
	public double calcularPrecoFinal() {
		return this.precoBase + 15.0;
	}
}
