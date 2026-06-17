package br.com.utfpr.coercao;

public class Coercao {

	public static void main(String[] args) {
		
		//Corcao explicita
		float w = (float) 12.34;
		int x = (int) 56.78;
		
		//Corcao implicita
		double y = 10;
		int z = 'z';
		
		System.out.println(w);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
	}
}
