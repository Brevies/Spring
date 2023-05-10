package com.nt.services;

public class BankService {

	public double calculateInsertAmount(double pamt, double rate, double time) {
		System.out.println("BankService.calculateInsertAmount()(compond intrest amount)");
		return (pamt * Math.pow((1 + rate / 100), time)) - pamt;
	}
}
