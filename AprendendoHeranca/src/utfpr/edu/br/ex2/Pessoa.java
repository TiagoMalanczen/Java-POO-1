package utfpr.edu.br.ex2;

public class Pessoa {
	//===========Atributos===========
	protected String nome;
	protected int idade;
	protected Endereco endereco;
	
	//===========Construtor===========
	public Pessoa(String nome, int idade, Endereco endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}
	
	//===========Metodos===========
	public void imprimirDados() {
		System.out.println("Nome = " + this.nome);
		System.out.println("Idade= " + this.idade);
		System.out.println("");
		System.out.println("Logradouro = " + endereco.getLogradouro());
		System.out.println("Bairro = " + endereco.getBairro());
		System.out.println("Cidade = " + endereco.getCidade());
		System.out.println("Numero = " + endereco.getNumero());
		System.out.println("Unidade federativa = " + endereco.getUnidadeFederativa());
	}
}
