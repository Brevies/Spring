package com.nt.aspect;

import java.util.Scanner;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("drive")
@Aspect
public class TestDriveBeforeAdvice {
	
	@Before(value="execution(java.lang.String com.nt.service.CarShowRoom.purchase(..))")
	public void testDrive(JoinPoint jp) throws Throwable{
		System.out.println("Test Drive Before Advice Method.testDrive()");
		Object args[]=jp.getArgs();
		System.out.println(args[0]+"Model car test driving is happening ...with price"+args[1]);
		Scanner s= new Scanner(System.in);
		System.out.println("Did u like the car(true/false)?");
		boolean isLiked=s.nextBoolean();
		if(!isLiked)
			throw new IllegalArgumentException(args[0]+"is not liked in Testing driving");		
	}
}
