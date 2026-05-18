package br.com.utfpr.orquestra;

public class Musico {

	//=======Atributos=======
	private String nome;
	private String instrumento;
	private int anosExperiencia;
	
	//=======Construtor=======
	public Musico(String nome, String instrumento, int anosExperiencia) {
		
		this.nome = nome;
		this.instrumento = instrumento;
		this.anosExperiencia = anosExperiencia;
	}

	
	//=======Getters=======
	public String getNome() {
		return nome;
	}

	public String getInstrumento() {
		return instrumento;
	}

	public int getAnosExperiencia() {
		return anosExperiencia;
	}

	
	
}
