package com.nt.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springl18nTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext xac = new ClassPathXmlApplicationContext("com/nt/cnfs/ApplicationContext.xml");

		Scanner s = new Scanner(System.in);
		System.out.println("Enter language code");
		String langcode = s.next();
		System.out.println("Enter country code ");
		String countryCode = s.next();

		Locale l = new Locale(langcode, countryCode);
		String s1 = xac.getMessage("welcome.msg", new Object[] {}, l);
		String s2 = xac.getMessage("goodbye.msg", new Object[] {}, l);
		System.out.println(s1 + " " + s2);

		/*Locale l = new Locale(args[0], args[1]);
		String s1 = xac.getMessage("welcome.msg", new Object[] {}, l);
		String s2 = xac.getMessage("goodbye.msg", new Object[] {}, l);
		System.out.println(s1 + " " + s2);
		*/xac.close();
	}
}
