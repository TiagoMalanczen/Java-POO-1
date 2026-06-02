package utfpr.edu.br.treino3;

public class Aviao extends Transporte {

	private double altitudeMax;
	
	public Aviao(String modelo, String fabricante, int ano, String combustivel) {
		
		super(modelo, fabricante, ano, combustivel);
		this.altitudeMax = 0.0;
	}
	public void voar() {
		System.out.println(getFabricante() + getModelo() + " está voando");
	}
	
}