package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {

	private static final String GET_EMPS_COUNT_BY_SAL_RANGE="SELECT COUNT(*) FROM EMP WHERE SAL>=:min AND SAL<=:max ";
	//private static final String GET_EMPS_COUNT_BY_SAL_RANGE="SELECT COUNT(*) FROM EMP WHERE SAL>=1000 AND SAL<=100000";
	@Autowired
	private NamedParameterJdbcTemplate npjt;
	@Override
	public int getEmpCountBySalaryRange(float start, float end) {
		//create Map object having the names the values of named params
		Map<String,Object> paramsMap=new HashMap<>();
		paramsMap.put("min", start);
		paramsMap.put("max", end);
		int count=npjt.queryForObject(GET_EMPS_COUNT_BY_SAL_RANGE, paramsMap, Integer.class);
		return count;
	}
}
