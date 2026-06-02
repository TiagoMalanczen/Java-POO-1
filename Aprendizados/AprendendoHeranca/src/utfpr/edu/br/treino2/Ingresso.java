package utfpr.edu.br.treino2;

public class Ingresso {

	//============Atributos============
	protected String nomeEvento;
	protected double valorBase;
	
	//============Construtor============
	public Ingresso(String nomeEvento, double valorBase) {
		super();
		this.nomeEvento = nomeEvento;
		this.valorBase = valorBase;
	}
	
	//============Metodos============
	public double calcularValorFinal() {
		return this.valorBase;
	}
	public void imprimirRecibo() {
		System.out.println("Nome evento = " + this.nomeEvento);
		System.out.println(this.calcularValorFinal());
	}
	
}
