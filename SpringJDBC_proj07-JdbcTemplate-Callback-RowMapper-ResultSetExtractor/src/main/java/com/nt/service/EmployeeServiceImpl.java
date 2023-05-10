package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("serv")
public class EmployeeServiceImpl implements IEmployeeService{
    @Autowired
	public IEmployeeDAO empDAO;
	
	@Override
	public List<Employee> fetchEmpDetailsByDesg(String Desg) {
		
		return empDAO.getEmployeeByDesg(Desg);
	}
}
