package br.com.utfpr.exercicio3;

public class Main {
	public static void main(String[] args) {
//		=================Instanciando=================
		Pessoa pessoa1 = new Pessoa("Pedro", "21/07/2003", 12345676 , 234565432);
		Aluno aluno1 = new Aluno("2345" ,"Jaime", "31/02/2008", 12344, 235432);
//		=================Testando=================
		pessoa1.imprimirDados();
		System.out.println("================");
		aluno1.imprimirDados();
	}
}
