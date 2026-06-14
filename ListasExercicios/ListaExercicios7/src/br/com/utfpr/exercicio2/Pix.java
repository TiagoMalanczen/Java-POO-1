package br.com.utfpr.exercicio2;

public class Pix extends FormaPagamento{

	//===========Atributos===========
	private String chavePix;
	private String nomeDestinatario;

	//===========Construtor===========
	public Pix(double valorToral, String chavePix, String nomeDestinatario) {
		super(valorToral);
		this.chavePix = chavePix;
		this.nomeDestinatario = nomeDestinatario;
	}
	
	//===========Metodos===========

	@Override
	public void efetuarPagamento(){
		System.out.println("Pagamento por pix realizado com sucesso no valor de " + this.valorToral+ "  pela chave " + this.chavePix+  " e pelo destinataio " +this.nomeDestinatario);
	}
}
