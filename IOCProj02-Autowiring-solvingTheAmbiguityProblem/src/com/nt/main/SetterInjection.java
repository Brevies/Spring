package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.dao.kfgh;
import com.nt.sbeans.WishMessageGenerator;

public class SetterInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("SetterInjectionTest.main()(start)");
		
		//create the ioc container
	FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/conf/ApplicationContext.xml");
	
		//get target spring bean class obj
		Object obj=ctx.getBean("wmg");
		
		// type Casting
		WishMessageGenerator generator= (WishMessageGenerator) obj;
		// invoke the b.method
	
		String result=generator.ShowWishMessage("sumit");
		
		//display the result
		System.out.println(result);
		Object obj1=ctx.getBean("gh");
		kfgh g=(kfgh)obj1;
		
		// close container
		ctx.close();
		
	}
}
