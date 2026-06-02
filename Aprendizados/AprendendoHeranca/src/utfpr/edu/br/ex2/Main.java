package utfpr.edu.br.ex2;

public class Main {
	public static void main(String[] args) {
		//===========Instanciando===========
				Endereco enderecoTeste = new Endereco("", 120, "", "", "");
				
				Professor professor1 = new Professor("Jair", 37, 5000.00, 2000.00, enderecoTeste);
					
				Aluno aluno1 = new Aluno("Pedrin", 17, "ADS", enderecoTeste);
				
				
				//===========Testando===========
				professor1.imprimirDados();
				System.out.println("---------------");
				System.out.println("Salario total  = "+professor1.calcularSalario());
				
				System.out.println("==============");
				
				aluno1.imprimirDados();
				System.out.println("---------------");
				aluno1.realizarMatricula("ADS");
	}
}
