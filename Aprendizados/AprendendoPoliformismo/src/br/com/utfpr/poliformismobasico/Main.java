package br.com.utfpr.poliformismobasico;

public class Main {
	
public static void main(String[] args) {
		//===========Instanciando===========
	
		NotificacaoEmail email = new NotificacaoEmail("Jair");
			
		//===========Testando===========
		email.enviar("A entrega foi realizada");
}
}
