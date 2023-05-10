package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("cktr")
public abstract class Cricketer {

	public Cricketer() {
		System.out.println("Cricketer:: 0-param constructor" + this.getClass());
	}

	@Lookup
	public abstract CricketBat getBat();

	public String batting() {
		// get Dependent spring bean class object (Dependency Lookup)
		CricketBat bat = getBat();
		// use the dependent object
		int runs = bat.scoreRuns();
		return "Team total score " + bat.scoreRuns();
	}

	@Lookup
	public abstract CricketBowl getBall();

	public String bowling() {
		CricketBowl bowl = getBall();
		float over = bowl.bowlOvers();
		return "Cricket is bowling " + bowl.bowlOvers();
	}

	public String wicketKeeping() {
		return "Cricket  is keeping the wickets ";
	}

	public String fielding() {
		return "Cricketer is fielding the ball ";
	}
}