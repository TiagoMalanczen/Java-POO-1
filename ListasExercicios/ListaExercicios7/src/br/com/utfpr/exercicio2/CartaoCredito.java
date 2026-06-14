package br.com.utfpr.exercicio2;

public class CartaoCredito extends FormaPagamento{
	//===========Atributos===========
	private String numeroCartao;
	private String nomeTitular;
	private String dataValidade;
	private String codigoSeguranca;

	//===========Construtor===========
	public CartaoCredito(double valorToral, String numeroCartao, String nomeTitular, String dataValidade,
			String codigoSeguranca) {
		super(valorToral);
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.dataValidade = dataValidade;
		this.codigoSeguranca = codigoSeguranca;
	}	
	
	//===========Metodos===========
	@Override
	public void efetuarPagamento() {
		System.out.println("Pegamento por cartao de credito realizado com sucesso no valor de " + this.valorToral+" , numero cartao " + this.numeroCartao + " nome do Titual "
							+ this.nomeTitular+ " data de validade "
							+ this.dataValidade+ " codigo de seguranca " + this.codigoSeguranca);
	}

}

