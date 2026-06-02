package utfpr.edu.br.treino1;

public class Conta {

	//============Atributos============
	protected int numero;
	protected String titular;
	protected double saldo;
	
	//============Construtor============
	public Conta(int numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public Conta(int numero, String titular) {
		this(numero, titular, 0.0);
	}
	
	//============Metodos============
	public void imprimirDados() {
		System.out.println("Titular = " + this.titular);
		System.out.println("Numero = " + this.numero);
		System.out.println("Saldo = " + this.saldo);
	}
}
