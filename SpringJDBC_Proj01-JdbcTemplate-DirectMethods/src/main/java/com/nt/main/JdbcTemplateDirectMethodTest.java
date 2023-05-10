package com.nt.main;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.IEmployeeMgmtService;

public class JdbcTemplateDirectMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		IEmployeeMgmtService service = ctx.getBean("empService", IEmployeeMgmtService.class);

		int count = service.showEmployeesCount();
		System.out.println("Employee count " + count);
		
		System.out.println("----------------------------------");
		Map<String,Object> map=service.fetchEmployeeByNo(7369);
	System.out.println("7499 Employee Details are :"+map);
		
	System.out.println("-----------------------------------");
	List<Map<String,Object>> list=service.fetchEmployeeByDesg("clerk","manager");
	// 1st method
	list.forEach((l)->{
		System.out.println(l);
	});
	//2 nd method
	list.forEach(System.out::println);
	
		System.out.println("-------------------------------------");
		double d=service.fetchEmployeeSalaryByEmpNo(7839);
		System.out.println("Employee salary by Emp No "+d);
		
		System.out.println("-------------------------------------");
		String msg1=service.hikeEmployeeSalaryByDesg(15.0, "clerk");
		System.out.println(msg1);
		
		System.out.println("---------------------------------------");
		String msg2=service.fireEmployeesBySalaryRange(1000.0, 2000.0);
		System.out.println(msg2);
		
		ctx.close();
	}
}