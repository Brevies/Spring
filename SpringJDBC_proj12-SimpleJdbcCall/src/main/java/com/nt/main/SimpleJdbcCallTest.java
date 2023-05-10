package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ILoginMgmtService;

public class SimpleJdbcCallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		ILoginMgmtService service=ctx.getBean("login",ILoginMgmtService.class);
		String result=service.signIn("ravi", "ravi@5052");
		System.out.println(result);
		
	}
}
