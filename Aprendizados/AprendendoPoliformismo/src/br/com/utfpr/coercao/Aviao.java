package br.com.utfpr.coercao;

public class Aviao extends Veiculo{

	private int alturaMaxima;

	public Aviao(String modelo, String fabricante, int ano, int numeroPassageiros, String combustivel,
			int alturaMaxima) {
		super(modelo, fabricante, ano, numeroPassageiros, combustivel);
		this.alturaMaxima = alturaMaxima;
	}
	
	public void voar() {
		System.out.println(this.modelo + " esta voando");
	}
}
