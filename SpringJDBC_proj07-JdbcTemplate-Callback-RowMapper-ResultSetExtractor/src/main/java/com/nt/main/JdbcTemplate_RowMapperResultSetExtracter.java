package com.nt.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;

public class JdbcTemplate_RowMapperResultSetExtracter{

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		IEmployeeService service=ctx.getBean("serv",IEmployeeService.class);
		List<Employee> list=service.fetchEmpDetailsByDesg("Clerk");
		/*list.forEach(e->{
			System.out.println(e);
		});*/
		System.out.println(list);
        ctx.close();
	}
}
