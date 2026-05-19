package br.com.utfpr.luthieriatech;

public class Produto {

	//=============Atributos=============
	private int codigo;
	private String nome;
	private double preco;
	
	//=============Construtor=============
	public Produto(int codigo, String nome, double preco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}


	//=============Getters=============
	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}


	//=============Setters=============
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
