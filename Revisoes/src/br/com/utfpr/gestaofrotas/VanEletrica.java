package br.com.utfpr.gestaofrotas;

public class VanEletrica extends Veiculo{

	private int durabilidadaBateria;

	public VanEletrica(int id, String modelo, double capacidadeTanque, double consumoMedio, int durabilidadaBateria) {
		super(id, modelo, capacidadeTanque, consumoMedio);
		this.durabilidadaBateria = durabilidadaBateria;
	}
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Durabilidade da bateria = " + this.durabilidadaBateria);
	}
	
	@Override
	public double calcularAutonomiaMaxima() {
		double aut = (this.capacidadeTanque* this.consumoMedio) * this.durabilidadaBateria/100;
		return aut;
	}
	
	public void realizarManutencao() {
		System.out.println("Manutencao eletrica realizada com sucesso");
	}
}
