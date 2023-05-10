package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("impl")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
     @Autowired
	private IEmployeeDAO empDAO;

	@Override
	public String registerEmployee(Employee emp) {
		
		int count= empDAO.insertEmployee(emp);
	    return count==0?"Employee Not Inserted":"Employee Inserted";
	}

	
	
}
