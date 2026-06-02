package utfpr.edu.br.slides;

public class Professor {

	//===========Atributos===========
	protected int numeroRegistro;
	protected String nome;
	protected String dataNomeacao;
	protected double salario;
	
	//===========Construtor===========
	public Professor(int numeroRegistro, String nome, String dataNomeacao, double salario) {
		
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
		this.dataNomeacao = dataNomeacao;
		this.salario = salario;
	}
	//===========Metodos===========
	public void lancarfrequencia() {
		
		System.out.println(this.nome + " Esta lancando frequencia");
		
	}
	
	public void aplicarAvalicao() {
		
		System.out.println(this.nome + " Esta aplicando a avaliacao");
		

	}
	
	public void imprimirDados() {
		
		System.out.println("Registro = " + this.numeroRegistro);
		System.out.println("Nome = " + this.nome);
		System.out.println("Salario = " + this.salario);
		System.out.println("DataNomeacao = " + this.dataNomeacao);
		
	}
}

