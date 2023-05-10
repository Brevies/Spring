package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.exception.InvalidInputsException;
import com.nt.service.ShoppingStore;

public class ThrowsAdviseTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext xac = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		ShoppingStore proxy = xac.getBean("store", ShoppingStore.class);

		try {
			double billAmount = proxy.generateBill(new String[] { "shirt", "trouser" }, new double[] { 5000, 6000 });
		} catch (InvalidInputsException iie) {
			// TODO Auto-generated catch block
			iie.printStackTrace();
		}
		System.out.println("-----------------------");

		try {
			double billAmount = proxy.generateBill(new String[] { "shirt", "trouser" }, new double[] {});
			System.out.println("BillAmount::" + billAmount);
		} catch (InvalidInputsException iie) {
			// TODO Auto-generated catch block
			iie.printStackTrace();
		}
	}
}
