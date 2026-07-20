package streaming;

public abstract class ConteudoMidia {

	protected String id;
	protected String titulo;
	protected double tamanhoBaseMb;
	protected int contadorVisualizacao;
	
	public ConteudoMidia(String id, String titulo, double tamanhoBaseMb) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.tamanhoBaseMb = tamanhoBaseMb;
	}

	public String getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getTamanhoBaseMb() {
		return tamanhoBaseMb;
	}

	public int getContadorVisualizacao() {
		return contadorVisualizacao;
	}

	public final void incrementaVisualizacao() {
		this.contadorVisualizacao += 1;
	}
	public abstract void reproduzir(String tipoConexao);
}
