package br.com.utfpr.gestaofrotas;

public abstract class Veiculo {

	protected int id;
	protected String modelo;
	protected double capacidadeTanque;
	protected double consumoMedio;
	
	public Veiculo(int id, String modelo, double capacidadeTanque, double consumoMedio) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
		this.consumoMedio = consumoMedio;
	}
	
	public abstract double calcularAutonomiaMaxima();
	
	public void imprimirDados() {
		System.out.println("Id = " + this.id);
		System.out.println("Modelo= " + this.modelo);
		System.out.println("Capacidade tanque = " + this.capacidadeTanque);
		System.out.println("Consumo medio = " + this.consumoMedio);
	}

	
	public void abastecer(double litros) {
		System.out.println("Abastecendo com " + litros + " o automovel");
	}
	public void abastecer(double quantiade, String tipoEnergia) {
		if(tipoEnergia.contentEquals("Eletrecidade")) {
			System.out.println("Baterria recarregada " + quantiade + "kWh");
		}
		else {
			System.out.println("Recarregado com sucesso com combustivel fossil");
		}
	}
	
	public void abastecer(double litros, boolean cupomDesconto) {
		if(cupomDesconto == true) {
			System.out.println("Valor de desconto de 10%");
		}
		System.out.println("Abastecendo com " + litros + " o automovel");
	}
	
}
