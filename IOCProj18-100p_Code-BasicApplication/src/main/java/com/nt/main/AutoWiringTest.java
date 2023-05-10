package com.nt.main;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class AutoWiringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		WishMessageGenerator wmg=ctx.getBean("wmg",WishMessageGenerator.class);
		
		String result=wmg.generateWishMessage(" Brevies");
		System.out.println(result);
		
		System.out.println("Spring bean count:"+ctx.getBeanDefinitionCount());
		String beanids[]= ctx.getBeanDefinitionNames();
		System.out.println("All beanids "+Arrays.toString(beanids));
		System.out.println("Singleton Scope spring bean are");
		for(String id:beanids) {
			if(ctx.isSingleton(id));
			System.out.println(id+" , ");
		}
		ctx.close();
	}
}
