package com.BONC.test;

public class Boss {
	private BookingService bookingService;
	
	public Boss() {
		this.bookingService = new QunarBookingService();
	}
	
	public void goSomewhere() {
		long start = System.currentTimeMillis();
                
        //订机票
		bookingService.bookFlight();
		
		//查看耗时
		//long duration = System.http://tianmaying.com/tutorial/spring-ioc#/1() - start;
		//System.out.println(String.format("time for booking flight is %d seconds", duration));
		
		//记录日志
		//if (status) {
			//System.out.println("booking flight succeeded!");
		//} else {
			//System.out.println("booking flight failed!");
		//}
	}
}
