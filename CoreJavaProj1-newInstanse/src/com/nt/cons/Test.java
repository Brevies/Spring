package com.nt.cons;

public class Test {
          private int x;
          private int z;
          public Test() {
        	  System.out.println("0-param-Constructor");
          }
          public Test(int a,int b) {
        	  System.out.println("2-Param-constructor");
        	  this.x=a;
        	  this.z=b;
          }
		@Override
		public String toString() {
			return "Test [x=" + x + ", z=" + z + "]";
		}
           
	}
