package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;
@Service("service")
public class EmployeeMgmtService implements IEmployeeMgmtService {
    @Autowired
	private IEmployeeDAO empDAO;
	@Override
	public Employee showEmpDetailsByNo(int no) {
		
		return empDAO.getEmployeeByNo(7499);
	}

}
