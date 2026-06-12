package br.com.utfpr.frete;

public class FreteEconomico extends Frete{

	//===========Construtor===========
	public FreteEconomico(double distanciaKM, double pesoKg) {
		super(distanciaKM, pesoKg);
	}

	//===========Metodos===========
	@Override
	public double calcularFrete() {
		return this.distanciaKM * 0.5 + this.pesoKg * 0.8;
	}
}
