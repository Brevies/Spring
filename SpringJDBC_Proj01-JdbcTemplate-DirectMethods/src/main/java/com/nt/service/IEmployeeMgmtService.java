package com.nt.service;

import java.util.List;
import java.util.Map;

public interface IEmployeeMgmtService {

	public int showEmployeesCount();
	public Map<String,Object> fetchEmployeeByNo(int no);
	public List<Map<String,Object>> fetchEmployeeByDesg(String desg1,String desg2);
	public double fetchEmployeeSalaryByEmpNo(int no);
	public String hikeEmployeeSalaryByDesg(double percentage,String desg);
	public String fireEmployeesBySalaryRange(double start,double end);
	
	
}
