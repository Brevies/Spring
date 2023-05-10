package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.nt.model.Student;

@Repository
public class StudentDAOImpl implements IStudentDAO {
	@Autowired
	private SimpleJdbcInsert sji;

	@Override
	public int insert(Student std) {
		sji.setTableName("Student");
		Map<String, Object> map = new HashMap<>();
		map.put("empno", std.getEmpno());
		map.put("ename", std.getEname());
		map.put("job", std.getJob());
		map.put("sal", std.getSal());
		return sji.execute(map);
	}
}
