package chessrating;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Jogador> jogadores = new ArrayList<>();
		
		JogadorComum jogadorComum = new JogadorComum("C1", "Capablanca");
		JogadorPremium JogadorPremium = new JogadorPremium("P1", "Kasparov", 49.90);
		
		jogadores.add(jogadorComum);
		jogadores.add(JogadorPremium);
		
		for(Jogador j: jogadores) {
			System.out.println(j.getUsername());
			System.out.println(j.getRating());
		}
		
		jogadorComum.registrarResultado(1, 1200);
		JogadorPremium.registrarResultado(1, 1200);
		
		for(Jogador j: jogadores) {
			System.out.println(j.getUsername());
			System.out.println(j.getRating());
		}
	}
}
