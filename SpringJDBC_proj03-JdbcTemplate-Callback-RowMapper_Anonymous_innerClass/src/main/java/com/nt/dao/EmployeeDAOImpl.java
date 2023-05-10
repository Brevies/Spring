package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;
@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {

	public static final String GET_EMP_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	@Autowired
	private JdbcTemplate jt;
	@Override
	public Employee getEmployeeByNo(int no) {
		Employee emp=jt.queryForObject(GET_EMP_BY_NO, 
				//Anonymous inner class
				new RowMapper<Employee>() {
			  public Employee mapRow(ResultSet rs,int rowNum) throws SQLException {
				  Employee e= new Employee();
				  e.setEmpno(rs.getInt(1));
				  e.setEname(rs.getString(2));
				  e.setJob(rs.getString(3));
				  e.setSal(rs.getFloat(4));
				return e;
			  }
		}
        ,no);
		return emp;
	}
}