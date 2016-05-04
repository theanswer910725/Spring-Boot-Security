package com.BONC.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestSpringIoC {
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
	
	static void BossGoSomewhere() {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		try {
			TestSpringIoC boss = context.getBean(TestSpringIoC.class);
			boss.goSomewhere();
		} finally {
			context.close();
		}
	}
}

