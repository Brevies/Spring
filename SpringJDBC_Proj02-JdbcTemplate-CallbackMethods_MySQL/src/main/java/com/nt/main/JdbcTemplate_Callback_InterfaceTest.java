package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

public class JdbcTemplate_Callback_InterfaceTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		IEmployeeMgmtService service = ctx.getBean("service", IEmployeeMgmtService.class);
		Employee emp = service.showEmpDetailsByNo(7499);
		System.out.println("7499 emp details " + emp);
		ctx.close();
	}
}
