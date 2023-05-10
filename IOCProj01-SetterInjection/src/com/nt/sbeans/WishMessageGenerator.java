package com.nt.sbeans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	// HAS-A Property
	@Autowired
	private LocalDateTime dateTime;

	@Autowired
	private Date date;
	// Setter method for Setter Injection

	/*	@Autowired
		public void setLocalTime(LocalDateTime dateTime) {
			System.out.println("WishMassegeGenerator.setLocalTime()");
			this.dateTime = dateTime;
		}
	
		@Autowired
		public void setDate(Date date) {
			System.out.println("WishMessageGenerator.setDate()");
			this.date = date;
		}
	*/
	// b.method/logic
	public String ShowWishMessage(String user) {
		System.out.println("WishMassegeGenerator.ShowWishMassege()");
		System.out.println("DateTime" + dateTime + "Date" + date);

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
