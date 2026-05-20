package utfpr.edu.br.ex2;

public class Aluno extends Pessoa{
	//===========Atributos===========
	private String curso;

	//===========Construtor===========
	
	public Aluno(String nome, int idade, String curso, Endereco endereco) {
		super(nome, idade, endereco);
		this.curso = curso;
	}
	
	//===========Metodos===========
	public void realizarMatricula(String cursoDesejado) {
		System.out.println("Ralizando matricula no curso " + cursoDesejado);
	}
	
	public void imprimirDados() {
		System.out.println("Curso = " + this.curso);
		
		super.imprimirDados();
	}
}
