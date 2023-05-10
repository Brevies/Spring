package com.nt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {

	private static final String GET_EMPS_BY_DESGs="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN(:des1,:des2) ORDER BY JOB";
	@Autowired
	private NamedParameterJdbcTemplate npjt;
	@Override
	
	public List<Employee> getEmpsByDesg(String desg1, String desg2) {
	MapSqlParameterSource source= new MapSqlParameterSource();
	source.addValue("des1", desg1);
	source.addValue("des2", desg2);
	List<Employee> list =npjt.query(GET_EMPS_BY_DESGs,source, 
			rs->{
				List <Employee> empsList=new ArrayList<>();
				while(rs.next()) {
					Employee emp= new Employee();
					emp.setEmpno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSal(rs.getFloat(4));
					empsList.add(emp);
				}
				return empsList;
			});
		return list;
	}
	
}
