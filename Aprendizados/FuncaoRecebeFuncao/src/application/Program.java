package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductService;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 1500.0));
		list.add(new Product("Mouse", 500.0));
		list.add(new Product("Teclado", 750.0));
		
		ProductService pS = new ProductService();
		
		double sum = pS.filterSum(list, p -> p .getName().charAt(0) == 'T');
		
		System.out.println("Sum = " + String.format("%.2f", sum));
		
	}
}
