package com.nt.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component("cBowl")
public class CricketBowl {
	
	public CricketBowl() {
		System.out.println("CricketBowl::0-param constructor ");
	}

	public float bowlOvers() {
		return new Random().nextInt(1000);
		
	}
}
