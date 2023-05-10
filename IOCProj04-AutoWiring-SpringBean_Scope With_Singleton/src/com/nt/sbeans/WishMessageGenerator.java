package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
//@Scope("singleton")
//@Scope("prototype")
public class WishMessageGenerator {
	
	// HAS-A Property
	@Autowired
	@Qualifier("dt")
	private LocalDateTime dateTime;

		// b.method/logic
	public String ShowWishMessage(String user) {
		System.out.println("WishMassegeGenerator.ShowWishMassege()");
		System.out.println("DateTime" + dateTime + "Date" );

		// get current hour of the day
		int hour = dateTime.getHour();

		// generate the wish Massege
		if (hour < 12)
			return "Good Morning : " + user;
		else if (hour < 16)
			return "Good Afternoon : " + user;
		else if (hour < 20)
			return "Good Evening : " + user;
		else
			return "Good Night :" + user;
	}
}
