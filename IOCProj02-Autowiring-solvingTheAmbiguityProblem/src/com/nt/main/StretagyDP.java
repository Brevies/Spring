package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StretagyDP {

	public static void main(String[] args) {
		
		
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/conf/ApplicationContext.xml");
		/*	// TODO Auto-generated method stub
		FileSystemXmlApplicationContext xac=new FileSystemXmlApplicationContext("src/main/java/com/nt/conf/ApplicationContext.xml");
		Object obj=xac.getBean("flpk");
		Flipkart flpk=(Flipkart) obj;
		String result=flpk.shopping(new String[] {"shirt", "trouser"},
		                        new double[] {4000.0,6000.0 });
		System.out.println(result);
		*/
	ctx.close();
	}

}
