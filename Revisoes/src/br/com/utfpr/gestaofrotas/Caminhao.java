package br.com.utfpr.gestaofrotas;

public class Caminhao extends Veiculo{

	private double pesoCarga;//em T

	public Caminhao(int id, String modelo, double capacidadeTanque, double consumoMedio, double pesoCarga) {
		super(id, modelo, capacidadeTanque, consumoMedio);
		this.pesoCarga = pesoCarga;
	}
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Peso carga = " + this.pesoCarga);
	}
	@Override
	public double calcularAutonomiaMaxima() {
		int pesoCargaInt = (int)this.pesoCarga;
		double perca = pesoCargaInt*0.05 ;
		return this.capacidadeTanque*this.consumoMedio - perca;
	}
}
