package linhasdeproducao;

public abstract class Dispositivo {

	protected String id;
	protected String nome;
	protected int nivelEnergia;
	
	public Dispositivo(String id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
		this.nivelEnergia = 100;
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public int getNivelEnergia() {
		return nivelEnergia;
	}
	
	public abstract void executarTarefa();
	
}
