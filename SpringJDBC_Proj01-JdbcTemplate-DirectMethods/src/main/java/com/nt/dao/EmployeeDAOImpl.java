package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {

	private static final String Get_EMPS_COUNT="SELECT COUNT(*) FROM EMP";
	private static final String GET_EMP_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	private static final String GET_EMP_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN (?,?)";
	private static final String GET_EMP_SAL_BY_EMPNO="SELECT SAL FROM EMP WHERE EMPNO=?";
    private static final String GET_UPDATE_QUERY="UPDATE EMP SET SAL=SAL+SAL*? WHERE JOB=?";
    private static final String EMP_DELETE_QUERY="DELETE FROM EMP WHERE SAL>=? AND SAL<=?";
    
	
	
	@Autowired
	private JdbcTemplate jt;

	@Override
	public int getEmpsCount() {
		int count=jt.queryForObject(Get_EMPS_COUNT, Integer.class);
		return count;
	}

	@Override
	public Map<String, Object> getEmployeeByNo(int no) {
		Map<String,Object> map=jt.queryForMap(GET_EMP_BY_NO,no);
		return map;
	}

	@Override
	public List<Map<String, Object>> getEmployeeByDesg(String desg1, String desg2) {
		List<Map<String,Object>> list=jt.queryForList(GET_EMP_BY_DESG,desg1,desg2);
		return list;
	}

	@Override
	public double getEmployeeSalaryByEmpNo(int no) {
		double salary=jt.queryForObject(GET_EMP_SAL_BY_EMPNO,double.class,no);
		return salary;
	}

	@Override
	public int updateEmployeeSalaryByDesg(double percentage, String desg) {
		double percentValue=percentage/100.0;
		int count=jt.update(GET_UPDATE_QUERY,percentValue,desg);
		return count;
	}

	@Override
	public int deleteEmployeesBySalaryRange(double startSalary, double endSalary) {
		int count=jt.update(EMP_DELETE_QUERY,startSalary,endSalary);
		return count;
	}
}