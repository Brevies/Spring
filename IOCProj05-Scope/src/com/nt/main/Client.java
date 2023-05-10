package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;
import com.nt.ston.Printer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/conf/ApplicationContext.xml");
	
		Printer p1=ctx.getBean("p3",Printer.class);
		Printer p2=ctx.getBean("p3",Printer.class);
		
		System.out.println(p1.hashCode()+" "+p2.hashCode());
		System.out.println("(p1==p2)"+(p1==p2));
		
		System.out.println("==========================");
		WishMessageGenerator wmr=ctx.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator wmt=ctx.getBean("wmg",WishMessageGenerator.class);
		
		System.out.println(wmr.hashCode()+" "+wmt.hashCode());
		System.out.println("(wmr==wmt)"+(wmr==wmt));
		
		String result=wmr.ShowWishMessage("Pawan");
		String result1=wmt.ShowWishMessage("priyanshu");
		System.out.println(result);
		System.out.println(result1);
		
	}
}
