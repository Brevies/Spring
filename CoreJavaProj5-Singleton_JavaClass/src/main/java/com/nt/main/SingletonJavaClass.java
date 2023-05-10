package com.nt.main;

import com.nt.ston.Printer;

public class SingletonJavaClass {

	public static void main(String[] args) {
		Printer p1=Printer.getInstance();
		Printer p2=Printer.getInstance();
		Printer p3=Printer.getInstance();
		
		System.out.println(p1.hashCode()+" "+p2.hashCode()+" "+p3.hashCode());
		System.out.println("(p1==p2?)"+(p1==p2));
		System.out.println("(p2==p3?)"+(p2==p3));
	}
}
