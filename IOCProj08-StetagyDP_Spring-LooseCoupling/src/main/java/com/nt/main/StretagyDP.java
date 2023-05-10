package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Flipkart;

public class StretagyDP {

	public static void main(String[] args) {
		
		
	//ClassPathXmlApplicationContext xac=new ClassPathXmlApplicationContext("com/nt/conf/ApplicationContext.xml");
			// TODO Auto-generated method stub
		FileSystemXmlApplicationContext xac=new FileSystemXmlApplicationContext("src/main/java/com/nt/conf/ApplicationContext.xml");
		Object obj=xac.getBean("flpk");
		Flipkart flpk=(Flipkart) obj;
		String result=flpk.shopping(new String[] {"shirt", "trouser"},
		                        new double[] {4000.0,6000.0 });
		System.out.println(result);
		
	xac.close();
	}

}
