package br.com.utfpr.exercicio2;

public class Boleto extends FormaPagamento{
	//===========Atributos===========
	private String dataVencimento;
	private int codigoBarras;

	//===========Construtor===========
	public Boleto(double valorToral, String dataVencimento, int codigoBarras) {
		super(valorToral);
		this.dataVencimento = dataVencimento;
		this.codigoBarras = codigoBarras;
	}
	
	//===========Metodos===========
	@Override
	public void efetuarPagamento() {
		System.out.println("Pagamento por boleto realizado com sucesso  no valor de " + this.valorToral+  " , data de vencimento " + this.dataVencimento+" e codigo de barras " + this.codigoBarras);
	}
}
