package br.com.utfpr.orquestra;

import java.util.ArrayList;
import java.util.List;

public class Naipe {

	
	//=======Atributos=======
	private String nomeNaipe;
	
	private List<Musico> integrantes;


	//=======Construtor=======
		public Naipe(String nomeNaipe) {
		
		this.nomeNaipe = nomeNaipe;
		this.integrantes = new ArrayList<>();
	}
	
	//=======Metodos=======
		
	public void admitirMusicos(Musico musico) {
		if(this.nomeNaipe.equals("Cordas")) {
			if(musico.getInstrumento().equals("Violino") || musico.getInstrumento().equals("Violoncelo")) {
				System.out.println("Musico adicionado a lista de integrantes");
				this.integrantes.add(musico);
			}
			else {
				System.out.println("Intrumento nao permitido");
			}
		}
		
	}
	public double calcularExperiencia() {

		double som = 0;
		for(Musico mus: integrantes) {

			som += mus.getAnosExperiencia();
		}
		System.out.println("Total de musicos = " + this.integrantes.size() + " media de experiencia = " + som/this.integrantes.size());
		return som/this.integrantes.size();
	}

}
