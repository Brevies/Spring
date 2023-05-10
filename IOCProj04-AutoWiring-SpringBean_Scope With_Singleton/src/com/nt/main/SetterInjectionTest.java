package com.nt.main;

import java.time.LocalDateTime;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;
import com.nt.ston.Printer;

public class SetterInjectionTest {

	public static void main(String[] args) {

		System.out.println("SetterInjectionTest.main()(start)");

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/nt/cfgs/ApplicationContext.xml");

		Object obj = ctx.getBean("wmg");

		WishMessageGenerator generator = (WishMessageGenerator) obj;

		String result = generator.ShowWishMessage("sumit");

		System.out.println(result);

		System.out.println("SetterInjectionTest.main()(end)");

		System.out.println("============Singleton===============================");
		LocalDateTime ldt = ctx.getBean("dt", LocalDateTime.class);
		LocalDateTime ldt1 = ctx.getBean("dt", LocalDateTime.class);
		
		System.out.println(ldt.hashCode() + "   " + ldt1.hashCode());
		System.out.println("(ldt==ldt1)   " + (ldt == ldt1));
		
		System.out.println("===============Singleton=============================");
		LocalDateTime dt1 = ctx.getBean("dt1", LocalDateTime.class);
		LocalDateTime dt2 = ctx.getBean("dt1", LocalDateTime.class);
		
		System.out.println(dt1.hashCode() + "  " + dt2.hashCode());
		System.out.println("(dt1==dt2)" + (dt1 == dt2));
		
		System.out.println("===============prototype=============================");
		LocalDateTime dt = ctx.getBean("dt2", LocalDateTime.class);
		LocalDateTime dt0 = ctx.getBean("dt2", LocalDateTime.class);
		
		System.out.println(dt.hashCode() + "  " + dt0.hashCode());
		System.out.println("(dt==dt0)" + (dt == dt0));
		
			
		System.out.println("================MassegeGenerator==================================");
		WishMessageGenerator generator1 = ctx.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator generator2 = ctx.getBean("wmg", WishMessageGenerator.class);
		
		System.out.println(generator1.hashCode() + "  " + generator2.hashCode());
		System.out.println("(generator1==generator2) " + (generator1 == generator2));
		
		System.out.println("==================Printer Instance====================================");
		Printer p1=ctx.getBean("p1",Printer.class);
		Printer p2=ctx.getBean("p1",Printer.class);
			
		System.out.println(p1.hashCode()+" "+p2.hashCode());
		System.out.println("(p1==p2?)"+(p1==p2));
		
		System.out.println("==================Printer Instance2========================================");
		Printer p3=ctx.getBean("p2",Printer.class);
		Printer p4=ctx.getBean("p2",Printer.class);
		
		
		System.out.println(p3.hashCode()+"  "+p4.hashCode());
		System.out.println("(p4==p3?)"+(p4==p3));
			}
}
