package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Cricketer;

public class DependencyLookupTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cngs/applicationContext.xml");
		Cricketer cktr= ctx.getBean("cktr",Cricketer.class);
		
		Cricketer ckt1= ctx.getBean("cktr",Cricketer.class);
		
		System.out.println(cktr.batting());
		System.out.println(ckt1.bowling());
		System.out.println(cktr.fielding());
		System.out.println("---------------------------");
		
		ctx.close();
	}
}
