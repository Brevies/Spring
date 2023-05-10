package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {

	public Courier courier;
	public  void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier=courier;
	}
		//b.methods
		public String Shopping(String items[],double prices []) {
			double billAmount=0.0;
			for(double p: prices) {
				billAmount=billAmount+p;
			} // generated order id
			int oid=new Random().nextInt(1000);
		//deliver the product using courier
			String msg=courier.deliver(oid);
			return Arrays.toString(items)+"items with billAmount:"+billAmount+" "+msg;
	}
}
