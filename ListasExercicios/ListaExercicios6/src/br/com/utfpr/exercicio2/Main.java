package br.com.utfpr.exercicio2;

public class Main {
	public static void main(String[] args) {
		//===========Instanciando===========
		Colaborador colaborador = new Colaborador("Silva", "Rua A, 123", "01/01/2026");
		Funcionario funcionario = new Funcionario("Ana", "Av. B, 456", "15/02/2026", "Suporte Dev", 1200.00);
		Prestador prestador = new Prestador("Tech Solutions", "Rua C, 789", "10/03/2026","Consultoria", 150.00);
		Empregado empregado = new Empregado("Carlos", "Rua D, 101", "20/04/2026", "Desenvolvedor", 5500.00, 123456);
		Estagiario estagiario = new Estagiario("Lucas", "Av. E, 202", "01/05/2026", "Estagiário TI", 1000.00, 78910);
		Empresa empresa = new Empresa("DevCorp", "Rua F, 303", "12/05/2026", "Fábrica de Software", 120.00, 12345678000199L);
		Autonomo autonomo = new Autonomo("Pedro", "Rua G, 404", "18/05/2026", "Arquiteto Java", 95.50, 11122233344L);
		
		//===========Testando===========
		colaborador.exibirDados();
		System.out.println("----------");
		funcionario.exibirDados();
		System.out.println("----------");
		prestador.exibirDados();
		System.out.println("----------");
		empregado.exibirDados();
		System.out.println("----------");
		estagiario.exibirDados();
		System.out.println("----------");
		empresa.exibirDados();
		System.out.println("----------");
		autonomo.exibirDados();
		
	}
}
