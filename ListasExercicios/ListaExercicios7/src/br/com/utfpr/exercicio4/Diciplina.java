package br.com.utfpr.exercicio4;

public class Diciplina {

	//===========Atributos===========
	private int codigo;
	private String nomeDiciplina;
	private String emenda;
	private int horas;
	
	//===========Metodos===========
	public Diciplina(int codigo, String nomeDiciplina, String emenda, int horas) {
		super();
		this.codigo = codigo;
		this.nomeDiciplina = nomeDiciplina;
		this.emenda = emenda;
		this.horas = horas;
	}
	
	//===========Getters===========
	public int getCodigo() {
		return codigo;
	}

	public String getNomeDiciplina() {
		return nomeDiciplina;
	}

	public String getEmenda() {
		return emenda;
	}

	public int getHoras() {
		return horas;
	}
	
}
