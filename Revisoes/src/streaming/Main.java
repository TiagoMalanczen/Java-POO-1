package streaming;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Video video = new Video("V-10", "Interstellar",2000.0);
		AudioPodcast audioPodcast = new AudioPodcast("P-05", "Tech Talk", 80.0);
		
		List<ConteudoMidia> lista = new ArrayList<>();
		
		lista.add(video);
		lista.add(audioPodcast);
		
		for(ConteudoMidia cont : lista) {
			cont.reproduzir("4G");
			System.out.println();
		}
	}
}
