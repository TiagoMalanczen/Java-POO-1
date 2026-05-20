package utfpr.edu.br.slides;

public class Coordenador extends Professor{
	
	//===========Atributos===========
		private double adicionalSalario;


		//===========Construtor===========
		public Coordenador(int numeroRegistro, String nome, String dataNomeacao, double salario, double adicionalSalario) {
			super(numeroRegistro, nome, dataNomeacao, salario);
			
			this.adicionalSalario = adicionalSalario;
		}
		
		//===========Metodos===========
		public void analisarPedidoSegundaChamada() {
			
			System.out.println( super.nome + " esta analisando pedidos de segunda chamada");
		
		}
		
		public void analisarPedidoSuficiencia() {
			
			System.out.println( super.nome + " esta analisando pedidos de suficiencia");
			
		}
		
		public void partiviparReunioesDirecao() {
		
		System.out.println( super.nome + " esta participando de treunioes da direcao");
		
		}
		
		public void imprimirDadosCordenador() {
			
			super.imprimirDados();
			System.out.println("Salario adicional = "+ this.adicionalSalario);
			System.out.println("Salario total = "+ this.calcularSalario());
			
		}
		public double calcularSalario() {
			return this.adicionalSalario + this.salario;
		}
}


