package com.nt.service;

import org.springframework.stereotype.Service;

@Service("bank")
public class BankService {

	public double calcSimpleIntrestAmount(double pamt, double rate, double time) {
		System.out.println("BankService.calcSimpleIntrestAmount()");
		return pamt * rate * time / 100;
	}

	public double calcCompoundIntrestAmount(double pamt, double rate, double time) {
		System.out.println("BankService.calcCompoundInsertAmount()");
		return (pamt * Math.pow(1 + rate / 100, time)) - pamt;
	}
}
