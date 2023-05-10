package com.nt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeDAO empDAO;
	
	@Override
	public int showEmployeesCount() {
	int count=empDAO.getEmpsCount();	
		return count;
	}

	@Override
	public Map<String, Object> fetchEmployeeByNo(int no) {
		Map<String,Object> map=empDAO.getEmployeeByNo(no);
		return 	map;
		
	}

	@Override
	public List<Map<String, Object>> fetchEmployeeByDesg(String desg1, String desg2) {
		return empDAO.getEmployeeByDesg(desg1, desg2);
	}

	@Override
	public double fetchEmployeeSalaryByEmpNo(int no) {
		return empDAO.getEmployeeSalaryByEmpNo(no);
	}

	@Override
	public String hikeEmployeeSalaryByDesg(double percentage, String desg) {
		
		int count= empDAO.updateEmployeeSalaryByDesg(percentage, desg);
		return count==0?"Employees not found for salary updation":count+"no.of Employees salary is hiked";
	}

	@Override
	public String fireEmployeesBySalaryRange(double start, double end) {
		int count=empDAO.deleteEmployeesBySalaryRange(start, end);
		return count==0?"Employees not found for deletion":count+"no.of Employees are found and deletion";
	}
}
