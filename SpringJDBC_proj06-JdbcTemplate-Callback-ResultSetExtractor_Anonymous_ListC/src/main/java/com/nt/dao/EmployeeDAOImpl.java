package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;
@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {

	public static final String GET_EMP_BY_JOB="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB=?";
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public List<Employee> getEmployeeByDesg(String job) {
		List<Employee> empList=jt.query("GET_EMP_BY_JOB",
				new ResultSetExtractor<List<Employee>>() {
			public List<Employee>extractData(ResultSet rs) throws SQLException,DataAccessException{
				List<Employee> empList= new ArrayList();
				while (rs.next()) {
					Employee emp= new Employee();
					emp.setEmpno(rs.getInt("EMPNO"));
					emp.setEname(rs.getString("ENAME"));
					emp.setJob(rs.getString("JOB"));
					emp.setSal(rs.getInt("SAL"));
					empList.add(emp);
				}// while
				return empList;
			}//method
		}//Anonymous 
				,job);
		return empList;
	}
}