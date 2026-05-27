package br.com.utfpr.exercicio2;

public class Colaborador {

	//===========Atributos===========
	protected String nome;
	protected String endereco;
	protected String dataInicio;
	
	
	//===========Construtor===========
	public Colaborador(String nome, String endereco, String dataInicio) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.dataInicio = dataInicio;
	}
	//===========Metodos===========
	public void exibirDados() {
		System.out.println("Nome = " + this.nome);
		System.out.println("Endereco = " + this.endereco);
		System.out.println("Data de inicio = " + this.dataInicio);
	}
}
