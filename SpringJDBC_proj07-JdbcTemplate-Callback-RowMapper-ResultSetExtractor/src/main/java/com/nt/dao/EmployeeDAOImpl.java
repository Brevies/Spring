package com.nt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;
@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {

	public static final String GET_EMP_BY_JOB="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB=?";
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public List<Employee> getEmployeeByDesg(String desg) {
		List<Employee> empList=jt.query(GET_EMP_BY_JOB, 
			new RowMapperResultSetExtractor<Employee>(new BeanPropertyRowMapper<Employee>()) 
			,desg);
		return empList;
	}
}