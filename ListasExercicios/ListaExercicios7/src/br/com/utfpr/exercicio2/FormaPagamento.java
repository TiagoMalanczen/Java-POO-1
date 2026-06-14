package br.com.utfpr.exercicio2;

public abstract class FormaPagamento {
	//===========Atributos===========
	protected double valorToral;

	//===========Contrutor===========
	public FormaPagamento(double valorToral) {
		super();
		this.valorToral = valorToral;
	}
	
	//===========Metodos===========
	public abstract void efetuarPagamento();
}

