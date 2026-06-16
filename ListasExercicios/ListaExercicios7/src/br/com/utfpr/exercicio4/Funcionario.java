package br.com.utfpr.exercicio4;

public abstract class Funcionario {

	//===========Atributos===========
	protected String registro;
	protected String nome;
	protected double salarioBase;
	protected String dataAdmissao;
	
	//===========Construtor===========
	public Funcionario(String registro, String nome, double salarioBase, String dataAdmissao) {
		super();
		this.registro = registro;
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.dataAdmissao = dataAdmissao;
	}
	
	//===========Metodos===========
	protected abstract double calcularSalario();
	protected abstract void imprimirDados();
}
