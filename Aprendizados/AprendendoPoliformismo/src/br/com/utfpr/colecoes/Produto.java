package br.com.utfpr.colecoes;

public abstract class Produto {

	//===========Atributos===========
		protected String nome;
		protected double precoBase;

	//===========Construtor===========
		public Produto(String nome, double precoBase) {
			super();
			this.nome = nome;
			this.precoBase = precoBase;
		}
	//===========Metodos===========
		public abstract double calcularPrecoFinal();
	
}
