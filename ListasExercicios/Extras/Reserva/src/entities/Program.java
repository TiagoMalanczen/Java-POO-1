package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.appilication.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Room number:");
			int number = sc.nextInt();
			System.out.println("Checkin date:");
			Date checkin = sdf.parse(sc.next());
			System.out.println("Checkout date:");
			Date checkout = sdf.parse(sc.next());
			
			Reservation reservation = new Reservation(number, checkin, checkout);
			System.out.println("Reservation: " + reservation);
	
			System.out.println("Enter data to update the reservation");
			System.out.println("Checkin date:");
			checkin = sdf.parse(sc.next());
			System.out.println("Checkout date:");
			checkout = sdf.parse(sc.next());
			
			reservation.updateDates(checkin, checkout);
			System.out.println("Update data reservation: " + reservation);
		}
		catch (ParseException e) {
			System.out.println("Invalite date format");
		}
		catch (DomainException e) {
			System.out.println("Error in reservation " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpect error ");
		}
		sc.close();
	}
}
