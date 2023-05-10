package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

public class NamedParameterJdbcTemplate {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		IEmployeeMgmtService service=ctx.getBean("impl",IEmployeeMgmtService.class);
		
		Employee emp= new Employee();
		emp.setEmpno(7566);
		emp.setEname("Brevis");
		emp.setJob("manager");
		emp.setSal(112000.0f);
		String result=service.registerEmployee(emp);
		System.out.println(result);
		
		ctx.close();
	}
}
