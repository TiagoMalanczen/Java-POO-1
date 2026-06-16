package br.com.utfpr.exercicio3;

public abstract class Cliente {

	//===========Atributos===========
	protected String nome;
	protected String dataNascimento;
	protected String telefone;
	protected Endereco endereco;
	//===========Construtor===========

	protected Cliente(String nome, String dataNascimento, String telefone, Endereco endereco) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	
	//===========Metodos===========
	
	
}
