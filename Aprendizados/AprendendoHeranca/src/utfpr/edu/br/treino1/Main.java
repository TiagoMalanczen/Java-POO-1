package utfpr.edu.br.treino1;

public class Main {

	public static void main(String[] args) {
		//============Instanciando============
		ContaCorrente conta1 = new ContaCorrente(111, "Jurandir");
		
		ContaCorrente conta2 = new ContaCorrente(111, "Jacinta", 5000.00, 7000.00);
		//============Testando============
		conta1.exibirDados();
		System.out.println();
		conta2.exibirDados();
	}
}
