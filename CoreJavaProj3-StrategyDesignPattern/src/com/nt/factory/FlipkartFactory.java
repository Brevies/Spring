package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.Flipkart;

public class FlipkartFactory {

	public static Flipkart getInstance(String courierType) {
		Courier courier=null;
		if(courierType.equalsIgnoreCase("dtdc"))
			courier=new DTDC();
		else if(courierType.equalsIgnoreCase("blueDort"))
			courier=new BlueDart();
		else 
			throw new IllegalArgumentException("Invalid courier type");
		// create target class obj
		Flipkart flpk=new Flipkart();
		flpk.setCourier(courier);
		return flpk;
	}
}
