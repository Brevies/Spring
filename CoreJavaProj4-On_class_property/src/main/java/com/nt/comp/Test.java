package com.nt.comp;

public class Test {

	private int a;
	private int b;
	public Test() {
		System.out.println("0-Param Constructor");
		}
	public Test(int x,int y) {
		this.a=x;
		this.b=y;
	}
	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
	
	}
