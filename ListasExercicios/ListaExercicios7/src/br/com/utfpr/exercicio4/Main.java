package br.com.utfpr.exercicio4;

public class Main {

	public static void main(String[] args) {
		
		//===========Instanciando===========
		Diciplina matematica = new Diciplina(123, "Matematica", "234", 60);
		Processos lavagemDinheiro = new Processos(456, "12/12", "processo de lavagem de dinheiro");
		
		Professor mauro = new Professor("324v", "Mauro", 5000.00, Titulacao.MESTRE, "15/08");
		TecnicoAdministrativo josemar = new TecnicoAdministrativo("35324", "Josemar", 4000.00, "20/07", 1500.00);
		
		//===========Testando===========
		mauro.receberNovasDiciplinas(matematica);
		mauro.imprimirDados();
		
		System.out.println("=================");
		
		josemar.atribuirProcesso(lavagemDinheiro);
		josemar.imprimirDados();
	}
}
