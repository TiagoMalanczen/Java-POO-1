package utfpr.edu.br.treino1;

public class ContaCorrente extends Conta{
	//============Atributos============
	private double limiteChequeEspecial;
	
	//============Construtor============
	public ContaCorrente(int numero, String titular) {
		super(numero, titular);
		this.limiteChequeEspecial = 500.0;
	}
	
	public ContaCorrente(int numero, String titular, double saldo, double limiteChequeEspecial) {
		super(numero, titular, saldo);
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	//============Metodos============
	public void exibirDados() {
		super.imprimirDados();
		System.out.println("Limite cheque especial = " + this.limiteChequeEspecial);
	}
}
