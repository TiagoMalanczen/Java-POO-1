package br.com.utfpr.exercicio1.datas;

public class Main {
	public static void main(String[] args) {
		//===========Intanciando===========
		Data data1 = new Data(5, 8, 2007);
		Data data2 = new Data(10, 2015);
		Data data3 = new Data(18);
		Data data4 = new Data();
		
		Feriado feriado1 = new Feriado();
		Feriado feriado2 = new Feriado("Pascoa");
		Feriado feriado3 = new Feriado(7, 8 ,2018, "Natal");
		
		//===========Testando=========== 
		System.out.println(data1.exibirData());
		System.out.println(data2.exibirData());
		System.out.println(data3.exibirData());
		System.out.println(data4.exibirData());
		
		System.out.println();
		
		System.out.println(feriado1.exibirData());
		System.out.println(feriado2.exibirData());
		System.out.println(feriado3.exibirData());
		
	}
}
