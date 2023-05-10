package com.nt.sbeans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("vcs")
public class VotingElgibilityCheckService {
    @Value("${per.name}")
	private String name;
    @Value("${per.age}")
	private float age;
    @Value("${per.addrs}")
	private String addrs;
	private Date dov;

	// b.method
	public String checkVotingElgibility() {
		System.out.println("VotingElgibilityCheckService.checkVotingElgibility()(b.method)");
		if (age >= 18)
			return "mr/miss/mrs." + name + " u r eligible for vote on date::" + dov;
		else
			return "mr/miss/mrs." + name + " u r not eligible for vote on date::" + dov;
	}

	// Custom init method
	@PostConstruct
	public void myInit() {
		System.out.println("VotingElgibilityCheckService.myInit()(init life cycle method)");
		dov = new Date();// initializing the left over property
		if (name == null || age <= 0)
			throw new IllegalArgumentException("Invalid Inputs");
	}

	// Custom Destroy method
	@PreDestroy
	public void myDestroy() {
		System.out.println("VotingElgibilityCheckService.myDestroy()(Destroy life cycle method)");
		name = null;
		addrs = null;
		age = 0;
		dov = null;
	}

}
