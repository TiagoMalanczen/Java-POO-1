package utfpr.edu.br.treino3;

public class Carro extends Transporte{

	private int numPortas;
	
	public Carro(String modelo, String fabricante, int ano, String conbustivel) {
		super(modelo, fabricante, ano, conbustivel);
		this.numPortas = 0;
	}
	public void calibrarPneus() {
		System.out.println(getFabricante() + getModelo() + " está calibrando os pneus");
	}

}