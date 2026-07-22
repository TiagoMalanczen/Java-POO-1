package espencionato;

import java.util.Locale;
import java.util.Scanner;

public class pensionato {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		Estudante [] quartos = new Estudante[9];
		
		for(int i = 0; i<n; i++) {
			
			System.out.println("Nome do estudante " + i);
			String nome = sc.nextLine();
			
			System.out.println("Email do estudante " + i);
			String email = sc.nextLine();
			
			System.out.println("quarto alocado do estudante " + i);
			int quarto = sc.nextInt();
			sc.nextLine();
			
			quartos[quarto] = new Estudante(nome, email);
			
		}
			for(int i = 0; i<9; i++) {
				if(quartos[i] != null) {
					System.out.println(i + " nome: " + quartos[i].getNome() + ", email:" +quartos[i].getEmail());
				}
			}
		sc.close();
	}
}
