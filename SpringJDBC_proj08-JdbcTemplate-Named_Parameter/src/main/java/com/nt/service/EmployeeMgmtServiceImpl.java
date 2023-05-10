package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;

@Service("impl")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
     @Autowired
	private IEmployeeDAO empDAO;
	@Override
	public int fetchEmpCountBySalaryRange(float start, float end) {	
		return empDAO.getEmpCountBySalaryRange(start, end);
	}
}
