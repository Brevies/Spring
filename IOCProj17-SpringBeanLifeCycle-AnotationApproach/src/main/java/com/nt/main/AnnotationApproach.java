package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.VotingElgibilityCheckService;

public class AnnotationApproach {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext xac = new ClassPathXmlApplicationContext("com/nt/cnfs/applicationContext.xml");
		VotingElgibilityCheckService service = xac.getBean("vcs", VotingElgibilityCheckService.class);
		String result = service.checkVotingElgibility();
		System.out.println(result);
		xac.close();

	}
}
