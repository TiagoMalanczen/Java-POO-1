package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalServices {

	private Double pricePerDay;
	private Double pricePerHour;
	
	private TaxService taxServices;

	public RentalServices(Double pricePerDay, Double pricePerHour, TaxService taxServices) {
		super();
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxServices = taxServices;
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
		
		double tax = taxServices.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
