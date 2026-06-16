package br.com.utfpr.exercicio4;

public class Processos {
	//==========Atributos===========
	private int numero;
	private String dataCriacao;
	private String descricao;
	
	//===========Construtor===========
	public Processos(int numero, String dataCriacao, String descricao) {
		super();
		this.numero = numero;
		this.dataCriacao = dataCriacao;
		this.descricao = descricao;
	}
	
	//===========Getters===========
	public int getNumero() {
		return numero;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
