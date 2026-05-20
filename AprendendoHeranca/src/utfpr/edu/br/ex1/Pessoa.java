package utfpr.edu.br.ex1;

public class Pessoa {

	//===========Atributos===========
	protected String nome;
	protected int idade;
	
	//===========Construtor===========
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	//===========Metodos===========
	public void imprimirDados() {
		System.out.println("Nome = " + this.nome);
		System.out.println("Idade= " + this.idade);
	}
	
}
