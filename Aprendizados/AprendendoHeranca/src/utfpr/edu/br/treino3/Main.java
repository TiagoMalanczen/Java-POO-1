
package utfpr.edu.br.treino3;
public class Main  {
	public static void main(String[] args) {
		
		Aviao a1 = new Aviao("SLA", "CHORSE", 1002, "Diesel");
		Carro c1 = new Carro("Civic", "Honda", 1005, "Gasosa");
		
		a1.abastecer();
		a1.voar();
		System.out.println();
		c1.abastecer();
		c1.calibrarPneus();
	}
}