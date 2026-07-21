package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Produtos[] vect = new Produtos[n];
		double som = 0;
		
		for(int i = 0 ; i<n;i++) {
			sc.nextLine();
			String name  = sc.nextLine();
			double preco = sc.nextDouble();
			
			vect[i]  = new Produtos(name, preco);
			som += vect[i].getPreco();
		}
		 
		double avg = som/n;
		
		System.out.println(avg);
		
		
		sc.close();
	}
}
