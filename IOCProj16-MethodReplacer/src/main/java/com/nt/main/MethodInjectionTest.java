package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.services.BankService;

public class MethodInjectionTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext xac= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		BankService proxy=xac.getBean("bankService",BankService.class);
		System.out.println(proxy.getClass()+"-------"+proxy.getClass().getSuperclass());
		//invoke the b.method
		double intramount=proxy.calculateInsertAmount(100000, 12, 2);
		System.out.println("intrest amount is "+ intramount);	
		xac.close();
		
	}

}
