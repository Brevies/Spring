package com.nt.service;

import org.springframework.stereotype.Component;

@Component("store")
public class ShoppingStore {

	public double generateBill(String items[],double prices[]) {
		System.out.println("ShoppingStore.generateBill()");
		if(items==null || prices==null || items.length==0 || prices.length==0)
			throw new IllegalArgumentException("Invalid inputs are given");
		var billAmt=0.0; //from java 10 feature(allowed only local variables)
		for(double p:prices)
			billAmt=billAmt+p;
		return billAmt;
	}
}
