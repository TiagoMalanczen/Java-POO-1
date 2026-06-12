package br.com.utfpr.poliformismobasico;

public class NotificacaoEmail extends Notificacao{
	
	
	public NotificacaoEmail(String destinario) {
		super(destinario);
	}

	@Override
	public void enviar(String mensagem) {
		 System.out.println("Enviando email para " + this.destinario);
		 System.out.println(mensagem);
	}
	
}
