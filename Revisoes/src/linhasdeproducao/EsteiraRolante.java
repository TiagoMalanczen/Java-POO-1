package linhasdeproducao;

public class EsteiraRolante extends Dispositivo{

	private double velocidadeMetrosPorSegundo;

	public EsteiraRolante(String id, String nome, double velocidadeMetrosPorSegundo) {
		super(id, nome);
		this.velocidadeMetrosPorSegundo = velocidadeMetrosPorSegundo;
	}
	
	@Override
	public void executarTarefa() {
		if(this.nivelEnergia < 10) {
			System.out.println("Carga crítica. Esteira parada.");
		}
		else {
			this.nivelEnergia -= 10;
			System.out.println("Esteira"+ this.nome + " transportando materiais a " +this.velocidadeMetrosPorSegundo + " m/s. Energia restante: "+this.nivelEnergia + "%");
		}
	}
	
}
