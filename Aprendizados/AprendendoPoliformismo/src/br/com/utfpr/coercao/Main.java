package br.com.utfpr.coercao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Veiculo veiculo = null;
		
		System.out.println("Escolha a opcao que deseja");
	
		System.out.println("1-Carro");
		System.out.println("2-Aviao");
		System.out.println("opcao:");
		int opcao = input.nextInt();
		
		switch(opcao) {
		case 1:
		veiculo = new Carro("Gol", "Volks", 2020, 5, "flex", 5);
		break;
		case 2:
		veiculo = new Aviao("A-213", "AirdBus", 1999, 800, "Combustivel de aviao", 4500);
		break;
		}
	
		veiculo.abastecer();
		
		if(veiculo instanceof Carro) {
			Carro carro = (Carro) veiculo;
			
			carro.calibrarPneus();
		}
		if(veiculo instanceof Aviao) {
			Aviao aviao = (Aviao) veiculo;
			
			aviao.voar();
		}
		
	}
}
