package utfpr.edu.br.treino2;

public class IngressoVip extends Ingresso{
	//============Atributos============
	private double valorAdicional;

	//============Construtor============
	public IngressoVip(String nomeEvento, double valorBase, double valorAdicional) {
		super(nomeEvento, valorBase);
		this.valorAdicional = valorAdicional;
	}
	
	//============Metodos============
	public double calcularValorFinal() {
		return super.calcularValorFinal() + this.valorAdicional;
	}
	
	public void imprimirRecibo() {
		super.imprimirRecibo();
		System.out.println("Valor adicional = "+ this.valorAdicional);
	}
}
