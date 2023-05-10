package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("pinfo")
@PropertySource("com/nt/commons/Info.properties")
public class PersonalInfo {
	@Autowired
	private Environment env;

	@Override
	public String toString() {
		return " name -"+env.getProperty("per.name")+"\n addrs -"+env.getProperty("per.addrs")
		+"\n age -"+env.getProperty("per.age")+"\n os.name::"+env.getProperty("os.name")
		+"\n dataPath"+env.getProperty("path");
	}
}
