package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.PersonalInfo;

public class PropertiesFileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext xac=new ClassPathXmlApplicationContext("com/nt/cnfs/ApplicatinContext.xml");
		PersonalInfo pinfo=xac.getBean("nf",PersonalInfo.class);
		System.out.println(pinfo);
	}
}