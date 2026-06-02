package br.com.utfpr.luthieriatech;

public class Main {

	public static void main(String[] args) {
		
		//=============Instanciando=============
		Pedido pedido = new Pedido(101);
		
		Produto produto1 = new Produto(1, "Violão Tagima", 1200.0);

		Produto produto2 = new Produto(2, "Encordoamento D'Addario", 85.0);

		Produto produto3 = new Produto(3, "Palheta Corrompida", -5.0);
		
		//=============Testando=============
		
		pedido.adicionarProduto(produto1);
		pedido.adicionarProduto(produto2);
		pedido.adicionarProduto(produto3);
		
		System.out.println();
		
		System.out.println(pedido.calcularTotal());
		
		System.out.println(pedido.contarProdutosAcimaDe(500.00));
	}
}
