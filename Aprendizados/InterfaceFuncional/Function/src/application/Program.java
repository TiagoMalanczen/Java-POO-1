package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;
 import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 1500.0));
		list.add(new Product("Mouse", 500.0));
		list.add(new Product("Teclado", 750.0));

		List<String > names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		list.forEach(System.out::println);
		
		names.forEach(System.out:: println);
	}
}
