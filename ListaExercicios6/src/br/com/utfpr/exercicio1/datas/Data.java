package br.com.utfpr.exercicio1.datas;

public class Data {
	//===========Atributos===========
	protected int dia;
	protected int mes;
	protected int ano;
	
	//===========Construtor===========
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data( int mes, int ano) {
		this(1 ,mes,ano);
		this.mes = mes;
		this.ano = ano;
	}
	public Data( int dia) {
		this(dia ,1, 2000);
		this.dia = dia;
	}
	
	public Data() {
		this(1,1,2000);
	}
	 //===========Metodos===========
	public String exibirData() {
		
		return this.dia+"/"+this.mes+"/"+this.ano;
	}
	
}
