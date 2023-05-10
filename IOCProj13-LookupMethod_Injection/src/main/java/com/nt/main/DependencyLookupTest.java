package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Cricketer;

public class DependencyLookupTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cnfs/applicationContext.xml");
		//FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/main/java/com/nt/cnfs/applicationContext.xml");
	System.out.println("----------------------");
	//get proxy class object 
		Cricketer proxy= ctx.getBean("cktr",Cricketer.class);
		Cricketer proxy1= ctx.getBean("cktr",Cricketer.class);
	
		System.out.println(proxy.getClass()+"---"+proxy.getClass().getSuperclass());
		
		System.out.println(proxy.batting());
		System.out.println(proxy.bowling());
		System.out.println(proxy.fielding());
		System.out.println("---------------------------");
		System.out.println(proxy1.batting());
		System.out.println(proxy1.bowling());
		System.out.println(proxy1.fielding());
		ctx.close();
	}
}
