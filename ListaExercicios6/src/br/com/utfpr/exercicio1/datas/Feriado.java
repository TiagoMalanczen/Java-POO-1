package br.com.utfpr.exercicio1.datas;

public class Feriado extends Data{
	//===========Atributos===========
	private String descricao;
	//===========Construtor===========
	public Feriado() {
		super();
		this.descricao = "Feriado";
	}
	public Feriado(String descricao) {
		super();
		this.descricao = descricao;
	}
	public Feriado(int dia, int mes, int ano, String descricao) {
		super(dia,mes,ano);
		this.descricao = descricao;
	}
	//===========Metodos===========
	public String exibirData() {
		return super.exibirData()+"/"+this.descricao;
	}
}

