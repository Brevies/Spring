package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeService {

	public List<Employee> fetchEmpDetailsByDesg(String Desg);
}
