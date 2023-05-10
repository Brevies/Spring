package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.ILoginDAO;

@Service("login")
public class LoginMgmtService implements ILoginMgmtService {

	@Autowired
	private ILoginDAO inDAO;
	
	@Override
	public String signIn(String username, String password) {
		String result=inDAO.authentication(username, password);
		return result;
	}

}
