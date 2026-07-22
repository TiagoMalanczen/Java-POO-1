package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println();
		System.out.println("Quantas pessoas serao registradas ?" );
		int quantidadePessoas = sc.nextInt();
		sc.nextLine();
		List<Funcionario> funcionarios = new ArrayList<>();
		
		for(int i = 0; i<quantidadePessoas; i++) {
			
			System.out.println("Nome");
			String nome = sc.nextLine();
			
			System.out.println("Id");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Salario");
			double salario = sc.nextDouble();
			sc.nextLine();

			Funcionario func = new Funcionario(id,nome,salario);
			funcionarios.add(func);
			
		}
		System.out.println("Funcionario que deseja aumentar salario(id)");
		int idChamado = sc.nextInt();
		
		Funcionario procurado = funcionarios.stream().filter(x -> x.getId() == idChamado).findFirst().orElse(null);
		
		System.out.println(procurado);
		
		sc.close();
	}
}
