package br.com.utfpr.exercicio3;

public class Aluno extends Pessoa{
//	=================Atributos=================
	private	String matricula;


//	=================Construtor=================
	public Aluno(String matricula, String nome, String nascimeto, int rg, int cpf) {
	super(nome, nascimeto, rg, cpf);
	
	this.matricula = matricula;
}
//	=================Metodos=================
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Matricula = " + this.matricula);
	}
}
