package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.MyConfig;
import com.nt.sbeans.Flipkart;

public class StretagyDP {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext xac=new AnnotationConfigApplicationContext(MyConfig.class);
		Object obj=xac.getBean("flpk");
		Flipkart flpk=(Flipkart) obj;
		String result=flpk.shopping(new String[] {"shirt", "trouser"},
		                        new double[] {4000.0,6000.0 });
		System.out.println(result);	
	xac.close();
	}

}
