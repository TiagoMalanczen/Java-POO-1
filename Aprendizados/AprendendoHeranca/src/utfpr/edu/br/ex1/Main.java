package utfpr.edu.br.ex1;

public class Main {

	public static void main(String[] args) {
		
		//===========Instanciando===========
		Professor professor1 = new Professor("Jair", 37, 5000.00, 2000.00);
			
		Aluno aluno1 = new Aluno("Pedrin", 17);
			
		//===========Testando===========
		professor1.imprimirDados();
		System.out.println("---------------");
		professor1.calcularSalario();
		
		System.out.println("==============");
		
		aluno1.imprimirDados();
		System.out.println("---------------");
		aluno1.realizarMatricula("ADS");
	}
}
