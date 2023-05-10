package com.nt.main;

import com.nt.loc.Beans;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Beans b1= new Beans();
		Beans b2=new Beans();
		b1.setMarks(30);
		b1.setName("sumit");
		b1.setUname("sumit");
		b1.setDigit(16.5);
		System.out.println("digit "+b1.getDigit()+"\nname "+b1.getName()+"\nuname "+b1.getUname()
		+"\nmarks "+b1.getMarks());
		System.out.println(b1.hashCode());// two object one hashcode
		System.out.println(b2.hashCode());
		System.out.println(b1.hashCode()+" "+b2.hashCode());//give our hashcode
		
		System.out.println(System.identityHashCode(b1));//one object 2 hashcode
		System.out.println(System.identityHashCode(b2));// jvm hashcode
	}

}
