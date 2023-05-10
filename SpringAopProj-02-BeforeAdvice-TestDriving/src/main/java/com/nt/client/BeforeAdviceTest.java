package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.CarShowRoom;

public class BeforeAdviceTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		CarShowRoom proxy=ctx.getBean("show",CarShowRoom.class);
        try {
			String result=	proxy.purchase("BMW ", 10000000, 15.0);
			System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} ctx.close();
	}
}
