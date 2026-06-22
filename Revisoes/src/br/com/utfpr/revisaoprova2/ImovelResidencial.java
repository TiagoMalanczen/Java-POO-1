package br.com.utfpr.revisaoprova2;

public class ImovelResidencial extends Imovel{

	private double gastoCondominio;

	public ImovelResidencial(int id, String endereco, double valorAluguel, double gastoCondominio) {
		super(id, endereco, valorAluguel);
		gastoCondominio = gastoCondominio;
	}
	
	@Override
	public double calcularLocacao() {
		return this.valorAluguel + this.gastoCondominio;
	}
	
	@Override 
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Gasto condominio = " + this.gastoCondominio);
	}
	
}
