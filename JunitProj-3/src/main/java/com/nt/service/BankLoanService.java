package com.nt.service;

public class BankLoanService {

	public float calcSimpleIntrestAmount(float pAmount,float rate, float time) {
		System.out.println("BankLoanService.calcSimpleIntrestAmount()");
		if(pAmount<=0 || rate<=0 || time<=0)
			throw new IllegalArgumentException("Invalid input");
		try {
			Thread.sleep(15000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return pAmount*rate*time/100.0f;
	}
}
