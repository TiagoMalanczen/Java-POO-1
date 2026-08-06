package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
	 
		list.add(new Product("C", 150.00));
		list.add(new Product("A", 1000.00));
		list.add(new Product("B", 700.00));
		
		Comparator<Product> comp = new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};
		list.sort(comp);
		
		for(Product p: list) {
			System.out.println(p);
		}
		
	}
}
