package utfpr.edu.br.treino3;

public class Transporte {
	
	protected String modelo;
	protected String fabricante;
	protected int ano;
	protected String combustivel;
	
	public Transporte(String modelo, String fabricante, int ano, String combustivel) {
		
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
		this.combustivel = combustivel;
	}
	public void abastecer() {
		
		System.out.println(this.fabricante + this.modelo + " está abastecendo");
	}
	public String getModelo() {
		return modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public int getAno() {
		return ano;
	}
	public String getConbustivel() {
		return combustivel;
	}
	
	
	
}