package com.nt.service;

import org.springframework.stereotype.Service;

@Service("show")
public class CarShowRoom {

	public String purchase(String carModel, double price, double discountPercentage) {
		double finalPrice=price-(price*discountPercentage/100);
		return carModel+"Car is purchased :: price ::"+price+ "Price After discount ::"+finalPrice;
	}
}
