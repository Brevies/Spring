package com.nt.main;

import com.nt.comps.Bike;
import com.nt.factory.BikeFactory;

public class FactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike b1=BikeFactory.orderBike("Standard");
		b1.drive();
		
		System.out.println("----------------------");
		Bike b2=BikeFactory.orderBike("Bullet");
		b2.drive();
		
		System.out.println("------------------------");
		Bike b3=BikeFactory.orderBike("Electric");
		b3.drive();
		
		System.out.println("--------------------------");
		Bike b4=BikeFactory.orderBike("Sports");
		b4.drive();
	}
}
