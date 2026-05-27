package br.com.utfpr.exercicio2;

public class Autonomo extends Prestador{
	//===========Atributos===========
	private long cpf;

	
	//===========Construtor===========
	public Autonomo(String nome, String endereco, String dataInicio, String tipoServico, double valorHora, long cpf) {
		super(nome, endereco, dataInicio, tipoServico, valorHora);
		this.cpf = cpf;
	}
	
	//===========Metodos===========
	public void exibirDados() {
		super.exibirDados();
		System.out.println("CPF = " + this.cpf);
	}
}
