package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.sbeans.PersonalInfo;

public class PropertyInfoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext xac= new ClassPathXmlApplicationContext("com/nt/cnfs/ApplicationContext.xml");
		PersonalInfo pi=xac.getBean("pinfo",PersonalInfo.class);
		System.out.println(pi.toString());
		
		System.out.println("=====================================");
		Environment en=xac.getEnvironment();
		System.out.println("name -"+en.getProperty("per.name")+"\n addrs -"+en.getProperty
		("per.addrs")+"\n age -"+en.getProperty("per.age")+"\n os.name -"+en.getProperty("os.name")+
		"\n dataPath -"+en.getProperty("path"));
		
		
	xac.close();
	}

}
