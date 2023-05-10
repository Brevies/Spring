package com.nt.ston;

public class Printer {
	//reference variable of the class
	private static Printer Instance;
	private Printer() {
		System.out.println("o-param constructor");
	}
	//static factory method having singleton logic
	public static Printer getInstance() {
		System.out.println("Printer.getInstance()");
		//singleton logic with minimum standard
		if(Instance==null) 
			Instance= new Printer();
		return Instance;
	}
	

}
