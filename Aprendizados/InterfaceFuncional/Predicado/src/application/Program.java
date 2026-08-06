package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 1500.0));
		list.add(new Product("Mouse", 500.0));
		list.add(new Product("Teclado", 750.0));
		
		list.removeIf(new ProductPredicate());
		
		for(Product p: list) {
			System.out.println(p);
		}

	}
}
