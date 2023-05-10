package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("serv")
public class EmployeeServiceImpl implements IEmployeeService{
    @Autowired
	public IEmployeeDAO empDAO;
	@Override
	public Employee showEmpDetailsByNo(int no) {
		return empDAO.getEmployeeByNo(no);
	}
}
