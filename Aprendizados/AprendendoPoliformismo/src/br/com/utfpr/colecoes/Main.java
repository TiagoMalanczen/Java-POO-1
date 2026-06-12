package br.com.utfpr.colecoes;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//===========Instanciando===========
		List<Produto> carrinho = new ArrayList<>();
		
		carrinho.add(new ProdutoFisico("Elden Ring Mídia Física", 250.0));		
		carrinho.add(new ProdutoDigital("Cyberpunk 2077 Digital", 150.0));
		
		//===========Testando===========
		double total = 0;
		for(Produto p: carrinho) {
				total += p.calcularPrecoFinal();
		}
		System.out.println("Preco do carrinho = " + total);
	}
}
