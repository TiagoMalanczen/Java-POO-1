package utfpr.edu.br.treino2;

public class Main {

	public static void main(String[] args) {
		//============Instanciando============
		Ingresso ingresso1 = new Ingresso("Chapada" , 50.00);
		
		IngressoVip ingressovip1 = new IngressoVip("Praca", 70.00, 80.00);
		
		//============Testando============
		ingresso1.imprimirRecibo();
		System.out.println();
		ingressovip1.imprimirRecibo();
	}
}
