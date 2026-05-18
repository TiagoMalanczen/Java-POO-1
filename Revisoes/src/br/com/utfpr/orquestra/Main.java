package br.com.utfpr.orquestra;

public class Main {

	
	public static void main(String[] args) {
		//=======Instanciando=======
		
		Musico 	tiago = new Musico("Tiago",  "Violino", 5 );
		Musico 	mateus = new Musico("Mateus", "Violoncelo", 7);
		Musico 	lucas = new Musico("Lucas", "Flauta", 3);
		
		Naipe cordas = new Naipe("Cordas");
		
		//=======Testando=======
		cordas.admitirMusicos(tiago);
		cordas.admitirMusicos(mateus);
		
		System.out.println("-------------");
		
		cordas.admitirMusicos(lucas);
		
		System.out.println("-------------");

		cordas.calcularExperiencia();
	}
}
