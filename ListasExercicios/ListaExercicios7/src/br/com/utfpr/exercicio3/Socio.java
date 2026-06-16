package br.com.utfpr.exercicio3;

public class Socio extends Cliente{
	//===========Atributos===========
		private String cpf;
		private Dependente dependente;
		
	//===========Construtor===========
		public Socio(String nome, String dataNascimento, String telefone, Endereco endereco, String cpf) {
			super(nome, dataNascimento, telefone, endereco);
			this.cpf = cpf;
			this.dependente = null;
		}
		
	//===========Metodos===========
	public void atribuirDependente(Dependente dep) {
		this.dependente = dep;
	}
		
}
