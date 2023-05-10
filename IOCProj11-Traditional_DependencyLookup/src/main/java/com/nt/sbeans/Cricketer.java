package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
@Lazy(true)
public class Cricketer {

	/*public Cricketer() {
		System.out.println("Cricketer:: 0-param constructor");
	}*/

	public String batting() {
		// create additional Ioc Container
		ClassPathXmlApplicationContext xac = new ClassPathXmlApplicationContext("com/nt/cngs/applicationContext.xml");
		// get Dependent spring bean class object (Dependency Lookup)
		CricketBat bat = xac.getBean("cBat",CricketBat.class);
		// use the dependent object
		int runs = bat.scoreRuns();
		return "Team total score " + bat.scoreRuns();
		
	}

	public String bowling() {
		ClassPathXmlApplicationContext xac1=new ClassPathXmlApplicationContext("com/nt/cngs/applicationContext.xml");
		CricketBowl bowl=xac1.getBean("cBowl",CricketBowl.class);
		float over=bowl.bowlOvers();
		return "Cricket is bowling "+ bowl.bowlOvers();
	}

	public String wicketKeeping() {
		return "Cricket  is keeping the wickets ";
	}

	public String fielding() {
		return "Cricketer is fielding the ball ";
	}
}