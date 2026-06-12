package br.com.utfpr.colecoes;

public class ProdutoDigital extends Produto{
		//===========Construtor===========
		public ProdutoDigital(String nome, double precoBase) {
			super(nome, precoBase);
		}
		
		//===========Metodos===========
		@Override
		public double calcularPrecoFinal() {
			return this.precoBase *0.9;
		}
}
