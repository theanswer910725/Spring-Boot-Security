package com.BONC.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SmartBoss {
	private BookingService bookingService;

	public BookingService getBookingService() {
		return bookingService;
	}

	@Autowired
	public void setBookingService(BookingService bookingService) {
		this.bookingService = bookingService;
	}

	public void goSomewhere() {
		bookingService.bookFlight();
	}
}
