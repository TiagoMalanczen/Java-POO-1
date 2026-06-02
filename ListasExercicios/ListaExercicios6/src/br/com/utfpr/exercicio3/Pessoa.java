package br.com.utfpr.exercicio3;

public class Pessoa {
//	=================Atributos=================
	protected String nome;
	protected String nascimento;
	protected int rg;
	protected int cpf;	

//	=================Construtor=================
		public Pessoa(String nome, String nascimento, int rg, int cpf) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.rg = rg;
		this.cpf = cpf;
	}
	
//	=================Metodos=================
	public void imprimirDados() {
		System.out.println("Nome = " +this.nome);
		System.out.println("Data de nascimento = " +this.nascimento);
		System.out.println("RG = " +this.rg);
		System.out.println("CPF = " +this.cpf);
	}
}
