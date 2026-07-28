package composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter clinte data");
		
		System.out.print("Name:");
		String name = sc.nextLine();
		System.out.print("Email:");
		String email = sc.nextLine();
		System.out.print("Date: dd/MM/yyyy");
		Date date = sdf.parse(sc.next());
		
		Client client = new Client(name, email, date);	
		
		System.out.println("Enter order data");
		System.out.print("Status:");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many item to this order");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.print("Product name:");
			sc.nextLine();
			String name_product = sc.nextLine();
			System.out.print("Product priece:");
			double priece_product = sc.nextDouble();
			System.out.print("Quantity:");
			int quantity_product = sc.nextInt();
			
			Product product = new Product(name_product, priece_product);
			
			OrderItem orderItem = new OrderItem(quantity_product, priece_product, product);
			
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println(order.toString());
		sc.close();
		
	}
}
