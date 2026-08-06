package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "Maria@gmail.com");
		Client c2 = new Client("Joao", "Joao@gmail.com");
		Client c3 = new Client("Joao", "Joao@gmail.com");
	
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.equals(c2));
		System.out.println(c2 == c3);
	}
}
