package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {

	private static final String INSERT_EMP_QUERY="INSERT INTO EMP(EMPNO,ENAME,JOB,SAL) VALUES(:empno,:ename,:job,:sal) ";
	@Autowired
	private NamedParameterJdbcTemplate npjt;
	@Override
	public int insertEmployee(Employee emp) {
		BeanPropertySqlParameterSource source=new BeanPropertySqlParameterSource(emp);
		return npjt.update(INSERT_EMP_QUERY, source);
	}
	
	
	
	
}
