package com.nt.service;

public class CensusService {

	public String exportData() {
		return "data export";
	}
	public boolean isOdd(int no) {
		if(no%2==0)
			return false;
		else 
			return true;
	}
	public String sayHello(String user) {
		return "hello :"+user;
	}
}
