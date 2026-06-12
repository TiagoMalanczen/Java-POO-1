package br.com.utfpr.poliformismobasico;

public class NotificacaoSMS extends Notificacao{
	
	public NotificacaoSMS(String destinario) {
		super(destinario);
	}
	
	public void enviar(String mensagem) {
		System.out.println("Enviando SMS para destinatario " + this.destinario);
		 System.out.println(mensagem);

	}
}
