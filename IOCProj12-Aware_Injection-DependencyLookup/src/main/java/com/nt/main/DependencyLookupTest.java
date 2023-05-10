package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Cricketer;

public class DependencyLookupTest {
	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cnfs/applicationContext.xml");
		//FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/main/java/com/nt/cnfs/applicationContext.xml");
		Cricketer cktr= ctx.getBean("cktr",Cricketer.class);
		
		Cricketer ckt1= ctx.getBean("cktr",Cricketer.class);
		
		System.out.println(cktr.batting());
		System.out.println(ckt1.bowling());
		System.out.println(cktr.fielding());
		System.out.println("---------------------------");
	//	System.out.println(cktr.batting());
		
		ctx.close();
	}
}
