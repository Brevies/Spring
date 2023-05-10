package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("flpk")

public class Flipkart {
	@Autowired
	// @Qualifier("dtdc")
	@Qualifier("shipper")
	private Courier courier;

	public String shopping(String items[], double prices[]) {
		double billAmount = 0.0;
		for (double p : prices) {
			billAmount = billAmount + p;
		}
		int oid = new Random().nextInt(1000);
		String msg = courier.deliver(oid);
		return Arrays.toString(items) + "items with billAmount" + "----" + msg;
	}
}