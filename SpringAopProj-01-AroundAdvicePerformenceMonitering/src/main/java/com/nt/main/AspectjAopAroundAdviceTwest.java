package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class AspectjAopAroundAdviceTwest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		BankService proxy= ctx.getBean("bank",BankService.class);
		
		System.out.println("Simple Intrest Amount :"+proxy.calcSimpleIntrestAmount(100000, 2, 12));
		System.out.println("_______________________________");
		System.out.println("Compound Intrest Amount :"+proxy.calcCompoundIntrestAmount(100000, 2, 12));
		ctx.close();
	
		
	}
}
