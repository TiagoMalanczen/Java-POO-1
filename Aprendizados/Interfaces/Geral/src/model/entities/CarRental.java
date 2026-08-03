package model.entities;

import java.time.LocalDateTime;

public class CarRental {

	private LocalDateTime start;
	private LocalDateTime fisish;
	
	private Vehicle vehicle;
	private Invoice invoice;
	
	public CarRental(LocalDateTime start, LocalDateTime fisish, Vehicle vehicle) {
		super();
		this.start = start;
		this.fisish = fisish;
		this.vehicle = vehicle;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFisish() {
		return fisish;
	}

	public void setFisish(LocalDateTime fisish) {
		this.fisish = fisish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	
}
