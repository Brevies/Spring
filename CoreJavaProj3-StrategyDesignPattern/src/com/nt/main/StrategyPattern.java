package com.nt.main;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flipkart flpk=FlipkartFactory.getInstance("dtdc");
		String resultmsg=flpk.Shopping(new String [] {"shirt","trouser"},
		                               new double []{5000.0,6000.0});
		System.out.println(resultmsg);
	}
}
