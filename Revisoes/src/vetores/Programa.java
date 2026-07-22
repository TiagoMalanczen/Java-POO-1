package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Pessoa [] vect = new Pessoa[n];
		
		for(int i = 0; i<n; i++) {
			
			System.out.println("Altura da pessoa em cm da pessoa " + i);
			double altura = sc.nextDouble();
			
			sc.nextLine();
			
			System.out.println("Genero da pessoa (F/M) " + i);
			String genero = sc.nextLine();

			 vect[i] = new Pessoa(altura , genero); 
			
		}
		double maior = vect[0].getAltura();
		double menor = vect[0].getAltura();
		
		for(int i = 0; i<n;i++) {
			if(vect[i].getAltura() > maior) {
				maior = vect[i].getAltura();
			}
			if(vect[i].getAltura() < menor) {
				menor = vect[i].getAltura();
			}
		}
		
		int quantidadeHomens = 0;
		int quantidadeMulheres= 0;
		double mediaMulher = 0;
		
		for(int i = 0; i<n; i++) {
			if(vect[i].getGenero().equals("M")) {
				quantidadeHomens++;
			}
			else {
				quantidadeMulheres++;
				mediaMulher += vect[i].getAltura();
			}
		}
		
		System.out.println("Menor = " + menor);
		System.out.println("Maior = " + maior);
		System.out.println("Quantidade homens " + quantidadeHomens);
		System.out.println("Quantidade homens " + quantidadeMulheres);
		System.out.println("Media das mulheres " + mediaMulher/quantidadeMulheres);
		
		sc.close();
	}
}
