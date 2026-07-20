package streaming;

public class Video extends ConteudoMidia{

	private String qualidadeAtual;
	
	public Video(String id, String titulo, double tamanhoBaseMb) {
		super(id, titulo, tamanhoBaseMb);
		this.qualidadeAtual = "SD";
	}
	
	@Override
	public void reproduzir(String tipoConexao) {
		if(tipoConexao.equals("4G") && this.qualidadeAtual.equals("4K")){
			System.out.println(this.titulo + " Reprodução bloqueada. Reduza a qualidade para assistir em conexões móveis.");
			return;
		}
		if((tipoConexao.equals("Wi-Fi") || tipoConexao.equals("5G")) &&  this.qualidadeAtual.equals("SD")){
			System.out.println(this.titulo + ": Otimizando qualidade para HD.");
			return;
		}
		
		super.incrementaVisualizacao();
		double calculo = 0;
		if(this.qualidadeAtual.equals("4K")) {
			calculo = this.tamanhoBaseMb * 2;
		}
		if(this.qualidadeAtual.equals("HD")) {
			calculo = this.tamanhoBaseMb * 1.5;
		}
			
		System.out.println(this.titulo + "reproduzido em " + this.qualidadeAtual + ". Dados consumidos: " + calculo + " MB. Total de views: " + this.contadorVisualizacao);	
	}
}
