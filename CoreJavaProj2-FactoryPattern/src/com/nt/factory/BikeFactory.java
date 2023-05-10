package com.nt.factory;

import java.util.Scanner;

import com.nt.comps.Bike;
import com.nt.comps.BulletBike;
import com.nt.comps.ElectricBike;
import com.nt.comps.SportsBike;
import com.nt.comps.StandardBike;

public class BikeFactory {
  
	public static Bike orderBike(String type) {
		Bike b=null;
		System.out.println("Enter a Bike Name");
		Scanner s= new Scanner(System.in);
		String Bike=s.nextLine();
		if(Bike.equalsIgnoreCase("Bullet"))
			b= new BulletBike();
		else if (Bike.equalsIgnoreCase("Sports"))
			b=new SportsBike();
		else if (Bike.equalsIgnoreCase("Electric"))
		  b=new ElectricBike();
		else if (Bike.equalsIgnoreCase("Standard"))
			b=new StandardBike();
		else 
			throw new IllegalArgumentException("Invalid Bike type");
		return b;
	}
}
