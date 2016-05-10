package com.BONC.test;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect //1
@Component
public class LogAspect {
	
	@Pointcut("execution(* com.BONC.test..*.bookFlight(..))") //2
	private void logPointCut(){
		
	}
	
	@AfterReturning(pointcut = "logPointCut()", returning = "retVal") //3
	public void logBookingStatus(boolean retVal) {  //4
		if (retVal) {
			System.out.println("booking flight succeeded!");
		} else {
			System.out.println("booking flight failed!");
		}
	}
}
