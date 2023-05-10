package com.nt.service;

public class BankLoanService {

	public float calcSimpleIntrestAmount(float pAmount,float rate,float time) {
		System.out.println("BankLoanService.calcSimpleIntrestAmount()");
		return pAmount*rate*time/100.0f;
	}
}
