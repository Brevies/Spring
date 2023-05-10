package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("impl")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
     @Autowired
	private IEmployeeDAO empDAO;

	@Override
	public List<Employee> fetchEmpByDesg(String desg1, String desg2) {
		
		return empDAO.getEmpsByDesg(desg1, desg2);
	}
	
}
