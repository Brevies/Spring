package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAOImpl implements ILoginDAO {
    @Autowired
	private SimpleJdbcCall sjc;
	@Override
	public String authentication(String username,String password) {
		sjc.setProcedureName("AUTH_PRO");
		//prepare map object having in param names and values
		Map<String,Object> inParams=new HashMap<>();
		inParams.put("user",username);
		inParams.put("pass",password);
		//call pl/Sql procedure
		Map <String,Object> outParams=sjc.execute("{call AUTH_PRO()}");
		//gather results                    // it should be Upper latter
		String result=(String) outParams.get("RESULT");
		return result;
	
	}
}
