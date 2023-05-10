package com.nt.service;

import org.springframework.stereotype.Service;

@Service("ecom")
public class EcommerceStore {

	public double shopping(String items[],double price[]) {
		System.out.println("EcommerceStore.shopping(-,-)");
		double billAmt=0;
		if(items!=null) {
			for(double p:price)
				billAmt=billAmt+p;
		}
		return billAmt;
	}
}
