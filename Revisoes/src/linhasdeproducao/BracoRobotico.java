package linhasdeproducao;

public class BracoRobotico extends Dispositivo{

	private double precisaoMilimetros;

	public BracoRobotico(String id, String nome, double precisaoMilimetros) {
		super(id, nome);
		this.precisaoMilimetros = precisaoMilimetros;
	}
	
	@Override 
	public void executarTarefa() {
		if(this.nivelEnergia < 15) {
			System.out.println("Energia insuficiente para operar o braco robotico");
		}
		else {
			this.nivelEnergia -= 15;
			System.out.println("Braco robotico " +this.nome +" operando com presicao de " + this.precisaoMilimetros +"mm . Energia restante em "  + this.nivelEnergia + "%");
		}
	}
}
