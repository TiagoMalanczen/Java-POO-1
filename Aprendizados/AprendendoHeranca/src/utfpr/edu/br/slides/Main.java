package utfpr.edu.br.slides;


	public class Main {
		public static void main(String[] args) {
			
			//===========Instanciando===========
			Professor professor1 = new Professor(111, "Joao da Silva", "01/02/2003", 5000.00);
			
			Coordenador coordenador1 = new Coordenador(222, "Maria de Oliveira ", "10/10/2010", 5000.00, 2000.00);
			//===========Testando===========
			professor1.imprimirDados();
			professor1.lancarfrequencia();
			professor1.aplicarAvalicao();
			

			System.out.println("=============");
			
			coordenador1.imprimirDadosCordenador();
			coordenador1.lancarfrequencia();
			coordenador1.aplicarAvalicao();
			coordenador1.analisarPedidoSegundaChamada();
			coordenador1.analisarPedidoSuficiencia();
			
			
		}
	
}
