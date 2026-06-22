package br.com.utfpr.revisaoprova1;

import java.util.ArrayList;
import java.util.List;

public class Loja {

	private List<Jogo> jogos;
	
	public Loja() {
		this.jogos = new ArrayList<>();
	}
	
	public void adicionarJogo(Jogo j ) {
		this.jogos.add(j);
	}
	
	public void relatorioCatalogo() {
		for(Jogo j: this.jogos) {
			j.exibirDados();
			System.out.println("====================");
		}
	}
	
	public void aplicarManutencaoDigital() {
		for(Jogo j : this.jogos) {
			if(j instanceof JogoDigital) {
				JogoDigital digital = (JogoDigital) j;
				
				System.out.println("Jogo digital " + digital.titulo + " vereficado nos servidores");
			}
		}
	}
}
