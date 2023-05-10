package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class InjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FileSystemXmlApplicationContext xac= new FileSystemXmlApplicationContext("src/com/nt/conf/ApplicationContext.xml");
 SeasonFinder finder=(SeasonFinder)xac.getBean("sf");
 String result=finder.findSeasonName();
 System.out.println(result );
	}

}
