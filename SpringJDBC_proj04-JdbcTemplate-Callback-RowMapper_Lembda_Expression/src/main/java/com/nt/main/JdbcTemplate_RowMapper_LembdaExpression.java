package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;

public class JdbcTemplate_RowMapper_LembdaExpression{

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		IEmployeeService service=ctx.getBean("serv",IEmployeeService.class);
		Employee result=service.showEmpDetailsByNo(7499);
        System.out.println(result);
        ctx.close();
	}
}
