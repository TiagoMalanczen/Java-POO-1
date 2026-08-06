package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("fone", "56789");
		
		cookies.remove("email");
		cookies.put("fone", "987654");

		System.out.println("Contem 'fone' : " + cookies.containsKey("fone"));
		System.out.println("Numero fone: " + cookies.get("fone"));
		System.out.println("Email: " + cookies.get("email"));
		
		
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}
