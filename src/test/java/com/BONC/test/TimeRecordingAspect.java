package com.BONC.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeRecordingAspect {
	@Pointcut("execution(* com.BONC.text..*.bookFlight(..))")
	private void timeRecordingPointCut() {
	}

	@Around("timeRecordingPointCut()") //1
	public Object recordTime(ProceedingJoinPoint pjp) throws Throwable {  //2

		long start = System.currentTimeMillis();
		Object retVal = pjp.proceed(); // 3

		long duration = System.currentTimeMillis() - start;
		System.out.println(String.format(
				"time for booking flight is %d seconds", duration));

		return retVal;
	}
}
