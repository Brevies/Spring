package com.nt.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("cBat")
public class CricketBat {

	public CricketBat() {
		System.out.println("CricketBat::0-param constructor ");
	}
	public int scoreRuns() {
		return new Random().nextInt(1000);
		//return 2000;
	}
}
