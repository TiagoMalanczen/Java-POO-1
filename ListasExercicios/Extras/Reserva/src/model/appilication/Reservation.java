package model.appilication;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {

	private Integer roomNumbem;
	private Date checkin;
	private Date checkout;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
	
	public Reservation(Integer roomNumbem, Date checkin, Date checkout) {
		if(checkout.after(checkin)) {
			throw new DomainException("Checkout date much be after checkin date");
		}
		super();
		this.roomNumbem = roomNumbem;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumbem() {
		return roomNumbem;
	}

	public void setRoomNumbem(Integer roomNumbem) {
		this.roomNumbem = roomNumbem;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}
	
	public long duration() {
		long diff = this.checkout.getTime() - this.checkin.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkin, Date checkout) {
		Date now = new Date();
		if(checkin.before(now) || checkout.before(now)) {
			throw new DomainException("Reservation dates for update must be future datas");
		}
		if(checkout.after(checkin)) {
			throw new DomainException("Checkout date much be after checkin date");
		}
		
		this.checkin = checkin;
		this.checkout = checkout;
	}

	@Override
	public String toString() {
		return "Room "
				+ roomNumbem
				+ ", checkin: "
				+ sdf.format(checkin)
				+ ", checout: "
				+ sdf.format(checkout)
				+ ", "
				+ this.duration()
				+ " nigths";
	}
	
}
