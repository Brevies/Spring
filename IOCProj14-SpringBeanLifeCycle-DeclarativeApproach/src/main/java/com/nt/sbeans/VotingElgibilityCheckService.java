package com.nt.sbeans;

import java.util.Date;

public class VotingElgibilityCheckService {

	private String name;
	private float age;
	private String addrs;
	private Date dov;

	public void setName(String name) {
		System.out.println("VotingElgibilityCheckService.setName()");
		this.name = name;
	}

	public void setAge(float age) {
		System.out.println("VotingElgibilityCheckService.setAge()");
		this.age = age;
	}

	public void setAddrs(String addrs) {
		System.out.println("VotingElgibilityCheckService.setAddrs()");
		this.addrs = addrs;
	}

	// b.method
	public String checkVotingElgibility() {
		System.out.println("VotingElgibilityCheckService.checkVotingElgibility()(b.method)");
		if (age >= 18)
			return "mr/miss/mrs." + name + " u r eligible for vote on date::" + dov;
		else
			return "mr/miss/mrs." + name + " u r not eligible for vote on date::" + dov;
	}

	// Custom init method
	public void myInit() {
		System.out.println("VotingElgibilityCheckService.myInit()(init life cycle method)");
		dov = new Date();// initializing the left over property
		if (name == null || age <= 0)
			throw new IllegalArgumentException("Invalid Inputs");
	}

	// Custom Destroy method
	public void myDestroy() {
		System.out.println("VotingElgibilityCheckService.myDestroy()(Destroy life cycle method)");
		name = null;
		addrs = null;
		age = 0;
		dov = null;
	}

}
