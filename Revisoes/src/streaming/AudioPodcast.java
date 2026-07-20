package streaming;

public class AudioPodcast extends ConteudoMidia{

	private boolean modoEconomico;

	public AudioPodcast(String id, String titulo, double tamanhoBaseMb) {
		super(id, titulo, tamanhoBaseMb);
		this.modoEconomico = false;
	}
	@Override
	public void reproduzir(String tipoConexao) {
		if(tipoConexao.equals("4G")){
			this.modoEconomico = true;
		}
		super.incrementaVisualizacao();
		
		double consumo = 0;
		if(this.modoEconomico == true) {
			consumo = this.tamanhoBaseMb * 0.5;
		}
		
		System.out.println("Podcast" +this.titulo +" iniciado. Modo Econômico: "+ this.modoEconomico +".Consumo: "+ consumo + "MB. Total de views: " + this.contadorVisualizacao);
	}
}
