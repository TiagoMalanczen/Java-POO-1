package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxServices;
import model.services.RentalServices;

public class Program {

	public static void main(String[] args) {
		 
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do aluguel");
		System.out.println("Modelo do carro");
		String carModel = sc.nextLine();
		System.out.println("Hora da retirada");
 		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
 		System.out.println("Retorno");
 		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
 		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
 		
 		System.out.println("Entre com o preco por hora");
 		Double pricePerHour = sc.nextDouble();
 		System.out.println("Entre com o preco por dia");
 		Double pricePerDay = sc.nextDouble();
 		
 		RentalServices rentalServices = new RentalServices(pricePerDay, pricePerHour, new BrazilTaxServices());
 		
 		rentalServices.processInvoiece(cr);
 		
 		System.out.println("FATURA: ");
 		System.out.println("Pagamento basico " + cr.getInvoice().getBasicPayment());
 		System.out.println("Imposto: " + cr.getInvoice().getTax());
 		System.out.println("Pagamento total " + cr.getInvoice().getTotalPayment());
 		sc.close();
	}
}
