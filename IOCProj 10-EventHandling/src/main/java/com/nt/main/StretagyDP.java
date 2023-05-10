package com.nt.main;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Flipkart;

public class StretagyDP {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext xac = new ClassPathXmlApplicationContext("com/nt/conf/ApplicationContext.xml");
		//Flipkart flpk=xac.getBean("flpk",Flipkart.class);
		Flipkart flpk=xac.getBean("flipkart",Flipkart.class);
		String result = flpk.shopping(new String[] { "shirt", "trouser" }, new double[] { 4000.0, 6000.0 });
		System.out.println(result);

		System.out.println("=======================================");
		Date d1=xac.getBean("java.util.Date",Date.class);
		System.out.println(d1.hashCode());
		
		Date d2=xac.getBean("java.util.Date#0",Date.class);
		System.out.println(d2.hashCode());
		
		Date d3=xac.getBean("java.util.Date#1",Date.class);
		System.out.println(d3.hashCode());
		
		Date d4=xac.getBean("java.util.Date#2",Date.class);
		System.out.println(d4.hashCode());
		
		xac.close();
	}
}
