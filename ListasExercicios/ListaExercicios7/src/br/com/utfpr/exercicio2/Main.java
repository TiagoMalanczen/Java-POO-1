package br.com.utfpr.exercicio2;

public class Main {

	public static void main(String[] args) {
		//===========Instanciando===========
		FormaPagamento formaPagamento = null;
		
		int opcao = 1;
		switch (opcao) {
		case 1:
			formaPagamento = new Pix(140.40, "234323" , "Jaime");
		break;
		case 2 :
		formaPagamento = new Boleto(149.30, "12/10", 323433);
			break;
		case 3:
			formaPagamento = new CartaoCredito(200.30, "2344430", "Maria" , "19/03", "asdvna2");
		break;
		}
		
		//===========Testando===========
		formaPagamento.efetuarPagamento();
	}
}
