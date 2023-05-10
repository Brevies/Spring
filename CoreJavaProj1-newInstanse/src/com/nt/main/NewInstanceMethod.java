package com.nt.main;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class NewInstanceMethod {

	public static void main(String[] args) throws Exception {
		      Class c=Class.forName(args[0]);
		      Constructor cons[]=c.getDeclaredConstructors();
		      Object obj1=cons[0].newInstance();
		      System.out.println(obj1.toString());
		      System.out.println("----------------");
		      Object obj2=cons[1].newInstance(10,20);
		      System.out.println(obj2.toString());
		      
		      System.out.println("------------------");
				 Field fields[]= obj2.getClass().getDeclaredFields();
				 fields[0].setAccessible(true);
				 fields[1].setAccessible(true);
				 
				 fields[0].setInt(obj2,2000);
				 fields[1].setInt(obj2,5000);
				 System.out.println(obj2);
	}

}
