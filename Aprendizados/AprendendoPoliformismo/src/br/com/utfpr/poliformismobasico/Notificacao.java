package br.com.utfpr.poliformismobasico;

public abstract class Notificacao {
	
	protected String destinario;
	
	
	public Notificacao(String destinario) {
		
		this.destinario = destinario;
	}


	public abstract void enviar(String mensagem);

}
