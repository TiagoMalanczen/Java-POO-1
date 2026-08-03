package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalServices {

	private Double pricePerDay;
	private Double pricePerHour;
	
	private BrazilTaxServices brazilTaxServices;

	public RentalServices(Double pricePerDay, Double pricePerHour, BrazilTaxServices brazilTaxServices) {
		super();
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.brazilTaxServices = brazilTaxServices;
	}
	
	public void processInvoiece(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFisish()).toMinutes();
		double hours = minutes/60.0;
		
		double basicPayment;
		if(hours <= 12) {
			basicPayment= this.pricePerHour * Math.ceil(hours);
		}
		else {
			basicPayment= this.pricePerDay * Math.ceil(hours/24);
		}
		
		double tax = brazilTaxServices.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
