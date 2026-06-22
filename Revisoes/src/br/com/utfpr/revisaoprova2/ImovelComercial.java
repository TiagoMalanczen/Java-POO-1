package br.com.utfpr.revisaoprova2;

public class ImovelComercial extends Imovel{

	private double taxaEscritorio;

	public ImovelComercial(int id, String endereco, double valorAluguel) {
		super(id, endereco, valorAluguel);
		this.taxaEscritorio = 150.00;
	}

	public ImovelComercial(int id, String endereco, double valorAluguel, double taxaEscritorio) {
		super(id, endereco, valorAluguel);
		this.taxaEscritorio = taxaEscritorio;
	}
	
	@Override
	public double calcularLocacao() {
		return this.valorAluguel + this.taxaEscritorio;
	}
	
	@Override 
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Taxa de escritorio = " + this.taxaEscritorio);
	}
}
