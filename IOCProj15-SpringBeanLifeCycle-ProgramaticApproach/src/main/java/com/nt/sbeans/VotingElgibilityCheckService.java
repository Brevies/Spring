package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vcs")
public class VotingElgibilityCheckService implements InitializingBean, DisposableBean {
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

	// equalent to Custom init method
	public void afterPropertiesSet() throws Exception {
		System.out.println("VotingElgibilityCheckService.afterPropertiesSet()(init life cycle method)");
		dov = new Date();// initializing the left over property
		if (name == null || age <= 0)
			throw new IllegalArgumentException("Invalid Inputs");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("VotingElgibilityCheckService.myDestroy()(Destroy life cycle method)");
		name = null;
		addrs = null;
		age = 0;
		dov = null;
	}
}
