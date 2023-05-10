package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.IEmployeeMgmtService;

public class NamedParameterJdbcTemplate {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		IEmployeeMgmtService service=ctx.getBean("impl",IEmployeeMgmtService.class);
		
		int result=service.fetchEmpCountBySalaryRange(20000.0f, 100000.0f);
		System.out.println(result);
		ctx.close();
	}
}
