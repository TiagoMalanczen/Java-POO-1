package br.com.utfpr.coercao;

public class Veiculo {

	
	protected String modelo;
	protected String fabricante;
	protected int ano;
	protected int numeroPassageiros;
	protected String combustivel;
	
	public Veiculo(String modelo, String fabricante, int ano, int numeroPassageiros, String combustivel) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
		this.numeroPassageiros = numeroPassageiros;
		this.combustivel = combustivel;
	}
	
	public void abastecer() {
		System.out.println(this.modelo + " esta abastecendo");
	}
	
}
