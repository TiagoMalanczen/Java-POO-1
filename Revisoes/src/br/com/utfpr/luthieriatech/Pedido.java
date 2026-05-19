package br.com.utfpr.luthieriatech;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	//=============Atributos=============
	private int numeroPedido;
	
	private List<Produto> itens;

	//=============Construtor=============
	public Pedido(int numeroPedido ) {
		
		this.numeroPedido = numeroPedido;
		this.itens = new ArrayList<>();
	}
	
	//=============Metodos=============
	public void adicionarProduto(Produto produto) {
		if(produto.getPreco() <=0) {
			System.out.println("Preco invalido");
		}
		else {
			this.itens.add(produto);
			System.out.println("Produto adicionado com sucesso");
		}
	}
	
	public double calcularTotal() {
		double total = 0;
		for(Produto produto : itens) {
			total += produto.getPreco();
		}
		return total;
	}
	public int contarProdutosAcimaDe(double valorLimite) {
		int produtosAcimaDe = 0;
		for(Produto produto : itens) {
			if(produto.getPreco() > valorLimite) {
				produtosAcimaDe ++;
			}
		}
		return produtosAcimaDe;
	}
}
