package utfpr.edu.br.ex2;

public class Endereco {

	//===========Atributos===========
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String unidadeFederativa;

	//===========Construtor===========
		public Endereco(String logradouro, int numero, String bairro, String cidade, String unidadeFederativa) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.unidadeFederativa = unidadeFederativa;
	}

	//===========Getters===========
		public String getLogradouro() {
			return logradouro;
		}

		public int getNumero() {
			return numero;
		}

		public String getBairro() {
			return bairro;
		}

		public String getCidade() {
			return cidade;
		}

		public String getUnidadeFederativa() {
			return unidadeFederativa;
		}


}
