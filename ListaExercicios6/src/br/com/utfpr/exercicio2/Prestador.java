package br.com.utfpr.exercicio2;

public class Prestador extends Colaborador {

	//===========Atributos===========
	protected String tipoServico;
	protected double valorHora;
	
	//===========Construtor===========
	public Prestador(String nome, String endereco, String dataInicio, String tipoServico, double valorHora) {
		super(nome, endereco, dataInicio);
		this.tipoServico = tipoServico;
		this.valorHora = valorHora;
	}

	//===========Metodos===========
	public void exibirDados() {
	super.exibirDados(); 
	System.out.println("Tipo do servico = " + this.tipoServico);
	System.out.println("Valor da hora = " + this.valorHora);
	}

}
