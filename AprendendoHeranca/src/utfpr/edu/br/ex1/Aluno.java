package utfpr.edu.br.ex1;

public class Aluno extends Pessoa{
	
	//===========Atributos===========
	private String curso;

	//===========Construtor===========
	
	public Aluno(String nome, int idade, String curso) {
		super(nome, idade);
		this.curso = curso;
	}
	
	//===========Metodos===========
	public void realizarMatricula(String cursoDesejado) {
		System.out.println("Ralizando matricula no curso " + cursoDesejado);
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Curso = " + this.curso);
	}
}
