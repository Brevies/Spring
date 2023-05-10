package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {

		System.out.println("SetterInjectionTest.main()(start)");
		
		//create the ioc container
	FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext.xml");
	
		//get target spring bean class obj
		Object obj=ctx.getBean("wmg");
		
		// type Casting
		WishMessageGenerator generator= (WishMessageGenerator) obj;
		// invoke the b.method
	
		String result=generator.ShowWishMessage("sumit");
		//display the result
	
		System.out.println(result);
	
		// close container
		ctx.close();
		System.out.println("SetterInjectionTest.main()(end)");
	}
}
