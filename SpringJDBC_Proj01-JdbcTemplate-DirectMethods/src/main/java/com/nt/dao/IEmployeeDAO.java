package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface IEmployeeDAO {

	public int getEmpsCount();
	public Map<String,Object> getEmployeeByNo(int no);
	public List<Map<String,Object>> getEmployeeByDesg(String desg1,String desg2);
	public double getEmployeeSalaryByEmpNo(int no);
	public int updateEmployeeSalaryByDesg(double percentage,String desg);
	public int deleteEmployeesBySalaryRange(double startSalary,double endSalary);
	
}
