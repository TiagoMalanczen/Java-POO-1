package br.com.utfpr.exercicio2;

public class Empresa extends Prestador{
	//===========Atributos===========
	private long cnpj;

	
	//===========Construtor===========
	public Empresa(String nome, String endereco, String dataInicio, String tipoServico, double velorHora, long cnpj) {
		super(nome, endereco, dataInicio, tipoServico, velorHora);
		this.cnpj = cnpj;
	}
	
	//===========Metodos===========
	public void exibirDados() {
		super.exibirDados();
		System.out.println("CNPJ = " + this.cnpj);
	}
}
