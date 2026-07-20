package linhasdeproducao;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		BracoRobotico bracoRobotico = new BracoRobotico("1", "braco", 15.50);
		EsteiraRolante esteiraRolante = new EsteiraRolante("2", "esteira", 14.20);
		
		List<Dispositivo> lista = new ArrayList<>();
		
		lista.add(esteiraRolante);
		lista.add(bracoRobotico);
		
		for(Dispositivo dis : lista) {
			dis.executarTarefa();
			System.out.println();
		}
		
		for(Dispositivo dis : lista) {
			dis.executarTarefa();
			System.out.println();
		}
		
	}
}
