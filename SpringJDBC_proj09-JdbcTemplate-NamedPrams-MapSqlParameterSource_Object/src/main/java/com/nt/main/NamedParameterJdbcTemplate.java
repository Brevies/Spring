package com.nt.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

public class NamedParameterJdbcTemplate {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		IEmployeeMgmtService service=ctx.getBean("impl",IEmployeeMgmtService.class);
		
		List<Employee> result=service.fetchEmpByDesg("clerk", "manager");
	//	System.out.println(result);
	//	result.forEach(System.out::print);
		result.forEach(emp->{
		System.out.println(emp);	
		});
		ctx.close();
	}
}
