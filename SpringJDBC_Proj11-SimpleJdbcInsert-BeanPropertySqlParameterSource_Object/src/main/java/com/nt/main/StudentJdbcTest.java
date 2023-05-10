package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.model.Student;
import com.nt.service.IStudentService;

public class StudentJdbcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		IStudentService service= ctx.getBean("student",IStudentService.class);
		Student st= new Student();
		st.setEmpno(7567);
		st.setEname("Shardul");
		st.setJob("cricket");
		st.setSal(150000);
		String msg=service.registerStudent(st);
		System.out.println(msg);
		ctx.close();
	}
}
