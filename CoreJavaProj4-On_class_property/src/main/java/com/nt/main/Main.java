package com.nt.main;

import java.util.Arrays;

import com.nt.comp.Test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class c1= Test.class;
		System.out.println("c1 obj data ::"+c1.toString());
		System.out.println("c1 obj class name:: "+c1.getClass());
		System.out.println("Supper class of c1 obj data class name ::"+c1.getSuperclass());
		System.out.println("Interface implemented by c1 obj pointed class:: "+Arrays.toString(c1.getInterfaces()));
       System.out.println("Method of c1 obj pointed class :: "+Arrays.toString(c1.getDeclaredMethods()));
	}

}
