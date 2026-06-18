package br.com.utfpr.gestaofrotas;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Veiculo> frota = new ArrayList<>();
		
		Caminhao caminhao = new Caminhao(1, "VolvoFH", 500,  3.5 , 10 );
		frota.add(caminhao);
		
		VanEletrica van = new VanEletrica(2, "Turbp",  80 ,  5 , 70);
		frota.add(van);
		
		for(Veiculo v : frota) {
			v.imprimirDados();
			System.out.println("=========");
			
			if(v instanceof VanEletrica  ) {
				VanEletrica vanEletrica = (VanEletrica) v;
				vanEletrica.realizarManutencao();
			}
		}
		
		

	}
}
