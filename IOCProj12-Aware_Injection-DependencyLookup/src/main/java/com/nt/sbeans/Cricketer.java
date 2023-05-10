package com.nt.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("cktr")
public class Cricketer implements ApplicationContextAware {

	private ApplicationContext xac;
	
	public void setApplicationContext(ApplicationContext xac) throws BeansException {
		System.out.println("Cricketer.setApplicationContext(-)");
		this.xac=xac;
	}
	public Cricketer() {
		System.out.println("Cricketer:: 0-param constructor");
	}

	public String batting() {
		// get Dependent spring bean class object (Dependency Lookup)
		CricketBat bat = xac.getBean("cBat",CricketBat.class);
		// use the dependent object
		int runs = bat.scoreRuns();
		return "Team total score " + bat.scoreRuns();
		
	}

	public String bowling() {
		CricketBowl bowl=xac.getBean("cBowl",CricketBowl.class);
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