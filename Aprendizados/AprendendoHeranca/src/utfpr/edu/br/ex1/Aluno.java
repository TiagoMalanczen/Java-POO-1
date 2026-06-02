package utfpr.edu.br.ex1;

public class Aluno extends Pessoa{
	
	//===========Atributos===========
	private String curso;

	//===========Construtor===========
	
	public Aluno(String nome, int idade) {
		super(nome, idade);
	}
	
	//===========Metodos===========
	public void realizarMatricula(String cursoDesejado) {
		this.curso = cursoDesejado;
		System.out.println("Ralizando matricula no curso " + cursoDesejado);
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Curso = " + this.curso);
	}
}
