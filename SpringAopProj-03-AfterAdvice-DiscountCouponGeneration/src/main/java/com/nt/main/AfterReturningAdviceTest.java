package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.EcommerceStore;

public class AfterReturningAdviceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext xac= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		EcommerceStore proxy=xac.getBean("ecom",EcommerceStore.class);
		
		double billAmt=proxy.shopping(new String[] {"shirt", "trouser"},
				new double[] {5000,10000});
		System.out.println("Bill Amount is ::"+ billAmt);
		xac.close();
	}

}
