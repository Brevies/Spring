package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IStudentDAO;
import com.nt.model.Student;
@Service("student")
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDAO studDAO;
	
	@Override
	public String registerStudent(Student stud) {
		
		 int count = studDAO.insert(stud);
		 return count==0?"Student Registration Failed":"Student Registration Succeded";
	}
}
